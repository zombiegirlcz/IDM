package zc7;

import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mlk.a0;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wkm.l;
import wsg.n;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements csh.e {

    @NotNull
    public static final d Companion = new d();
    public static final Set k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmd.b f321253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final emd.d f321254c;
    public final wif.a d;
    public final ang.f e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nqj.c f321255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dsd.f f321256h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l80.e f321257j;

    static {
        wi0.b.Companion.getClass();
        k = y0.b(wi0.b.n3);
    }

    public i(mmd.b netWorthInteractor, emd.d totalWealthWidgetMapper, wif.a userFeaturesChecker, ang.f userInteractor, n walletInteractor, nqj.c balanceHistoryInteractor, dsd.f balanceSourceMapper, gte.a featureToggleInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(netWorthInteractor, "netWorthInteractor");
        Intrinsics.checkNotNullParameter(totalWealthWidgetMapper, "totalWealthWidgetMapper");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(balanceHistoryInteractor, "balanceHistoryInteractor");
        Intrinsics.checkNotNullParameter(balanceSourceMapper, "balanceSourceMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f321253b = netWorthInteractor;
        this.f321254c = totalWealthWidgetMapper;
        this.d = userFeaturesChecker;
        this.e = userInteractor;
        this.f = walletInteractor;
        this.f321255g = balanceHistoryInteractor;
        this.f321256h = balanceSourceMapper;
        this.i = featureToggleInteractor;
        this.f321257j = dateProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0373, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0375, code lost:
    
        r3 = yld.g.ASSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0379, code lost:
    
        if (r3 == yld.g.LIABILITY) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x037b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x037d, code lost:
    
        r2 = ipd.h.a(r11, r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0381, code lost:
    
        r6 = new com.revolut.core.ui_kit.delegates.RowDelegate.Model.c.b(r15, r2, null, false, 124);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0398, code lost:
    
        r10.add(new com.revolut.core.ui_kit.delegates.RowDelegate.Model(r20, r21, r22, null, 0, r25, null, null, 0, r6, false, null, false, null, null, null, null, null, null, r39, null, 0, 0, 0, 0, 532675544));
        r3 = r14;
        r2 = r17;
        r4 = null;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03dd, code lost:
    
        return com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.Companion.d(r7, r8, r4, r10, null, null, r13, com.revolut.core.ui_kit.delegates.widgets.u3.f55521a, 24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        if (r5.equals("TotalWealthLarge") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        if (r5.equals("TotalWealthItems") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0144, code lost:
    
        r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.home_feed_interactive_widget_title_total_wealth, null, null, 14);
        kotlin.jvm.internal.Intrinsics.h(r1);
        r2 = (dnd.b) r2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "listId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "totalWealthGroups");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "baseCurrency");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "dailyBalancesBySource");
        r5 = r7;
        r7 = com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.INSTANCE;
        r11 = new com.revolut.core.ui_kit.models.MoneyClause(dnd.b.b(r13), new com.revolut.core.ui_kit.models.MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
        r12 = r2.a(r13, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a0, code lost:
    
        if (r12 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a2, code lost:
    
        r18 = false;
        r9 = v1.c.f(zhm.v.k(r12, new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_home_widget_performance_period, null, null, 14)), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bb, code lost:
    
        r18 = false;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01be, code lost:
    
        r4 = new com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.BigHeaderModel("NETWORTH_WIDGET_LIST_ID_HEADER", r3, new op0.t(r11, "NETWORTH_WIDGET_LIST_ID_HEADER", r9, 26), false, r13, 40);
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e0, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e2, code lost:
    
        r4 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
    
        r4 = r13.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01eb, code lost:
    
        r3 = zhm.d0.V0(r3, r4);
        r4 = null;
        r10 = new java.util.ArrayList(zhm.w.t(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0205, code lost:
    
        if (r3.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0207, code lost:
    
        r5 = (amd.j) r3.next();
        r6 = r5.f6332a;
        r20 = r6.name();
        r21 = new com.revolut.core.ui_kit.delegates.RowDelegate.Model.MainImage.Image40(fsd.c.c(r6), null, null, false, null, false, 62);
        r22 = fsd.c.e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0230, code lost:
    
        if (mra.d.y(r5) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0232, code lost:
    
        r25 = fsd.c.d(r6, r5.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023b, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0241, code lost:
    
        if (mra.d.y(r5) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0243, code lost:
    
        r6 = new com.revolut.core.ui_kit.delegates.tf(6, new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_chevron_right, (java.lang.Integer) null, (java.lang.Integer) null, java.lang.Integer.valueOf(com.revolut.core.ui_kit_resources.R$attr.uikit_colorGreyTone20), (java.util.List) null, (com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations) null, (com.revolut.core.ui_kit.models.Clause) null, 246), r18);
        r17 = r2;
        r14 = r3;
        r39 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026f, code lost:
    
        r11 = mra.d.o0(r5);
        r15 = new com.revolut.core.ui_kit.models.MoneyClause(nz8.d.q(r11), new com.revolut.core.ui_kit.models.MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        r4 = r2.f116287a.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02b8, code lost:
    
        if (r4.isEmpty() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02bb, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02bc, code lost:
    
        if (r4 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02be, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02c0, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c1, code lost:
    
        r39 = r5;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c6, code lost:
    
        r4 = r4;
        r17 = r2;
        r6 = new java.util.ArrayList(zhm.w.t(r4, 10));
        r2 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02dd, code lost:
    
        if (r2.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02df, code lost:
    
        r14 = (nzi.g) r0.get((nzi.f) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ed, code lost:
    
        if (r14 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02f0, code lost:
    
        r6.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f6, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ff, code lost:
    
        if (r11.k() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0301, code lost:
    
        r11 = new dj0.d(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x030d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r11.f115083b, r1) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0310, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0311, code lost:
    
        if (r11 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0314, code lost:
    
        r2 = r6.iterator();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0320, code lost:
    
        if (r2.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0322, code lost:
    
        r2 = r2 + ((nzi.g) r2.next()).f221072b;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0330, code lost:
    
        r39 = r5;
        r5 = new dj0.d(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0339, code lost:
    
        if ((r4 instanceof java.util.Collection) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0342, code lost:
    
        if (r4.isEmpty() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0344, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0346, code lost:
    
        r2 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x034e, code lost:
    
        if (r2.hasNext() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0350, code lost:
    
        r3 = (nzi.f) r2.next();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "balanceSource");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0361, code lost:
    
        if (dsd.f.f117294b.contains(r3) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0365, code lost:
    
        if (r3 != nzi.f.OTHER_ASSETS) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x036e, code lost:
    
        if (dsd.f.f117295c.contains(r3) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0370, code lost:
    
        r3 = yld.g.LIABILITY;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(zc7.i r46, java.lang.String r47, java.lang.String r48, java.lang.Integer r49, java.util.List r50, java.util.Map r51, gim.c r52) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc7.i.i(zc7.i, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.Map, gim.c):java.lang.Object");
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1698978225) {
            if (iHashCode != -1696761398) {
                if (iHashCode == -1689955434 && str.equals("TotalWealthSmall")) {
                    dsh.e.Companion.getClass();
                    return dsh.d.a();
                }
            } else if (str.equals("TotalWealthLarge")) {
                dsh.e.Companion.getClass();
                return dsh.d.a();
            }
        } else if (str.equals("TotalWealthItems")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(new wc7.e(rd0.e.b(this.d.d(wog.a.ANALYTICS)), str, this, 16), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r11.equals("TotalWealthLarge") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r11.equals("TotalWealthItems") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.Companion.b(com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.INSTANCE, r10, new com.revolut.core.ui_kit.models.TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.home_feed_interactive_widget_title_total_wealth, null, null, 14), 3, null, 24);
     */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model d(java.lang.String r10, java.lang.String r11, dsh.e r12) {
        /*
            r9 = this;
            java.lang.String r12 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r12)
            java.lang.String r12 = "widgetType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r12)
            int r12 = r11.hashCode()
            r0 = -1698978225(0xffffffff9abba64f, float:-7.7610073E-23)
            r1 = 14
            r2 = 0
            if (r12 == r0) goto L3f
            r0 = -1696761398(0xffffffff9add79ca, float:-9.160022E-23)
            if (r12 == r0) goto L36
            r0 = -1689955434(0xffffffff9b455396, float:-1.6322466E-22)
            if (r12 != r0) goto L5a
            java.lang.String r12 = "TotalWealthSmall"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L5a
            com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate$Model r11 = new com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.home_feed.api.R$string.home_feed_interactive_widget_title_total_wealth
            r12.<init>(r0, r2, r2, r1)
            r0 = 4
            r11.<init>(r0, r12, r10)
            return r11
        L36:
            java.lang.String r12 = "TotalWealthLarge"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L5a
            goto L47
        L3f:
            java.lang.String r12 = "TotalWealthItems"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L5a
        L47:
            com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model$a r3 = com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r11 = com.revolut.feature.home_feed.api.R$string.home_feed_interactive_widget_title_total_wealth
            r5.<init>(r11, r2, r2, r1)
            r7 = 0
            r8 = 24
            r6 = 3
            r4 = r10
            com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate$Model r10 = com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate.Model.Companion.b(r3, r4, r5, r6, r7, r8)
            return r10
        L5a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zc7.i.d(java.lang.String, java.lang.String, dsh.e):com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model");
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str, new Integer(3), str2), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        NetworthWidgetContext widgetContext2 = (NetworthWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(new wc7.e(rd0.e.b(this.d.d(wog.a.ANALYTICS)), widgetType, this, 16), new x4k.c((Continuation) null, this, id10, widgetType, 7));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((NetworthWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final l j(String str, Integer num, String str2) {
        int iHashCode = str2.hashCode();
        if (iHashCode == -1698978225 ? !str2.equals("TotalWealthItems") : iHashCode == -1696761398 ? !str2.equals("TotalWealthLarge") : !(iHashCode == -1689955434 && str2.equals("TotalWealthSmall"))) {
            throw new IllegalStateException();
        }
        mmd.b bVar = this.f321253b;
        return q.Q(mo3.a.g(nim.a.v(bVar.a(v.k(bVar.f207196a, bVar.f207197b, bVar.f207198c, bVar.d, bVar.e, bVar.f, bVar.f207199g)), new a0(bVar)), null, new z8d.h(9), 1), new ahe.y0(29, this, str, str2, num, (Continuation) null));
    }
}
