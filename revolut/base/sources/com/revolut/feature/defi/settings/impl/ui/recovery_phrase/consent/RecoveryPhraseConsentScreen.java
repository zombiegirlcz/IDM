package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentContract$InputData;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import e66.f;
import gqh.o;
import h66.a;
import h66.b;
import h66.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/ui/recovery_phrase/consent/RecoveryPhraseConsentScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lh66/b;", "Lh66/a;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecoveryPhraseConsentScreen extends BaseBottomSheetRecyclerController<b, a> {
    public static final /* synthetic */ int V = 0;
    public final RecoveryPhraseConsentContract$InputData Q;
    public final InputChecklistDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public RecoveryPhraseConsentScreen(RecoveryPhraseConsentContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.R = inputChecklistDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: h66.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecoveryPhraseConsentScreen f149603b;

            {
                this.f149603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecoveryPhraseConsentScreen recoveryPhraseConsentScreen = this.f149603b;
                switch (i2) {
                    case 0:
                        int i3 = RecoveryPhraseConsentScreen.V;
                        qji.b bVarU2 = recoveryPhraseConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.di.RecoveryPhraseConsentComponentInjector");
                        e66.a aVar = (e66.a) bVarU2;
                        e66.d dVar = aVar.f122922b;
                        e66.a aVar2 = aVar.f122923c;
                        RecoveryPhraseConsentContract$InputData recoveryPhraseConsentContract$InputData = recoveryPhraseConsentScreen.Q;
                        recoveryPhraseConsentContract$InputData.getClass();
                        return new e66.f(dVar, aVar2, recoveryPhraseConsentContract$InputData);
                    default:
                        int i5 = RecoveryPhraseConsentScreen.V;
                        return (e) ((e66.f) recoveryPhraseConsentScreen.S.getValue()).f122935b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: h66.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecoveryPhraseConsentScreen f149603b;

            {
                this.f149603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecoveryPhraseConsentScreen recoveryPhraseConsentScreen = this.f149603b;
                switch (i22) {
                    case 0:
                        int i3 = RecoveryPhraseConsentScreen.V;
                        qji.b bVarU2 = recoveryPhraseConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.di.RecoveryPhraseConsentComponentInjector");
                        e66.a aVar = (e66.a) bVarU2;
                        e66.d dVar = aVar.f122922b;
                        e66.a aVar2 = aVar.f122923c;
                        RecoveryPhraseConsentContract$InputData recoveryPhraseConsentContract$InputData = recoveryPhraseConsentScreen.Q;
                        recoveryPhraseConsentContract$InputData.getClass();
                        return new e66.f(dVar, aVar2, recoveryPhraseConsentContract$InputData);
                    default:
                        int i5 = RecoveryPhraseConsentScreen.V;
                        return (e) ((e66.f) recoveryPhraseConsentScreen.S.getValue()).f122935b.get();
                }
            }
        });
        this.U = u.c(inputChecklistDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h66.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52518c), new g(this, null), 3);
        ViewController.P2(this, e3(), new o(this, null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h66.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
