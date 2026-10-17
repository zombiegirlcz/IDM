package c55;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements m35.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.k f21449a;

    public j0(m35.k loanSharedItemsFactory) {
        Intrinsics.checkNotNullParameter(loanSharedItemsFactory, "loanSharedItemsFactory");
        this.f21449a = loanSharedItemsFactory;
    }

    public static LargeActionButtonDelegate.Model a(boolean z) {
        if (z) {
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_GO_TO_PAYMENT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_account_action_pay_off, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            return model;
        }
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return model2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m35.o b(q35.t r53, boolean r54) {
        /*
            Method dump skipped, instruction units count: 2147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c55.j0.b(q35.t, boolean):m35.o");
    }
}
