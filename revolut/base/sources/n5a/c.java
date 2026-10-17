package n5a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public a97.e u;
    public gz9.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f212553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f212554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f212555y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(continuation);
        this.f212554x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212553w = obj2;
        this.f212555y |= Integer.MIN_VALUE;
        return this.f212554x.e(null, this);
    }
}
