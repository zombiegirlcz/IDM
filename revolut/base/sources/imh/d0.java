package imh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ img.c f162468w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(img.c cVar, Continuation continuation) {
        super(continuation);
        this.f162468w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162468w.emit(null, this);
    }
}
