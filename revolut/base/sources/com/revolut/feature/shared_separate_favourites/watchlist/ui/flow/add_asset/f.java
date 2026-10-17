package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function1 {
    public ArrayList u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f86952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f86953x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(1, continuation);
        this.f86953x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f86953x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x018e, code lost:
    
        if (r4 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0191, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01aa, code lost:
    
        if (r7.a(r8, r4, r14) == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ac, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0223  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
