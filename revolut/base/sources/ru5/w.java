package ru5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f257436w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(RowDelegate.Model model, z zVar, Continuation continuation) {
        super(2, continuation);
        this.v = model;
        this.f257436w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, this.f257436w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r10 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0180, code lost:
    
        if (r10 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0182, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru5.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
