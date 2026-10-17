package wdb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f296532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f296532w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f296532w.emit(null, this);
    }
}
