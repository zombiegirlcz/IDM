package com.revolut.feature.rev_points.impl.ui.earn;

import gim.i;
import hzb.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public s u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f83797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RevPointsEarnScreenContract$PendingAction f83798x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, RevPointsEarnScreenContract$PendingAction revPointsEarnScreenContract$PendingAction, Continuation continuation) {
        super(2, continuation);
        this.f83797w = bVar;
        this.f83798x = revPointsEarnScreenContract$PendingAction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f83797w, this.f83798x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r1 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.earn.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
