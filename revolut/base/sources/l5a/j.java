package l5a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentsIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PaymentsIntroScreen paymentsIntroScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentsIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen r5 = r4.v
            l5a.o r5 = r5.R2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e r5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) r5
            r5.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52373a
            int r1 = r0.hashCode()
            r2 = -404547953(0xffffffffe7e3168f, float:-2.1447866E24)
            r3 = 0
            if (r1 == r2) goto L60
            r2 = 249399844(0xedd8a24, float:5.461373E-30)
            if (r1 == r2) goto L4d
            r2 = 1130256051(0x435e56b3, float:222.33867)
            if (r1 == r2) goto L33
            goto L68
        L33:
            java.lang.String r1 = "CONTACTS_PERMANENTLY_DENIED_ITEM_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3c
            goto L68
        L3c:
            com.revolut.kompot.common.ExternalDestination$ByIntent r0 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            s70.a r1 = r5.B
            s70.b r1 = (s70.b) r1
            android.content.Intent r1 = r1.b()
            r0.<init>(r1, r3)
            r5.C1(r0)
            goto L91
        L4d:
            java.lang.String r1 = "CONTACTS_ALLOWED_ITEM_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L56
            goto L68
        L56:
            b5a.b r0 = r5.F
            com.revolut.kompot.common.ParcelableDestination r0 = r0.a()
            r5.C1(r0)
            goto L91
        L60:
            java.lang.String r1 = "CONTACTS_DENIED_ITEM_ID"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7d
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown list id: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r5, r0)
            goto L91
        L7d:
            pn3.a r0 = r5.C
            l5a.q r1 = new l5a.q
            r2 = 1
            r1.<init>(r5, r2)
            kw4.b r2 = new kw4.b
            r3 = 17
            r2.<init>(r3)
            pn3.b r0 = (pn3.b) r0
            r0.d(r5, r1, r2)
        L91:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l5a.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
