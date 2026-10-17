package com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.SplitBySourceScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import yc3.g;
import zd3.d;
import zd3.e;
import zd3.f;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/split_by_source/SplitBySourceScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzd3/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lzd3/d;", "<init>", "()V", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBySourceScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, d> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(SplitBySourceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final Object V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65734a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65735b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public SplitBySourceScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: zd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBySourceScreen f321297b;

            {
                this.f321297b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i5 = 0;
                SplitBySourceScreen splitBySourceScreen = this.f321297b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBySourceScreen.c0;
                        qji.b bVarQ2 = splitBySourceScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.di.SplitBySourceScreenInjector");
                        yc3.a aVar = ((yc3.h) bVarQ2).f312486b;
                        yc3.g gVar = new yc3.g();
                        int i6 = 20;
                        gVar.f312483a = e4m.b.b(new xsl.q(aVar, gVar, i3, i6));
                        gVar.f312484b = e4m.b.b(new xsl.q(aVar, gVar, i5, i6));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBySourceScreen.c0;
                        return (e) ((yc3.g) splitBySourceScreen.U.getValue()).f312484b.get();
                    default:
                        return v.k((ListSubheaderDelegate) splitBySourceScreen.Z.getValue(), (RowDelegate) splitBySourceScreen.f65734a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: zd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBySourceScreen f321297b;

            {
                this.f321297b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                int i5 = 0;
                SplitBySourceScreen splitBySourceScreen = this.f321297b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBySourceScreen.c0;
                        qji.b bVarQ2 = splitBySourceScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.di.SplitBySourceScreenInjector");
                        yc3.a aVar = ((yc3.h) bVarQ2).f312486b;
                        yc3.g gVar = new yc3.g();
                        int i6 = 20;
                        gVar.f312483a = e4m.b.b(new xsl.q(aVar, gVar, i3, i6));
                        gVar.f312484b = e4m.b.b(new xsl.q(aVar, gVar, i5, i6));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBySourceScreen.c0;
                        return (e) ((yc3.g) splitBySourceScreen.U.getValue()).f312484b.get();
                    default:
                        return v.k((ListSubheaderDelegate) splitBySourceScreen.Z.getValue(), (RowDelegate) splitBySourceScreen.f65734a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar;
        this.X = true;
        this.Y = s.t(this, a.f);
        this.Z = w.y0(new zc0.m(5));
        this.f65734a0 = w.y0(new zc0.m(6));
        final int i3 = 2;
        this.f65735b0 = w.y0(new Function0(this) { // from class: zd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBySourceScreen f321297b;

            {
                this.f321297b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                int i5 = 0;
                SplitBySourceScreen splitBySourceScreen = this.f321297b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SplitBySourceScreen.c0;
                        qji.b bVarQ2 = splitBySourceScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.di.SplitBySourceScreenInjector");
                        yc3.a aVar = ((yc3.h) bVarQ2).f312486b;
                        yc3.g gVar = new yc3.g();
                        int i6 = 20;
                        gVar.f312483a = e4m.b.b(new xsl.q(aVar, gVar, i32, i6));
                        gVar.f312484b = e4m.b.b(new xsl.q(aVar, gVar, i5, i6));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SplitBySourceScreen.c0;
                        return (e) ((yc3.g) splitBySourceScreen.U.getValue()).f312484b.get();
                    default:
                        return v.k((ListSubheaderDelegate) splitBySourceScreen.Z.getValue(), (RowDelegate) splitBySourceScreen.f65734a0.getValue(), new RowLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (g) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new z3f.b(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f65734a0.getValue()).f53218h), null, new zd3.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cashback_details_split_by_source_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cashback_details_split_by_source_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF93103e0() {
        return (List) this.f65735b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
