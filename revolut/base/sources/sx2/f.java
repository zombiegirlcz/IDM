package sx2;

import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e f266286b;

    public /* synthetic */ f(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, int i) {
        this.f266285a = i;
        this.f266286b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f266285a) {
            case 0:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Iterator it8 = plans.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((hha.d) next).f152287a, this.f266286b.o.f64681a.f236404a.f152287a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (hha.d) next;
            case 1:
                od0.i walletId = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                return rd0.e.e(nim.a.y(nim.a.v(walletId.d() ? rd0.e.b(this.f266286b.u.a((String) walletId.c(), false)) : zi0.c.i(zhm.f0.f322471a), new g(1)), new g(2)), zhm.h0.f322473a, new qtb.o(3, 28, (Continuation) null));
            case 2:
                hx2.f result = (hx2.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof hx2.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar = this.f266286b;
                Object content = ((c0) ((j2) eVar.N.f22677a).getValue()).f266273c.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hx2.e eVar2 = (hx2.e) result;
                e93.f fVar = eVar2.f156363a;
                Intrinsics.i(fVar, "null cannot be cast to non-null type com.revolut.feature.cards.models.design.CardDesign.PhysicalCardDesign");
                eVar.C2(new i0((hha.d) content, eVar2.f156364b, eVar.o.f64685h, (e93.d) fVar));
                return Unit.f186387a;
            case 3:
                hx2.k result2 = (hx2.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof hx2.j;
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar3 = this.f266286b;
                if (z) {
                    eVar3.C1(new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((hx2.j) result2).f156368a, 6, false, false), null, 47));
                } else {
                    if (!(result2 instanceof hx2.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar3.l2(new r(eVar3, result2, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                psg.a walletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                return rd0.e.c(hj8.a.a(this.f266286b.z, walletProfile.f239485b, w4l.j.f294644c), kotlin.coroutines.g.f186406a);
        }
    }
}
