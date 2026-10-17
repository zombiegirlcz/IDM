package tfb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te8.j f270285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(te8.j jVar, Continuation continuation) {
        super(continuation);
        this.f270285w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f270285w.emit(null, this);
    }
}
