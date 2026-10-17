package sr8;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import j49.i;
import jla.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s9b.n;
import sa6.o;
import sgm.e3;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements kr8.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f265143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f265144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f265145c;
    public final h d;

    public g(e3 interactor, hj8.a juniorProfileInteractor, gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f265143a = interactor;
        this.f265144b = juniorProfileInteractor;
        this.f265145c = featureToggleInteractor;
        this.d = productCatalogueInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof mr8.b;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return mo3.a.f(q.Q(new o(bla.b.b(this.d, ne8.a.f214420c.a()), 2), new n((Continuation) null, this, 8)), new sl5.g(26), new a(this, 0), new sl5.g(27));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_transfer_request.api.model.JuniorTransferRequest");
        mr8.b bVar = (mr8.b) obj2;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            return h(bVar, (gim.c) continuation);
        }
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            return new j49.b(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(qk.d.e(2, bVar.e, null, bVar.f), null, null, null, 126))));
        }
        if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
            return j49.c.f171322a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(mr8.b r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr8.g.h(mr8.b, gim.c):java.lang.Object");
    }
}
