package lhh;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import ghh.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lfg.z;
import m1h.q;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f195257a;

    public e(f addMoneyPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(addMoneyPortfolioInfoProvider, "addMoneyPortfolioInfoProvider");
        this.f195257a = addMoneyPortfolioInfoProvider;
    }

    @Override // m1h.q
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(this.f195257a.e(transferSubjectId), new z(16));
    }
}
