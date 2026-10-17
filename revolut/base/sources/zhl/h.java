package zhl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ acb.h f322445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(acb.h hVar, Continuation continuation) {
        super(continuation);
        this.f322445w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f322445w.emit(null, this);
    }
}
