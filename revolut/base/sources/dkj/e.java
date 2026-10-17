package dkj;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanFeaturedNumberSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.u.R2();
        y yVar = lVarE3.f115579r;
        if (!((g) ((j2) yVar.f22677a).getValue()).f115571c) {
            lVarE3.H2(yVar, new dg3.d(21));
        }
        lVarE3.J2();
        return Unit.f186387a;
    }
}
