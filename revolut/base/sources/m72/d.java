package m72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public MultibancoRegistrationStatus.Registered u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f203282y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.f203282y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203281x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203282y.a(null, this);
    }
}
