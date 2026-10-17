package c30;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public MutableStateFlow u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f20844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f20844w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f20845x |= Integer.MIN_VALUE;
        return this.f20844w.d(null, null, this);
    }
}
