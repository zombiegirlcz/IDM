package mkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f206220w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f206220w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206220w.emit(null, this);
    }
}
