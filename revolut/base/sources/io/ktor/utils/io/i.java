package io.ktor.utils.io;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends gim.c {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f163053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f163054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f163055y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.f163054x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f163053w = obj2;
        this.f163055y |= Integer.MIN_VALUE;
        return this.f163054x.h(this);
    }
}
