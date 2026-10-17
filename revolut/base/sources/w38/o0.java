package w38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f294200w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f294200w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294200w.emit(null, this);
    }
}
