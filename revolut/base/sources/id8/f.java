package id8;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_consent.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160442a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f160443b;

    public /* synthetic */ f(Map map, j jVar) {
        this.f160443b = map;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ActionWidgetDelegate.Model model;
        int i = this.f160442a;
        boolean z = false;
        Map map = this.f160443b;
        switch (i) {
            case 0:
                List consentRequests = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(consentRequests, "consentRequests");
                if (consentRequests.isEmpty()) {
                    return f0.f322471a;
                }
                List<xc8.f> listP0 = d0.P0(consentRequests, new h());
                ArrayList arrayList = new ArrayList();
                for (xc8.f fVar : listP0) {
                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) map.get(fVar.f304105b);
                    if (juniorBankingProfile == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Could not find junior profile given the juniorId = ", kotlin.text.f0.U0(4, fVar.f304105b)));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        model = null;
                    } else {
                        model = new ActionWidgetDelegate.Model(j6.a.q("PAYMENT_LINK_CONSENT_REQUEST_PENDING_ACTION_LIST_ID", fVar.f304104a), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_pending_action_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_pending_action_subtitle, u.c(juniorBankingProfile.f77099b), null, 12), new m(new ContactImage(juniorBankingProfile.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(juniorBankingProfile), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_pending_action_action_show_more_title, null, null, 14), null, false), null, fVar, null, false, 8016);
                    }
                    if (model != null) {
                        arrayList.add(model);
                    }
                }
                return arrayList;
            default:
                r5b.e linkAccountInfo = (r5b.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_primary_button_placeholder, u.c(linkAccountInfo.e), null, 12);
                if (map.size() >= linkAccountInfo.d.size()) {
                    if (map.isEmpty()) {
                        z = true;
                    } else {
                        Iterator it8 = map.entrySet().iterator();
                        while (it8.hasNext()) {
                            if (kotlin.text.d0.W((CharSequence) ((Map.Entry) it8.next()).getValue())) {
                            }
                        }
                        z = true;
                    }
                }
                String str = linkAccountInfo.f;
                return new x6b.c(textLocalisedClause, str != null ? new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_secondary_button_placeholder, u.c(str), null, 12) : null, z);
        }
    }
}
