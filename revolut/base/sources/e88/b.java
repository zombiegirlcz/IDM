package e88;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import k71.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rqd.g;
import t68.f;
import tof.a3;
import tof.i3;
import tof.k3;
import tof.l2;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123621a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f123622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f123623c;

    public /* synthetic */ b(ArrayList arrayList, List list) {
        this.f123622b = arrayList;
        this.f123623c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        IncomeSorter incomeSorter;
        LinkedHashMap linkedHashMap;
        switch (this.f123621a) {
            case 0:
                List list = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("supportedFiatCurrenciesPerProfile", list);
                int i = 0;
                for (Object obj3 : this.f123622b) {
                    int i2 = i + 1;
                    f fVar = null;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                    Iterable iterable = (Iterable) list.get(i);
                    ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                    Iterator it8 = iterable.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((xi0.b) it8.next()).f306286a);
                    }
                    Iterator it9 = this.f123623c.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((fo3.c) ((Pair) next).f186385a).f136805h, juniorBankingProfile.f77103j)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Pair pair = (Pair) next;
                    if (pair != null) {
                        Iterable iterable2 = (Iterable) pair.f186386b;
                        ArrayList arrayList2 = new ArrayList(w.t(iterable2, 10));
                        Iterator it10 = iterable2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(((io3.d) it10.next()).f163147c);
                        }
                        Set setI1 = d0.i1(arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (!setI1.contains((String) obj4)) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            fVar = new f(juniorBankingProfile, ((fo3.c) pair.f186385a).f136801a);
                        }
                    }
                    if (fVar != null) {
                        arrayListY.add(fVar);
                    }
                    i = i2;
                }
                return arrayListY;
            default:
                List list2 = (List) obj2;
                int iB = q0.b(w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (Object obj5 : list2) {
                    linkedHashMap2.put(((a3) obj5).f272581b, obj5);
                }
                List list3 = this.f123623c;
                int iB2 = q0.b(w.t(list3, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj6 : list3) {
                    linkedHashMap3.put(((IncomeSorter) obj6).f99160a, obj6);
                }
                ArrayList arrayList4 = new ArrayList();
                for (IncomeSorterExecution incomeSorterExecution : this.f123622b) {
                    String str = incomeSorterExecution.d;
                    String str2 = incomeSorterExecution.f99239b;
                    String str3 = incomeSorterExecution.f99238a;
                    a3 a3Var = (a3) linkedHashMap2.get(str);
                    ActionWidgetDelegate.Model model = null;
                    if (a3Var == null || (incomeSorter = (IncomeSorter) linkedHashMap3.get(str2)) == null) {
                        linkedHashMap = linkedHashMap3;
                    } else {
                        hzi.c cVar = incomeSorter.e;
                        boolean zA = e1.A(incomeSorterExecution);
                        if (zA && cVar == hzi.c.RECURRING) {
                            ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model(j6.a.q("PENDING_ACTION_ID", str3), new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_failed_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_failed_description, null, null, 14), new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_exclamation_triangle, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new i(14, new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_cta, null, null, 14), null, false), null, new rqd.a(str3, str2), null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            linkedHashMap = linkedHashMap3;
                            model = model2;
                        } else if (zA && cVar == hzi.c.ONE_TIME) {
                            if (System.currentTimeMillis() - incomeSorterExecution.e <= 172800000) {
                                ActionWidgetDelegate.Model model3 = new ActionWidgetDelegate.Model(j6.a.q("PENDING_ACTION_ID", str3), new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_one_off_failed_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_one_off_failed_description, null, null, 14), new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_exclamation_triangle, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new i(14, new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_one_off_failed_cta, null, null, 14), null, false), null, new rqd.b(str3, a3Var.f272581b), null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
                                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                model = model3;
                            }
                            linkedHashMap = linkedHashMap3;
                        } else {
                            String strQ = j6.a.q("PENDING_ACTION_ID", str3);
                            i3 i3Var = a3Var.Q;
                            k3 k3Var = i3Var instanceof k3 ? (k3) i3Var : null;
                            linkedHashMap = linkedHashMap3;
                            ActionWidgetDelegate.Model model4 = new ActionWidgetDelegate.Model(strQ, (k3Var != null ? k3Var.f272879a : null) == l2.SALARY ? new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_title_salary, null, null, 14) : new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_title, u.c(otd.f.c(3, null, null, k.b(a3Var))), null, 12), new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_description, null, null, 14), new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_split, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new i(14, new TextLocalisedClause(R$string.analytics_income_sorter_home_pending_action_cta, null, null, 14), null, false), null, new rqd.a(str3, str2), null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
                            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                            model = model4;
                        }
                    }
                    if (model != null) {
                        arrayList4.add(model);
                    }
                    linkedHashMap3 = linkedHashMap;
                }
                return arrayList4;
        }
    }

    public /* synthetic */ b(g gVar, ArrayList arrayList, List list) {
        this.f123622b = arrayList;
        this.f123623c = list;
    }
}
