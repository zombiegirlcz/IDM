package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f321960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f321962c;

    public d(b filter, String icon, n nVar) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f321960a = filter;
        this.f321961b = icon;
        this.f321962c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f321960a, dVar.f321960a) && Intrinsics.f(this.f321961b, dVar.f321961b) && Intrinsics.f(this.f321962c, dVar.f321962c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321960a.hashCode() * 31, 31, this.f321961b);
        n nVar = this.f321962c;
        return iC + (nVar == null ? 0 : nVar.hashCode());
    }
}
