package lk6;

import android.os.Parcelable;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import ip0.ck0;
import ip0.yj0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ljl.n1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements cli.n {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f196241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f196242b;

    public f0(b brazilPaymentItemsMapper, je6.h institutionLogoMapper) {
        Intrinsics.checkNotNullParameter(brazilPaymentItemsMapper, "brazilPaymentItemsMapper");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f196241a = brazilPaymentItemsMapper;
        this.f196242b = institutionLogoMapper;
    }

    public static TextDelegate.Model a(int i) {
        return new TextDelegate.Model("DISCLAIMER_TEXT_LIST_ID", new TextLocalisedClause(i, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    public final aim.e b(OpenBankingBrazilPayment openBankingBrazilPayment, io3.d dVar, Boolean bool, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2, OpenBankingBrazilPayment.EditableDateField editableDateField) throws Throwable {
        Throwable th10;
        List list;
        TextLocalisedClause textLocalisedClause;
        ArrayList arrayList;
        int i;
        int i2;
        CellDetailsDelegate.Model modelG;
        CellDetailsDelegate.Model model;
        int i3;
        Object obj2;
        f0 f0Var = this;
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField3 = editableMoneyField;
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField4 = editableMoneyField2;
        OpenBankingBrazilPayment.EditableDateField editableDateField2 = editableDateField;
        aim.e eVarB = zhm.u.b();
        Intrinsics.checkNotNullParameter(openBankingBrazilPayment, "openBankingBrazilPayment");
        aim.e eVarB2 = zhm.u.b();
        ThirdPartyBrazil thirdPartyBrazil = openBankingBrazilPayment.i;
        og6.h hVar = openBankingBrazilPayment.f72395b;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(((di6.a) f0Var.f196242b).c(thirdPartyBrazil.f73115a), null, null, false, null, false, 60);
        TextClause textClause = new TextClause(thirdPartyBrazil.f73116b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(openBankingBrazilPayment.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dj0.d dVar2 = openBankingBrazilPayment.f;
        Throwable th11 = null;
        RowDelegate.Model model2 = new RowDelegate.Model("ID_MERCHANT_ITEM", image40, textClause, null, 0, textClause2, null, null, 0, dVar2 != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(model2);
        if (dVar != null) {
            eVarB2.add(new ListSubheaderDelegate.Model("ID_PAYMENT_FROM_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_sections_account_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        }
        if (dVar != null) {
            long j2 = dVar.i;
            String str = dVar.f163147c;
            CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            CurrencyClause currencyClause = new CurrencyClause(new xi0.b(6, str, null), null, null, 6);
            xi0.b.Companion.getClass();
            RowDelegate.Model model3 = new RowDelegate.Model("ID_PAYMENT_POCKET_ITEM", currencyImage, null, null, currencyClause, new MoneyClause(new dj0.d(j2, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(model3);
        }
        OpenBankingBrazilPayment.PaymentInformation paymentInformation = openBankingBrazilPayment.f72397g;
        if (paymentInformation == null || (list = paymentInformation.f72409a) == null) {
            th10 = null;
        } else {
            int i5 = e0.f196240a[hVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_information_header, null, null, 14);
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_account_information_header, null, null, 14);
            }
            eVarB2.add(new ListSubheaderDelegate.Model("ID_PAYMENT_INFORMATION_SUBHEADER", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
            List list2 = list;
            int i6 = 10;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            int i21 = 0;
            for (Object obj3 : list2) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    Throwable th12 = th11;
                    zhm.v.s();
                    throw th12;
                }
                ArrayList arrayList3 = ((OpenBankingBrazilPayment.InfoGroup) obj3).f72405a;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i6));
                int i32 = 0;
                for (Object obj4 : arrayList3) {
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    OpenBankingBrazilPayment.Item item = (OpenBankingBrazilPayment.Item) obj4;
                    OpenBankingBrazilPayment.EditableMoneyField editableMoneyField5 = item.f72408c;
                    OpenBankingBrazilPayment.EditableDateField editableDateField3 = item.d;
                    b bVar = f0Var.f196241a;
                    if (editableMoneyField5 != null) {
                        String str2 = editableMoneyField5.f72402a;
                        if (Intrinsics.f(str2, editableMoneyField3 != null ? editableMoneyField3.f72402a : null)) {
                            i3 = i21;
                            obj2 = null;
                            i = 10;
                            modelG = bVar.a(a0.d.g(i21, i32, "ID_INFO_GROUP", "_"), editableMoneyField3.f72402a, item.f72406a, editableMoneyField3.d, editableMoneyField3);
                            arrayList = arrayList4;
                        } else {
                            i3 = i21;
                            ArrayList arrayList5 = arrayList4;
                            obj2 = null;
                            i = 10;
                            if (Intrinsics.f(str2, editableMoneyField4 != null ? editableMoneyField4.f72402a : null)) {
                                String strG = a0.d.g(i3, i32, "ID_INFO_GROUP", "_");
                                String str3 = item.f72406a;
                                dj0.d dVar3 = editableMoneyField4.d;
                                String str4 = editableMoneyField4.f72402a;
                                OpenBankingBrazilPayment.EditableMoneyField editableMoneyField6 = editableMoneyField4;
                                arrayList = arrayList5;
                                modelG = bVar.a(strG, str4, str3, dVar3, editableMoneyField6);
                            } else {
                                arrayList = arrayList5;
                                hx7.e.h(new IllegalStateException(j6.a.q("Editable field id should match any editable field in domain state ", item.f72408c.f72402a)));
                                i2 = i3;
                                model = null;
                                modelG = model;
                            }
                        }
                        i2 = i3;
                    } else {
                        arrayList = arrayList4;
                        i = 10;
                        if (editableDateField3 != null) {
                            String str5 = editableDateField3.f72400a;
                            model = null;
                            if (Intrinsics.f(str5, editableDateField2 != null ? editableDateField2.f72400a : null)) {
                                String listId = a0.d.g(i21, i32, "ID_INFO_GROUP", "_");
                                String editableItemId = editableDateField2.f72400a;
                                String title = item.f72406a;
                                LocalDate localDate = editableDateField2.f72401b;
                                Intrinsics.checkNotNullParameter(listId, "listId");
                                Intrinsics.checkNotNullParameter(editableItemId, "editableItemId");
                                Intrinsics.checkNotNullParameter(title, "title");
                                OpenBankingBrazilPayment.EditableDateField editableDateField4 = editableDateField2;
                                i2 = i21;
                                modelG = ((hj6.a) bVar.f196229a).b(listId, editableItemId, title, localDate, editableDateField4);
                            } else {
                                i2 = i21;
                                hx7.e.h(new IllegalStateException(j6.a.q("Editable date id should match any editable field in domain state ", str5)));
                                modelG = model;
                            }
                        } else {
                            i2 = i21;
                            String listId2 = a0.d.g(i2, i32, "ID_INFO_GROUP", "_");
                            String title2 = item.f72406a;
                            String endText = item.f72407b;
                            Intrinsics.checkNotNullParameter(listId2, "listId");
                            Intrinsics.checkNotNullParameter(title2, "title");
                            Intrinsics.checkNotNullParameter(endText, "endText");
                            modelG = ((hj6.a) bVar.f196229a).g(listId2, title2, endText);
                        }
                    }
                    arrayList.add(modelG);
                    f0Var = this;
                    editableMoneyField3 = editableMoneyField;
                    arrayList4 = arrayList;
                    i21 = i2;
                    i6 = i;
                    i32 = i33;
                    editableMoneyField4 = editableMoneyField2;
                    editableDateField2 = editableDateField;
                }
                ArrayList arrayListZ = zhm.d0.Z(arrayList4);
                yp0.b.k(arrayListZ, 0, 0, 0, 0, 31);
                arrayList2.add(arrayListZ);
                f0Var = this;
                th11 = null;
                editableMoneyField3 = editableMoneyField;
                editableMoneyField4 = editableMoneyField2;
                editableDateField2 = editableDateField;
                i21 = i22;
            }
            th10 = th11;
            eVarB2.addAll(zhm.w.u(arrayList2));
        }
        eVarB.addAll(zhm.u.a(eVarB2));
        int i43 = e0.f196240a[hVar.ordinal()];
        if (i43 != 1) {
            if (i43 == 2) {
                if (bool != null) {
                    ?? r132 = th10;
                    CellDetailsSwitcherDelegate.Model model4 = new CellDetailsSwitcherDelegate.Model("ENABLE_NOTIFICATIONS_LIST_ID", new TextLocalisedClause(R$string.open_finance_payment_authorization_notify_before_payment, r132, r132, 14), bool.booleanValue(), true, R$drawable.uikit_icn_16_info_outline, null, null, null, 4064);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model4);
                }
                eVarB.add(a(R$string.pix_authorisation_request_legal_disclaimer));
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eVarB.add(a(R$string.open_finance_authorization_details_global_pix_limits_footer));
            }
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        Long l2;
        Data data;
        String str;
        String str2;
        final i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data2 = domainState.f196244b;
        Data data3 = domainState.f196243a;
        if (data2 == null) {
            final int i = 0;
            list = (List) iii.c.f(data3, new n1(this, 6), new l9j.j(28), new Function3(this) { // from class: lk6.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f0 f196238b;

                {
                    this.f196238b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i) {
                        case 0:
                            OpenBankingBrazilPayment payment = (OpenBankingBrazilPayment) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(payment, "payment");
                            i iVar = domainState;
                            return this.f196238b.b(payment, null, iVar.f196245c, iVar.d, iVar.e, iVar.f);
                        default:
                            Pair pair = (Pair) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) pair.f186385a;
                            io3.d dVar = (io3.d) pair.f186386b;
                            i iVar2 = domainState;
                            return this.f196238b.b(openBankingBrazilPayment, dVar, iVar2.f196245c, iVar2.d, iVar2.e, iVar2.f);
                    }
                }
            });
        } else {
            final int i2 = 1;
            list = (List) iii.c.f(t1.t(data3, data2), new n1(this, 7), new l9j.j(29), new Function3(this) { // from class: lk6.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f0 f196238b;

                {
                    this.f196238b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i2) {
                        case 0:
                            OpenBankingBrazilPayment payment = (OpenBankingBrazilPayment) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(payment, "payment");
                            i iVar = domainState;
                            return this.f196238b.b(payment, null, iVar.f196245c, iVar.d, iVar.e, iVar.f);
                        default:
                            Pair pair = (Pair) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) pair.f186385a;
                            io3.d dVar = (io3.d) pair.f186386b;
                            i iVar2 = domainState;
                            return this.f196238b.b(openBankingBrazilPayment, dVar, iVar2.f196245c, iVar2.d, iVar2.e, iVar2.f);
                    }
                }
            });
        }
        OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) data3.getContent();
        Clause textLocalisedClause = null;
        TextClause textClause = (openBankingBrazilPayment == null || (str2 = openBankingBrazilPayment.f72396c) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        OpenBankingBrazilPayment openBankingBrazilPayment2 = (OpenBankingBrazilPayment) data3.getContent();
        if (openBankingBrazilPayment2 != null && (str = openBankingBrazilPayment2.f72399j) != null) {
            textLocalisedClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (openBankingBrazilPayment2 != null && (l2 = openBankingBrazilPayment2.f72398h) != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.pix_authorisation_request_request_expiration_format, zhm.u.c(new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), null, 12);
        }
        boolean z = true;
        if (!data3.getLoading() && ((data = domainState.f196244b) == null || !data.getLoading())) {
            z = false;
        }
        return new r(list, textClause, textLocalisedClause, z);
    }
}
