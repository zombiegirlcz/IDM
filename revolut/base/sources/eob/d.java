package eob;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f127887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f127887w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f127887w.emit(null, this);
    }
}
