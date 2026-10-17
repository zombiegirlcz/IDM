package com.revolut.feature.crypto.tfr.validation.impl.dob;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import com.revolut.feature.crypto.tfr.validation.impl.R$layout;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t70.x;
import um5.d;
import vc.s;
import vd1.a;
import vfg.m;
import vm5.b;
import vm5.c;
import vm5.f;
import vm5.g;
import vm5.j;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/dob/DateOfBirthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvm5/f;", "Lcli/w;", "Lvm5/g;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateOfBirthScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DateOfBirthScreen.class, "binding", "getBinding()Lcom/revolut/feature/crypto/tfr/validation/impl/databinding/ScreenCryptoDateOfBirthBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public boolean P;

    public DateOfBirthScreen(DateOfBirthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_crypto_date_of_birth;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: vm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f290533b;

            {
                this.f290533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateOfBirthScreen dateOfBirthScreen = this.f290533b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.Q;
                        return n14.e.a(dateOfBirthScreen, (j) dateOfBirthScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.Q;
                        return (j) ((um5.d) dateOfBirthScreen.N.getValue()).d.get();
                }
            }
        });
        this.N = te0.w.y0(new a(this, inputData, 19));
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: vm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f290533b;

            {
                this.f290533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateOfBirthScreen dateOfBirthScreen = this.f290533b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.Q;
                        return n14.e.a(dateOfBirthScreen, (j) dateOfBirthScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.Q;
                        return (j) ((um5.d) dateOfBirthScreen.N.getValue()).d.get();
                }
            }
        });
        this.P = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f272157b;
        boolean z = uiState.f290540c;
        TextLocalisedClause textLocalisedClause = uiState.f290539b;
        largeActionButton.setEnabled(z);
        LocalDate localDate = uiState.f290538a;
        if (localDate != null && !localDate.equals(d3().f272158c.getDate())) {
            d3().f272158c.setDate(localDate);
        }
        d3().f272158c.setError(textLocalisedClause != null);
        d3().f272158c.setHelperText(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_tfr_validation_dob_toolbar_title, null, null, 14), null);
        d3().f272157b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().f272158c.setEnableQuickClear(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f272157b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f272158c.k), null, new m(this, null, 14), 3);
        if (this.P) {
            d3().f272158c.post(new x(this, 21));
        }
    }

    public final tm5.a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tm5.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
