package p2j;

import do3.n;
import j1j.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public int A;
    public d u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f232259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f232260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f232261y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f232261y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, this);
    }
}
