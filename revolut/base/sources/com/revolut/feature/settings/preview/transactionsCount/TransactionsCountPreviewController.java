package com.revolut.feature.settings.preview.transactionsCount;

import a07.d;
import a5d.c;
import a5d.f;
import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate;
import com.revolut.core.ui_kit.recycler.CenterScrollableLinearLayoutManager;
import com.revolut.feature.settings.preview.transactionsCount.TransactionsCountPreviewController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.e0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qhe.b;
import vc.s;
import xki.e;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/settings/preview/transactionsCount/TransactionsCountPreviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "La5d/f;", "feature_settings_preview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsCountPreviewController extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransactionsCountPreviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenSettingPreviewBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final j P;
    public final SuggestionsBarDelegate Q;
    public final j R;

    public TransactionsCountPreviewController(b interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.K = R$layout.screen_setting_preview;
        this.L = s.t(this, a5d.b.f);
        this.M = te0.w.y0(new a07.b(this, interactor, 8));
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: a5d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsCountPreviewController f1349b;

            {
                this.f1349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsCountPreviewController transactionsCountPreviewController = this.f1349b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsCountPreviewController.S;
                        return (e) ((v4d.e) transactionsCountPreviewController.M.getValue()).f286035c.get();
                    default:
                        KProperty[] kPropertyArr2 = TransactionsCountPreviewController.S;
                        return n14.e.a(transactionsCountPreviewController, (e) transactionsCountPreviewController.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: a5d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsCountPreviewController f1349b;

            {
                this.f1349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsCountPreviewController transactionsCountPreviewController = this.f1349b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsCountPreviewController.S;
                        return (e) ((v4d.e) transactionsCountPreviewController.M.getValue()).f286035c.get();
                    default:
                        KProperty[] kPropertyArr2 = TransactionsCountPreviewController.S;
                        return n14.e.a(transactionsCountPreviewController, (e) transactionsCountPreviewController.N.getValue());
                }
            }
        });
        this.P = new j(7, v.k(new HomeScreenPreviewDelegate(new TransactionsCountPreviewDelegate()), new HomeScreenPreviewLoadingDelegate(), new FullScreenStateDelegate()), false);
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.Q = suggestionsBarDelegate;
        this.R = new j(7, u.c(suggestionsBarDelegate), false);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().d.setTitle(uiState.f1352a);
        this.P.c(uiState.f1353b);
        this.R.c(uiState.f1354c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v4d.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a5d.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        RecyclerView settingPreviewPreviewRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(settingPreviewPreviewRecyclerView, "settingPreviewPreviewRecyclerView");
        Context context = d3().e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y.h(settingPreviewPreviewRecyclerView, this.P, new CenterScrollableLinearLayoutManager(context));
        RecyclerView settingPreviewBottomSectionRecyclerView = d3().f174516b;
        Intrinsics.checkNotNullExpressionValue(settingPreviewBottomSectionRecyclerView, "settingPreviewBottomSectionRecyclerView");
        y.h(settingPreviewBottomSectionRecyclerView, this.R, new LinearLayoutManager(d3().f174516b.getContext()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().d.f59211b), null, new d(this, null, 6), 3);
        a.g2(this, rd0.e.b(this.Q.p().d), null, new c(this, null), 3);
    }

    public final e0 d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
