package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f36610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36611b;

    public o(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f36610a = bitmap;
        this.f36611b = i;
    }

    public static /* synthetic */ o copy$default(o oVar, Bitmap bitmap, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            bitmap = oVar.f36610a;
        }
        if ((i2 & 2) != 0) {
            i = oVar.f36611b;
        }
        return oVar.copy(bitmap, i);
    }

    @NotNull
    public final Bitmap component1() {
        return this.f36610a;
    }

    public final int component2() {
        return this.f36611b;
    }

    @NotNull
    public final o copy(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new o(bitmap, i);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f36610a, oVar.f36610a) && this.f36611b == oVar.f36611b;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.f36610a;
    }

    public final int getRotationDegrees() {
        return this.f36611b;
    }

    public int hashCode() {
        return (this.f36610a.hashCode() * 31) + Integer.hashCode(this.f36611b);
    }

    @NotNull
    public String toString() {
        return "BitmapWithRotation(bitmap=" + this.f36610a + ", rotationDegrees=" + this.f36611b + ")";
    }
}
