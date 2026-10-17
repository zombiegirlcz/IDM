package om4;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.PhotoBannerLargeDelegate;
import com.revolut.core.ui_kit.delegates.la;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class t3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f226703b;

    public /* synthetic */ t3(String str, int i) {
        this.f226702a = i;
        this.f226703b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        String str;
        Object next;
        String str2;
        Object next2;
        switch (this.f226702a) {
            case 0:
                List<yw4.p> it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                for (yw4.p pVar : it8) {
                    if (Intrinsics.f(pVar.f317325a, this.f226703b)) {
                        return pVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                List<yw4.p> facility = (List) obj2;
                Intrinsics.checkNotNullParameter(facility, "facility");
                for (yw4.p pVar2 : facility) {
                    if (Intrinsics.f(pVar2.f317326b, this.f226703b)) {
                        return pVar2.f317325a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 2:
                List<yw4.p> facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                for (yw4.p pVar3 : facilities) {
                    if (Intrinsics.f(pVar3.f317325a, this.f226703b)) {
                        return pVar3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                List<CountryProfile> profiles = (List) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                for (CountryProfile countryProfile : profiles) {
                    if (Intrinsics.f(countryProfile.f92231a, this.f226703b)) {
                        return countryProfile;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 4:
                oq5.a update = (oq5.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oq5.a.a(update, null, this.f226703b, 1);
            case 5:
                oq5.a update2 = (oq5.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return oq5.a.a(update2, this.f226703b, null, 2);
            case 6:
                rr2.a it9 = (rr2.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.getId(), this.f226703b));
            case 7:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM vat_summary WHERE vat_reminder_id = ?");
                String str3 = this.f226703b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 8:
                ou6.h update3 = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String str4 = this.f226703b;
                AcquiringOrderFilter.Query query = new AcquiringOrderFilter.Query(str4);
                if (kotlin.text.d0.W(str4)) {
                    query = null;
                }
                return ou6.h.a(update3, null, null, null, query, false, 95);
            case 9:
                puj.h itinerarySummary = (puj.h) obj2;
                Intrinsics.checkNotNullParameter(itinerarySummary, "itinerarySummary");
                String id10 = this.f226703b;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(itinerarySummary, "itinerarySummary");
                return new PhotoBannerWidgetDelegate.Model(id10, zhm.u.c(new PhotoBannerLargeDelegate.Model(id10, new TextClause(itinerarySummary.f239924c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(itinerarySummary.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PhotoBannerLargeDelegate.Model.Background.Image(new UrlImage(itinerarySummary.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), new la(R$drawable.uikit_icn_24_map_point, new TextClause(itinerarySummary.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.q("row", id10)), false, itinerarySummary.f239922a, 416)), op0.m3.WRAP_CONTENT, (py0.c) null, 24);
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                String id11 = this.f226703b;
                Intrinsics.checkNotNullParameter(id11, "id");
                return new ErrorWidgetDelegate.Model(id11, null, new TextLocalisedClause(R$string.common_error_title, null, null, 14), new TextLocalisedClause(R$string.common_action_retry, null, null, 14), op0.q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 11:
                List allInstruments = (List) obj2;
                Intrinsics.checkNotNullParameter(allInstruments, "allInstruments");
                Iterator it10 = allInstruments.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next3 = it10.next();
                        nel.n nVar = (nel.n) next3;
                        if (io3.h.j(nVar.f214597c)) {
                            xi0.b bVar = nVar.f214605q;
                            if (Intrinsics.f(bVar != null ? bVar.f306286a : null, this.f226703b)) {
                                obj3 = next3;
                            }
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((nel.n) obj3);
            case 12:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Iterable iterable = (List) data.getContent();
                if (iterable == null) {
                    iterable = zhm.f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (kotlin.text.d0.J(((CardOwner) obj4).a(), this.f226703b, true)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(new ly9.c((CardOwner) it11.next()));
                }
                return zi0.c.P(arrayList2, false, null, 3);
            case 13:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                String str5 = (String) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                List list = (List) rVar.f314203c;
                zm3.l lVar = (zm3.l) iVar.f224257a;
                if (lVar != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            zm3.a aVar = ((ly9.d) it12.next()).f200758a;
                            zm3.l lVar2 = aVar instanceof zm3.l ? (zm3.l) aVar : null;
                            if (Intrinsics.f(lVar2 != null ? lVar2.N0() : null, this.f226703b)) {
                            }
                        }
                    }
                    return new oy9.g(lVar, Intrinsics.f(lVar.N0(), str5));
                }
                return oy9.h.f230923a;
            case 14:
                List defaultScopes = (List) obj2;
                Intrinsics.checkNotNullParameter(defaultScopes, "defaultScopes");
                oyb.d dVar = new oyb.d(oyb.b.f230928a, defaultScopes);
                wi0.b.Companion.getClass();
                if (!Intrinsics.f(this.f226703b, "PL")) {
                    return dVar;
                }
                TermsScope.INSTANCE.getClass();
                return new oyb.d(oyb.a.f230927a, zhm.v.k(TermsScope.f90367h, TermsScope.z, TermsScope.O, TermsScope.X));
            case 15:
                List data2 = (List) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Iterator it13 = data2.iterator();
                while (true) {
                    boolean zHasNext = it13.hasNext();
                    str = this.f226703b;
                    if (zHasNext) {
                        next = it13.next();
                        if (Intrinsics.f(((j0d.q) next).f170015c.f170010a, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                j0d.q qVar = (j0d.q) next;
                if (qVar != null) {
                    return qVar;
                }
                throw new IllegalStateException(p.a.p("Invitation not found (teenUserId:", str, ")"));
            case 16:
                y49.f unrealisedPerformance = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
                List list3 = unrealisedPerformance.e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    if (Intrinsics.f(((y49.e) obj5).f310838b, this.f226703b)) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 17:
                y49.f unrealisedPerformance2 = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(unrealisedPerformance2, "unrealisedPerformance");
                for (y49.e eVar : unrealisedPerformance2.e) {
                    if (Intrinsics.f(eVar.f310837a, this.f226703b)) {
                        return eVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 18:
                p4c.k update4 = (p4c.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return p4c.k.a(update4, 0L, null, null, null, null, zhm.a1.m(update4.f, this.f226703b), null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 19:
                p4c.k update5 = (p4c.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return p4c.k.a(update5, 0L, null, null, null, null, zhm.a1.j(update5.f, this.f226703b), null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new LoanKompotFeatureConfig.ManageRepaymentsDestination((LoanBackupCard) pair.f186386b, this.f226703b, ((LoanDetails) pair.f186385a).f70150l);
            case 21:
                p75.e updateState = (p75.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Loan loan = updateState.f233550a;
                Intrinsics.checkNotNullParameter(loan, "loan");
                return new p75.e(loan, this.f226703b);
            case 22:
                pc3.d updateState2 = (pc3.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                List list4 = updateState2.f234812b;
                String str6 = this.f226703b;
                return pc3.d.a(updateState2, str6, null, pc3.g.y2(str6, list4), 10);
            case 23:
                pd4.i update6 = (pd4.i) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return pd4.i.a(update6, null, null, this.f226703b, 31);
            case 24:
                pd4.i iVar2 = (pd4.i) obj2;
                return pd4.i.a(iVar2, null, zhm.r0.l(this.f226703b, iVar2.e), null, 47);
            case 25:
                return Boolean.valueOf(Intrinsics.f(((pfk.i) obj2).f235642b, this.f226703b));
            case 26:
                List pricingPlans = (List) obj2;
                Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
                Iterator it14 = pricingPlans.iterator();
                while (true) {
                    boolean zHasNext2 = it14.hasNext();
                    str2 = this.f226703b;
                    if (zHasNext2) {
                        next2 = it14.next();
                        if (Intrinsics.f(((hha.d) next2).f152287a, str2)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                hha.d dVar2 = (hha.d) next2;
                if (dVar2 == null) {
                    return efm.d0.l(new IllegalStateException(p.a.p("Pricing plan with ", str2, " id not found")));
                }
                ufm.b bVarM = efm.d0.m(dVar2);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 27:
                phg.g update7 = (phg.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return phg.g.a(update7, null, this.f226703b, false, 5);
            case 28:
                return pig.j.a((pig.j) obj2, null, null, null, null, null, null, 0, this.f226703b, null, null, false, 3839);
            default:
                return pig.j.a((pig.j) obj2, null, null, null, null, null, null, 0, this.f226703b, null, null, false, 3839);
        }
    }

    public /* synthetic */ t3(String str, pc3.g gVar) {
        this.f226702a = 22;
        this.f226703b = str;
    }

    public /* synthetic */ t3(ovj.g gVar, String str, int i) {
        this.f226702a = i;
        this.f226703b = str;
    }
}
