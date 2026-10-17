package dmj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dk9.g f116162w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dk9.g gVar, Continuation continuation) {
        super(continuation);
        this.f116162w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f116162w.emit(null, this);
    }
}
