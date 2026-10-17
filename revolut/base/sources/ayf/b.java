package ayf;

import ahe.f0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f11153w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f11153w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11153w.emit(null, this);
    }
}
