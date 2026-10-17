package d3i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f111169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111170x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Continuation continuation) {
        super(continuation);
        this.f111169w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111170x |= Integer.MIN_VALUE;
        return this.f111169w.e(null, this);
    }
}
