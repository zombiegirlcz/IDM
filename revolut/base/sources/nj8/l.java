package nj8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public String u;
    public ij8.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f216403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f216404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f216405y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(continuation);
        this.f216404x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f216403w = obj2;
        this.f216405y |= Integer.MIN_VALUE;
        return this.f216404x.o(null, null, this);
    }
}
