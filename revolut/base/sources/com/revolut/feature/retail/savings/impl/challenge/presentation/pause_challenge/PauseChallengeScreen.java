package com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import fb6.j;
import ff4.z;
import fkb.d;
import fkb.e;
import fkb.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import pki.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/challenge/presentation/pause_challenge/PauseChallengeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lfkb/d;", "Lcli/w;", "Lfkb/e;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PauseChallengeScreen extends BaseBottomSheetController<d> implements w {
    public static final /* synthetic */ int Q = 0;
    public final Object N;
    public final Object O;
    public final Object P;

    public PauseChallengeScreen(PauseChallengeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: fkb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PauseChallengeScreen f135739b;

            {
                this.f135739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PauseChallengeScreen pauseChallengeScreen = this.f135739b;
                switch (i2) {
                    case 0:
                        int i3 = PauseChallengeScreen.Q;
                        return n14.e.a(pauseChallengeScreen, (f) pauseChallengeScreen.O.getValue());
                    default:
                        int i5 = PauseChallengeScreen.Q;
                        return (f) ((vjb.e) pauseChallengeScreen.P.getValue()).f289690c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: fkb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PauseChallengeScreen f135739b;

            {
                this.f135739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PauseChallengeScreen pauseChallengeScreen = this.f135739b;
                switch (i22) {
                    case 0:
                        int i3 = PauseChallengeScreen.Q;
                        return n14.e.a(pauseChallengeScreen, (f) pauseChallengeScreen.O.getValue());
                    default:
                        int i5 = PauseChallengeScreen.Q;
                        return (f) ((vjb.e) pauseChallengeScreen.P.getValue()).f289690c.get();
                }
            }
        });
        this.P = te0.w.y0(new j(this, inputData, 9));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f135742a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vjb.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new z(this, null, 13), 3);
        ViewController.P2(this, f3(), new ewa.d(this, null, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.N.getValue();
    }
}
