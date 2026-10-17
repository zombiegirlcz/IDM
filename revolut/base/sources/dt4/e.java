package dt4;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ql4.s;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f117365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f117366c;
    public final wi0.b d;
    public final whf.p e;

    public e(List instalmentQuotes, s selectedQuote, dj0.d principalAmount, wi0.b countryCode, whf.p transactionsContent) {
        Intrinsics.checkNotNullParameter(instalmentQuotes, "instalmentQuotes");
        Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f117364a = instalmentQuotes;
        this.f117365b = selectedQuote;
        this.f117366c = principalAmount;
        this.d = countryCode;
        this.e = transactionsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f117364a, eVar.f117364a) && Intrinsics.f(this.f117365b, eVar.f117365b) && Intrinsics.f(this.f117366c, eVar.f117366c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(v7.c((this.f117365b.hashCode() + (this.f117364a.hashCode() * 31)) * 31, 31, this.f117366c), 31, this.d.f297794a);
    }
}
