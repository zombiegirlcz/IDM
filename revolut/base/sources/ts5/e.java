package ts5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f273965w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f273965w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f273965w.emit(null, this);
    }
}
