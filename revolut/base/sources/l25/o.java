package l25;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.c {
    public sfe.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191641x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, Continuation continuation) {
        super(continuation);
        this.f191640w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f191641x |= Integer.MIN_VALUE;
        return this.f191640w.i3(null, this);
    }
}
