package ql4;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f247179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f247181c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f247182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f247183h;
    public final c i;

    public s(int i, String interestRate, String str, dj0.d totalInterest, dj0.d totalRepayable, dj0.d dVar, r scheduleExcerpt, String quoteIdentifier, c cVar) {
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(totalInterest, "totalInterest");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(scheduleExcerpt, "scheduleExcerpt");
        Intrinsics.checkNotNullParameter(quoteIdentifier, "quoteIdentifier");
        this.f247179a = i;
        this.f247180b = interestRate;
        this.f247181c = str;
        this.d = totalInterest;
        this.e = totalRepayable;
        this.f = dVar;
        this.f247182g = scheduleExcerpt;
        this.f247183h = quoteIdentifier;
        this.i = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f247179a == sVar.f247179a && Intrinsics.f(this.f247180b, sVar.f247180b) && Intrinsics.f(this.f247181c, sVar.f247181c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f247182g, sVar.f247182g) && Intrinsics.f(this.f247183h, sVar.f247183h) && Intrinsics.f(this.i, sVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f247179a) * 31, 31, this.f247180b);
        String str = this.f247181c;
        int iC2 = v7.c(v7.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        dj0.d dVar = this.f;
        int iC3 = p.a.c((this.f247182g.hashCode() + ((iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.f247183h);
        c cVar = this.i;
        return iC3 + (cVar != null ? cVar.hashCode() : 0);
    }
}
