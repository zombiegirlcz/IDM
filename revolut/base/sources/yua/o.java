package yua;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements oim.q {
    public final /* synthetic */ q A;
    public /* synthetic */ yoj.f u;
    public /* synthetic */ od0.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ od0.i f316957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f316958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f316959y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(7, continuation);
        this.A = qVar;
    }

    @Override // oim.q
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
        o oVar = new o(this.A, (Continuation) obj8);
        oVar.u = (yoj.f) obj2;
        oVar.v = (od0.i) obj3;
        oVar.f316957w = (od0.i) obj4;
        oVar.f316958x = zBooleanValue;
        oVar.f316959y = zBooleanValue2;
        oVar.z = zBooleanValue3;
        return oVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yoj.f r0 = r10.u
            od0.i r1 = r10.v
            od0.i r2 = r10.f316957w
            boolean r3 = r10.f316958x
            boolean r8 = r10.f316959y
            boolean r7 = r10.z
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r11)
            aim.e r11 = zhm.u.b()
            java.lang.Object r2 = r2.f224257a
            java.util.List r2 = (java.util.List) r2
            java.lang.String r4 = "id"
            if (r2 == 0) goto L4b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r2, r6)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r2.next()
            psg.a r6 = (psg.a) r6
            java.lang.String r6 = r6.f239484a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            com.revolut.feature.core.model.domain.wallet.WalletId r9 = new com.revolut.feature.core.model.domain.wallet.WalletId
            r9.<init>(r6)
            r5.add(r9)
            goto L2e
        L48:
            r11.addAll(r5)
        L4b:
            java.lang.Object r1 = r1.f224257a
            n38.a r1 = (n38.a) r1
            if (r1 == 0) goto L5e
            java.lang.String r1 = r1.f211924b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            com.revolut.feature.core.model.domain.wallet.WalletId r2 = new com.revolut.feature.core.model.domain.wallet.WalletId
            r2.<init>(r1)
            r11.add(r2)
        L5e:
            aim.e r9 = zhm.u.a(r11)
            hbd.a r4 = new hbd.a
            kotlin.jvm.internal.Intrinsics.h(r0)
            yoj.c r11 = yoj.c.RECURRING_PAYMENTS_CARD_MANDATES
            boolean r5 = hx7.l.q(r0, r11)
            if (r3 == 0) goto L80
            yua.q r11 = r10.A
            gte.a r11 = r11.f316965c
            com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditScheduledPayment r0 = com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditScheduledPayment.f68691c
            jte.d r11 = (jte.d) r11
            boolean r11 = r11.c(r0)
            if (r11 == 0) goto L80
            r11 = 1
        L7e:
            r6 = r11
            goto L82
        L80:
            r11 = 0
            goto L7e
        L82:
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yua.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
