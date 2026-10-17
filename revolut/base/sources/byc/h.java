package byc;

import bq5.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f19805w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, Continuation continuation) {
        super(continuation);
        this.f19805w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19805w.emit(null, this);
    }
}
