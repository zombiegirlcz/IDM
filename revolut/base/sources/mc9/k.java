package mc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public ESignatureProcess u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b f204320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f204321x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b bVar, gim.c cVar) {
        super(cVar);
        this.f204320w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f204321x |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.J2(this.f204320w, this);
    }
}
