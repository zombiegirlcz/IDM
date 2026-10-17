package qj9;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_later.impl.ui.help.a f246796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.pay_later.impl.ui.help.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f246796w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f246796w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 2
            r3 = 1
            r4 = 0
            com.revolut.feature.pay_later.impl.ui.help.a r5 = r8.f246796w
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            wi0.b r0 = r8.u
            yhm.o.b(r9)
            goto L74
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L40
        L21:
            yhm.o.b(r9)
            ang.f r9 = r5.f78880p
            w4l.j r1 = w4l.j.f294644c
            akg.n r9 = r9.j(r1)
            qc8.a r1 = new qc8.a
            r6 = 28
            r1.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r4, r1, r3)
            r8.v = r3
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r0) goto L40
            goto L71
        L40:
            do3.n r9 = (do3.n) r9
            wi0.b r9 = do3.q.y(r9)
            xh9.a r1 = r5.o
            ti9.g r1 = (ti9.g) r1
            r1.getClass()
            java.lang.String r6 = "loadingStrategy"
            w4l.h r7 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            ci9.b r1 = r1.f271456a
            ej9.e0 r1 = (ej9.e0) r1
            akg.n r1 = r1.a(r7)
            qc8.a r6 = new qc8.a
            r7 = 29
            r6.<init>(r7)
            jhi.b r1 = mo3.a.g(r1, r4, r6, r3)
            r8.u = r9
            r8.v = r2
            java.lang.Object r1 = vkm.q.x(r1, r8)
            if (r1 != r0) goto L72
        L71:
            return r0
        L72:
            r0 = r9
            r9 = r1
        L74:
            zh9.i r9 = (zh9.i) r9
            ux4.i r1 = ux4.m.Companion
            r1.getClass()
            ux4.m r1 = new ux4.m
            ux4.k r2 = new ux4.k
            ux4.j r3 = ux4.j.PAY_LATER
            java.lang.String r6 = "help-request.id.pay-later"
            r2.<init>(r6, r3)
            ux4.l r6 = ux4.l.FAQ_AND_FINANCIAL_DIFFICULTIES
            java.lang.String r7 = "topic.pay-later"
            r1.<init>(r2, r6, r7)
            zh9.h r2 = r9.f
            if (r2 == 0) goto L93
            java.lang.String r4 = r2.f322267a
        L93:
            gte.a r2 = r5.f78879n
            com.revolut.feature.pay_later.api.PayLaterApi$Toggles$PayLaterCancellation14Days r6 = com.revolut.feature.pay_later.api.PayLaterApi$Toggles.PayLaterCancellation14Days.f78804c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r6)
            if (r2 == 0) goto Lbc
            boolean r9 = r9.f322284h
            if (r9 == 0) goto Lbc
            if (r4 == 0) goto Lbc
            ux4.k r9 = new ux4.k
            r9.<init>(r4, r3)
            com.revolut.feature.pay_later.impl.ui.help.PayLaterGetHelpDialogFactory r1 = r5.f78878m
            com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController r9 = r1.a(r9, r7, r0)
            qgf.o r0 = new qgf.o
            r1 = 6
            r0.<init>(r5, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r5.N2(r9, r1, r0)
            goto Lc1
        Lbc:
            f15.a r9 = r5.f78877l
            r9.O(r1)
        Lc1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qj9.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
