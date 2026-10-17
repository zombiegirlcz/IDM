package vn8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import do3.n;
import do3.q;
import in8.g;
import ip0.cs;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lw0.h;
import lw0.i;
import sk8.b;
import vo8.t;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290767a;

    public /* synthetic */ a(int i) {
        this.f290767a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String country;
        int i = 5;
        switch (this.f290767a) {
            case 0:
                JuniorBankingProfile it8 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(com.bumptech.glide.d.l(com.bumptech.glide.d.c(it8.k.getCountry())));
            case 1:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return q.y(it9);
            case 2:
                return ((fo3.c) ((Pair) obj2).f186385a).d;
            case 3:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                if (address == null || (country = address.getCountry()) == null) {
                    wi0.b.Companion.getClass();
                    return wi0.b.p0;
                }
                wi0.b.Companion.getClass();
                return wi0.a.a(country);
            case 4:
                g it10 = (g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.f162693a);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Boolean bool = (Boolean) pair.f186385a;
                bool.booleanValue();
                return bool;
            case 6:
                g it11 = (g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.f162693a);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Boolean bool2 = (Boolean) pair2.f186385a;
                bool2.booleanValue();
                sk8.b bVar = (sk8.b) pair2.f186386b;
                if (bVar instanceof sk8.a) {
                    return bool2;
                }
                if (Intrinsics.f(bVar, b.a.f263780a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                Links it12 = (Links) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f76906a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_FEATURES_HEADER_LOADING", 0, 0, 30);
                nb0 nb0Var = pb0.Companion;
                return v.k(guVar, nb0.b(nb0Var, "ID_REFERRAL_TOGGLE_LOADING", false, 0, false, 30), new gu("ID_FIRST_PARTY_CONSENT_HEADER_LOADING", 0, 0, 30), nb0.b(nb0Var, "ID_FIRST_PARTY_CONSENT_LOADING", false, 0, false, 30), new gu("ID_THIRD_PARTY_CONSENT_HEADER_LOADING", 0, 0, 30), nb0.b(nb0Var, "ID_THIRD_PARTY_CONSENT_LOADING", false, 0, false, 30));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.a(pb0.Companion, "ID_TRANSFER_JUNIOR_BALANCE_LOADING", false, 6);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 12:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                hha.d dVar = (hha.d) rVar.f314202b;
                xi0.b bVar2 = (xi0.b) rVar.f314203c;
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    xi0.b.Companion.getClass();
                    bVar2 = xi0.b.f306272g;
                } else {
                    Iterator it13 = list2.iterator();
                    while (it13.hasNext()) {
                        if (Intrinsics.f(((SavingsProductData) ((Pair) it13.next()).f186386b).f86683a.f86618b, bVar2)) {
                        }
                    }
                    xi0.b.Companion.getClass();
                    bVar2 = xi0.b.f306272g;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (Intrinsics.f(((SavingsProductData) ((Pair) obj3).f186386b).f86683a.f86618b, bVar2)) {
                        arrayList.add(obj3);
                    }
                }
                List listP0 = d0.P0(arrayList, new afa.a(new t(i), 12));
                if (listP0.isEmpty()) {
                    throw new IllegalStateException(j6.a.s("products ", d0.k0(list2, null, null, null, 0, new a(13), 31), " do not contain product with currency == ", bVar2.f306286a, " ").toString());
                }
                dj0.d dVar2 = new dj0.d(10000L, bVar2);
                List<Pair> list3 = listP0;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (Pair pair3 : list3) {
                    hha.d dVar3 = (hha.d) pair3.f186385a;
                    arrayList2.add(new vob.e(dVar3, pyd.c.K(dVar2, (((SavingsProductData) pair3.f186386b).f86683a.f86621h.a().f86650b / ((double) 100)) + ((double) 1), bVar2), Intrinsics.f(dVar3.f152287a, dVar.f152287a)));
                }
                return new vob.f(dVar2, arrayList2);
            case 13:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return ((SavingsProductData) pair4.f186386b).f86683a.f86617a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                h hVar = new h(i.TITLE_SUBTITLE);
                s7 s7Var = new s7("LARGE_ACTION_BTN_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                cs csVar = new cs("LARGE_ACTION_BTN_LOADING_LIST_ID");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return new vob.h(v.k(s7Var, csVar), hVar);
            case 15:
                Clause it14 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new WelcomeAppearance(it14, (Image) null, new UrlVideo("https://assets.revolut.com/mobile/easter_eggs/videos/fifa_2026.mp4", (String) null, false, oz0.b.FIT, false, oz0.c.ENABLED, 54));
            case 16:
                y1h.b it15 = (y1h.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f310380a.f214596b;
            case 17:
                y1h.a it16 = (y1h.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Pair(it16.getId(), it16.f310379a.f183148a.f183146b);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 21:
                List ratesDto = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesDto, "ratesDto");
                List list4 = ratesDto;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it17 = list4.iterator();
                while (it17.hasNext()) {
                    arrayList3.add(v13.d.K((rpk.a) it17.next()));
                }
                return arrayList3;
            case 22:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : rates) {
                    qta.a aVar = (qta.a) obj4;
                    if (!Intrinsics.f(aVar.a(), vpk.w.a()) && !Intrinsics.f(aVar.b(), vpk.w.a()) && !Intrinsics.f(aVar.c(), vpk.w.a())) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 23:
                Set currencyPairs = (Set) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return d0.k0(currencyPairs, null, null, null, 0, null, 63);
            case 24:
                List listOfPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(listOfPairs, "listOfPairs");
                return d0.i1(w.u(listOfPairs));
            case 25:
                Set currencyPairs2 = (Set) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs2, "currencyPairs");
                return d0.k0(currencyPairs2, null, null, null, 0, null, 63);
            case 26:
                List listOfPairs2 = (List) obj2;
                Intrinsics.checkNotNullParameter(listOfPairs2, "listOfPairs");
                return d0.i1(w.u(listOfPairs2));
            case 27:
                List ratesDto2 = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesDto2, "ratesDto");
                List list5 = ratesDto2;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                Iterator it18 = list5.iterator();
                while (it18.hasNext()) {
                    arrayList5.add(x5d.b.v((rpk.g) it18.next()));
                }
                return arrayList5;
            case 28:
                List rates2 = (List) obj2;
                Intrinsics.checkNotNullParameter(rates2, "rates");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : rates2) {
                    if (!Intrinsics.f(((qta.c) obj5).a(), vpk.w.a())) {
                        arrayList6.add(obj5);
                    }
                }
                return arrayList6;
            default:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it19, h0Var);
                return Unit.f186387a;
        }
    }
}
