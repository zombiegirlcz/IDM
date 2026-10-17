package fy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public n02.b u;
    public ApmDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f138844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f138845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f138846y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f138846y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138845x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f138846y.b(null, null, null, this);
    }
}
