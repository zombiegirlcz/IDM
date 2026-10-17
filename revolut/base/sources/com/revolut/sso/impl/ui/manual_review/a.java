package com.revolut.sso.impl.ui.manual_review;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b A;
    public b u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f106579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f106580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f106581y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.A = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fd, code lost:
    
        if (r4 != r1) goto L9;
     */
    /* JADX WARN: Path cross not found for [B:107:0x02a2, B:105:0x029e], limit reached: 122 */
    /* JADX WARN: Path cross not found for [B:65:0x01a7, B:50:0x0148], limit reached: 122 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01fd -> B:9:0x0029). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.manual_review.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
