package ztc;

import qtc.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f325093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f325094x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f325093w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f325094x |= Integer.MIN_VALUE;
        return this.f325093w.g(null, this);
    }
}
