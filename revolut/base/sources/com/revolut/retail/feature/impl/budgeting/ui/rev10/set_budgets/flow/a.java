package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f101541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f101542x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f101541w = bVar;
        this.f101542x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f101541w, this.f101542x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x030d, code lost:
    
        if (r1 != r8) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f3 A[PHI: r5
      0x02f3: PHI (r5v34 java.util.List) = (r5v33 java.util.List), (r5v0 java.util.List) binds: [B:144:0x02f0, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
