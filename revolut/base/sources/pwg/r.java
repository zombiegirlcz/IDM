package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f240477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240479c;
    public final k d;

    public r(j gauge, String title, String subtitle, k kVar) {
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f240477a = gauge;
        this.f240478b = title;
        this.f240479c = subtitle;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f240477a == rVar.f240477a && Intrinsics.f(this.f240478b, rVar.f240478b) && Intrinsics.f(this.f240479c, rVar.f240479c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f240477a.hashCode() * 31, 31, this.f240478b), 31, this.f240479c);
        k kVar = this.d;
        return iC + (kVar == null ? 0 : kVar.hashCode());
    }
}
