package com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet;

import android.os.Parcelable;
import android.view.View;
import bt7.i;
import bt7.j;
import cli.k;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import grl.k9;
import gt7.b;
import gt7.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/bottom_sheet/BottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lgt7/b;", "Lcli/k;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomSheetScreen extends BaseBottomSheetRecyclerController<b, k> implements m {
    public static final /* synthetic */ int V = 0;
    public final BottomSheetScreenContract$InputData Q;
    public final AnalyticsProduct.Retail R;
    public final List S;
    public final Object T;
    public final Object U;

    public BottomSheetScreen(BottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = a.h(k9Var, "value", k9Var);
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(new PlainTextDelegate(), new CellDetailsDelegate());
        this.T = w.y0(new Function0(this) { // from class: gt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomSheetScreen f146566b;

            {
                this.f146566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                BottomSheetScreen bottomSheetScreen = this.f146566b;
                switch (i3) {
                    case 0:
                        int i5 = BottomSheetScreen.V;
                        qji.b bVarU2 = bottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.di.BottomSheetScreenInjector");
                        j jVar = (j) bVarU2;
                        i iVar = jVar.f18442b;
                        j jVar2 = jVar.f18443c;
                        BottomSheetScreenContract$InputData bottomSheetScreenContract$InputData = bottomSheetScreen.Q;
                        bottomSheetScreenContract$InputData.getClass();
                        return new bt7.a(iVar, jVar2, bottomSheetScreenContract$InputData);
                    default:
                        int i6 = BottomSheetScreen.V;
                        return (c) ((bt7.a) bottomSheetScreen.T.getValue()).f18403c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: gt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomSheetScreen f146566b;

            {
                this.f146566b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                BottomSheetScreen bottomSheetScreen = this.f146566b;
                switch (i3) {
                    case 0:
                        int i5 = BottomSheetScreen.V;
                        qji.b bVarU2 = bottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.di.BottomSheetScreenInjector");
                        j jVar = (j) bVarU2;
                        i iVar = jVar.f18442b;
                        j jVar2 = jVar.f18443c;
                        BottomSheetScreenContract$InputData bottomSheetScreenContract$InputData = bottomSheetScreen.Q;
                        bottomSheetScreenContract$InputData.getClass();
                        return new bt7.a(iVar, jVar2, bottomSheetScreenContract$InputData);
                    default:
                        int i6 = BottomSheetScreen.V;
                        return (c) ((bt7.a) bottomSheetScreen.T.getValue()).f18403c.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt7.a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new gii.b(this, null, 24), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
