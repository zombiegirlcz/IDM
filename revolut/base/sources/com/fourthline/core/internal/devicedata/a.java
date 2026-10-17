package com.fourthline.core.internal.devicedata;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionFrame f26340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26341b;

    public a(MotionFrame frame, boolean z) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.f26340a = frame;
        this.f26341b = z;
    }

    public final boolean a() {
        return this.f26341b;
    }

    public final MotionFrame b() {
        return this.f26340a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f26340a, aVar.f26340a) && this.f26341b == aVar.f26341b;
    }

    public int hashCode() {
        return (this.f26340a.hashCode() * 31) + Boolean.hashCode(this.f26341b);
    }

    public String toString() {
        return "MotionFrameData(frame=" + this.f26340a + ", attitudeIsAbsolute=" + this.f26341b + ")";
    }
}
