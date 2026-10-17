package akf;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public ApmRecipient u;
    public hrf.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f5846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5847y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f5846x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5845w = obj2;
        this.f5847y |= Integer.MIN_VALUE;
        return this.f5846x.e3(null, null, this);
    }
}
