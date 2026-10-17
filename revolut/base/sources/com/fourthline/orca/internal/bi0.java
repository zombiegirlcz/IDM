package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f27137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f27138c;
    private final z00 d;

    public bi0(c81 c81Var, c81 c81Var2, c81 c81Var3, z00 graphic) {
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        this.f27136a = c81Var;
        this.f27137b = c81Var2;
        this.f27138c = c81Var3;
        this.d = graphic;
    }

    public final c81 a() {
        return this.f27138c;
    }

    public final c81 b() {
        return this.f27137b;
    }

    public final z00 c() {
        return this.d;
    }

    public final c81 d() {
        return this.f27136a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) obj2;
        return Intrinsics.f(this.f27136a, bi0Var.f27136a) && Intrinsics.f(this.f27137b, bi0Var.f27137b) && Intrinsics.f(this.f27138c, bi0Var.f27138c) && Intrinsics.f(this.d, bi0Var.d);
    }

    public int hashCode() {
        c81 c81Var = this.f27136a;
        int iHashCode = (c81Var == null ? 0 : c81Var.hashCode()) * 31;
        c81 c81Var2 = this.f27137b;
        int iHashCode2 = (iHashCode + (c81Var2 == null ? 0 : c81Var2.hashCode())) * 31;
        c81 c81Var3 = this.f27138c;
        return ((iHashCode2 + (c81Var3 != null ? c81Var3.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OrcaPageState(title=" + this.f27136a + ", description=" + this.f27137b + ", buttonLabel=" + this.f27138c + ", graphic=" + this.d + ")";
    }

    public /* synthetic */ bi0(c81 c81Var, c81 c81Var2, c81 c81Var3, z00 z00Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c81Var, (i & 2) != 0 ? null : c81Var2, (i & 4) != 0 ? null : c81Var3, z00Var);
    }
}
