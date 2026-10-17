package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.VirtualIbanBottomSheetScreen;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.VirtualIbanBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import nea.c;
import nea.d;
import nea.e;
import nea.f;
import no.m;
import oda.p;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/virtual_iban_bottomsheet/VirtualIbanBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lnea/e;", "Lnea/d;", "Lno/m;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VirtualIbanBottomSheetScreen extends BaseBottomSheetRecyclerController<e, d> implements m {
    public static final /* synthetic */ int V = 0;
    public final VirtualIbanBottomSheetScreenContract$InputData Q;
    public final AnalyticsProduct R;
    public final Lazy S;
    public final Lazy T;
    public final List U;

    public VirtualIbanBottomSheetScreen(VirtualIbanBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = inputData.f80878c;
        final int i = 0;
        this.S = j.b(new Function0(this) { // from class: nea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VirtualIbanBottomSheetScreen f214423b;

            {
                this.f214423b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VirtualIbanBottomSheetScreen virtualIbanBottomSheetScreen = this.f214423b;
                switch (i2) {
                    case 0:
                        int i3 = VirtualIbanBottomSheetScreen.V;
                        qji.b bVarU2 = virtualIbanBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.di.VirtualIbanBottomSheetScreenInjector");
                        VirtualIbanBottomSheetScreenContract$InputData virtualIbanBottomSheetScreenContract$InputData = virtualIbanBottomSheetScreen.Q;
                        virtualIbanBottomSheetScreenContract$InputData.getClass();
                        return new p(virtualIbanBottomSheetScreenContract$InputData);
                    default:
                        int i5 = VirtualIbanBottomSheetScreen.V;
                        xki.e eVarR1 = virtualIbanBottomSheetScreen.R1();
                        Intrinsics.i(eVarR1, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.di.VirtualIbanBottomSheetScreenComponent");
                        return new g(((p) eVarR1).f224413a, new a());
                }
            }
        });
        final int i2 = 1;
        this.T = j.b(new Function0(this) { // from class: nea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VirtualIbanBottomSheetScreen f214423b;

            {
                this.f214423b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VirtualIbanBottomSheetScreen virtualIbanBottomSheetScreen = this.f214423b;
                switch (i22) {
                    case 0:
                        int i3 = VirtualIbanBottomSheetScreen.V;
                        qji.b bVarU2 = virtualIbanBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.di.VirtualIbanBottomSheetScreenInjector");
                        VirtualIbanBottomSheetScreenContract$InputData virtualIbanBottomSheetScreenContract$InputData = virtualIbanBottomSheetScreen.Q;
                        virtualIbanBottomSheetScreenContract$InputData.getClass();
                        return new p(virtualIbanBottomSheetScreenContract$InputData);
                    default:
                        int i5 = VirtualIbanBottomSheetScreen.V;
                        xki.e eVarR1 = virtualIbanBottomSheetScreen.R1();
                        Intrinsics.i(eVarR1, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet.di.VirtualIbanBottomSheetScreenComponent");
                        return new g(((p) eVarR1).f224413a, new a());
                }
            }
        });
        this.U = b.v(null, null, 7);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xki.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new c(this, null, 0), 3);
        a.g2(this, f3(), null, new c(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
