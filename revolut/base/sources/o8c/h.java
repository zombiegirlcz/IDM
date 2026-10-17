package o8c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o42.j f223008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o42.j jVar, Continuation continuation) {
        super(continuation);
        this.f223008w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223008w.emit(null, this);
    }
}
