package ws2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.x9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.pb0;
import ip0.wy;
import ip0.xy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import qv0.q;
import ru.m;
import ru.n;
import ru.o;
import ru.p;
import ru.r;
import ru.s;
import ru.t;
import ru.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements g {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f299650a;

    public i(vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f299650a = resourceProvider;
    }

    public static ResourceImage d(av1.c cVar) {
        if (Intrinsics.f(cVar, m.f257372c)) {
            return new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusSuccess), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (Intrinsics.f(cVar, n.f257373c) || (cVar instanceof p)) {
            return new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (Intrinsics.f(cVar, o.f257374c)) {
            return new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ArrayList a() {
        IntRange intRange = new IntRange(1, 5, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("STEPS_LOADING_LIST_ID_", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final List b() {
        boolean z = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
        vu.f fVar = vu.f.business_referrals_invitee_benefits_section_send_request_money_title;
        n5j.b bVar = (n5j.b) this.f299650a;
        boolean z3 = false;
        List listK = v.k(new RowDelegate.Model("SEND_REQUEST_LIST_ID", image24, new TextLocalisedClause(bVar.b(fVar), null, null, 14), null, 0, new TextLocalisedClause(bVar.b(vu.f.business_referrals_invitee_benefits_section_send_request_money_subtitle), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("MORE_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(bVar.b(vu.f.business_referrals_invitee_benefits_section_more_title), null, null, 14), null, 0, new TextLocalisedClause(bVar.b(vu.f.business_referrals_invitee_benefits_section_more_subtitle), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final ArrayList c(List steps, ru.i iVar) {
        ResourceImage resourceImage;
        int i;
        RowDelegate.Model.MainImage.Image24 image24;
        q model;
        Intrinsics.checkNotNullParameter(steps, "steps");
        List<ru.v> list = steps;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ru.v vVar : list) {
            boolean z = iVar instanceof ru.f;
            vu.g gVar = this.f299650a;
            if (z && (vVar.d instanceof p) && !vVar.e.isEmpty()) {
                String strQ = j6.a.q("STEPS_LIST_ID", vVar.f257382b);
                av1.c cVar = vVar.d;
                ResourceImage resourceImageD = cVar != null ? d(cVar) : null;
                x9 x9Var = x9.DP_24;
                TextClause textClause = new TextClause(vVar.f257382b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124);
                String str = vVar.f257383c;
                model = new NotificationCentreItemDelegate.Model(strQ, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new wy(new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_steps_not_eligible_review_criteria), null, null, 14), xy.SECONDARY_ACTIVE, null), resourceImageD, x9Var, null, vVar, 255072);
            } else {
                String strQ2 = j6.a.q("STEPS_LIST_ID", vVar.f257382b);
                av1.c cVar2 = vVar.d;
                if (cVar2 != null) {
                    resourceImage = d(cVar2);
                } else {
                    av1.c cVar3 = vVar.f257381a;
                    if (cVar3 != null) {
                        if (cVar3.equals(t.f257379c)) {
                            i = R$drawable.uikit_icn_24_link;
                        } else if (cVar3.equals(ru.q.f257376c)) {
                            i = R$drawable.uikit_icn_24_cash_income;
                        } else if (cVar3.equals(r.f257377c)) {
                            i = R$drawable.uikit_icn_24_card;
                        } else if (cVar3.equals(s.f257378c)) {
                            i = R$drawable.uikit_icn_24_check_verification;
                        } else {
                            if (!cVar3.equals(u.f257380c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$drawable.uikit_icn_24_cart;
                        }
                        resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    } else {
                        resourceImage = null;
                    }
                }
                if (resourceImage != null) {
                    boolean z3 = false;
                    image24 = new RowDelegate.Model.MainImage.Image24(resourceImage, z3, z3, 6);
                } else {
                    image24 = null;
                }
                TextClause textClause2 = new TextClause(vVar.f257382b, (Style) ((Intrinsics.f(cVar2, n.f257373c) || (cVar2 instanceof p)) ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE) : null), (Integer) null, false, (o9) null, (List) null, 124);
                String str2 = vVar.f257383c;
                model = new RowDelegate.Model(strQ2, image24, textClause2, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, vVar.e.isEmpty() ? null : new TextLocalisedClause(((iVar instanceof ru.c) || iVar == null) ? ((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_steps_not_eligible_see_criteria) : ((n5j.b) gVar).b(vu.f.business_referrals_active_campaign_steps_not_eligible_review_criteria), null, new Click(28, (Integer) null, (Object) vVar, " ELIGIBILITY_CLICK_ID", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760);
            }
            arrayList.add(model);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
