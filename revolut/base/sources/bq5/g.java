package bq5;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jp5.a f17710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj5.a f17711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo5.a f17712c;

    static {
        c0[] elements = {c0.NAME, c0.SURNAME, c0.COMPANY_NAME, c0.BUSINESS_REGISTRATION_NUMBER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public g(jp5.a allowedCryptoAddressCharactersInputFilter, ik5.d addressTypeUiMapper, uj5.a blockchainUiMapper, mo5.a cryptoWithdrawAddressTagClauseProvider) {
        Intrinsics.checkNotNullParameter(allowedCryptoAddressCharactersInputFilter, "allowedCryptoAddressCharactersInputFilter");
        Intrinsics.checkNotNullParameter(addressTypeUiMapper, "addressTypeUiMapper");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(cryptoWithdrawAddressTagClauseProvider, "cryptoWithdrawAddressTagClauseProvider");
        this.f17710a = allowedCryptoAddressCharactersInputFilter;
        this.f17711b = blockchainUiMapper;
        this.f17712c = cryptoWithdrawAddressTagClauseProvider;
    }

    public static boolean a(Set set) {
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            if (d.contains((c0) it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(b0 b0Var, c0 c0Var, Set set) {
        return b0Var.a(c0Var) && !set.contains(c0Var);
    }

    public final CompositeClause c(wk5.a aVar) {
        Float fValueOf = Float.valueOf(12.0f);
        if (aVar != null) {
            return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_check, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_address_type_hint, zhm.u.c(ik5.d.a(wk5.m.a(aVar))), null, 12), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ADDRESS_TYPE_LEARN_MORE_ID", false), 10)));
        }
        return null;
    }
}
