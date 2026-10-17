package ho6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.countries.CrossBorderCountryDepartmentsScreen;
import ho6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CrossBorderCountryDepartmentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = crossBorderCountryDepartmentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "ERROR_STATE_ID");
        CrossBorderCountryDepartmentsScreen crossBorderCountryDepartmentsScreen = this.v;
        if (zF) {
            p pVar = (p) crossBorderCountryDepartmentsScreen.d();
            yji.l.a1(pVar, pVar.I2(), null, null, new o(pVar, null, 1), 3);
        } else {
            ((p) crossBorderCountryDepartmentsScreen.d()).C2(j.a.f154232a);
        }
        return Unit.f186387a;
    }
}
