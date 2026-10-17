package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36201c;
    private final int d;

    public fa(int i, int i2, int i3, int i5) {
        this.f36199a = i;
        this.f36200b = i2;
        this.f36201c = i3;
        this.d = i5;
    }

    public static /* synthetic */ fa copy$default(fa faVar, int i, int i2, int i3, int i5, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i = faVar.f36199a;
        }
        if ((i6 & 2) != 0) {
            i2 = faVar.f36200b;
        }
        if ((i6 & 4) != 0) {
            i3 = faVar.f36201c;
        }
        if ((i6 & 8) != 0) {
            i5 = faVar.d;
        }
        return faVar.copy(i, i2, i3, i5);
    }

    public final int area() {
        return width() * height();
    }

    public final int centerX() {
        return (this.f36199a + this.f36201c) >> 1;
    }

    public final int centerY() {
        return (this.f36200b + this.d) >> 1;
    }

    public final int component1() {
        return this.f36199a;
    }

    public final int component2() {
        return this.f36200b;
    }

    public final int component3() {
        return this.f36201c;
    }

    public final int component4() {
        return this.d;
    }

    public final boolean contains(@NotNull fa rectangle) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        int i3 = this.f36199a;
        int i5 = this.f36201c;
        return i3 < i5 && (i = this.f36200b) < (i2 = this.d) && i3 <= rectangle.f36199a && i <= rectangle.f36200b && i5 >= rectangle.f36201c && i2 >= rectangle.d;
    }

    @NotNull
    public final fa copy(int i, int i2, int i3, int i5) {
        return new fa(i, i2, i3, i5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj2;
        return this.f36199a == faVar.f36199a && this.f36200b == faVar.f36200b && this.f36201c == faVar.f36201c && this.d == faVar.d;
    }

    public final int getBottom() {
        return this.d;
    }

    public final int getLeft() {
        return this.f36199a;
    }

    public final int getRight() {
        return this.f36201c;
    }

    public final int getTop() {
        return this.f36200b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f36199a) * 31) + Integer.hashCode(this.f36200b)) * 31) + Integer.hashCode(this.f36201c)) * 31) + Integer.hashCode(this.d);
    }

    public final int height() {
        return this.d - this.f36200b;
    }

    @NotNull
    public String toString() {
        return "Rectangle(left = " + this.f36199a + ", top = " + this.f36200b + ", right = " + this.f36201c + ", bottom = " + this.d + ")";
    }

    @NotNull
    public final fa translate(int i, int i2) {
        return new fa(this.f36199a + i, this.f36200b + i2, this.f36201c + i, this.d + i2);
    }

    public final int width() {
        return this.f36201c - this.f36199a;
    }
}
