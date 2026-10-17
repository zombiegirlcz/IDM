package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom;

import epd.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.j3;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public b u;
    public j3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f87649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f87650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f87651y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f87650x = bVar;
        this.f87651y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f87650x, this.f87651y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r15 == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r15 == r10) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
