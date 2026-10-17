package tuj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f274614w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f274614w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f274614w.emit(null, this);
    }
}
