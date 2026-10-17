package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import com.revolut.domain.models.openbanking.OpenBankingConsent;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ boolean A;
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f72753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ OpenBankingConsentsFlowContract$FlowType f72754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f72755y;
    public final /* synthetic */ OpenBankingConsent z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineScope coroutineScope, OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType, c cVar, OpenBankingConsent openBankingConsent, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f72753w = coroutineScope;
        this.f72754x = openBankingConsentsFlowContract$FlowType;
        this.f72755y = cVar;
        this.z = openBankingConsent;
        this.A = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f72753w, this.f72754x, this.f72755y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (nim.a.a(r14, r13) == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        if (r14 == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.consents_kompot.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
