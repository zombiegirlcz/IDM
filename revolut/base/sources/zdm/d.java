package zdm;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class d extends gim.c {
    public CoroutineContext u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f321607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f321608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.engine.okhttp.a f321609y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.ktor.client.engine.okhttp.a aVar, gim.c cVar) {
        super(cVar);
        this.f321609y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f321608x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f321609y.g(null, null, null, null, this);
    }
}
