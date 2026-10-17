package rw4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f257823w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f257823w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f257823w.emit(null, this);
    }
}
