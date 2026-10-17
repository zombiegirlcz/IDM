package com.revolut.feature.kyc.impl.choosedocument;

import a41.o0;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentContract$Configuration;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentKycFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.tracking.v3.IdContext;
import cu8.g1;
import cu8.i1;
import cu8.j1;
import f9b.f;
import ft3.h0;
import fu8.d;
import fu8.v;
import ipi.a;
import iqi.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import pri.e;
import prk.o;
import qd0.b;
import te0.w;
import vc.s;
import xpi.g;
import z4l.j;
import zu8.r0;
import zu8.t0;
import zu8.u0;
import zu8.v0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/kyc/impl/choosedocument/ChooseDocumentKycFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "", "Lfu8/d;", "Lno/k;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooseDocumentKycFragment extends BaseLayoutBuilderFragment<Object, d> implements d, k {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f77588n0 = 0;
    public final Object f0;
    public final Object g0 = w.y0(new h0(14));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f77589h0 = w.y0(new h0(15));
    public final Object i0 = w.y0(new h0(16));
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f77590k0;
    public final Object l0;
    public AnalyticsContext m0;

    public ChooseDocumentKycFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: fu8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentKycFragment f138119b;

            {
                this.f138119b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChooseDocumentKycFragment chooseDocumentKycFragment = this.f138119b;
                switch (i2) {
                    case 0:
                        int i3 = ChooseDocumentKycFragment.f77588n0;
                        t0 t0Var = (t0) ((v0) jb3.l.q(chooseDocumentKycFragment));
                        return new r0(t0Var.f325369c, t0Var.d, (ChooseDocumentContract$Configuration) chooseDocumentKycFragment.A());
                    case 1:
                        int i5 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((RowDelegate) chooseDocumentKycFragment.g0.getValue());
                    case 2:
                        int i6 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((CellDetailsListDelegate) chooseDocumentKycFragment.f77589h0.getValue());
                    default:
                        int i21 = ChooseDocumentKycFragment.f77588n0;
                        return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), (RowDelegate) chooseDocumentKycFragment.g0.getValue(), new RowLoadingDelegate(), (SelectableDelegate) chooseDocumentKycFragment.j0.getValue(), (SelectableDelegate) chooseDocumentKycFragment.f77590k0.getValue(), (PromptMarketingContentDelegate) chooseDocumentKycFragment.i0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.j0 = w.y0(new Function0(this) { // from class: fu8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentKycFragment f138119b;

            {
                this.f138119b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChooseDocumentKycFragment chooseDocumentKycFragment = this.f138119b;
                switch (i22) {
                    case 0:
                        int i3 = ChooseDocumentKycFragment.f77588n0;
                        t0 t0Var = (t0) ((v0) jb3.l.q(chooseDocumentKycFragment));
                        return new r0(t0Var.f325369c, t0Var.d, (ChooseDocumentContract$Configuration) chooseDocumentKycFragment.A());
                    case 1:
                        int i5 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((RowDelegate) chooseDocumentKycFragment.g0.getValue());
                    case 2:
                        int i6 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((CellDetailsListDelegate) chooseDocumentKycFragment.f77589h0.getValue());
                    default:
                        int i21 = ChooseDocumentKycFragment.f77588n0;
                        return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), (RowDelegate) chooseDocumentKycFragment.g0.getValue(), new RowLoadingDelegate(), (SelectableDelegate) chooseDocumentKycFragment.j0.getValue(), (SelectableDelegate) chooseDocumentKycFragment.f77590k0.getValue(), (PromptMarketingContentDelegate) chooseDocumentKycFragment.i0.getValue()), false);
                }
            }
        });
        final int i3 = 2;
        this.f77590k0 = w.y0(new Function0(this) { // from class: fu8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentKycFragment f138119b;

            {
                this.f138119b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChooseDocumentKycFragment chooseDocumentKycFragment = this.f138119b;
                switch (i22) {
                    case 0:
                        int i32 = ChooseDocumentKycFragment.f77588n0;
                        t0 t0Var = (t0) ((v0) jb3.l.q(chooseDocumentKycFragment));
                        return new r0(t0Var.f325369c, t0Var.d, (ChooseDocumentContract$Configuration) chooseDocumentKycFragment.A());
                    case 1:
                        int i5 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((RowDelegate) chooseDocumentKycFragment.g0.getValue());
                    case 2:
                        int i6 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((CellDetailsListDelegate) chooseDocumentKycFragment.f77589h0.getValue());
                    default:
                        int i21 = ChooseDocumentKycFragment.f77588n0;
                        return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), (RowDelegate) chooseDocumentKycFragment.g0.getValue(), new RowLoadingDelegate(), (SelectableDelegate) chooseDocumentKycFragment.j0.getValue(), (SelectableDelegate) chooseDocumentKycFragment.f77590k0.getValue(), (PromptMarketingContentDelegate) chooseDocumentKycFragment.i0.getValue()), false);
                }
            }
        });
        final int i5 = 3;
        this.l0 = w.y0(new Function0(this) { // from class: fu8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentKycFragment f138119b;

            {
                this.f138119b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ChooseDocumentKycFragment chooseDocumentKycFragment = this.f138119b;
                switch (i22) {
                    case 0:
                        int i32 = ChooseDocumentKycFragment.f77588n0;
                        t0 t0Var = (t0) ((v0) jb3.l.q(chooseDocumentKycFragment));
                        return new r0(t0Var.f325369c, t0Var.d, (ChooseDocumentContract$Configuration) chooseDocumentKycFragment.A());
                    case 1:
                        int i59 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((RowDelegate) chooseDocumentKycFragment.g0.getValue());
                    case 2:
                        int i6 = ChooseDocumentKycFragment.f77588n0;
                        return new SelectableDelegate((CellDetailsListDelegate) chooseDocumentKycFragment.f77589h0.getValue());
                    default:
                        int i21 = ChooseDocumentKycFragment.f77588n0;
                        return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), (RowDelegate) chooseDocumentKycFragment.g0.getValue(), new RowLoadingDelegate(), (SelectableDelegate) chooseDocumentKycFragment.j0.getValue(), (SelectableDelegate) chooseDocumentKycFragment.f77590k0.getValue(), (PromptMarketingContentDelegate) chooseDocumentKycFragment.i0.getValue()), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a((j) this.l0.getValue(), (RecyclerView.ItemAnimator) new DefaultItemAnimator(), o.u(), 80.0f, true);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.m0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF96869t0() {
        return this.m0;
    }

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(((ChooseDocumentContract$Configuration) A()).f77586b.name());
        AnalyticsContext.Companion bVar = AnalyticsContext.INSTANCE;
        w0 w0VarA = aVarNewBuilder.a();
        bVar.getClass();
        this.m0 = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.l0.getValue()).c(items);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ContextWrapper contextWrapper;
        r0 r0Var = (r0) this.f0.getValue();
        ChooseDocumentContract$Configuration chooseDocumentContract$Configuration = r0Var.f325347a;
        u0 u0Var = r0Var.f325348b;
        g1 g1Var = (g1) u0Var.A.get();
        t0 t0Var = r0Var.f325349c;
        f fVar = (f) t0Var.f325379s.get();
        ImmutableMap immutableMapOf = ImmutableMap.of("ChooseDocumentRadioButtonBehavuior", r0Var.d, "ChooseAdditionalDocumentRadioButtonBehaviour", r0Var.e, "SingleDocumentChoiceBehaviour", r0Var.f);
        g gVar = (g) t0Var.f325371h.get();
        tpi.j jVar = (tpi.j) t0Var.f325373l.get();
        h hVar = (h) t0Var.L.get();
        i1 i1Var = (i1) u0Var.F.get();
        j1 j1Var = (j1) u0Var.u.get();
        b bVarN = u0Var.f325388b.n();
        s.j(bVarN);
        ContextWrapper activity = i.b(t0Var.f325367a);
        iu8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        BaseDelegatesActivity baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        if (baseDelegatesActivity != null && (contextWrapper = baseDelegatesActivity.f98684b0) != null) {
            activity = contextWrapper;
        }
        return new v(chooseDocumentContract$Configuration, g1Var, fVar, immutableMapOf, gVar, jVar, hVar, i1Var, j1Var, bVarN, new o0(activity));
    }
}
