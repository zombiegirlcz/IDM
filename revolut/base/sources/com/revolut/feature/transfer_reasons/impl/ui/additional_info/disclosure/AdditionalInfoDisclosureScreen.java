package com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.AdditionalInfoDisclosureScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsf.m;
import nsf.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zsf.b;
import zsf.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/disclosure/AdditionalInfoDisclosureScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lzsf/f;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInfoDisclosureScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AdditionalInfoDisclosureScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AdditionalInfoDisclosureScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public AdditionalInfoDisclosureScreen(AdditionalInfoDisclosureScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoDisclosureScreen f324912b;

            {
                this.f324912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen = this.f324912b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalInfoDisclosureScreen.Q;
                        AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen2 = this.f324912b;
                        return dli.f.a(additionalInfoDisclosureScreen2, (e) additionalInfoDisclosureScreen2.O.getValue(), u.c(new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalInfoDisclosureScreen.Q;
                        qji.b bVarU2 = additionalInfoDisclosureScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.di.AdditionalInfoDisclosureScreenInjector");
                        m mVar = (m) ((atf.a) bVarU2).y().mo3808a(additionalInfoDisclosureScreen);
                        AdditionalInfoDisclosureScreenContract$InputData additionalInfoDisclosureScreenContract$InputData = additionalInfoDisclosureScreen.K;
                        switch (mVar.f218835a) {
                            case 0:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                            default:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                        }
                        return (n) mVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalInfoDisclosureScreen.Q;
                        n nVar = (n) additionalInfoDisclosureScreen.N.getValue();
                        switch (nVar.f218838a) {
                            case 0:
                                return (e) nVar.d.get();
                            default:
                                return (e) nVar.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoDisclosureScreen f324912b;

            {
                this.f324912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen = this.f324912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalInfoDisclosureScreen.Q;
                        AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen2 = this.f324912b;
                        return dli.f.a(additionalInfoDisclosureScreen2, (e) additionalInfoDisclosureScreen2.O.getValue(), u.c(new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalInfoDisclosureScreen.Q;
                        qji.b bVarU2 = additionalInfoDisclosureScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.di.AdditionalInfoDisclosureScreenInjector");
                        m mVar = (m) ((atf.a) bVarU2).y().mo3808a(additionalInfoDisclosureScreen);
                        AdditionalInfoDisclosureScreenContract$InputData additionalInfoDisclosureScreenContract$InputData = additionalInfoDisclosureScreen.K;
                        switch (mVar.f218835a) {
                            case 0:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                            default:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                        }
                        return (n) mVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalInfoDisclosureScreen.Q;
                        n nVar = (n) additionalInfoDisclosureScreen.N.getValue();
                        switch (nVar.f218838a) {
                            case 0:
                                return (e) nVar.d.get();
                            default:
                                return (e) nVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zsf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoDisclosureScreen f324912b;

            {
                this.f324912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen = this.f324912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalInfoDisclosureScreen.Q;
                        AdditionalInfoDisclosureScreen additionalInfoDisclosureScreen2 = this.f324912b;
                        return dli.f.a(additionalInfoDisclosureScreen2, (e) additionalInfoDisclosureScreen2.O.getValue(), u.c(new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalInfoDisclosureScreen.Q;
                        qji.b bVarU2 = additionalInfoDisclosureScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.disclosure.di.AdditionalInfoDisclosureScreenInjector");
                        m mVar = (m) ((atf.a) bVarU2).y().mo3808a(additionalInfoDisclosureScreen);
                        AdditionalInfoDisclosureScreenContract$InputData additionalInfoDisclosureScreenContract$InputData = additionalInfoDisclosureScreen.K;
                        switch (mVar.f218835a) {
                            case 0:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                            default:
                                additionalInfoDisclosureScreenContract$InputData.getClass();
                                mVar.d = additionalInfoDisclosureScreenContract$InputData;
                                break;
                        }
                        return (n) mVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalInfoDisclosureScreen.Q;
                        n nVar = (n) additionalInfoDisclosureScreen.N.getValue();
                        switch (nVar.f218838a) {
                            case 0:
                                return (e) nVar.d.get();
                            default:
                                return (e) nVar.d.get();
                        }
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zsf.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextClause(this.K.f92383a.f92415a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new z3f.b(this, null, 27), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
