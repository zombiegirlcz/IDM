package aue;

import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static a a(TopUpLimitUiModel uiModel) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        return new a(uiModel.f90554a, uiModel.f90555b, uiModel.f90556c, uiModel.d, uiModel.e);
    }

    public static TopUpLimitUiModel b(b domainModel) {
        Intrinsics.checkNotNullParameter(domainModel, "domainModel");
        if (!(domainModel instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar = (a) domainModel;
        return new TopUpLimitUiModel(aVar.f9803a, aVar.f9804b, aVar.f9805c, aVar.d, aVar.e);
    }
}
