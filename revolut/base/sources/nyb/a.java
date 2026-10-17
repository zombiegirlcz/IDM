package nyb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nvk.v f220769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nvk.v vVar, Continuation continuation) {
        super(continuation);
        this.f220769w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f220769w.emit(null, this);
    }
}
