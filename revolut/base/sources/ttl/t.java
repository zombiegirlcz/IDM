package ttl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f274469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f274469w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f274469w.emit(null, this);
    }
}
