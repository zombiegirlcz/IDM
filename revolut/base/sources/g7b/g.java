package g7b;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f141149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f141149w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141149w.emit(null, this);
    }
}
