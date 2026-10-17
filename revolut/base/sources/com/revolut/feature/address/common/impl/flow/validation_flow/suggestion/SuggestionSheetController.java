package com.revolut.feature.address.common.impl.flow.validation_flow.suggestion;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import no.m;
import te0.w;
import ti1.b;
import ti1.c;
import ti1.g;
import xki.e;
import yh1.j;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/validation_flow/suggestion/SuggestionSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lti1/c;", "Lti1/b;", "Lno/m;", "Lno/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuggestionSheetController extends BaseBottomSheetRecyclerController<c, b> implements m, k {
    public static final /* synthetic */ int Y = 0;
    public final SuggestionSheetContract$InputData Q;
    public final AnalyticsProduct R;
    public AnalyticsContext S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final List X;

    public SuggestionSheetController(SuggestionSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = inputData.d;
        this.S = inputData.e;
        this.T = w.y0(new th9.k(3));
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: ti1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuggestionSheetController f271401b;

            {
                this.f271401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SuggestionSheetController suggestionSheetController = this.f271401b;
                switch (i2) {
                    case 0:
                        int i3 = SuggestionSheetController.Y;
                        return new SelectableDelegate((RowDelegate) suggestionSheetController.T.getValue());
                    case 1:
                        int i5 = SuggestionSheetController.Y;
                        return (g) ((j) suggestionSheetController.W.getValue()).f313726c.get();
                    default:
                        int i6 = SuggestionSheetController.Y;
                        qji.b bVarU2 = suggestionSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.di.SuggestionSheetControllerInjector");
                        yh1.d dVar = (yh1.d) ((ui1.a) bVarU2);
                        yh1.e eVar = dVar.f313704c;
                        yh1.d dVar2 = dVar.d;
                        SuggestionSheetContract$InputData suggestionSheetContract$InputData = suggestionSheetController.Q;
                        suggestionSheetContract$InputData.getClass();
                        return new j(eVar, dVar2, suggestionSheetContract$InputData);
                }
            }
        });
        this.U = lazyY0;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: ti1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuggestionSheetController f271401b;

            {
                this.f271401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SuggestionSheetController suggestionSheetController = this.f271401b;
                switch (i22) {
                    case 0:
                        int i3 = SuggestionSheetController.Y;
                        return new SelectableDelegate((RowDelegate) suggestionSheetController.T.getValue());
                    case 1:
                        int i5 = SuggestionSheetController.Y;
                        return (g) ((j) suggestionSheetController.W.getValue()).f313726c.get();
                    default:
                        int i6 = SuggestionSheetController.Y;
                        qji.b bVarU2 = suggestionSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.di.SuggestionSheetControllerInjector");
                        yh1.d dVar = (yh1.d) ((ui1.a) bVarU2);
                        yh1.e eVar = dVar.f313704c;
                        yh1.d dVar2 = dVar.d;
                        SuggestionSheetContract$InputData suggestionSheetContract$InputData = suggestionSheetController.Q;
                        suggestionSheetContract$InputData.getClass();
                        return new j(eVar, dVar2, suggestionSheetContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: ti1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuggestionSheetController f271401b;

            {
                this.f271401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SuggestionSheetController suggestionSheetController = this.f271401b;
                switch (i22) {
                    case 0:
                        int i32 = SuggestionSheetController.Y;
                        return new SelectableDelegate((RowDelegate) suggestionSheetController.T.getValue());
                    case 1:
                        int i5 = SuggestionSheetController.Y;
                        return (g) ((j) suggestionSheetController.W.getValue()).f313726c.get();
                    default:
                        int i6 = SuggestionSheetController.Y;
                        qji.b bVarU2 = suggestionSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.di.SuggestionSheetControllerInjector");
                        yh1.d dVar = (yh1.d) ((ui1.a) bVarU2);
                        yh1.e eVar = dVar.f313704c;
                        yh1.d dVar2 = dVar.d;
                        SuggestionSheetContract$InputData suggestionSheetContract$InputData = suggestionSheetController.Q;
                        suggestionSheetContract$InputData.getClass();
                        return new j(eVar, dVar2, suggestionSheetContract$InputData);
                }
            }
        });
        this.X = u.c((SelectableDelegate) lazyY0.getValue());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.W.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.U.getValue()).r()), new ti1.e(this, null), 3);
        ViewController.P2(this, e3(), new t05.m(this, null, 26), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.X;
    }
}
