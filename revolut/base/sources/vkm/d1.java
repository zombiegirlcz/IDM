package vkm;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes14.dex */
public final class d1 extends gim.c {
    public Ref$ObjectRef u;
    public y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f290013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f290014x;

    public d1(gim.c cVar) {
        super(cVar);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290013w = obj2;
        this.f290014x |= Integer.MIN_VALUE;
        return q.A(null, null, this);
    }
}
