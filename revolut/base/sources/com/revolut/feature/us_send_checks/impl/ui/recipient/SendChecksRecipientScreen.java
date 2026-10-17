package com.revolut.feature.us_send_checks.impl.ui.recipient;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserActivity;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.io.Serializable;
import jii.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mlg.d;
import te0.w;
import vc.s;
import ve7.i;
import vgk.f;
import vlg.b;
import vlg.c;
import vlg.j;
import vlg.k;
import vlg.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/us_send_checks/impl/ui/recipient/SendChecksRecipientScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvlg/j;", "Ldli/a;", "Lvlg/m;", "<init>", "()V", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SendChecksRecipientScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SendChecksRecipientScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object N;
    public final Object O;
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final boolean M = true;
    public final Lazy P = yhm.j.b(new i(23));
    public final Lazy Q = yhm.j.b(new i(24));
    public final Lazy R = yhm.j.b(new i(25));
    public final h S = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public SendChecksRecipientScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: vlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksRecipientScreen f290431b;

            {
                this.f290431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                SendChecksRecipientScreen sendChecksRecipientScreen = this.f290431b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksRecipientScreen.T;
                        return (k) ((mlg.d) sendChecksRecipientScreen.O.getValue()).f206957b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksRecipientScreen.T;
                        SendChecksRecipientScreen sendChecksRecipientScreen2 = this.f290431b;
                        return dli.f.a(sendChecksRecipientScreen2, sendChecksRecipientScreen2.R2(), v.k((InputTextDelegate) sendChecksRecipientScreen2.P.getValue(), (FixedTabsDelegate) sendChecksRecipientScreen2.Q.getValue(), (LargeActionButtonDelegate) sendChecksRecipientScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksRecipientScreen.T;
                        qji.b bVarU2 = sendChecksRecipientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.recipient.di.SendChecksRecipientScreenInjector");
                        mlg.b bVar = ((mlg.c) bVarU2).f206953a;
                        mlg.d dVar = new mlg.d();
                        int i6 = 18;
                        dVar.f206956a = e4m.b.b(new mjl.b(bVar, dVar, i5, i6));
                        dVar.f206957b = e4m.b.b(new mjl.b(bVar, dVar, i3, i6));
                        return dVar;
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksRecipientScreen f290431b;

            {
                this.f290431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                SendChecksRecipientScreen sendChecksRecipientScreen = this.f290431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksRecipientScreen.T;
                        return (k) ((mlg.d) sendChecksRecipientScreen.O.getValue()).f206957b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksRecipientScreen.T;
                        SendChecksRecipientScreen sendChecksRecipientScreen2 = this.f290431b;
                        return dli.f.a(sendChecksRecipientScreen2, sendChecksRecipientScreen2.R2(), v.k((InputTextDelegate) sendChecksRecipientScreen2.P.getValue(), (FixedTabsDelegate) sendChecksRecipientScreen2.Q.getValue(), (LargeActionButtonDelegate) sendChecksRecipientScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksRecipientScreen.T;
                        qji.b bVarU2 = sendChecksRecipientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.recipient.di.SendChecksRecipientScreenInjector");
                        mlg.b bVar = ((mlg.c) bVarU2).f206953a;
                        mlg.d dVar = new mlg.d();
                        int i6 = 18;
                        dVar.f206956a = e4m.b.b(new mjl.b(bVar, dVar, i5, i6));
                        dVar.f206957b = e4m.b.b(new mjl.b(bVar, dVar, i3, i6));
                        return dVar;
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: vlg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendChecksRecipientScreen f290431b;

            {
                this.f290431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                SendChecksRecipientScreen sendChecksRecipientScreen = this.f290431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendChecksRecipientScreen.T;
                        return (k) ((mlg.d) sendChecksRecipientScreen.O.getValue()).f206957b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SendChecksRecipientScreen.T;
                        SendChecksRecipientScreen sendChecksRecipientScreen2 = this.f290431b;
                        return dli.f.a(sendChecksRecipientScreen2, sendChecksRecipientScreen2.R2(), v.k((InputTextDelegate) sendChecksRecipientScreen2.P.getValue(), (FixedTabsDelegate) sendChecksRecipientScreen2.Q.getValue(), (LargeActionButtonDelegate) sendChecksRecipientScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SendChecksRecipientScreen.T;
                        qji.b bVarU2 = sendChecksRecipientScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.us_send_checks.impl.ui.recipient.di.SendChecksRecipientScreenInjector");
                        mlg.b bVar = ((mlg.c) bVarU2).f206953a;
                        mlg.d dVar = new mlg.d();
                        int i6 = 18;
                        dVar.f206956a = e4m.b.b(new mjl.b(bVar, dVar, i5, i6));
                        dVar.f206957b = e4m.b.b(new mjl.b(bVar, dVar, i32, i6));
                        return dVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f290442b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 23) {
            ChooserActivity.INSTANCE.getClass();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("DATA") : null;
            ChooserScreenContract$Model chooserScreenContract$Model = serializableExtra instanceof ChooserScreenContract$Model ? (ChooserScreenContract$Model) serializableExtra : null;
            if (chooserScreenContract$Model != null) {
                k kVarR2 = R2();
                Serializable serializable = chooserScreenContract$Model.f65909l;
                Intrinsics.i(serializable, "null cannot be cast to non-null type com.revolut.feature.core.model.domain.address.Region");
                ao3.a region = (ao3.a) serializable;
                vlg.s sVar = (vlg.s) kVarR2;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(region, "region");
                sVar.H2(sVar.f290446q, new f(region, sVar, 10));
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_recipient_details_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174565c.setToolbarTitle(textLocalisedClause);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.bank_transfer_add_beneficiary_more_info_button_finish, null, null, 14));
        d3().f174564b.setLoadingButtonTag("ADD_RECIPIENT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.Q.getValue()).f52339c.f121375b), null, new vfg.m(this, null, 11), 3);
        Lazy lazy = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f52575g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), null, new vlg.d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
