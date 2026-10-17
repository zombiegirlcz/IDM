package iuj;

import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tx0.z0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RewardsHubHomeScreen f168635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(RewardsHubHomeScreen rewardsHubHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f168635w = rewardsHubHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f168635w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f168635w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            default:
                k kVar3 = new k(this.f168635w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((z0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d0j.b bVar;
        String str;
        int i = this.u;
        RewardsHubHomeScreen rewardsHubHomeScreen = this.f168635w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = rewardsHubHomeScreen.R2();
                Intrinsics.h(itemId);
                a0 a0Var = (a0) vVarE3;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "CHALLENGE_HISTORY_MENU_ITEM_ID")) {
                    a0Var.C2(new s(d0j.m.PAST));
                }
                break;
            case 1:
                z0 page = (z0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE32 = rewardsHubHomeScreen.R2();
                Intrinsics.h(page);
                a0 a0Var2 = (a0) vVarE32;
                a0Var2.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                Integer numM = kotlin.text.z.m(page.f275286a);
                if (numM != null) {
                    int iIntValue = numM.intValue();
                    d0j.f fVar = (d0j.f) ((o) ((j2) a0Var2.f168628t.f22677a).getValue()).f168636a.getContent();
                    if (fVar != null && (bVar = (d0j.b) d0.e0(iIntValue, fVar.f110391a)) != null && (str = bVar.f110375c.f110372b) != null) {
                        a0Var2.l2(new ikf.g(a0Var2, str, null, 19), new yi5.b(26));
                    }
                }
                break;
            default:
                u8 model = (u8) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE33 = rewardsHubHomeScreen.R2();
                Intrinsics.h(model);
                a0 a0Var3 = (a0) vVarE33;
                a0Var3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f54816p;
                if (obj3 instanceof d) {
                    a0Var3.l2(new ikf.g(a0Var3, obj3, null, 20), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
