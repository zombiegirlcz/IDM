package g23;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_input.api.CardInputFeatureConfig;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import et6.u1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 extends yji.n implements j23.m {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f139807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final al4.p f139808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k23.f f139809n;
    public final boolean o;

    public k0(OrderNewCardTabControllerContract$InputData inputData, al4.p creditCardProductFeatureTogglesInteractor, k23.f sharedDataSource) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        this.f139807l = inputData;
        this.f139808m = creditCardProductFeatureTogglesInteractor;
        this.f139809n = sharedDataSource;
        this.o = (!inputData.f65112b || inputData.e == zn3.a.ONBOARDING || (com.revolut.feature.card_order_new.api.a.a(inputData.f65113c) instanceof AccountId.Joint)) ? false : true;
    }

    public final j23.o Z2() {
        return new j23.o(new u1(!this.o ? new go.g(Boolean.FALSE, 2) : vkm.q.Q(new dfj.f(this.f139809n.a(), 29), new f5h.b((Continuation) null, this, 21)), this, 16), zhm.u.c(this), null, "LinkCard", 4);
    }

    @Override // j23.m
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "LINK_CARD_LIST_ID")) {
            return j23.g.f170666a;
        }
        A2(u0.c(CardInputFeatureConfig.LinkCard.f64743a));
        return j23.f.f170665a;
    }
}
