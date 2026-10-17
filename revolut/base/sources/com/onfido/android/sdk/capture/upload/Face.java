package com.onfido.android.sdk.capture.upload;

import com.onfido.android.sdk.capture.ui.camera.face.FaceCaptureVariant;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/upload/Face;", "Ljava/io/Serializable;", "id", "", "variant", "Lcom/onfido/android/sdk/capture/ui/camera/face/FaceCaptureVariant;", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/camera/face/FaceCaptureVariant;)V", "getId", "()Ljava/lang/String;", "getVariant", "()Lcom/onfido/android/sdk/capture/ui/camera/face/FaceCaptureVariant;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Face implements Serializable {

    @NotNull
    private final String id;

    @NotNull
    private final FaceCaptureVariant variant;

    public Face(@NotNull String id10, @NotNull FaceCaptureVariant variant) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.id = id10;
        this.variant = variant;
    }

    public static /* synthetic */ Face copy$default(Face face, String str, FaceCaptureVariant faceCaptureVariant, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = face.id;
        }
        if ((i & 2) != 0) {
            faceCaptureVariant = face.variant;
        }
        return face.copy(str, faceCaptureVariant);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FaceCaptureVariant getVariant() {
        return this.variant;
    }

    @NotNull
    public final Face copy(@NotNull String id10, @NotNull FaceCaptureVariant variant) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new Face(id10, variant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Face)) {
            return false;
        }
        Face face = (Face) other;
        return Intrinsics.f(this.id, face.id) && this.variant == face.variant;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final FaceCaptureVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.variant.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Face(id=" + this.id + ", variant=" + this.variant + ")";
    }
}
