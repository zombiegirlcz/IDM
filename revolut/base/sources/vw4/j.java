package vw4;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.currency.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import do3.n;
import ip0.bo0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import org.joda.time.LocalDate;
import tof.fc;
import tof.i7;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292640a;

    public /* synthetic */ j(int i) {
        this.f292640a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 0;
        Object obj3 = null;
        switch (this.f292640a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 1:
                vwb.f update = (vwb.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new vwb.f(i);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    bo0 bo0Var = new bo0(a0.d.n("SECTION_LOADING_PREFIX", it10.nextInt()));
                    int i2 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i2, i2, i2, i2, null, false, 48);
                    arrayList.add(bo0Var);
                }
                return new vwb.j(arrayList);
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 4:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM breb_contacts");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ev3.a aVar = (ev3.a) pair.f186385a;
                n nVar = (n) pair.f186386b;
                String strI = te0.w.I(nVar);
                LocalDate localDate = nVar.f116413j;
                return new ev3.b(strI, localDate != null ? jli.b.e(localDate) : null, nVar.k, aVar);
            case 6:
                RowDelegate.Model it11 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.u instanceof zv5.a);
            case 7:
                Boolean commodityFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(commodityFeatureEnabled, "commodityFeatureEnabled");
                return Boolean.valueOf(!commodityFeatureEnabled.booleanValue());
            case 8:
                ux9.i it12 = (ux9.i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f283928a;
            case 9:
                CryptoAddress it13 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.getF71061c();
            case 10:
                ux9.h it14 = (ux9.h) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f283926a;
            case 11:
                CryptoAddress it15 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f71059a;
            case 12:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeU, 10));
                vim.f it16 = intRangeU.iterator();
                while (it16.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("complex-analytics-total-value-allocation-", it16.nextInt()), false, 0, false, 28));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 13:
                InputTextDelegate.TextData it17 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr = CardLabelScreen.f64758b0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f52598b.toString();
            case 14:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return f0.f322471a;
            case 15:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.FALSE;
            case 16:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                Data data = (Data) hVar.f288433a;
                Data data2 = (Data) hVar.f288434b;
                boolean zBooleanValue = ((Boolean) hVar.f288435c).booleanValue();
                boolean zBooleanValue2 = ((Boolean) hVar.d).booleanValue();
                List list = (List) data2.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                od0.i iVar = (od0.i) data.getContent();
                return new vy5.a(zBooleanValue, list, iVar != null ? (ProductAccountListAction) iVar.f224257a : null, zBooleanValue2);
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                xi0.b bVar = (xi0.b) pair2.f186386b;
                Iterator it20 = list2.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next = it20.next();
                        if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            obj3 = next;
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((io3.d) obj3);
            case 18:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it21 = pockets.iterator();
                while (it21.hasNext()) {
                    linkedHashSet.add(((io3.d) it21.next()).f163145a);
                }
                return linkedHashSet;
            case 19:
                i7 it22 = (i7) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return zi0.c.j(it22);
            case 20:
                i7 it23 = (i7) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return fc.a(it23, tj5.a.f271607a);
            case 21:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Object content = data3.getContent();
                return content == null ? data3 : zi0.c.P(content, false, null, 3);
            case 22:
                return Integer.valueOf(((Integer) obj2).intValue() - 1);
            case 23:
                int iIntValue = ((Integer) obj2).intValue();
                return new qf1.m(new TextLocalisedClause(R$string.currency_account_add_new_widget_title, null, null, 14), (31 > iIntValue || iIntValue > Integer.MAX_VALUE) ? (26 > iIntValue || iIntValue >= 31) ? new TextLocalisedClause(R$string.currency_account_add_new_widget_subtitle_multiple_currencies, null, null, 14) : new TextLocalisedClause(R$string.currency_account_add_new_widget_subtitle_25_currencies, null, null, 14) : new TextLocalisedClause(R$string.currency_account_add_new_widget_subtitle_30_currencies, null, null, 14), new TextLocalisedClause(R$string.currency_account_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_rates_converter, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6);
            case 24:
                List it24 = (List) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return m72.b.x(it24, od0.i.Companion);
            case 25:
                List lounges = (List) obj2;
                Intrinsics.checkNotNullParameter(lounges, "lounges");
                List list3 = lounges;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it25 = list3.iterator();
                while (it25.hasNext()) {
                    arrayList3.add(((svi.b) it25.next()).f265874a);
                }
                return arrayList3;
            case 26:
                Function0 it26 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return i2b.a.q(new gu("ID_SUBHEADER_0", 0, 0, 30), hxi.f.a());
            case 27:
                Function0 it27 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return null;
            case 28:
                ListSubheaderDelegate.Model item = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return Boolean.valueOf(Intrinsics.f(item.f52708a, "CourseRedesignedMapper_SMALL_COURSES_HEADER_ITEM_ID"));
            default:
                SmallCardDelegate.Model item2 = (SmallCardDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                return Boolean.valueOf(a0.H(item2.f53355a, "CourseRedesignedMapper_SMALL_COURSE_ITEM_ID", false));
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f292640a = i;
    }
}
