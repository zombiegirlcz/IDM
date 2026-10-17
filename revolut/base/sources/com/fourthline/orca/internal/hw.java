package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageBitmap f29424a;

    public hw(ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "imageBitmap");
        this.f29424a = imageBitmap;
    }

    public final ImageBitmap a() {
        return this.f29424a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hw) && Intrinsics.f(this.f29424a, ((hw) obj2).f29424a);
    }

    public int hashCode() {
        return this.f29424a.hashCode();
    }

    public String toString() {
        return "EnlargedState(imageBitmap=" + this.f29424a + ")";
    }
}
