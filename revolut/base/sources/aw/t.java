package aw;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f10209w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f10209w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f10209w.emit(null, this);
    }
}
