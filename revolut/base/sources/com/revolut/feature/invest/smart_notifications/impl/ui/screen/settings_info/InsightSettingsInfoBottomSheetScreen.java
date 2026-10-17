package com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info;

import aii.q;
import android.view.View;
import az.i;
import b28.a;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m18.c;
import pki.b;
import te0.w;
import ue0.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/settings_info/InsightSettingsInfoBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lb28/a;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightSettingsInfoBottomSheetScreen extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int V = 0;
    public final InsightSettingsInfoBottomSheetContract$InputData Q;
    public final PlainTextDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public InsightSettingsInfoBottomSheetScreen(InsightSettingsInfoBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.R = plainTextDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(plainTextDelegate, new PlainTextLoadingDelegate());
        this.T = w.y0(new Function0(this) { // from class: b28.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightSettingsInfoBottomSheetScreen f11927b;

            {
                this.f11927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                InsightSettingsInfoBottomSheetScreen insightSettingsInfoBottomSheetScreen = this.f11927b;
                switch (i3) {
                    case 0:
                        int i5 = InsightSettingsInfoBottomSheetScreen.V;
                        phm.a aVar = (phm.a) e.j(insightSettingsInfoBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        InsightSettingsInfoBottomSheetContract$InputData insightSettingsInfoBottomSheetContract$InputData = insightSettingsInfoBottomSheetScreen.Q;
                        insightSettingsInfoBottomSheetContract$InputData.getClass();
                        return new m18.c(eVar, insightSettingsInfoBottomSheetContract$InputData);
                    default:
                        int i6 = InsightSettingsInfoBottomSheetScreen.V;
                        return (b) ((m18.c) insightSettingsInfoBottomSheetScreen.T.getValue()).f201259b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: b28.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightSettingsInfoBottomSheetScreen f11927b;

            {
                this.f11927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                InsightSettingsInfoBottomSheetScreen insightSettingsInfoBottomSheetScreen = this.f11927b;
                switch (i3) {
                    case 0:
                        int i5 = InsightSettingsInfoBottomSheetScreen.V;
                        phm.a aVar = (phm.a) e.j(insightSettingsInfoBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        InsightSettingsInfoBottomSheetContract$InputData insightSettingsInfoBottomSheetContract$InputData = insightSettingsInfoBottomSheetScreen.Q;
                        insightSettingsInfoBottomSheetContract$InputData.getClass();
                        return new m18.c(eVar, insightSettingsInfoBottomSheetContract$InputData);
                    default:
                        int i6 = InsightSettingsInfoBottomSheetScreen.V;
                        return (b) ((m18.c) insightSettingsInfoBottomSheetScreen.T.getValue()).f201259b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (b28.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new i(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new avk.i(this, null, 18), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (b28.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
