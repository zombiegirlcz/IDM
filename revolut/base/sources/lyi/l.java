package lyi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.d f200839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ly4.d dVar, Continuation continuation) {
        super(continuation);
        this.f200839w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200839w.emit(null, this);
    }
}
