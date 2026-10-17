package pj7;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ CFACInsuranceBottomSheetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cFACInsuranceBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) this.u.d();
        oVar.H2(oVar.f236689p, new nxc.a(oVar.o.f75061a, 2));
        return Unit.f186387a;
    }
}
