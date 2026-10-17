package b9d;

import android.os.Parcelable;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import at.r;
import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ExtraSmallCardScrollerWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.api.navigation.JuniorConsentRequestPromptDestination;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.IdContext;
import fg8.c0;
import ggc.g0;
import ggc.h0;
import ggc.y;
import h8d.x;
import ip0.dg;
import ip0.eh;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import op0.q;
import org.jmrtd.cbeff.ISO781611;
import zh9.u0;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13724b;

    public /* synthetic */ k(int i, String str, Object obj2) {
        this.f13723a = i;
        this.f13724b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v134, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v135 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object content, Object obj2, Object obj3) {
        boolean z;
        RandomAccess randomAccess;
        String str;
        Object next;
        sxj.b juniorAppAccessWidgetState;
        TextLocalisedClause textLocalisedClause;
        int i;
        Object next2;
        switch (this.f13723a) {
            case 0:
                List content2 = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                if (content2.isEmpty()) {
                    List listC = u.c(new FullScreenStateDelegate.Model("NO_ARTICLES_ITEM_ID", new TextClause("No support articles to show yet", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d169", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return listC;
                }
                List<hj0.f> list = content2;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (hj0.f fVar : list) {
                    arrayList.add(new CellDetailsChevronDelegate.Model("ACTION_ITEM_ID", new TextClause(fVar.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, fVar, l7d.a.d(4, this.f13724b, fVar.getKey()), null, 1996));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 1:
                Map profiles = (Map) content;
                ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                Collection collectionValues = profiles.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z = true;
                } else {
                    Iterator it8 = collectionValues.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((JuniorBankingProfile) it8.next()).f77101g, this.f13724b)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                List airlines = (List) content;
                ((Boolean) obj2).getClass();
                Throwable th10 = (Throwable) obj3;
                Intrinsics.checkNotNullParameter(airlines, "airlines");
                if (airlines.isEmpty() && th10 != null) {
                    return r.a();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : airlines) {
                    if (d0.J(((TravelMilesAirline) obj4).f94089b, this.f13724b, true)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(ugg.b.a((TravelMilesAirline) it9.next()));
                }
                return arrayList3;
            case 3:
                Pair pair = (Pair) content;
                ((Boolean) obj2).getClass();
                Throwable th11 = (Throwable) obj3;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                List list3 = (List) pair.f186386b;
                if (list2.isEmpty() && th11 != null) {
                    List listC2 = u.c(new dg("ERROR_ITEM_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)));
                    yp0.b.k(listC2, 0, 0, 0, 0, 31);
                    return listC2;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list2) {
                    if (d0.J(((u2f.d) obj5).f276619c, this.f13724b, true)) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(ugg.b.b((u2f.d) it10.next(), list3));
                }
                return arrayList5;
            case 4:
                f9d.f content3 = (f9d.f) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                aim.e eVarB = u.b();
                List listC3 = u.c(content3.f132921a);
                yp0.b.k(listC3, 0, 0, 0, 0, 31);
                eVarB.addAll(listC3);
                List list4 = content3.f132922b;
                if (list4.isEmpty()) {
                    randomAccess = f0.f322471a;
                } else {
                    List<hj0.f> list5 = list4;
                    ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
                    for (hj0.f fVar2 : list5) {
                        arrayList6.add(new CellDetailsChevronDelegate.Model("ACTION_ITEM_ID", new TextClause(fVar2.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, fVar2, l7d.a.d(4, this.f13724b, fVar2.getKey()), null, 1996));
                    }
                    yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                    randomAccess = arrayList6;
                }
                eVarB.addAll((Collection) randomAccess);
                return u.a(eVarB);
            case 5:
                List consentRequests = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(consentRequests, "consentRequests");
                Iterator it11 = consentRequests.iterator();
                while (true) {
                    boolean zHasNext = it11.hasNext();
                    str = this.f13724b;
                    if (zHasNext) {
                        next = it11.next();
                        if (Intrinsics.f(((xc8.f) next).f304105b, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next == null) {
                    throw new IllegalArgumentException(j6.a.q("Cannot find payment link consent request given the juniorId = ", kotlin.text.f0.U0(4, str)).toString());
                }
                xc8.f fVar3 = (xc8.f) next;
                return c0.a(gc0.c.f(new KompotOverlayFeatureConfig(new JuniorConsentRequestPromptDestination(str, new ConsentTypeId.ConsentRequestId(fVar3.f304104a, fVar3.f304106c), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D352", null, null, null, 30)), yhi.b.POPUP, (Integer) null, 12)));
            case 6:
                h8d.l content4 = (h8d.l) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                if (Intrinsics.f(content4, h8d.i.f149993a)) {
                    return f0.f322471a;
                }
                if (Intrinsics.f(content4, h8d.j.f149994a)) {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_NO_RESULTS", new TextLocalisedClause(R$string.help_center_search_empty_state_title, u.c(this.f13724b), null, 12), new TextLocalisedClause(R$string.help_center_search_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32624);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    return u.c(model);
                }
                if (!(content4 instanceof h8d.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list6 = ((h8d.k) content4).f149995a;
                ArrayList arrayList7 = new ArrayList(w.t(list6, 10));
                int i2 = 0;
                for (Object obj6 : list6) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    FaqMetaData faqMetaData = (FaqMetaData) obj6;
                    arrayList7.add(new RowDelegate.Model(faqMetaData.f51419a, null, new TextClause(faqMetaData.f51420b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, new x(faqMetaData, i2), new AnalyticsContext(kii.e.d(IdContext.newBuilder(), faqMetaData.f51419a, AnalyticsContext.INSTANCE)), 0, 0, 0, 0, 524286970));
                    i2 = i3;
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return arrayList7;
            case 7:
                boolean zBooleanValue = ((Boolean) content).booleanValue();
                ((Boolean) obj2).getClass();
                if (!zBooleanValue) {
                    return f0.f322471a;
                }
                CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("HELP_BUTTON_ITEM_ID", new TextLocalisedClause(R$string.help_center_action_help_with_something_else, null, null, 14), 0, false, null, l7d.a.b(this.f13724b), null, YearClass.CLASS_2012);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return u.c(model2);
            case 8:
                List subscriptions = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                return !subscriptions.isEmpty() ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchants_block_unblock_success_subtitle, u.c(this.f13724b), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.merchants_unblock_confirm_subtitle, null, null, 14);
            case 9:
                List subscriptions2 = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                return !subscriptions2.isEmpty() ? new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscription_unblock_confirmation_subtitle_merchant, u.c(this.f13724b), null, 12) : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscription_unblock_confirmation_subtitle_inactive, null, null, 14);
            case 10:
                yhm.r rVar = (yhm.r) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                RemoteLoginInvitation remoteLoginInvitation = (RemoteLoginInvitation) rVar.f314201a;
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) rVar.f314203c;
                if ((remoteLoginInvitation instanceof RemoteLoginInvitation.Absent) || (remoteLoginInvitation instanceof RemoteLoginInvitation.Pending)) {
                    juniorAppAccessWidgetState = sxj.b.NEVER_LOGGED_IN;
                } else {
                    if (!(remoteLoginInvitation instanceof RemoteLoginInvitation.Accepted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    juniorAppAccessWidgetState = zBooleanValue2 ? sxj.b.LOGGED_IN : sxj.b.LOGGED_OUT;
                }
                String listId = this.f13724b;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(juniorAppAccessWidgetState, "juniorAppAccessWidgetState");
                Intrinsics.checkNotNullParameter(juniorBankingProfile, "juniorBankingProfile");
                int i5 = rxj.a.f258185a[juniorAppAccessWidgetState.ordinal()];
                if (i5 == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.junior_app_access.impl.R$string.junior_widgets_app_access_never_logged_in_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                    i = R$drawable.uikit_icn_24_share_android;
                } else if (i5 == 2) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.junior_app_access.impl.R$string.junior_widgets_app_access_logged_in_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254), 10);
                    i = R$drawable.uikit_icn_24_smartphone_confirm;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.junior_app_access.impl.R$string.junior_widgets_app_access_logged_out_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                    i = R$drawable.uikit_icn_24_smartphone_shield;
                }
                return new AvatarWidgetDelegate.Model(listId, LayeredImage.INSTANCE.k(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, textLocalisedClause, new TextLocalisedClause(com.revolut.retail.feature.junior_app_access.impl.R$string.junior_widgets_app_access_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, null, new sxj.a(juniorAppAccessWidgetState, juniorBankingProfile.f77103j, juniorBankingProfile.f77099b), null, 12240);
            case 11:
                Pair pair2 = (Pair) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List rewardPreviews = (List) pair2.f186385a;
                String firstName = ((JuniorBankingProfile) pair2.f186386b).f77099b;
                String id10 = this.f13724b;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(rewardPreviews, "rewardPreviews");
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                ArrayList<g0> arrayList8 = new ArrayList();
                for (Object obj7 : rewardPreviews) {
                    if (((g0) obj7).a().f) {
                        arrayList8.add(obj7);
                    }
                }
                ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                for (g0 g0Var : arrayList8) {
                    h0 h0VarA = g0Var.a();
                    y yVar = g0Var.f143629c;
                    String str2 = h0VarA.f143631a;
                    String str3 = yVar.f143673b;
                    UrlImage urlImage = new UrlImage(str3 == null ? "" : str3, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                    String str4 = yVar.f143672a;
                    arrayList9.add(new ReferralContactDelegate.Model(str2, urlImage, new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, null, null, null, 524280));
                }
                return new ContactsWidgetDelegate.Model(id10, arrayList9, new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_perks_title, u.c(firstName), null, 12), false, null, null, 56);
            case 12:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List countries = content instanceof List ? (List) content : null;
                if (countries == null) {
                    countries = f0.f322471a;
                }
                Intrinsics.checkNotNullParameter(countries, "countries");
                String searchQuery = this.f13724b;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                ?? arrayList10 = d0.W(searchQuery) ? countries : 0;
                if (arrayList10 == 0) {
                    arrayList10 = new ArrayList();
                    for (Object obj8 : countries) {
                        if (d0.J(((v9b.a) obj8).f287017b, searchQuery, true)) {
                            arrayList10.add(obj8);
                        }
                    }
                }
                Iterable iterable = (Iterable) arrayList10;
                ArrayList arrayList11 = new ArrayList(w.t(iterable, 10));
                Iterator it12 = iterable.iterator();
                while (it12.hasNext()) {
                    wi0.b bVar = ((v9b.a) it12.next()).f287016a;
                    String str5 = bVar.f297794a;
                    AccountCellItemDelegate.Model model3 = new AccountCellItemDelegate.Model(j6.a.q("item_country_list_id_", str5), false, (Image) new CountryImage(str5, (Integer) null, (ez0.e) null, 14), (Clause) new CountryClause(bVar, null), (com.revolut.core.ui_kit.delegates.c) null, true, (Clause) null, (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) null, (Parcelable) null, 131024);
                    int i6 = R$attr.uikit_dp0;
                    yp0.b.l(model3, i6, i6, 0, 0, null, false, 60);
                    arrayList11.add(model3);
                }
                yp0.b.k(arrayList11, 0, 0, 0, 0, 31);
                InputDisclosureDelegate.Model model4 = new InputDisclosureDelegate.Model("item_country_not_found_list_id", new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_selection_country_is_missing_title, null, null, 14), null, null, null, 1020);
                yp0.b.l(model4, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                return zhm.d0.F0(model4, arrayList11);
            case 13:
                List beneficiaries = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                String str6 = this.f13724b;
                if (!d0.W(str6)) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj9 : beneficiaries) {
                        fa2.a aVar = (fa2.a) obj9;
                        if (jli.g.d(aVar.f133236b, str6) || jli.g.d(aVar.f133237c, str6)) {
                            arrayList12.add(obj9);
                        }
                    }
                    beneficiaries = arrayList12;
                }
                List<fa2.a> list7 = beneficiaries;
                ArrayList arrayList13 = new ArrayList(w.t(list7, 10));
                for (fa2.a aVar2 : list7) {
                    ContactImage contactImageC = m3j.j.c(aVar2.f133236b);
                    arrayList13.add(new RowDelegate.Model(aVar2.f133235a, contactImageC != null ? new RowDelegate.Model.MainImage.Image40(contactImageC, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_payid, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlack, 4.0f, Float.valueOf(10.0f), null, 32), null, false, 28) : null, new TextClause(aVar2.f133236b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(aVar2.f133237c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar2.d, null, 0, 0, 0, 0, 532676568));
                }
                yp0.b.k(arrayList13, 0, 0, 0, 0, 31);
                return arrayList13;
            case 14:
                return SnackbarKt.Snackbar_sPrSdHI$lambda$0$1(this.f13724b, (RowScope) content, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                List charities = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(charities, "charities");
                TextLocalisedClause title = new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.home_feed_interactive_widget_title_donations, null, null, 14);
                List<ba6.l> list8 = charities;
                ArrayList<ExtraSmallCardDelegate.Model> items = new ArrayList(w.t(list8, 10));
                for (ba6.l lVar : list8) {
                    items.add(new ExtraSmallCardDelegate.Model(lVar.f13938a, new eh(new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new UrlMedia(lVar.f13941g), null, null, lVar, 16116));
                }
                String listId2 = this.f13724b;
                Intrinsics.checkNotNullParameter(listId2, "listId");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(title, "title");
                ExtraSmallCardScrollerWidgetDelegate.Model.INSTANCE.getClass();
                ArrayList arrayList14 = new ArrayList(w.t(items, 10));
                for (ExtraSmallCardDelegate.Model model5 : items) {
                    yp0.b.m(model5);
                    arrayList14.add(model5);
                }
                return new ExtraSmallCardScrollerWidgetDelegate.Model(listId2, q.MEDIUM, title, arrayList14, false);
            case 16:
                Map profiles2 = (Map) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(profiles2, "profiles");
                Iterator it13 = profiles2.values().iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next2 = it13.next();
                        if (Intrinsics.f(((JuniorBankingProfile) next2).f77101g, this.f13724b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) next2;
                String str7 = juniorBankingProfile2 != null ? juniorBankingProfile2.f77103j : null;
                if (str7 != null) {
                    return u0.d(new JuniorAllowanceDestination(str7, null, new JuniorAllowanceLaunchMode.AsNaviCommand(new JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.Default(jbb.a.a(ibb.c.f160142c, null, null, u0.f(new ScheduledPaymentsDestination(new ScheduledPaymentsInputData(RecurringPaymentAccount.Personal.f89320a, new ScheduledPaymentsInputData.InitialAction.ShowConfirmationShotDialog(new TextLocalisedClause(com.revolut.feature.junior_allowance.impl.R$string.allowance_create_amount_screen_toast_success, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), 2), 2)), 6))), null));
                }
                throw new IllegalArgumentException("Junior profile not found by code");
            case 17:
                sf8.m content5 = (sf8.m) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content5, "content");
                return yc7.j.i(this.f13724b, content5, false);
            default:
                List news = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(news, "news");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj10 : news) {
                    LocalDate localDateI = oc.c.I(((rzj.f) obj10).d().e.getMillis());
                    Object objU = linkedHashMap.get(localDateI);
                    if (objU == null) {
                        objU = h30.l.u(linkedHashMap, localDateI);
                    }
                    ((List) objU).add(obj10);
                }
                Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
                ArrayList arrayList15 = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    LocalDate localDate = (LocalDate) entry.getKey();
                    List<rzj.f> list9 = (List) entry.getValue();
                    ArrayList arrayList16 = new ArrayList(w.t(list9, 10));
                    for (rzj.f fVar4 : list9) {
                        String str8 = fVar4.d().f101797a;
                        TextClause textClause = new TextClause(fVar4.d().f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        UrlImage urlImage2 = new UrlImage(fVar4.d().f101799c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                        CompositeClause compositeClauseA = NewsDelegate.Model.Companion.a(NewsDelegate.Model.INSTANCE, new TimeClause(fVar4.d().e.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12), new TextClause(fVar4.d().f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        rzj.j jVarA = fVar4.a();
                        CompositeClause compositeClauseA2 = jVarA != null ? e1k.c.a(jVarA) : null;
                        rzj.j jVarE = fVar4.e();
                        arrayList16.add(new NewsDelegate.Model(str8, textClause, urlImage2, compositeClauseA2, jVarE != null ? e1k.c.a(jVarE) : null, compositeClauseA, null, null, null, fVar4, null, 2976));
                    }
                    yp0.b.k(arrayList16, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                    a0.x(i2b.a.q(new ListSubheaderDelegate.Model(h30.l.s("DATE_HEADER_", localDate), (Image) null, (Clause) new TimeClause(oc.c.F(localDate), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), arrayList16), arrayList15);
                }
                boolean zIsEmpty = arrayList15.isEmpty();
                List list10 = arrayList15;
                if (zIsEmpty) {
                    int i21 = com.revolut.retail.feature.marketnews.impl.R$string.wealthcore_currency_details_news_empty_title;
                    String str9 = this.f13724b;
                    List listC4 = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE", new TextLocalisedClause(i21, u.c(str9), null, 12), new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealthcore_currency_details_news_empty_subtitle, u.c(str9), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D009", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
                    yp0.b.k(listC4, 0, 0, 0, 0, 31);
                    list10 = listC4;
                }
                return list10;
        }
    }

    public /* synthetic */ k(String str, int i) {
        this.f13723a = i;
        this.f13724b = str;
    }
}
