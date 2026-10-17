package io.ktor.utils.io;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f163050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f163051x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f163052y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, gim.c cVar) {
        super(cVar);
        this.f163052y = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f163051x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f163052y.d(0, this);
    }
}
