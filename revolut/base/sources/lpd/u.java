package lpd;

import android.os.Parcelable;
import aw0.r2;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreenContract$InputData;
import ip0.ck0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.k0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditCycleScreenContract$InputData f198992a;

    public u(EditCycleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f198992a = inputData;
    }

    public static qv0.i b(TextLocalisedClause textLocalisedClause, boolean z) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LargeActionButtonDelegate", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, z, null, null, null, null, 968);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp32, 0, 0, 12);
        return model;
    }

    public static aim.e c(k kVar) {
        ArrayList<Pair> arrayList;
        aim.e eVarB = zhm.u.b();
        int i = 0;
        if (kVar instanceof e) {
            d dVar = d.ON_THE_DAY;
            String string = dVar.toString();
            int i2 = R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_exact_title;
            e eVar = (e) kVar;
            d dVar2 = eVar.e;
            SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model(string, new TextLocalisedClause(i2, zhm.u.c(Integer.valueOf(eVar.f198971c)), null, 12), dVar2 == dVar, null, dVar, YearClass.CLASS_2008);
            d dVar3 = d.WEEK_DAY_BEFORE;
            SingleChoiceDelegate.Model model2 = new SingleChoiceDelegate.Model(dVar3.toString(), new TextLocalisedClause(R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_before_title, null, null, 14), dVar2 == dVar3, null, dVar3, YearClass.CLASS_2008);
            d dVar4 = d.WEEK_DAY_AFTER;
            eVarB.addAll(v.k(model, model2, new SingleChoiceDelegate.Model(dVar4.toString(), new TextLocalisedClause(R$string.analytics_period_filter_screen_monthly_picker_weekend_behaviour_after_title, null, null, 14), dVar2 == dVar4, null, dVar4, YearClass.CLASS_2008)));
        } else {
            if (!(kVar instanceof i)) {
                if (kVar instanceof j) {
                    throw new UnsupportedOperationException("not supported in weekly");
                }
                throw new NoWhenBranchMatchedException();
            }
            i iVar = (i) kVar;
            int i3 = t.f198990b[iVar.f198972a.f200978b.ordinal()];
            if (i3 == 1) {
                f[] fVarArrValues = f.values();
                arrayList = new ArrayList(fVarArrValues.length);
                int length = fVarArrValues.length;
                while (i < length) {
                    f fVar = fVarArrValues[i];
                    arrayList.add(new Pair(new TextLocalisedClause(fVar.b(), null, null, 14), fVar));
                    i++;
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                g[] gVarArrValues = g.values();
                arrayList = new ArrayList(gVarArrValues.length);
                int length2 = gVarArrValues.length;
                while (i < length2) {
                    g gVar = gVarArrValues[i];
                    arrayList.add(new Pair(new TextLocalisedClause(gVar.b(), null, null, 14), gVar));
                    i++;
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (Pair pair : arrayList) {
                TextLocalisedClause textLocalisedClause = (TextLocalisedClause) pair.f186385a;
                Object obj2 = pair.f186386b;
                arrayList2.add(new SingleChoiceDelegate.Model(obj2.toString(), textLocalisedClause, Intrinsics.f(iVar.f198973b, obj2), null, obj2, YearClass.CLASS_2008));
            }
            eVarB.addAll(arrayList2);
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public static List d(k kVar) {
        if (kVar instanceof j) {
            return v.k(new ListSubheaderDelegate.Model("LIST_ID_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.analytics_settings_cycle_weekly_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), new TextDelegate.Model("LIST_ID_HEADER_DESCRIPTION", new TextLocalisedClause(R$string.analytics_settings_cycle_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        }
        if ((kVar instanceof e) || (kVar instanceof i)) {
            return zhm.u.c(new HeaderDelegate.Model("LIST_ID_HEADER", null, new r2(new TextLocalisedClause(R$string.analytics_settings_cycle_monthly_title, null, null, 14), null), null, null, new TextLocalisedClause(R$string.analytics_settings_cycle_description, null, null, 14), null, null, null, k0.SMALL, null, 97016));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static FixedTabsDelegate.Model e(k kVar) {
        String str = "TAB_ID_DATE";
        FixedTabs.Item[] elements = {new FixedTabs.Item("TAB_ID_DATE", new TextLocalisedClause(R$string.analytics_period_filter_screen_monthly_picker_tab_title_date, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("TAB_ID_FIRST", new TextLocalisedClause(R$string.analytics_period_filter_screen_monthly_picker_tab_title_first, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("TAB_ID_LAST", new TextLocalisedClause(R$string.analytics_period_filter_screen_monthly_picker_tab_title_last, null, null, 14), (AnalyticsContext) null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (!(kVar instanceof e)) {
            if (!(kVar instanceof i)) {
                if (kVar instanceof j) {
                    throw new UnsupportedOperationException("not supported in weekly");
                }
                throw new NoWhenBranchMatchedException();
            }
            int i = t.f198990b[((i) kVar).f198972a.f200978b.ordinal()];
            if (i == 1) {
                str = "TAB_ID_FIRST";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "TAB_ID_LAST";
            }
        }
        return new FixedTabsDelegate.Model("LIST_ID_TABS", listL, str, false, null, SyslogConstants.LOG_CLOCK);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r30) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lpd.u.a(jki.i):jki.m");
    }
}
