package yse;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f316451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, Continuation continuation) {
        super(continuation);
        this.f316451w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316451w.emit(null, this);
    }
}
