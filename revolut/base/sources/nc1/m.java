package nc1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import com.revolut.feature.acquiring.lite_pos.api.model.LitePosReceiptState;
import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import com.revolut.feature.acquiring.lite_pos.api.navigation.ShareReceiptDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.r;
import java.util.concurrent.TimeUnit;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ma1.t;
import ma1.x;
import nii.c0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends bji.b implements e {

    @NotNull
    public static final k Companion = new k();
    public final xc1.d A;
    public final n60.a B;
    public final g1 C;
    public final pc1.b D;
    public final qd0.b E;
    public ifm.c F;
    public final cji.d G;
    public final cji.d H;
    public final cji.d I;
    public final cji.d J;
    public final cji.d K;
    public final dj0.d L;
    public final da1.e u;
    public final da1.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f01.a f214139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dfc.a f214140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cfc.b f214141y;
    public final ac1.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, da1.e paymentInteractor, da1.d connectionInteractor, f01.a uiKitResources, dfc.a cardReaderUiRouter, cfc.b cardReaderUiMerchantInteractor, ac1.a batteryExtension, xc1.d stickyActionExtension, n60.a keyboardExtension, g1 shotDialogDisplayer, pc1.b dialogFactory, qd0.b languageProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(paymentInteractor, "paymentInteractor");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(cardReaderUiRouter, "cardReaderUiRouter");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        Intrinsics.checkNotNullParameter(batteryExtension, "batteryExtension");
        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.u = paymentInteractor;
        this.v = connectionInteractor;
        this.f214139w = uiKitResources;
        this.f214140x = cardReaderUiRouter;
        this.f214141y = cardReaderUiMerchantInteractor;
        this.z = batteryExtension;
        this.A = stickyActionExtension;
        this.B = keyboardExtension;
        this.C = shotDialogDisplayer;
        this.D = dialogFactory;
        this.E = languageProvider;
        Intrinsics.checkNotNullParameter("", "default");
        this.G = new cji.d("");
        this.H = ksj.b.b();
        Intrinsics.checkNotNullParameter("", "default");
        this.I = new cji.d("");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.J = new cji.d(bool);
        d dVar = d.NONE;
        Intrinsics.checkNotNullParameter(dVar, "default");
        this.K = ksj.b.a(dVar);
        PairingInfo pairingInfoC = ((ha1.f) ((x) paymentInteractor).d).c();
        dj0.d dVar2 = pairingInfoC != null ? pairingInfoC.f60574n : null;
        if (dVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.L = dVar2;
    }

    public final void B2() {
        this.G.d("");
        this.I.d("");
    }

    public final void C2() {
        if (!((t) this.v).c()) {
            yji.l.i2(this, new CardReaderConnectionFlow(0), null, new g(this, 0), 1);
            return;
        }
        ifm.c cVar = this.F;
        if (cVar != null) {
            cVar.dispose();
        }
        G2(d.NONE);
        this.J.d(Boolean.TRUE);
        ((ac1.e) this.z).Z2(new h(this, 5));
    }

    public final dj0.d D2() {
        u80.p pVar = u80.p.f278066a;
        cji.d dVar = this.G;
        dVar.getClass();
        String str = (String) dVar.a();
        cji.d dVar2 = this.H;
        dVar2.getClass();
        return new dj0.d(u80.p.a(str, ((xi0.b) dVar2.a()).f306286a, this.E, null), (xi0.b) dVar2.a());
    }

    public final void E2(String receiptUrl, dj0.d amount, LitePosReceiptState litePosReceiptState) {
        dfc.a aVar = this.f214140x;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "controllerModel");
        f01.a uiKitResources = this.f214139w;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(receiptUrl, "receiptUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(litePosReceiptState, "litePosReceiptState");
        C1(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ShareReceiptDestination(new ReceiptInfo(receiptUrl, aVar.f113884b.a(), amount, litePosReceiptState)), false, (Integer) null, 0, 61))));
    }

    public final void F2(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z) {
        zii.i.t(this, z2(new y0(null, new c0(textLocalisedClause, textLocalisedClause2, null, true, new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), z, false, null, 1804), false, 5)), new g(this, 1), null, 14);
    }

    public final void G2(d dVar) {
        if (this.K.f24685a != dVar) {
            this.K.d(dVar);
        }
    }

    @Override // yji.l
    public final void I1() {
        ((ac1.e) this.z).Z2(new h(this, 6));
        cfc.b bVar = this.f214141y;
        bVar.getClass();
        A2(w.o0(p0.f264003c, new bv4.h(bVar, null, 18)), new g(this, 7), new zii.c(4));
    }

    @Override // bji.b
    public final r y2() {
        r rVarC = this.G.c();
        r rVarC2 = this.H.c();
        r rVarC3 = this.I.c();
        r rVarC4 = this.J.c();
        r rVarDebounce = this.K.c().debounce(100L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        r map = w.o(rVarC, rVarC2, rVarC3, rVarC4, rVarDebounce).map(new nae.a(new g(this, 6), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
