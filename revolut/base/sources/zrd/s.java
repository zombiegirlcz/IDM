package zrd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zj6.d f324704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zj6.d dVar, Continuation continuation) {
        super(continuation);
        this.f324704w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f324704w.emit(null, this);
    }
}
