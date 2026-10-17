package clm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends gim.c {
    public q u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f25084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25085y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(continuation);
        this.f25084x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25083w = obj2;
        this.f25085y |= Integer.MIN_VALUE;
        return this.f25084x.send(null, this);
    }
}
