package tyj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f275668w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f275668w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f275668w.emit(null, this);
    }
}
