package com.revolut.feature.card_screen.impl.card_selection.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b73.b;
import b73.c;
import b73.f;
import c73.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.card_screen.common.R$string;
import com.revolut.feature.card_screen.impl.R$layout;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n63.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_screen/impl/card_selection/screen/CardSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln63/d;", "Ldli/a;", "Lb73/f;", "", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSelectionScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardSelectionBinding;", 0))};
    public final CardSelectionNavigationData$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CardSelectionScreen(CardSelectionNavigationData$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_card_selection;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: b73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSelectionScreen f12869b;

            {
                this.f12869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardSelectionScreen cardSelectionScreen = this.f12869b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSelectionScreen.m2()).a().get(c73.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c73.j.class, " is not found"));
                        }
                        c73.j jVar = ((c73.j) aVar2.b()).f21870r;
                        CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = cardSelectionScreen.K;
                        cardSelectionNavigationData$InputData.getClass();
                        return new c73.i(jVar, cardSelectionNavigationData$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSelectionScreen.R;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        CardSelectionScreen cardSelectionScreen2 = this.f12869b;
                        return dli.f.a(cardSelectionScreen2, (d) cardSelectionScreen2.P.getValue(), v.k((RowDelegate) cardSelectionScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new TextDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CardSelectionScreen.R;
                        return (d) ((c73.i) cardSelectionScreen.N.getValue()).f21858c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: b73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSelectionScreen f12869b;

            {
                this.f12869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardSelectionScreen cardSelectionScreen = this.f12869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSelectionScreen.m2()).a().get(c73.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c73.j.class, " is not found"));
                        }
                        c73.j jVar = ((c73.j) aVar2.b()).f21870r;
                        CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = cardSelectionScreen.K;
                        cardSelectionNavigationData$InputData.getClass();
                        return new c73.i(jVar, cardSelectionNavigationData$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSelectionScreen.R;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        CardSelectionScreen cardSelectionScreen2 = this.f12869b;
                        return dli.f.a(cardSelectionScreen2, (d) cardSelectionScreen2.P.getValue(), v.k((RowDelegate) cardSelectionScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new TextDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CardSelectionScreen.R;
                        return (d) ((c73.i) cardSelectionScreen.N.getValue()).f21858c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: b73.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSelectionScreen f12869b;

            {
                this.f12869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardSelectionScreen cardSelectionScreen = this.f12869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cardSelectionScreen.m2()).a().get(c73.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c73.j.class, " is not found"));
                        }
                        c73.j jVar = ((c73.j) aVar2.b()).f21870r;
                        CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = cardSelectionScreen.K;
                        cardSelectionNavigationData$InputData.getClass();
                        return new c73.i(jVar, cardSelectionNavigationData$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSelectionScreen.R;
                        int i32 = R$id.navBarBottomSheet_RecyclerView;
                        CardSelectionScreen cardSelectionScreen2 = this.f12869b;
                        return dli.f.a(cardSelectionScreen2, (d) cardSelectionScreen2.P.getValue(), v.k((RowDelegate) cardSelectionScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new TextDelegate()), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CardSelectionScreen.R;
                        return (d) ((c73.i) cardSelectionScreen.N.getValue()).f21858c.get();
                }
            }
        });
        this.Q = w.y0(new aw1.a(23));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b73.d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((g73.b) value).f141088b;
        CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = this.K;
        Clause textLocalisedClause = cardSelectionNavigationData$InputData.f65350a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_screen_card_selection_title, null, null, 14);
        }
        navBarBottomSheet.setHeaderModel(new lw0.a(textLocalisedClause, cardSelectionNavigationData$InputData.f65351b, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
