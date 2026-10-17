package bse;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddMoneyMethodSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddMoneyMethodSelectionController addMoneyMethodSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = addMoneyMethodSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionController r7 = r6.v
            java.lang.Object r7 = r7.M
            java.lang.Object r7 = r7.getValue()
            bse.f r7 = (bse.f) r7
            kotlin.jvm.internal.Intrinsics.h(r0)
            bse.e r7 = (bse.e) r7
            r7.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Object r0 = r0.u
            boolean r1 = r0 instanceof j1j.d
            r2 = 0
            if (r1 == 0) goto L7f
            cli.y r1 = r7.f18180q
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            bse.g r1 = (bse.g) r1
            com.revolut.data.model.Data r1 = r1.f18181a
            java.lang.Object r1 = r1.getContent()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L8b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod.MoveMoney
            if (r5 == 0) goto L48
            r3.add(r4)
            goto L48
        L5a:
            java.util.Iterator r1 = r3.iterator()
        L5e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod$MoveMoney r4 = (com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod.MoveMoney) r4
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r4 = r4.f65825a
            java.lang.String r4 = r4.f99404a
            r5 = r0
            j1j.d r5 = (j1j.d) r5
            java.lang.String r5 = r5.f170617a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L5e
            goto L7c
        L7b:
            r3 = r2
        L7c:
            com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod$MoveMoney r3 = (com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod.MoveMoney) r3
            goto L8c
        L7f:
            boolean r1 = r0 instanceof com.revolut.domain.models.topup.methods.TopupMethod
            if (r1 == 0) goto L8b
            com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod$TopUp r3 = new com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod$TopUp
            com.revolut.domain.models.topup.methods.TopupMethod r0 = (com.revolut.domain.models.topup.methods.TopupMethod) r0
            r3.<init>(r0)
            goto L8c
        L8b:
            r3 = r2
        L8c:
            if (r3 == 0) goto L97
            bse.h r0 = new bse.h
            r0.<init>(r3)
            r7.C2(r0)
            goto La7
        L97:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Parcel must be either balance or top-up method"
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r2, r2, r7, r0)
        La7:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bse.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
