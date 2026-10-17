package com.revolut.feature.entity.provider.impl.ui.bottomsheet;

import aii.q;
import cli.k;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import gd6.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import xki.a;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/entity/provider/impl/ui/bottomsheet/LearnMoreBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_entity_provider_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnMoreBottomSheetScreen extends BaseBottomSheetRecyclerController<q, k> {
    public final List Q;
    public final a R;
    public final ay4.a S;

    public LearnMoreBottomSheetScreen(hd6.a legalEntityConfiguration) {
        Intrinsics.checkNotNullParameter(legalEntityConfiguration, "legalEntityConfiguration");
        this.Q = u.c(new PlainTextDelegate());
        this.R = a.f306815a;
        this.S = new ay4.a(new c(legalEntityConfiguration));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.Q;
    }
}
