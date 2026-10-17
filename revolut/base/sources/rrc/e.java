package rrc;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public final /* synthetic */ q A;
    public int B;
    public xi0.b u;
    public tji.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zxd.c f256761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f256762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f256763y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, gim.c cVar) {
        super(cVar);
        this.A = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, null, false, this);
    }
}
