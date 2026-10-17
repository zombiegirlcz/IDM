package fp5;

import aii.u;
import com.revolut.feature.crypto.withdraw.api.CryptoSendApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination;
import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendRestrictedDestination;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.CryptoSendFlow;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlow;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog.CryptoSendLimitsDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lo5.k;
import lo5.l;
import lo5.m;
import lo5.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f137048a = 0;

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof l) {
            l lVar = (l) descriptor;
            return lVar.a(new CryptoSendFlow(lVar.b()));
        }
        if (descriptor instanceof m) {
            return ((m) descriptor).a(new CryptoSendLimitsDialogController());
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new CryptoFeeBreakdownDialogController(kVar.b()));
        }
        if (descriptor instanceof lo5.a) {
            lo5.a aVar = (lo5.a) descriptor;
            return aVar.a(new CryptoAddBeneficiaryFlow(aVar.b()));
        }
        if (!(descriptor instanceof s)) {
            return null;
        }
        s sVar = (s) descriptor;
        return sVar.a(new CryptoSendWalletsListController(new CryptoSendWalletsListControllerContract$InputData(null, sVar.c(), sVar.b())));
    }

    @Override // nte.a
    public final List e() {
        return CryptoSendApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoSendDestination) {
            return new CryptoSendFlow(((CryptoSendDestination) destination).getF71139a());
        }
        if (destination instanceof CryptoSendRestrictedDestination) {
            return gc0.c.b(new PromptMarketingScreen(((CryptoSendRestrictedDestination) destination).getF71155a()), new aab.b(13));
        }
        if (destination instanceof CryptoAddBeneficiaryDestination) {
            return new CryptoAddBeneficiaryFlow(((CryptoAddBeneficiaryDestination) destination).getF71119a());
        }
        if (destination instanceof CryptoFeeBreakdownDialogDestination) {
            return new CryptoFeeBreakdownDialogController(((CryptoFeeBreakdownDialogDestination) destination).getF71134a());
        }
        return null;
    }
}
