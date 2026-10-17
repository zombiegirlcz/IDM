package wt7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk2.g f299826w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wk2.g gVar, Continuation continuation) {
        super(continuation);
        this.f299826w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299826w.emit(null, this);
    }
}
