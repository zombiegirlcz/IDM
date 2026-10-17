package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert;

import gim.i;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f86743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f86744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, BigDecimal bigDecimal, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f86743w = str;
        this.f86744x = bigDecimal;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f86743w, this.f86744x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d6, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d8, code lost:
    
        return r5;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
