package fmg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f136439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f136440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f136441c;
    public final List d;
    public final boolean e;

    public n0(z zVar, List sections, v vVar, List specialFlags, boolean z) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(specialFlags, "specialFlags");
        this.f136439a = zVar;
        this.f136440b = sections;
        this.f136441c = vVar;
        this.d = specialFlags;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f136439a, n0Var.f136439a) && Intrinsics.f(this.f136440b, n0Var.f136440b) && Intrinsics.f(this.f136441c, n0Var.f136441c) && Intrinsics.f(this.d, n0Var.d) && this.e == n0Var.e;
    }

    public final int hashCode() {
        z zVar = this.f136439a;
        int iD = p.a.d((zVar == null ? 0 : zVar.hashCode()) * 31, 31, this.f136440b);
        v vVar = this.f136441c;
        return Boolean.hashCode(this.e) + p.a.d((iD + (vVar != null ? vVar.hashCode() : 0)) * 31, 31, this.d);
    }
}
