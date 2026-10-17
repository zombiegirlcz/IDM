package o9k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f223321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f223321w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223321w.emit(null, this);
    }
}
