package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278372c;

    public l(String id10, String title, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f278370a = id10;
        this.f278371b = title;
        this.f278372c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f278370a, lVar.f278370a) && Intrinsics.f(this.f278371b, lVar.f278371b) && Intrinsics.f(this.f278372c, lVar.f278372c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f278370a.hashCode() * 31, 31, this.f278371b);
        String str = this.f278372c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
