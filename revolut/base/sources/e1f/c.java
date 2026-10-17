package e1f;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final AccountId a(TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(topUpTarget, "<this>");
        if (topUpTarget instanceof TopUpTarget.Joint) {
            return ((TopUpTarget.Joint) topUpTarget).f90572a;
        }
        if ((topUpTarget instanceof TopUpTarget.RevXFiat) || (topUpTarget instanceof TopUpTarget.Savings) || (topUpTarget instanceof TopUpTarget.Pro) || (topUpTarget instanceof TopUpTarget.Invest) || (topUpTarget instanceof TopUpTarget.Main)) {
            return AccountId.Personal.f51414a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final l b(TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(topUpTarget, "<this>");
        if (topUpTarget instanceof TopUpTarget.Pro) {
            return l.MERCHANT;
        }
        if ((topUpTarget instanceof TopUpTarget.Joint) || (topUpTarget instanceof TopUpTarget.Savings) || (topUpTarget instanceof TopUpTarget.Invest) || (topUpTarget instanceof TopUpTarget.Main)) {
            return l.CURRENT;
        }
        if (topUpTarget instanceof TopUpTarget.RevXFiat) {
            return l.REVX_FIAT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ProductId c(TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(topUpTarget, "<this>");
        if (topUpTarget instanceof TopUpTarget.Joint) {
            return ProductId.JOINT;
        }
        if (Intrinsics.f(topUpTarget, TopUpTarget.RevXFiat.f90575a) || Intrinsics.f(topUpTarget, TopUpTarget.Main.f90573a)) {
            return ProductId.CURRENCY;
        }
        if (Intrinsics.f(topUpTarget, TopUpTarget.Pro.f90574a)) {
            return ProductId.PRO;
        }
        if (topUpTarget instanceof TopUpTarget.Savings) {
            return ProductId.SAVINGS;
        }
        if (topUpTarget instanceof TopUpTarget.Invest) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TopUpContext d(TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(topUpTarget, "<this>");
        if (topUpTarget instanceof TopUpTarget.Joint) {
            return new TopUpContext.Joint(((TopUpTarget.Joint) topUpTarget).f90572a.f51413b);
        }
        if (topUpTarget instanceof TopUpTarget.Savings) {
            return new TopUpContext.Savings(((TopUpTarget.Savings) topUpTarget).f90576a);
        }
        if (topUpTarget instanceof TopUpTarget.Invest) {
            return new TopUpContext.Invest(((TopUpTarget.Invest) topUpTarget).f90571a);
        }
        if ((topUpTarget instanceof TopUpTarget.Pro) || (topUpTarget instanceof TopUpTarget.Main)) {
            return TopUpContext.Other.f60429a;
        }
        if (topUpTarget instanceof TopUpTarget.RevXFiat) {
            return TopUpContext.RevX.f60430a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
