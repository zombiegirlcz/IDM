package wf6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.c {
    public String u;
    public ExternalInstitution v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f297006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f297007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f297008y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f297007x = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f297006w = obj2;
        this.f297008y |= Integer.MIN_VALUE;
        return s.b(this.f297007x, null, null, this);
    }
}
