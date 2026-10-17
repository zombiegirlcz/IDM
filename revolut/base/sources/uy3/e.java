package uy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f284063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284064c;

    public e(String url2, d dVar, String successPopupTitle) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(successPopupTitle, "successPopupTitle");
        this.f284062a = url2;
        this.f284063b = dVar;
        this.f284064c = successPopupTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f284062a, eVar.f284062a) && Intrinsics.f(this.f284063b, eVar.f284063b) && Intrinsics.f(this.f284064c, eVar.f284064c);
    }

    public final int hashCode() {
        int iHashCode = this.f284062a.hashCode() * 31;
        d dVar = this.f284063b;
        return this.f284064c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
