package ww3;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public h1 u;
    public pu3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f300592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f300593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f300594y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f300593x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f300592w = obj2;
        this.f300594y |= Integer.MIN_VALUE;
        return this.f300593x.a(null, null, this);
    }
}
