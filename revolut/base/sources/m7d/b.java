package m7d;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public String u;
    public aj0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f203390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k18.c f203392y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k18.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f203392y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203391x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203392y.p(null, this);
    }
}
