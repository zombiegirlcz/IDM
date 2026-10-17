package vli;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f290456b;

    public /* synthetic */ e(k kVar, int i) {
        this.f290455a = i;
        this.f290456b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f290455a) {
            case 0:
                FeatureCommand naviCommand = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return new ufm.c(new to7.f(this.f290456b, naviCommand, 17), 2);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                MoneyRequest moneyRequest = (MoneyRequest) pair.f186385a;
                zm3.l lVar = (zm3.l) pair.f186386b;
                k kVar = this.f290456b;
                return ((u6k.c) kVar.f290470b).d(moneyRequest, "").l(new f(kVar, moneyRequest, lVar, 1)).m(new vif.c(new vgk.f(kVar, lVar, 12), 19));
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                MoneyRequest moneyRequest2 = (MoneyRequest) pair2.f186385a;
                zm3.l lVar2 = (zm3.l) pair2.f186386b;
                if (i.f290465a[moneyRequest2.f60315b.ordinal()] == 1) {
                    return d0.m(new Pair(moneyRequest2, lVar2));
                }
                return new pfm.h(new f(this.f290456b, moneyRequest2, lVar2, 2), 2).f(d0.l(new IllegalStateException("Money request state isn't ACTIVE: id=" + moneyRequest2.f60314a + ", state=" + moneyRequest2.f60315b)));
        }
    }
}
