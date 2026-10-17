package tr4;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql4.s f273730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f273731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273732c;
    public final wi0.b d;
    public final dj0.d e;
    public final io3.l f;

    public f(ql4.s selectedQuote, whf.p transactionsContent, List documents, wi0.b countryCode, dj0.d principalAmount, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f273730a = selectedQuote;
        this.f273731b = transactionsContent;
        this.f273732c = documents;
        this.d = countryCode;
        this.e = principalAmount;
        this.f = pocketType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f273730a, fVar.f273730a) && Intrinsics.f(this.f273731b, fVar.f273731b) && Intrinsics.f(this.f273732c, fVar.f273732c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.c(p.a.c(p.a.d((this.f273731b.hashCode() + (this.f273730a.hashCode() * 31)) * 31, 31, this.f273732c), 31, this.d.f297794a), 31, this.e);
    }
}
