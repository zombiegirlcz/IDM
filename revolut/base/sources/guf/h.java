package guf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f146910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f146910w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f146910w.emit(null, this);
    }
}
