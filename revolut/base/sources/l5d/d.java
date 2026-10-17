package l5d;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f192235b;

    public /* synthetic */ d(FlowCollector flowCollector, int i) {
        this.f192234a = i;
        this.f192235b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lk6.v
            if (r0 == 0) goto L13
            r0 = r6
            lk6.v r0 = (lk6.v) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lk6.v r0 = new lk6.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment r5 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment) r5
            java.lang.String r5 = r5.e
            if (r5 == 0) goto L43
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f192235b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l5d.d.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r2v75, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5d.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ d(FlowCollector flowCollector, Object obj2, int i) {
        this.f192234a = i;
        this.f192235b = flowCollector;
    }
}
