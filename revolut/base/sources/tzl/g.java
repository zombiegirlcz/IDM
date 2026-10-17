package tzl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f275984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Continuation continuation) {
        super(continuation);
        this.f275984w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275985x |= Integer.MIN_VALUE;
        return l.a(this.f275984w, null, this);
    }
}
