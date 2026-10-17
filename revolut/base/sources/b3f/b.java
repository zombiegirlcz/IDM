package b3f;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureDescriptor;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    static AddMoneyFeatureDescriptor a(m4f.b bVar, TransferSubjectId transferSubjectId, WealthAccountType product) {
        j0h.a aVar;
        a depositType = a.ANY;
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(depositType, "depositType");
        int i = m4f.a.f202728a[depositType.ordinal()];
        if (i == 1) {
            aVar = j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = j0h.a.REQUIRE_RECURRING_DEPOSIT;
        }
        return new AddMoneyFeatureDescriptor(new AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType(1, 0L, transferSubjectId, product, aVar), ModalTransitionAnimation.Style.POPUP.f98391a);
    }

    static FeatureCommand b(b bVar, TransferSubjectId transferSubjectId, WealthAccountType product, a depositType, Long l2, int i) {
        j0h.a aVar;
        if ((i & 4) != 0) {
            depositType = a.ANY;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        ((m4f.b) bVar).getClass();
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(depositType, "depositType");
        int i2 = m4f.a.f202728a[depositType.ordinal()];
        if (i2 == 1) {
            aVar = j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = j0h.a.REQUIRE_RECURRING_DEPOSIT;
        }
        return new FeatureCommand(new AddMoneyFeatureConfig.CompositeAddMoney(1, l2 != null ? l2.longValue() : 0L, transferSubjectId, product, aVar));
    }
}
