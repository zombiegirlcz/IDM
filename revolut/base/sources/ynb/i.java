package ynb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f315403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Continuation continuation) {
        super(continuation);
        this.f315403w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315404x |= Integer.MIN_VALUE;
        return this.f315403w.g3(null, this);
    }
}
