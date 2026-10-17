package t38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public Object u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f267679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f267680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f267681y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, Continuation continuation) {
        super(continuation);
        this.f267681y = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f267680x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f267681y.b3(null, this);
    }
}
