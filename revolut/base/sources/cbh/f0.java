package cbh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a26.s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22813w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a26.s sVar, Continuation continuation) {
        super(continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22813w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
