package vu0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vrl.i0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f292129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f292130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f292131c;
    public final Function1 d;
    public final Function1 e;
    public final boolean f;

    public a() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f292129a, aVar.f292129a) && Intrinsics.f(this.f292130b, aVar.f292130b) && Intrinsics.f(this.f292131c, aVar.f292131c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        Float f = this.f292129a;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f292131c.hashCode() + ((this.f292130b.hashCode() + ((f == null ? 0 : f.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public a(Float f, Function0 isDragLockedProvider, xu0.d dVar, xu0.d dVar2, Function1 isHorizontalGestureValid, int i) {
        f = (i & 1) != 0 ? null : f;
        isDragLockedProvider = (i & 2) != 0 ? new vo8.b(5) : isDragLockedProvider;
        Function1 isTouchStartValid = dVar;
        isTouchStartValid = (i & 4) != 0 ? new i0(12) : isTouchStartValid;
        Function1 isMoveCanBeHandled = dVar2;
        isMoveCanBeHandled = (i & 8) != 0 ? new i0(13) : isMoveCanBeHandled;
        isHorizontalGestureValid = (i & 16) != 0 ? new i0(14) : isHorizontalGestureValid;
        boolean z = (i & 32) != 0;
        Intrinsics.checkNotNullParameter(isDragLockedProvider, "isDragLockedProvider");
        Intrinsics.checkNotNullParameter(isTouchStartValid, "isTouchStartValid");
        Intrinsics.checkNotNullParameter(isMoveCanBeHandled, "isMoveCanBeHandled");
        Intrinsics.checkNotNullParameter(isHorizontalGestureValid, "isHorizontalGestureValid");
        this.f292129a = f;
        this.f292130b = isDragLockedProvider;
        this.f292131c = isTouchStartValid;
        this.d = isMoveCanBeHandled;
        this.e = isHorizontalGestureValid;
        this.f = z;
    }
}
