package fy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import nx1.z;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public int A;
    public n02.b u;
    public ApmDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f138859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f138860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f138861y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.z = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138861y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, null, null, this);
    }
}
