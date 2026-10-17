package gm7;

import skm.a2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public a2 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f144785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f144786x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f144785w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f144786x |= Integer.MIN_VALUE;
        return d.Z2(this.f144785w, null, this);
    }
}
