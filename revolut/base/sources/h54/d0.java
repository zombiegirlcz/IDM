package h54;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import grl.r2;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d B;
    public int C;
    public it3.d u;
    public r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.credit.application.plugins.impl.ui.application.d f149456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public yki.i f149457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public it3.d f149458y;
    public AnalyticsContext.Companion z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.e3(null, this);
    }
}
