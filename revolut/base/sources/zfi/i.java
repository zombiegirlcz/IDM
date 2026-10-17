package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f321974c;

    public i(String queryParam, String label, boolean z) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f321972a = queryParam;
        this.f321973b = label;
        this.f321974c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f321972a, iVar.f321972a) && Intrinsics.f(this.f321973b, iVar.f321973b) && this.f321974c == iVar.f321974c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321974c) + p.a.c(this.f321972a.hashCode() * 31, 31, this.f321973b);
    }
}
