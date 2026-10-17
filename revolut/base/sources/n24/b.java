package n24;

import kotlin.coroutines.Continuation;
import lmg.k;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f211443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, Continuation continuation) {
        super(continuation);
        this.f211443w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211443w.emit(null, this);
    }
}
