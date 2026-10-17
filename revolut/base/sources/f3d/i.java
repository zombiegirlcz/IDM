package f3d;

import ahd.y;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import dsh.n;
import efm.r;
import hy1.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l3d.h0;
import njj.l;
import org.joda.time.DateTime;
import vkm.v1;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jpc.e f131949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qfd.a f131950c;
    public final v1d.b d;
    public final s1d.a e;

    public i(jpc.e widgetDataProvider, qfd.a assetSelectorScreenProvider, s1d.a symbolWidgetConfigProvider, v1d.b watchlistWidgetConfigProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(assetSelectorScreenProvider, "assetSelectorScreenProvider");
        Intrinsics.checkNotNullParameter(watchlistWidgetConfigProvider, "watchlistWidgetConfigProvider");
        Intrinsics.checkNotNullParameter(symbolWidgetConfigProvider, "symbolWidgetConfigProvider");
        this.f131949b = widgetDataProvider;
        this.f131950c = assetSelectorScreenProvider;
        this.d = watchlistWidgetConfigProvider;
        this.e = symbolWidgetConfigProvider;
    }

    public static ActionWidgetDelegate.Model j(String str) {
        return new ActionWidgetDelegate.Model(str, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(20.0f), null, 32), new TextLocalisedClause(R$string.shared_watchlist_symbol_widget_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r4, gim.c r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof f3d.b
            if (r4 == 0) goto L13
            r4 = r5
            f3d.b r4 = (f3d.b) r4
            int r0 = r4.f131935y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f131935y = r0
            goto L18
        L13:
            f3d.b r4 = new f3d.b
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f131933w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f131935y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            dsh.f r0 = r4.v
            dsh.f r4 = r4.u
            yhm.o.b(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r5)
            dsh.f r5 = new dsh.f
            r5.<init>()
            r4.u = r5
            r4.v = r5
            r4.f131935y = r2
            s1d.a r1 = r3.e
            java.lang.Object r4 = r1.c(r4)
            if (r4 != r0) goto L4a
            return r0
        L4a:
            r0 = r5
            r5 = r4
            r4 = r0
        L4d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L56
            java.lang.String r1 = "WATCHLIST_WIDGET_ASSET_IDS"
            r0.a(r1, r5)
        L56:
            dsh.e r5 = new dsh.e
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f3d.i.b(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.e.d((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, id10);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new d(this, widgetType, config, id10, null));
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        f0d.k kVar = new f0d.k(25);
        Integer numK = this.e.k();
        return new dsh.j(new TextLocalisedClause(numK != null ? numK.intValue() : R$string.shared_watchlist_widget_customisation_screen_title, null, null, 14), new n(this.f131950c.a(new SelectAssetsInputData(this.d.c(), new SelectAssetsInputData.SelectionMode.SingleSelection(inputConfig.a("WATCHLIST_WIDGET_ASSET_IDS")))), kVar), ModalDestination.Style.POPUP.f98311a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, dsh.e r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof f3d.c
            if (r0 == 0) goto L13
            r0 = r8
            f3d.c r0 = (f3d.c) r0
            int r1 = r0.f131937x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131937x = r1
            goto L1a
        L13:
            f3d.c r0 = new f3d.c
            gim.c r8 = (gim.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131937x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L54
        L3a:
            yhm.o.b(r8)
            if (r7 == 0) goto L47
            java.lang.String r8 = "WATCHLIST_WIDGET_ASSET_IDS"
            java.lang.String r7 = r7.a(r8)
            if (r7 != 0) goto L5e
        L47:
            r0.u = r6
            r0.f131937x = r4
            s1d.a r7 = r5.e
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L54
            goto L6d
        L54:
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L5e
            com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate$Model r6 = j(r6)
            return r6
        L5e:
            kotlinx.coroutines.flow.Flow r6 = r5.k(r6, r7, r4)
            r7 = 0
            r0.u = r7
            r0.f131937x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f3d.i.i(java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow k(String str, String str2, boolean z) {
        x1d.b.Companion.getClass();
        x1d.b standaloneSymbolWidgetData = x1d.a.a(str2);
        if (standaloneSymbolWidgetData == null) {
            return org.bouncycastle.jcajce.provider.digest.a.s(3, null);
        }
        Intrinsics.checkNotNullParameter(standaloneSymbolWidgetData, "standaloneSymbolWidgetData");
        jpc.e eVar = this.f131949b;
        q3d.g gVar = (q3d.g) eVar.f177257c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(standaloneSymbolWidgetData, "standaloneSymbolWidgetData");
        h0 h0Var = gVar.f241951a;
        FavouritesAssetTypeKey assetsToDisplay = standaloneSymbolWidgetData.f302363a;
        String from = standaloneSymbolWidgetData.f302364b;
        String to6 = standaloneSymbolWidgetData.f302365c;
        Intrinsics.checkNotNullParameter(assetsToDisplay, "assetsToDisplay");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        DateTime dateTimeNow = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
        z3d.e eVar2 = new z3d.e(from, to6, dateTimeNow, assetsToDisplay, z3d.f.SYNCED);
        r map = rd0.e.c(new l(new b0(h0Var.f191911c.b(u.c(eVar2), true, true, true), eVar2, h0Var, 21), 14), kotlin.coroutines.g.f186406a).map(new q3d.c(2, new q3d.b(eVar, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new y(new g(rd0.e.b(map), z, 0), this, str, 27);
    }
}
