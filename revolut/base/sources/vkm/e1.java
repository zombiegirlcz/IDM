package vkm;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes14.dex */
public final class e1 extends gim.c {
    public Ref$ObjectRef u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290017w;

    public e1(gim.c cVar) {
        super(cVar);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290017w |= Integer.MIN_VALUE;
        return q.E(null, this);
    }
}
