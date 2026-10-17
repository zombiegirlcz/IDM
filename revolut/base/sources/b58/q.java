package b58;

import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ InvitationType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InvitationType invitationType, com.revolut.feature.joint.impl.ui.invite_flow.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = invitationType;
        this.f12471w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f12471w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r6)
            goto L44
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            yhm.o.b(r6)
            goto L34
        L1c:
            yhm.o.b(r6)
            com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType r6 = r5.v
            boolean r1 = r6 instanceof com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.IncomingInvitation
            com.revolut.feature.joint.impl.ui.invite_flow.d r4 = r5.f12471w
            if (r1 == 0) goto L37
            com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType$IncomingInvitation r6 = (com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.IncomingInvitation) r6
            n38.d0 r6 = r6.f76584a
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.joint.impl.ui.invite_flow.d.J2(r4, r6, r5)
            if (r6 != r0) goto L34
            goto L43
        L34:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r6
            return r6
        L37:
            boolean r6 = r6 instanceof com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.OutgoingInvitation
            if (r6 == 0) goto L47
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.joint.impl.ui.invite_flow.d.K2(r4, r5)
            if (r6 != r0) goto L44
        L43:
            return r0
        L44:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r6
            return r6
        L47:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b58.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
