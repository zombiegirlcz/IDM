package com.revolut.feature.security_hub.impl.ui.lost_card;

import a83.j0;
import akl.e0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import avc.b;
import avc.f;
import avc.i;
import avc.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/lost_card/LostCardController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lavc/i;", "Ldli/a;", "Lavc/n;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LostCardController extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(LostCardController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;

    public LostCardController(LostCardControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new RowDelegate(null, null, 7);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: avc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostCardController f9992b;

            {
                this.f9992b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LostCardController.Q;
                        return (f) ((vtc.o) this.f9992b.N.getValue()).f292037c.get();
                    default:
                        KProperty[] kPropertyArr2 = LostCardController.Q;
                        LostCardController lostCardController = this.f9992b;
                        return dli.f.a(lostCardController, (f) lostCardController.M.getValue(), v.k(new ListSubheaderDelegate(), lostCardController.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new at4.b(this, inputData, 7));
        this.O = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: avc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LostCardController f9992b;

            {
                this.f9992b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LostCardController.Q;
                        return (f) ((vtc.o) this.f9992b.N.getValue()).f292037c.get();
                    default:
                        KProperty[] kPropertyArr2 = LostCardController.Q;
                        LostCardController lostCardController = this.f9992b;
                        return dli.f.a(lostCardController, (f) lostCardController.M.getValue(), v.k(new ListSubheaderDelegate(), lostCardController.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.o) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_lost_card_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_lost_card_screen_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new e0(this, null, 20), 3);
        ViewController.P2(this, new j0(new an9.i(rd0.e.b(this.L.f53218h), 14), 4), new k(this, null, 26), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
