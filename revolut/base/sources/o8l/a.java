package o8l;

import j8l.d;
import j8l.h;
import j8l.k;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c B;
    public int C;
    public k u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f223040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f223041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f223042y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
