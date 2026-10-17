package tjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f271764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WealthAccount f271765c;

    public /* synthetic */ q(FlowCollector flowCollector, WealthAccount wealthAccount, int i) {
        this.f271763a = i;
        this.f271764b = flowCollector;
        this.f271765c = wealthAccount;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f271763a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof tjh.v
            if (r0 == 0) goto L18
            r0 = r6
            tjh.v r0 = (tjh.v) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            tjh.v r0 = new tjh.v
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            dih.a r6 = new dih.a
            com.revolut.feature.wealth.api.domain.model.WealthAccount r2 = r4.f271765c
            r6.<init>(r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f271764b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4d:
            return r1
        L4e:
            boolean r0 = r6 instanceof tjh.p
            if (r0 == 0) goto L61
            r0 = r6
            tjh.p r0 = (tjh.p) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L61
            int r1 = r1 - r2
            r0.v = r1
            goto L66
        L61:
            tjh.p r0 = new tjh.p
            r0.<init>(r4, r6)
        L66:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            yhm.o.b(r6)
            goto La7
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            yhm.o.b(r6)
            bih.h r5 = (bih.h) r5
            java.util.Map r5 = r5.f15496a
            com.revolut.feature.wealth.api.domain.model.WealthAccount r6 = r4.f271765c
            java.lang.String r6 = jjh.b.c(r6)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L97
            boolean r5 = r5.booleanValue()
            goto L98
        L97:
            r5 = 0
        L98:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f271764b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto La7
            goto La9
        La7:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tjh.q.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
