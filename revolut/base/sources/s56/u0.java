package s56;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.remittances.impl.R$string;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$InputData;
import ip0.b9;
import ip0.s7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements cli.n {

    @NotNull
    public static final s0 Companion = new s0();
    public static final int d = R$attr.uikit_dp40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSendAmountScreenContract$InputData f259993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj5.a f259994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f259995c;

    public u0(DeFiSendAmountScreenContract$InputData inputData, uj5.a blockchainUiMapper, p56.a deFiSendCommonUiMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(deFiSendCommonUiMapper, "deFiSendCommonUiMapper");
        this.f259993a = inputData;
        this.f259994b = blockchainUiMapper;
        this.f259995c = deFiSendCommonUiMapper;
    }

    public static List a() {
        Boolean bool = Boolean.TRUE;
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("DeFiSendAmountScreen_CenteredAmount", null, new bw0.h("", null, null, true, null, bool, false, false, null, null, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28374), null, new bw0.m(null, bw0.l.LOADING, null, false, null, 24), null, b9.WRAP_CONTENT, null, null, null, null, null, null, 8106);
        int i = d;
        yp0.b.r(model, i, i, 0, 0, 12);
        s7 s7Var = new s7("DeFiSendAmountScreen_ChainCell", 0, 0, 0, 0, false, null, 126);
        yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
        return zhm.v.k(model, s7Var);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Boolean boolValueOf;
        boolean zJ;
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        DeFiBalance deFiBalance = domainState.f259975h;
        Data data = domainState.f;
        Data data2 = domainState.i;
        boolean z = false;
        if (deFiBalance == null || !ta6.a.E(deFiBalance)) {
            i56.e eVar = (i56.e) data2.getContent();
            DeFiAssetAmount deFiAssetAmount = eVar != null ? eVar.f158768b : null;
            DeFiBalance deFiBalance2 = domainState.f259975h;
            if (deFiAssetAmount == null || deFiBalance2 == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(deFiAssetAmount.a().compareTo(deFiBalance2.b()) > 0);
            }
            zJ = pd.b.j(boolValueOf);
        } else {
            zJ = domainState.d != null;
        }
        List list = (List) iii.c.f(data, new s4b.e(this, 20), new s20.c(21), new a4b.i(this, domainState, zJ, 16));
        CryptoAddress wallet = domainState.f259971a;
        boolean z3 = this.f259993a.f71823c;
        ko5.a aVarE = CryptoAddress.e(wallet, 0, 3);
        TextClause textClause = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = aVarE.f186224b;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Image imageN = p56.a.n(wallet, z3, 4);
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Image imageB = !z3 ? ((bp5.b) ((io5.b) this.f259995c.f233024b)).b(wallet) : null;
        v vVar = new v(textClause, textClause2, new AvatarModel.Default(imageN, null, null, null, imageB != null ? new AvatarModel.BadgeModel(new RawImageBadge(imageB), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG));
        boolean z4 = (data.getContent() == null || domainState.k == null || data2.getContent() == null) ? false : true;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_defi_send_amount_input_action_review_transfer, null, null, 14);
        if (z4 && !zJ) {
            z = true;
        }
        return new w(list, vVar, new u(textLocalisedClause, z));
    }
}
