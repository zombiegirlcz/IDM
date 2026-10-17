package bnh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f17193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccount.Robo f17194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RoboPortfolioInfo f17195c;
    public final /* synthetic */ del.b d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vel.l f;

    public l(FlowCollector flowCollector, WealthAccount.Robo robo, RoboPortfolioInfo roboPortfolioInfo, del.b bVar, boolean z, vel.l lVar) {
        this.f17193a = flowCollector;
        this.f17194b = robo;
        this.f17195c = roboPortfolioInfo;
        this.d = bVar;
        this.e = z;
        this.f = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof bnh.k
            if (r0 == 0) goto L13
            r0 = r14
            bnh.k r0 = (bnh.k) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            bnh.k r0 = new bnh.k
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L59
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r14 = r13.f186385a
            vdh.b r14 = (vdh.b) r14
            java.lang.Object r13 = r13.f186386b
            r9 = r13
            java.util.List r9 = (java.util.List) r9
            bnh.q r4 = new bnh.q
            dj0.d r8 = r14.e
            boolean r10 = r12.e
            vel.l r11 = r12.f
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Robo r5 = r12.f17194b
            com.revolut.feature.wealth.models.robo.RoboPortfolioInfo r6 = r12.f17195c
            del.b r7 = r12.d
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r12.f17193a
            java.lang.Object r13 = r13.emit(r4, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bnh.l.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
