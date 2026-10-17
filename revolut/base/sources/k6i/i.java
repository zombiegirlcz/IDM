package k6i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jsl.k f181739w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(jsl.k kVar, Continuation continuation) {
        super(continuation);
        this.f181739w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f181739w.emit(null, this);
    }
}
