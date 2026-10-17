package com.revolut.feature.payments.send_from_clipboard.impl.ui.selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreen;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cz9.c;
import cz9.g;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy9.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/impl/ui/selection/SendFromClipboardSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsy9/b;", "Ldli/a;", "Lcz9/h;", "feature_payments_send_from_clipboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SendFromClipboardSelectionScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SendFromClipboardSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SendFromClipboardSelectionScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SendFromClipboardSelectionScreen(SendFromClipboardSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = true;
        this.N = s.t(this, cz9.b.f);
        this.O = w.y0(new cpi.b(29));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: cz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFromClipboardSelectionScreen f110165b;

            {
                this.f110165b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen = this.f110165b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SendFromClipboardSelectionScreen.S;
                        SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen2 = this.f110165b;
                        return dli.f.a(sendFromClipboardSelectionScreen2, (g) sendFromClipboardSelectionScreen2.R.getValue(), v.k((RowDelegate) sendFromClipboardSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SendFromClipboardSelectionScreen.S;
                        qji.b bVarU2 = sendFromClipboardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.di.SendFromClipboardSelectionScreenInjector");
                        vy9.d dVar = (vy9.d) bVarU2;
                        vy9.c cVar = dVar.f293280b;
                        vy9.d dVar2 = dVar.f293281c;
                        SendFromClipboardSelectionScreenContract$InputData sendFromClipboardSelectionScreenContract$InputData = sendFromClipboardSelectionScreen.K;
                        sendFromClipboardSelectionScreenContract$InputData.getClass();
                        return new vy9.e(cVar, dVar2, sendFromClipboardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SendFromClipboardSelectionScreen.S;
                        return (g) ((vy9.e) sendFromClipboardSelectionScreen.Q.getValue()).f293283b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: cz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFromClipboardSelectionScreen f110165b;

            {
                this.f110165b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen = this.f110165b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendFromClipboardSelectionScreen.S;
                        SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen2 = this.f110165b;
                        return dli.f.a(sendFromClipboardSelectionScreen2, (g) sendFromClipboardSelectionScreen2.R.getValue(), v.k((RowDelegate) sendFromClipboardSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SendFromClipboardSelectionScreen.S;
                        qji.b bVarU2 = sendFromClipboardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.di.SendFromClipboardSelectionScreenInjector");
                        vy9.d dVar = (vy9.d) bVarU2;
                        vy9.c cVar = dVar.f293280b;
                        vy9.d dVar2 = dVar.f293281c;
                        SendFromClipboardSelectionScreenContract$InputData sendFromClipboardSelectionScreenContract$InputData = sendFromClipboardSelectionScreen.K;
                        sendFromClipboardSelectionScreenContract$InputData.getClass();
                        return new vy9.e(cVar, dVar2, sendFromClipboardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SendFromClipboardSelectionScreen.S;
                        return (g) ((vy9.e) sendFromClipboardSelectionScreen.Q.getValue()).f293283b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFromClipboardSelectionScreen f110165b;

            {
                this.f110165b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen = this.f110165b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SendFromClipboardSelectionScreen.S;
                        SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen2 = this.f110165b;
                        return dli.f.a(sendFromClipboardSelectionScreen2, (g) sendFromClipboardSelectionScreen2.R.getValue(), v.k((RowDelegate) sendFromClipboardSelectionScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SendFromClipboardSelectionScreen.S;
                        qji.b bVarU2 = sendFromClipboardSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.di.SendFromClipboardSelectionScreenInjector");
                        vy9.d dVar = (vy9.d) bVarU2;
                        vy9.c cVar = dVar.f293280b;
                        vy9.d dVar2 = dVar.f293281c;
                        SendFromClipboardSelectionScreenContract$InputData sendFromClipboardSelectionScreenContract$InputData = sendFromClipboardSelectionScreen.K;
                        sendFromClipboardSelectionScreenContract$InputData.getClass();
                        return new vy9.e(cVar, dVar2, sendFromClipboardSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SendFromClipboardSelectionScreen.S;
                        return (g) ((vy9.e) sendFromClipboardSelectionScreen.Q.getValue()).f293283b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cz9.h uiState = (cz9.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f110169b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vy9.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
