package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ImageAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.R$id;
import com.revolut.retail.feature.payments.payment_links.impl.R$layout;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import efm.r;
import h30.l;
import ihm.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import n5k.p;
import q7k.i;
import qd0.b;
import te0.w;
import vc.s;
import xki.e;
import y4f.c;
import y7k.j;
import y7k.k;
import y7k.m;
import y7k.n;
import y7k.t;
import y7k.u;
import y7k.x;
import y7k.y;
import y7k.z;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly7k/x;", "Ldli/a;", "Ly7k/z;", "Lmga/i0;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinksAmountScreen extends ViewController<x> implements dli.a, i0 {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(PaymentLinksAmountScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenTransferPaymentLinksAmountBinding;", 0))};
    public final PaymentLinksAmountScreenContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public b O;
    public n5k.b P;
    public final Object Q;
    public final InputTextDelegate R;
    public final ImageAttachmentDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f102194a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102195b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f102196d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f102197e0;

    public PaymentLinksAmountScreen(PaymentLinksAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transfer_payment_links_amount;
        this.M = s.t(this, j.f);
        this.N = true;
        final int i = 2;
        this.Q = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
        this.R = new InputTextDelegate(null);
        this.S = new ImageAttachmentDelegate();
        this.T = w.y0(new c(26));
        this.U = w.y0(new c(27));
        this.V = w.y0(new c(28));
        this.W = w.y0(new c(29));
        this.X = w.y0(new y7k.h(0));
        this.Y = w.y0(new c(24));
        final int i2 = 0;
        this.Z = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
        this.f102194a0 = w.y0(new c(25));
        final int i3 = 1;
        this.f102195b0 = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
        final int i5 = 3;
        this.c0 = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
        final int i6 = 4;
        this.f102196d0 = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
        final int i21 = 5;
        this.f102197e0 = w.y0(new Function0(this) { // from class: y7k.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksAmountScreen f311549b;

            {
                this.f311549b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                PaymentLinksAmountScreen paymentLinksAmountScreen = this.f311549b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                        return new SelectableDelegate((RowDelegate) paymentLinksAmountScreen.X.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentLinksAmountScreen.f0;
                        return new CenteredAmountDelegate(new xwd.a(paymentLinksAmountScreen, 28));
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentLinksAmountScreen.f0;
                        qd0.b bVar = paymentLinksAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen2 = this.f311549b;
                        return dli.f.a(paymentLinksAmountScreen2, paymentLinksAmountScreen2.R2(), zhm.v.k(paymentLinksAmountScreen2.d3(), paymentLinksAmountScreen2.R, paymentLinksAmountScreen2.S, new RowLoadingDelegate()), R$id.paymentLinks_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentLinksAmountScreen.f0;
                        PaymentLinksAmountScreen paymentLinksAmountScreen3 = this.f311549b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksAmountScreen3.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        q7k.j jVar = ((q7k.j) aVar2.b()).G;
                        PaymentLinksAmountScreenContract$InputData paymentLinksAmountScreenContract$InputData = paymentLinksAmountScreen3.K;
                        paymentLinksAmountScreenContract$InputData.getClass();
                        ReactionsKeyboardView paymentLinksReactionsKeyboard = paymentLinksAmountScreen3.e3().f222891c;
                        Intrinsics.checkNotNullExpressionValue(paymentLinksReactionsKeyboard, "paymentLinksReactionsKeyboard");
                        return new q7k.i(jVar, new o9i.a(), new o9i.b(), new o9i.c(), paymentLinksAmountScreen3, paymentLinksAmountScreenContract$InputData, paymentLinksReactionsKeyboard);
                    default:
                        KProperty[] kPropertyArr6 = PaymentLinksAmountScreen.f0;
                        return (y) ((q7k.i) paymentLinksAmountScreen.f102196d0.getValue()).Z.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        BasicNavBar basicNavBar = e3().f222890b;
        t tVar = uiState.f311585b;
        basicNavBar.setTitle(tVar.f311577a);
        basicNavBar.setMenuItems(tVar.f311578b);
        y7k.q qVar2 = uiState.f311586c;
        if (qVar2 != null) {
            TwinVerticalButton twinVerticalButton = e3().d;
            twinVerticalButton.setMainButtonEnabled(qVar2.f311566c);
            twinVerticalButton.setMainButtonText(qVar2.f311564a);
            twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
            TwinVerticalButton.setDescription$default(twinVerticalButton, qVar2.f311565b, null, null, 6, null);
            twinVerticalButton.setGradientBackgroundEnabled(true);
            twinVerticalButton.setSecondaryButtonVisible(false);
            twinVerticalButton.setMainButtonLoadingTag("PAYMENTS_LINKS_CTA_BUTTON_TAG");
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).C2(u.f311580a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.Y.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.f102196d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r2 = this.f102196d0;
        i iVar = (i) r2.getValue();
        b bVarN = iVar.f242891g.f242906b.n();
        s.j(bVarN);
        this.O = bVarN;
        this.P = (n5k.b) iVar.N.get();
        int i = y7k.i.f311554a[this.K.getF102201c().ordinal()];
        if (i == 1) {
            pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_payment_link_amount_title, null, null, 14));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_money_request_amount_title, null, null, 14));
        }
        j60.a aVar = (j60.a) ((i) r2.getValue()).f242893j.get();
        ?? r23 = this.T;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r56 = this.U;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r56.getValue();
        ?? r92 = this.V;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r92.getValue();
        ?? r112 = this.W;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r112.getValue();
        ?? r132 = this.X;
        RowDelegate rowDelegate = (RowDelegate) r132.getValue();
        ?? r152 = this.Y;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r152.getValue();
        ?? r4 = this.f102194a0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r4.getValue(), (SelectableDelegate) this.Z.getValue()));
        n5k.b bVar = this.P;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2((CellDetailsDelegate) r56.getValue(), (CellDetailsActionDelegate) r92.getValue(), (CellDetailsNoteDelegate) r112.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r4.getValue(), (RowDelegate) r132.getValue(), (HighlightTileDelegate) r152.getValue());
        e3().f222890b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.X.getValue()).f53218h;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(e3().f222890b.f59211b), new n(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f222890b.f59210a.f57403b), new y7k.o(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().d.o0()), new n(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(e3().d.f59017j), new y7k.o(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(e3().f222891c.I(), new y66.p(13))), new y7k.o(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f121375b), new y7k.o(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f121375b), new y7k.p(this, null), 3);
        f fVar = d3().f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.R;
        ViewController.P2(this, l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), new y7k.o(this, continuation, 4), 3);
        ViewController.P2(this, l.y(d3().e.f121375b, d3().f51966j.f121375b, "merge(...)"), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new y7k.l(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52577j.f121375b), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52515c), new n(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate d3() {
        return (CenteredAmountDelegate) this.f102195b0.getValue();
    }

    public final o7k.b e3() {
        ViewBinding value = this.M.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o7k.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final y R2() {
        return (y) this.f102197e0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = e3().f222889a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        return controllerContainerConstraintLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
