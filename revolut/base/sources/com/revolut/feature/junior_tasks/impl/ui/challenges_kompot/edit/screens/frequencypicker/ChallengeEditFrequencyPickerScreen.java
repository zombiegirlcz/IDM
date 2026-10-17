package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.ChallengeEditFrequencyPickerScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.ChallengeEditFrequencyPickerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import efm.r;
import gp8.f;
import gp8.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import u36.g;
import v2e.h0;
import vf0.q;
import vp8.c;
import vp8.d;
import vp8.h;
import vp8.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequencypicker/ChallengeEditFrequencyPickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lvp8/h;", "Lvp8/d;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeEditFrequencyPickerScreen extends BaseBottomSheetRecyclerController<h, d> {
    public static final /* synthetic */ int V = 0;
    public final ChallengeEditFrequencyPickerScreenContract$InputData Q;
    public final SingleChoiceDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public ChallengeEditFrequencyPickerScreen(ChallengeEditFrequencyPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.R = singleChoiceDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(singleChoiceDelegate, new TextDelegate());
        this.T = w.y0(new Function0(this) { // from class: vp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyPickerScreen f291137b;

            {
                this.f291137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ChallengeEditFrequencyPickerScreen challengeEditFrequencyPickerScreen = this.f291137b;
                switch (i3) {
                    case 0:
                        int i5 = ChallengeEditFrequencyPickerScreen.V;
                        qji.b bVarU2 = challengeEditFrequencyPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.di.ChallengeEditFrequencyPickerScreenComponent.Injector");
                        gp8.i iVar = (gp8.i) bVarU2;
                        n nVar = iVar.f145310b;
                        gp8.i iVar2 = iVar.f145311c;
                        ChallengeEditFrequencyPickerScreenContract$InputData challengeEditFrequencyPickerScreenContract$InputData = challengeEditFrequencyPickerScreen.Q;
                        challengeEditFrequencyPickerScreenContract$InputData.getClass();
                        return new gp8.f(nVar, iVar2, challengeEditFrequencyPickerScreenContract$InputData);
                    default:
                        int i6 = ChallengeEditFrequencyPickerScreen.V;
                        return (i) ((gp8.f) challengeEditFrequencyPickerScreen.T.getValue()).f145303b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: vp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyPickerScreen f291137b;

            {
                this.f291137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChallengeEditFrequencyPickerScreen challengeEditFrequencyPickerScreen = this.f291137b;
                switch (i3) {
                    case 0:
                        int i5 = ChallengeEditFrequencyPickerScreen.V;
                        qji.b bVarU2 = challengeEditFrequencyPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequencypicker.di.ChallengeEditFrequencyPickerScreenComponent.Injector");
                        gp8.i iVar = (gp8.i) bVarU2;
                        n nVar = iVar.f145310b;
                        gp8.i iVar2 = iVar.f145311c;
                        ChallengeEditFrequencyPickerScreenContract$InputData challengeEditFrequencyPickerScreenContract$InputData = challengeEditFrequencyPickerScreen.Q;
                        challengeEditFrequencyPickerScreenContract$InputData.getClass();
                        return new gp8.f(nVar, iVar2, challengeEditFrequencyPickerScreenContract$InputData);
                    default:
                        int i6 = ChallengeEditFrequencyPickerScreen.V;
                        return (i) ((gp8.f) challengeEditFrequencyPickerScreen.T.getValue()).f145303b.get();
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
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ihm.f fVarP = this.R.p();
        c cVar = c.f;
        r map = fVarP.map(new q(8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        ?? r102 = this.U;
        a.g2(this, dVarB, null, new g(2, (i) r102.getValue(), i.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequencypicker/ChallengeEditFrequencyPickerScreenContract$Event;)V", 4, 15), 3);
        a.g2(this, new h0(e3(), 13), null, new g(2, (i) r102.getValue(), i.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequencypicker/ChallengeEditFrequencyPickerScreenContract$Event;)V", 4, 16), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (i) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.S;
    }
}
