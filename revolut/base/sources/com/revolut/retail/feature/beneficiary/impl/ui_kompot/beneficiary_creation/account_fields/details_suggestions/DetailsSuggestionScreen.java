package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.details_suggestions;

import aii.q;
import android.view.View;
import b3j.t;
import b3j.u;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.details_suggestions.DetailsSuggestionScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.details_suggestions.DetailsSuggestionScreenContract$InputData;
import e4j.b;
import e4j.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/details_suggestions/DetailsSuggestionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Le4j/b;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailsSuggestionScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int V = 0;
    public final DetailsSuggestionScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final RowDelegate T;
    public final List U;

    public DetailsSuggestionScreen(DetailsSuggestionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: e4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailsSuggestionScreen f122565b;

            {
                this.f122565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DetailsSuggestionScreen detailsSuggestionScreen = this.f122565b;
                switch (i2) {
                    case 0:
                        int i3 = DetailsSuggestionScreen.V;
                        phm.a aVar = (phm.a) e.j(detailsSuggestionScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        DetailsSuggestionScreenContract$InputData detailsSuggestionScreenContract$InputData = detailsSuggestionScreen.Q;
                        detailsSuggestionScreenContract$InputData.getClass();
                        return new u(tVar, detailsSuggestionScreenContract$InputData);
                    default:
                        int i5 = DetailsSuggestionScreen.V;
                        return (c) ((u) detailsSuggestionScreen.R.getValue()).f12111b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: e4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DetailsSuggestionScreen f122565b;

            {
                this.f122565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DetailsSuggestionScreen detailsSuggestionScreen = this.f122565b;
                switch (i22) {
                    case 0:
                        int i3 = DetailsSuggestionScreen.V;
                        phm.a aVar = (phm.a) e.j(detailsSuggestionScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        DetailsSuggestionScreenContract$InputData detailsSuggestionScreenContract$InputData = detailsSuggestionScreen.Q;
                        detailsSuggestionScreenContract$InputData.getClass();
                        return new u(tVar, detailsSuggestionScreenContract$InputData);
                    default:
                        int i5 = DetailsSuggestionScreen.V;
                        return (c) ((u) detailsSuggestionScreen.R.getValue()).f12111b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        this.U = zhm.u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.f53226s), new e0b.c(this, null, 13), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.U;
    }
}
