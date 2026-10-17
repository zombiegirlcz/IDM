package dgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f114631c;
    public final e d;

    public h(String logo, String title, g subtitle, e eVar) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f114629a = logo;
        this.f114630b = title;
        this.f114631c = subtitle;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f114629a, hVar.f114629a) && Intrinsics.f(this.f114630b, hVar.f114630b) && Intrinsics.f(this.f114631c, hVar.f114631c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f114631c.hashCode() + p.a.c(this.f114629a.hashCode() * 31, 31, this.f114630b)) * 31;
        e eVar = this.d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
