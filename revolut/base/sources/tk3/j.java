package tk3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f271872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, Continuation continuation) {
        super(continuation);
        this.f271872w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271872w.emit(null, this);
    }
}
