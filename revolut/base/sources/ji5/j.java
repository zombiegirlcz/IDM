package ji5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f174365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f174365w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f174365w.emit(null, this);
    }
}
