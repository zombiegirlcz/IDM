package lp4;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_removed.AdditionalCardholderRemovedScreen;
import ft3.a1;
import ft3.g;
import gim.i;
import grl.r2;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AdditionalCardholderRemovedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = additionalCardholderRemovedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((c) additionalCardholderRemovedScreen.R.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) ((c) additionalCardholderRemovedScreen.R.getValue());
                eVar.getClass();
                eVar.C1(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.HOME, null, null, null, null, 30), new g(null, null, 3), null, null, null, null, null, null, null, null, 2044)));
                break;
        }
        return Unit.f186387a;
    }
}
