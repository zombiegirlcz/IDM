package xge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f305726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f305726w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f305726w.emit(null, this);
    }
}
