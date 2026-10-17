package m1a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public i u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f201305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f201306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f201307y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f201307y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f201306x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f201307y.b(null, this);
    }
}
