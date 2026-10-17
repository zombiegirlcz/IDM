package com.revolut.feature.crypto.receive_widget.impl.ui.customize;

import android.os.Handler;
import android.os.Looper;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rea.m;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements kj5.a {

    @NotNull
    public static final kj5.d Companion = new kj5.d();
    public final yki.a A;
    public final xh5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fbj.a f70918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bk5.a f70919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f70920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f70921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f70922t;
    public final uj5.b u;
    public final se5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vbj.c f70923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LayoutViewerScreen f70924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f70925y;
    public CurrencyChooserFlow z;

    public c(xh5.a cryptoFeatureEnabledInteractor, fbj.a cryptoDepositsInteractor, bk5.a blockchainInteractor, m pocketDetailsInteractor, e selectNetworkStepFactory, d mindfulOfNetworkStepFactory, uj5.b restrictedActionNavigationProvider, se5.a faqKeysProvider, vbj.c cryptoDepositStorageInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(selectNetworkStepFactory, "selectNetworkStepFactory");
        Intrinsics.checkNotNullParameter(mindfulOfNetworkStepFactory, "mindfulOfNetworkStepFactory");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        Intrinsics.checkNotNullParameter(faqKeysProvider, "faqKeysProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositStorageInteractor, "cryptoDepositStorageInteractor");
        this.o = cryptoFeatureEnabledInteractor;
        this.f70918p = cryptoDepositsInteractor;
        this.f70919q = blockchainInteractor;
        this.f70920r = pocketDetailsInteractor;
        this.f70921s = selectNetworkStepFactory;
        this.f70922t = mindfulOfNetworkStepFactory;
        this.u = restrictedActionNavigationProvider;
        this.v = faqKeysProvider;
        this.f70923w = cryptoDepositStorageInteractor;
        this.f70924x = new LayoutViewerScreen(R$layout.screen_transparent);
        this.f70925y = new Handler(Looper.getMainLooper());
        kj4.c cVar = new kj4.c(this, 1);
        this.A = cp5.d.a(this, CryptoReceiveWidgetCustomizationContract$Step.InitialEmpty.f70909a, f0.f322471a, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c r4, xi0.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof kj5.e
            if (r0 == 0) goto L13
            r0 = r6
            kj5.e r0 = (kj5.e) r0
            int r1 = r0.f184295w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184295w = r1
            goto L18
        L13:
            kj5.e r0 = new kj5.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184295w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            bk5.a r4 = r4.f70919q
            efm.r r4 = r4.a(r5)
            r5 = 3
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r6, r5)
            r0.f184295w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.I2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c r6, java.lang.String r7, wk5.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof kj5.f
            if (r0 == 0) goto L13
            r0 = r9
            kj5.f r0 = (kj5.f) r0
            int r1 = r0.f184297x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184297x = r1
            goto L18
        L13:
            kj5.f r0 = new kj5.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184297x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L74
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            wk5.a r8 = r0.u
            yhm.o.b(r9)
            goto L57
        L39:
            yhm.o.b(r9)
            xi0.a r9 = xi0.b.Companion
            r9.getClass()
            xi0.b r7 = xi0.a.a(r7)
            rea.m r9 = r6.f70920r
            r2 = 6
            ufm.i r7 = eda.f.a(r9, r7, r5, r5, r2)
            r0.u = r8
            r0.f184297x = r4
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L57
            goto L73
        L57:
            eda.e r9 = (eda.e) r9
            io3.d r7 = r9.f124961a
            java.lang.String r7 = r7.f163145a
            fbj.a r6 = r6.f70918p
            r9 = 0
            efm.r r6 = r6.d(r7, r8, r9)
            r7 = 3
            efm.r r6 = m70.a.g(r6, r5, r5, r7)
            r0.u = r5
            r0.f184297x = r3
            java.lang.Object r9 = nim.a.c(r6, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress r9 = (com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress) r9
            java.lang.String r6 = r9.f100038b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.J2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c, java.lang.String, wk5.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c r5, java.lang.String r6, wk5.a r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof kj5.g
            if (r0 == 0) goto L13
            r0 = r9
            kj5.g r0 = (kj5.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            kj5.g r0 = new kj5.g
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f184299x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r8 = r0.f184298w
            wk5.a r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r9)
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r9)
            vbj.c r9 = r5.f70923w
            r9.getClass()
            s2i.i r2 = new s2i.i
            r4 = 14
            r2.<init>(r9, r4)
            ufm.c r9 = new ufm.c
            r4 = 2
            r9.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            ufm.n r9 = te0.w.i0(r9)
            r0.u = r6
            r0.v = r7
            r0.f184298w = r8
            r0.z = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r0)
            if (r9 == 0) goto L79
            yki.a r5 = r5.A
            com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step$MindfulOfNetwork r9 = new com.revolut.feature.crypto.receive_widget.impl.ui.customize.CryptoReceiveWidgetCustomizationContract$Step$MindfulOfNetwork
            r9.<init>(r6, r8, r7)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r6 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.z2(r5, r9, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L79:
            vj5.c r9 = new vj5.c
            r9.<init>(r6, r8, r7)
            r5.C2(r9)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(com.revolut.feature.crypto.receive_widget.impl.ui.customize.c, java.lang.String, wk5.a, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final void K1() {
        this.f70925y.removeCallbacksAndMessages(null);
    }

    public final void L2(Function0 function0, Function0 function02) {
        l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32470), false, 5)), null, new ga0.c(function0, function02, null, 1), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
