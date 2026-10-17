package com.revolut.core.backend_flow.ui.screen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.R$layout;
import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
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
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.products.ExternalCardDelegate;
import com.revolut.uicomponent.products.ImageDelegate;
import efm.r;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import pri.e;
import te0.w;
import v0.a;
import yp0.y;
import z4l.j;
import zab.b;
import zbj.j0;
import zc0.h;
import zc0.i;
import zc0.l;
import zc0.m;
import zc0.n;
import zc0.o;
import zc0.q;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/backend_flow/ui/screen/BackendScreenFragment;", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "Lzc0/h;", "Lzc0/i;", "Lno/k;", "Lno/m;", "<init>", "()V", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackendScreenFragment extends BaseMvpFragment<h, i> implements i, k {
    public final Object E0;
    public final Object H0;
    public final Object I0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f51331d0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f51334k0;
    public final Object q0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f51330b0 = new LargeActionButtonDelegate();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f51332e0 = a.d("create(...)");
    public final AmountEditDelegate f0 = new AmountEditDelegate(new l(this, 0));
    public final Object g0 = w.y0(new zaj.f(26));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f51333h0 = w.y0(new zaj.f(27));
    public final Object i0 = w.y0(new zaj.f(28));
    public final f j0 = a.d("create(...)");
    public final Object l0 = w.y0(new zaj.f(29));
    public final Object m0 = w.y0(new m(0));

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f51335n0 = w.y0(new m(1));

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f51336o0 = w.y0(new zaj.f(16));
    public final SwipeToActionDelegate p0 = new SwipeToActionDelegate(F(), false);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f51337r0 = w.y0(new zaj.f(17));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f51338s0 = w.y0(new zaj.f(18));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f51339t0 = w.y0(new zaj.f(19));
    public final Object u0 = w.y0(new zaj.f(20));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f51340v0 = w.y0(new zaj.f(21));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f51341w0 = w.y0(new zaj.f(22));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f51342x0 = w.y0(new zaj.f(23));
    public final Object y0 = w.y0(new zaj.f(24));
    public final Object z0 = w.y0(new zaj.f(25));
    public final FullScreenStateDelegate A0 = new FullScreenStateDelegate();
    public final ActionsDelegate B0 = new ActionsDelegate();
    public final NotificationCentreItemDelegate C0 = new NotificationCentreItemDelegate();
    public final FiltersDelegate D0 = new FiltersDelegate();
    public final ProgressStepVerticalDelegate F0 = new ProgressStepVerticalDelegate();
    public final ProgressStepVerticalV2Delegate G0 = new ProgressStepVerticalV2Delegate();
    public final f J0 = a.d("create(...)");
    public final f K0 = a.d("create(...)");

    public BackendScreenFragment() {
        final int i = 6;
        this.c0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i2) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i3));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i2 = 1;
        this.f51331d0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i22) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i3));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i3 = 5;
        this.f51334k0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i22) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i32));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i5 = 0;
        this.q0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i22) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i32));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i6 = 2;
        this.E0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i22) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i32));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i21 = 3;
        this.H0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                int i32 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i22) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i32));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
        final int i22 = 4;
        this.I0 = w.y0(new Function0(this) { // from class: zc0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendScreenFragment f321072b;

            {
                this.f321072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                int i32 = 1;
                BackendScreenFragment backendScreenFragment = this.f321072b;
                switch (i222) {
                    case 0:
                        return new SelectableDelegate(backendScreenFragment.F());
                    case 1:
                        return new u80.d(((s80.b) backendScreenFragment.D().i()).b());
                    case 2:
                        return zhm.v.k(new ImageDelegate(backendScreenFragment.D().Q()), (ExternalCardDelegate) backendScreenFragment.g0.getValue());
                    case 3:
                        return zhm.d0.E0((List) backendScreenFragment.E0.getValue(), zhm.v.k(backendScreenFragment.B0, backendScreenFragment.f0, backendScreenFragment.E(), (PhoneEditorDelegate) backendScreenFragment.f51333h0.getValue(), (PlainTextWarningDelegate) backendScreenFragment.f51339t0.getValue(), (WebViewDelegate) backendScreenFragment.u0.getValue(), (InputDisclosureDelegate) backendScreenFragment.i0.getValue(), (InputChecklistDelegate) backendScreenFragment.l0.getValue(), backendScreenFragment.f51330b0, backendScreenFragment.G0, (RateNPSDelegate) backendScreenFragment.m0.getValue(), backendScreenFragment.F(), backendScreenFragment.p0, (SelectableDelegate) backendScreenFragment.f51337r0.getValue(), (SelectableDelegate) backendScreenFragment.q0.getValue(), (DatePickerDelegate) backendScreenFragment.f51340v0.getValue(), (MonthPickerDelegate) backendScreenFragment.f51341w0.getValue(), (YearPickerDelegate) backendScreenFragment.f51342x0.getValue(), (ProductSelectionDelegate) backendScreenFragment.y0.getValue(), backendScreenFragment.A0, backendScreenFragment.F0, backendScreenFragment.C0, (CellDetailsStandaloneNoteDelegate) backendScreenFragment.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), (ListSubheaderDelegate) backendScreenFragment.z0.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), (TextDelegate) backendScreenFragment.f51338s0.getValue(), backendScreenFragment.D0));
                    case 4:
                        return new z4l.j(7, (List) backendScreenFragment.H0.getValue(), false);
                    case 5:
                        return new InputTextDelegate(new l(backendScreenFragment, i32));
                    default:
                        return (q) jb3.l.q(backendScreenFragment);
                }
            }
        });
    }

    public final f B0() {
        return F().f53226s;
    }

    public final f C0() {
        return F().k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final q D() {
        return (q) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputTextDelegate E() {
        return (InputTextDelegate) this.f51334k0.getValue();
    }

    public final r E0() {
        return E().f52577j.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RowDelegate F() {
        return (RowDelegate) this.f51335n0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final r F0() {
        f fVar = ((InputChecklistDelegate) this.l0.getValue()).f52518c;
        ?? r110 = this.f51339t0;
        r rVarMerge = r.merge(v.k(fVar, ((PlainTextWarningDelegate) r110.getValue()).f52940c, ((PlainTextWarningDelegate) r110.getValue()).d.f121375b.map(new b(28, new j0(12))), ((SelectableDelegate) this.f51337r0.getValue()).r(), ((SelectableDelegate) this.q0.getValue()).r().map(new n(new j0(17), 4))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return w.a0(rVarMerge, new j0(18));
    }

    public final r G() {
        return this.B0.f51611c.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f G0() {
        return ((TextDelegate) this.f51338s0.getValue()).d;
    }

    public final r H() {
        return this.f51332e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final r H0() {
        r rVarFilter = ((SelectableDelegate) this.q0.getValue()).r().filter(new n(new j0(15), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final r I() {
        r rVarDistinctUntilChanged = ((f) ((ExternalCardDelegate) this.g0.getValue()).f107175c.getValue()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f I0() {
        return ((YearPickerDelegate) this.f51342x0.getValue()).f53650c.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f J() {
        return ((InputChecklistDelegate) this.l0.getValue()).p();
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final f getK0() {
        return this.K0;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f L() {
        return ((DatePickerDelegate) this.f51340v0.getValue()).f52176c.f121375b;
    }

    public final r M() {
        r map = r.merge(E().i.f121375b, E().f52575g.f121375b).map(new n(new j0(16), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r N() {
        return this.D0.f52338c.f121375b;
    }

    public final r O() {
        return E().f.f121375b;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return D().m().f312422a.getM();
    }

    public final f Q() {
        return this.f0.e.f121375b;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R */
    public final AnalyticsContext getP() {
        BackendScreen backendScreen = ((BackendScreenContract$Configuration) A()).f51329a;
        if (backendScreen == null) {
            return null;
        }
        return new AnalyticsContext(D().m().a(backendScreen));
    }

    public final r S() {
        return this.f51330b0.d.f121375b;
    }

    public final r T() {
        r rVarMergeArray = r.mergeArray(F().f53218h, F().f53220l, F().k);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        return rVarMergeArray;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f V() {
        return ((InputDisclosureDelegate) this.i0.getValue()).f52538c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final r W() {
        r rVarMergeArray = r.mergeArray(E().e.f121375b.map(new b(29, new j0(13))), ((InputChecklistDelegate) this.l0.getValue()).e.f121375b.map(new n(new j0(14), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        return rVarMergeArray;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final r X() {
        return ((WebViewDelegate) this.u0.getValue()).f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f Y() {
        return ((ListSubheaderDelegate) this.z0.getValue()).f52707c;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final f getJ0() {
        return this.j0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f a0() {
        return ((MonthPickerDelegate) this.f51341w0.getValue()).f52775c.f121375b;
    }

    public final f b0() {
        return this.C0.f52865c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f c0() {
        return ((PhoneEditorDelegate) this.f51333h0.getValue()).f52894c.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f d0() {
        return ((PhoneEditorDelegate) this.f51333h0.getValue()).e.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final r e0() {
        return ((ProductSelectionDelegate) this.y0.getValue()).p();
    }

    public final f n0() {
        return this.G0.f.f121375b;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_backend_screen, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R$id.recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        vyl.a.b(recyclerView, (j) this.I0.getValue(), new DefaultItemAnimator(), new o31.b(), 8);
        y.a(recyclerView, 5, true, new o(this, 0));
        D().c().Y("BACKEND_SCREEN_DELEGATES_KEY", v.k((DatePickerDelegate) this.f51340v0.getValue(), F(), this.p0, this.f51330b0, this.F0, this.G0, this.C0, (WebViewDelegate) this.u0.getValue(), (CellDetailsStandaloneNoteDelegate) this.f51336o0.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new CellDetailsLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate()));
    }

    public final r p0() {
        r rVarMerge = r.merge(this.F0.f53000c, this.G0.e);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final r q0() {
        r map = ((RateNPSDelegate) this.m0.getValue()).f53144c.map(new n(new j0(19), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.I0.getValue()).c(items);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        FragmentActivity activity = getActivity();
        Intrinsics.i(activity, "null cannot be cast to non-null type com.revolut.core.backend_flow.ui.BackendFlowActivity<*, *>");
        return ((qc0.b) activity).Z0();
    }

    public final r z0() {
        return this.A0.f52371h.f121375b;
    }
}
