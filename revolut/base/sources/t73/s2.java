package t73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class s2 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h93.f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f268539x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.v = f0Var;
        this.f268538w = gVar;
        this.f268539x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s2(this.f268538w, this.v, this.f268539x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s2) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (nim.a.a(r2, r22) != r1) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            h93.f0 r3 = r0.v
            r4 = 2
            r5 = 1
            com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r6 = r0.f268538w
            if (r2 == 0) goto L24
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L16
            yhm.o.b(r23)
            goto L55
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            yhm.o.b(r23)
            r2 = r23
            goto L34
        L24:
            yhm.o.b(r23)
            boolean r2 = r3.W
            if (r2 == 0) goto L42
            r0.u = r5
            java.lang.Object r2 = com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.L2(r6, r3, r0)
            if (r2 != r1) goto L34
            goto L54
        L34:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L42
            com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.O2(r6)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L42:
            l93.f r2 = r6.B
            java.lang.String r3 = r3.f150110a
            ha3.x r2 = (ha3.x) r2
            pfm.h r2 = r2.m(r3)
            r0.u = r4
            java.lang.Object r2 = nim.a.a(r2, r0)
            if (r2 != r1) goto L55
        L54:
            return r1
        L55:
            r1 = 0
            java.lang.String r8 = r0.f268539x
            if (r8 == 0) goto L8f
            nii.y0 r2 = new nii.y0
            nii.j0 r3 = new nii.j0
            com.revolut.core.ui_kit.models.TextClause r7 = new com.revolut.core.ui_kit.models.TextClause
            r13 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r20 = 0
            r21 = 4094(0xffe, float:5.737E-42)
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r9 = r3
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3 = 0
            r4 = 5
            r2.<init>(r1, r9, r3, r4)
            kotlinx.coroutines.flow.Flow r7 = r6.X1(r2)
            r10 = 0
            r11 = 7
            r8 = 0
            r9 = 0
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            goto Lac
        L8f:
            rp0.g1 r2 = r6.z
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a r3 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.cards_core.R$string.card_terminate_confirm_terminate_success_toast
            r6 = 14
            r5.<init>(r4, r1, r1, r6)
            r8 = 0
            r9 = 60
            java.lang.String r4 = "TERMINATED_SHOT_ID"
            r6 = 0
            r7 = 0
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r1 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.Companion.f(r3, r4, r5, r6, r7, r8, r9)
            rp0.k1 r2 = (rp0.k1) r2
            r2.d(r1)
        Lac:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t73.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
