package ebm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import aw0.o9;
import c9g.v;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntityCellItem;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopPaymentAccountSection;
import com.revolut.feature.store.api.model.StoreExclusivesHeaderResponse;
import com.revolut.feature.store.api.model.StoreExclusivesHeroTile;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesAgebandsBreakdown;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import d3c.b0;
import dj0.d;
import f2e.c1;
import f2e.f1;
import f2e.r1;
import feg.f;
import fnc.s;
import foh.i;
import ft3.d1;
import hha.w0;
import ir0.g;
import ir0.j;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kl7.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.json.Json;
import le.u1;
import mki.b;
import n14.k;
import ofm.q;
import qo6.c;
import qo6.l;
import rlm.m;
import slm.d0;
import slm.f0;
import slm.j0;
import t1e.n;
import wd6.h;
import z5l.e;
import zhm.a0;
import zhm.p;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f124390a = true;

    public static final void A(v vVar, f uiState) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = vVar.f22435b;
        uiState.getClass();
        navBarWithToolbar.setDescriptionVisible(false);
        vVar.f22435b.setFilters(uiState.f134612b);
    }

    public static final void B(v vVar, TextLocalisedClause title, b environment) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(environment, "environment");
        NavBarWithToolbar navBarWithToolbar = vVar.f22435b;
        navBarWithToolbar.setToolbarTitle(title);
        navBarWithToolbar.setTitle(title, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(environment)));
    }

    public static final String C(p5f.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return p.a.p("investor_updates_", fVar.f233121a, "_null");
    }

    public static Date D(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneId, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Instant instant = localDate.atStartOfDay(zoneId).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        Date dateFrom = Date.from(instant);
        Intrinsics.checkNotNullExpressionValue(dateFrom, "from(...)");
        return dateFrom;
    }

    public static final StoreExclusivesHeaderResponse E(c1 c1Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        List<f1> list = c1Var.f131550a;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (f1 f1Var : list) {
            Intrinsics.checkNotNullParameter(f1Var, "<this>");
            String str = f1Var.f131579a;
            n nVar = Intrinsics.f(f1Var.f131580b, "EXCLUSIVE_STORE_PRODUCT_HERO_TILE") ? n.HERO : n.UNKNOWN;
            String str2 = f1Var.f131581c;
            String str3 = f1Var.d;
            String str4 = f1Var.e;
            List list2 = f1Var.f;
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(i.z((r1) it8.next()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new StoreExclusivesHeroTile(str, nVar, str2, str3, str4, arrayList, d2e.i.a(f1Var.f131582g, f1Var.f131583h, f1Var.i, f1Var.f131584j, f1Var.k)));
        }
        return new StoreExclusivesHeaderResponse(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperiencesPricingBreakdown F(a0g.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        d dVarV = hx7.a.v(bVar.getTotal());
        List<a0g.a> listA = bVar.getAgeBandsBreakdown();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (a0g.a aVar : listA) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new TravelExperiencesAgebandsBreakdown((myf.b) u1.u(aVar.getType(), zyf.f.f326460a), aVar.getCount(), hx7.a.v(aVar.getPrice())));
        }
        return new TravelExperiencesPricingBreakdown(dVarV, arrayList);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperiencesPricingBreakdown G(zzf.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        d dVarO = mo3.a.o(bVar.getTotal());
        List<zzf.a> listA = bVar.getAgeBandsBreakdown();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (zzf.a aVar : listA) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new TravelExperiencesAgebandsBreakdown((myf.b) u1.u(aVar.getType(), zyf.f.f326460a), aVar.getCount(), mo3.a.o(aVar.getPrice())));
        }
        return new TravelExperiencesPricingBreakdown(dVarO, arrayList);
    }

    public static final dl7.a H(el7.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (zi7.b.f322506a[aVar.ordinal()]) {
            case 1:
                return dl7.a.PURCHASE_PROTECTION_PLUS;
            case 2:
                return dl7.a.PURCHASE_PROTECTION_PREMIUM;
            case 3:
                return dl7.a.PURCHASE_PROTECTION_METAL;
            case 4:
                return dl7.a.REFUND_PROTECTION;
            case 5:
                return dl7.a.TICKET_CANCELLATION;
            case 6:
                return dl7.a.CAR_HIRE_EXCESS;
            case 7:
                return dl7.a.PERSONAL_LIABILITY;
            case 8:
                return dl7.a.FREE_INSURANCE;
            case 9:
                return dl7.a.WINTER_SPORTS_COVER;
            case 10:
                return dl7.a.EVENT_CANCELLATION;
            case 11:
                return dl7.a.TRIP_CANCELLATION;
            case 12:
                return dl7.a.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final so6.a I(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f248053a;
        String str2 = cVar.f248054b;
        String str3 = cVar.f248055c;
        ThirdPartyBrazil thirdPartyBrazilX = i.x(cVar.e);
        List list = cVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(edl.a.C((l) it8.next()));
        }
        return new so6.a(str, str2, str3, thirdPartyBrazilX, arrayList, cVar.f);
    }

    public static final w5l.a J(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String strF = eVar.getId();
        String strI = eVar.getYouthId();
        String strE = eVar.getDesignCode();
        e93.b bVar = (e93.b) u1.u(eVar.getBrand(), n14.e.j());
        w5l.c cVar = (w5l.c) u1.u(eVar.getState(), k.k());
        z5l.d dVarD = eVar.getCustomisation();
        return new w5l.a(strF, strI, strE, bVar, cVar, dVarD != null ? new w5l.b(dVarD.getImageUrl(), dVarD.getBase64Image()) : null, eVar.getVirtual(), eVar.getCardProfileId(), eVar.getCardName());
    }

    public static final el7.a K(dl7.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (zi7.b.f322507b[aVar.ordinal()]) {
            case 1:
                return el7.a.PURCHASE_PROTECTION_PLUS;
            case 2:
                return el7.a.PURCHASE_PROTECTION_PREMIUM;
            case 3:
                return el7.a.PURCHASE_PROTECTION_METAL;
            case 4:
                return el7.a.REFUND_PROTECTION;
            case 5:
                return el7.a.TICKET_CANCELLATION;
            case 6:
                return el7.a.CAR_HIRE_EXCESS;
            case 7:
                return el7.a.PERSONAL_LIABILITY;
            case 8:
                return el7.a.FREE_INSURANCE;
            case 9:
                return el7.a.WINTER_SPORTS_COVER;
            case 10:
                return el7.a.EVENT_CANCELLATION;
            case 11:
                return el7.a.TRIP_CANCELLATION;
            case 12:
                return el7.a.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final a0g.b L(TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown) {
        Intrinsics.checkNotNullParameter(travelExperiencesPricingBreakdown, "<this>");
        jo3.b bVarA = hx7.a.A(travelExperiencesPricingBreakdown.f92878a);
        ArrayList<TravelExperiencesAgebandsBreakdown> arrayList = travelExperiencesPricingBreakdown.f92879b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (TravelExperiencesAgebandsBreakdown travelExperiencesAgebandsBreakdown : arrayList) {
            Intrinsics.checkNotNullParameter(travelExperiencesAgebandsBreakdown, "<this>");
            arrayList2.add(new a0g.a(travelExperiencesAgebandsBreakdown.f92876b, u1.g(travelExperiencesAgebandsBreakdown.f92875a, zyf.f.f326460a), hx7.a.A(travelExperiencesAgebandsBreakdown.f92877c)));
        }
        return new a0g.b(arrayList2, bVarA);
    }

    public static final h M(m6j.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = b7j.c.f13052a[bVar.ordinal()];
        if (i == 1) {
            return h.MARKET;
        }
        if (i == 2) {
            return h.LIMIT;
        }
        if (i == 3) {
            return h.STOP;
        }
        if (i == 4) {
            return h.RECURRING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LocalDate N(Date date) {
        ZoneId zoneId = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneId, "systemDefault(...)");
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDate localDate = date.toInstant().atZone(zoneId).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    public static final long O(LocalDate localDate, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Instant instant = localDate.atStartOfDay(zoneId).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        return instant.toEpochMilli();
    }

    public static /* synthetic */ long P(LocalDate localDate) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return O(localDate, zoneIdSystemDefault);
    }

    public static final g a(View hostView, Paint basePaint) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(basePaint, "basePaint");
        s sVar = new s(hostView);
        g.Companion.getClass();
        return kli.a.q(sVar.i()) ? new j(sVar, basePaint) : new ir0.k(basePaint);
    }

    public static final wga.i b(TextLocalisedClause title, w0 planTier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        return new wga.i(new wga.d(new wga.f(title), new oga.a("icn_24_premium"), wga.b.f297268a), new wga.e(planTier));
    }

    public static final Data c(w3c.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Data data = eVar.f294270a;
        try {
            Object content = data.getContent();
            return new Data(content != null ? d((b0) content) : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    public static final d d(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        d dVar = b0Var.e;
        d dVar2 = b0Var.f110996g;
        d dVar3 = b0Var.f;
        if (dVar == null || dVar2 == null || dVar3 == null) {
            return null;
        }
        return pyd.c.O(pyd.c.O(dVar, dVar2), dVar3);
    }

    public static final byte[] e(byte[]... arrays) {
        Intrinsics.checkNotNullParameter(arrays, "arrays");
        int length = 0;
        for (byte[] bArr : arrays) {
            length += bArr.length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (byte[] bArr3 : arrays) {
            p.j(bArr3, bArr2, length2, 0, 0, 12);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static void f(String codeChallenge) {
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
    }

    public static final long g(LocalDate localDate, LocalDate other) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return localDate.until(other, ChronoUnit.DAYS);
    }

    public static final long h(ZonedDateTime zonedDateTime, ZonedDateTime other) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LocalDate localDate = zonedDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        LocalDate localDate2 = other.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
        return g(localDate, localDate2);
    }

    public static final Object i(Json json, qlm.e deserializer, pak.h reader) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        char[] buffer = slm.i.f264264c.b(16384);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        slm.b0 b0Var = new slm.b0(reader, buffer);
        try {
            Object objB = new d0(json, j0.OBJ, b0Var, deserializer.f247633b, null).b(deserializer);
            b0Var.p();
            return objB;
        } finally {
            b0Var.F();
        }
    }

    public static final void j(Json json, a80.e sb6, mlm.h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb6, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        j0 mode = j0.OBJ;
        m[] modeReuseCache = new m[j0.a().size()];
        Intrinsics.checkNotNullParameter(sb6, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb6, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new f0(new dki.h(sb6), json, mode, modeReuseCache).encodeSerializableValue(serializer, obj2);
    }

    public static final boolean k(String str, String str2) {
        return str.equals(str2);
    }

    public static final RevolutShopAccount l(d money, String str, List list) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(money, "totalPrice");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((RevolutShopPaymentAccountSection) it8.next()).f84202b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            RevolutShopAccount revolutShopAccount = (RevolutShopAccount) obj3;
            Intrinsics.checkNotNullParameter(revolutShopAccount, "<this>");
            Intrinsics.checkNotNullParameter(money, "money");
            if (revolutShopAccount.f84200c.f115082a >= money.f115082a) {
                arrayList2.add(obj3);
            }
        }
        Iterator it9 = arrayList2.iterator();
        while (true) {
            obj2 = null;
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (Intrinsics.f(((RevolutShopAccount) next).f84198a, str)) {
                break;
            }
        }
        RevolutShopAccount revolutShopAccount2 = (RevolutShopAccount) next;
        if (revolutShopAccount2 != null) {
            return revolutShopAccount2;
        }
        RevolutShopAccount revolutShopAccount3 = (RevolutShopAccount) zhm.d0.d0(arrayList2);
        if (revolutShopAccount3 != null) {
            return revolutShopAccount3;
        }
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            Object next2 = it10.next();
            if (Intrinsics.f(((RevolutShopAccount) next2).f84198a, str)) {
                obj2 = next2;
                break;
            }
        }
        RevolutShopAccount revolutShopAccount4 = (RevolutShopAccount) obj2;
        return revolutShopAccount4 == null ? (RevolutShopAccount) zhm.d0.d0(arrayList) : revolutShopAccount4;
    }

    public static final LocalDate m(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int i = calendar.get(0);
        int i2 = calendar.get(1);
        if (i != 1) {
            i2 = 1 - i2;
        }
        LocalDate localDateOf = LocalDate.of(i2, calendar.get(2) + 1, calendar.get(5));
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        return localDateOf;
    }

    public static final String n(e93.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        b93.b code = fVar.c();
        e93.b brandDesign = fVar.b();
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(brandDesign, "brandDesign");
        return code.f13615a + "-" + brandDesign;
    }

    public static final int o(BackendEntityItem backendEntityItem) {
        Intrinsics.checkNotNullParameter(backendEntityItem, "<this>");
        if (backendEntityItem instanceof EntityCellItem) {
            return 1;
        }
        if (!(backendEntityItem instanceof EntitiesListItem)) {
            if (backendEntityItem instanceof EntitiesSelectionItem) {
                return 100;
            }
            throw new NoWhenBranchMatchedException();
        }
        Integer num = ((EntitiesListItem) backendEntityItem).d;
        if (num != null) {
            return num.intValue();
        }
        return 100;
    }

    public static Drawable p(Context context, int i, Resources.Theme theme) {
        return r(context, context, i, theme);
    }

    public static Drawable q(Context context, Context context2, int i) {
        return r(context, context2, i, null);
    }

    public static Drawable r(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f124390a) {
                return y(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f124390a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    public static final String s(String str) {
        return j6.a.q("StatementDocumentsCacheKey_", str);
    }

    public static final fs3.f t(List list, d1 productClassification) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((fs3.f) next).f137580a.equals(productClassification)) {
                break;
            }
        }
        fs3.f fVar = (fs3.f) next;
        if (fVar != null) {
            return fVar;
        }
        fs3.e eVar = fs3.f.Companion;
        zhm.f0 tags = zhm.f0.f322471a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new fs3.f(productClassification, null, null, tags);
    }

    public static final fs3.i u(List list, fs3.b type) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "entryPoint");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((fs3.i) next).f137586a == type) {
                break;
            }
        }
        fs3.i iVar = (fs3.i) next;
        if (iVar != null) {
            return iVar;
        }
        fs3.h hVar = fs3.i.Companion;
        zhm.f0 tags = zhm.f0.f322471a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new fs3.i(type, null, null, null, null, tags);
    }

    public static final ggc.w v(Boolean bool) {
        if (Intrinsics.f(bool, Boolean.TRUE)) {
            return ggc.w.PHYSICAL;
        }
        if (Intrinsics.f(bool, Boolean.FALSE)) {
            return ggc.w.DIGITAL;
        }
        if (bool == null) {
            return ggc.w.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean w(Policy policy) {
        Intrinsics.checkNotNullParameter(policy, "<this>");
        m1 m1Var = policy.f75288c;
        return m1Var == m1.ACTIVE || m1Var == m1.INITIALISING || m1Var == m1.INACTIVE || m1Var == m1.CANCELLING;
    }

    public static final boolean x(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return Intrinsics.f(localDate, LocalDate.now());
    }

    public static Drawable y(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i);
    }

    public static final Clause z(Clause clause) {
        if (clause != null) {
            return clause;
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
