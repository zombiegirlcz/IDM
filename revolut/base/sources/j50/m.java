package j50;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.c {
    public UUID u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f171443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f171444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f171445y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f171444x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171443w = obj2;
        this.f171445y |= Integer.MIN_VALUE;
        return o.e3(this.f171444x, null, 0L, this);
    }
}
