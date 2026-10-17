package com.revolut.feature.shared.help_centre.impl.faq.screens.something_else;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import r7d.k;
import sji.b;
import te0.w;
import tx0.j0;
import u1.g;
import u7k.f0;
import u8d.d;
import u8d.e;
import u8d.f;
import u8d.i;
import u8d.j;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/something_else/FaqSomethingElseScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lu8d/f;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/something_else/FaqSomethingElseContract$InputData;", "Lu8d/d;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqSomethingElseScreen extends BaseRecyclerViewScreen<f, FaqSomethingElseContract$InputData, d> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86300d0 = {o0.f186429a.j(new h0(FaqSomethingElseScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final boolean X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SearchButtonDelegate f86301a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86302b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqSomethingElseScreen(FaqSomethingElseContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, i.f);
        this.W = true;
        this.X = true;
        this.Y = w.y0(new g(this, inputData, 20));
        this.Z = new RowDelegate(null, null, 7);
        this.f86301a0 = new SearchButtonDelegate();
        final int i = 0;
        this.f86302b0 = w.y0(new Function0(this) { // from class: u8d.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqSomethingElseScreen f278178b;

            {
                this.f278178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FaqSomethingElseScreen faqSomethingElseScreen = this.f278178b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FaqSomethingElseScreen.f86300d0;
                        return v.k(new ListSubheaderDelegate(), faqSomethingElseScreen.Z, faqSomethingElseScreen.f86301a0);
                    default:
                        KProperty[] kPropertyArr2 = FaqSomethingElseScreen.f86300d0;
                        return (e) ((r7d.k) faqSomethingElseScreen.Y.getValue()).f252128c.get();
                }
            }
        });
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: u8d.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqSomethingElseScreen f278178b;

            {
                this.f278178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FaqSomethingElseScreen faqSomethingElseScreen = this.f278178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FaqSomethingElseScreen.f86300d0;
                        return v.k(new ListSubheaderDelegate(), faqSomethingElseScreen.Z, faqSomethingElseScreen.f86301a0);
                    default:
                        KProperty[] kPropertyArr2 = FaqSomethingElseScreen.f86300d0;
                        return (e) ((r7d.k) faqSomethingElseScreen.Y.getValue()).f252128c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new u07.b(this, continuation, 14), 3);
        a.g2(this, rd0.e.b(h3().f174539b.o.f57403b), null, new f0(this, continuation, 7), 3);
        a.g2(this, rd0.e.b(this.Z.f53218h), null, new j(this, null), 3);
        a.g2(this, rd0.e.b(this.f86301a0.f53283c.f121375b), null, new u8d.k(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        m mVarH3 = h3();
        mVarH3.f174539b.setTag("FaqSomethingElseScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("FaqSomethingElseScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f86302b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setTitle(uiState.f278171a, null);
        navBarWithToolbar.setMenuItems(uiState.f278173c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, f86300d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
