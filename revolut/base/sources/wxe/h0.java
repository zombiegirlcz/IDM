package wxe;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.s7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp4.j0;
import wvg.r1;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 implements cli.n {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f300908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f300909b;

    public h0(l80.e dateProvider, je6.h externalInstitutionLogoMapper, sze.d imageFactory) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        this.f300908a = dateProvider;
        this.f300909b = externalInstitutionLogoMapper;
    }

    public static aim.e b() {
        aim.e eVarB = zhm.u.b();
        for (int i = 0; i < 2; i++) {
            int i2 = R$attr.uikit_dp8;
            eVarB.add(new s7("ID_LOADING_METHOD_DETAILS_FIELD_ITEM", i2, i2, 0, 0, false, null, SyslogConstants.LOG_CLOCK));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public final aim.e a(StoredMethod storedMethod) {
        aim.e eVarA;
        List listK;
        Clause moneyClause;
        TextLocalisedClause textLocalisedClause;
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        StoredMethod.AccountDetails accountDetails = storedMethod.f90530b;
        StoredMethod.Mandate mandate = storedMethod.f;
        List list = accountDetails.e;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                ArrayList<StoredMethod.AccountDetails.AccountNumber.Field> arrayList = ((StoredMethod.AccountDetails.AccountNumber) it8.next()).f90535a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (StoredMethod.AccountDetails.AccountNumber.Field field : arrayList) {
                    arrayList2.add(new CellDetailsDelegate.Model(j6.a.q("ID_METHOD_DETAILS_ACCOUNT_ITEM_", field.f90536a), new TextClause(field.f90536a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(field.f90537b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList2);
            }
        }
        if (!eVarB2.isEmpty()) {
            eVarB2.add(0, new ListSubheaderDelegate.Model("ID_ACCOUNT_DETAILS_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_first_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242));
        }
        eVarB.addAll(zhm.u.a(eVarB2));
        StoredMethod.LinkedAccount linkedAccount = storedMethod.d;
        if (linkedAccount != null) {
            aim.e eVarB3 = zhm.u.b();
            eVarB3.add(new ListSubheaderDelegate.Model("ID_LINKED_ACCOUNT_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_linked_section_header, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_header_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53162));
            aim.e eVarB4 = zhm.u.b();
            Instant instant = linkedAccount.d;
            boolean z = instant != null && instant.isBefore(((l80.f) this.f300908a).b());
            dj0.d dVar = linkedAccount.f90543c;
            if (dVar != null) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.topup_stored_account_details_linked_section_current_balance, null, null, 14);
                if (z) {
                    moneyClause = new TextLocalisedClause(R$string.open_banking_external_account_details_linked_section_revoked_balance, null, null, 14);
                    textLocalisedClause = textLocalisedClause2;
                } else {
                    textLocalisedClause = textLocalisedClause2;
                    moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4);
                }
                eVarB4.add(new CellDetailsDelegate.Model("ID_LINKED_ACCOUNT_ITEM_BALANCE", textLocalisedClause, moneyClause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            }
            Object model = (instant == null || !z) ? instant != null ? new CellDetailsDelegate.Model("ID_LINKED_ACCOUNT_ITEM_VALID_UNTIL", new TextLocalisedClause(R$string.topup_stored_account_details_linked_section_valid_until, null, null, 14), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null : new CellDetailsActionDelegate.Model("ID_LINKED_ACCOUNT_ITEM_VALID_UNTIL", new TextLocalisedClause(R$string.topup_stored_account_details_linked_section_valid_until, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.topup_stored_account_details_linked_section_renew, null, null, 14), false, false, null, null, 0, 0, 32736);
            if (model != null) {
                eVarB4.add(model);
            }
            aim.e eVarA2 = zhm.u.a(eVarB4);
            yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
            eVarB3.addAll(eVarA2);
            eVarB.addAll(zhm.u.a(eVarB3));
        }
        if (mandate != null) {
            if (mandate instanceof StoredMethod.Mandate.OpenBanking) {
                StoredMethod.Mandate.OpenBanking openBanking = (StoredMethod.Mandate.OpenBanking) mandate;
                aim.e eVarB5 = zhm.u.b();
                eVarB5.add(new ListSubheaderDelegate.Model("ID_MANDATE_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_header, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_header_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53162));
                aim.e eVarB6 = zhm.u.b();
                if (openBanking.f90545b) {
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_max_per_transfer, null, null, 14);
                    dj0.d dVar2 = openBanking.f90546c;
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.SENSITIVE;
                    listK = zhm.v.k(new CellDetailsActionDelegate.Model("ID_MANDATE_ITEM_SINGLE_TRANSFER_LIMIT", textLocalisedClause3, 0, new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar2, defaults, null, o9Var, 4), false, false, null, null, 0, 0, 32736), new CellDetailsActionDelegate.Model("ID_MANDATE_ITEM_MONTHLY_LIMIT", new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_max_per_month, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(openBanking.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), false, false, null, null, 0, 0, 32736));
                } else {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_max_per_transfer, null, null, 14);
                    dj0.d dVar3 = openBanking.f90546c;
                    MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var2 = o9.SENSITIVE;
                    listK = zhm.v.k(new CellDetailsDelegate.Model("ID_MANDATE_ITEM_SINGLE_TRANSFER_LIMIT", textLocalisedClause4, new MoneyClause(dVar3, defaults2, null, o9Var2, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("ID_MANDATE_ITEM_MONTHLY_LIMIT", new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_max_per_month, null, null, 14), new MoneyClause(openBanking.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var2, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                }
                eVarB6.addAll(listK);
                eVarB6.add(new CellDetailsDelegate.Model("ID_MANDATE_ITEM_AMOUNT_REMAINING", new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_amount_remaining, null, null, 14), new MoneyClause(openBanking.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                eVarB6.add(new CellDetailsDelegate.Model("ID_MANDATE_ITEM_VALID_UNTIL", new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_valid_until, null, null, 14), new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_further_notice, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                aim.e eVarA3 = zhm.u.a(eVarB6);
                yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
                eVarB5.addAll(eVarA3);
                eVarA = zhm.u.a(eVarB5);
            } else {
                if (!(mandate instanceof StoredMethod.Mandate.PayTo)) {
                    throw new NoWhenBranchMatchedException();
                }
                aim.e eVarB7 = zhm.u.b();
                eVarB7.add(new ListSubheaderDelegate.Model("ID_MANDATE_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.payto_linked_method_detail_payment_details_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242));
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_MANDATE_ITEM_SINGLE_TRANSFER_LIMIT", new TextLocalisedClause(R$string.topup_stored_account_details_vrp_section_max_per_transfer, null, null, 14), new MoneyClause(((StoredMethod.Mandate.PayTo) mandate).f90549c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32752);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB7.add(model2);
                eVarA = zhm.u.a(eVarB7);
            }
            eVarB.addAll(eVarA);
        }
        aim.e eVarB8 = zhm.u.b();
        if (Intrinsics.f(storedMethod.e, Boolean.TRUE) && mandate == null) {
            RowDelegate.Model model3 = new RowDelegate.Model("ID_ONE_TAP_PAYMENTS_ACTION", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lightning, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(R$string.topup_stored_account_details_vrp_promo_section_cell_title, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB8.add(model3);
        }
        if (mandate instanceof StoredMethod.Mandate.PayTo) {
            RowDelegate.Model model4 = new RowDelegate.Model("ID_AUTO_TOP_UP_PAYMENTS_ACTION", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_auto_topup, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.apm.payto.api.R$string.payto_linked_method_detail_auto_add_money_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.apm.payto.api.R$string.payto_linked_method_detail_auto_add_money_description, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            eVarB8.add(model4);
        }
        if (!eVarB8.isEmpty()) {
            eVarB8.add(0, new ListSubheaderDelegate.Model("ID_MORE_FEATURES_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_stored_account_details_vrp_promo_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242));
        }
        eVarB.addAll(zhm.u.a(eVarB8));
        CellDetailsChevronDelegate.Model model5 = new CellDetailsChevronDelegate.Model("ID_REMOVE_ACTION", new TextLocalisedClause(R.string.common_action_remove, null, null, 14), R$attr.uikit_colorStatusDanger, false, null, null, null, 2032);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model5);
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e0) iii.c.f(domainState.f300910a, new r1(this, 23), new wug.k(this, 22), new j0(this, 13));
    }
}
