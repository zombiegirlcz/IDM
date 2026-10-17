package zhl;

import android.net.Uri;
import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.q8;
import com.revolut.core.ui_kit.delegates.r8;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.v9;
import com.revolut.core.ui_kit.delegates.ye;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UriImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.feature.rev_points.models.Logo;
import ip0.ak0;
import ip0.ej;
import ip0.zj;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k71.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jmrtd.lds.LDSFile;
import tof.a3;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zr2.q;
import zs2.s;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f322456c;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f322454a = i;
        this.f322455b = obj2;
        this.f322456c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 2913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zhl.l.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        TimeClause timeClauseB;
        List listC;
        TimeClause timeClauseB2;
        List listK;
        zo2.n nVar = (zo2.n) this.f322455b;
        zo2.d dVar = (zo2.d) this.f322456c;
        bp2.e content = (bp2.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        kp2.c cVar = nVar.f323872a;
        aim.e eVarB = u.b();
        BankInformation bankInformation = content.f17547a;
        hg hgVarC = kp2.a.c(bankInformation, content.f17548b);
        String str = bankInformation.f63972a;
        eVarB.add(hgVarC);
        List list = content.e;
        TextDelegate.Model model = null;
        if (list.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("ID_DETAILS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.account_switch_request_review_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            mn2.a aVar = dVar.f323860c;
            LocalDate localDate = dVar.f323859b;
            int i = zo2.m.f323870a[aVar.ordinal()];
            if (i == 1) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_switch_request_review_details_subtitle, null, null, 14);
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
                if (localDate != null) {
                    com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                    LocalDateClause$DateFormat.INSTANCE.getClass();
                    timeClauseB = com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b);
                } else {
                    timeClauseB = null;
                }
                RowDelegate.Model model2 = new RowDelegate.Model("ID_OVERSTAP_REQUEST_DETAILS_DESCRIPTION", image24, textLocalisedClause, null, 0, null, timeClauseB, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868792);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                listC = u.c(model2);
            } else if (i == 2) {
                wn2.d dVar2 = dVar.e;
                int i2 = dVar2 == null ? -1 : zo2.m.f323871b[dVar2.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.account_switch_request_review_cass_details_subtitle1, null, null, 14);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.account_switch_request_review_cass_details_description1, null, null, 14);
                        RowDelegate.Model.MainImage.Image24 image242 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
                        if (localDate != null) {
                            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                            LocalDateClause$DateFormat.INSTANCE.getClass();
                            timeClauseB2 = com.revolut.core.ui_kit.models.j.b(jVar2, localDate, LocalDateClause$DateFormat.Companion.f57815b);
                        } else {
                            timeClauseB2 = null;
                        }
                        listK = v.k(new RowDelegate.Model("ID_CASS_FULL_REQUEST_DETAILS_DESCRIPTION_1", image242, textLocalisedClause2, null, 0, textLocalisedClause3, timeClauseB2, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760), new RowDelegate.Model("ID_CASS_FULL_REQUEST_DETAILS_DESCRIPTION_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.account_switch_request_review_cass_details_subtitle2, u.c(str), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listK = v.k(new RowDelegate.Model("ID_CASS_PARTIAL_REQUEST_DETAILS_DESCRIPTION_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.account_switch_request_review_cass_details_subtitle3, null, null, 14), null, 0, new TextLocalisedClause(R$string.account_switch_request_review_cass_details_description3, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_CASS_PARTIAL_REQUEST_DETAILS_DESCRIPTION_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.account_switch_request_review_cass_details_subtitle4, u.c(str), null, 12), null, 0, new TextLocalisedClause(R$string.account_switch_request_review_cass_details_description4, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                    }
                    listC = listK;
                } else {
                    listC = f0.f322471a;
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = cVar.a(list);
            }
            eVarB.addAll(listC);
        } else {
            eVarB.addAll(cVar.a(list));
        }
        int i3 = zo2.m.f323870a[dVar.f323860c.ordinal()];
        if (i3 == 1) {
            model = new TextDelegate.Model("ID_OVERSTAP_REQUEST_DETAILS_DESCRIPTION", new TextLocalisedClause(R$string.account_switch_request_review_terms, u.c(new TextLocalisedClause(R$string.account_switch_request_review_deeplink, null, new Click(30, (Integer) null, (Object) null, "ID_CLICK_TERMS_AND_CONDITIONS", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        } else if (i3 == 2 && dVar.e == wn2.d.FULL) {
            model = new TextDelegate.Model("ID_CASS_FULL_DISCLAIMER", new TextLocalisedClause(R$string.account_switch_request_review_cass_terms1, u.c(new TextLocalisedClause(R$string.account_switch_request_review_cass_terms2, null, new Click(30, (Integer) null, (Object) null, "ID_CLICK_TERMS_AND_CONDITIONS", false), 10)), null, 12), false, new ak0(null, ao2.a.a(), 1), null, null, 0, 0, 0, 0, 2036);
        }
        eVarB.add(model);
        return new zo2.g(d0.Z(u.a(eVarB)), false, true);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) this.f322455b;
        zr2.c cVar = (zr2.c) this.f322456c;
        a3 content = (a3) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = cVar.f324531b;
        thf.g gVar = qVar.f324548a;
        k71.q.Companion.getClass();
        RowDelegate.Model modelP = ((anf.k) gVar).p(content, p.a(), new thf.f(false, 3));
        yp0.b.l(modelP, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(modelP);
        RowDelegate.Model modelB = null;
        RowDelegate.Model modelB2 = q.b(R$drawable.uikit_icn_24_reverted, new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_declined_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_declined_description, null, null, 14), "LIST_ID_WILL_BE_DECLINED");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_contact_title, null, null, 14);
        int i = R$drawable.uikit_icn_24_smartphone;
        int i2 = com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_contact_description;
        String str = content.A.f272779a.d;
        if (str == null) {
            str = "";
        }
        RowDelegate.Model modelB3 = q.b(i, textLocalisedClause, new TextLocalisedClause(i2, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), "LIST_ID_CONTACT_MERCHANT");
        if (z) {
            modelB = q.b(R$drawable.uikit_icn_24_limit, new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_block_amount_title, u.c(new TextClause("5", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.blocked_merchants.impl.R$string.merchants_block_confirmation_block_amount_description, u.c(new TextClause("3", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), "LIST_ID_LIMITS");
        }
        RowDelegate.Model[] elements = {modelB2, modelB3, modelB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return d0.E0(listL, listC);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object d(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) {
        /*
            Method dump skipped, instruction units count: 3548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zhl.l.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Image contactImage;
        zs2.k kVar = (zs2.k) this.f322455b;
        vu.g gVar = ((s) this.f322456c).f324803a;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty() && kVar.d.length() > 0) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.business.referrals.shared.impl.R$string.referrals_select_retail_account_no_results_title, null, null, 14);
            zj zjVar = zj.REGULAR;
            String query = kVar.d;
            Intrinsics.checkNotNullParameter(query, "query");
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("SEARCH_EMPTY_LIST_ID", textLocalisedClause, new TextLocalisedClause(com.revolut.retail.feature.business.referrals.shared.impl.R$string.referrals_select_retail_account_no_results_subtitle, u.c(query), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zjVar, new TextLocalisedClause(com.revolut.retail.feature.business.referrals.shared.impl.R$string.referrals_select_retail_account_no_results_clear, null, null, 14), false, null, null, false, 0, 0, 31680);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        if (content.isEmpty()) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("EMPTY_LIST_ID", new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_contacts_list_empty), null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D119", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return u.c(model2);
        }
        List<DeviceContact> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (DeviceContact deviceContact : list) {
            String strM = p.a.m(deviceContact.f65990a, "CONTACT_LIST_ID");
            TextClause textClause = new TextClause(deviceContact.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(deviceContact.f65992c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = deviceContact.f65993g;
            if (str != null) {
                Uri uri2 = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                contactImage = new UriImage(uri2, null, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) 40, (Integer) 40, 121), null);
            } else {
                contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, deviceContact.d, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
            }
            arrayList.add(new RowDelegate.Model(strM, contactImage, null, null, textClause, textClause2, null, null, 0, new pf(new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_campaign_widget_button), null, null, 14), null, null, false, null, null, 510), false, false, null, null, null, null, null, deviceContact, null, 0, 0, 0, 0, 1056958316));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Integer numValueOf;
        zuj.n nVar;
        puj.e eVar;
        ArrayList arrayList;
        Iterator it8;
        qv0.o model;
        RowDelegate.Model.Companion companion;
        puj.b bVar;
        RowDelegate.Model.MainImage.Image40 image40;
        zuj.d0 d0Var = (zuj.d0) this.f322455b;
        zuj.n nVar2 = (zuj.n) this.f322456c;
        puj.e itinerary = (puj.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        aim.e eVarB = u.b();
        String str = itinerary.f239915g;
        LocalDateTime localDateTime = itinerary.d;
        ArrayList arrayList2 = itinerary.f239916h;
        if (str != null && !kotlin.text.d0.W(str)) {
            RowDelegate.Model model2 = new RowDelegate.Model("AI_CONCIERGE_LIST_ID", new RowDelegate.Model.MainImage.Image40(new CdnImage("air_large_light", "mobile/cx/chat/assistant_icons", null, null, null, "air_large_dark", 44), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.api.travel_trips.R$string.travel_trip_itinerary_ai_concierge_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.api.travel_trips.R$string.travel_trip_itinerary_ai_concierge_description, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, zuj.l.f325496a, null, 0, 0, 0, 0, 532675544);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            puj.a aVar = (puj.a) it9.next();
            ArrayList arrayList4 = aVar.f239905b;
            LocalDateTime localDateTime2 = aVar.f239904a;
            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                puj.b bVar2 = (puj.b) it10.next();
                ozb.b bVar3 = d0Var.f325491a;
                boolean z = bVar2.f239907b;
                String str2 = bVar2.f239908c;
                String str3 = bVar2.f239906a;
                LocalDateTime localDateTime3 = localDateTime;
                puj.d dVar = bVar2.f;
                Logo logo = bVar2.f239909g;
                Iterator it11 = it9;
                if (z) {
                    if (logo != null) {
                        it8 = it10;
                        nVar = nVar2;
                        if (logo.f83955b != m1c.l.ICON) {
                            model = new ListingCardBasicDelegate.Model(j6.a.q("ITEM_LIST_ID_", str3), bVar2, new TextClause(bVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(logo.f83954a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902), null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(bVar2.e, (Style) zuj.d0.a(dVar), (Integer) null, false, (o9) null, (List) null, 124), 0, null, r8.FitTopAlignToTitle, q8.AddNew, 48736);
                            eVar = itinerary;
                            arrayList = arrayList2;
                        }
                    } else {
                        nVar = nVar2;
                        it8 = it10;
                    }
                    RowDelegate.Model.Companion companion2 = RowDelegate.Model.INSTANCE;
                    String listId = j6.a.q("ITEM_LIST_ID_", str3);
                    TextClause title = new TextClause(bVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause subtitle = new TextClause(bVar2.e, (Style) zuj.d0.a(dVar), (Integer) null, false, (o9) null, (List) null, 124);
                    if (logo != null) {
                        companion = companion2;
                        bVar = bVar2;
                        eVar = itinerary;
                        arrayList = arrayList2;
                        image40 = new RowDelegate.Model.MainImage.Image40(bVar3.a(logo, new CircleTransformation((Float) null, (Integer) null, false, 15)), null, null, false, null, false, 62);
                    } else {
                        companion = companion2;
                        eVar = itinerary;
                        arrayList = arrayList2;
                        bVar = bVar2;
                        image40 = null;
                    }
                    of titleStyle = of.DEFAULT;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(listId, "listId");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    model = new RowDelegate.Model(listId, image40, title, titleStyle, 0, subtitle, null, null, 0, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, ye.f55649a, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, null, bVar, null, null, null, null, null, 0, 0, 0, 0, null, -4209712, 15);
                } else {
                    nVar = nVar2;
                    eVar = itinerary;
                    arrayList = arrayList2;
                    it8 = it10;
                    model = new NewsDelegate.Model(j6.a.q("ITEM_LIST_ID_", str3), new TextClause(bVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), logo != null ? bVar3.a(logo, new RoundedRectTransformation(12.0f)) : null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, null, new v9(new TextClause(bVar2.e, (Style) zuj.d0.a(dVar), (Integer) null, false, (o9) null, (List) null, 124)), null, bVar2, null, 2800);
                }
                arrayList5.add(model);
                localDateTime = localDateTime3;
                it9 = it11;
                it10 = it8;
                nVar2 = nVar;
                arrayList2 = arrayList;
                itinerary = eVar;
            }
            zuj.n nVar3 = nVar2;
            String strS = h30.l.s("DAY_SUBHEADER_LIST_ID_", localDateTime2.toLocalDate());
            String str4 = localDateTime2.format(DateTimeFormatter.ofPattern("EEE", ((s80.b) d0Var.f325492b).b()));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            TextClause textClause = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = localDateTime2.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            a0.x(yp0.b.g(arrayList5, new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) new CompositeClause(v.k(textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate, new LocalDateClause$DateFormat.DayAndMonth(0))), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList3);
            nVar2 = nVar3;
            itinerary = itinerary;
        }
        zuj.n nVar4 = nVar2;
        puj.e eVar2 = itinerary;
        LocalDateTime localDateTime4 = localDateTime;
        ArrayList<puj.a> arrayList6 = arrayList2;
        eVarB.addAll(arrayList3);
        ej ejVar = new ej("DISCLAIMER_FOOTER_LIST_ID", new mx0.c7(new TextLocalisedClause(com.revolut.retail.feature.api.travel_trips.R$string.travel_trip_itinerary_disclaimer, u.c(new TextLocalisedClause(com.revolut.retail.feature.api.travel_trips.R$string.travel_trip_itinerary_disclaimer_terms, null, new Click(30, (Integer) null, (Object) null, "DISCLAIMER_CLAUSE_CLICK_ID", false), 10)), null, 12), false, d7.DEFAULT, 2));
        int i = R$attr.uikit_dp0;
        yp0.b.r(ejVar, i, i, 0, 0, 12);
        eVarB.add(ejVar);
        aim.e eVarA = u.a(eVarB);
        TextClause textClause2 = new TextClause(eVar2.f239913b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LocalDate localDate2 = localDateTime4.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
        long jN = oc.c.N(localDate2);
        LocalDate localDate3 = eVar2.e.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
        zuj.q qVar = new zuj.q(textClause2, new TimeRangeClause(jN, oc.c.N(localDate3), ZoneOffset.UTC, null, 8), new UrlImage(eVar2.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
        for (puj.a aVar2 : arrayList6) {
            String string = aVar2.f239904a.toLocalDate().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDate localDate4 = aVar2.f239904a.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate4, "toLocalDate(...)");
            arrayList7.add(new com.revolut.core.ui_kit.views.q(string, new t(com.revolut.core.ui_kit.models.j.b(jVar2, localDate4, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), 58));
        }
        LocalDate localDate5 = nVar4.f325498b;
        if (localDate5 == null && (localDate5 = nVar4.f325499c) == null) {
            localDate5 = localDateTime4.toLocalDate();
        }
        String string2 = localDate5.toString();
        LocalDate localDate6 = nVar4.f325498b;
        if (localDate6 != null) {
            int i2 = 0;
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar4 = (aim.b) listIterator;
                if (!bVar4.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.f(((koi.j) bVar4.next()).getF53177a(), "DAY_SUBHEADER_LIST_ID_" + localDate6)) {
                    break;
                }
                i2++;
            }
            numValueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
        } else {
            numValueOf = null;
        }
        return new zuj.w(eVarA, qVar, arrayList7, string2, numValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zhl.l.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08df  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zhl.l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
