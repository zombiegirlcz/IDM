package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240470c;
    public final j d;
    public final m e;

    public l(String title, String subtitle, String description, j gauge, m details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(gauge, "gauge");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f240468a = title;
        this.f240469b = subtitle;
        this.f240470c = description;
        this.d = gauge;
        this.e = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f240468a, lVar.f240468a) && Intrinsics.f(this.f240469b, lVar.f240469b) && Intrinsics.f(this.f240470c, lVar.f240470c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f240468a.hashCode() * 31, 31, this.f240469b), 31, this.f240470c)) * 31);
    }
}
