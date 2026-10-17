package ji5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f174369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f174369w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f174369w.emit(null, this);
    }
}
