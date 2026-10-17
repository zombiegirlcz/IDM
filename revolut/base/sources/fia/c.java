package fia;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f135359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135360x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(continuation);
        this.f135359w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135360x |= Integer.MIN_VALUE;
        return this.f135359w.c3(null, this);
    }
}
