package wyg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wv2.l f301298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wv2.l lVar, Continuation continuation) {
        super(continuation);
        this.f301298w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f301298w.emit(null, this);
    }
}
