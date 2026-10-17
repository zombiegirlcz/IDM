package com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.account_activation.impl.R$layout;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateController;
import com.revolut.kompot.navigable.vc.ViewController;
import j68.a;
import j68.c;
import j68.d;
import j68.g;
import j68.i;
import java.time.LocalDate;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import vc.s;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/edit_dob/EditBirthDateController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj68/g;", "Lcli/w;", "Lj68/h;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditBirthDateController extends ViewController<g> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EditBirthDateController.class, "binding", "getBinding()Lcom/revolut/feature/junior/account_activation/impl/databinding/ScreenEditBirthDateBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Lazy N;
    public final Lazy O;
    public final Object P;

    public EditBirthDateController(EditBirthDateControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_edit_birth_date;
        this.L = true;
        this.M = s.t(this, c.f);
        this.N = j.b(new a(this, inputData, 0));
        final int i = 0;
        this.O = j.b(new Function0(this) { // from class: j68.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBirthDateController f171686b;

            {
                this.f171686b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditBirthDateController editBirthDateController = this.f171686b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditBirthDateController.Q;
                        return (i) ((z58.h) editBirthDateController.N.getValue()).f319569c.get();
                    default:
                        KProperty[] kPropertyArr2 = EditBirthDateController.Q;
                        return n14.e.a(editBirthDateController, (i) editBirthDateController.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: j68.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditBirthDateController f171686b;

            {
                this.f171686b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditBirthDateController editBirthDateController = this.f171686b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditBirthDateController.Q;
                        return (i) ((z58.h) editBirthDateController.N.getValue()).f319569c.get();
                    default:
                        KProperty[] kPropertyArr2 = EditBirthDateController.Q;
                        return n14.e.a(editBirthDateController, (i) editBirthDateController.O.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j68.h uiState = (j68.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LocalDate localDate = uiState.f171693c;
        Clause clause = uiState.f171692b;
        w58.a aVarD3 = d3();
        NavBarWithToolbar birthDateNavBar = aVarD3.d;
        Intrinsics.checkNotNullExpressionValue(birthDateNavBar, "birthDateNavBar");
        birthDateNavBar.setTitle(uiState.f171691a, null);
        LargeActionButton largeActionButton = aVarD3.f294727b;
        largeActionButton.setText(uiState.e);
        largeActionButton.setEnabled(uiState.d);
        if (localDate != null && !localDate.equals(d3().f294728c.getDate())) {
            d3().f294728c.setDate(localDate);
        }
        if (clause != null) {
            d3().f294728c.setError(true);
            d3().f294728c.setHelperText(clause);
        } else {
            d3().f294728c.setError(false);
            d3().f294728c.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z58.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f294727b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setLoadingButtonTag("BUTTON_TAG_UPDATE_PROFILE_BIRTH_DATE");
        d3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f294728c.setEnableQuickClear(true);
        d3().f294728c.j0(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f294728c.k), null, new iug.j(this, (Continuation) null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f294727b.o), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new d(this, null, 1), 3);
    }

    public final w58.a d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w58.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
