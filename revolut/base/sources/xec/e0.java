package xec;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.J2(r0, r3, r8) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (kotlin.Unit.f186387a == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b r0 = r8.v
            cli.y r1 = r0.f84758s
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L19
            if (r3 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            yhm.o.b(r9)
            goto L88
        L1d:
            yhm.o.b(r9)
            java.lang.Object r9 = r1.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            xec.e r9 = (xec.e) r9
            com.revolut.data.model.Data r9 = r9.f304580a
            java.lang.Object r9 = r9.getContent()
            if (r9 == 0) goto L99
            nec.c r9 = (nec.c) r9
            java.util.List r9 = r9.f214428a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L3c:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r9.next()
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r3 = (com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact) r3
            java.lang.String r6 = r3.f84740a
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            xec.e r7 = (xec.e) r7
            java.lang.String r7 = r7.f304581b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L3c
            java.lang.Object r9 = r1.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            xec.e r9 = (xec.e) r9
            com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData$ModeConfiguration r9 = r9.d
            boolean r1 = r9 instanceof com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor.InputData.ModeConfiguration.UpdatedDefaultContact
            if (r1 == 0) goto L75
            r8.u = r5
            java.lang.Object r9 = com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.J2(r0, r3, r8)
            if (r9 != r2) goto L88
            goto L87
        L75:
            boolean r9 = r9 instanceof com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor.InputData.ModeConfiguration.SelectContact
            if (r9 == 0) goto L8b
            r8.u = r4
            oec.c r9 = new oec.c
            r9.<init>(r3)
            r0.C2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            if (r9 != r2) goto L88
        L87:
            return r2
        L88:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8b:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L91:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r9.<init>(r0)
            throw r9
        L99:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xec.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
