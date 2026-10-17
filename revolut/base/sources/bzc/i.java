package bzc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.status.StatusController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StatusController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StatusController statusController, Continuation continuation) {
        super(2, continuation);
        this.v = statusController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            java.lang.Object r7 = r0.u
            boolean r0 = r7 instanceof hyc.d
            r1 = 0
            if (r0 == 0) goto L13
            hyc.d r7 = (hyc.d) r7
            goto L14
        L13:
            r7 = r1
        L14:
            if (r7 == 0) goto La5
            tof.a3 r7 = r7.f156779a
            if (r7 == 0) goto La5
            java.lang.String r7 = r7.f272581b
            if (r7 != 0) goto L20
            goto La5
        L20:
            com.revolut.feature.selfserve.sot.impl.ui.status.StatusController r0 = r6.v
            java.lang.Object r0 = r0.Q
            java.lang.Object r0 = r0.getValue()
            bzc.s r0 = (bzc.s) r0
            r0.getClass()
            java.lang.String r2 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            cli.y r2 = r0.f19977s
            java.lang.Object r3 = r2.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            bzc.j r3 = (bzc.j) r3
            com.revolut.data.model.Data r3 = r3.f19957a
            java.lang.Object r3 = r3.getContent()
            com.revolut.feature.selfserve.sot.api.models.SubmissionState r3 = (com.revolut.feature.selfserve.sot.api.models.SubmissionState) r3
            if (r3 == 0) goto L6a
            java.util.ArrayList r3 = r3.f85893c
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence r5 = (com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence) r5
            com.revolut.feature.selfserve.sot.api.models.OriginRef r5 = r5.d
            java.lang.String r5 = r5.f85876a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            if (r5 == 0) goto L4e
            goto L67
        L66:
            r4 = r1
        L67:
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence r4 = (com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence) r4
            goto L6b
        L6a:
            r4 = r1
        L6b:
            if (r4 == 0) goto L73
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidenceReviewState r3 = r4.f
            if (r3 == 0) goto L73
            hyc.c r1 = r3.f85887b
        L73:
            hyc.c r3 = hyc.c.APPROVED
            if (r1 != r3) goto L78
            goto La2
        L78:
            java.lang.Object r1 = r2.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            bzc.j r1 = (bzc.j) r1
            com.revolut.data.model.Data r1 = r1.f19958b
            java.lang.Object r1 = r1.getContent()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L98
            xyc.a r2 = r0.f19975q
            r2.getClass()
            xyc.e r1 = xyc.a.a(r1)
            if (r1 == 0) goto L98
            goto L9a
        L98:
            xyc.e r1 = xyc.e.USER_ACTION_REQUIRED
        L9a:
            bzc.n r2 = new bzc.n
            r2.<init>(r7, r4, r1)
            r0.C2(r2)
        La2:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La5:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bzc.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
