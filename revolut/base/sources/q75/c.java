package q75;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.g f242741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ly4.g gVar, Continuation continuation) {
        super(continuation);
        this.f242741w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f242741w.emit(null, this);
    }
}
