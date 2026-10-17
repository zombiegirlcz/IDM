package uve;

import dj0.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f283360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f283361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f283362y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f283362y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f283361x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f283362y.b(null, this, null);
    }
}
