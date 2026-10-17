package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ckj.b;
import ckj.c;
import ckj.d;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_esim_transfer_info/EsimMobilePlanEsimTransferInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lckj/d;", "Lcli/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanEsimTransferInfoScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(EsimMobilePlanEsimTransferInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimMobilePlanEsimTransferInfoScreenContract$InputData Q;
    public final h R;
    public final List S;
    public final Object T;
    public final Object U;

    public EsimMobilePlanEsimTransferInfoScreen(EsimMobilePlanEsimTransferInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        this.S = m72.b.v(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ckj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanEsimTransferInfoScreen f24854b;

            {
                this.f24854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanEsimTransferInfoScreen esimMobilePlanEsimTransferInfoScreen = this.f24854b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanEsimTransferInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanEsimTransferInfoScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanEsimTransferInfoScreenContract$InputData esimMobilePlanEsimTransferInfoScreenContract$InputData = esimMobilePlanEsimTransferInfoScreen.Q;
                        esimMobilePlanEsimTransferInfoScreenContract$InputData.getClass();
                        return new afj.w(bVar, esimMobilePlanEsimTransferInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanEsimTransferInfoScreen.V;
                        return (e) ((afj.w) esimMobilePlanEsimTransferInfoScreen.T.getValue()).f4502c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ckj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanEsimTransferInfoScreen f24854b;

            {
                this.f24854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanEsimTransferInfoScreen esimMobilePlanEsimTransferInfoScreen = this.f24854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanEsimTransferInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(esimMobilePlanEsimTransferInfoScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimMobilePlanEsimTransferInfoScreenContract$InputData esimMobilePlanEsimTransferInfoScreenContract$InputData = esimMobilePlanEsimTransferInfoScreen.Q;
                        esimMobilePlanEsimTransferInfoScreenContract$InputData.getClass();
                        return new afj.w(bVar, esimMobilePlanEsimTransferInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanEsimTransferInfoScreen.V;
                        return (e) ((afj.w) esimMobilePlanEsimTransferInfoScreen.T.getValue()).f4502c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (afj.w) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ckj.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.R;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), null, new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ckj.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
