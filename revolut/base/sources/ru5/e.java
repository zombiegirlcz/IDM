package ru5;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ActivityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ActivityScreen activityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = activityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SwipeToActionDelegate.SwipeAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$SwipeAction r0 = (com.revolut.core.ui_kit.delegates.SwipeToActionDelegate.SwipeAction) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen r5 = r4.v
            ru5.k r5 = r5.T2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            ru5.z r5 = (ru5.z) r5
            r5.getClass()
            java.lang.String r1 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r1 = r0.f
            java.lang.String r0 = r0.f53505a
            boolean r2 = r1 instanceof com.revolut.feature.exchange.models.ExchangeOrder
            r3 = 0
            if (r2 == 0) goto L3f
            com.revolut.feature.exchange.models.ExchangeOrder r1 = (com.revolut.feature.exchange.models.ExchangeOrder) r1
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "ORDERS_MAPPER_SWIPE_ACTION_ID_CANCEL"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L4a
            pt5.n r0 = new pt5.n
            r0.<init>(r1)
            goto L4b
        L3f:
            boolean r2 = r1 instanceof qua.p
            if (r2 == 0) goto L4a
            qua.p r1 = (qua.p) r1
            pt5.q r0 = czi.c.r(r1, r0)
            goto L4b
        L4a:
            r0 = r3
        L4b:
            ru5.x r1 = new ru5.x
            r1.<init>(r5, r0, r3)
            whi.b r0 = new whi.b
            r2 = 6
            r0.<init>(r2)
            r5.n2(r1, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
