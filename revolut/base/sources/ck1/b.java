package ck1;

import yj1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public String u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f24739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24740y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f24739x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24738w = obj2;
        this.f24740y |= Integer.MIN_VALUE;
        return this.f24739x.a(null, null, this);
    }
}
