package gmh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g9d.e f144857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g9d.e eVar, Continuation continuation) {
        super(continuation);
        this.f144857w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144857w.emit(null, this);
    }
}
