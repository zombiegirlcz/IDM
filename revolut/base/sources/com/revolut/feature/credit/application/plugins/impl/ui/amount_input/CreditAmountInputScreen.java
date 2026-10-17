package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.w7;
import dw3.x7;
import dze.n;
import e54.j;
import e54.k;
import e54.l;
import e54.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Le54/p;", "Ldli/a;", "Le54/q;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAmountInputScreen extends PluginScreenController<p> implements dli.a {
    public final CreditAmountInputScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditAmountInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditAmountInputBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public CreditAmountInputScreen(CreditAmountInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_amount_input;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i2 = i;
                final int i3 = 1;
                final int i5 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i2;
                final int i3 = 1;
                final int i5 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i3;
                final int i32 = 1;
                final int i5 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i5;
                final int i32 = 1;
                final int i59 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i59;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i6;
                final int i32 = 1;
                final int i59 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i32;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        final int i21 = 5;
        this.S = w.y0(new Function0(this) { // from class: e54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAmountInputScreen f122743b;

            {
                this.f122743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i21;
                final int i32 = 1;
                final int i59 = 0;
                final CreditAmountInputScreen creditAmountInputScreen = this.f122743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAmountInputScreen.U;
                        qji.b bVarU2 = creditAmountInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.amount_input.di.CreditAmountInputScreenInjector");
                        w7 w7Var = (w7) ((f54.a) bVarU2).y().mo3808a(creditAmountInputScreen);
                        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = creditAmountInputScreen.L;
                        switch (w7Var.f120088a) {
                            case 0:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 1:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 2:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 3:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 4:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 5:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 6:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 7:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            case 8:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                            default:
                                creditAmountInputScreenContract$InputData.getClass();
                                w7Var.d = creditAmountInputScreenContract$InputData;
                                break;
                        }
                        return (x7) w7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAmountInputScreen.U;
                        x7 x7Var = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var.f120165a) {
                            case 0:
                                return (l) x7Var.f120173n.get();
                            case 1:
                                return (l) x7Var.f120173n.get();
                            case 2:
                                return (l) x7Var.f120173n.get();
                            case 3:
                                return (l) x7Var.f120173n.get();
                            case 4:
                                return (l) x7Var.f120173n.get();
                            case 5:
                                return (l) x7Var.f120173n.get();
                            case 6:
                                return (l) x7Var.f120173n.get();
                            case 7:
                                return (l) x7Var.f120173n.get();
                            case 8:
                                return (l) x7Var.f120173n.get();
                            default:
                                return (l) x7Var.f120173n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditAmountInputScreen.U;
                        CreditAmountInputScreen creditAmountInputScreen2 = this.f122743b;
                        return dli.f.a(creditAmountInputScreen2, creditAmountInputScreen2.R2(), zhm.v.k((InputTextDelegate) creditAmountInputScreen2.R.getValue(), (CenteredAmountDelegate) creditAmountInputScreen2.S.getValue()), R$id.creditAmountInputScreen_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditAmountInputScreen.U;
                        x7 x7Var2 = (x7) creditAmountInputScreen.N.getValue();
                        switch (x7Var2.f120165a) {
                            case 0:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 3:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 4:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 5:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 6:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 7:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            case 8:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = x7Var2.f120167c.f118443h.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 4:
                        KProperty[] kPropertyArr5 = CreditAmountInputScreen.U;
                        return new InputTextDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i32;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                    default:
                        KProperty[] kPropertyArr6 = CreditAmountInputScreen.U;
                        return new CenteredAmountDelegate(new Function2() { // from class: e54.g
                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                CreditAmountInputScreen creditAmountInputScreen3 = creditAmountInputScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr62 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        Object obj4 = model.f51981p;
                                        if (!(obj4 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field.getEditText(), ((a0) obj4).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1944);
                                    default:
                                        InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                                        InputText field2 = (InputText) obj3;
                                        KProperty[] kPropertyArr7 = CreditAmountInputScreen.U;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        Object obj5 = model2.P;
                                        if (!(obj5 instanceof a0)) {
                                            return null;
                                        }
                                        return new zp0.d(field2.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) creditAmountInputScreen3.Q.getValue(), null, null, false, false, 0, false, null, 1912);
                                }
                            }
                        });
                }
            }
        });
        this.T = s.t(this, e54.h.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e54.q uiState = (e54.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f10672c;
        Clause clause = uiState.f122758a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setMenuItems(uiState.f122759b);
        navBarWithToolbar.j0(false);
        d3().f10671b.setModel(new e(false, null, null, new n6(uiState.f122760c, LargeActionButton.ButtonStyle.f58725a, null, uiState.e ? "confirm" : "", uiState.d, null, null, 972), null, null, 55));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x7) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10672c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new e0b.c(navBarWithToolbar, this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new n(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(d3().f10671b.f), new e0b.c(view, this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.R.getValue()).e.f121375b), new j(this, null), 3);
        ?? r62 = this.S;
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), new k(this, continuation, 0), 3);
        ViewController.P2(this, new dmj.k(rd0.e.b(((CenteredAmountDelegate) r62.getValue()).f51964g.f121375b), 17), new k(this, continuation, 1), 3);
    }

    public final aw3.b d3() {
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
