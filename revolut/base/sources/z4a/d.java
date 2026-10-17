package z4a;

import ang.f;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import h3a.o;
import java.util.ArrayList;
import java.util.List;
import jq9.t;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jetbrains.annotations.NotNull;
import t3a.g;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecipientSelectionInputData f319355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f319356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3a.b f319357c;
    public final g d;
    public final f e;

    public d(RecipientSelectionInputData inputData, o configHelper, d3a.b paymentsSearchInteractor, g paymentsSuggestedProvider, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configHelper, "configHelper");
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(paymentsSuggestedProvider, "paymentsSuggestedProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f319355a = inputData;
        this.f319356b = configHelper;
        this.f319357c = paymentsSearchInteractor;
        this.d = paymentsSuggestedProvider;
        this.e = userInteractor;
    }

    public static List a(List list, i iVar) {
        String code;
        String str = (String) iVar.f224257a;
        if (str == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            t tVar = (t) obj2;
            boolean zEquals = true;
            if (tVar instanceof y) {
                zm3.a aVar = ((y) tVar).f177526a;
                l lVar = aVar instanceof l ? (l) aVar : null;
                if (lVar != null && (code = lVar.getCode()) != null) {
                    zEquals = true ^ code.equals(str);
                }
            }
            if (zEquals) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static d3a.a b(WhoToTransferFilter whoToTransferFilter) {
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a)) {
            return d3a.a.REVOLUT;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a)) {
            return d3a.a.APM_AANI;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a)) {
            return d3a.a.APM_BIZUM;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a)) {
            return d3a.a.APM_BLIK;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a)) {
            return d3a.a.APM_BREB;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a)) {
            return d3a.a.APM_IRIS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a)) {
            return d3a.a.APM_MULTIBANCO;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a)) {
            return d3a.a.APM_PAYID;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a)) {
            return d3a.a.APM_PIX;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a)) {
            return d3a.a.APM_QVIK;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a)) {
            return d3a.a.APM_SPIN;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a)) {
            return d3a.a.APM_UPI;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a)) {
            return d3a.a.APM_WERO;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a)) {
            return d3a.a.BILLERS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a)) {
            return d3a.a.CARDS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a)) {
            return d3a.a.GROUPS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a)) {
            return d3a.a.ACCOUNTS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a)) {
            return d3a.a.CRYPTO_WALLET;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a)) {
            return d3a.a.CHARITIES;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a)) {
            return d3a.a.CHECKS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a)) {
            return d3a.a.DEVICE;
        }
        if (whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet) {
            return d3a.a.MOBILE_WALLET;
        }
        throw new NoWhenBranchMatchedException();
    }
}
