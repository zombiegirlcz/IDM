package com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code;

import afj.w0;
import aii.q;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import io0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import vmj.b;
import vmj.c;
import vmj.d;
import vmj.i;
import vmj.j;
import wej.f;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/share_qr_code/EsimShareQrCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lvmj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimShareQrCodeScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EsimShareQrCodeScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimShareQrCodeBinding;", 0))};
    public final EsimShareQrCodeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public EsimShareQrCodeScreen(EsimShareQrCodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_share_qr_code;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: vmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeScreen f290603b;

            {
                this.f290603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimShareQrCodeScreen esimShareQrCodeScreen = this.f290603b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimShareQrCodeScreen.Q;
                        return n14.e.a(esimShareQrCodeScreen, (j) esimShareQrCodeScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimShareQrCodeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(esimShareQrCodeScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeScreen.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new w0(bVar, esimShareQrCodeScreen, esimShareQrCodeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimShareQrCodeScreen.Q;
                        return (j) ((w0) esimShareQrCodeScreen.O.getValue()).f4506g.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: vmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeScreen f290603b;

            {
                this.f290603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimShareQrCodeScreen esimShareQrCodeScreen = this.f290603b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimShareQrCodeScreen.Q;
                        return n14.e.a(esimShareQrCodeScreen, (j) esimShareQrCodeScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimShareQrCodeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(esimShareQrCodeScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeScreen.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new w0(bVar, esimShareQrCodeScreen, esimShareQrCodeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimShareQrCodeScreen.Q;
                        return (j) ((w0) esimShareQrCodeScreen.O.getValue()).f4506g.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: vmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimShareQrCodeScreen f290603b;

            {
                this.f290603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimShareQrCodeScreen esimShareQrCodeScreen = this.f290603b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimShareQrCodeScreen.Q;
                        return n14.e.a(esimShareQrCodeScreen, (j) esimShareQrCodeScreen.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimShareQrCodeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(esimShareQrCodeScreen.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimShareQrCodeScreenContract$InputData esimShareQrCodeScreenContract$InputData = esimShareQrCodeScreen.K;
                        esimShareQrCodeScreenContract$InputData.getClass();
                        return new w0(bVar, esimShareQrCodeScreen, esimShareQrCodeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimShareQrCodeScreen.Q;
                        return (j) ((w0) esimShareQrCodeScreen.O.getValue()).f4506g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f fVarD3 = d3();
        fVarD3.f296812b.setActions(uiState.f290608b);
        fVarD3.f296813c.setBackgroundType(uiState.f290609c);
        fVarD3.e.setModel(uiState.f290607a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().d;
        basicNavBar.setExpanded(false);
        basicNavBar.setTitle(new TextLocalisedClause(R$string.esim_gifting_share_qr_code_screen_title, null, null, 14));
        basicNavBar.setTitleCentered(true);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f296813c.setForeground(new ColorDrawable(a.d(0.2f, kli.a.s(R$attr.uikit_colorBackground, m2()))));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59211b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296812b.a()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.g()), null, new c(this, null, 1), 3);
    }

    public final f d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
