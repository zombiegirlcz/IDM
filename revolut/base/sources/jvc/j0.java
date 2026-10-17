package jvc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final otc.b f178836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f178837b;

    public j0(otc.b securityHubType, c securityHubItemsProvider) {
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(securityHubItemsProvider, "securityHubItemsProvider");
        this.f178836a = securityHubType;
        this.f178837b = securityHubItemsProvider;
    }

    public static ActionsView.Item a() {
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        return new ActionsView.Item("HEADER_LOST_DEVICE_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.security_hub_lost_device, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_smartphone_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, eVar, mVar, false, str, f, null, null, 32670);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        RowDelegate.Model modelA;
        List listA;
        List listL;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f178828h;
        List list2 = domainState.f178827g;
        boolean z3 = domainState.f178824a;
        qtc.t tVar = domainState.f178826c;
        boolean z4 = domainState.i;
        boolean z6 = domainState.f178830l;
        boolean z11 = domainState.f178831m;
        boolean z12 = domainState.f178832n;
        boolean z29 = domainState.o;
        l71.d dVar = domainState.f178833p;
        a params = new a(z3, tVar, z4, z6, z11, z12, z29, dVar);
        c cVar = this.f178837b;
        lvc.c cVar2 = cVar.f178815c;
        Intrinsics.checkNotNullParameter(params, "params");
        otc.b bVar = cVar.f178813a;
        int i = b.f178809a[bVar.ordinal()];
        if (i == 1) {
            aim.e eVarB = zhm.u.b();
            RowDelegate.Model[] elements = {tVar instanceof qtc.s ? cVar2.a(tVar, bVar) : null, z29 ? c.a(cVar, "HIDDEN_ACCOUNTS_AND_TRANSACTIONS_CELL_ID", R$string.security_hub_home_hidden_accounts_and_transactions_title, R$drawable.uikit_icn_24_eye_hide) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL2 = kotlin.collections.d.L(elements);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            eVarB.addAll(listL2);
            RowDelegate.Model[] elements2 = {c.a(cVar, "CARD_SECURITY_ID", R$string.card_card_security_card_list_title, R$drawable.uikit_icn_24_card_shield), c.a(cVar, "LINKED_WALLETS_CELL_ID", z4 ? R$string.security_hub_home_card_connections : R$string.security_hub_home_linked_wallets_title, R$drawable.uikit_icn_24_link), c.a(cVar, "MANAGE_MERCHANTS_CELL_ID", R$string.security_hub_home_payments, R$drawable.uikit_icn_24_transfers), z3 ? c.a(cVar, "TRANSACTIONS_LIMITS_CELL_ID", R$string.security_hub_home_transaction_limit_title, R$drawable.uikit_icn_24_limit) : null, c.a(cVar, "PAYEES_CELL_ID", R$string.security_hub_home_payees, R$drawable.uikit_icn_24_phone_book), !z29 ? c.a(cVar, "HIDDEN_TRANSACTIONS_CELL_ID", R$string.security_hub_home_hidden_transactions_title, R$drawable.uikit_icn_24_eye_hide) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL3 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL3, 0, 0, 0, 0, 31);
            eVarB.addAll(listL3);
            RowDelegate.Model modelA2 = z12 ? c.a(cVar, "PRIVACY_CELL_ID", R.string.security_hub_home_privacy, R$drawable.uikit_icn_24_eye_hide) : null;
            RowDelegate.Model modelA3 = z11 ? c.a(cVar, "CALL_DETECTION_CELL_ID", R$string.security_hub_home_call_detection, R$drawable.uikit_icn_24_call) : null;
            RowDelegate.Model modelA4 = c.a(cVar, "SIGN_IN_METHODS_CELL_ID", R$string.security_hub_home_sign_in_and_passcode, R$drawable.uikit_icn_24_key);
            RowDelegate.Model modelA5 = c.a(cVar, "DEVICES_CELL_ID", R$string.security_hub_home_devices_title, R$drawable.uikit_icn_24_smartphone);
            if (dVar != null) {
                z = true;
                if (l71.f.e(dVar)) {
                    modelA = c.a(cVar, "LINKED_ACCOUNTS_CELL_ID", R$string.security_hub_home_linked_accounts, R$drawable.uikit_icn_24_marketplace);
                }
                RowDelegate.Model[] elements3 = {modelA2, modelA3, modelA4, modelA5, modelA};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL4 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL4, 0, 0, 0, 0, 31);
                eVarB.addAll(listL4);
                RowDelegate.Model modelA6 = c.a(cVar, "LEARN_MORE_ABOUT_FRAUD_CELL_ID", R$string.security_hub_home_learn_about_fraud, R$drawable.uikit_icn_24_lightbulb);
                yp0.b.l(modelA6, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelA6);
                listA = zhm.u.a(eVarB);
            } else {
                z = true;
            }
            modelA = (dVar == null || l71.f.a(dVar) != z) ? !((o8b.c) cVar.f178814b).g() ? c.a(cVar, "CONNECTED_APPS_CELL_ID", R$string.security_hub_home_connected_apps_and_services, R$drawable.uikit_icn_24_marketplace) : null : c.a(cVar, "CONNECTED_APPS_CELL_ID", com.revolut.feature.profile.api.R$string.profileHome_settings_item_open_finance_title, R$drawable.uikit_icn_24_marketplace);
            RowDelegate.Model[] elements32 = {modelA2, modelA3, modelA4, modelA5, modelA};
            Intrinsics.checkNotNullParameter(elements32, "elements");
            List listL42 = kotlin.collections.d.L(elements32);
            yp0.b.k(listL42, 0, 0, 0, 0, 31);
            eVarB.addAll(listL42);
            RowDelegate.Model modelA62 = c.a(cVar, "LEARN_MORE_ABOUT_FRAUD_CELL_ID", R$string.security_hub_home_learn_about_fraud, R$drawable.uikit_icn_24_lightbulb);
            yp0.b.l(modelA62, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelA62);
            listA = zhm.u.a(eVarB);
        } else if (i == 2) {
            aim.e eVarB2 = zhm.u.b();
            if (tVar instanceof qtc.s) {
                RowDelegate.Model modelA7 = cVar2.a(tVar, bVar);
                yp0.b.l(modelA7, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(modelA7);
            }
            aim.e eVarB3 = zhm.u.b();
            if (z12) {
                eVarB3.add(c.a(cVar, "PRIVACY_CELL_ID", R.string.security_hub_home_privacy, R$drawable.uikit_icn_24_eye_hide));
            }
            RowDelegate.Model[] elements4 = {c.a(cVar, "SIGN_IN_METHODS_CELL_ID", R$string.security_hub_home_sign_in_and_passcode, R$drawable.uikit_icn_24_key), c.a(cVar, "DEVICES_CELL_ID", R$string.security_hub_home_devices_title, R$drawable.uikit_icn_24_smartphone), ((jte.d) cVar.d).c(RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps.f104445c) ? c.a(cVar, "CONNECTED_APPS_CELL_ID", R$string.security_hub_home_connected_apps_and_services, R$drawable.uikit_icn_24_marketplace) : null};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            eVarB3.addAll(kotlin.collections.d.L(elements4));
            if (!z6) {
                eVarB3.add(c.a(cVar, "TRUSTED_ENTITIES_CELL_ID", R$string.security_hub_home_trusted_entities, R$drawable.uikit_icn_24_secure_seal));
            }
            aim.e eVarA = zhm.u.a(eVarB3);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB2.addAll(eVarA);
            listA = zhm.u.a(eVarB2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listA = zhm.v.k(c.a(cVar, "SIGN_IN_METHODS_CELL_ID", R$string.security_hub_home_sign_in_and_passcode, R$drawable.uikit_icn_24_key), c.a(cVar, "DEVICES_CELL_ID", R$string.security_hub_home_devices_title, R$drawable.uikit_icn_24_smartphone));
            yp0.b.k(listA, 0, 0, 0, 0, 31);
        }
        List[] elements5 = {list, list2, listA};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements5));
        boolean zIsEmpty = domainState.d.isEmpty();
        int i2 = i0.f178834a[this.f178836a.ordinal()];
        if (i2 == 1) {
            Parcelable parcelable = null;
            int i3 = 32670;
            mx0.d dVar2 = null;
            boolean z31 = false;
            e4 e4Var = null;
            Clause clause = null;
            Image image = null;
            mx0.e eVar = null;
            ms0.m mVar = null;
            boolean z41 = false;
            String str = null;
            Float f = null;
            Object obj2 = null;
            ActionsView.Item[] elements6 = {new ActionsView.Item("HEADER_REPORT_FRAUD_ACTION_ID", dVar2, z31, e4Var, clause, new TextLocalisedClause(R$string.security_hub_report_fraud, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_megaphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), image, eVar, mVar, z41, str, f, obj2, parcelable, i3), zIsEmpty ? null : new ActionsView.Item("HEADER_LOST_CARD_ACTION_ID", dVar2, z31, e4Var, clause, new TextLocalisedClause(R$string.security_hub_lost_card, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), image, eVar, mVar, z41, str, f, obj2, parcelable, i3), a()};
            Intrinsics.checkNotNullParameter(elements6, "elements");
            listL = kotlin.collections.d.L(elements6);
        } else if (i2 == 2) {
            listL = zhm.u.c(a());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listL = zhm.f0.f322471a;
        }
        Boolean bool = domainState.k;
        return new b0(arrayListU, listL, bool != null ? bool.booleanValue() : false);
    }
}
