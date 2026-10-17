package x0f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wv2.l f301601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wv2.l lVar, Continuation continuation) {
        super(continuation);
        this.f301601w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f301601w.emit(null, this);
    }
}
