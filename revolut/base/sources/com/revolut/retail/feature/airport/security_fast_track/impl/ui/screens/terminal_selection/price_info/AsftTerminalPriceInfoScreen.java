package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info;

import aii.q;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.AsftTerminalPriceInfoScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.AsftTerminalPriceInfoScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lti.g;
import lti.o;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/price_info/AsftTerminalPriceInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftTerminalPriceInfoScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final AsftTerminalPriceInfoScreenContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public AsftTerminalPriceInfoScreen(AsftTerminalPriceInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = u.c(new CellDetailsStandaloneNoteDelegate());
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: wui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTerminalPriceInfoScreen f300170b;

            {
                this.f300170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftTerminalPriceInfoScreen asftTerminalPriceInfoScreen = this.f300170b;
                switch (i2) {
                    case 0:
                        int i3 = AsftTerminalPriceInfoScreen.U;
                        qji.b bVarU2 = asftTerminalPriceInfoScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.di.AsftTerminalPriceInfoScreenInjector");
                        }
                        lti.k kVar = (lti.k) bVarU2;
                        g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTerminalPriceInfoScreenContract$InputData asftTerminalPriceInfoScreenContract$InputData = asftTerminalPriceInfoScreen.Q;
                        asftTerminalPriceInfoScreenContract$InputData.getClass();
                        return new o(gVar, kVar2, asftTerminalPriceInfoScreen, asftTerminalPriceInfoScreenContract$InputData);
                    default:
                        int i5 = AsftTerminalPriceInfoScreen.U;
                        return (b) ((o) asftTerminalPriceInfoScreen.S.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: wui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTerminalPriceInfoScreen f300170b;

            {
                this.f300170b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftTerminalPriceInfoScreen asftTerminalPriceInfoScreen = this.f300170b;
                switch (i22) {
                    case 0:
                        int i3 = AsftTerminalPriceInfoScreen.U;
                        qji.b bVarU2 = asftTerminalPriceInfoScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.di.AsftTerminalPriceInfoScreenInjector");
                        }
                        lti.k kVar = (lti.k) bVarU2;
                        g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTerminalPriceInfoScreenContract$InputData asftTerminalPriceInfoScreenContract$InputData = asftTerminalPriceInfoScreen.Q;
                        asftTerminalPriceInfoScreenContract$InputData.getClass();
                        return new o(gVar, kVar2, asftTerminalPriceInfoScreen, asftTerminalPriceInfoScreenContract$InputData);
                    default:
                        int i5 = AsftTerminalPriceInfoScreen.U;
                        return (b) ((o) asftTerminalPriceInfoScreen.S.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (wui.b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (wui.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
