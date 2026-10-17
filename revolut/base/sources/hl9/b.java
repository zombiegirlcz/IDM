package hl9;

import il9.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public l u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f153412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ fn2.c f153413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f153414y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fn2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f153413x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f153412w = obj2;
        this.f153414y |= Integer.MIN_VALUE;
        return this.f153413x.t(null, this);
    }
}
