package com.revolut.feature.pockets.impl.details_v2.pocket_actions;

import aim.e;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pocket_actions.common.R$string;
import com.revolut.feature.pockets.impl.details_v2.pocket_actions.PocketDetailsContext;
import io3.d;
import io3.k;
import java.util.List;
import jr6.s;
import kotlin.jvm.internal.Intrinsics;
import n38.q;
import qv0.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f80835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y91.b f80836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f80837c;
    public final RowDelegate.Model d;

    public a(s freelancerActionSource, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(freelancerActionSource, "freelancerActionSource");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f80835a = freelancerActionSource;
        this.f80836b = accountsProductFeatureChecker;
        RowDelegate.Model model = new RowDelegate.Model("helpAction", null, new TextLocalisedClause(R$string.pocket_actions_action_get_help, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        this.f80837c = model;
        RowDelegate.Model model2 = new RowDelegate.Model("accountCloseAction", null, new TextLocalisedClause(R$string.pocket_actions_action_close_joint_account, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        this.d = model2;
        yp0.b.l(new RowDelegate.Model("deactivateAction", null, new TextLocalisedClause(R$string.revolut_accounts_account_details_hide_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), 0, 0, 0, 0, null, false, 63);
        yp0.b.l(new RowDelegate.Model("deactivateAction", null, new TextLocalisedClause(R$string.revolut_accounts_account_details_deactivate_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), 0, 0, 0, 0, null, false, 63);
        yp0.b.l(new RowDelegate.Model("activateAction", null, new TextLocalisedClause(R$string.pocket_actions_action_activate_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), 0, 0, 0, 0, null, false, 63);
    }

    public final e a(d pocket, PocketDetailsContext pocketDetailsContext) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(pocketDetailsContext, "pocketDetailsContext");
        q qVar = pocketDetailsContext.e;
        RowDelegate.Model model = this.f80837c;
        if (qVar != null) {
            e eVarB = u.b();
            eVarB.addAll(b(pocket));
            eVarB.addAll(v.l(model));
            eVarB.add(this.d);
            return u.a(eVarB);
        }
        e eVarB2 = u.b();
        eVarB2.addAll(b(pocket));
        PocketDetailsContext.FreelancerPocketContext freelancerPocketContext = pocketDetailsContext.f;
        RowDelegate.Model model2 = null;
        if (freelancerPocketContext != null) {
            boolean z = pocket.f == k.ACTIVE;
            boolean z3 = pocketDetailsContext.f80831a;
            boolean z4 = freelancerPocketContext.f80834a;
            ida.a pocketContext = new ida.a(z, z3, z4);
            ((yz6.a) this.f80835a).getClass();
            Intrinsics.checkNotNullParameter("ACTION_ID_CLOSE_ACCOUNT", "listId");
            Intrinsics.checkNotNullParameter(pocketContext, "pocketContext");
            if (z && z3 && z4) {
                RowDelegate.Model model3 = new RowDelegate.Model("ACTION_ID_CLOSE_ACCOUNT", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_account_closure_account_actions_close_account, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                model2 = model3;
            }
        }
        i[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB2.addAll(kotlin.collections.d.L(elements));
        return u.a(eVarB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(io3.d r34) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.details_v2.pocket_actions.a.b(io3.d):java.util.List");
    }
}
