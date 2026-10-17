package g8i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f141364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f141364w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141364w.emit(null, this);
    }
}
