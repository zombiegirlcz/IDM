package cke;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c65.h f24819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c65.h hVar, Continuation continuation) {
        super(continuation);
        this.f24819w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24819w.emit(null, this);
    }
}
