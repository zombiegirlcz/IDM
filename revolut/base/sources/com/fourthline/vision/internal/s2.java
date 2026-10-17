package com.fourthline.vision.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetector;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class s2 implements FaceDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f36861a = new a();

    public static final class a extends Task {
        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnFailureListener(OnFailureListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            return this;
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnSuccessListener(OnSuccessListener<? super List<? extends mh.a>> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            return this;
        }

        @Override // com.google.android.gms.tasks.Task
        public Exception getException() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isCanceled() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isComplete() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isSuccessful() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnFailureListener(Activity p0, OnFailureListener p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnSuccessListener(Activity p0, OnSuccessListener<? super List<? extends mh.a>> p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnFailureListener(Executor p0, OnFailureListener p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<mh.a>> addOnSuccessListener(Executor p0, OnSuccessListener<? super List<? extends mh.a>> p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public List<mh.a> getResult() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public <X extends Throwable> List<mh.a> getResult(Class<X> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    @Override // com.google.mlkit.vision.face.FaceDetector, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ph.a
    public int getDetectorType() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NotNull
    public Feature[] getOptionalFeatures() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @NotNull
    public Task<List<mh.a>> process(@NotNull nc.a p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36861a;
    }

    @Override // com.google.mlkit.vision.face.FaceDetector
    @NotNull
    public Task<List<mh.a>> process(@NotNull InputImage inputImage) {
        Intrinsics.checkNotNullParameter(inputImage, "inputImage");
        return this.f36861a;
    }

    @NotNull
    public Task<List<mh.a>> process(@NotNull Bitmap p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36861a;
    }

    @NotNull
    public Task<List<mh.a>> process(@NotNull Image p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36861a;
    }

    @Override // ph.a
    @NotNull
    public Task<List<mh.a>> process(@NotNull Image p0, int i, @NotNull Matrix p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return this.f36861a;
    }

    @NotNull
    public Task<List<mh.a>> process(@NotNull ByteBuffer p0, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36861a;
    }
}
