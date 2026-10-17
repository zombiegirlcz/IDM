package zzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f326740c;
    public final a d;

    public i(String ref2, String symbol, h assetType, a aVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f326738a = ref2;
        this.f326739b = symbol;
        this.f326740c = assetType;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f326738a, iVar.f326738a) && Intrinsics.f(this.f326739b, iVar.f326739b) && this.f326740c == iVar.f326740c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f326740c.hashCode() + p.a.c(this.f326738a.hashCode() * 31, 31, this.f326739b)) * 31;
        a aVar = this.d;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
