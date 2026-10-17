package tzl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f275990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275991x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(continuation);
        this.f275990w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275991x |= Integer.MIN_VALUE;
        return this.f275990w.m(null, this);
    }
}
