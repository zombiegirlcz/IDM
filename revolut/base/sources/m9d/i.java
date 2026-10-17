package m9d;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.feature.shared.help_centre.impl.main.screen.SharedHelpRev10Screen;
import com.revolut.kompot.common.ExternalDestination;
import ip0.x10;
import ip0.xc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedHelpRev10Screen f203709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(SharedHelpRev10Screen sharedHelpRev10Screen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203709w = sharedHelpRev10Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f203709w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f203709w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f203709w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f203709w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f203709w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i(this.f203709w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            default:
                i iVar7 = new i(this.f203709w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((xc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        SharedHelpRev10Screen sharedHelpRev10Screen = this.f203709w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH3 = sharedHelpRev10Screen.T2();
                String url2 = aVar.f275445a;
                g1 g1Var = (g1) d0VarH3;
                g1Var.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                if (!kotlin.text.d0.W(url2)) {
                    g1Var.C1(new ExternalDestination.Browser(url2, null));
                }
                break;
            case 1:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH32 = sharedHelpRev10Screen.T2();
                Intrinsics.h(clickData);
                g1 g1Var2 = (g1) d0VarH32;
                g1Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                s7d.e eVar = g1Var2.f203699q;
                ActionWidgetDelegate.Model model = clickData.f54722b;
                Object obj3 = model.f51596l;
                String str = model.f51590a;
                eVar.getClass();
                if ((obj3 instanceof r40.l) || (obj3 instanceof r40.k)) {
                    g1Var2.l2(new x0(g1Var2, clickData, null), new yi5.b(26));
                } else if (Intrinsics.f(str, "INBOX_BANNER_ITEM_ID") && (clickData.f54721a instanceof ActionWidgetDelegate.a.C0395a)) {
                    g1Var2.l2(new y0(g1Var2, continuation, 0), new yi5.b(26));
                } else {
                    g1Var2.C2(model.f51596l, str);
                    Unit unit = Unit.f186387a;
                }
                break;
            case 2:
                koi.j item = (koi.j) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH33 = sharedHelpRev10Screen.T2();
                Intrinsics.h(item);
                g1 g1Var3 = (g1) d0VarH33;
                g1Var3.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                g1Var3.H.b3(item.getF52781a());
                break;
            case 3:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH34 = sharedHelpRev10Screen.T2();
                g1 g1Var4 = (g1) d0VarH34;
                g1Var4.C2(aVar5.d, aVar5.f275445a);
                break;
            case 4:
                xc xcVar = (xc) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH35 = sharedHelpRev10Screen.T2();
                g1 g1Var5 = (g1) d0VarH35;
                g1Var5.C2(xcVar.f, xcVar.f167122a);
                break;
            case 5:
                String itemId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH36 = sharedHelpRev10Screen.T2();
                Intrinsics.h(itemId);
                g1 g1Var6 = (g1) d0VarH36;
                g1Var6.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("PAST_REQUESTS_ITEM_ID")) {
                    g1Var6.n2(new e1(g1Var6, null), new whi.b(6));
                }
                break;
            default:
                x10 x10Var = (x10) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0VarH37 = sharedHelpRev10Screen.T2();
                sa saVar = x10Var.f167081a;
                g1 g1Var7 = (g1) d0VarH37;
                g1Var7.C2(saVar.i, saVar.f54700a);
                break;
        }
        return Unit.f186387a;
    }
}
