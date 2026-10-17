package com.revolut.feature.security_hub.impl.ui.security_hub;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f85641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f85642x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RowDelegate.Model model, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f85641w = model;
        this.f85642x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f85641w, this.f85642x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r10 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (r10 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r10 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        return r2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.security_hub.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
