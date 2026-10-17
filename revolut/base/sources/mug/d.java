package mug;

import cli.y;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeatureRating;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ip0.u70;
import ip0.v70;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountClosureFeatureRatingScreen f209025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f209025w = accountClosureFeatureRatingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f209025w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f209025w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((v70) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((u70) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = null;
        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = this.f209025w;
        switch (i) {
            case 0:
                v70 clickData = (v70) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = accountClosureFeatureRatingScreen.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a aVar2 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) hVarE3;
                y yVar = aVar2.f94950q;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f166779a;
                Iterator it8 = aVar2.o.f94946a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((AccountClosureFeedbackFeature) next).f94870a, str)) {
                            obj3 = next;
                        }
                    }
                }
                AccountClosureFeedbackFeature accountClosureFeedbackFeature = (AccountClosureFeedbackFeature) obj3;
                if (accountClosureFeedbackFeature == null) {
                    throw new IllegalStateException("Cannot find rated feature");
                }
                AccountClosureFeatureRating accountClosureFeatureRating = new AccountClosureFeatureRating(2, Integer.valueOf((int) clickData.f166780b));
                LinkedHashMap linkedHashMapZ = r0.z(((e) ((j2) yVar.f22677a).getValue()).f209027b);
                linkedHashMapZ.put(accountClosureFeedbackFeature, accountClosureFeatureRating);
                aVar2.H2(yVar, new awk.j(linkedHashMapZ, 13));
                return Unit.f186387a;
            default:
                u70 clickData2 = (u70) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE32 = accountClosureFeatureRatingScreen.e3();
                Intrinsics.h(clickData2);
                com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a aVar4 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) hVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                AccountClosureFeedbackFeature accountClosureFeedbackFeature2 = clickData2.f166616a.d;
                AccountClosureFeatureRating accountClosureFeatureRating2 = (AccountClosureFeatureRating) ((e) ((j2) aVar4.f94950q.f22677a).getValue()).f209027b.get(accountClosureFeedbackFeature2);
                oki.h.v2(aVar4.f94949p, new AccountClosureFeatureRatingScreenContract$Step.FeatureRatingFeedback(accountClosureFeedbackFeature2, accountClosureFeatureRating2 != null ? accountClosureFeatureRating2.f94856b : null), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
        }
    }
}
