package q64;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.g f242479w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ly4.g gVar, Continuation continuation) {
        super(continuation);
        this.f242479w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f242479w.emit(null, this);
    }
}
