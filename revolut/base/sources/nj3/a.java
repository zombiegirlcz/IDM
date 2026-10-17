package nj3;

import gim.c;
import skm.g0;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public g0 u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f216349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f216350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f216351y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f216351y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f216350x = obj2;
        this.z |= Integer.MIN_VALUE;
        Object objB = this.f216351y.b(null, null, null, this);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : new m(objB);
    }
}
