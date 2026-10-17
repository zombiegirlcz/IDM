package zfb;

import do3.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f321914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f321915x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f321914w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f321915x |= Integer.MIN_VALUE;
        return this.f321914w.a(this);
    }
}
