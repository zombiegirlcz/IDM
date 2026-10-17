package com.fourthline.vision.internal;

import com.fourthline.vision.internal.l8;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f37104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f37105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37106c;
    private s8 d;
    private final ukm.u e;

    public static final class a implements l8.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f37108b;

        public a(File file) {
            this.f37108b = file;
        }

        @Override // com.fourthline.vision.internal.l8.a
        public void onReleased() {
            xd.this.e.mo3647trySendJP2dKIU(this.f37108b);
        }

        @Override // com.fourthline.vision.internal.l8.a
        public void onStopped(l8 encoder) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            if ((encoder instanceof s8 ? (s8) encoder : null) != null) {
                xd.this.f37104a.resetVideoEncoder();
            }
        }
    }

    public xd(@NotNull z source, @NotNull d2 mediaCodecDataSource) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        this.f37104a = source;
        this.f37105b = mediaCodecDataSource;
        this.e = vc.s.a(0, null, null, 6);
    }

    private final a createListener(File file) {
        return new a(file);
    }

    public final boolean isRecording() {
        return this.f37106c;
    }

    public final void startRecording(@NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        if (this.d != null) {
            throw new IllegalStateException();
        }
        s8 s8Var = new s8(outputFile, createListener(outputFile), this.f37105b);
        s8Var.prepare();
        this.f37104a.setVideoEncoder(s8Var);
        s8Var.startRecording();
        this.d = s8Var;
        this.f37106c = true;
    }

    public final Object stopRecording(@NotNull Continuation<? super File> continuation) {
        s8 s8Var = this.d;
        if (s8Var != null) {
            s8Var.stopRecording();
        }
        this.d = null;
        this.f37106c = false;
        return this.e.j(continuation);
    }
}
