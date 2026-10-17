package g40;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat_core.R$plurals;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProfileDelegate;
import com.revolut.core.ui_kit.delegates.c3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.s9;
import ip0.t30;
import ip0.xk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements p {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z50.g f140313a;

    public h(z50.g liveAgentAvatarProvider) {
        Intrinsics.checkNotNullParameter(liveAgentAvatarProvider, "liveAgentAvatarProvider");
        this.f140313a = liveAgentAvatarProvider;
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String, java.lang.Throwable, java.util.List] */
    @Override // jki.p
    public final m a(jki.i iVar) {
        Object obj2;
        int i;
        Pair pair;
        t30 t30Var;
        int i2;
        xk xkVar;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        AgentInfo agentInfo = domainState.f140311a;
        e.Companion.getClass();
        e eVarA = d.a(agentInfo);
        Image imageA = this.f140313a.a(agentInfo.a());
        String str = agentInfo.f50998b;
        boolean z = agentInfo.d;
        Clause textLocalisedClause = (z || str == null || d0.W(str)) ? new TextLocalisedClause(R$string.chat_support_suggestions_assistant_name, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClauseF = eVarA.f();
        Clause clauseC = eVarA.c();
        dw0.a aVarB = d.a(agentInfo).b();
        AccentCircleBadge accentCircleBadge = aVarB != null ? new AccentCircleBadge(aVarB) : null;
        Float fValueOf = Float.valueOf(16.0f);
        Integer num = agentInfo.f51005n;
        t30 t30Var2 = new t30(new CompositeClause(v.k(new NumberClause(Math.max(num != null ? num.intValue() : 10, 10), new NumberClause.Format.Compact(true), (Custom) null, 4), new ImageClause(R$drawable.uikit_icn_24_double_thumbs, (Integer) null, fValueOf, fValueOf, 18)), null, null, null, 14), new TextLocalisedClause(R$string.chat_agent_page_wow_ratings, null, null, 14), "LIST_ID_AGENT_HEADER_RATING");
        if (z) {
            Long l2 = agentInfo.f51002j;
            obj2 = null;
            i = 14;
            t30Var = new t30(new NumberClause(l2 != null ? l2.longValue() : 0L, new NumberClause.Format.Compact(true), 4), new TextLocalisedClause(R$string.chat_agent_page_chats, null, null, 14), "LIST_ID_AGENT_HEADER_CHATS");
        } else {
            obj2 = null;
            i = 14;
            Period periodMonths = agentInfo.f51006p;
            if (periodMonths == null) {
                periodMonths = Period.months(1);
            }
            Intrinsics.h(periodMonths);
            int years = periodMonths.getYears();
            if (years > 0) {
                pair = new Pair(new TextClause(String.valueOf(years), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.chat_agent_profile_tenure_years, Integer.valueOf(years), (List) null, (Style) null, 28));
            } else {
                int iMax = Math.max(periodMonths.getMonths(), 1);
                pair = new Pair(new TextClause(String.valueOf(iMax), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.chat_agent_profile_tenure_months, Integer.valueOf(iMax), (List) null, (Style) null, 28));
            }
            t30Var = new t30((Clause) pair.f186385a, (Clause) pair.f186386b, "LIST_ID_AGENT_HEADER_TENURE");
        }
        ?? r142 = obj2;
        ProfileDelegate.Model model = new ProfileDelegate.Model(imageA, textLocalisedClause, textLocalisedClauseF, clauseC, accentCircleBadge, v.k(t30Var2, t30Var));
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        Iterable iterable = agentInfo.f51007q;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.chat_agent_profile_subheader_compliments, r142, r142, i);
        int i3 = R$attr.uikit_dp24;
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER_COMPLIMENTS", (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, i3, i3, 8186);
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable2) {
            if (((AgentInfo.Compliment) obj3).f51012c != null) {
                arrayList.add(obj3);
            }
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            i2 = 0;
        } else {
            Iterator it8 = iterable2.iterator();
            i2 = 0;
            while (it8.hasNext()) {
                Integer num2 = ((AgentInfo.Compliment) it8.next()).d;
                if (((num2 != null ? num2.intValue() : 0) > 10) && (i2 = i2 + 1) < 0) {
                    v.r();
                    throw r142;
                }
            }
        }
        if (i2 >= 2) {
            int i5 = R$attr.uikit_dp12;
            List<AgentInfo.Compliment> listV0 = zhm.d0.V0(zhm.d0.P0(arrayList, new g()), 4);
            int i6 = 10;
            ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
            for (AgentInfo.Compliment compliment : listV0) {
                String strQ = j6.a.q("LIST_ID_COMPLIMENT.", compliment.f51010a);
                String str2 = compliment.f51012c;
                Intrinsics.h(str2);
                s9 s9Var = new s9(new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
                TextClause textClause = new TextClause(compliment.f51010a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i21 = R$string.chat_agent_profile_compliment_count;
                Integer num3 = compliment.d;
                ChallengeMediumDelegate.Model model3 = new ChallengeMediumDelegate.Model(strQ, s9Var, textClause, Intrinsics.f(compliment.e, Boolean.TRUE) ? new c3(new TagViewData(null, new TextLocalisedClause(R$string.chat_agent_profile_top_badge, r142, r142, i), R$attr.uikit_colorBlue, null, R$attr.uikit_colorTransparent, null, 1000)) : ChallengeMediumDelegate.c.f.f52012a, new TextLocalisedClause(i21, u.c(new NumberClause(num3 != null ? num3.intValue() : i6, new NumberClause.Format.Compact(true), (Custom) r142, 4)), r142, 12), 960);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(model3);
                i6 = 10;
            }
            xkVar = new xk("LIST_ID_BOX_COMPLIMENTS", arrayList2, null, null, null, i5, 0, 0, 0, 65404);
        } else {
            int i22 = R$attr.uikit_dp12;
            ChallengeMediumDelegate.Model model4 = new ChallengeMediumDelegate.Model("LIST_ID_COMPLIMENT.0", new s9(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D395", r142, r142, r142, 30)), new TextLocalisedClause(R$string.chat_ticket_experience_tag_communication, r142, r142, i), null, null, 1016);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            ChallengeMediumDelegate.Model model5 = new ChallengeMediumDelegate.Model("LIST_ID_COMPLIMENT.1", new s9(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D397", r142, r142, r142, 30)), new TextLocalisedClause(R$string.chat_ticket_experience_tag_issue_resolved, r142, r142, i), null, null, 1016);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            xkVar = new xk("LIST_ID_BOX_COMPLIMENTS", v.k(model4, model5), null, null, null, i22, 0, 0, 0, 65404);
        }
        eVarB.addAll(v.k(model2, xkVar));
        return new c(u.a(eVarB));
    }
}
