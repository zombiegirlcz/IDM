package c52;

import com.revolut.feature.apm.core.models.recipients.ApmContact;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.c {
    public ApmContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21391x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f21390w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21391x |= Integer.MIN_VALUE;
        return this.f21390w.n3(null, null, this);
    }
}
