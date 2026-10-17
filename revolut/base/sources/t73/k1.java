package t73;

import java.util.LinkedHashMap;
import java.util.List;
import kg1.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xy2.a;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268487b;

    public /* synthetic */ k1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, int i) {
        this.f268486a = i;
        this.f268487b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f268486a) {
            case 0:
                xy2.a result = (xy2.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, a.C1720a.f309555a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268487b;
                gVar.l2(new y1(gVar, null, 0), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                List list = walletProfiles;
                int iB = zhm.q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list) {
                    linkedHashMap.put(((psg.a) obj3).f239485b, obj3);
                }
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268487b;
                return vkm.q.Q(vkm.q.q(new qij.s(gVar2.f65434h0.B(new d(10)), 20)), new mki.d((Continuation) null, gVar2, linkedHashMap, walletProfiles, 13));
            default:
                kg1.a result2 = (kg1.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof a.C1048a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = this.f268487b;
                v73.a aVar = gVar3.H;
                h93.f0 card = (h93.f0) ((q0) ((vkm.j2) gVar3.f65434h0.f22677a).getValue()).d.f224257a;
                if (card != null) {
                    v73.j jVar = (v73.j) aVar;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    jVar.T2(new v06.i(jVar, card, null, 16), new yi5.b(27));
                }
                return Unit.f186387a;
        }
    }
}
