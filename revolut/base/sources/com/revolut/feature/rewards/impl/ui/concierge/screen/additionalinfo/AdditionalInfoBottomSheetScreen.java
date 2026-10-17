package com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo;

import aii.q;
import android.view.View;
import cbh.g;
import cic.c;
import cic.d;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetContract$InputData;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import whc.f;
import whc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/concierge/screen/additionalinfo/AdditionalInfoBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInfoBottomSheetScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int V = 0;
    public final AdditionalInfoBottomSheetContract$InputData Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public AdditionalInfoBottomSheetScreen(AdditionalInfoBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = u.c(rowDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: cic.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoBottomSheetScreen f24440b;

            {
                this.f24440b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalInfoBottomSheetScreen additionalInfoBottomSheetScreen = this.f24440b;
                switch (i2) {
                    case 0:
                        int i3 = AdditionalInfoBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(additionalInfoBottomSheetScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        AdditionalInfoBottomSheetContract$InputData additionalInfoBottomSheetContract$InputData = additionalInfoBottomSheetScreen.Q;
                        additionalInfoBottomSheetContract$InputData.getClass();
                        return new whc.f(sVar, additionalInfoBottomSheetScreen, additionalInfoBottomSheetContract$InputData);
                    default:
                        int i5 = AdditionalInfoBottomSheetScreen.V;
                        return (d) ((whc.f) additionalInfoBottomSheetScreen.T.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: cic.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoBottomSheetScreen f24440b;

            {
                this.f24440b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalInfoBottomSheetScreen additionalInfoBottomSheetScreen = this.f24440b;
                switch (i22) {
                    case 0:
                        int i3 = AdditionalInfoBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(additionalInfoBottomSheetScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        AdditionalInfoBottomSheetContract$InputData additionalInfoBottomSheetContract$InputData = additionalInfoBottomSheetScreen.Q;
                        additionalInfoBottomSheetContract$InputData.getClass();
                        return new whc.f(sVar, additionalInfoBottomSheetScreen, additionalInfoBottomSheetContract$InputData);
                    default:
                        int i5 = AdditionalInfoBottomSheetScreen.V;
                        return (d) ((whc.f) additionalInfoBottomSheetScreen.T.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new g(this, null, 22), 3);
        a.g2(this, rd0.e.b(this.R.f53218h), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
