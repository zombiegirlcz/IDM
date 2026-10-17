package bnh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f17187w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f17187w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17187w.emit(null, this);
    }
}
