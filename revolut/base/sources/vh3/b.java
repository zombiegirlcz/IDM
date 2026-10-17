package vh3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import h93.f0;
import yt8.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public f0 u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnalyticsProduct f289299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f289300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f289301y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f289301y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f289300x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f289301y.d(null, null, null, this);
    }
}
