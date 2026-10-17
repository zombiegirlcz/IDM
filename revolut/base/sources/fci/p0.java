package fci;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PurposeOfAccountTilesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(PurposeOfAccountTilesScreen purposeOfAccountTilesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = purposeOfAccountTilesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p0 p0Var = new p0(this.v, continuation);
        p0Var.u = obj2;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((SmallCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallCardDelegate.Model model = (SmallCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        PurposeOfAccountTilesScreen.d3(this.v, model.f53364p);
        return Unit.f186387a;
    }
}
