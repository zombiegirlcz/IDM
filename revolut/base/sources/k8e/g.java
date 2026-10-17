package k8e;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends i implements Function1 {
    public com.revolut.feature.subaccount.impl.ui.invite.flow.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.invite.flow.b f182137w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.subaccount.impl.ui.invite.flow.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f182137w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f182137w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 0
            com.revolut.feature.subaccount.impl.ui.invite.flow.b r3 = r10.f182137w
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            com.revolut.feature.subaccount.impl.ui.invite.flow.b r3 = r10.u
            yhm.o.b(r11)
            goto L58
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            yhm.o.b(r11)
            goto L35
        L21:
            yhm.o.b(r11)
            k8e.f r11 = new k8e.f
            r1 = 0
            r11.<init>(r3, r2, r1)
            r10.v = r5
            l89.e r1 = l89.e.f192813a
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r0) goto L35
            goto L57
        L35:
            pcd.s r11 = (pcd.s) r11
            zfe.e r1 = r3.f89091r
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r7 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            com.revolut.feature.tab.accounts.models.ProductAccountId r8 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r11 = r11.f234881a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$Group r9 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.Group.INSTANCE
            r8.<init>(r11, r9)
            r6.<init>(r8, r7)
            r10.u = r3
            r10.v = r4
            cge.e r1 = (cge.e) r1
            java.lang.Object r11 = r1.b(r6, r5, r2, r10)
            if (r11 != r0) goto L58
        L57:
            return r0
        L58:
            aii.u r11 = (aii.u) r11
            aii.n r11 = r3.C1(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k8e.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
