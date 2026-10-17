package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f168511c;
    public final q d;
    public final l e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f168512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f168513h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f168514j;
    public final u k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f168515l;

    public v(String title, String description, t tVar, q qVar, l lVar, n nVar, s sVar, String str, String primaryButtonTitle, String secondaryButtonTitle, u successPopup, o declinePopup) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        Intrinsics.checkNotNullParameter(declinePopup, "declinePopup");
        this.f168509a = title;
        this.f168510b = description;
        this.f168511c = tVar;
        this.d = qVar;
        this.e = lVar;
        this.f = nVar;
        this.f168512g = sVar;
        this.f168513h = str;
        this.i = primaryButtonTitle;
        this.f168514j = secondaryButtonTitle;
        this.k = successPopup;
        this.f168515l = declinePopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f168509a, vVar.f168509a) && Intrinsics.f(this.f168510b, vVar.f168510b) && Intrinsics.f(this.f168511c, vVar.f168511c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f168512g, vVar.f168512g) && Intrinsics.f(this.f168513h, vVar.f168513h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f168514j, vVar.f168514j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f168515l, vVar.f168515l);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f168509a.hashCode() * 31, 31, this.f168510b);
        t tVar = this.f168511c;
        int iHashCode = (iC + (tVar == null ? 0 : tVar.hashCode())) * 31;
        q qVar = this.d;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.e;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        s sVar = this.f168512g;
        int iHashCode5 = (iHashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.f168513h;
        return this.f168515l.hashCode() + ((this.k.hashCode() + p.a.c(p.a.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.f168514j)) * 31);
    }
}
