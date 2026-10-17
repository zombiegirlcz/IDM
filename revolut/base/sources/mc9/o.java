package mc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public ESignatureProcess u;
    public ESignatureDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b f204326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204327y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b bVar, gim.c cVar) {
        super(cVar);
        this.f204326x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204325w = obj2;
        this.f204327y |= Integer.MIN_VALUE;
        return this.f204326x.N2(null, this);
    }
}
