package id8;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.junior_consent.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import w2e.k;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160438a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f160439b;

    public /* synthetic */ b(List list, e eVar) {
        this.f160439b = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i = this.f160438a;
        List<xc8.f> list = this.f160439b;
        switch (i) {
            case 0:
                Map juniorProfiles = (Map) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                ArrayList arrayList = new ArrayList();
                for (xc8.f fVar : list) {
                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) juniorProfiles.get(fVar.f304105b);
                    ActionWidgetDelegate.Model model = null;
                    if (juniorBankingProfile != null) {
                        model = new ActionWidgetDelegate.Model(j6.a.q("JUNIOR_CONSENT_REQUEST_PENDING_ACTION_LIST_ID_", fVar.f304104a), new TextLocalisedClause(R$string.junior_consent_change_request_pending_action_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_pending_action_subtitle, u.c(juniorBankingProfile.f77099b), null, 12), new m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d183", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.junior_consent_change_request_pending_action_action_title, null, null, 14), null, false), null, fVar, null, false, 8016);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Could not find junior profile given junior id = ", fVar.f304105b));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                    if (model != null) {
                        arrayList.add(model);
                    }
                }
                return arrayList;
            default:
                StoreMegaFiltersResponse response = (StoreMegaFiltersResponse) obj2;
                ((Boolean) obj3).getClass();
                List list2 = w2e.j.f294037a;
                Intrinsics.checkNotNullParameter(response, "response");
                aim.e eVarB = u.b();
                for (StoreMegaFilter storeMegaFilter : response.f88545a) {
                    ArrayList<StoreMegaFilter.StoreMegaFilterValue> arrayList2 = storeMegaFilter.f88539c;
                    String str = storeMegaFilter.f88537a;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue : arrayList2) {
                        List<StoreMegaFilterSelection> list3 = list;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = false;
                        } else {
                            for (StoreMegaFilterSelection storeMegaFilterSelection : list3) {
                                if (Intrinsics.f(storeMegaFilterSelection.f88543a.f88537a, str)) {
                                    List list4 = storeMegaFilterSelection.f88544b;
                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                        Iterator it8 = list4.iterator();
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) it8.next()).f88540a, storeMegaFilterValue.f88540a)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                            z = false;
                        }
                        String strS = a0.d.s("FILTERS_VALUE_LIST_ID_PREFIX_", str, "_", storeMegaFilterValue.f88540a);
                        String str2 = storeMegaFilterValue.f88540a;
                        arrayList3.add(new SelectableDelegate.Model(strS, new RowDelegate.Model(a0.d.s("FILTERS_VALUE_INNER_LIST_ID_PREFIX_", str, "_", str2), null, new TextClause(storeMegaFilterValue.f88541b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, new k(str, str2), null, false, 32488));
                    }
                    eVarB.addAll(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(j6.a.q("FILTERS_SECTION_LIST_ID_PREFIX_", str), (Image) null, (Clause) new TextClause(storeMegaFilter.f88538b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                }
                return u.a(eVarB);
        }
    }

    public /* synthetic */ b(w2e.j jVar, List list) {
        this.f160439b = list;
    }
}
