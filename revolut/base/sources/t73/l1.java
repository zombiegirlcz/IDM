package t73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268490c;

    public /* synthetic */ l1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, int i) {
        this.f268488a = i;
        this.f268489b = gVar;
        this.f268490c = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f268488a) {
            case 0:
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268489b;
                gVar.l2(new r1(gVar, this.f268490c, null, 17), new yi5.b(26));
                break;
            default:
                String str = this.f268490c.f150110a;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268489b;
                gVar2.l2(new sma.f(8, gVar2, new j1(gVar2, 2), str, (Continuation) null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
