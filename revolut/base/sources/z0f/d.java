package z0f;

import com.revolut.domain.models.topup.methods.TopUpMethodBanner$Type;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TopupMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopupMethodsScreen topupMethodsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = topupMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((TopUpMethodBanner$Type) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((TopUpMethodBanner$Type) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TopupMethodsScreen topupMethodsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) topupMethodsScreen.d();
                cli.y yVar = f0Var.A;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                TopupMethod topupMethod = ((q) j2Var.getValue()).f318277h;
                if (topupMethod == null && (topupMethod = ((q) j2Var2.getValue()).f318274b) == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Done button was clicked without selected method, selectedCurrency=" + ((q) j2Var2.getValue()).f318275c + ", hasSelected=" + (((q) j2Var2.getValue()).f318274b != null) + ", hasPreselected=" + (((q) j2Var2.getValue()).f318277h != null));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    f0Var.J2(topupMethod);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var2 = (f0) topupMethodsScreen.d();
                f0Var2.f318258x.l("SALARY_BANNER_AVAILABLE", false);
                cli.y yVar2 = f0Var2.A;
                f0Var2.H2(yVar2, new yy9.s(20));
                f0Var2.C2(new v(((q) ((j2) yVar2.f22677a).getValue()).f318275c));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var3 = (f0) topupMethodsScreen.d();
                f0Var3.f318258x.l("SALARY_BANNER_AVAILABLE", false);
                f0Var3.H2(f0Var3.A, new yy9.s(22));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                topupMethodsScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
