package com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options;

import afj.u0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import ofa.n;
import ohj.b;
import ohj.c;
import ohj.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lohj/f;", "Lohj/c;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimSetupOptionsScreen extends BaseBottomSheetRecyclerController<f, c> {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(EsimSetupOptionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h Q;
    public final Object R;
    public final Object S;
    public final List T;
    public final Object U;
    public final Object V;

    public EsimSetupOptionsScreen(EsimSetupOptionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = s.t(this, b.f);
        Lazy lazyY0 = w.y0(new n(17));
        this.R = lazyY0;
        final int i = 0;
        Lazy lazyY02 = w.y0(new Function0(this) { // from class: ohj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSetupOptionsScreen f225373b;

            {
                this.f225373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimSetupOptionsScreen esimSetupOptionsScreen = this.f225373b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSetupOptionsScreen.W;
                        return new SelectableDelegate((RowDelegate) esimSetupOptionsScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = EsimSetupOptionsScreen.W;
                        return (h) ((u0) esimSetupOptionsScreen.U.getValue()).d.get();
                }
            }
        });
        this.S = lazyY02;
        final int i2 = 1;
        this.T = v.k((SelectableDelegate) lazyY02.getValue(), (RowDelegate) lazyY0.getValue());
        this.U = w.y0(new oa2.b(this, inputData, 9));
        this.V = w.y0(new Function0(this) { // from class: ohj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSetupOptionsScreen f225373b;

            {
                this.f225373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimSetupOptionsScreen esimSetupOptionsScreen = this.f225373b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSetupOptionsScreen.W;
                        return new SelectableDelegate((RowDelegate) esimSetupOptionsScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = EsimSetupOptionsScreen.W;
                        return (h) ((u0) esimSetupOptionsScreen.U.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u0) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ohj.h) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new d(this, null, 6), 3);
        a.g2(this, rd0.e.b(w.a0(((SelectableDelegate) this.S.getValue()).r(), new oh3.a(4))), null, new o95.c(this, null, 20), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (ohj.h) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
