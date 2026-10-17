package ywb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f317408w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f317408w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f317408w.emit(null, this);
    }
}
