package dy5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f121057w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f121057w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121057w.emit(null, this);
    }
}
