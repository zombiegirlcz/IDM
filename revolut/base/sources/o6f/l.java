package o6f;

import com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f222587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioReferenceData f222588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f222589c;

    public l(boolean z, ManagedPortfolioReferenceData managedPortfolioReferenceData, m mVar) {
        this.f222587a = z;
        this.f222588b = managedPortfolioReferenceData;
        this.f222589c = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a update = (a) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        boolean z = !this.f222587a;
        ManagedPortfolioReferenceData managedPortfolioReferenceData = this.f222588b;
        return a.a(update, null, null, null, managedPortfolioReferenceData != null && managedPortfolioReferenceData.getF91242a() && this.f222589c.f222590m.f91309c, z, 15);
    }
}
