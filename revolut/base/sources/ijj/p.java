package ijj;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.esim.api.model.EsimPickerItem;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import okhttp3.ResponseBody;
import retrofit2.Response;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161821a;

    public /* synthetic */ p(int i) {
        this.f161821a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f161821a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return h.f161808a;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 2:
                Response it10 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object objBody = it10.body();
                if (objBody != null) {
                    return (ResponseBody) objBody;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.M0);
            case 4:
                e7l.f config2 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                return config2.N;
            case 5:
                e7l.f config3 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config3, "config");
                return config3.M;
            case 6:
                e7l.f config4 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config4, "config");
                return config4.X0;
            case 7:
                e7l.f it11 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.Y0;
            case 8:
                e7l.f config5 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config5, "config");
                List list = config5.f123380m;
                wi0.a aVar = wi0.b.Companion;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    kii.e.B(aVar, (String) it12.next(), arrayList);
                }
                return arrayList;
            case 9:
                e7l.f config6 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config6, "config");
                LinkedHashSet<String> linkedHashSet = config6.M;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                xi0.a aVar2 = xi0.b.Companion;
                for (String str : linkedHashSet) {
                    aVar2.getClass();
                    linkedHashSet2.add(xi0.a.a(str));
                }
                return a1.k(a1.l(linkedHashSet2, config6.T), config6.U);
            case 10:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getError() == null || data.getContent() != null) ? pfm.m.f235744a : efm.b.n(data.getError());
            case 11:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.VERBOSE, "ConfigurationInteractorImpl", "COMMON CONFIG LOADING STARTED", null, null, 16);
                return Unit.f186387a;
            case 12:
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.VERBOSE, "ConfigurationInteractorImpl", "USER CONFIG LOADING STARTED", null, null, 16);
                return Unit.f186387a;
            case 13:
                lk3.g it13 = (lk3.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.getCrypto();
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e7l.f fVar = (e7l.f) pair.f186385a;
                Set set = (Set) pair.f186386b;
                Set setK = fVar.k();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : setK) {
                    if (set.contains((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                Set setI1 = d0.i1(arrayList2);
                Set setL = fVar.l();
                HashSet hashSet = new HashSet();
                Iterator it14 = setL.iterator();
                while (it14.hasNext()) {
                    hashSet.add(((xi0.b) it14.next()).f306286a);
                }
                return a1.k(set, a1.k(hashSet, setI1));
            case 15:
                lk3.h it15 = (lk3.h) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                boolean countryChangeAllowed = it15.getCountryChangeAllowed();
                List automated = it15.getAutomated();
                ArrayList arrayList3 = new ArrayList(w.t(automated, 10));
                Iterator it16 = automated.iterator();
                while (it16.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it16.next(), arrayList3);
                }
                List manual = it15.getManual();
                ArrayList arrayList4 = new ArrayList(w.t(manual, 10));
                Iterator it17 = manual.iterator();
                while (it17.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it17.next(), arrayList4);
                }
                List unsupported = it15.getUnsupported();
                ArrayList arrayList5 = new ArrayList(w.t(unsupported, 10));
                Iterator it18 = unsupported.iterator();
                while (it18.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it18.next(), arrayList5);
                }
                return new gk3.g(arrayList3, arrayList4, arrayList5, countryChangeAllowed);
            case 16:
                lk3.e it19 = (lk3.e) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Intrinsics.checkNotNullParameter(it19, "<this>");
                List addressForms = it19.getAddressForms();
                ArrayList arrayList6 = new ArrayList(w.t(addressForms, 10));
                Iterator it20 = addressForms.iterator();
                while (it20.hasNext()) {
                    arrayList6.add(cp5.d.O((lk3.c) it20.next()));
                }
                return new gk3.e(arrayList6, cp5.d.O(it19.getDefaultAddressForm()));
            case 17:
                e7l.f config7 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config7, "config");
                Set set2 = config7.U;
                HashSet hashSet2 = new HashSet();
                Iterator it21 = set2.iterator();
                while (it21.hasNext()) {
                    hashSet2.add(((xi0.b) it21.next()).f306286a);
                }
                return a1.k(config7.M, hashSet2);
            case 18:
                e7l.f config8 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config8, "config");
                Set setL2 = config8.l();
                HashSet hashSet3 = new HashSet();
                Iterator it22 = setL2.iterator();
                while (it22.hasNext()) {
                    hashSet3.add(((xi0.b) it22.next()).f306286a);
                }
                return hashSet3;
            case 19:
                e7l.f config9 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config9, "config");
                return config9.k();
            case 20:
                e7l.f config10 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config10, "config");
                return config10.a();
            case 21:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return null;
            case 22:
                Function0 it24 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                pb0 pb0VarA = nb0.a(pb0.Companion, "RowLoadingDelegate_1", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return new cii.b(null, zhm.u.c(pb0VarA), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 23:
                SingleChoiceDelegate.Model it25 = (SingleChoiceDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimPickerScreen.R;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(it25.f instanceof EsimPickerItem);
            case 24:
                iha.c it26 = (iha.c) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.f161316a;
            case 25:
                Function0 it27 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return iii.c.c(5);
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list2 = (List) pair3.f186385a;
                List listH = vc.o.h(hha.s.f((hha.d) pair3.f186386b));
                ArrayList arrayList7 = new ArrayList();
                Iterator it28 = list2.iterator();
                while (it28.hasNext()) {
                    a0.x(vc.o.h(hha.s.f((hha.d) it28.next())), arrayList7);
                }
                Set<String> setI12 = d0.i1(arrayList7);
                ArrayList arrayList8 = new ArrayList(w.t(setI12, 10));
                for (String str2 : setI12) {
                    arrayList8.add(new em2.l(str2, listH.contains(str2)));
                }
                return arrayList8;
            case 28:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                return new dm2.b(address != null ? nz8.d.g(address) : null);
            default:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
        }
    }

    public /* synthetic */ p(ilb.c cVar) {
        this.f161821a = 22;
    }
}
