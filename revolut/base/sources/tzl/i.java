package tzl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f275988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275989x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Continuation continuation) {
        super(continuation);
        this.f275988w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275989x |= Integer.MIN_VALUE;
        return this.f275988w.l(null, this);
    }
}
