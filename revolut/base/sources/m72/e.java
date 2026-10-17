package m72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public MultibancoRegistrationStatus.Registered u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f203285y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f203285y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203284x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203285y.b(null, false, 0, this);
    }
}
