package nsl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f218911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f218911w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f218911w.emit(null, this);
    }
}
