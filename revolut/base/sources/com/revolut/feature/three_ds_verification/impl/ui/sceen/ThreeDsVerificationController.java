package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.r0;
import au0.s0;
import aw0.i;
import cli.o;
import cli.q;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$InputData;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.e;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.f;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.IdContext;
import com.revolut.tracking.v3.PendingThreeDsContext;
import grl.k9;
import ise.g0;
import ise.i0;
import ise.j;
import ise.j0;
import ise.k0;
import java.io.IOException;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.p2;
import vc.s;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007:\u0004\t\t\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/three_ds_verification/impl/ui/sceen/f;", "Ldli/a;", "Lise/p0;", "Lno/m;", "Lin0/g;", "Lno/k;", "Companion", "ise/b", "a", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThreeDsVerificationController extends ViewController<f> implements dli.a, m, in0.g, k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90405a0;
    public final ThreeDsVerificationScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public AnalyticsContext N;
    public final Object O;
    public final h P;
    public final h Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(ThreeDsVerificationController.class, "legacyBinding", "getLegacyBinding()Lcom/revolut/feature/three_ds_verification/impl/databinding/ScreenThreeDsVerificationBinding;", 0);
        p0 p0Var = o0.f186429a;
        f90405a0 = new KProperty[]{p0Var.j(h0Var), p.a.y(ThreeDsVerificationController.class, "bigTileBinding", "getBigTileBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public ThreeDsVerificationController(ThreeDsVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ise.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationController f168187b;

            {
                this.f168187b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ThreeDsVerificationController threeDsVerificationController = this.f168187b;
                switch (i2) {
                    case 0:
                        ThreeDsVerificationController.Companion companion = ThreeDsVerificationController.INSTANCE;
                        qji.b bVarU2 = threeDsVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.sceen.di.ThreeDsVerificationScreenInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = threeDsVerificationController.K;
                        threeDsVerificationScreenContract$InputData.getClass();
                        return new yre.g(eVar, fVar2, threeDsVerificationController, threeDsVerificationScreenContract$InputData);
                    case 1:
                        ThreeDsVerificationController.Companion companion2 = ThreeDsVerificationController.INSTANCE;
                        ThreeDsVerificationController threeDsVerificationController2 = this.f168187b;
                        return dli.f.a(threeDsVerificationController2, threeDsVerificationController2.R2(), zhm.v.k(new TwoLogosHeaderDelegate(), new TimerDelegate(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), (RowDelegate) threeDsVerificationController2.W.getValue(), new CounterTextDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) threeDsVerificationController2.T.getValue(), (PromptMarketingContentDelegate) threeDsVerificationController2.U.getValue(), (CellDetailsActionDelegate) threeDsVerificationController2.V.getValue(), (TextDelegate) threeDsVerificationController2.X.getValue(), new ListCellDelegate(), new ListSubheaderDelegate()), threeDsVerificationController2.K.f90407b ? R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView : com.revolut.feature.three_ds_verification.impl.R$id.screenThreeDsVerification_recyclerView, null, null, null, 56);
                    case 2:
                        ThreeDsVerificationController.Companion companion3 = ThreeDsVerificationController.INSTANCE;
                        return (j60.a) ((yre.g) threeDsVerificationController.M.getValue()).d.get();
                    case 3:
                        if (threeDsVerificationController.K.f90407b) {
                            ViewBinding value = threeDsVerificationController.Q.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new b((jii.c0) value);
                        }
                        ViewBinding value2 = threeDsVerificationController.P.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new b((wre.a) value2);
                    default:
                        ThreeDsVerificationController.Companion companion4 = ThreeDsVerificationController.INSTANCE;
                        return (i0) ((yre.g) threeDsVerificationController.M.getValue()).i.get();
                }
            }
        });
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        String str = inputData.f90406a;
        this.N = new AnalyticsContext(kii.e.d(aVarNewBuilder, str == null ? "no_transaction" : str, companion));
        final int i2 = 2;
        this.O = w.y0(new Function0(this) { // from class: ise.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationController f168187b;

            {
                this.f168187b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ThreeDsVerificationController threeDsVerificationController = this.f168187b;
                switch (i22) {
                    case 0:
                        ThreeDsVerificationController.Companion companion2 = ThreeDsVerificationController.INSTANCE;
                        qji.b bVarU2 = threeDsVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.sceen.di.ThreeDsVerificationScreenInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = threeDsVerificationController.K;
                        threeDsVerificationScreenContract$InputData.getClass();
                        return new yre.g(eVar, fVar2, threeDsVerificationController, threeDsVerificationScreenContract$InputData);
                    case 1:
                        ThreeDsVerificationController.Companion companion22 = ThreeDsVerificationController.INSTANCE;
                        ThreeDsVerificationController threeDsVerificationController2 = this.f168187b;
                        return dli.f.a(threeDsVerificationController2, threeDsVerificationController2.R2(), zhm.v.k(new TwoLogosHeaderDelegate(), new TimerDelegate(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), (RowDelegate) threeDsVerificationController2.W.getValue(), new CounterTextDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) threeDsVerificationController2.T.getValue(), (PromptMarketingContentDelegate) threeDsVerificationController2.U.getValue(), (CellDetailsActionDelegate) threeDsVerificationController2.V.getValue(), (TextDelegate) threeDsVerificationController2.X.getValue(), new ListCellDelegate(), new ListSubheaderDelegate()), threeDsVerificationController2.K.f90407b ? R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView : com.revolut.feature.three_ds_verification.impl.R$id.screenThreeDsVerification_recyclerView, null, null, null, 56);
                    case 2:
                        ThreeDsVerificationController.Companion companion3 = ThreeDsVerificationController.INSTANCE;
                        return (j60.a) ((yre.g) threeDsVerificationController.M.getValue()).d.get();
                    case 3:
                        if (threeDsVerificationController.K.f90407b) {
                            ViewBinding value = threeDsVerificationController.Q.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new b((jii.c0) value);
                        }
                        ViewBinding value2 = threeDsVerificationController.P.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new b((wre.a) value2);
                    default:
                        ThreeDsVerificationController.Companion companion4 = ThreeDsVerificationController.INSTANCE;
                        return (i0) ((yre.g) threeDsVerificationController.M.getValue()).i.get();
                }
            }
        });
        this.P = s.t(this, ise.d.f);
        this.Q = s.t(this, ise.c.f);
        final int i3 = 3;
        this.R = w.y0(new Function0(this) { // from class: ise.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationController f168187b;

            {
                this.f168187b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ThreeDsVerificationController threeDsVerificationController = this.f168187b;
                switch (i22) {
                    case 0:
                        ThreeDsVerificationController.Companion companion2 = ThreeDsVerificationController.INSTANCE;
                        qji.b bVarU2 = threeDsVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.sceen.di.ThreeDsVerificationScreenInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = threeDsVerificationController.K;
                        threeDsVerificationScreenContract$InputData.getClass();
                        return new yre.g(eVar, fVar2, threeDsVerificationController, threeDsVerificationScreenContract$InputData);
                    case 1:
                        ThreeDsVerificationController.Companion companion22 = ThreeDsVerificationController.INSTANCE;
                        ThreeDsVerificationController threeDsVerificationController2 = this.f168187b;
                        return dli.f.a(threeDsVerificationController2, threeDsVerificationController2.R2(), zhm.v.k(new TwoLogosHeaderDelegate(), new TimerDelegate(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), (RowDelegate) threeDsVerificationController2.W.getValue(), new CounterTextDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) threeDsVerificationController2.T.getValue(), (PromptMarketingContentDelegate) threeDsVerificationController2.U.getValue(), (CellDetailsActionDelegate) threeDsVerificationController2.V.getValue(), (TextDelegate) threeDsVerificationController2.X.getValue(), new ListCellDelegate(), new ListSubheaderDelegate()), threeDsVerificationController2.K.f90407b ? R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView : com.revolut.feature.three_ds_verification.impl.R$id.screenThreeDsVerification_recyclerView, null, null, null, 56);
                    case 2:
                        ThreeDsVerificationController.Companion companion3 = ThreeDsVerificationController.INSTANCE;
                        return (j60.a) ((yre.g) threeDsVerificationController.M.getValue()).d.get();
                    case 3:
                        if (threeDsVerificationController.K.f90407b) {
                            ViewBinding value = threeDsVerificationController.Q.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new b((jii.c0) value);
                        }
                        ViewBinding value2 = threeDsVerificationController.P.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new b((wre.a) value2);
                    default:
                        ThreeDsVerificationController.Companion companion4 = ThreeDsVerificationController.INSTANCE;
                        return (i0) ((yre.g) threeDsVerificationController.M.getValue()).i.get();
                }
            }
        });
        final int i5 = 4;
        this.S = w.y0(new Function0(this) { // from class: ise.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationController f168187b;

            {
                this.f168187b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ThreeDsVerificationController threeDsVerificationController = this.f168187b;
                switch (i22) {
                    case 0:
                        ThreeDsVerificationController.Companion companion2 = ThreeDsVerificationController.INSTANCE;
                        qji.b bVarU2 = threeDsVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.sceen.di.ThreeDsVerificationScreenInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = threeDsVerificationController.K;
                        threeDsVerificationScreenContract$InputData.getClass();
                        return new yre.g(eVar, fVar2, threeDsVerificationController, threeDsVerificationScreenContract$InputData);
                    case 1:
                        ThreeDsVerificationController.Companion companion22 = ThreeDsVerificationController.INSTANCE;
                        ThreeDsVerificationController threeDsVerificationController2 = this.f168187b;
                        return dli.f.a(threeDsVerificationController2, threeDsVerificationController2.R2(), zhm.v.k(new TwoLogosHeaderDelegate(), new TimerDelegate(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), (RowDelegate) threeDsVerificationController2.W.getValue(), new CounterTextDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) threeDsVerificationController2.T.getValue(), (PromptMarketingContentDelegate) threeDsVerificationController2.U.getValue(), (CellDetailsActionDelegate) threeDsVerificationController2.V.getValue(), (TextDelegate) threeDsVerificationController2.X.getValue(), new ListCellDelegate(), new ListSubheaderDelegate()), threeDsVerificationController2.K.f90407b ? R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView : com.revolut.feature.three_ds_verification.impl.R$id.screenThreeDsVerification_recyclerView, null, null, null, 56);
                    case 2:
                        ThreeDsVerificationController.Companion companion3 = ThreeDsVerificationController.INSTANCE;
                        return (j60.a) ((yre.g) threeDsVerificationController.M.getValue()).d.get();
                    case 3:
                        if (threeDsVerificationController.K.f90407b) {
                            ViewBinding value = threeDsVerificationController.Q.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new b((jii.c0) value);
                        }
                        ViewBinding value2 = threeDsVerificationController.P.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new b((wre.a) value2);
                    default:
                        ThreeDsVerificationController.Companion companion4 = ThreeDsVerificationController.INSTANCE;
                        return (i0) ((yre.g) threeDsVerificationController.M.getValue()).i.get();
                }
            }
        });
        this.T = w.y0(new is7.b(7));
        this.U = w.y0(new is7.b(8));
        this.V = w.y0(new is7.b(9));
        this.W = w.y0(new is7.b(10));
        this.X = w.y0(new is7.b(11));
        final int i6 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ise.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsVerificationController f168187b;

            {
                this.f168187b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ThreeDsVerificationController threeDsVerificationController = this.f168187b;
                switch (i22) {
                    case 0:
                        ThreeDsVerificationController.Companion companion2 = ThreeDsVerificationController.INSTANCE;
                        qji.b bVarU2 = threeDsVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.three_ds_verification.impl.ui.sceen.di.ThreeDsVerificationScreenInjector");
                        yre.f fVar = (yre.f) bVarU2;
                        yre.e eVar = fVar.f316309b;
                        yre.f fVar2 = fVar.f316310c;
                        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = threeDsVerificationController.K;
                        threeDsVerificationScreenContract$InputData.getClass();
                        return new yre.g(eVar, fVar2, threeDsVerificationController, threeDsVerificationScreenContract$InputData);
                    case 1:
                        ThreeDsVerificationController.Companion companion22 = ThreeDsVerificationController.INSTANCE;
                        ThreeDsVerificationController threeDsVerificationController2 = this.f168187b;
                        return dli.f.a(threeDsVerificationController2, threeDsVerificationController2.R2(), zhm.v.k(new TwoLogosHeaderDelegate(), new TimerDelegate(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), (RowDelegate) threeDsVerificationController2.W.getValue(), new CounterTextDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) threeDsVerificationController2.T.getValue(), (PromptMarketingContentDelegate) threeDsVerificationController2.U.getValue(), (CellDetailsActionDelegate) threeDsVerificationController2.V.getValue(), (TextDelegate) threeDsVerificationController2.X.getValue(), new ListCellDelegate(), new ListSubheaderDelegate()), threeDsVerificationController2.K.f90407b ? R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView : com.revolut.feature.three_ds_verification.impl.R$id.screenThreeDsVerification_recyclerView, null, null, null, 56);
                    case 2:
                        ThreeDsVerificationController.Companion companion3 = ThreeDsVerificationController.INSTANCE;
                        return (j60.a) ((yre.g) threeDsVerificationController.M.getValue()).d.get();
                    case 3:
                        if (threeDsVerificationController.K.f90407b) {
                            ViewBinding value = threeDsVerificationController.Q.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new b((jii.c0) value);
                        }
                        ViewBinding value2 = threeDsVerificationController.P.getValue(threeDsVerificationController, ThreeDsVerificationController.f90405a0[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new b((wre.a) value2);
                    default:
                        ThreeDsVerificationController.Companion companion4 = ThreeDsVerificationController.INSTANCE;
                        return (i0) ((yre.g) threeDsVerificationController.M.getValue()).i.get();
                }
            }
        });
        this.Z = w.y0(new is7.b(6));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) throws IOException {
        ThreeDsVerificationController threeDsVerificationController;
        ActionFooterView actionFooterViewA;
        g0 g0Var;
        e eVar;
        NavBarWithBigTile navBarWithBigTileB;
        ise.p0 uiState = (ise.p0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ise.o0 o0Var = qVar instanceof ise.o0 ? (ise.o0) qVar : null;
        dli.a.z0(uiState);
        i iVar = uiState.f;
        ise.h0 h0Var = uiState.f168230c;
        ise.h0 h0Var2 = uiState.f168229b;
        boolean zK = pd.b.k(o0Var != null ? Boolean.valueOf(o0Var.d) : null);
        boolean zK2 = pd.b.k(o0Var != null ? Boolean.valueOf(o0Var.f168222a) : null);
        boolean zK3 = pd.b.k(o0Var != null ? Boolean.valueOf(o0Var.f168223b) : null);
        boolean zK4 = pd.b.k(o0Var != null ? Boolean.valueOf(o0Var.f168224c) : null);
        boolean zK5 = pd.b.k(o0Var != null ? Boolean.valueOf(o0Var.e) : null);
        if (zK && (eVar = uiState.e) != null && (navBarWithBigTileB = d3().b()) != null) {
            if (eVar.equals(e.a.f90436a)) {
                navBarWithBigTileB.setLoadingState(true);
            } else if (eVar.equals(e.b.f90437a)) {
                navBarWithBigTileB.setLoadingState(false);
                navBarWithBigTileB.setAvatar(null, r0.DEFAULT);
                navBarWithBigTileB.setActionStatusLabel(null);
                c1.S(navBarWithBigTileB, f0.f322471a, null, null, 6);
            } else {
                if (!(eVar instanceof k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithBigTileB.setLoadingState(false);
                k0 k0Var = (k0) eVar;
                navBarWithBigTileB.setAvatar(k0Var.f168209b, r0.BLURRED_BACKGROUND);
                navBarWithBigTileB.setActionStatusLabel(k0Var.f168210c);
                c1.S(navBarWithBigTileB, u.c(k0Var.d), null, null, 6);
            }
        }
        if (!zK4 || (g0Var = uiState.d) == null) {
            threeDsVerificationController = this;
        } else {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            PendingThreeDsContext.a aVarNewBuilder = PendingThreeDsContext.newBuilder();
            String str = g0Var.f168195a;
            if (str == null) {
                str = "no_transaction";
            }
            aVarNewBuilder.c();
            ((PendingThreeDsContext) aVarNewBuilder.f49761b).setTransactionId(str);
            aim.e eVarB = u.b();
            List list = g0Var.f168196b;
            if (list != null) {
                eVarB.addAll(list);
            }
            List list2 = g0Var.f168197c;
            if (list2 != null) {
                eVarB.addAll(list2);
            }
            Unit unit = Unit.f186387a;
            String strK0 = d0.k0(u.a(eVarB), ",", null, null, 0, null, 62);
            aVarNewBuilder.c();
            ((PendingThreeDsContext) aVarNewBuilder.f49761b).setWarnings(strK0);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            AnalyticsContext analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            threeDsVerificationController = this;
            threeDsVerificationController.N = analyticsContext;
        }
        if (zK2 || zK3) {
            LargeActionButton largeActionButtonC = threeDsVerificationController.d3().c();
            if (largeActionButtonC != null) {
                largeActionButtonC.setText(h0Var2.f168198a);
                largeActionButtonC.setEnabled(h0Var2.f168199b);
            }
            LargeActionButton largeActionButtonD = threeDsVerificationController.d3().d();
            if (largeActionButtonD != null) {
                largeActionButtonD.setText(h0Var.f168198a);
                largeActionButtonD.setEnabled(h0Var.f168199b);
            }
        }
        if (!zK5 || (actionFooterViewA = threeDsVerificationController.d3().a()) == null) {
            return;
        }
        actionFooterViewA.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterViewA.setModel(iVar);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d dVar = (d) R2();
        if (((j0) ((j2) dVar.M.f22677a).getValue()).f168201b.getContent() != null) {
            dVar.N2();
            return true;
        }
        dVar.C2(f.a.f90438a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yre.g) this.M.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.O.getValue()).d(u.c((LargeActionButtonDelegate) this.Z.getValue()));
        LargeActionButton largeActionButtonC = d3().c();
        if (largeActionButtonC != null) {
            largeActionButtonC.setEnabled(false);
            largeActionButtonC.o(LargeActionButton.ButtonStyle.f58725a);
            largeActionButtonC.setText(new TextLocalisedClause(R$string.transaction_threeds_confirm, null, null, 14));
        }
        LargeActionButton largeActionButtonD = d3().d();
        if (largeActionButtonD != null) {
            largeActionButtonD.setEnabled(false);
            largeActionButtonD.o(LargeActionButton.ButtonStyle.o);
            largeActionButtonD.setText(new TextLocalisedClause(R$string.transaction_threeds_reject, null, null, 14));
        }
        NavBarWithBigTile navBarWithBigTileB = d3().b();
        if (navBarWithBigTileB != null) {
            navBarWithBigTileB.setNavigationButtonIcon((Image) null);
            navBarWithBigTileB.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
            navBarWithBigTileB.setTitleStyle(b1.LARGE_SINGLE_LINE);
            navBarWithBigTileB.setHeightMode(p2.f275222a);
            navBarWithBigTileB.setAlwaysShowToolbar(true);
        }
        if (this.K.f90407b) {
            ViewBinding value = this.Q.getValue(this, f90405a0[1]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((c0) value).d.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        }
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        ihm.f fVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButtonC = d3().c();
        if (largeActionButtonC != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButtonC.o), null, new ise.e(this, null, 0), 3);
        }
        LargeActionButton largeActionButtonD = d3().d();
        if (largeActionButtonD != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButtonD.o), null, new ise.e(this, null, 2), 3);
        }
        ActionFooterView actionFooterViewA = d3().a();
        if (actionFooterViewA != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(actionFooterViewA.f), null, new ise.e(this, null, 3), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(actionFooterViewA.f58955g), null, new ise.e(this, null, 4), 3);
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Z.getValue()).d.f121375b), null, new ise.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), null, new ise.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) this.U.getValue()).f.f121375b), null, new ise.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.W.getValue()).f53218h), null, new ise.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.V.getValue()).d), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.X.getValue()).d), null, new ibg.g(this, null, 27), 3);
        NavBarWithBigTile navBarWithBigTileB = d3().b();
        if (navBarWithBigTileB == null || (fVar = navBarWithBigTileB.f59357t) == null) {
            return;
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fVar), null, new ise.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ise.b d3() {
        return (ise.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i0 R2() {
        return (i0) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return this.K.f90407b ? R$layout.screen_recycler_navbarwithbigtile_actionfooter : com.revolut.feature.three_ds_verification.impl.R$layout.screen_three_ds_verification;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
