package t48;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.feature.terms.api.model.TermsScope;
import ip0.ak0;
import ip0.iq;
import ip0.yt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ms0.h4;
import n38.d0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements jki.p {

    @NotNull
    public static final z Companion = new z();
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dci.b f267915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k58.a f267916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bci.d f267917c;
    public final RowDelegate.Model.MainImage.Image40 d;

    static {
        String[] elements = {"TERMS_FOOTER_ID", "FSCS_FOOTER_ID", "PRIVACY_POLICY_FOOTER_ID", "INSURANCE_POLICY_FOOTER_ID", "FEE_AND_CHARGES_ID", "FINANCIAL_SERVICES_GUIDE_ID", "PRODUCT_DISCLOSURE_STATEMENT_ID", "PRE_CONTRACTUAL_CLICK_ID"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
    }

    public b0(bci.d purposeMapper, dci.b purposeNameProvider, k58.a relationshipTextProvider) {
        Intrinsics.checkNotNullParameter(purposeNameProvider, "purposeNameProvider");
        Intrinsics.checkNotNullParameter(relationshipTextProvider, "relationshipTextProvider");
        Intrinsics.checkNotNullParameter(purposeMapper, "purposeMapper");
        this.f267915a = purposeNameProvider;
        this.f267916b = relationshipTextProvider;
        this.f267917c = purposeMapper;
        this.d = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 7.0f, null, null, 48), null, null, false, null, false, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.Map] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        char c2;
        dci.b bVar;
        List listL;
        TextDelegate.Model model;
        int i;
        List list;
        TextDelegate.Model model2;
        boolean z;
        Collection collectionG;
        List listG;
        int i2;
        ?? r112;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        ContactImage contactImage;
        Object obj2;
        Clause textLocalisedClause5;
        Object obj3;
        RowDelegate.Model model3;
        RowDelegate.Model model4;
        List<String> list2;
        TermsScope termsScope;
        RowDelegate.Model model5;
        RowDelegate.Model model6;
        RowDelegate.Model model7;
        RowDelegate.Model model8;
        RowDelegate.Model model9;
        TextLocalisedClause textLocalisedClause6;
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = domainState.e;
        List list3 = domainState.f267919b;
        h hVar = domainState.f267921g;
        InvitationType invitationType = domainState.f267918a;
        wi0.b bVar2 = domainState.f;
        int[] iArr = a0.f267914a;
        int i3 = iArr[gVar.ordinal()];
        char c3 = 2;
        if (i3 != 1) {
            if (i3 == 2) {
                textLocalisedClause6 = new TextLocalisedClause(R$string.joint_common_action_continue, null, null, 14);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause6 = new TextLocalisedClause(R$string.joint_consent_action_accept_and_continue, null, null, 14);
            }
            textLocalisedClause = textLocalisedClause6;
        } else {
            textLocalisedClause = null;
        }
        int i5 = iArr[domainState.e.ordinal()];
        if (i5 == 1 || i5 == 2) {
            textLocalisedClause2 = null;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.joint_consent_action_decline_invitation, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.joint_consent_account_for_two_title, null, null, 14);
        wi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause8 = (Intrinsics.f(bVar2, wi0.b.l2) || Intrinsics.f(bVar2, wi0.b.f297756l)) ? new TextLocalisedClause(R$string.joint_consent_account_for_two_negative_balance_description, null, null, 14) : new TextLocalisedClause(R$string.joint_consent_account_for_two_description, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        yt ytVar = yt.TOP;
        ListCellDelegate.Model model10 = new ListCellDelegate.Model("ACCOUNT_FOR_TWO_ID", new j8(resourceImage, ytVar), textLocalisedClause7, textLocalisedClause8, false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model11 = new ListCellDelegate.Model("DEDICATED_ACCOUNT_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_dedicated_account_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_dedicated_account_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model12 = new ListCellDelegate.Model("JOINT_CARDS_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_joint_cards_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_joint_cards_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model13 = new ListCellDelegate.Model("JOINT_LIMITS_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_joint_limits_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_joint_limits_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model14 = new ListCellDelegate.Model("JOINT_STOCK_AND_FLOW_CAP_LIMITS_LIST_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_stock_and_flow_cap_limit_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_stock_and_flow_cap_limit_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        if (!com.bumptech.glide.d.v(bVar2)) {
            model14 = null;
        }
        ListCellDelegate.Model model15 = new ListCellDelegate.Model("SHARED_DETAILS_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_shared_details_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_shared_details_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model16 = new ListCellDelegate.Model("POD_BENEFICIARIES_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.joint_consent_pod_beneficiaries_title, null, null, 14), new TextLocalisedClause(R$string.joint_consent_pod_beneficiaries_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        if (!com.bumptech.glide.d.u(bVar2)) {
            model16 = null;
        }
        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.joint_consent_purpose_of_account_title, null, null, 14);
        List list4 = list3;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            c2 = c3;
            bVar = this.f267915a;
            if (!zHasNext) {
                break;
            }
            arrayList.add(new TextClause(bVar.c((cci.g) it8.next(), bVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            c3 = c2;
        }
        RowDelegate.Model model17 = new RowDelegate.Model("SELECTED_PURPOSES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_list_bullet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause9, null, 0, yoj.b.m(new TextLocalisedClause(R$string.joint_common_comma, null, null, 14), arrayList), null, null, 0, new pf(new TextLocalisedClause(R$string.joint_common_change, null, null, 14), null, h4.FLAT, false, null, null, 506), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        if (list3.isEmpty()) {
            model17 = null;
        }
        qv0.i[] elements = new qv0.i[8];
        elements[0] = model10;
        elements[1] = model11;
        elements[c2] = model12;
        elements[3] = model13;
        elements[4] = model14;
        elements[5] = model15;
        elements[6] = model16;
        elements[7] = model17;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        p pVar = domainState.d;
        if (pVar != null) {
            TermsScope termsScope2 = pVar.f267926a;
            TermsScope termsScope3 = pVar.f267927b;
            TermsScope termsScope4 = !com.bumptech.glide.d.v(bVar2) ? pVar.f267928c : null;
            TermsScope termsScope5 = pVar.d;
            TermsScope termsScope6 = pVar.e;
            TermsScope termsScope7 = pVar.f267930h;
            if (!com.bumptech.glide.d.l(bVar2)) {
                wi0.b.Companion.getClass();
                if (!Intrinsics.f(bVar2, wi0.b.l2)) {
                    termsScope7 = null;
                }
            }
            TermsScope termsScope8 = pVar.f;
            if (!com.bumptech.glide.d.l(bVar2)) {
                termsScope8 = null;
            }
            TermsScope termsScope9 = pVar.f267929g;
            if (!com.bumptech.glide.d.l(bVar2)) {
                termsScope9 = null;
            }
            if (termsScope4 != null) {
                termsScope = termsScope9;
                model5 = new RowDelegate.Model("INSURANCE_POLICY_FOOTER_ID", this.d, new TextLocalisedClause(R$string.joint_consent_footer_deposit_insurance_information, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope4, null, 0, 0, 0, 0, 532676600);
            } else {
                termsScope = termsScope9;
                model5 = null;
            }
            if (termsScope5 != null) {
                model6 = model5;
                model7 = new RowDelegate.Model("FSCS_FOOTER_ID", this.d, new TextLocalisedClause(R$string.joint_consent_fscs, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope5, null, 0, 0, 0, 0, 532676600);
            } else {
                model6 = model5;
                model7 = null;
            }
            RowDelegate.Model model18 = termsScope != null ? new RowDelegate.Model("FINANCIAL_SERVICES_GUIDE_ID", this.d, new TextLocalisedClause(R$string.joint_consent_financial_services_guide, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope, null, 0, 0, 0, 0, 532676600) : null;
            if (termsScope8 != null) {
                model8 = model7;
                model9 = new RowDelegate.Model("PRODUCT_DISCLOSURE_STATEMENT_ID", this.d, new TextLocalisedClause(R$string.joint_consent_product_disclosure_statement, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope8, null, 0, 0, 0, 0, 532676600);
            } else {
                model8 = model7;
                model9 = null;
            }
            RowDelegate.Model[] elements2 = {new RowDelegate.Model("TERMS_FOOTER_ID", this.d, new TextLocalisedClause(R$string.joint_consent_terms, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope2, null, 0, 0, 0, 0, 532676600), model8, new RowDelegate.Model("PRIVACY_POLICY_FOOTER_ID", this.d, new TextLocalisedClause(R$string.joint_consent_privacy_policy, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope3, null, 0, 0, 0, 0, 532676600), model6, termsScope6 != null ? new RowDelegate.Model("PRE_CONTRACTUAL_CLICK_ID", this.d, new TextLocalisedClause(R$string.joint_consent_pre_contractual_information, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope6, null, 0, 0, 0, 0, 532676600) : null, termsScope7 != null ? new RowDelegate.Model("FEE_AND_CHARGES_ID", this.d, new TextLocalisedClause(R$string.joint_consent_fees_and_charges, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, termsScope7, null, 0, 0, 0, 0, 532676600) : null, model9, model18};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else {
            listL = f0.f322471a;
        }
        if (textLocalisedClause != null) {
            wi0.b.Companion.getClass();
            TextLocalisedClause textLocalisedClause10 = Intrinsics.f(bVar2, wi0.b.y2) ? new TextLocalisedClause(R$string.joint_consent_footer_text_pt, null, null, 14) : hVar != h.NOT_REQUIRED ? new TextLocalisedClause(R$string.joint_consent_footer_dual_consent, zhm.u.c(textLocalisedClause), null, 12) : (Intrinsics.f(bVar2, wi0.b.l2) || Intrinsics.f(bVar2, wi0.b.f297756l) || !Intrinsics.f(bVar2, wi0.b.p0)) ? new TextLocalisedClause(R$string.joint_consent_footer_text_updated, zhm.u.c(textLocalisedClause), null, 12) : new TextLocalisedClause(R$string.joint_consent_outgoing_footer_text, zhm.u.c(textLocalisedClause), null, 12);
            model = new TextDelegate.Model("FOOTER_ID", textLocalisedClause10, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        } else {
            model = null;
        }
        boolean z3 = invitationType instanceof InvitationType.IncomingInvitation;
        InvitationType.OutgoingInvitation outgoingInvitation = InvitationType.OutgoingInvitation.f76585a;
        if (z3) {
            i = R$attr.uikit_dp72;
        } else {
            if (!Intrinsics.f(invitationType, outgoingInvitation)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_dp8;
        }
        if (z3) {
            d0 d0Var = ((InvitationType.IncomingInvitation) invitationType).f76584a;
            n38.v vVar = d0Var.i;
            boolean z4 = d0Var.e;
            j38.a bVar3 = vVar != null ? vVar.f211962a : new j38.b("");
            n38.v vVar2 = d0Var.i;
            if (vVar2 == null || (list2 = vVar2.f211963b) == null) {
                list = listL;
                model2 = model;
                obj2 = f0.f322471a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String purpose : list2) {
                    List list5 = listL;
                    TextDelegate.Model model19 = model;
                    Intrinsics.checkNotNullParameter(purpose, "purpose");
                    cci.g gVar2 = (cci.g) u1.v(purpose, this.f267917c.f14448a);
                    if (gVar2 != null) {
                        arrayList2.add(gVar2);
                    }
                    listL = list5;
                    model = model19;
                }
                list = listL;
                model2 = model;
                obj2 = arrayList2;
            }
            if (z4) {
                obj3 = obj2;
                textLocalisedClause5 = new TextClause(d0Var.f211939c.f211960b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                z = z3;
            } else {
                obj3 = obj2;
                z = z3;
                textLocalisedClause5 = new TextLocalisedClause(R$string.joint_invitee_consent_invitation_details_not_in_contacts, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
            }
            RowDelegate.Model model20 = new RowDelegate.Model("INVITER_DETAIL_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(d0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, textLocalisedClause5, null, null, 0, !z4 ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
            if (bVar3 instanceof j38.b) {
                model3 = null;
            } else {
                TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(R$string.joint_confirm_details_relationship_status, null, null, 14);
                this.f267916b.getClass();
                model3 = new RowDelegate.Model("RELATIONSHIP_STATUS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause11, null, 0, k58.a.a(bVar3), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            }
            if (((Collection) obj3).isEmpty()) {
                model4 = null;
            } else {
                TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(R$string.joint_confirm_details_reasons_for_opening, null, null, 14);
                Iterable iterable = (Iterable) obj3;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new TextClause(bVar.c((cci.g) it9.next(), bVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                model4 = new RowDelegate.Model("REASONS_FOR_OPENING_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause12, null, 0, yoj.b.m(new TextLocalisedClause(R$string.joint_common_comma, null, null, 14), arrayList3), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            }
            qv0.i[] elements3 = new qv0.i[3];
            elements3[0] = model20;
            elements3[1] = model3;
            elements3[c2] = model4;
            Intrinsics.checkNotNullParameter(elements3, "elements");
            collectionG = yp0.b.g(kotlin.collections.d.L(elements3), new ListSubheaderDelegate.Model("INVITATION_DETAILS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.joint_invitee_consent_invitation_details_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            list = listL;
            model2 = model;
            z = z3;
            collectionG = f0.f322471a;
        }
        h hVar2 = h.NOT_REQUIRED;
        if (hVar != hVar2) {
            wi0.b.Companion.getClass();
            listG = yp0.b.g(zhm.u.c(new InputChecklistDelegate.Model("JOINT_CONSENT_CHECKBOX_ID", Intrinsics.f(bVar2, wi0.b.y2) ? new TextLocalisedClause(R$string.joint_consent_closing_permissions_pt_item, null, null, 14) : new TextLocalisedClause(R$string.joint_consent_closing_permissions_item, null, null, 14), hVar == h.AGREED, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248)), new ListSubheaderDelegate.Model("CHECK_BEFORE_PROCEED_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.joint_consent_closing_permissions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            listG = null;
        }
        if (listG == null) {
            listG = f0.f322471a;
        }
        Collection collection = collectionG;
        if (z) {
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
        } else {
            if (!(invitationType instanceof InvitationType.OutgoingInvitation)) {
                throw new NoWhenBranchMatchedException();
            }
            listL2 = yp0.b.g(listL2, new ListSubheaderDelegate.Model("HIGHLIGHTS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.joint_invitee_consent_highlights_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        ArrayList arrayListG = yp0.b.g(list, new ListSubheaderDelegate.Model("DOCUMENTS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.joint_invitee_consent_documents_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp0, LDSFile.EF_DG4_TAG);
        List listL3 = zhm.v.l(model2);
        yp0.b.q(listL3, R$attr.uikit_dp0, i, 0, 0, 12);
        List[] listArr = new List[4];
        listArr[0] = listL2;
        listArr[1] = listG;
        listArr[c2] = arrayListG;
        listArr[3] = listL3;
        ArrayList arrayListE0 = zhm.d0.E0(zhm.w.u(zhm.v.k(listArr)), collection);
        if (z) {
            i2 = 14;
            r112 = 0;
            textLocalisedClause3 = new TextLocalisedClause(R$string.joint_invitee_consent_title, null, null, 14);
        } else {
            i2 = 14;
            r112 = 0;
            if (!(invitationType instanceof InvitationType.OutgoingInvitation)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.joint_consent_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause13 = textLocalisedClause3;
        if (invitationType instanceof InvitationType.OutgoingInvitation) {
            textLocalisedClause4 = new TextLocalisedClause(R$string.joint_inviter_consent_subtitle, r112, r112, i2);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.joint_invitee_consent_subtitle, r112, r112, i2);
        }
        if (z) {
            n38.u uVar = ((InvitationType.IncomingInvitation) invitationType).f76584a.f211939c;
            contactImage = new ContactImage((String) null, (String) null, (String) null, uVar.f211960b, (String) null, uVar.f211959a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 3927);
        } else {
            if (!Intrinsics.f(invitationType, outgoingInvitation)) {
                throw new NoWhenBranchMatchedException();
            }
            contactImage = r112;
        }
        return new q(textLocalisedClause13, textLocalisedClause4, contactImage, textLocalisedClause, textLocalisedClause2, h.AGREED == hVar || hVar2 == hVar, arrayListE0);
    }
}
