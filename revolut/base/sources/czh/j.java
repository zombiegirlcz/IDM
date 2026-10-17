package czh;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public List u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f110251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f110252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f110253y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f110253y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f110252x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f110253y.e(null, null, false, this);
    }
}
