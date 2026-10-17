package qll;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.domain.models.Identifier;
import ip0.yv;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.f9;
import mx0.g9;
import mx0.h9;
import mx0.i9;
import mx0.j9;
import mx0.k9;
import mx0.l9;
import mx0.m9;
import mx0.n9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f247587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sll.h f247588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sll.i f247589c;
    public final sll.e d;

    public i0(r inputData, sll.h stateMapperInitial, sll.i stateMapperPhoneNumber, sll.b stateMapperEmail, sll.e stateMapperExistingAccount) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapperInitial, "stateMapperInitial");
        Intrinsics.checkNotNullParameter(stateMapperPhoneNumber, "stateMapperPhoneNumber");
        Intrinsics.checkNotNullParameter(stateMapperEmail, "stateMapperEmail");
        Intrinsics.checkNotNullParameter(stateMapperExistingAccount, "stateMapperExistingAccount");
        this.f247587a = inputData;
        this.f247588b = stateMapperInitial;
        this.f247589c = stateMapperPhoneNumber;
        this.d = stateMapperExistingAccount;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        List listK;
        List list;
        Object h9Var;
        koi.j jVarB;
        boolean z3;
        n9 j9Var;
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zA = domainState.f247595a.a();
        boolean z4 = !zA;
        yv yvVar = null;
        ResourceImage resourceImage = zA ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        r rVar = this.f247587a;
        String str = rVar.f247599b;
        od0.a aVar = od0.a.f224253a;
        List listC = od0.a.e() ? zhm.u.c(new ActionNavBarMenuItem(new TextClause("Debug menu", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_bug, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "MENU_DEBUG")) : null;
        p pVar = domainState.f247595a;
        Identifier.Phone phone = domainState.f247596b;
        Identifier.Email email = domainState.f247597c;
        if (pVar instanceof n) {
            list = zhm.f0.f322471a;
            z = zA;
        } else {
            if (pVar instanceof m) {
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                Set set = domainState.d;
                boolean z6 = ((m) pVar).f247592a instanceof k;
                sll.h hVar = this.f247588b;
                if (z6) {
                    jVarB = sll.a.b(email);
                    h9Var = set.contains(cjl.q.PHONE) ? new k9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_continue_with_phone, null, null, 14)) : null;
                } else {
                    koi.j jVarC = hVar.c(phone, false);
                    h9Var = set.contains(cjl.q.EMAIL) ? new h9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_email, null, null, 14)) : null;
                    jVarB = jVarC;
                }
                Iterable iterable = (List) domainState.e.getContent();
                if (iterable == null) {
                    iterable = zhm.f0.f322471a;
                }
                ArrayList<gkl.x> arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((gkl.x) obj2).getEnabled()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (gkl.x xVar : arrayList) {
                    if (xVar instanceof gkl.p) {
                        z3 = zA;
                        j9Var = new f9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_bankid, null, null, 14));
                    } else {
                        z3 = zA;
                        if (xVar instanceof gkl.q) {
                            j9Var = new g9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_dap, null, null, 14));
                        } else if (xVar instanceof gkl.r) {
                            j9Var = new i9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_google, null, null, 14));
                        } else if ((xVar instanceof gkl.s) || (xVar instanceof gkl.u)) {
                            j9Var = null;
                        } else if (xVar instanceof gkl.v) {
                            j9Var = new m9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_uae, null, null, 14));
                        } else if (xVar instanceof gkl.t) {
                            j9Var = new l9(new TextLocalisedClause(R$string.revolut_sso_signin_button_qr_code, null, null, 14));
                        } else {
                            if (!(xVar instanceof gkl.w)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j9Var = new j9(new TextLocalisedClause(R$string.revolut_sso_social_signin_button_passkeys, null, null, 14));
                        }
                    }
                    if (j9Var != null) {
                        arrayList2.add(j9Var);
                    }
                    zA = z3;
                }
                z = zA;
                aim.e eVarB = zhm.u.b();
                if (h9Var != null) {
                    eVarB.add(h9Var);
                }
                eVarB.addAll(arrayList2);
                List listP0 = zhm.d0.P0(zhm.u.a(eVarB), new sll.g());
                if (!listP0.isEmpty()) {
                    Clause textLocalisedClause = hVar.f264231b.f247600c.f105891a;
                    if (textLocalisedClause == null) {
                        textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_options_separator, null, null, 14);
                    }
                    yv yvVar2 = new yv(textLocalisedClause, listP0);
                    yp0.b.r(yvVar2, 0, 0, 0, 0, 15);
                    yvVar = yvVar2;
                }
                koi.j[] elements = {jVarB, yvVar};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listK = kotlin.collections.d.L(elements);
            } else {
                z = zA;
                if (pVar instanceof l) {
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    List list2 = ((l) pVar).f247591a;
                    if (list2.isEmpty()) {
                        listK = zhm.f0.f322471a;
                    } else {
                        List listV0 = zhm.d0.V0(zhm.d0.P0(list2, new sll.d()), 4);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listV0, 10));
                        int i = 0;
                        for (Object obj3 : listV0) {
                            int i2 = i + 1;
                            if (i < 0) {
                                zhm.v.s();
                                throw null;
                            }
                            arrayList3.add(((tll.r) this.d.f264230a).f(i, (RevolutAccountSession) obj3));
                            i = i2;
                        }
                        listK = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("LIST_ID_ACTION_EXISTING_ACCOUNTS_NOT_RECOGNISED", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_existing_accounts_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_existing_accounts_action, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946), yp0.e0.OUTSIDE_BOX, 0, R$attr.uikit_dp24, 116);
                    }
                } else if (pVar instanceof k) {
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    listK = zhm.v.k(sll.a.b(email), sll.a.a(new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14), "LIST_ID_BUTTON_CONTINUE_EMAIL", ((k) pVar).f247590a), sll.a.d(new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_action_lost_email, null, null, 14), "LIST_ID_BUTTON_LOST_ACCESS_EMAIL_NUMBER"));
                } else {
                    if (!(pVar instanceof o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    listK = zhm.v.k(this.f247589c.c(phone, true), sll.a.a(new TextLocalisedClause(R$string.revolut_sso_common_actions_continue, null, null, 14), "LIST_ID_BUTTON_CONTINUE_PHONE", ((o) pVar).f247594a), sll.a.d(new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_action_lost_phone, null, null, 14), "LIST_ID_BUTTON_LOST_ACCESS_PHONE_NUMBER"));
                }
            }
            list = listK;
        }
        Image image = rVar.f247600c.f105893c;
        if (image == null) {
            mll.d.Companion.getClass();
            image = mll.b.f207043b;
        }
        return new c0(z, z4, resourceImage, str, image, listC, list);
    }
}
