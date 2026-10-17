package dq5;

import dk9.g;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f116914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, Continuation continuation) {
        super(continuation);
        this.f116914w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f116914w.emit(null, this);
    }
}
