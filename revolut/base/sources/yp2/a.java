package yp2;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f315762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x xVar, Continuation continuation) {
        super(continuation);
        this.f315762w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315762w.emit(null, this);
    }
}
