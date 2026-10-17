package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.gender;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.gender.JuniorGenderPickerScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import ji8.c;
import ji8.d;
import ji8.e;
import ji8.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qh8.i;
import qh8.k;
import qh8.l;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/gender/JuniorGenderPickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lji8/e;", "Lji8/c;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorGenderPickerScreen extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final Object R;
    public final Object S;
    public final SingleChoiceDelegate T;
    public final List U;

    public JuniorGenderPickerScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ji8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorGenderPickerScreen f174383b;

            {
                this.f174383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorGenderPickerScreen juniorGenderPickerScreen = this.f174383b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorGenderPickerScreen.V;
                        qji.b bVarU2 = juniorGenderPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.gender.di.JuniorGenderPickerScreenInjector");
                        l lVar = (l) bVarU2;
                        k kVar = lVar.f246540a;
                        l lVar2 = lVar.f246541b;
                        d dVar = juniorGenderPickerScreen.Q;
                        dVar.getClass();
                        return new i(kVar, lVar2, dVar);
                    default:
                        int i5 = JuniorGenderPickerScreen.V;
                        return (f) ((i) juniorGenderPickerScreen.R.getValue()).f246528c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ji8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorGenderPickerScreen f174383b;

            {
                this.f174383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorGenderPickerScreen juniorGenderPickerScreen = this.f174383b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorGenderPickerScreen.V;
                        qji.b bVarU2 = juniorGenderPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.gender.di.JuniorGenderPickerScreenInjector");
                        l lVar = (l) bVarU2;
                        k kVar = lVar.f246540a;
                        l lVar2 = lVar.f246541b;
                        d dVar = juniorGenderPickerScreen.Q;
                        dVar.getClass();
                        return new i(kVar, lVar2, dVar);
                    default:
                        int i5 = JuniorGenderPickerScreen.V;
                        return (f) ((i) juniorGenderPickerScreen.R.getValue()).f246528c.get();
                }
            }
        });
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.T = singleChoiceDelegate;
        this.U = v.k(singleChoiceDelegate, new SingleChoiceLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.p()), new ji8.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
