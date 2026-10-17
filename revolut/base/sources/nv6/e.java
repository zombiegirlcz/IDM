package nv6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ntf.q f219514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ntf.q qVar, Continuation continuation) {
        super(continuation);
        this.f219514w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f219514w.emit(null, this);
    }
}
