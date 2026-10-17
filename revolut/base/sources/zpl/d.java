package zpl;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PublicKey f324321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f324322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f324323y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324323y = obj2;
        this.A |= Integer.MIN_VALUE;
        return g.Z2(this.z, null, null, null, null, this);
    }
}
