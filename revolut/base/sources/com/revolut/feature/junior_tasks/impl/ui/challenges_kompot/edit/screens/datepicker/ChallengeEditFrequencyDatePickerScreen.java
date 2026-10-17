package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker;

import android.view.View;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import efm.r;
import gp8.n;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import pnh.a0;
import pp4.h;
import pp8.c;
import pp8.d;
import pp8.i;
import pp8.j;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/datepicker/ChallengeEditFrequencyDatePickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpp8/i;", "Lpp8/d;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeEditFrequencyDatePickerScreen extends BaseBottomSheetRecyclerController<i, d> {
    public static final /* synthetic */ int W = 0;
    public final ChallengeEditFrequencyDatePickerScreenContract$InputData Q;
    public final ListSubheaderDelegate R;
    public final DatePickerDelegate S;
    public final List T;
    public final Object U;
    public final Object V;

    public ChallengeEditFrequencyDatePickerScreen(ChallengeEditFrequencyDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.R = listSubheaderDelegate;
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.S = datePickerDelegate;
        final int i = 0;
        final int i2 = 1;
        this.T = v.k(listSubheaderDelegate, datePickerDelegate);
        this.U = w.y0(new Function0(this) { // from class: pp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyDatePickerScreen f238293b;

            {
                this.f238293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ChallengeEditFrequencyDatePickerScreen challengeEditFrequencyDatePickerScreen = this.f238293b;
                switch (i3) {
                    case 0:
                        int i5 = ChallengeEditFrequencyDatePickerScreen.W;
                        qji.b bVarU2 = challengeEditFrequencyDatePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.di.ChallengeEditFrequencyDatePickerScreenComponent.Injector");
                        gp8.i iVar = (gp8.i) bVarU2;
                        n nVar = iVar.f145310b;
                        gp8.i iVar2 = iVar.f145311c;
                        ChallengeEditFrequencyDatePickerScreenContract$InputData challengeEditFrequencyDatePickerScreenContract$InputData = challengeEditFrequencyDatePickerScreen.Q;
                        challengeEditFrequencyDatePickerScreenContract$InputData.getClass();
                        return new gp8.e(nVar, iVar2, challengeEditFrequencyDatePickerScreenContract$InputData);
                    default:
                        int i6 = ChallengeEditFrequencyDatePickerScreen.W;
                        return (j) ((gp8.e) challengeEditFrequencyDatePickerScreen.U.getValue()).f145301c.get();
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: pp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyDatePickerScreen f238293b;

            {
                this.f238293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChallengeEditFrequencyDatePickerScreen challengeEditFrequencyDatePickerScreen = this.f238293b;
                switch (i3) {
                    case 0:
                        int i5 = ChallengeEditFrequencyDatePickerScreen.W;
                        qji.b bVarU2 = challengeEditFrequencyDatePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.di.ChallengeEditFrequencyDatePickerScreenComponent.Injector");
                        gp8.i iVar = (gp8.i) bVarU2;
                        n nVar = iVar.f145310b;
                        gp8.i iVar2 = iVar.f145311c;
                        ChallengeEditFrequencyDatePickerScreenContract$InputData challengeEditFrequencyDatePickerScreenContract$InputData = challengeEditFrequencyDatePickerScreen.Q;
                        challengeEditFrequencyDatePickerScreenContract$InputData.getClass();
                        return new gp8.e(nVar, iVar2, challengeEditFrequencyDatePickerScreenContract$InputData);
                    default:
                        int i6 = ChallengeEditFrequencyDatePickerScreen.W;
                        return (j) ((gp8.e) challengeEditFrequencyDatePickerScreen.U.getValue()).f145301c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gp8.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r map = this.R.f52707c.map(new po9.w(5, new a0(20)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        ?? r112 = this.V;
        a.g2(this, dVarB, null, new h(2, (j) r112.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/datepicker/ChallengeEditFrequencyDatePickerScreenContract$Event;)V", 4, 1), 3);
        f fVar = this.S.f52176c.f121375b;
        c cVar = c.f;
        r map2 = fVar.map(new o0.a(25));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        int i = 4;
        int i2 = 2;
        a.g2(this, rd0.e.b(map2), null, new h(i2, (j) r112.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/datepicker/ChallengeEditFrequencyDatePickerScreenContract$Event;)V", i, 2), 3);
        a.g2(this, new p73.d(e3(), 21), null, new h(i2, (j) r112.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/datepicker/ChallengeEditFrequencyDatePickerScreenContract$Event;)V", i, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.T;
    }
}
