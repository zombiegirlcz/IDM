package g17;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.k;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.pc;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.q;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.youTransactor.uCube.rpc.Constants;
import dx4.a1;
import g25.t;
import ip0.qe0;
import ip0.r50;
import ip0.s50;
import ip0.u50;
import ip0.v50;
import ip0.w50;
import ip0.we0;
import ip0.x50;
import ip0.y50;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ou3.l;
import ou3.r;
import ou3.s;
import rr6.o;
import vha.d1;
import vu3.p;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139558a;

    public /* synthetic */ i(Object obj2, int i) {
        this.f139558a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v17, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ActionWidgetDelegate.Model.a iVar;
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        Custom custom;
        CircleBadgeModel successCircleBadge;
        CircleBadgeModel circleBadgeModel;
        RowDelegate.Model modelA;
        Iterator it9;
        Pair pair;
        int i = 30;
        int i2 = 1;
        boolean z = false;
        int i3 = 12;
        ?? r122 = 0;
        switch (this.f139558a) {
            case 0:
                BigDecimal value = ((o) obj2).getValue();
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-boostedPlanRate$0");
                ?? B = u.b();
                we0 we0Var = new we0("PROMPT_IMAGE_ID", new qe0(128, new CdnImage("prompt", "mobile/freelancer/onboarding/post_activation/retail", null, new ImageTransformations(null, null, null, gz0.b.Center, 16, null, null, 103), null, null, Constants.TAG_F4)));
                yp0.b.r(we0Var, 0, 0, 0, 0, 15);
                B.add(we0Var);
                boolean z3 = false;
                boolean z4 = false;
                boolean z6 = false;
                List listK = v.k(new RowDelegate.Model("PROMPT_CASHBACK_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_cashback_title_v2, u.c(new NumberClause(value, null, null, null, 14)), null, 12), null, 0, new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_cashback_subtitle_v2, u.c(new PercentageClause(value, (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("PROMPT_PAYMENTS_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_terminal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_accept_payments_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_accept_payments_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("PROMPT_TAXES_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, 6), new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_automate_taxes_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_post_activation_retail_prompt_items_automate_taxes_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                B.addAll(listK);
                return u.a(B);
            case 1:
                p content = (p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(content, "content");
                aim.e eVarB = u.b();
                eVarB.addAll(o25.e.b(content, null));
                n14.e.b(eVarB, o25.e.a(content));
                return u.a(eVarB);
            case 2:
                ou3.g content2 = (ou3.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                ?? B2 = u.b();
                s tile = content2.f229790b;
                Intrinsics.checkNotNullParameter(tile, "tile");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_dashboard_tile_title, u.c(new TextClause(tile.f229814a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_dashboard_tile_subtitle, u.c(new TextClause(tile.f229815b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                m mVar = new m(new UrlImage(tile.f229816c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (LayeredImage) null, (ProgressStyle) null, 6);
                r rVar = tile.e;
                if (rVar != null) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_dashboard_tile_action, u.c(new TextClause(rVar.f229812a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    int i5 = g25.r.f139905a[rVar.f229813b.ordinal()];
                    if (i5 == 1) {
                        iVar = new com.revolut.core.ui_kit.delegates.i(14, textLocalisedClause4, null, false);
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVar = new com.revolut.core.ui_kit.delegates.j(textLocalisedClause4, null, 14);
                    }
                } else {
                    iVar = ActionWidgetDelegate.Model.a.C0393a.f51604a;
                }
                ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("id-action-resume-application", textLocalisedClause2, textLocalisedClause3, mVar, null, iVar, q.REGULAR, tile.d, null, false, 7952);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                B2.add(model);
                ou3.p stepsSection = content2.f229791c;
                Intrinsics.checkNotNullParameter(stepsSection, "stepsSection");
                ArrayList arrayList = stepsSection.f229811b;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it10 = arrayList.iterator();
                int i6 = 0;
                while (it10.hasNext()) {
                    Object next = it10.next();
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        v.s();
                        throw null;
                    }
                    ou3.m mVar2 = (ou3.m) next;
                    String strN = a0.d.n("id-application-dashboard-step-", i6);
                    int i22 = com.revolut.feature.credit.core.R$string.application_dashboard_steps_item_title;
                    String str = mVar2.f229801a;
                    l status = mVar2.e;
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(i22, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    int i32 = com.revolut.feature.credit.core.R$string.application_dashboard_steps_item_subtitle;
                    String str2 = mVar2.f229802b;
                    Intrinsics.checkNotNullParameter(status, "status");
                    int i33 = g25.v.f139907a[status.ordinal()];
                    if (i33 == 1) {
                        it8 = it10;
                        textLocalisedClause = textLocalisedClause5;
                        custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorTeal), false, false, 254);
                    } else if (i33 == 2) {
                        it8 = it10;
                        custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorTerracotta), false, false, 254);
                        textLocalisedClause = textLocalisedClause5;
                    } else {
                        if (i33 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        it8 = it10;
                        textLocalisedClause = textLocalisedClause5;
                        custom = null;
                    }
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i32, u.c(new TextClause(str2, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124)), null, 12);
                    a1 icon = mVar2.d;
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    GlyphImage glyphImageD = icon.d();
                    Intrinsics.checkNotNullParameter(status, "status");
                    int i43 = t.f139906a[status.ordinal()];
                    if (i43 == 1) {
                        successCircleBadge = new SuccessCircleBadge(dw0.a.Checked);
                    } else if (i43 == 2) {
                        successCircleBadge = new WarningCircleBadge(dw0.a.Awaiting);
                    } else {
                        if (i43 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        circleBadgeModel = null;
                        arrayList2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(glyphImageD, circleBadgeModel, ProgressStyle.INSTANCE.a(mVar2.f229803c), false, null, false, 56), textLocalisedClause, null, 0, textLocalisedClause6, null, null, 0, null, false, null, false, null, null, null, null, null, null, mVar2.f, null, 0, 0, 0, 0, 532676568));
                        it10 = it8;
                        i6 = i21;
                    }
                    circleBadgeModel = successCircleBadge;
                    arrayList2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(glyphImageD, circleBadgeModel, ProgressStyle.INSTANCE.a(mVar2.f229803c), false, null, false, 56), textLocalisedClause, null, 0, textLocalisedClause6, null, null, 0, null, false, null, false, null, null, null, null, null, null, mVar2.f, null, 0, 0, 0, 0, 532676568));
                    it10 = it8;
                    i6 = i21;
                }
                B2.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("id-application-dashboard-steps-section-title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_dashboard_steps_section_title, u.c(new TextClause(stepsSection.f229810a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                ou3.i cancelSection = content2.d;
                if (cancelSection != null) {
                    Intrinsics.checkNotNullParameter(cancelSection, "cancelSection");
                    ArrayList arrayList3 = cancelSection.f229794a;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    int i59 = 0;
                    for (Object obj5 : arrayList3) {
                        int i66 = i59 + 1;
                        if (i59 < 0) {
                            v.s();
                            throw null;
                        }
                        ou3.h hVar = (ou3.h) obj5;
                        arrayList4.add(new InputDisclosureDelegate.Model(a0.d.n("id-action-cancel-application-", i59), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.application_dashboard_cancel_action, u.c(new TextClause(hVar.f229792a, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorRed), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), null, hVar.f229793b, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
                        i59 = i66;
                    }
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    B2.addAll(arrayList4);
                }
                return u.a(B2);
            case 3:
                Map profiles = (Map) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                List listD1 = d0.d1(profiles.values());
                ArrayList<JuniorBankingProfile> arrayList5 = new ArrayList();
                for (Object obj6 : listD1) {
                    if (((JuniorBankingProfile) obj6).f77106n) {
                        arrayList5.add(obj6);
                    }
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                for (JuniorBankingProfile juniorBankingProfile : arrayList5) {
                    arrayList6.add(new ActionWidgetDelegate.Model(j6.a.q("JUNIOR_PENDING_ACTION_ACCOUNT_TERMINATION", juniorBankingProfile.f77103j), new TextLocalisedClause(com.revolut.feature.junior_close_account.common.R$string.junior_account_close_pending_action_closure_request_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_close_account.common.R$string.junior_account_close_pending_action_closure_request_message, u.c(juniorBankingProfile.f77099b), null, 12), new m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(com.revolut.feature.junior_close_account.common.R$string.junior_account_close_pending_action_closure_request_action_review_request, null, null, 14), null, 14), null, new j78.b(juniorBankingProfile.f77103j), null, false, 7488));
                }
                return arrayList6;
            case 4:
                qib.i challengeAccount = (qib.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                qib.g gVar = challengeAccount.f246693c;
                ArrayList arrayList7 = gVar.d;
                int size = arrayList7.size();
                int i74 = 0;
                for (int i92 = 0; i92 < size; i92++) {
                    qib.c cVar = ((qib.d) arrayList7.get(i92)).f246681b;
                    if (cVar == qib.c.PENDING || cVar == qib.c.AT_RISK) {
                        i74++;
                    }
                }
                CellDetailsDelegate.Model modelA2 = lkb.d.a(i74);
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                Iterator it11 = arrayList7.iterator();
                int i96 = 0;
                while (true) {
                    if (!it11.hasNext()) {
                        i96 = -1;
                    } else if (((qib.d) it11.next()).f246681b != qib.c.PENDING) {
                        i96++;
                    }
                }
                if (i96 < 0) {
                    i96 = 0;
                }
                int i99 = i96 - 1;
                if (i99 < 0) {
                    i99 = 0;
                }
                xjb.b bVarH = d8l.d.h(challengeAccount);
                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                Iterator it12 = arrayList7.iterator();
                int i100 = 0;
                while (true) {
                    ?? r212 = r122;
                    if (!it12.hasNext()) {
                        s50 s50Var = new s50(arrayList8, new r50(a0.d.n("checkpoint_", i99), 2));
                        Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                        int i101 = lkb.b.f196345a[d8l.d.h(challengeAccount).ordinal()];
                        if (i101 == 1) {
                            modelA = lkb.a.a(R$drawable.uikit_icn_24_play, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_widget_action_title_paused, null, null, 14), gVar.f246685a, new pf(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_widget_action_cta_paused, null, null, 14), null, h4.ACCENT, false, null, null, 506), new sib.b(sib.a.RESUME), false);
                        } else if (i101 == 2) {
                            int size2 = arrayList7.size();
                            int i102 = 0;
                            for (int i103 = 0; i103 < size2; i103++) {
                                if (((qib.d) arrayList7.get(i103)).f246681b == qib.c.COMPLETED) {
                                    i102++;
                                }
                            }
                            modelA = lkb.a.a(R$drawable.uikit_icn_24_present, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_widget_action_title_default, u.c(new TextClause(String.valueOf(i102), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), r212, 12), gVar.f246685a, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), sib.c.f263535a, true);
                        } else if (i101 == 3) {
                            modelA = lkb.a.b(R$drawable.uikit_icn_24_trophy, gVar);
                        } else {
                            if (i101 != 4 && i101 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modelA = lkb.a.b(R$drawable.uikit_icn_24_present, gVar);
                        }
                        List listK2 = v.k(modelA2, s50Var, modelA);
                        yp0.b.k(listK2, 0, 0, 0, 0, 31);
                        return listK2;
                    }
                    Object next2 = it12.next();
                    int i104 = i100 + 1;
                    if (i100 < 0) {
                        v.s();
                        throw r212;
                    }
                    qib.d dVar = (qib.d) next2;
                    int i105 = lkb.f.f196346a[dVar.f246681b.ordinal()];
                    y50 y50Var = w50.f166936a;
                    if (i105 == i2) {
                        it9 = it12;
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_circle_check), v50.f166774a);
                    } else if (i105 == 2) {
                        it9 = it12;
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_circle_no_check), y50Var);
                    } else if (i105 == 3) {
                        it9 = it12;
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_exclamation_mark), u50.f166597a);
                    } else {
                        if (i105 != 4 && i105 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        it9 = it12;
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_circle_no_check), x50.f167096a);
                    }
                    int iIntValue = ((Number) pair.f186385a).intValue();
                    y50 y50Var2 = (y50) pair.f186386b;
                    String strN2 = a0.d.n("checkpoint_", i100);
                    ResourceImage resourceImage = new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TimeClause timeClause = new TimeClause(oi0.d.R(dVar.f246680a), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
                    if (bVarH != xjb.b.PAUSED) {
                        y50Var = y50Var2;
                    }
                    arrayList8.add(new pc(strN2, resourceImage, timeClause, y50Var));
                    it12 = it9;
                    r122 = r212;
                    i100 = i104;
                    i2 = 1;
                }
                break;
            case 5:
                BigDecimal value2 = ((o) obj2).getValue();
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(value2, "$v$c$com-revolut-feature-freelancer-common-models-cashback-FreelancerCashbackRate$-rate$0");
                List listK3 = v.k(new RowDelegate.Model("LIST_ID_DISCOVER_EARN_CASHBACK", new RowDelegate.Model.MainImage.Image56(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_cashback, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (CircleBadgeModel) (0 == true ? 1 : 0), z, i3), new TextLocalisedClause(com.revolut.feature.pro.accounts.impl.R$string.freelancer_home_discover_cells_earn_title_v2, u.c(new PercentageClause(value2, (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.pro.accounts.impl.R$string.freelancer_home_discover_cells_earn_subtitle_v2, u.c(new PercentageClause(value2, (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), d1.a(), d1.b());
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                return listK3;
            default:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List<vd8.c> list = (List) pair2.f186385a;
                Map map = (Map) pair2.f186386b;
                ArrayList arrayList9 = new ArrayList();
                for (vd8.c cVar2 : list) {
                    JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) map.get(cVar2.f287822b);
                    ActionWidgetDelegate.Model model2 = juniorBankingProfile2 != null ? new ActionWidgetDelegate.Model(j6.a.q("JUNIOR_PENDING_ACTION_COPARENT_REQUEST", cVar2.f287821a), new TextLocalisedClause(com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_pending_action_request_title, u.c(juniorBankingProfile2.f77099b), null, 12), new TextLocalisedClause(com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_pending_action_request_message, null, null, 14), new m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D183", null, null, null, i), (LayeredImage) null, (ProgressStyle) null, 6), ActionWidgetDelegate.Model.b.C0394b.f51606a, new k(new TextLocalisedClause(com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_pending_action_request_action_add_co_parent, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_pending_action_request_action_decline, null, null, 14), null, null, Constants.TAG_OS_VERSION), null, cVar2, null, false, 7488) : null;
                    if (model2 != null) {
                        arrayList9.add(model2);
                    }
                    i = 30;
                }
                return arrayList9;
        }
    }
}
