package dhk;

import com.revolut.feature.pricingplans.models.SubscriptionPreviewId;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public SubscriptionPreviewId u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f114833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f114833x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114832w = obj2;
        this.f114834y |= Integer.MIN_VALUE;
        return this.f114833x.a(null, this);
    }
}
