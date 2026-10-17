package h43;

import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.l00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.z;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChooserScreen f149290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ChooserScreen chooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149290w = chooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f149290w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f149290w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f149290w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((l00) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ufm.i iVarC;
        int i = this.u;
        Continuation continuation = null;
        ChooserScreen chooserScreen = this.f149290w;
        switch (i) {
            case 0:
                l00 data = (l00) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = chooserScreen.d();
                Intrinsics.h(data);
                s sVar = (s) oVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                j60.a.v(sVar.f149304r, false, null, 3);
                sVar.K2();
                break;
            case 1:
                z zVar = (z) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = chooserScreen.d();
                String listId = zVar.f256227a;
                Object obj3 = zVar.f256228b;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                wi0.b countryCode = (wi0.b) obj3;
                s sVar2 = (s) oVarE32;
                mre.c cVar = sVar2.v;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                if (Intrinsics.f(listId, "EEA_DESCRIPTION_PERSONAL_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    iVarC = ((rre.d) cVar).c(TermsScope.S, countryCode);
                } else if (Intrinsics.f(listId, "EEA_DESCRIPTION_CRYPTO_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    iVarC = ((rre.d) cVar).c(TermsScope.o, countryCode);
                } else {
                    iVarC = null;
                }
                if (iVarC != null) {
                    sVar2.n2(new gm6.j(sVar2, iVarC, continuation, 26), new whi.b(6));
                }
                break;
            default:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = chooserScreen.d();
                Intrinsics.h(model);
                s sVar3 = (s) oVarE33;
                sVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f275445a, "SUBACCOUNT_MULTICURRENCY_LIST_ID")) {
                    sVar3.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.will-i-be-charged-for-exchanging-foreign-currencies", 2))));
                }
                break;
        }
        return Unit.f186387a;
    }
}
