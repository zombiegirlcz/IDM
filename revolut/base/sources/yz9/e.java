package yz9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f318056w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f318056w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f318056w.emit(null, this);
    }
}
