package nol;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function2 {
    public com.revolut.sso.impl.ui.phone.change_flow.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218097x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.sso.impl.ui.phone.change_flow.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f218097x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.f218097x, continuation);
        sVar.f218096w = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (com.revolut.sso.impl.ui.phone.change_flow.b.K2(r0, r2, r6) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f218096w
            nii.n1 r0 = (nii.n1) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L55
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            com.revolut.sso.impl.ui.phone.change_flow.b r0 = r6.u
            yhm.o.b(r7)
            goto L3b
        L23:
            yhm.o.b(r7)
            boolean r7 = r0 instanceof nii.l1
            if (r7 == 0) goto L55
            com.revolut.sso.impl.ui.phone.change_flow.b r0 = r6.f218097x
            rqk.m r7 = r0.f106659w
            r6.f218096w = r5
            r6.u = r0
            r6.v = r4
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r1) goto L3b
            goto L54
        L3b:
            com.revolut.sso.api.models.UserInfoFromApp r7 = (com.revolut.sso.api.models.UserInfoFromApp) r7
            java.lang.String r7 = r7.f105998c
            if (r7 == 0) goto L47
            com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$FullNumber r2 = new com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$FullNumber
            r2.<init>(r7)
            goto L48
        L47:
            r2 = r5
        L48:
            r6.f218096w = r5
            r6.u = r5
            r6.v = r3
            java.lang.Object r7 = com.revolut.sso.impl.ui.phone.change_flow.b.K2(r0, r2, r6)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nol.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
