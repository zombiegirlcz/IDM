package uve;

import dj0.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f283357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f283358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f283359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f283358x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f283357w = obj2;
        this.f283359y |= Integer.MIN_VALUE;
        return this.f283358x.a(null, this, null);
    }
}
