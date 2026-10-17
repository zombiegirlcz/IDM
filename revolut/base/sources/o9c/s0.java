package o9c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f223237w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f223237w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223237w.emit(null, this);
    }
}
