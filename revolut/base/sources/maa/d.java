package maa;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.d f203974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ly4.d dVar, Continuation continuation) {
        super(continuation);
        this.f203974w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f203974w.emit(null, this);
    }
}
