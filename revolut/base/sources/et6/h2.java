package et6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6j.y f129240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(d6j.y yVar, Continuation continuation) {
        super(continuation);
        this.f129240w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f129240w.emit(null, this);
    }
}
