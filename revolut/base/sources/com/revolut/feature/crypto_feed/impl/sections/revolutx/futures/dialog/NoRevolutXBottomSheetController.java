package com.revolut.feature.crypto_feed.impl.sections.revolutx.futures.dialog;

import aii.q;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import aw0.h;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.crypto_feed.impl.sections.revolutx.futures.dialog.NoRevolutXBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.w2;
import js5.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import os2.g;
import pki.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto_feed/impl/sections/revolutx/futures/dialog/NoRevolutXBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Laii/q;", "Lno/m;", "<init>", "()V", "a", "feature_crypto_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoRevolutXBottomSheetController extends BaseBottomSheetController<q> implements m {
    public static final /* synthetic */ int R = 0;
    public final AnalyticsProduct.RevolutX N;
    public final Object O;
    public final Object P;
    public final a Q;

    public static final class a implements pki.a {
        @Override // pki.a
        public final void J1(g token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        @Override // yji.r
        public final void e(Bundle state) {
            Intrinsics.checkNotNullParameter(state, "state");
        }

        @Override // pki.a
        public final void e0(g token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        @Override // yji.r
        public final void g(Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
        }
    }

    public NoRevolutXBottomSheetController() {
        w2 value = w2.RevolutX;
        Parcelable.Creator<AnalyticsProduct.RevolutX> creator = AnalyticsProduct.RevolutX.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.N = new AnalyticsProduct.RevolutX(value);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: js5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoRevolutXBottomSheetController f178143b;

            {
                this.f178143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NoRevolutXBottomSheetController noRevolutXBottomSheetController = this.f178143b;
                switch (i2) {
                    case 0:
                        int i3 = NoRevolutXBottomSheetController.R;
                        phm.a aVar = (phm.a) ue0.e.j(noRevolutXBottomSheetController.m2()).a().get(rr5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rr5.a.class, " is not found"));
                        }
                        rs5.c cVar = ((rs5.c) ((rs5.a) aVar2.b())).D;
                        rs5.e eVar = new rs5.e();
                        eVar.f256999a = e4m.b.b(new r8h.a(cVar, 13));
                        return eVar;
                    default:
                        int i5 = NoRevolutXBottomSheetController.R;
                        return (a) ((rs5.e) noRevolutXBottomSheetController.O.getValue()).f256999a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: js5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoRevolutXBottomSheetController f178143b;

            {
                this.f178143b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NoRevolutXBottomSheetController noRevolutXBottomSheetController = this.f178143b;
                switch (i22) {
                    case 0:
                        int i3 = NoRevolutXBottomSheetController.R;
                        phm.a aVar = (phm.a) ue0.e.j(noRevolutXBottomSheetController.m2()).a().get(rr5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rr5.a.class, " is not found"));
                        }
                        rs5.c cVar = ((rs5.c) ((rs5.a) aVar2.b())).D;
                        rs5.e eVar = new rs5.e();
                        eVar.f256999a = e4m.b.b(new r8h.a(cVar, 13));
                        return eVar;
                    default:
                        int i5 = NoRevolutXBottomSheetController.R;
                        return (a) ((rs5.e) noRevolutXBottomSheetController.O.getValue()).f256999a.get();
                }
            }
        });
        this.Q = new a();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rs5.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (js5.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.retail_revolut_x_dialog_futures_view_in_revx_title, null, null, 14), new TextLocalisedClause(R$string.retail_revolut_x_dialog_futures_view_in_revx_subtitle, null, null, 14), null, null, false, 28);
        m6 m6Var = n6.Companion;
        j3(new cii.a(aVar, new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.retail_revolut_x_dialog_futures_view_in_revx_action_download, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.retail_revolut_x_dialog_futures_view_in_revx_action_web, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 0), 3);
        ViewController.P2(this, f3(), new c(this, null, 1), 3);
    }

    @Override // oki.f
    public final pki.a k() {
        return this.Q;
    }
}
