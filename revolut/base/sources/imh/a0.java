package imh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ img.c f162454w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(img.c cVar, Continuation continuation) {
        super(continuation);
        this.f162454w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162454w.emit(null, this);
    }
}
