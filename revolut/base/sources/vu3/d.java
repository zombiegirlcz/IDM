package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final it3.k f292211c;
    public final String d;
    public final String e;
    public final hha.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f292212g;

    public d(String label, String str, it3.k kVar, String str2, String str3, hha.i iVar, String str4) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f292209a = label;
        this.f292210b = str;
        this.f292211c = kVar;
        this.d = str2;
        this.e = str3;
        this.f = iVar;
        this.f292212g = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f292209a, dVar.f292209a) && Intrinsics.f(this.f292210b, dVar.f292210b) && this.f292211c == dVar.f292211c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f292212g, dVar.f292212g);
    }

    @Override // vu3.e
    public final String getLabel() {
        return this.f292209a;
    }

    public final int hashCode() {
        int iHashCode = this.f292209a.hashCode() * 31;
        String str = this.f292210b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        it3.k kVar = this.f292211c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        hha.i iVar = this.f;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str4 = this.f292212g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
