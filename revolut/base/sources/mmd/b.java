package mmd;

import gsd.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import osd.e;
import psd.j;
import rsd.k;
import xld.d;
import xsd.i;
import zhm.w;
import zsd.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f207196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f207197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f207198c;
    public final l d;
    public final c e;
    public final nsd.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nsd.b f207199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vsd.c f207200h;
    public final vsd.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f207201j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f207202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f207203m;

    public b(c cashNetWorthGroupProvider, j cryptoNetWorthGroupProvider, k investNetWorthGroupProvider, l savingsNetWorthGroupProvider, c customAssetsNetWorthGroupProvider, nsd.b linkedCombinedNetWorthGroupProvider, nsd.b creditNetWorthGroupProvider, vsd.c linkedDebitCardNetWorthGroupProvider, vsd.c linkedCreditCardNetWorthGroupProvider, e creditCardNetWorthGroupProvider, i loanNetWorthGroupProvider, c payLaterNetWorthGroupProvider, d netWorthEmptyStatesAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cashNetWorthGroupProvider, "cashNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(cryptoNetWorthGroupProvider, "cryptoNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(investNetWorthGroupProvider, "investNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(savingsNetWorthGroupProvider, "savingsNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(customAssetsNetWorthGroupProvider, "customAssetsNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(linkedCombinedNetWorthGroupProvider, "linkedCombinedNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(creditNetWorthGroupProvider, "creditNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(linkedDebitCardNetWorthGroupProvider, "linkedDebitCardNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(linkedCreditCardNetWorthGroupProvider, "linkedCreditCardNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(creditCardNetWorthGroupProvider, "creditCardNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(loanNetWorthGroupProvider, "loanNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(payLaterNetWorthGroupProvider, "payLaterNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(netWorthEmptyStatesAvailabilityInteractor, "netWorthEmptyStatesAvailabilityInteractor");
        this.f207196a = cashNetWorthGroupProvider;
        this.f207197b = cryptoNetWorthGroupProvider;
        this.f207198c = investNetWorthGroupProvider;
        this.d = savingsNetWorthGroupProvider;
        this.e = customAssetsNetWorthGroupProvider;
        this.f = linkedCombinedNetWorthGroupProvider;
        this.f207199g = creditNetWorthGroupProvider;
        this.f207200h = linkedDebitCardNetWorthGroupProvider;
        this.i = linkedCreditCardNetWorthGroupProvider;
        this.f207201j = creditCardNetWorthGroupProvider;
        this.k = loanNetWorthGroupProvider;
        this.f207202l = payLaterNetWorthGroupProvider;
        this.f207203m = netWorthEmptyStatesAvailabilityInteractor;
    }

    public final jhi.k a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((frd.k) it8.next()).b());
        }
        return nim.a.u(new p0(this, (Continuation) null, 21), cj9.c.d(arrayList));
    }
}
