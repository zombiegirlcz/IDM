package yc7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import com.revolut.feature.junior.accounts.impl.ui.junior_selection.JuniorSelectionScreen;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import y65.n;
import ybh.a0;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf8.k f312554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f312555c;
    public final wa7.m d;

    public j(zf8.k juniorAccountInfoProvider, u68.i juniorWidgetNavigationScreensProvider, jla.h productCatalogueInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorWidgetNavigationScreensProvider, "juniorWidgetNavigationScreensProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f312554b = juniorAccountInfoProvider;
        this.f312555c = productCatalogueInteractor;
        this.d = hiddenAccountsInteractor;
    }

    public static QuickActionWidgetDelegate.Model i(String str, sf8.m mVar, boolean z) {
        ContactImage contactImage = new ContactImage(mVar.f262361b, (String) null, (String) null, (String) null, (String) null, mVar.b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_widgets_small_account_widget_child_balance, u.c(new MoneyClause(mVar.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        d3 d3Var = new d3(new e3(R$drawable.uikit_icn_24_plus, c8g.a.l(mVar.e) || z), (e3) null, 6);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.junior_widgets_small_account_widget_child_name, u.c(new TextClause(mVar.f262362c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        int i = R$attr.uikit_colorBackground;
        return new QuickActionWidgetDelegate.Model(str, contactImage, null, null, textLocalisedClause, d3Var, new TagViewData(null, textLocalisedClause2, i, null, i, null, 968), mVar, 268);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yc7.b
            if (r0 == 0) goto L13
            r0 = r8
            yc7.b r0 = (yc7.b) r0
            int r1 = r0.f312545x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312545x = r1
            goto L18
        L13:
            yc7.b r0 = new yc7.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312545x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            java.util.List r7 = r0.u
            java.util.List r7 = (java.util.List) r7
            yhm.o.b(r8)
            goto L75
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L5e
        L3b:
            yhm.o.b(r8)
            java.lang.String r8 = "JuniorAccountSmall"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r7 == 0) goto Lc2
            vkm.d r7 = r6.k()
            y65.n r8 = new y65.n
            r2 = 26
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r4, r8, r5)
            r0.f312545x = r5
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L5e
            goto L74
        L5e:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            wa7.m r8 = r6.d
            t38.e r8 = r8.k()
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.f312545x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            java.util.Set r8 = (java.util.Set) r8
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            r2 = r1
            sf8.m r2 = (sf8.m) r2
            java.lang.String r2 = r2.f262361b
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L7e
            r4 = r1
        L94:
            sf8.m r4 = (sf8.m) r4
            if (r4 != 0) goto L9f
            java.lang.Object r8 = zhm.d0.b0(r7)
            r4 = r8
            sf8.m r4 = (sf8.m) r4
        L9f:
            dsh.f r8 = new dsh.f
            r8.<init>()
            java.lang.String r0 = "childId"
            java.lang.String r1 = r4.f262361b
            r8.a(r0, r1)
            int r7 = r7.size()
            if (r7 <= r5) goto Lb2
            goto Lb3
        Lb2:
            r5 = 0
        Lb3:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "JUNIOR_WIDGET_SELECTION_AVAILABLE"
            r8.a(r0, r7)
            dsh.e r7 = new dsh.e
            r7.<init>(r8)
            return r7
        Lc2:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yc7.j.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof yc7.e
            if (r6 == 0) goto L13
            r6 = r7
            yc7.e r6 = (yc7.e) r6
            int r0 = r6.f312548w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f312548w = r0
            goto L1a
        L13:
            yc7.e r6 = new yc7.e
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f312548w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r7)
            goto L74
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L53
        L38:
            yhm.o.b(r7)
            jla.h r7 = r5.f312555c
            java.lang.String r1 = "YOUTH"
            exe.j r7 = bla.b.b(r7, r1)
            sa6.o r1 = new sa6.o
            r4 = 15
            r1.<init>(r7, r4)
            r6.f312548w = r3
            java.lang.Object r7 = vkm.q.x(r1, r6)
            if (r7 != r0) goto L53
            goto L73
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7d
            vkm.d r7 = r5.k()
            y65.n r1 = new y65.n
            r4 = 25
            r1.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r1, r3)
            r6.f312548w = r2
            java.lang.Object r7 = vkm.q.z(r7, r6)
            if (r7 != r0) goto L74
        L73:
            return r0
        L74:
            java.util.List r7 = (java.util.List) r7
            boolean r6 = ue0.e.n(r7)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r3 = 0
        L7e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yc7.j.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "JuniorAccountSmall")) {
            return new QuickActionWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(new wc7.e(mo3.a.g(j(eVar), null, new n(27), 1), 9, this, str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "JuniorAccountSmall")) {
            return new wc7.e(j(config), 10, this, id10);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Boolean.parseBoolean(inputConfig.a("JUNIOR_WIDGET_SELECTION_AVAILABLE"))) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        String strA = inputConfig.a("childId");
        if (!Intrinsics.f(widgetType, "JuniorAccountSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_widgets_small_account_widget_customization_actions_select_account, null, null, 14);
        if (strA == null) {
            m70.a.c(t0.f186434a);
            strA = "";
        }
        JuniorSelectionInputData inputData = new JuniorSelectionInputData(strA);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new dsh.j(textLocalisedClause, new dsh.m(new JuniorSelectionScreen(inputData), new dsh.q(inputConfig, 9)), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
    }

    public final Flow j(dsh.e eVar) {
        Flow flowV;
        String strA = eVar != null ? eVar.a("childId") : null;
        wa7.m mVar = this.d;
        if (strA != null) {
            r rVarSkip = this.f312554b.b(strA).skip(1L);
            Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
            flowV = rd0.e.b(rVarSkip);
        } else {
            flowV = nim.a.v(u0.m(k(), new h(mVar.k(), 0)), new a0(16));
        }
        return c6d.b.i(u0.m(flowV, new h(mVar.k(), 1)), new a0(17));
    }

    public final vkm.d k() {
        return rd0.e.b(zi0.c.u(zf8.k.a(this.f312554b, w4l.h.f294642c), new a0(18)));
    }
}
