package ru5;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ActivityScreen f257412w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ActivityScreen activityScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f257412w = activityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f257412w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f257412w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f257412w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f257412w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ActivityScreen activityScreen = this.f257412w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarI3 = activityScreen.T2();
                Intrinsics.h(itemId);
                z zVar = (z) kVarI3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("NEW_ORDER_ITEM_ID")) {
                    zVar.l2(new y(zVar, null), new yi5.b(26));
                }
                break;
            case 1:
                String tabId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarI32 = activityScreen.T2();
                Intrinsics.h(tabId);
                z zVar2 = (z) kVarI32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                zVar2.x2(new n0(tabId, 26));
                break;
            case 2:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarI33 = activityScreen.T2();
                Intrinsics.h(query);
                z zVar3 = (z) kVarI33;
                zVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                zVar3.x2(new n0(query, 25));
                zVar3.z2();
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarI34 = activityScreen.T2();
                String selectedId = g6Var.f54199a;
                z zVar4 = (z) kVarI34;
                zVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                zVar4.x2(new n0(selectedId, 24));
                break;
        }
        return Unit.f186387a;
    }
}
