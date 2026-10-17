package com.revolut.feature.apm.bizum.impl.ui.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.impl.R$id;
import com.revolut.feature.apm.bizum.impl.R$layout;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hl7.ma;
import ht1.c;
import ht1.e;
import ht1.f;
import ht1.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/settings/BizumSettingsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lht1/c;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumSettingsScreen extends BaseRecyclerViewScreen<c, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(BizumSettingsScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumAreaBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61597a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61598b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f61599d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f61600e0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, ks1.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/bizum/impl/databinding/ScreenBizumAreaBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ks1.a.a(p0);
        }
    }

    public BizumSettingsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_bizum_area;
        this.V = R$id.bizumArea_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ht1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumSettingsScreen f155209b;

            {
                this.f155209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 3;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                int i22 = 4;
                BizumSettingsScreen bizumSettingsScreen = this.f155209b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BizumSettingsScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumSettingsScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                        }
                        ms1.j jVar = ((ms1.j) aVar2.b()).B;
                        ms1.q qVar = new ms1.q();
                        qVar.f208568a = e4m.b.b(e4m.c.a(bizumSettingsScreen));
                        int i32 = 29;
                        qVar.f208569b = e4m.b.b(new mjl.b(jVar, qVar, i5, i32));
                        qVar.f208570c = e4m.b.b(new mjl.b(jVar, qVar, i6, i32));
                        qVar.d = e4m.b.b(new mjl.b(jVar, qVar, i21, i32));
                        qVar.e = e4m.b.b(new mjl.b(jVar, qVar, i22, i32));
                        qVar.f = e4m.b.b(new mjl.b(jVar, qVar, i3, i32));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumSettingsScreen.f0;
                        return (b) ((ms1.q) bizumSettingsScreen.Y.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumSettingsScreen.f0;
                        return v.k((RowDelegate) bizumSettingsScreen.f61597a0.getValue(), (CellDetailsChevronDelegate) bizumSettingsScreen.f61598b0.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ht1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumSettingsScreen f155209b;

            {
                this.f155209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 3;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                int i222 = 4;
                BizumSettingsScreen bizumSettingsScreen = this.f155209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumSettingsScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumSettingsScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                        }
                        ms1.j jVar = ((ms1.j) aVar2.b()).B;
                        ms1.q qVar = new ms1.q();
                        qVar.f208568a = e4m.b.b(e4m.c.a(bizumSettingsScreen));
                        int i32 = 29;
                        qVar.f208569b = e4m.b.b(new mjl.b(jVar, qVar, i5, i32));
                        qVar.f208570c = e4m.b.b(new mjl.b(jVar, qVar, i6, i32));
                        qVar.d = e4m.b.b(new mjl.b(jVar, qVar, i21, i32));
                        qVar.e = e4m.b.b(new mjl.b(jVar, qVar, i222, i32));
                        qVar.f = e4m.b.b(new mjl.b(jVar, qVar, i3, i32));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumSettingsScreen.f0;
                        return (b) ((ms1.q) bizumSettingsScreen.Y.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumSettingsScreen.f0;
                        return v.k((RowDelegate) bizumSettingsScreen.f61597a0.getValue(), (CellDetailsChevronDelegate) bizumSettingsScreen.f61598b0.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
        this.f61597a0 = w.y0(new ma(27));
        this.f61598b0 = w.y0(new ma(28));
        this.c0 = w.y0(new ma(29));
        this.f61599d0 = w.y0(new e(0));
        final int i3 = 2;
        this.f61600e0 = w.y0(new Function0(this) { // from class: ht1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BizumSettingsScreen f155209b;

            {
                this.f155209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 3;
                int i5 = 2;
                int i6 = 1;
                int i21 = 0;
                int i222 = 4;
                BizumSettingsScreen bizumSettingsScreen = this.f155209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BizumSettingsScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(bizumSettingsScreen.m2()).a().get(ms1.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ms1.j.class, " is not found"));
                        }
                        ms1.j jVar = ((ms1.j) aVar2.b()).B;
                        ms1.q qVar = new ms1.q();
                        qVar.f208568a = e4m.b.b(e4m.c.a(bizumSettingsScreen));
                        int i322 = 29;
                        qVar.f208569b = e4m.b.b(new mjl.b(jVar, qVar, i5, i322));
                        qVar.f208570c = e4m.b.b(new mjl.b(jVar, qVar, i6, i322));
                        qVar.d = e4m.b.b(new mjl.b(jVar, qVar, i21, i322));
                        qVar.e = e4m.b.b(new mjl.b(jVar, qVar, i222, i322));
                        qVar.f = e4m.b.b(new mjl.b(jVar, qVar, i32, i322));
                        return qVar;
                    case 1:
                        KProperty[] kPropertyArr2 = BizumSettingsScreen.f0;
                        return (b) ((ms1.q) bizumSettingsScreen.Y.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = BizumSettingsScreen.f0;
                        return v.k((RowDelegate) bizumSettingsScreen.f61597a0.getValue(), (CellDetailsChevronDelegate) bizumSettingsScreen.f61598b0.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (ms1.q) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ht1.b) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ks1.a) value).f189087b.f59410q), null, new hbg.h(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f61597a0.getValue()).f53225r), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.f61598b0.getValue()).f51821c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f61599d0.getValue()).d.f121375b), null, new ht1.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((ms1.q) this.Y.getValue()).f208570c.get()).d(v.k((RowDelegate) this.c0.getValue(), (LargeActionButtonDelegate) this.f61599d0.getValue()));
        ViewBinding value = this.X.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((ks1.a) value).f189087b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bizum_settings_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bizum_settings_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF60649d0() {
        return (List) this.f61600e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
