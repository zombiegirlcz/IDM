package tjh;

import aqd.o1;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f271722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271722w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f271722w, continuation, 0);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.f271722w, continuation, 1);
                c0Var2.v = obj2;
                return c0Var2;
            default:
                c0 c0Var3 = new c0(this.f271722w, continuation, 2);
                c0Var3.v = obj2;
                return c0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h0 h0Var = this.f271722w;
        switch (i) {
            case 0:
                Map map = (Map) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o1 o1Var = new o1(map, 20);
                h hVar = h0.Companion;
                h0Var.d3(o1Var);
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s78.n nVar = new s78.n(list, 12);
                h hVar2 = h0.Companion;
                h0Var.d3(nVar);
                break;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(popupMenuItem);
                h hVar3 = h0.Companion;
                Object f = popupMenuItem.getF55862c();
                if (f instanceof bih.e) {
                    h0Var.V2(new tgk.f(h0Var, (bih.e) f, null, 8), new yi5.b(29));
                } else if (f instanceof bih.f) {
                    h0Var.V2(new tgk.f(h0Var, (bih.f) f, null, 9), new yi5.b(29));
                } else if (f instanceof bih.d) {
                    h0Var.V2(new tgk.f(h0Var, (bih.d) f, null, 10), new yi5.b(29));
                }
                break;
        }
        return Unit.f186387a;
    }
}
