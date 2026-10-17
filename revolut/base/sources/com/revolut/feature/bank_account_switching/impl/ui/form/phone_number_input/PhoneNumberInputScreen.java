package com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import ho2.b;
import ho2.c;
import ho2.d;
import ho2.f;
import ho2.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.y;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/phone_number_input/PhoneNumberInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lho2/f;", "Ldli/a;", "Lho2/h;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneNumberInputScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PhoneNumberInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PhoneNumberInputScreenContract$InputData K;
    public final int L;
    public final PhoneEditorDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public PhoneNumberInputScreen(PhoneNumberInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new PhoneEditorDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ho2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneNumberInputScreen f154203b;

            {
                this.f154203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PhoneNumberInputScreen phoneNumberInputScreen = this.f154203b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneNumberInputScreen.R;
                        PhoneNumberInputScreen phoneNumberInputScreen2 = this.f154203b;
                        return dli.f.a(phoneNumberInputScreen2, (g) phoneNumberInputScreen2.Q.getValue(), u.c(phoneNumberInputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneNumberInputScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneNumberInputScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = phoneNumberInputScreen.K;
                        phoneNumberInputScreenContract$InputData.getClass();
                        return new y(hVar, phoneNumberInputScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PhoneNumberInputScreen.R;
                        return (g) ((y) phoneNumberInputScreen.P.getValue()).d.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ho2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneNumberInputScreen f154203b;

            {
                this.f154203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhoneNumberInputScreen phoneNumberInputScreen = this.f154203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneNumberInputScreen.R;
                        PhoneNumberInputScreen phoneNumberInputScreen2 = this.f154203b;
                        return dli.f.a(phoneNumberInputScreen2, (g) phoneNumberInputScreen2.Q.getValue(), u.c(phoneNumberInputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneNumberInputScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneNumberInputScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = phoneNumberInputScreen.K;
                        phoneNumberInputScreenContract$InputData.getClass();
                        return new y(hVar, phoneNumberInputScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PhoneNumberInputScreen.R;
                        return (g) ((y) phoneNumberInputScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ho2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneNumberInputScreen f154203b;

            {
                this.f154203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhoneNumberInputScreen phoneNumberInputScreen = this.f154203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneNumberInputScreen.R;
                        PhoneNumberInputScreen phoneNumberInputScreen2 = this.f154203b;
                        return dli.f.a(phoneNumberInputScreen2, (g) phoneNumberInputScreen2.Q.getValue(), u.c(phoneNumberInputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneNumberInputScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneNumberInputScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = phoneNumberInputScreen.K;
                        phoneNumberInputScreenContract$InputData.getClass();
                        return new y(hVar, phoneNumberInputScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PhoneNumberInputScreen.R;
                        return (g) ((y) phoneNumberInputScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ho2.h uiState = (ho2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f154211b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(phoneNumberInputScreenContract$InputData.f63947b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(phoneNumberInputScreenContract$InputData.f63947b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
