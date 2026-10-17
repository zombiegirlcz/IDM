package aqd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f8388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f8389c;

    public q0(List items, p0 toolbarState, l0 footerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f8387a = items;
        this.f8388b = toolbarState;
        this.f8389c = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f8387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f8387a, q0Var.f8387a) && Intrinsics.f(this.f8388b, q0Var.f8388b) && Intrinsics.f(this.f8389c, q0Var.f8389c);
    }

    public final int hashCode() {
        return this.f8389c.hashCode() + ((this.f8388b.hashCode() + (this.f8387a.hashCode() * 31)) * 31);
    }
}
