package com.revolut.shared.feature.suspicious_transaction.impl.ui.error;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.error.ErrorScreen;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import zal.d;
import zal.e;
import zal.f;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/error/ErrorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzal/f;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/error/ErrorScreenContract$EmptyInputData;", "Lzal/d;", "<init>", "()V", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorScreen extends BaseRecyclerViewScreen<f, ErrorScreenContract$EmptyInputData, d> {
    public final FullScreenStateDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public ErrorScreen() {
        super(ErrorScreenContract$EmptyInputData.f105012a);
        this.U = new FullScreenStateDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: zal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreen f320740b;

            {
                this.f320740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return u.c(this.f320740b.U);
                    case 1:
                        ErrorScreen errorScreen = this.f320740b;
                        qji.b bVarQ2 = errorScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.error.di.ErrorScreenInjector");
                        kye.e eVarJ = ((oal.a) bVarQ2).j();
                        eVarJ.f190729b = errorScreen;
                        return (lal.d) eVarJ.mo3800build();
                    case 2:
                        qji.b bVarQ22 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).G();
                    case 3:
                        qji.b bVarQ23 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ23).y();
                    default:
                        return (e) ((lal.d) this.f320740b.W.getValue()).f193435b.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: zal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreen f320740b;

            {
                this.f320740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return u.c(this.f320740b.U);
                    case 1:
                        ErrorScreen errorScreen = this.f320740b;
                        qji.b bVarQ2 = errorScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.error.di.ErrorScreenInjector");
                        kye.e eVarJ = ((oal.a) bVarQ2).j();
                        eVarJ.f190729b = errorScreen;
                        return (lal.d) eVarJ.mo3800build();
                    case 2:
                        qji.b bVarQ22 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).G();
                    case 3:
                        qji.b bVarQ23 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ23).y();
                    default:
                        return (e) ((lal.d) this.f320740b.W.getValue()).f193435b.get();
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: zal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreen f320740b;

            {
                this.f320740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return u.c(this.f320740b.U);
                    case 1:
                        ErrorScreen errorScreen = this.f320740b;
                        qji.b bVarQ2 = errorScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.error.di.ErrorScreenInjector");
                        kye.e eVarJ = ((oal.a) bVarQ2).j();
                        eVarJ.f190729b = errorScreen;
                        return (lal.d) eVarJ.mo3800build();
                    case 2:
                        qji.b bVarQ22 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).G();
                    case 3:
                        qji.b bVarQ23 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ23).y();
                    default:
                        return (e) ((lal.d) this.f320740b.W.getValue()).f193435b.get();
                }
            }
        });
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: zal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreen f320740b;

            {
                this.f320740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return u.c(this.f320740b.U);
                    case 1:
                        ErrorScreen errorScreen = this.f320740b;
                        qji.b bVarQ2 = errorScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.error.di.ErrorScreenInjector");
                        kye.e eVarJ = ((oal.a) bVarQ2).j();
                        eVarJ.f190729b = errorScreen;
                        return (lal.d) eVarJ.mo3800build();
                    case 2:
                        qji.b bVarQ22 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).G();
                    case 3:
                        qji.b bVarQ23 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ23).y();
                    default:
                        return (e) ((lal.d) this.f320740b.W.getValue()).f193435b.get();
                }
            }
        });
        final int i6 = 4;
        this.Z = w.y0(new Function0(this) { // from class: zal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorScreen f320740b;

            {
                this.f320740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return u.c(this.f320740b.U);
                    case 1:
                        ErrorScreen errorScreen = this.f320740b;
                        qji.b bVarQ2 = errorScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.ui.error.di.ErrorScreenInjector");
                        kye.e eVarJ = ((oal.a) bVarQ2).j();
                        eVarJ.f190729b = errorScreen;
                        return (lal.d) eVarJ.mo3800build();
                    case 2:
                        qji.b bVarQ22 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ22).G();
                    case 3:
                        qji.b bVarQ23 = this.f320740b.Q2();
                        Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.impl.flow.di.UiInjector");
                        return ((oal.a) bVarQ23).y();
                    default:
                        return (e) ((lal.d) this.f320740b.W.getValue()).f193435b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (lal.d) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF78908e0() {
        return (List) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ((TwinVerticalButton) this.X.getValue()).setVisibility(8);
        tal.d.b((NavBarWithToolbar) this.Y.getValue(), uiState.f320744b);
        a.g2(this, rd0.e.b(this.U.f52371h.f121375b), null, new zal.b(this, null), 3);
    }
}
