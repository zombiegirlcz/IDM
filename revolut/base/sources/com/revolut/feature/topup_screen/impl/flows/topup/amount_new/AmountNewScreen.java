package com.revolut.feature.topup_screen.impl.flows.topup.amount_new;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.AmountEditWithCellDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.impl.R$id;
import com.revolut.feature.topup_screen.impl.R$layout;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import grl.k9;
import h30.l;
import in0.g;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.b2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import kpl.b;
import kye.c;
import kye.d;
import kye.f;
import kye.g0;
import kye.i;
import kye.i0;
import kye.j0;
import kye.k3;
import kye.n;
import kye.u;
import mx0.f7;
import no.k;
import no.m;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vc.s;
import vkm.z1;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/amount_new/AmountNewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkye/u;", "Ldli/a;", "Lkye/j0;", "Lno/m;", "Lno/k;", "Lin0/g;", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountNewScreen extends ViewController<u> implements dli.a, m, k, g {
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final z1 O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f90824a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90823b0 = {o0.f186429a.j(new h0(AmountNewScreen.class, "binding", "getBinding()Lcom/revolut/feature/topup_screen/impl/databinding/ScreenAmountNewBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public AmountNewScreen(n inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137507t;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.L = R$layout.screen_amount_new;
        this.M = s.t(this, d.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = ta6.a.a(0);
        this.P = w.y0(new b(this, inputData, 8));
        final int i = 1;
        this.Q = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                final int i3 = 1;
                final int i5 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i2 = 2;
        this.S = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                final int i3 = 1;
                final int i5 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i3;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i3 = 3;
        this.T = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                final int i32 = 1;
                final int i5 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i5;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i5 = 4;
        this.U = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                final int i32 = 1;
                final int i59 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i32;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i6 = i59;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i6) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i6 = 5;
        this.V = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                final int i32 = 1;
                final int i59 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i32;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i21 = 6;
        this.W = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                final int i32 = 1;
                final int i59 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i32;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        final int i22 = 7;
        this.X = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                final int i32 = 1;
                final int i59 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i32;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
        this.Y = w.y0(new kw4.b(4));
        this.Z = w.y0(new kw4.b(3));
        final int i32 = 0;
        this.f90824a0 = w.y0(new Function0(this) { // from class: kye.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountNewScreen f190704b;

            {
                this.f190704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                final int i322 = 1;
                final int i59 = 0;
                final AmountNewScreen amountNewScreen = this.f190704b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
                        AmountNewScreen amountNewScreen2 = this.f190704b;
                        return dli.f.a(amountNewScreen2, amountNewScreen2.R2(), zhm.v.k((AmountEditWithCellDelegate) amountNewScreen2.W.getValue(), (AmountEditDelegate) amountNewScreen2.V.getValue(), (CenteredAmountDelegate) amountNewScreen2.X.getValue(), (FooterTextDelegate) amountNewScreen2.Y.getValue(), amountNewScreen2.N, (TextDelegate) amountNewScreen2.Z.getValue()), R$id.topupAmount_recycler, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AmountNewScreen.f90823b0;
                        return (g0) ((qve.b) amountNewScreen.R1()).o.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AmountNewScreen.f90823b0;
                        qd0.b bVarN = ((qve.b) amountNewScreen.R1()).f249571b.v.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i322;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 4:
                        KProperty[] kPropertyArr5 = AmountNewScreen.f90823b0;
                        return new Function2() { // from class: kye.a
                            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                int i66 = i59;
                                AmountNewScreen amountNewScreen3 = amountNewScreen;
                                switch (i66) {
                                    case 0:
                                        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                                        CenteredAmountView field = (CenteredAmountView) obj3;
                                        KProperty[] kPropertyArr52 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model, "model");
                                        Intrinsics.checkNotNullParameter(field, "field");
                                        MaskedTextInputEditText editText = field.getEditText();
                                        Object obj4 = model.f51981p;
                                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText, (xi0.b) obj4, (u80.d) amountNewScreen3.S.getValue(), null, new kl.t1(amountNewScreen3, 3), false, false, 0, false, new BigDecimal(1000000000), 904);
                                    default:
                                        AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                                        AmountEditView field2 = (AmountEditView) obj3;
                                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                                        Intrinsics.checkNotNullParameter(model2, "model");
                                        Intrinsics.checkNotNullParameter(field2, "field");
                                        MaskedTextInputEditText editText2 = field2.getEditText();
                                        Object obj5 = model2.f51629j;
                                        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                                        return new zp0.d(editText2, (xi0.b) obj5, (u80.d) amountNewScreen3.S.getValue(), null, new e(amountNewScreen3, 0), false, false, 0, false, new BigDecimal(1000000000), 904);
                                }
                            }
                        };
                    case 5:
                        KProperty[] kPropertyArr6 = AmountNewScreen.f90823b0;
                        return new AmountEditDelegate((Function2) amountNewScreen.T.getValue());
                    case 6:
                        KProperty[] kPropertyArr7 = AmountNewScreen.f90823b0;
                        return new AmountEditWithCellDelegate((Function2) amountNewScreen.T.getValue());
                    default:
                        return new CenteredAmountDelegate((Function2) amountNewScreen.U.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j0 uiState = (j0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.R = uiState.e;
        LargeActionButton largeActionButton = d3().f200361b;
        AnalyticsContext analyticsContext = uiState.e;
        largeActionButton.setAnalyticsContext(analyticsContext);
        d3().e.setAnalyticsContext(analyticsContext);
        d3().f200362c.setAnalyticsContext(analyticsContext);
        d3().f200362c.setToolbarDescription(uiState.f190750b);
        i0 i0Var = uiState.f190751c;
        if (i0Var == null) {
            LargeActionButton nextButton = d3().f200361b;
            Intrinsics.checkNotNullExpressionValue(nextButton, "nextButton");
            nextButton.setVisibility(8);
            LargeActionButton topupAmountRoundButton = d3().e;
            Intrinsics.checkNotNullExpressionValue(topupAmountRoundButton, "topupAmountRoundButton");
            topupAmountRoundButton.setVisibility(8);
        } else {
            LargeActionButton largeActionButton2 = d3().f200361b;
            TextLocalisedClause textLocalisedClause = i0Var.f190739a;
            f7 f7Var = i0Var.e;
            largeActionButton2.setText(textLocalisedClause);
            largeActionButton2.setEnabled(i0Var.f190740b);
            largeActionButton2.o(i0Var.f190741c);
            w01.k.d(largeActionButton2);
            int i = c.f190714a[i0Var.d.ordinal()];
            if (i == 1) {
                LargeActionButton topupAmountRoundButton2 = d3().e;
                Intrinsics.checkNotNullExpressionValue(topupAmountRoundButton2, "topupAmountRoundButton");
                topupAmountRoundButton2.setVisibility(8);
            } else if (i == 2) {
                d3().e.setIcon(new ResourceImage(R$drawable.uikit_icn_24_auto_topup, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
                LargeActionButton topupAmountRoundButton3 = d3().e;
                Intrinsics.checkNotNullExpressionValue(topupAmountRoundButton3, "topupAmountRoundButton");
                topupAmountRoundButton3.setVisibility(0);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().e.setIcon(new ResourceImage(R$drawable.uikit_icn_24_map_point, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
                LargeActionButton topupAmountRoundButton4 = d3().e;
                Intrinsics.checkNotNullExpressionValue(topupAmountRoundButton4, "topupAmountRoundButton");
                topupAmountRoundButton4.setVisibility(0);
            }
            FooterTextView footerTextView = d3().d;
            footerTextView.setVisibility(f7Var != null ? 0 : 8);
            if (f7Var != null) {
                footerTextView.setContent(f7Var);
            }
        }
        if (uiState.d) {
            k3 k3Var = (k3) R2();
            k3Var.H2(k3Var.f190763d0, new kxb.c(20));
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.K;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        gte.a aVarB = ((qve.b) R1()).f249571b.k.b();
        s.j(aVarB);
        if (!aVarB.a(TopupApi$Toggles.AmountCurrencyChooserMigration.f90459c) || i != 4) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.n("Unexpected requestCode for handleActivityResult ", i));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("argCurrency") : null;
            if (stringExtra != null && !d0.W(stringExtra)) {
                ((k3) R2()).S2(stringExtra);
                return;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("No or blank extras for key argCurrency provided for 4 result");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setText((Clause) null);
        LargeActionButton topupAmountRoundButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(topupAmountRoundButton, "topupAmountRoundButton");
        topupAmountRoundButton.setVisibility(8);
        LargeActionButton nextButton = d3().f200361b;
        Intrinsics.checkNotNullExpressionValue(nextButton, "nextButton");
        w01.k.a(nextButton);
        NavBarWithAvatar navBarWithAvatar = d3().f200362c;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.topup_title_add_money, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e.b(d3().f200361b.o), new f(this, continuation, 2), 3);
        ViewController.P2(this, e.b(d3().f200362c.f59338a), new f(this, continuation, 3), 3);
        ViewController.P2(this, e.b(d3().e.o), new f(this, continuation, 4), 3);
        ViewController.P2(this, e.b(((gye.b) ((gye.f) ((qve.b) R1()).k.get())).f147846b.d.f121375b), new kye.h(2, 4, g0.class, R2(), "onButtonClickedInBottomSheet", "onButtonClickedInBottomSheet(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        ViewController.P2(this, e.b(((gye.b) ((gye.f) ((qve.b) R1()).k.get())).f147845a.f), new i(2, 4, g0.class, R2(), "onItemClickedInBottomSheet", "onItemClickedInBottomSheet(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
        ViewController.P2(this, this.O, new b2(2, R2(), g0.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 3);
        ?? r06 = this.V;
        r rVarA0 = w.a0(((AmountEditDelegate) r06.getValue()).f51622g.f121375b, new h0() { // from class: kye.j
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((AmountEditDelegate.Model) obj2).f51627g;
            }
        });
        ?? r56 = this.W;
        r rVarA02 = w.a0(((AmountEditWithCellDelegate) r56.getValue()).e.f51622g.f121375b, new h0() { // from class: kye.k
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((AmountEditDelegate.Model) obj2).f51627g;
            }
        });
        ?? r72 = this.X;
        r rVarMerge = r.merge(rVarA0, rVarA02, w.a0(((CenteredAmountDelegate) r72.getValue()).f.f121375b, new h0() { // from class: kye.l
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((CenteredAmountDelegate.Model) obj2).e;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, e.b(rVarMerge), new krc.h(this, continuation, 19), 3);
        r rVarMerge2 = r.merge(((AmountEditDelegate) r06.getValue()).e.f121375b, ((AmountEditWithCellDelegate) r56.getValue()).e.e.f121375b, ((CenteredAmountDelegate) r72.getValue()).f51966j.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, e.b(rVarMerge2), new f(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.N;
        r rVarMerge3 = r.merge(v.k(rowDelegate.f53220l, rowDelegate.f53218h, ((AmountEditWithCellDelegate) r56.getValue()).f51638c.f53218h));
        Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
        ViewController.P2(this, e.b(rVarMerge3), new kye.g(this, null), 3);
        ViewController.P2(this, l.y(((AmountEditWithCellDelegate) r56.getValue()).f51638c.f53220l, ((CenteredAmountDelegate) r72.getValue()).e.f121375b, "merge(...)"), new f(this, continuation, 1), 3);
        ViewController.P2(this, l.y(((TextDelegate) this.Z.getValue()).d, d3().d.f58608l, "merge(...)"), new im9.h(view, this, continuation, 23), 3);
    }

    public final lve.a d3() {
        ViewBinding value = this.M.getValue(this, f90823b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lve.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mye.a R1() {
        return (mye.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final g0 d() {
        return (g0) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f90824a0.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
