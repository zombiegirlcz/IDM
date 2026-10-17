package fy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import nx1.z;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public n02.b u;
    public ApmDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f138856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f138857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f138858y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, gim.c cVar) {
        super(cVar);
        this.f138858y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138857x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f138858y.c(null, null, this);
    }
}
