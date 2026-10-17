package kc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public ESignatureProcess u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f182679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182680x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f182679w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182680x |= Integer.MIN_VALUE;
        return this.f182679w.K2(null, this);
    }
}
