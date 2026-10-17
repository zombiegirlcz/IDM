package yrb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ymk.x f316222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ymk.x xVar, Continuation continuation) {
        super(continuation);
        this.f316222w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316222w.emit(null, this);
    }
}
