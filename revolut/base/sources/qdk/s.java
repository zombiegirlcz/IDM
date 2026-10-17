package qdk;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MonthlyDrawHubScreen f244984w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(MonthlyDrawHubScreen monthlyDrawHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244984w = monthlyDrawHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f244984w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f244984w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f244984w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            default:
                s sVar4 = new s(this.f244984w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        xck.h hVar;
        int i = this.u;
        MonthlyDrawHubScreen monthlyDrawHubScreen = this.f244984w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0 q0VarE3 = monthlyDrawHubScreen.d();
                Intrinsics.h(itemId);
                w0 w0Var = (w0) q0VarE3;
                w0Var.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                xck.m mVar = (xck.m) ((x) ((j2) w0Var.f244990r.f22677a).getValue()).f244992b.getContent();
                if (mVar != null) {
                    if (itemId.equals("MONTHLY_DRAW_HUB_LIST_ID_TOOLBAR_EARNED_REWARDS")) {
                        str = mVar.f304174l;
                    } else if (itemId.equals("MONTHLY_DRAW_HUB_LIST_ID_TOOLBAR_STORIES")) {
                        str = mVar.k;
                    }
                    if (str != null) {
                        w0Var.C2(new e0(str));
                    }
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0 q0VarE32 = monthlyDrawHubScreen.d();
                Intrinsics.h(clickData);
                w0 w0Var2 = (w0) q0VarE32;
                w0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str2 = clickData.f275445a;
                if (Intrinsics.f(str2, "revolut://app/monthly-draws/opt-out")) {
                    xck.m mVar2 = (xck.m) ((x) ((j2) w0Var2.f244990r.f22677a).getValue()).f244992b.getContent();
                    w0Var2.C2(new g0(mVar2 != null ? mVar2.f304175m : null));
                } else {
                    w0Var2.C2(new e0(str2));
                }
                break;
            case 2:
                n6 model = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0 q0VarE33 = monthlyDrawHubScreen.d();
                Intrinsics.h(model);
                w0 w0Var3 = (w0) q0VarE33;
                w0Var3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                if (obj3 instanceof l0) {
                    w0Var3.C2(new e0(((l0) obj3).f244972a));
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.t clickData2 = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0 q0VarE34 = monthlyDrawHubScreen.d();
                Intrinsics.h(clickData2);
                w0 w0Var4 = (w0) q0VarE34;
                w0Var4.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.f54722b.f51596l;
                m0 m0Var = obj4 instanceof m0 ? (m0) obj4 : null;
                if (m0Var != null && (hVar = m0Var.f244974a) != null) {
                    ActionWidgetDelegate.a aVar5 = clickData2.f54721a;
                    if (Intrinsics.f(aVar5, ActionWidgetDelegate.a.b.f51608a)) {
                        w0Var4.C2(new d0(hVar.f));
                    } else if (Intrinsics.f(aVar5, ActionWidgetDelegate.a.d.f51610a)) {
                        w0Var4.C2(new e0(hVar.e));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
