package b58;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function1 {
    public n38.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f12456x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, d0 d0Var, Continuation continuation) {
        super(1, continuation);
        this.f12455w = dVar;
        this.f12456x = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f12455w, this.f12456x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r2 != r1) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            com.revolut.feature.joint.impl.ui.invite_flow.d r7 = r0.f12455w
            if (r2 == 0) goto L2e
            if (r2 == r6) goto L28
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1a
            yhm.o.b(r22)
            r2 = r22
            goto L74
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            n38.a r2 = r0.u
            yhm.o.b(r22)
            goto L56
        L28:
            yhm.o.b(r22)
            r2 = r22
            goto L3e
        L2e:
            yhm.o.b(r22)
            g48.r0 r2 = r7.f76577q
            r0.v = r6
            n38.d0 r8 = r0.f12456x
            java.lang.Object r2 = r2.b(r8, r0)
            if (r2 != r1) goto L3e
            goto L73
        L3e:
            n38.a r2 = (n38.a) r2
            if (r2 != 0) goto L45
            java.lang.String r1 = "just_created_joint_account_id"
            goto L83
        L45:
            wsg.n r8 = r7.f76578r
            efm.b r6 = r8.l0(r6)
            r0.u = r2
            r0.v = r5
            java.lang.Object r5 = nim.a.a(r6, r0)
            if (r5 != r1) goto L56
            goto L73
        L56:
            wsg.n r8 = r7.f76578r
            io3.l r9 = io3.l.CURRENT
            io3.k r10 = io3.k.ACTIVE
            com.revolut.core.model.account.AccountId$Joint r14 = l38.a.c(r2)
            r15 = 28
            r11 = 0
            r12 = 0
            r13 = 0
            efm.d0 r2 = osg.b.j(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.u = r3
            r0.v = r4
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = zhm.d0.b0(r2)
            io3.d r1 = (io3.d) r1
            java.lang.String r1 = r1.f163145a
        L83:
            nii.y0 r2 = new nii.y0
            nii.j0 r8 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.joint.impl.R$string.joint_confirm_number_dialog_incoming_success_title
            r5 = 14
            r9.<init>(r4, r3, r3, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.joint.impl.R$string.joint_confirm_number_dialog_incoming_success_description
            r10.<init>(r4, r3, r3, r5)
            r19 = 0
            r20 = 4092(0xffc, float:5.734E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 0
            r5 = 4
            java.lang.String r6 = "SUCCESS_ACCEPT_INCOMING_DIALOG_ID"
            r2.<init>(r6, r8, r4, r5)
            kotlinx.coroutines.flow.Flow r8 = r7.X1(r2)
            b58.r r11 = new b58.r
            r11.<init>(r1, r7, r3)
            r12 = 3
            r9 = 0
            r10 = 0
            yji.l.a1(r7, r8, r9, r10, r11, r12)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b58.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
