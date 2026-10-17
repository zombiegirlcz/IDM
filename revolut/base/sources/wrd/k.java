package wrd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk2.g f299563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wk2.g gVar, Continuation continuation) {
        super(continuation);
        this.f299563w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299563w.emit(null, this);
    }
}
