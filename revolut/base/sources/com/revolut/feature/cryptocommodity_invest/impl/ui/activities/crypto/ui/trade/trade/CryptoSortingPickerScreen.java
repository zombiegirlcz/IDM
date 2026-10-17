package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oqj.d;
import ox5.c;
import ox5.e;
import ox5.f;
import ox5.g;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoSortingPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldw5/b;", "Ldli/a;", "Lox5/c;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSortingPickerScreen extends ViewController<dw5.b> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoSortingPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final CryptoSortingPickerInputData K;
    public final Object L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    public CryptoSortingPickerScreen(CryptoSortingPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ox5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSortingPickerScreen f230571b;

            {
                this.f230571b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoSortingPickerScreen cryptoSortingPickerScreen = this.f230571b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSortingPickerScreen.S;
                        ix5.c cVar = (ix5.c) cryptoSortingPickerScreen.M.getValue();
                        switch (cVar.f169342a) {
                            case 0:
                                return (b) cVar.d.get();
                            default:
                                return (b) cVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSortingPickerScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ix5.c) ((px5.a) ((px5.b) aVar2.b()).b().mo3808a(cryptoSortingPickerScreen)).x(cryptoSortingPickerScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoSortingPickerScreen.S;
                        CryptoSortingPickerScreen cryptoSortingPickerScreen2 = this.f230571b;
                        return dli.f.a(cryptoSortingPickerScreen2, (b) cryptoSortingPickerScreen2.L.getValue(), zhm.v.k(new ListSubheaderDelegate(), (SingleChoiceDelegate) cryptoSortingPickerScreen2.O.getValue(), (LargeActionButtonDelegate) cryptoSortingPickerScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ox5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSortingPickerScreen f230571b;

            {
                this.f230571b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoSortingPickerScreen cryptoSortingPickerScreen = this.f230571b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSortingPickerScreen.S;
                        ix5.c cVar = (ix5.c) cryptoSortingPickerScreen.M.getValue();
                        switch (cVar.f169342a) {
                            case 0:
                                return (b) cVar.d.get();
                            default:
                                return (b) cVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSortingPickerScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ix5.c) ((px5.a) ((px5.b) aVar2.b()).b().mo3808a(cryptoSortingPickerScreen)).x(cryptoSortingPickerScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoSortingPickerScreen.S;
                        CryptoSortingPickerScreen cryptoSortingPickerScreen2 = this.f230571b;
                        return dli.f.a(cryptoSortingPickerScreen2, (b) cryptoSortingPickerScreen2.L.getValue(), zhm.v.k(new ListSubheaderDelegate(), (SingleChoiceDelegate) cryptoSortingPickerScreen2.O.getValue(), (LargeActionButtonDelegate) cryptoSortingPickerScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, e.f);
        this.O = w.y0(new d(27));
        this.P = w.y0(new d(28));
        this.Q = R$layout.screen_recycler_navbar_bottomsheet;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ox5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoSortingPickerScreen f230571b;

            {
                this.f230571b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoSortingPickerScreen cryptoSortingPickerScreen = this.f230571b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoSortingPickerScreen.S;
                        ix5.c cVar = (ix5.c) cryptoSortingPickerScreen.M.getValue();
                        switch (cVar.f169342a) {
                            case 0:
                                return (b) cVar.d.get();
                            default:
                                return (b) cVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoSortingPickerScreen.m2()).a().get(mw5.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ix5.c) ((px5.a) ((px5.b) aVar2.b()).b().mo3808a(cryptoSortingPickerScreen)).x(cryptoSortingPickerScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", mw5.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoSortingPickerScreen.S;
                        CryptoSortingPickerScreen cryptoSortingPickerScreen2 = this.f230571b;
                        return dli.f.a(cryptoSortingPickerScreen2, (b) cryptoSortingPickerScreen2.L.getValue(), zhm.v.k(new ListSubheaderDelegate(), (SingleChoiceDelegate) cryptoSortingPickerScreen2.O.getValue(), (LargeActionButtonDelegate) cryptoSortingPickerScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ix5.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ox5.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.cryptocommodity_invest_crypto_sort_by_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.O.getValue()).p()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
