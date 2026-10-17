package nhe;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public sfe.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f215431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215432x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, Continuation continuation) {
        super(continuation);
        this.f215431w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f215432x |= Integer.MIN_VALUE;
        return this.f215431w.f3(null, this);
    }
}
