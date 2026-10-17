package wl8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f298457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f298457w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f298457w.emit(null, this);
    }
}
