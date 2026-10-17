package com.revolut.feature.pix.impl.flow.migrate_alias.screens.review;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreen;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import faa.d;
import gaa.b;
import gaa.c;
import gaa.j;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import p8a.d0;
import p8a.z0;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/migrate_alias/screens/review/ReviewMigrateAliasScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lfaa/d;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewMigrateAliasScreen extends SimpleViewController<d> implements d1 {
    public static final /* synthetic */ int S = 0;
    public final ReviewMigrateAliasScreenContract$InputData N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ReviewMigrateAliasScreen(ReviewMigrateAliasScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_transparent;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: gaa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewMigrateAliasScreen f142114b;

            {
                this.f142114b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReviewMigrateAliasScreen reviewMigrateAliasScreen = this.f142114b;
                        qji.b bVarU2 = reviewMigrateAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.di.ReviewMigrateAliasScreenInjector");
                        p8a.j jVar = (p8a.j) bVarU2;
                        d0 d0Var = jVar.f233992b;
                        p8a.j jVar2 = jVar.f233993c;
                        ReviewMigrateAliasScreenContract$InputData reviewMigrateAliasScreenContract$InputData = reviewMigrateAliasScreen.N;
                        reviewMigrateAliasScreenContract$InputData.getClass();
                        return new z0(d0Var, jVar2, reviewMigrateAliasScreen, reviewMigrateAliasScreenContract$InputData);
                    default:
                        return (j) ((z0) this.f142114b.P.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gaa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewMigrateAliasScreen f142114b;

            {
                this.f142114b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReviewMigrateAliasScreen reviewMigrateAliasScreen = this.f142114b;
                        qji.b bVarU2 = reviewMigrateAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.di.ReviewMigrateAliasScreenInjector");
                        p8a.j jVar = (p8a.j) bVarU2;
                        d0 d0Var = jVar.f233992b;
                        p8a.j jVar2 = jVar.f233993c;
                        ReviewMigrateAliasScreenContract$InputData reviewMigrateAliasScreenContract$InputData = reviewMigrateAliasScreen.N;
                        reviewMigrateAliasScreenContract$InputData.getClass();
                        return new z0(d0Var, jVar2, reviewMigrateAliasScreen, reviewMigrateAliasScreenContract$InputData);
                    default:
                        return (j) ((z0) this.f142114b.P.getValue()).i.get();
                }
            }
        });
        this.R = w.y0(new b(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((z0) this.P.getValue()).d.get()).d(v.k(new RowDelegate(null, null, 7), (LargeActionButtonDelegate) this.R.getValue()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
