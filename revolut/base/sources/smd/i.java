package smd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f264421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f264422c;

    public i(String categoryId, xi0.b currency, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f264420a = categoryId;
        this.f264421b = currency;
        this.f264422c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f264420a, iVar.f264420a) && Intrinsics.f(this.f264421b, iVar.f264421b) && Intrinsics.f(this.f264422c, iVar.f264422c);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f264421b, this.f264420a.hashCode() * 31, 31);
        dj0.d dVar = this.f264422c;
        return iJ + (dVar == null ? 0 : dVar.hashCode());
    }
}
