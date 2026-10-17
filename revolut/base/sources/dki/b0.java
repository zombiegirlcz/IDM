package dki;

import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 extends u {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f115523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f115525c;
    public final boolean d;
    public final boolean e;

    public b0(com.revolut.kompot.navigable.a controller, boolean z, TransitionAnimation animation, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f115523a = controller;
        this.f115524b = z;
        this.f115525c = animation;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f115523a.equals(b0Var.f115523a) && this.f115524b == b0Var.f115524b && Intrinsics.f(this.f115525c, b0Var.f115525c) && this.d == b0Var.d && this.e == b0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c((this.f115525c.hashCode() + j6.a.c(this.f115523a.hashCode() * 31, 31, this.f115524b)) * 31, 31, this.d);
    }
}
