package vvh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f292547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f292547w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f292547w.emit(null, this);
    }
}
