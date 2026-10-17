package pnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nnd.c1;
import nnd.m0;
import nnd.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f237691b;

    public /* synthetic */ a(c1 c1Var, int i) {
        this.f237690a = i;
        this.f237691b = c1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AnalyticsAccount it8 = (AnalyticsAccount) obj2;
        switch (this.f237690a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf((it8 instanceof AnalyticsAccount.Junior) && Intrinsics.f(((AnalyticsAccount.Junior) it8).getF99186a(), ((m0) this.f237691b).f217569a.f99184a));
            default:
                Intrinsics.checkNotNullParameter(it8, "$this$getIndividualSelection");
                return Boolean.valueOf((it8 instanceof AnalyticsAccount.Junior.CurrencyPocket) && Intrinsics.f(((AnalyticsAccount.Junior.CurrencyPocket) it8).f99186a, ((u0) this.f237691b).f217596a.f99186a));
        }
    }
}
