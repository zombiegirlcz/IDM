package kx4;

import android.content.res.Resources;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.ReferralStatusDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.recyclerkit.R$dimen;
import dx4.c3;
import dx4.d3;
import dx4.j3;
import dx4.k3;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 extends cx4.b {
    public final CellDetailsSwitcherDelegate A;
    public final InputSliderDelegate B;
    public final CellDetailsChevronDelegate C;
    public final SuggestionsBarDelegate D;
    public final ConditionalAmountDelegate E;
    public final SmallActionButtonDelegate F;
    public final HighlightTileDelegate G;
    public final CenteredContentTileDelegate H;
    public final CenteredAmountDelegate I;
    public final ProgressStepVerticalV2Delegate J;
    public final Object K;
    public final Object L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f190414c;
    public final qd0.b d;
    public final PlainTextDelegate e;
    public final InputChecklistDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RowDelegate f190415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ListCellDelegate f190416h;
    public final CellDetailsDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CellDetailsNoteDelegate f190417j;
    public final CellDetailsStandaloneNoteDelegate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExpandableCellDelegate f190418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SelectableDelegate f190419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextDelegate f190420n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BannerDelegate f190421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PlanTileDelegate f190422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f190423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f190424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ksb.a f190425t;
    public final c u;
    public final Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ListSubheaderDelegate f190426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CounterTextDelegate f190427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BigTileDelegate f190428y;
    public final ReferralStatusDelegate z;

    /* JADX WARN: Type inference failed for: r2v12, types: [kx4.c] */
    public r0(com.revolut.kompot.navigable.a controller, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f190414c = controller;
        this.d = languageProvider;
        this.e = new PlainTextDelegate();
        this.f = new InputChecklistDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f190415g = rowDelegate;
        this.f190416h = new ListCellDelegate();
        this.i = new CellDetailsDelegate();
        this.f190417j = new CellDetailsNoteDelegate();
        this.k = new CellDetailsStandaloneNoteDelegate();
        this.f190418l = new ExpandableCellDelegate();
        this.f190419m = new SelectableDelegate(rowDelegate);
        this.f190420n = new TextDelegate();
        final int i = 0;
        this.o = te0.w.y0(new Function0(this) { // from class: kx4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190383b;

            {
                this.f190383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                r0 r0Var = this.f190383b;
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.a aVar = r0Var.f190414c;
                        Resources resources = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.dp_32);
                        Resources resources2 = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        return new NewRevolutCardDelegate(resources2.getDisplayMetrics().widthPixels - dimensionPixelSize);
                    case 1:
                        return new InputTextDelegate(r0Var.u);
                    case 2:
                        return new u80.d(((s80.b) r0Var.d).b());
                    default:
                        return zhm.v.k(new GridBoxDelegate(zhm.v.k(r0Var.f190427x, r0Var.H), 16.0f, 8.0f, 2), r0Var.f190427x, r0Var.f, r0Var.f190415g, r0Var.f190416h, r0Var.i, r0Var.f190417j, r0Var.k, r0Var.f190420n, (NewRevolutCardDelegate) r0Var.o.getValue(), r0Var.f190418l, r0Var.f190428y, r0Var.e, r0Var.f190426w, (InputTextDelegate) r0Var.v.getValue(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new PlainTextWarningDelegate(), r0Var.f190419m, r0Var.f190421p, r0Var.z, r0Var.A, r0Var.B, r0Var.C, new ActionWidgetDelegate(), r0Var.D, r0Var.E, r0Var.F, r0Var.G, r0Var.f190422q, new NotificationCentreItemDelegate(), r0Var.J, r0Var.I);
                }
            }
        });
        this.f190421p = new BannerDelegate();
        this.f190422q = new PlanTileDelegate(0);
        this.f190423r = v0.a.d("create(...)");
        this.f190424s = v0.a.d("create(...)");
        this.f190425t = new ksb.a(this, 17);
        final int i2 = 0;
        this.u = new Function2(this) { // from class: kx4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190387b;

            {
                this.f190387b = this;
            }

            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object pVar;
                switch (i2) {
                    case 0:
                        InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                        InputText field = (InputText) obj3;
                        Intrinsics.checkNotNullParameter(input, "input");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = input.P;
                        k3 k3Var = obj4 instanceof k3 ? (k3) obj4 : null;
                        j3 j3Var = k3Var != null ? k3Var.d : null;
                        boolean z = j3Var instanceof d3;
                        r0 r0Var = this.f190387b;
                        if (z) {
                            String str = input.f52580a;
                            MaskedTextInputEditText innerEditText = field.getInnerEditText();
                            String str2 = ((d3) j3Var).f120576c;
                            if (str2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            pVar = new zp0.y(innerEditText, null, str2, r0Var.f190425t, str, null, false, 98);
                        } else {
                            if (!(j3Var instanceof c3)) {
                                return null;
                            }
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            pVar = new zp0.p(locale, field.getInnerEditText(), new du.l(r0Var, input), ((c3) j3Var).f120566b, false, true, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW);
                        }
                        return pVar;
                    default:
                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                        CenteredAmountView field2 = (CenteredAmountView) obj3;
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        MaskedTextInputEditText editText = field2.getEditText();
                        Object obj5 = data.f51981p;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                        return new zp0.d(editText, (xi0.b) obj5, (u80.d) this.f190387b.K.getValue(), null, null, true, true, 0, false, null, 1944);
                }
            }
        };
        final int i3 = 1;
        this.v = te0.w.y0(new Function0(this) { // from class: kx4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190383b;

            {
                this.f190383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                r0 r0Var = this.f190383b;
                switch (i22) {
                    case 0:
                        com.revolut.kompot.navigable.a aVar = r0Var.f190414c;
                        Resources resources = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.dp_32);
                        Resources resources2 = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        return new NewRevolutCardDelegate(resources2.getDisplayMetrics().widthPixels - dimensionPixelSize);
                    case 1:
                        return new InputTextDelegate(r0Var.u);
                    case 2:
                        return new u80.d(((s80.b) r0Var.d).b());
                    default:
                        return zhm.v.k(new GridBoxDelegate(zhm.v.k(r0Var.f190427x, r0Var.H), 16.0f, 8.0f, 2), r0Var.f190427x, r0Var.f, r0Var.f190415g, r0Var.f190416h, r0Var.i, r0Var.f190417j, r0Var.k, r0Var.f190420n, (NewRevolutCardDelegate) r0Var.o.getValue(), r0Var.f190418l, r0Var.f190428y, r0Var.e, r0Var.f190426w, (InputTextDelegate) r0Var.v.getValue(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new PlainTextWarningDelegate(), r0Var.f190419m, r0Var.f190421p, r0Var.z, r0Var.A, r0Var.B, r0Var.C, new ActionWidgetDelegate(), r0Var.D, r0Var.E, r0Var.F, r0Var.G, r0Var.f190422q, new NotificationCentreItemDelegate(), r0Var.J, r0Var.I);
                }
            }
        });
        this.f190426w = new ListSubheaderDelegate();
        this.f190427x = new CounterTextDelegate();
        this.f190428y = new BigTileDelegate();
        this.z = new ReferralStatusDelegate();
        this.A = new CellDetailsSwitcherDelegate();
        this.B = new InputSliderDelegate();
        this.C = new CellDetailsChevronDelegate();
        this.D = new SuggestionsBarDelegate();
        this.E = new ConditionalAmountDelegate(null);
        this.F = new SmallActionButtonDelegate();
        this.G = new HighlightTileDelegate();
        this.H = new CenteredContentTileDelegate();
        final int i5 = 1;
        this.I = new CenteredAmountDelegate(new Function2(this) { // from class: kx4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190387b;

            {
                this.f190387b = this;
            }

            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object pVar;
                switch (i5) {
                    case 0:
                        InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                        InputText field = (InputText) obj3;
                        Intrinsics.checkNotNullParameter(input, "input");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = input.P;
                        k3 k3Var = obj4 instanceof k3 ? (k3) obj4 : null;
                        j3 j3Var = k3Var != null ? k3Var.d : null;
                        boolean z = j3Var instanceof d3;
                        r0 r0Var = this.f190387b;
                        if (z) {
                            String str = input.f52580a;
                            MaskedTextInputEditText innerEditText = field.getInnerEditText();
                            String str2 = ((d3) j3Var).f120576c;
                            if (str2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            pVar = new zp0.y(innerEditText, null, str2, r0Var.f190425t, str, null, false, 98);
                        } else {
                            if (!(j3Var instanceof c3)) {
                                return null;
                            }
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            pVar = new zp0.p(locale, field.getInnerEditText(), new du.l(r0Var, input), ((c3) j3Var).f120566b, false, true, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW);
                        }
                        return pVar;
                    default:
                        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                        CenteredAmountView field2 = (CenteredAmountView) obj3;
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        MaskedTextInputEditText editText = field2.getEditText();
                        Object obj5 = data.f51981p;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                        return new zp0.d(editText, (xi0.b) obj5, (u80.d) this.f190387b.K.getValue(), null, null, true, true, 0, false, null, 1944);
                }
            }
        });
        this.J = new ProgressStepVerticalV2Delegate();
        final int i6 = 2;
        this.K = te0.w.y0(new Function0(this) { // from class: kx4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190383b;

            {
                this.f190383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                r0 r0Var = this.f190383b;
                switch (i22) {
                    case 0:
                        com.revolut.kompot.navigable.a aVar = r0Var.f190414c;
                        Resources resources = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.dp_32);
                        Resources resources2 = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        return new NewRevolutCardDelegate(resources2.getDisplayMetrics().widthPixels - dimensionPixelSize);
                    case 1:
                        return new InputTextDelegate(r0Var.u);
                    case 2:
                        return new u80.d(((s80.b) r0Var.d).b());
                    default:
                        return zhm.v.k(new GridBoxDelegate(zhm.v.k(r0Var.f190427x, r0Var.H), 16.0f, 8.0f, 2), r0Var.f190427x, r0Var.f, r0Var.f190415g, r0Var.f190416h, r0Var.i, r0Var.f190417j, r0Var.k, r0Var.f190420n, (NewRevolutCardDelegate) r0Var.o.getValue(), r0Var.f190418l, r0Var.f190428y, r0Var.e, r0Var.f190426w, (InputTextDelegate) r0Var.v.getValue(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new PlainTextWarningDelegate(), r0Var.f190419m, r0Var.f190421p, r0Var.z, r0Var.A, r0Var.B, r0Var.C, new ActionWidgetDelegate(), r0Var.D, r0Var.E, r0Var.F, r0Var.G, r0Var.f190422q, new NotificationCentreItemDelegate(), r0Var.J, r0Var.I);
                }
            }
        });
        final int i21 = 3;
        this.L = te0.w.y0(new Function0(this) { // from class: kx4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f190383b;

            {
                this.f190383b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                r0 r0Var = this.f190383b;
                switch (i22) {
                    case 0:
                        com.revolut.kompot.navigable.a aVar = r0Var.f190414c;
                        Resources resources = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.dp_32);
                        Resources resources2 = aVar.m2().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        return new NewRevolutCardDelegate(resources2.getDisplayMetrics().widthPixels - dimensionPixelSize);
                    case 1:
                        return new InputTextDelegate(r0Var.u);
                    case 2:
                        return new u80.d(((s80.b) r0Var.d).b());
                    default:
                        return zhm.v.k(new GridBoxDelegate(zhm.v.k(r0Var.f190427x, r0Var.H), 16.0f, 8.0f, 2), r0Var.f190427x, r0Var.f, r0Var.f190415g, r0Var.f190416h, r0Var.i, r0Var.f190417j, r0Var.k, r0Var.f190420n, (NewRevolutCardDelegate) r0Var.o.getValue(), r0Var.f190418l, r0Var.f190428y, r0Var.e, r0Var.f190426w, (InputTextDelegate) r0Var.v.getValue(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new PlainTextWarningDelegate(), r0Var.f190419m, r0Var.f190421p, r0Var.z, r0Var.A, r0Var.B, r0Var.C, new ActionWidgetDelegate(), r0Var.D, r0Var.E, r0Var.F, r0Var.G, r0Var.f190422q, new NotificationCentreItemDelegate(), r0Var.J, r0Var.I);
                }
            }
        });
    }

    public static final ax4.d R(r0 r0Var) {
        yji.o oVar = r0Var.f190414c;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.di.CreditConstructorScreenInjector");
        return ((bx4.b) oVar).a();
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        CellDetailsDelegate cellDetailsDelegate = this.i;
        Continuation continuation = null;
        yji.d.H(this, new kvl.o(rd0.e.b(cellDetailsDelegate.d), 15), new k0(this, continuation, 9), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.f190416h.d), 4), new k0(this, continuation, 22), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(cellDetailsDelegate.e), 26), new q0(this, continuation, 2), 3);
        CounterTextDelegate counterTextDelegate = this.f190427x;
        yji.d.H(this, new kvl.o(rd0.e.b(counterTextDelegate.e), 28), new q0(this, continuation, 5), 3);
        int i = 0;
        yji.d.H(this, new kvl.o(rd0.e.b(counterTextDelegate.d), 29), new k0(this, continuation, i), 3);
        yji.d.H(this, new f0(rd0.e.b(this.f190417j.f), i), new k0(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(this.f190418l.f52255c), new l0(this, null), 3);
        RowDelegate rowDelegate = this.f190415g;
        yji.d.H(this, new f0(rd0.e.b(rowDelegate.k), 1), new k0(this, continuation, 2), 3);
        ihm.f fVar = rowDelegate.k;
        yji.d.H(this, new f0(rd0.e.b(fVar), 2), new k0(this, continuation, 3), 3);
        SelectableDelegate selectableDelegate = this.f190419m;
        yji.d.H(this, new f0(rd0.e.b(selectableDelegate.r()), 3), new k0(this, continuation, 4), 3);
        yji.d.H(this, new f0(rd0.e.b(selectableDelegate.r()), 4), new k0(this, continuation, 5), 3);
        ?? r2 = this.v;
        yji.d.H(this, rd0.e.b(((InputTextDelegate) r2.getValue()).f52575g.f121375b), new m0(this, null), 3);
        yji.d.H(this, rd0.e.b(((InputTextDelegate) r2.getValue()).e.f121375b), new n0(this, null), 3);
        InputChecklistDelegate inputChecklistDelegate = this.f;
        yji.d.H(this, new kvl.o(rd0.e.b(inputChecklistDelegate.f52518c), 5), new k0(this, continuation, 6), 3);
        yji.d.H(this, rd0.e.b(inputChecklistDelegate.p()), new k0(this, continuation, 7), 3);
        ihm.f fVar2 = rowDelegate.f53218h;
        yji.d.H(this, new kvl.o(wp5.y.x(fVar2, fVar, "mergeWith(...)"), 6), new k0(this, continuation, 8), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(fVar2), 7), new k0(this, continuation, 10), 3);
        yji.d.H(this, rd0.e.b(fVar2), new o0(this, null), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(rowDelegate.f53220l), 8), new k0(this, continuation, 11), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.z.f53176c), 9), new k0(this, continuation, 12), 3);
        yji.d.H(this, rd0.e.b(rowDelegate.f53226s), new k0(this, continuation, 13), 3);
        yji.d.H(this, rd0.e.b(this.f190420n.d), new k0(this, continuation, 14), 3);
        yji.d.H(this, rd0.e.b(this.f190423r), new k0(this, continuation, 15), 3);
        yji.d.H(this, rd0.e.b(this.f190424s), new k0(this, continuation, 16), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.f190421p.f51699c), 10), new k0(this, continuation, 17), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.f190426w.d), 11), new k0(this, continuation, 18), 3);
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = this.A;
        yji.d.H(this, new kvl.o(rd0.e.b(cellDetailsSwitcherDelegate.d), 12), new k0(this, continuation, 19), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(cellDetailsSwitcherDelegate.f51912c), 13), new k0(this, continuation, 20), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(rowDelegate.f53225r), 14), new k0(this, continuation, 21), 3);
        InputSliderDelegate inputSliderDelegate = this.B;
        efm.r rVarFilter = inputSliderDelegate.f52559c.filter(new ksb.a(new kvg.j(28), 18));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.d.H(this, rd0.e.b(rVarFilter), new p0(this, null), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(inputSliderDelegate.e), 16), new k0(this, continuation, 23), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(inputSliderDelegate.d), 17), new k0(this, continuation, 24), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.e.f.f121375b), 18), new k0(this, continuation, 25), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.C.f51821c), 19), new k0(this, continuation, 26), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.H.e), 20), new k0(this, continuation, 27), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.D.p().d), 21), new k0(this, continuation, 28), 3);
        ConditionalAmountDelegate conditionalAmountDelegate = this.E;
        yji.d.H(this, new kvl.o(h30.l.y(conditionalAmountDelegate.d.f121375b, conditionalAmountDelegate.e.f121375b, "merge(...)"), 22), new k0(this, continuation, 29), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.F.f53336c.f121375b), 23), new q0(this, continuation, 0), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.G.f52437c), 24), new q0(this, continuation, 1), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.f190422q.d), 25), new q0(this, continuation, 3), 3);
        yji.d.H(this, new kvl.o(rd0.e.b(this.J.d), 27), new q0(this, continuation, 4), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cx4.b
    public final List Q() {
        return (List) this.L.getValue();
    }
}
