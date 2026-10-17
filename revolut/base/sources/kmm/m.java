package kmm;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.a0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.k f185939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f185940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185941c;
    public final boolean d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f185942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f185943h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f185944j;
    public final mmm.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mmm.h f185945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f185946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f185947n;

    public m(mmm.k source, l frameCallback, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f185939a = source;
        this.f185940b = frameCallback;
        this.f185941c = z;
        this.d = z3;
        this.k = new mmm.h();
        this.f185945l = new mmm.h();
        this.f185947n = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f185946m;
        if (cVar != null) {
            vlm.h.f(cVar);
        }
        vlm.h.f(this.f185939a);
    }

    public final void d() throws IOException {
        g();
        if (this.i) {
            f();
            return;
        }
        int i = this.f;
        if (i != 1 && i != 2) {
            StringBuilder sb6 = new StringBuilder("Unknown opcode: ");
            TimeZone timeZone = vlm.j.f290512a;
            String hexString = Integer.toHexString(i);
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
            sb6.append(hexString);
            throw new ProtocolException(sb6.toString());
        }
        while (!this.e) {
            long j2 = this.f185942g;
            mmm.h buffer = this.f185945l;
            if (j2 > 0) {
                this.f185939a.T7(buffer, j2);
            }
            if (this.f185943h) {
                if (this.f185944j) {
                    c cVar = this.f185946m;
                    if (cVar == null) {
                        cVar = new c(this.d);
                        this.f185946m = cVar;
                    }
                    Intrinsics.checkNotNullParameter(buffer, "buffer");
                    mmm.h hVar = cVar.f185912b;
                    if (hVar.f207266b != 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Inflater inflater = cVar.f185913c;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        cVar.f185913c = inflater;
                    }
                    a0 a0Var = cVar.d;
                    if (a0Var == null) {
                        a0Var = new a0(hVar, inflater);
                        cVar.d = a0Var;
                    }
                    if (cVar.f185911a) {
                        inflater.reset();
                    }
                    hVar.R8(buffer);
                    hVar.z(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    long bytesRead = inflater.getBytesRead() + hVar.f207266b;
                    do {
                        a0Var.d(buffer, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        hVar.f();
                        a0Var.close();
                        cVar.d = null;
                        cVar.f185913c = null;
                    }
                }
                l lVar = this.f185940b;
                if (i == 1) {
                    String text = buffer.q();
                    h hVar2 = (h) lVar;
                    Intrinsics.checkNotNullParameter(text, "text");
                    hVar2.f185921b.d(hVar2, text);
                    return;
                }
                mmm.m bytes = buffer.c(buffer.f207266b);
                h webSocket = (h) lVar;
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                webSocket.f185921b.getClass();
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                return;
            }
            while (!this.e) {
                g();
                if (!this.i) {
                    break;
                } else {
                    f();
                }
            }
            if (this.f != 0) {
                StringBuilder sb9 = new StringBuilder("Expected continuation opcode. Got: ");
                int i2 = this.f;
                TimeZone timeZone2 = vlm.j.f290512a;
                String hexString2 = Integer.toHexString(i2);
                Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(...)");
                sb9.append(hexString2);
                throw new ProtocolException(sb9.toString());
            }
        }
        throw new IOException("closed");
    }

    public final void f() throws ProtocolException, EOFException {
        String reason;
        short s2;
        long j2 = this.f185942g;
        if (j2 > 0) {
            this.f185939a.T7(this.k, j2);
        }
        switch (this.f) {
            case 8:
                mmm.h hVar = this.k;
                long j3 = hVar.f207266b;
                if (j3 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j3 != 0) {
                    s2 = hVar.readShort();
                    reason = this.k.q();
                    String strN = (s2 < 1000 || s2 >= 5000) ? a0.d.n("Code must be in range [1000,5000): ", s2) : ((1004 > s2 || s2 >= 1007) && (1015 > s2 || s2 >= 3000)) ? null : j6.a.l(s2, "Code ", " is reserved and may not be used.");
                    if (strN != null) {
                        throw new ProtocolException(strN);
                    }
                } else {
                    reason = "";
                    s2 = 1005;
                }
                h hVar2 = (h) this.f185940b;
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (s2 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (hVar2) {
                    if (hVar2.f185933t != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    hVar2.f185933t = s2;
                    hVar2.u = reason;
                    Unit unit = Unit.f186387a;
                }
                hVar2.f185921b.b(hVar2, s2, reason);
                this.e = true;
                return;
            case 9:
                l lVar = this.f185940b;
                mmm.h hVar3 = this.k;
                mmm.m payload = hVar3.c(hVar3.f207266b);
                h hVar4 = (h) lVar;
                synchronized (hVar4) {
                    try {
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        if (!hVar4.v && (!hVar4.f185932s || !hVar4.f185930q.isEmpty())) {
                            hVar4.f185929p.add(payload);
                            hVar4.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                l lVar2 = this.f185940b;
                mmm.h hVar5 = this.k;
                mmm.m payload2 = hVar5.c(hVar5.f207266b);
                h hVar6 = (h) lVar2;
                synchronized (hVar6) {
                    Intrinsics.checkNotNullParameter(payload2, "payload");
                    hVar6.f185935x = false;
                }
                return;
            default:
                StringBuilder sb6 = new StringBuilder("Unknown control opcode: ");
                int i = this.f;
                TimeZone timeZone = vlm.j.f290512a;
                String hexString = Integer.toHexString(i);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                sb6.append(hexString);
                throw new ProtocolException(sb6.toString());
        }
    }

    public final void g() throws IOException {
        boolean z;
        if (this.e) {
            throw new IOException("closed");
        }
        mmm.k kVar = this.f185939a;
        long jH = kVar.timeout().h();
        kVar.timeout().b();
        try {
            byte b4 = kVar.readByte();
            byte[] bArr = vlm.h.f290508a;
            kVar.timeout().g(jH, TimeUnit.NANOSECONDS);
            int i = b4 & 15;
            this.f = i;
            boolean z3 = (b4 & 128) != 0;
            this.f185943h = z3;
            boolean z4 = (b4 & 8) != 0;
            this.i = z4;
            if (z4 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z6 = (b4 & SignedBytes.MAX_POWER_OF_TWO) != 0;
            if (i == 1 || i == 2) {
                if (!z6) {
                    z = false;
                } else {
                    if (!this.f185941c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f185944j = z;
            } else if (z6) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b4 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b4 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b5 = kVar.readByte();
            boolean z11 = (b5 & 128) != 0;
            if (z11) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j2 = b5 & Ascii.DEL;
            this.f185942g = j2;
            if (j2 == 126) {
                this.f185942g = kVar.readShort() & HPKE.aead_EXPORT_ONLY;
            } else if (j2 == 127) {
                long j3 = kVar.readLong();
                this.f185942g = j3;
                if (j3 < 0) {
                    StringBuilder sb6 = new StringBuilder("Frame length 0x");
                    long j5 = this.f185942g;
                    TimeZone timeZone = vlm.j.f290512a;
                    String hexString = Long.toHexString(j5);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                    sb6.append(hexString);
                    sb6.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb6.toString());
                }
            }
            if (this.i && this.f185942g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z11) {
                byte[] bArr2 = this.f185947n;
                Intrinsics.h(bArr2);
                kVar.readFully(bArr2);
            }
        } catch (Throwable th10) {
            kVar.timeout().g(jH, TimeUnit.NANOSECONDS);
            throw th10;
        }
    }
}
