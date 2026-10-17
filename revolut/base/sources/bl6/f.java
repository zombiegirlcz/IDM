package bl6;

import au0.j4;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NavBarWithToolbar v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(NavBarWithToolbar navBarWithToolbar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = navBarWithToolbar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            case 3:
                return new f(this.v, continuation, 3);
            case 4:
                return new f(this.v, continuation, 4);
            case 5:
                return new f(this.v, continuation, 5);
            case 6:
                return new f(this.v, continuation, 6);
            case 7:
                return new f(this.v, continuation, 7);
            default:
                return new f(this.v, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NavBarWithToolbar navBarWithToolbar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                navBarWithToolbar.i0();
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                kli.c.c(navBarWithToolbar, true);
                break;
        }
        return Unit.f186387a;
    }
}
