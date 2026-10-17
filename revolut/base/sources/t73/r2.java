package t73;

import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class r2 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f268531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f268532x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f268531w = str;
        this.f268532x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r2 r2Var = new r2(this.v, this.f268531w, this.f268532x, continuation);
        r2Var.u = obj2;
        return r2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r2) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nii.n1 n1Var = (nii.n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = n1Var instanceof nii.l1;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.v;
        if (z) {
            gVar.C1(zh9.u0.b(new FeatureCommand(new CardsFeatureConfig.ShowCardPinWithCta(28, null, this.f268531w, this.f268532x))));
        } else {
            if (!(n1Var instanceof nii.j1) && !(n1Var instanceof nii.k1) && !(n1Var instanceof nii.m1)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar.s1();
        }
        return Unit.f186387a;
    }
}
