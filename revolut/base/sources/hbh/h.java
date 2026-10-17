package hbh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ayf.g f150734w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ayf.g gVar, Continuation continuation) {
        super(continuation);
        this.f150734w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f150734w.emit(null, this);
    }
}
