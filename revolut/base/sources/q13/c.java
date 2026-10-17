package q13;

import kotlin.coroutines.Continuation;
import pvk.k;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f241338w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Continuation continuation) {
        super(continuation);
        this.f241338w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f241338w.emit(null, this);
    }
}
