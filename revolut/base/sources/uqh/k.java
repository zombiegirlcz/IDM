package uqh;

import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreenContract$Input;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            case 1:
                return new k(this.v, continuation, 1);
            case 2:
                return new k(this.v, continuation, 2);
            default:
                return new k(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.d.v.setValue(null);
                oVar.f282168c.f282169a.i0();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.d.f3();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.d.f3();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0 l0Var = oVar.d;
                ScreenerSortingOptions screenerSortingOptions = ((z) ((j2) l0Var.f282162r.f22677a).getValue()).e;
                if (screenerSortingOptions != null) {
                    l0Var.N2(new ScreenerSortingPickerScreen(new ScreenerSortingPickerScreenContract$Input(screenerSortingOptions)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new f0(l0Var, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
