package htf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferReasonsScreen transferReasonsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen r8 = r7.v
            htf.o r8 = r8.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            r1 = r8
            htf.r r1 = (htf.r) r1
            r1.getClass()
            java.lang.String r8 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
            java.lang.String r8 = r0.f53228a
            r2 = 0
            java.lang.String r3 = "OTHER_CATEGORY_ID_"
            boolean r8 = kotlin.text.a0.H(r8, r3, r2)
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r0.u
            boolean r0 = r8 instanceof com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory
            r2 = 0
            if (r0 == 0) goto L32
            com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory r8 = (com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory) r8
            goto L33
        L32:
            r8 = r2
        L33:
            if (r8 != 0) goto L36
            goto L7c
        L36:
            cli.y r0 = r1.u
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            htf.g r0 = (htf.g) r0
            java.util.Set r3 = r0.e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L74
            com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory r0 = r0.d
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.f92435a
            goto L52
        L51:
            r0 = r2
        L52:
            java.lang.String r3 = r8.f92435a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r0 == 0) goto L5b
            goto L74
        L5b:
            isf.d r0 = r1.f155382r
            nii.y0 r0 = isf.d.a(r0)
            kotlinx.coroutines.flow.Flow r0 = r1.X1(r0)
            f23.y r5 = new f23.y
            r3 = 22
            r5.<init>(r1, r8, r2, r3)
            r6 = 3
            r3 = 0
            r4 = 0
            r2 = r0
            yji.l.a1(r1, r2, r3, r4, r5, r6)
            goto L7c
        L74:
            htf.k r0 = new htf.k
            r0.<init>(r8)
            r1.C2(r0)
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: htf.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
