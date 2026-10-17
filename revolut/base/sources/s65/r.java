package s65;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.feature.subaccount.api.models.Subaccount;
import ip0.s7;
import ip0.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n38.a0;
import n38.b0;
import n38.z;
import org.jmrtd.cbeff.ISO781611;
import retrofit2.HttpException;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260149a;

    public /* synthetic */ r(int i) {
        this.f260149a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f260149a;
        djb.f fVar = djb.f.f115278a;
        boolean z = false;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                eVarB.add(new s7("loading_1", 0, 0, 0, 0, false, null, 126));
                eVarB.add(new s7("loading_2", 0, 0, 0, 0, false, null, 126));
                eVarB.add(new s7("loading_3", 0, 0, 0, 0, false, null, 126));
                eVarB.add(new s7("loading_4", 0, 0, 0, 0, false, null, 126));
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return new m(k.f260142a, false, false, eVarA);
            case 1:
                s6b.g update = (s6b.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return s6b.g.a(update, null, new HashMap(update.f260197a), null, false, 13);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                InputTextDelegate.Model model = new InputTextDelegate.Model("inputFieldLoadingItemId1", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 12);
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("inputFieldLoadingItemId2", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.r(model2, 0, R$attr.uikit_dp0, 0, 0, 13);
                InputTextDelegate.Model model3 = new InputTextDelegate.Model("inputFieldLoadingItemId3", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.r(model3, 0, R$attr.uikit_dp0, 0, 0, 13);
                return v.k(model, model2, model3);
            case 3:
                IconSelectorDelegate.SelectableIconModel it8 = (IconSelectorDelegate.SelectableIconModel) obj2;
                BrandingSettingsScreen.Companion aVar = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 4:
                y it9 = (y) obj2;
                BrandingSettingsScreen.Companion aVar2 = BrandingSettingsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f167226b;
            case 5:
                s6d.j update2 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = update2.f260240a;
                k6d.h hVar = (k6d.h) data.getContent();
                return s6d.j.a(update2, Data.copy$default(data, hVar != null ? k6d.h.a(hVar, null, false, false, false, false, null, null, 255) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 6:
                s6d.j update3 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data2 = update3.f260240a;
                k6d.h hVar2 = (k6d.h) data2.getContent();
                return s6d.j.a(update3, Data.copy$default(data2, hVar2 != null ? k6d.h.a(hVar2, null, false, false, false, false, null, null, 383) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 7:
                s6d.j update4 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return s6d.j.a(update4, null, true, null, null, null, null, 123);
            case 8:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 9:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new djb.r((yvh.b) it10.f224257a);
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new djb.a(new djb.h((List) pair.f186385a), (djb.r) pair.f186386b, hzi.f.f157194a, fVar);
            case 11:
                yhm.r rVar = (yhm.r) obj2;
                return new djb.a(new djb.h((List) rVar.f314201a), new djb.r((yvh.b) ((od0.i) rVar.f314202b).f224257a), (hzi.g) rVar.f314203c, fVar);
            case 12:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list = it11;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    arrayList.add(new Subaccount.Personal((pcd.s) it12.next()));
                }
                return arrayList;
            case 13:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List list2 = it13;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(new Subaccount.Group((pcd.s) it14.next()));
                }
                return arrayList2;
            case 14:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                List list3 = it15;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it16 = list3.iterator();
                while (it16.hasNext()) {
                    arrayList3.add(new Subaccount.Pro((pcd.s) it16.next()));
                }
                return arrayList3;
            case 15:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List list4 = it17;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it18 = list4.iterator();
                while (it18.hasNext()) {
                    arrayList4.add(new Subaccount.ProTax((pcd.s) it18.next()));
                }
                return arrayList4;
            case 16:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                List list5 = it19;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                Iterator it20 = list5.iterator();
                while (it20.hasNext()) {
                    arrayList5.add(new Subaccount.Junior((pcd.s) it20.next()));
                }
                return arrayList5;
            case 17:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                List list6 = it21;
                ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                Iterator it22 = list6.iterator();
                while (it22.hasNext()) {
                    arrayList6.add(new Subaccount.Joint((pcd.s) it22.next()));
                }
                return arrayList6;
            case 18:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                List list7 = it23;
                ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
                Iterator it24 = list7.iterator();
                while (it24.hasNext()) {
                    arrayList7.add(new Subaccount.Teen((pcd.s) it24.next()));
                }
                return arrayList7;
            case 19:
                List it25 = (List) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                List list8 = it25;
                ArrayList arrayList8 = new ArrayList(w.t(list8, 10));
                Iterator it26 = list8.iterator();
                while (it26.hasNext()) {
                    arrayList8.add(new Subaccount.Junior((pcd.s) it26.next()));
                }
                return arrayList8;
            case 20:
                pcd.s it27 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new Subaccount.Personal(it27);
            case 21:
                List list9 = (List) obj2;
                Intrinsics.checkNotNullParameter(list9, "list");
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : list9) {
                    if (!((Subaccount) obj3).b()) {
                        arrayList9.add(obj3);
                    }
                }
                return arrayList9;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 23:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List<a0> list10 = (List) pair2.f186385a;
                z zVar = (z) ((od0.i) pair2.f186386b).g();
                if (zVar == null) {
                    if (!list10.isEmpty()) {
                        IllegalStateException illegalStateException = new IllegalStateException("Partner cards exist but partner info is missing");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                    return r0.g();
                }
                ArrayList arrayList10 = new ArrayList();
                for (a0 a0Var : list10) {
                    h6e.b bVar = new h6e.b(a0Var.f211926a, a0Var.f211928c, a0Var.d, a0Var.f, a0Var.e, a0Var.f211929g, zVar.f211970a, zVar.f, zVar.d, zVar.f211971b);
                    ArrayList arrayList11 = a0Var.f211927b;
                    ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                    Iterator it28 = arrayList11.iterator();
                    while (it28.hasNext()) {
                        arrayList12.add(new Pair(((b0) it28.next()).f211931a, bVar));
                    }
                    zhm.a0.x(arrayList12, arrayList10);
                }
                return r0.t(arrayList10);
            case 24:
                yvh.b it29 = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it29);
            case 25:
                yvh.b it30 = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it30);
            case 26:
                Throwable it31 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it31, "it");
                Intrinsics.checkNotNullParameter(it31, "<this>");
                HttpException httpException = it31 instanceof HttpException ? (HttpException) it31 : null;
                if (httpException != null && httpException.code() == 404) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                pcd.s it32 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(it32, "it");
                return new Subaccount.Group(it32);
            case 28:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                ArrayList arrayList13 = new ArrayList();
                for (Object obj4 : vaults) {
                    if (((pcd.s) obj4).f234883c == pcd.h0.ACTIVE) {
                        arrayList13.add(obj4);
                    }
                }
                ArrayList arrayList14 = new ArrayList(w.t(arrayList13, 10));
                Iterator it33 = arrayList13.iterator();
                while (it33.hasNext()) {
                    arrayList14.add(s6e.z.A((pcd.s) it33.next()));
                }
                return arrayList14;
            default:
                pcd.s it34 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(it34, "it");
                return new Subaccount.Pro(it34);
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f260149a = i;
    }
}
