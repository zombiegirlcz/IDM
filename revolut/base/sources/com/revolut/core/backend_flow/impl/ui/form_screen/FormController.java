package com.revolut.core.backend_flow.impl.ui.form_screen;

import android.view.View;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RateNPSDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.YearPickerDelegate;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.uicomponent.products.ExternalCardDelegate;
import com.revolut.uicomponent.products.ImageDelegate;
import efm.r;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import l9j.k;
import lak.i;
import lb0.d;
import lb0.g;
import lb0.h;
import lb0.j;
import lb0.l;
import lb0.m;
import lb0.n;
import lb0.o;
import lb0.p;
import te0.w;
import vkm.q;
import xki.e;
import zc0.d3;
import zc0.g3;
import zc0.p3;
import zc0.v3;
import zc0.w3;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormController;", "Lcom/revolut/core/backend_flow/impl/ui/base_form_screen/BaseFormController;", "Llb0/p;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormController extends BaseFormController<p> {
    public static final /* synthetic */ int D0 = 0;
    public final CellDetailsDelegate A0;
    public final Object B0;
    public final List C0;
    public final Object V;
    public final Object W;
    public final Object X;
    public final ActionsDelegate Y;
    public final WebViewDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputDisclosureDelegate f51264a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InputChecklistDelegate f51265b0;
    public final f c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputTextDelegate f51266d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f51267e0;
    public final YearPickerDelegate f0;
    public final RateNPSDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final MonthPickerDelegate f51268h0;
    public final PhoneEditorDelegate i0;
    public final f j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final f f51269k0;
    public final AmountEditDelegate l0;
    public final DatePickerDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final SwipeToActionDelegate f51270n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final SelectableDelegate f51271o0;
    public final SelectableDelegate p0;
    public final ProductSelectionDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PlainTextWarningDelegate f51272r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final FullScreenStateDelegate f51273s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final NotificationCentreItemDelegate f51274t0;
    public final ListSubheaderDelegate u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final FiltersDelegate f51275v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ExternalCardDelegate f51276w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f51277x0;
    public final ProgressStepVerticalDelegate y0;
    public final ProgressStepVerticalV2Delegate z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormController(FormScreen screen) {
        super(screen);
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.V = w.y0(new kpl.b(this, screen, 24));
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: lb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193520b;

            {
                this.f193520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FormController formController = this.f193520b;
                switch (i2) {
                    case 0:
                        int i3 = FormController.D0;
                        return ((nb0.a) formController.V.getValue()).n();
                    case 1:
                        int i5 = FormController.D0;
                        return new u80.d(((s80.b) ((nb0.a) formController.V.getValue()).i()).b());
                    case 2:
                        int i6 = FormController.D0;
                        return zhm.v.k(new ImageDelegate(jh.d.f(formController.m2()).Q()), formController.f51276w0);
                    default:
                        return zhm.d0.E0((List) formController.f51277x0.getValue(), zhm.v.k(formController.Y, formController.l0, formController.m0, formController.f51273s0, formController.f51265b0, formController.f51264a0, formController.f51266d0, formController.N, formController.f51268h0, formController.i0, formController.f51272r0, formController.q0, formController.g0, formController.O, formController.f51270n0, formController.p0, formController.f51271o0, formController.Z, formController.f0, formController.y0, formController.z0, formController.f51274t0, formController.u0, formController.f51275v0, formController.P, formController.Q, formController.A0, new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), new TextDelegate()));
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: lb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193520b;

            {
                this.f193520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FormController formController = this.f193520b;
                switch (i22) {
                    case 0:
                        int i3 = FormController.D0;
                        return ((nb0.a) formController.V.getValue()).n();
                    case 1:
                        int i5 = FormController.D0;
                        return new u80.d(((s80.b) ((nb0.a) formController.V.getValue()).i()).b());
                    case 2:
                        int i6 = FormController.D0;
                        return zhm.v.k(new ImageDelegate(jh.d.f(formController.m2()).Q()), formController.f51276w0);
                    default:
                        return zhm.d0.E0((List) formController.f51277x0.getValue(), zhm.v.k(formController.Y, formController.l0, formController.m0, formController.f51273s0, formController.f51265b0, formController.f51264a0, formController.f51266d0, formController.N, formController.f51268h0, formController.i0, formController.f51272r0, formController.q0, formController.g0, formController.O, formController.f51270n0, formController.p0, formController.f51271o0, formController.Z, formController.f0, formController.y0, formController.z0, formController.f51274t0, formController.u0, formController.f51275v0, formController.P, formController.Q, formController.A0, new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), new TextDelegate()));
                }
            }
        });
        this.Y = new ActionsDelegate();
        this.Z = new WebViewDelegate();
        this.f51264a0 = new InputDisclosureDelegate();
        this.f51265b0 = new InputChecklistDelegate();
        this.c0 = v0.a.d("create(...)");
        final int i3 = 0;
        this.f51266d0 = new InputTextDelegate(new Function2(this) { // from class: lb0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193522b;

            {
                this.f193522b = this;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i3;
                FormController formController = this.f193522b;
                switch (i5) {
                    case 0:
                        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                        InputText field = (InputText) obj3;
                        int i6 = FormController.D0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = model.P;
                        if (obj4 instanceof p3) {
                            return new zp0.d(field.getInnerEditText(), ((p3) obj4).f321107c, (u80.d) formController.X.getValue(), null, null, false, false, 0, false, null, 1912);
                        }
                        if (obj4 instanceof d3) {
                            return new g3(((s80.b) ((nb0.a) formController.V.getValue()).i()).b(), field, new l9k.v(formController, model, 3), ((d3) obj4).f321037c);
                        }
                        if (obj4 instanceof v3) {
                            String str = ((v3) obj4).f321143b;
                            if (str != null) {
                                List listC = zhm.u.c(zp0.m.a());
                                return new zp0.y(field.getInnerEditText(), listC, str, new lak.i(formController, 10), model.f52580a, null, false, 96);
                            }
                        } else if (obj4 instanceof w3) {
                            return new zp0.b0(field.getInnerEditText(), new khg.s(formController, 24, model, field));
                        }
                        return null;
                    default:
                        AmountEditDelegate.Model data = (AmountEditDelegate.Model) obj2;
                        AmountEditView field2 = (AmountEditView) obj3;
                        int i21 = FormController.D0;
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        MaskedTextInputEditText editText = field2.getEditText();
                        Object obj5 = data.f51629j;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                        return new zp0.d(editText, (xi0.b) obj5, (u80.d) formController.X.getValue(), null, new c(formController, data), false, false, 0, false, null, 1928);
                }
            }
        });
        this.f51267e0 = v0.a.d("create(...)");
        this.f0 = new YearPickerDelegate();
        this.g0 = new RateNPSDelegate();
        this.f51268h0 = new MonthPickerDelegate();
        this.i0 = new PhoneEditorDelegate();
        this.j0 = v0.a.d("create(...)");
        this.f51269k0 = v0.a.d("create(...)");
        final int i5 = 1;
        this.l0 = new AmountEditDelegate(new Function2(this) { // from class: lb0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193522b;

            {
                this.f193522b = this;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i5;
                FormController formController = this.f193522b;
                switch (i59) {
                    case 0:
                        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                        InputText field = (InputText) obj3;
                        int i6 = FormController.D0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(field, "field");
                        Object obj4 = model.P;
                        if (obj4 instanceof p3) {
                            return new zp0.d(field.getInnerEditText(), ((p3) obj4).f321107c, (u80.d) formController.X.getValue(), null, null, false, false, 0, false, null, 1912);
                        }
                        if (obj4 instanceof d3) {
                            return new g3(((s80.b) ((nb0.a) formController.V.getValue()).i()).b(), field, new l9k.v(formController, model, 3), ((d3) obj4).f321037c);
                        }
                        if (obj4 instanceof v3) {
                            String str = ((v3) obj4).f321143b;
                            if (str != null) {
                                List listC = zhm.u.c(zp0.m.a());
                                return new zp0.y(field.getInnerEditText(), listC, str, new lak.i(formController, 10), model.f52580a, null, false, 96);
                            }
                        } else if (obj4 instanceof w3) {
                            return new zp0.b0(field.getInnerEditText(), new khg.s(formController, 24, model, field));
                        }
                        return null;
                    default:
                        AmountEditDelegate.Model data = (AmountEditDelegate.Model) obj2;
                        AmountEditView field2 = (AmountEditView) obj3;
                        int i21 = FormController.D0;
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(field2, "field");
                        MaskedTextInputEditText editText = field2.getEditText();
                        Object obj5 = data.f51629j;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                        return new zp0.d(editText, (xi0.b) obj5, (u80.d) formController.X.getValue(), null, new c(formController, data), false, false, 0, false, null, 1928);
                }
            }
        });
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.m0 = datePickerDelegate;
        this.f51270n0 = new SwipeToActionDelegate(this.O, false);
        this.f51271o0 = new SelectableDelegate(this.O);
        this.p0 = new SelectableDelegate(new CellDetailsListDelegate());
        this.q0 = new ProductSelectionDelegate();
        this.f51272r0 = new PlainTextWarningDelegate();
        this.f51273s0 = new FullScreenStateDelegate();
        this.f51274t0 = new NotificationCentreItemDelegate();
        this.u0 = new ListSubheaderDelegate();
        this.f51275v0 = new FiltersDelegate();
        this.f51276w0 = new ExternalCardDelegate(0);
        final int i6 = 2;
        this.f51277x0 = w.y0(new Function0(this) { // from class: lb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193520b;

            {
                this.f193520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                FormController formController = this.f193520b;
                switch (i22) {
                    case 0:
                        int i32 = FormController.D0;
                        return ((nb0.a) formController.V.getValue()).n();
                    case 1:
                        int i59 = FormController.D0;
                        return new u80.d(((s80.b) ((nb0.a) formController.V.getValue()).i()).b());
                    case 2:
                        int i66 = FormController.D0;
                        return zhm.v.k(new ImageDelegate(jh.d.f(formController.m2()).Q()), formController.f51276w0);
                    default:
                        return zhm.d0.E0((List) formController.f51277x0.getValue(), zhm.v.k(formController.Y, formController.l0, formController.m0, formController.f51273s0, formController.f51265b0, formController.f51264a0, formController.f51266d0, formController.N, formController.f51268h0, formController.i0, formController.f51272r0, formController.q0, formController.g0, formController.O, formController.f51270n0, formController.p0, formController.f51271o0, formController.Z, formController.f0, formController.y0, formController.z0, formController.f51274t0, formController.u0, formController.f51275v0, formController.P, formController.Q, formController.A0, new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), new TextDelegate()));
                }
            }
        });
        this.y0 = new ProgressStepVerticalDelegate();
        this.z0 = new ProgressStepVerticalV2Delegate();
        this.A0 = new CellDetailsDelegate();
        final int i21 = 3;
        this.B0 = w.y0(new Function0(this) { // from class: lb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormController f193520b;

            {
                this.f193520b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                FormController formController = this.f193520b;
                switch (i22) {
                    case 0:
                        int i32 = FormController.D0;
                        return ((nb0.a) formController.V.getValue()).n();
                    case 1:
                        int i59 = FormController.D0;
                        return new u80.d(((s80.b) ((nb0.a) formController.V.getValue()).i()).b());
                    case 2:
                        int i66 = FormController.D0;
                        return zhm.v.k(new ImageDelegate(jh.d.f(formController.m2()).Q()), formController.f51276w0);
                    default:
                        return zhm.d0.E0((List) formController.f51277x0.getValue(), zhm.v.k(formController.Y, formController.l0, formController.m0, formController.f51273s0, formController.f51265b0, formController.f51264a0, formController.f51266d0, formController.N, formController.f51268h0, formController.i0, formController.f51272r0, formController.q0, formController.g0, formController.O, formController.f51270n0, formController.p0, formController.f51271o0, formController.Z, formController.f0, formController.y0, formController.z0, formController.f51274t0, formController.u0, formController.f51275v0, formController.P, formController.Q, formController.A0, new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), new TextDelegate()));
                }
            }
        });
        this.C0 = u.c(datePickerDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nb0.a) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f51611c.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.l0.e.f121375b), null, new lb0.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51269k0), null, new d(this, continuation, 1), 3);
        r rVarDistinctUntilChanged = ((f) this.f51276w0.f107175c.getValue()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new d(this, continuation, i), 3);
        InputChecklistDelegate inputChecklistDelegate = this.f51265b0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputChecklistDelegate.p()), null, new d(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51267e0), null, new d(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.m0.f52176c.f121375b), null, new d(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51273s0.f52371h.f121375b), null, new lb0.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51264a0.f52538c), null, new g(this, null), 3);
        InputTextDelegate inputTextDelegate = this.f51266d0;
        int i2 = 9;
        int i3 = 11;
        r rVarMergeArray = r.mergeArray(inputTextDelegate.e.f121375b.map(new i(new k(22), i2)), inputChecklistDelegate.e.f121375b.map(new i(new k(24), i3)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        int i5 = 8;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new d(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0), null, new d(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f.f121375b), null, new d(this, continuation, 10), 3);
        r rVarMerge = r.merge(inputTextDelegate.i.f121375b, inputTextDelegate.f52575g.f121375b);
        h hVar = h.f;
        r map = rVarMerge.map(new o0(4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new d(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52577j.f121375b), null, new lb0.i(this, null), 3);
        int i6 = 12;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f), null, new d(this, continuation, i6), 3);
        int i21 = 13;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51268h0.f52775c.f121375b), null, new d(this, continuation, i21), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.i0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), null, new d(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.q0.p()), null, new lb0.k(this, null), 3);
        r map2 = this.g0.f53144c.map(new i(new k(23), i5));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map2), null, new d(this, continuation, 15), 3);
        RowDelegate rowDelegate = this.O;
        f fVar = rowDelegate.f53218h;
        f fVar2 = rowDelegate.f53220l;
        f fVar3 = rowDelegate.k;
        r rVarMergeArray2 = r.mergeArray(fVar, fVar2, fVar3);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray2, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray2), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fVar3), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new d(this, continuation, 16), 3);
        f fVar4 = inputChecklistDelegate.f52518c;
        PlainTextWarningDelegate plainTextWarningDelegate = this.f51272r0;
        r rVarMerge2 = r.merge(v.k(fVar4, plainTextWarningDelegate.f52940c, plainTextWarningDelegate.d.f121375b.map(new i(new k(25), i6)), this.p0.r(), this.f51271o0.r().map(new i(new k(26), i21))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rVarMerge2, new k(27))), null, new d(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.j0), null, new d(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f0.f53650c.f121375b), null, new d(this, continuation, 19), 3);
        vkm.d dVarB = rd0.e.b(this.y0.f53000c);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.z0;
        com.revolut.kompot.navigable.a.g2(this, q.J(dVarB, rd0.e.b(progressStepVerticalV2Delegate.e)), null, new jl6.b(i, k3(), lb0.q.class, "onProgressStepVerticalDelegateClauseClick", "onProgressStepVerticalDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), null, new l(2, 4, lb0.q.class, k3(), "onProgressStepVerticalDelegatePrimaryActionClick", "onProgressStepVerticalDelegatePrimaryActionClick(Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;)V"), 3);
        NotificationCentreItemDelegate notificationCentreItemDelegate = this.f51274t0;
        int i22 = 4;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(notificationCentreItemDelegate.f52865c), null, new jl6.b(i, k3(), lb0.q.class, "onNotificationCentreItemDelegateClick", "onNotificationCentreItemDelegateClick(Lcom/revolut/core/ui_kit/delegates/NotificationCentreItemDelegate$NotificationClickData;)V", i22, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(notificationCentreItemDelegate.d), null, new jl6.b(i, k3(), lb0.q.class, "onNotificationCentreItemDelegateClauseClick", "onNotificationCentreItemDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i22, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.u0.f52707c), null, new o(2, 4, lb0.q.class, k3(), "onListSubheaderDelegateClick", "onListSubheaderDelegateClick(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f51275v0.f52338c.f121375b), null, new d(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f51901c), null, new d(this, continuation, 3), 3);
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final List getC0() {
        return this.C0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    public final ta0.a g3() {
        return (nb0.a) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    public final List i3() {
        return (List) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    public final lb0.q h3() {
        return (lb0.q) this.W.getValue();
    }
}
