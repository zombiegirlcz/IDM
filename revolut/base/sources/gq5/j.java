package gq5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f145577w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f145577w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f145577w.emit(null, this);
    }
}
