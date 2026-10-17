package oc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public ESignatureDetails u;
    public com.revolut.feature.onboarding.impl.qes_terms.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.i f224147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f224148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes_terms.h f224149y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.onboarding.impl.qes_terms.h hVar, gim.c cVar) {
        super(cVar);
        this.f224149y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f224148x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f224149y.N2(null, this);
    }
}
