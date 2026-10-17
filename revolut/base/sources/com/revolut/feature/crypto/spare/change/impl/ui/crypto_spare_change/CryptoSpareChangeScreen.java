package com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.List;
import jki.m;
import jki.o;
import jl5.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nl5.f;
import rp0.y;
import te0.w;
import w83.a;
import wl5.c;
import wl5.d;
import wl5.h;
import wl5.s;
import xl5.b;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/impl/ui/crypto_spare_change/CryptoSpareChangeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lwl5/h;", "Lcom/revolut/feature/crypto/spare/change/impl/ui/crypto_spare_change/CryptoSpareChangeScreenContract$InputData;", "Ljl5/e;", "feature_crypto_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSpareChangeScreen extends BaseScreen<h, CryptoSpareChangeScreenContract$InputData, e> {
    public final Object M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final LargeActionButtonDelegate R;
    public final TwinHorizontalButtonDelegate S;
    public final ActionsDelegate T;
    public final RowDelegate U;
    public final List V;
    public boolean W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoSpareChangeScreen(CryptoSpareChangeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wl5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSpareChangeScreen f298412b;

            {
                this.f298412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (xl5.b) ((nl5.f) this.f298412b.P.getValue()).f.get();
                    default:
                        return (s) ((nl5.f) this.f298412b.P.getValue()).f217033h.get();
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i2 = 1;
        this.O = true;
        this.P = w.y0(new a(this, inputData, 19));
        this.Q = w.y0(new Function0(this) { // from class: wl5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSpareChangeScreen f298412b;

            {
                this.f298412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (xl5.b) ((nl5.f) this.f298412b.P.getValue()).f.get();
                    default:
                        return (s) ((nl5.f) this.f298412b.P.getValue()).f217033h.get();
                }
            }
        });
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.R = largeActionButtonDelegate;
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.S = twinHorizontalButtonDelegate;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.T = actionsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = v.k(actionsDelegate, largeActionButtonDelegate, twinHorizontalButtonDelegate, rowDelegate, new CellDetailsLoadingDelegate(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new TextDelegate());
        this.W = true;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        h uiState = (h) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.W = uiState.f298419b;
        b bVar = (b) this.M.getValue();
        y model = uiState.f298418a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.f306937b = xl5.a.SHOWN;
        bVar.f306938c = model;
        j60.a aVar = bVar.f306936a;
        if (aVar.j()) {
            aVar.A(model);
        } else {
            aVar.x(model);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((b) this.M.getValue()).f306936a.E()), null, new c(this, null, 0), 3);
        RowDelegate rowDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, new v0b.b(wp5.y.x(rowDelegate.f53218h, rowDelegate.f53220l, "mergeWith(...)"), this, 22), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new v0b.b(rd0.e.b(this.T.f51611c.f121375b), this, 22), null, new wl5.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new v0b.b(rd0.e.b(this.R.d.f121375b), this, 22), null, new wl5.f(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, new v0b.b(rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), this, 22), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new v0b.b(rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), this, 22), null, new c(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = (b) this.M.getValue();
        bVar.getClass();
        List adapterDelegates = this.V;
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        bVar.f306936a.d(adapterDelegates);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final s T2() {
        return (s) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
