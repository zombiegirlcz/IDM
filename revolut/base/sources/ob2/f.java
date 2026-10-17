package ob2;

import kotlin.coroutines.Continuation;
import o42.j;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f223864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Continuation continuation) {
        super(continuation);
        this.f223864w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223864w.emit(null, this);
    }
}
