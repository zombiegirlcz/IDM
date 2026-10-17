package pnh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ orb.f f237767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(orb.f fVar, Continuation continuation) {
        super(continuation);
        this.f237767w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237767w.emit(null, this);
    }
}
