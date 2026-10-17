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
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class t2 implements TextRecognizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f36925a = new a();

    public static final class a extends Task {
        @Override // com.google.android.gms.tasks.Task
        public Task<Text> addOnFailureListener(OnFailureListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            return this;
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<Text> addOnSuccessListener(OnSuccessListener<? super Text> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            listener.onSuccess(new Text("", zhm.f0.f322471a));
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
        public Task<Text> addOnFailureListener(Activity p0, OnFailureListener p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<Text> addOnFailureListener(Executor p0, OnFailureListener p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Text getResult() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<Text> addOnSuccessListener(Executor p0, OnSuccessListener<? super Text> p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public <X extends Throwable> Text getResult(Class<X> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<Text> addOnSuccessListener(Activity p0, OnSuccessListener<? super Text> p17) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p17, "p1");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer, java.io.Closeable, java.lang.AutoCloseable
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
    public Task<Text> process(@NotNull nc.a p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36925a;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer
    @NotNull
    public Task<Text> process(@NotNull InputImage inputImage) {
        Intrinsics.checkNotNullParameter(inputImage, "inputImage");
        return this.f36925a;
    }

    @NotNull
    public Task<Text> process(@NotNull Bitmap p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36925a;
    }

    @NotNull
    public Task<Text> process(@NotNull Image p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36925a;
    }

    @Override // ph.a
    @NotNull
    public Task<Text> process(@NotNull Image p0, int i, @NotNull Matrix p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return this.f36925a;
    }

    @NotNull
    public Task<Text> process(@NotNull ByteBuffer p0, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.f36925a;
    }
}
