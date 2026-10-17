package oob;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f227023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227024x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f227023w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227024x |= Integer.MIN_VALUE;
        return this.f227023w.Z2(null, null, this);
    }
}
