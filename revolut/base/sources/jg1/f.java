package jg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173904c;
    public final String d;
    public final String e;
    public final String f;

    public f(String str, String str2, String tokenReferenceID, String str3, String panLast4, String str4) {
        Intrinsics.checkNotNullParameter(tokenReferenceID, "tokenReferenceID");
        Intrinsics.checkNotNullParameter(panLast4, "panLast4");
        this.f173902a = str;
        this.f173903b = str2;
        this.f173904c = tokenReferenceID;
        this.d = str3;
        this.e = panLast4;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f173902a, fVar.f173902a) && Intrinsics.f(this.f173903b, fVar.f173903b) && Intrinsics.f(this.f173904c, fVar.f173904c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        String str = this.f173902a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173903b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f173904c);
        String str3 = this.d;
        int iC2 = p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        return iC2 + (str4 != null ? str4.hashCode() : 0);
    }
}
