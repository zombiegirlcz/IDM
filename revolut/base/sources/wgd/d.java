package wgd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wa3.h f297309w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wa3.h hVar, Continuation continuation) {
        super(continuation);
        this.f297309w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f297309w.emit(null, this);
    }
}
