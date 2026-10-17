package uqh;

import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreenContract$Input;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l0 l0Var = this.v.d;
        ip0.y yVar = (ip0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = yVar.f167226b.f58324n;
        if (Intrinsics.f(obj3, vph.e.f291211a)) {
            l0Var.f3();
        } else if (obj3 instanceof vph.f) {
            ScreenerSelectedFilter filter = ((vph.f) obj3).f291212a;
            Intrinsics.checkNotNullParameter(filter, "filter");
            vki.a aVar2 = l0Var.f282162r;
            t tVar = ((z) ((j2) aVar2.f22677a).getValue()).f282183a;
            if (tVar != null) {
                ScreenerSortingOptions screenerSortingOptions = ((z) ((j2) aVar2.f22677a).getValue()).e;
                l0Var.N2(new ScreenerFilterCalibratorScreen(new ScreenerFilterCalibratorScreenContract$Input(filter.getF105167a(), tVar.f282175a, tVar.f282176b, screenerSortingOptions != null ? screenerSortingOptions.f105173b : null, screenerSortingOptions != null ? screenerSortingOptions.f105174c : null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new f0(l0Var, 2));
            }
        }
        return Unit.f186387a;
    }
}
