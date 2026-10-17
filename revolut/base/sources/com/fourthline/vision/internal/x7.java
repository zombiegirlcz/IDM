package com.fourthline.vision.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37096c;

    public x7(float f, float f4, float f5) {
        this.f37094a = f;
        this.f37095b = f4;
        this.f37096c = f5;
    }

    public static /* synthetic */ x7 copy$default(x7 x7Var, float f, float f4, float f5, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = x7Var.f37094a;
        }
        if ((i & 2) != 0) {
            f4 = x7Var.f37095b;
        }
        if ((i & 4) != 0) {
            f5 = x7Var.f37096c;
        }
        return x7Var.copy(f, f4, f5);
    }

    public final float component1() {
        return this.f37094a;
    }

    public final float component2() {
        return this.f37095b;
    }

    public final float component3() {
        return this.f37096c;
    }

    @NotNull
    public final x7 copy(float f, float f4, float f5) {
        return new x7(f, f4, f5);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj2;
        return Float.compare(this.f37094a, x7Var.f37094a) == 0 && Float.compare(this.f37095b, x7Var.f37095b) == 0 && Float.compare(this.f37096c, x7Var.f37096c) == 0;
    }

    public final float getX() {
        return this.f37094a;
    }

    public final float getY() {
        return this.f37095b;
    }

    public final float getZ() {
        return this.f37096c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f37094a) * 31) + Float.hashCode(this.f37095b)) * 31) + Float.hashCode(this.f37096c);
    }

    @NotNull
    public String toString() {
        return "Landmark(x=" + this.f37094a + ", y=" + this.f37095b + ", z=" + this.f37096c + ")";
    }

    public /* synthetic */ x7(float f, float f4, float f5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f4, (i & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f5);
    }
}
