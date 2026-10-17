package qcc;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.promoted_merchants.impl.R$string;
import ip0.zj;
import java.util.List;
import jk4.q;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncc.d f244711a;

    public o(ncc.d revolutPayPromotedMerchantItemMapper) {
        Intrinsics.checkNotNullParameter(revolutPayPromotedMerchantItemMapper, "revolutPayPromotedMerchantItemMapper");
        this.f244711a = revolutPayPromotedMerchantItemMapper;
    }

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("PROMOTED_MERCHANTS_ERROR_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_promoted_merchants_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1860);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_promoted_merchants_search_placeholder, null, null, 14);
        int i = R$attr.uikit_dp8;
        SearchButtonDelegate.Model model = new SearchButtonDelegate.Model("ID_SEARCH_BUTTON", textLocalisedClause, null, i, i, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
        Pair pair = (Pair) iii.c.f(domainState.f244690a, new qc7.c(this, 3), new qc8.a(this, 2), new qbg.j(this, domainState, 2));
        List list = (List) pair.f186385a;
        List list2 = (List) iii.c.g((lk0.g) domainState.f244691b.get(domainState.f244692c), new qc7.c(4), new q(((Boolean) pair.f186386b).booleanValue(), this), new z(this, domainState, 4));
        aim.e eVarB = u.b();
        eVarB.add(model);
        eVarB.addAll(list);
        eVarB.addAll(list2);
        return new h(u.a(eVarB), new TextLocalisedClause(R$string.revolut_pay_promoted_merchants_title, null, null, 14));
    }
}
