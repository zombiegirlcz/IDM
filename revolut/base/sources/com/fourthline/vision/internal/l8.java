package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f36481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36482c;
    private volatile boolean d;
    boolean e;
    boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MediaCodec f36483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ie f36484h;
    private MediaCodec.BufferInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a f36485j;
    private long k;

    public interface a {
        void onReleased();

        void onStopped(l8 l8Var);
    }

    public l8(File file, a aVar) {
        Object obj2 = new Object();
        this.f36480a = obj2;
        this.k = 0L;
        this.f36484h = new je(file);
        this.f36485j = aVar;
        synchronized (obj2) {
            this.i = new MediaCodec.BufferInfo();
            new Thread(this, getClass().getSimpleName()).start();
            try {
                obj2.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    private void a() {
        MediaCodec mediaCodec = this.f36483g;
        if (mediaCodec == null) {
            return;
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        if (this.f36484h == null) {
            return;
        }
        int i = 0;
        while (this.f36481b) {
            int iDequeueOutputBuffer = this.f36483g.dequeueOutputBuffer(this.i, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!this.e && (i = i + 1) > 5) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f36483g.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f36483g.getOutputFormat();
                this.f = true;
                if (this.f36484h.setup(outputFormat)) {
                    continue;
                } else {
                    synchronized (this.f36484h) {
                        while (!this.f36484h.isOperational()) {
                            try {
                                this.f36484h.wait(10L);
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                    }
                }
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                MediaCodec.BufferInfo bufferInfo = this.i;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f) {
                        throw new RuntimeException("drain:muxer hasn't started");
                    }
                    bufferInfo.presentationTimeUs = b();
                    this.f36484h.write(byteBuffer, this.i);
                    this.k = this.i.presentationTimeUs;
                    i = 0;
                }
                this.f36483g.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.i.flags & 4) != 0) {
                    this.f36481b = false;
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private long b() {
        long jNanoTime = System.nanoTime() / 1000;
        long j2 = this.k;
        return jNanoTime < j2 ? (j2 - jNanoTime) + jNanoTime : jNanoTime;
    }

    public void encode(ByteBuffer byteBuffer, int i, long j2) {
        if (this.f36481b) {
            ByteBuffer[] inputBuffers = this.f36483g.getInputBuffers();
            while (this.f36481b) {
                int iDequeueInputBuffer = this.f36483g.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
                    byteBuffer2.clear();
                    if (byteBuffer != null) {
                        byteBuffer2.put(byteBuffer);
                    }
                    if (i > 0) {
                        this.f36483g.queueInputBuffer(iDequeueInputBuffer, 0, i, j2, 0);
                        return;
                    } else {
                        this.e = true;
                        this.f36483g.queueInputBuffer(iDequeueInputBuffer, 0, 0, j2, 4);
                        return;
                    }
                }
            }
        }
    }

    public boolean frameAvailableSoon() {
        synchronized (this.f36480a) {
            try {
                if (this.f36481b && !this.d) {
                    this.f36482c++;
                    this.f36480a.notifyAll();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void release() {
        ie ieVar;
        try {
            this.f36485j.onStopped(this);
        } catch (Exception unused) {
        }
        this.f36481b = false;
        MediaCodec mediaCodec = this.f36483g;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.f36483g.release();
                this.f36483g = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f && (ieVar = this.f36484h) != null) {
            try {
                ieVar.release();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.i = null;
        this.f36485j.onReleased();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f36480a
            monitor-enter(r0)
            r1 = 0
            r6.d = r1     // Catch: java.lang.Throwable -> L57
            r6.f36482c = r1     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r6.f36480a     // Catch: java.lang.Throwable -> L57
            r2.notify()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
        Le:
            java.lang.Object r2 = r6.f36480a
            monitor-enter(r2)
            boolean r0 = r6.d     // Catch: java.lang.Throwable -> L22
            int r3 = r6.f36482c     // Catch: java.lang.Throwable -> L22
            r4 = 1
            if (r3 <= 0) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r1
        L1b:
            if (r5 == 0) goto L24
            int r3 = r3 + (-1)
            r6.f36482c = r3     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L55
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L34
            r6.a()
            r6.signalEndOfInputStream()
            r6.a()
            r6.release()
            goto L47
        L34:
            if (r5 == 0) goto L3a
            r6.a()
            goto Le
        L3a:
            java.lang.Object r0 = r6.f36480a
            monitor-enter(r0)
            java.lang.Object r2 = r6.f36480a     // Catch: java.lang.Throwable -> L44 java.lang.InterruptedException -> L46
            r2.wait()     // Catch: java.lang.Throwable -> L44 java.lang.InterruptedException -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            goto Le
        L44:
            r1 = move-exception
            goto L53
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
        L47:
            java.lang.Object r2 = r6.f36480a
            monitor-enter(r2)
            r6.d = r4     // Catch: java.lang.Throwable -> L50
            r6.f36481b = r1     // Catch: java.lang.Throwable -> L50
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            throw r0
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
        L55:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
        L57:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.l8.run():void");
    }

    public abstract void signalEndOfInputStream();

    public void startRecording() {
        synchronized (this.f36480a) {
            this.f36481b = true;
            this.d = false;
            this.f36480a.notifyAll();
        }
    }

    public void stopRecording() {
        synchronized (this.f36480a) {
            try {
                if (this.f36481b && !this.d) {
                    this.d = true;
                    this.f36480a.notifyAll();
                }
            } finally {
            }
        }
    }
}
