package com.revolut.feature.junior_profile.impl.ui.screen.gender;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.feature.junior_profile.impl.ui.screen.gender.JuniorProfileGenderScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mj8.f;
import pki.b;
import te0.w;
import xki.e;
import yj8.c;
import yj8.d;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/screen/gender/JuniorProfileGenderScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lyj8/c;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProfileGenderScreen extends BaseBottomSheetRecyclerController<q, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final Object R;
    public final Object S;
    public final SingleChoiceDelegate T;
    public final List U;

    public JuniorProfileGenderScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: yj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileGenderScreen f314434b;

            {
                this.f314434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorProfileGenderScreen juniorProfileGenderScreen = this.f314434b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorProfileGenderScreen.V;
                        qji.b bVarU2 = juniorProfileGenderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.gender.di.JuniorProfileGenderScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        d dVar3 = juniorProfileGenderScreen.Q;
                        dVar3.getClass();
                        return new mj8.f(hVar, dVar2, dVar3);
                    default:
                        int i5 = JuniorProfileGenderScreen.V;
                        return (e) ((mj8.f) juniorProfileGenderScreen.R.getValue()).f205962b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: yj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileGenderScreen f314434b;

            {
                this.f314434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorProfileGenderScreen juniorProfileGenderScreen = this.f314434b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorProfileGenderScreen.V;
                        qji.b bVarU2 = juniorProfileGenderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.gender.di.JuniorProfileGenderScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        d dVar3 = juniorProfileGenderScreen.Q;
                        dVar3.getClass();
                        return new mj8.f(hVar, dVar2, dVar3);
                    default:
                        int i5 = JuniorProfileGenderScreen.V;
                        return (e) ((mj8.f) juniorProfileGenderScreen.R.getValue()).f205962b.get();
                }
            }
        });
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.T = singleChoiceDelegate;
        this.U = v.k(new PlainTextDelegate(), singleChoiceDelegate, new SingleChoiceLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (yj8.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.p()), new yj8.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (yj8.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
