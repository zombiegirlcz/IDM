package b7f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f13033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f13033w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f13033w.emit(null, this);
    }
}
