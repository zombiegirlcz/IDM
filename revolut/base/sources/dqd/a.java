package dqd;

import a09.a0;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.f6;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.youTransactor.uCube.rpc.Constants;
import hea.n0;
import ip0.ai;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import kp0.w0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import v6l.b1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116936c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(dj0.d dVar, List list, xi0.b bVar, xi0.b bVar2) {
        this.f116934a = 5;
        this.f116936c = dVar;
        this.d = bVar;
        this.f116935b = list;
        this.e = bVar2;
    }

    private final Object a(Object obj2) {
        String str = (String) this.f116935b;
        nd0.b state = (nd0.b) this.f116936c;
        gd0.f fVar = (gd0.f) this.d;
        nd0.d dVar = (nd0.d) this.e;
        List news = (List) obj2;
        Intrinsics.checkNotNullParameter(news, "news");
        Iterator it8 = news.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((ChaosManagementNewsItem) it8.next()).f51352a, str)) {
                break;
            }
            i++;
        }
        int i2 = i;
        ArrayList arrayListF1 = d0.f1(news);
        ChaosManagementNewsItem chaosManagementNewsItem = (ChaosManagementNewsItem) news.get(i2);
        String id10 = chaosManagementNewsItem.f51352a;
        String title = chaosManagementNewsItem.f51353b;
        String subtitle = chaosManagementNewsItem.f51354c;
        String iconUrl = chaosManagementNewsItem.d;
        String destination = chaosManagementNewsItem.e;
        DateTime createdDate = chaosManagementNewsItem.f51355g;
        nd0.c type = chaosManagementNewsItem.f51356h;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(type, "type");
        arrayListF1.set(i2, new ChaosManagementNewsItem(id10, title, subtitle, iconUrl, destination, state, createdDate, type));
        return new pfm.h(new a0(fVar, 15, dVar, arrayListF1), 2);
    }

    private final Object b(Object obj2) {
        String str = (String) this.f116935b;
        nd0.a state = (nd0.a) this.f116936c;
        gd0.f fVar = (gd0.f) this.d;
        kd0.a aVar = (kd0.a) this.e;
        List incidents = (List) obj2;
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        Iterator it8 = incidents.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((ChaosManagementIncidentItem) it8.next()).f51343a, str)) {
                break;
            }
            i++;
        }
        ArrayList arrayListF1 = d0.f1(incidents);
        ChaosManagementIncidentItem chaosManagementIncidentItem = (ChaosManagementIncidentItem) incidents.get(i);
        String id10 = chaosManagementIncidentItem.f51343a;
        Map banners = chaosManagementIncidentItem.f51345c;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(banners, "banners");
        arrayListF1.set(i, new ChaosManagementIncidentItem(id10, state, banners));
        return new pfm.h(new gd0.a(fVar, aVar, arrayListF1, 1), 2);
    }

    private final Object c(Object obj2) {
        grj.f fVar = (grj.f) this.f116935b;
        xi0.b bVar = (xi0.b) this.d;
        LocalDate localDate = (LocalDate) this.f116936c;
        qzi.a aVar = (qzi.a) this.e;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        Intrinsics.h(list2);
        ArrayList<qua.p> arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (ksj.b.p((qua.p) obj3, ((l80.f) fVar.i).g())) {
                arrayList.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (qua.p pVar : arrayList) {
            xi0.a aVar2 = xi0.b.Companion;
            String str = pVar.i;
            aVar2.getClass();
            Double dM = jb3.l.m(list, xi0.a.a(str), bVar);
            long j2 = qua.u.g(pVar, dM != null ? dM.doubleValue() : 0.0d, bVar).f115082a;
            LocalDate localDatePlusDays = localDate.plusDays(1);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            for (LocalDate localDate2 : qua.u.d(pVar, new Interval(localDatePlusDays.toDateTimeAtStartOfDay(), aVar.f.toDateTimeAtStartOfDay().plusDays(1).minusMillis(1)))) {
                List list3 = (List) linkedHashMap.get(localDate2);
                linkedHashMap.put(localDate2, list3 != null ? d0.F0(Long.valueOf(j2), list3) : zhm.u.c(Long.valueOf(j2)));
            }
        }
        return linkedHashMap;
    }

    private final Object d(Object obj2) {
        gw1.e eVar = (gw1.e) this.f116935b;
        fi7.s sVar = (fi7.s) this.f116936c;
        ApmAliasRegistrationMode apmAliasRegistrationMode = (ApmAliasRegistrationMode) this.d;
        RegisterAlias$Alias registerAlias$Alias = (RegisterAlias$Alias) this.e;
        jx1.g outputData = (jx1.g) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        eVar.T2(new fc0.e(3, sVar, outputData, eVar, apmAliasRegistrationMode, registerAlias$Alias, (Continuation) null), new yi5.b(27));
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        gw1.g gVar = (gw1.g) this.f116935b;
        fi7.s sVar = (fi7.s) this.f116936c;
        Alias alias = (Alias) this.d;
        Alias alias2 = (Alias) this.e;
        jx1.g outputData = (jx1.g) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        gVar.T2(new fc0.e(4, sVar, outputData, gVar, alias, alias2, (Continuation) null), new yi5.b(27));
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f116935b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f116936c;
        com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.d;
        a2.a aVar = (a2.a) this.e;
        rg4.r output = (rg4.r) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (ref$BooleanRef.f186407a) {
            return Unit.f186387a;
        }
        Continuation continuation = null;
        if (output instanceof rg4.q) {
            Job job2 = (Job) ref$ObjectRef.f186409a;
            if (job2 == null || !job2.d()) {
                ref$ObjectRef.f186409a = dVar.l2(new h54.o(dVar, ref$BooleanRef, continuation, 0), new yi5.b(26));
            }
        } else if (output instanceof rg4.o) {
            ref$BooleanRef.f186407a = true;
            Job job3 = (Job) ref$ObjectRef.f186409a;
            if (job3 != null) {
                job3.f(null);
            }
            oki.h.t2(dVar, dVar.Q, new CreditApplicationFlowContract$Step.PreApplicationChecks(((rg4.o) output).f254029a), false, null, false, 12);
        } else {
            if (!(output instanceof rg4.p)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.invoke();
        }
        return Unit.f186387a;
    }

    private final Object h(Object obj2) {
        ha3.x xVar = (ha3.x) this.f116935b;
        String str = (String) this.f116936c;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        Boolean disposablePlaceholderAvailable = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(disposablePlaceholderAvailable, "disposablePlaceholderAvailable");
        if (!disposablePlaceholderAvailable.booleanValue()) {
            od0.i.Companion.getClass();
            return te0.w.h(zi0.c.P(od0.i.f224256b, false, null, 3));
        }
        j6l.b bVar = xVar.f150432a;
        b93.b.Companion.getClass();
        String design = b93.b.i0.f13615a;
        Intrinsics.checkNotNullParameter(design, "design");
        return ((b1) bVar).v.e(design, w4l.h.f294642c).map(new ha1.s(20, new be7.m(xVar, str, str2, str3, 1)));
    }

    private final Object i(Object obj2) {
        n0 n0Var = (n0) this.f116935b;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f116936c;
        CompositeClause compositeClause = (CompositeClause) this.d;
        NavBarWithToolbar.b bVar = (NavBarWithToolbar.b) this.e;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new hea.q(n0Var.f151645c.c(), textLocalisedClause, compositeClause, bVar);
    }

    private final Object j(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        hmc.e eVar = (hmc.e) this.f116935b;
        ilc.a roboContext = (ilc.a) this.f116936c;
        String portfolioId = (String) this.d;
        Template recommendedTemplate = (Template) this.e;
        wnc.o it8 = (wnc.o) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8 == null) {
            throw new NoWhenBranchMatchedException();
        }
        Template selectedTemplate = it8.f298809a;
        hmc.g gVar = eVar.o;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(roboContext, "roboContext");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        int i = R$string.wealth_robo_settings_change_template_dialog_title;
        nmc.d dVar = gVar.f153642a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, zhm.u.c(dVar.g(selectedTemplate)), null, 12);
        int i2 = hmc.f.f153641a[roboContext.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description, null, null, 14);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_description_sg, zhm.v.k(dVar.g(recommendedTemplate), dVar.g(selectedTemplate)), null, 12);
        }
        rp0.t tVar = new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("change_portfolio.cta.positive", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_positive, null, null, 14), false, null, null, new hmc.q(portfolioId, selectedTemplate), null, 744);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("change_portfolio.cta.cancel", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.wealth_robo_settings_change_template_dialog_cta_cancel, null, null, 14), false, null, null, hmc.p.f153656a, null, 744);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        eVar.f153637n.x(new rp0.y(zhm.v.k(model, model2), tVar, rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }

    private final Object k(Object obj2) {
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) this.f116935b;
        java.time.LocalDate localDate = (java.time.LocalDate) this.f116936c;
        java.time.LocalDate localDate2 = (java.time.LocalDate) this.d;
        String str = (String) this.e;
        xag.c filters = (xag.c) obj2;
        Intrinsics.checkNotNullParameter(filters, "filters");
        return nim.a.w(bVar.f94019q.d(new cgi.c(bVar.o.f94015a.f93664b, localDate, localDate2, str)), new i25.e(bVar, filters, 21)).map(new icc.c(new ieg.t(filters, 1), 24));
    }

    private final Object l(Object obj2) {
        ai aiVar = (ai) this.f116935b;
        String str = (String) this.f116936c;
        ai aiVar2 = (ai) this.d;
        f6 f6Var = (f6) this.e;
        Drawable drawable = (Drawable) obj2;
        if (!Intrinsics.f(aiVar.f163449g, str)) {
            return Unit.f186387a;
        }
        ImageView imageView = aiVar2.f163450h;
        f6Var.getClass();
        w0.c(imageView, ew0.a.f129982a, 50.0f, drawable, true);
        return Unit.f186387a;
    }

    private final Object m(Object obj2) {
        int i;
        ipk.a aVar;
        ipk.a aVar2;
        List list;
        ipk.e eVar = (ipk.e) this.f116935b;
        String str = (String) this.f116936c;
        String str2 = (String) this.d;
        ipk.a aVar3 = (ipk.a) this.e;
        kpk.a aVar4 = eVar.f167759c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM mid_rates_plot WHERE ( currencyFrom = ? AND currencyTo = ? ) AND duration = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, str2);
            }
            String strA = kpk.a.a(aVar3);
            if (strA == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, strA);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousRangeCloseRate");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyFrom");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyTo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "plot");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                if (text3 != null) {
                    kg.o oVarA = GsonHolder.a();
                    i = columnIndexOrThrow;
                    Type type = new TypeToken<ipk.a>() { // from class: com.revolut.retail.feature.ratedetails.impl.database.rates_plot.typeconverter.DurationTypeConverter$jsonToTitle$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text3, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    aVar = (ipk.a) objD;
                } else {
                    i = columnIndexOrThrow;
                    aVar = null;
                }
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (text4 != null) {
                    kg.o oVarA2 = GsonHolder.a();
                    aVar2 = aVar;
                    Type type2 = new TypeToken<List<? extends Pair<? extends Long, ? extends Double>>>() { // from class: com.revolut.retail.feature.ratedetails.impl.database.rates_plot.typeconverter.PlotDataTypeConverter$jsonToResidence$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    Object objD2 = oVarA2.d(text4, type2);
                    Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                    list = (List) objD2;
                } else {
                    aVar2 = aVar;
                    list = null;
                }
                arrayList.add(new ipk.f(d, text, text2, aVar2, list));
                columnIndexOrThrow = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object n(Object obj2) {
        WidgetisedAnalyticsType widgetisedAnalyticsType = (WidgetisedAnalyticsType) this.f116935b;
        return iyg.a.a((iyg.a) obj2, null, widgetisedAnalyticsType, null, widgetisedAnalyticsType != null ? ((com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) this.e).f95071y.f(widgetisedAnalyticsType) : false, null, (hel.b) this.f116936c, null, null, null, null, null, null, null, (Links) this.d, 8149);
    }

    private final Object o(Object obj2) {
        com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) this.f116935b;
        r0i.c cVar = (r0i.c) this.f116936c;
        wd6.e eVar = (wd6.e) this.d;
        k59.c cVar2 = (k59.c) this.e;
        j3i.k update = (j3i.k) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        TakeProfitStopLossParams takeProfitStopLossParams = bVar.o;
        r0i.c cVar3 = r0i.c.STOP;
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$LimitJ2 = null;
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$LimitI2 = ((cVar == cVar3 && eVar == wd6.e.BUY) || (cVar == r0i.c.LIMIT && eVar == wd6.e.SELL)) ? bVar.I2(cVar2, takeProfitStopLossParams.i) : null;
        if ((cVar == r0i.c.LIMIT && eVar == wd6.e.BUY) || (cVar == cVar3 && eVar == wd6.e.SELL)) {
            chartLimitPickerControllerContract$LimitJ2 = bVar.J2(cVar2, takeProfitStopLossParams.i);
        }
        return j3i.k.a(update, chartLimitPickerControllerContract$LimitJ2, chartLimitPickerControllerContract$LimitI2, null, null, null, Constants.TAG_FC_SPEED_MODE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f0  */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo[], java.lang.Object, java.lang.Object[]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dqd.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(j jVar, List list, xi0.b bVar, IncomeSorter incomeSorter, List list2) {
        this.f116934a = 0;
        this.f116935b = list;
        this.d = bVar;
        this.e = incomeSorter;
        this.f116936c = list2;
    }

    public /* synthetic */ a(grj.f fVar, xi0.b bVar, LocalDate localDate, qzi.a aVar) {
        this.f116934a = 17;
        this.f116935b = fVar;
        this.d = bVar;
        this.f116936c = localDate;
        this.e = aVar;
    }

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f116934a = i;
        this.f116935b = obj2;
        this.f116936c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public /* synthetic */ a(pi3.l lVar, pi3.l lVar2, ei3.m mVar, List list) {
        this.f116934a = 4;
        this.f116936c = lVar;
        this.d = lVar2;
        this.e = mVar;
        this.f116935b = list;
    }

    public /* synthetic */ a(wi0.b bVar, CreditCard creditCard, com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a aVar, od0.i iVar, od0.i iVar2) {
        this.f116934a = 7;
        this.f116935b = bVar;
        this.f116936c = creditCard;
        this.d = iVar;
        this.e = iVar2;
    }
}
