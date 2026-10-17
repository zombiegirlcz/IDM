package te8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f270074w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, Continuation continuation) {
        super(continuation);
        this.f270074w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f270074w.emit(null, this);
    }
}
