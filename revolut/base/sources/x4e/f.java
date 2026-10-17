package x4e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wv2.l f302867w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wv2.l lVar, Continuation continuation) {
        super(continuation);
        this.f302867w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f302867w.emit(null, this);
    }
}
