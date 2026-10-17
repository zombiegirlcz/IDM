package bk6;

import android.os.Parcelable;
import aw0.o9;
import bb2.t;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$plurals;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilConsentsGroup;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.BrazilConsentGroupParcel;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f16279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f16280b;

    public q(je6.h institutionLogoMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        this.f16279a = transactionsListMapper;
        this.f16280b = institutionLogoMapper;
    }

    public static List a(int i, int i2) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final ArrayList b(List list, og6.i iVar, String str) {
        List<OpenBankingBrazilConsentsGroup> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (OpenBankingBrazilConsentsGroup openBankingBrazilConsentsGroup : list2) {
            ThirdPartyBrazil thirdPartyBrazil = openBankingBrazilConsentsGroup.f72386a;
            arrayList.add(new RowDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(str, "_", thirdPartyBrazil.f73116b), new RowDelegate.Model.MainImage.Image40(((di6.a) this.f16280b).c(thirdPartyBrazil.f73115a), null, null, false, null, false, 60), new TextClause(thirdPartyBrazil.f73116b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedQuantityClause(R$plurals.consent_number_of_consents_format, Integer.valueOf(openBankingBrazilConsentsGroup.f72387b.size()), (List) null, (Style) null, 28), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, new BrazilConsentGroupParcel(thirdPartyBrazil, iVar), null, 0, 0, 0, 0, 532675544));
        }
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = p.f16278a[domainState.f16268a.ordinal()];
        if (i == 1) {
            final int i2 = 2;
            list = (List) iii.c.f(domainState.f16269b, new bjg.c(10), new n(0), new Function3(this) { // from class: bk6.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f16276b;

                {
                    this.f16276b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i2) {
                        case 0:
                            og6.a content = (og6.a) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            ArrayList arrayList = content.f225035a;
                            og6.i iVar = og6.i.OUTBOUND_PAYMENT_AUTHORIZATION;
                            q qVar = this.f16276b;
                            ArrayList arrayListB = qVar.b(arrayList, iVar, "OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            List list2 = content.f225037c;
                            if (list2 == null) {
                                list2 = f0.f322471a;
                            }
                            ArrayList arrayListB2 = qVar.b(list2, og6.i.INBOUND_TOP_UP_AUTHORIZATION, "INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            ArrayList arrayListE0 = d0.E0(content.f225036b ? u.c(new RowDelegate.Model("PIX_AUTOMATICO_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_pix, null, R$attr.uikit_colorWhite, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(R$string.open_finance_pix_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_finance_pix_automatico_subtitle, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)) : f0.f322471a, arrayListB);
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayListE0.isEmpty()) {
                                a0.x(yp0.b.g(arrayListE0, new ListSubheaderDelegate.Model("OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_outbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            if (!arrayListB2.isEmpty()) {
                                a0.x(yp0.b.g(arrayListB2, new ListSubheaderDelegate.Model("INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_inbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                            return arrayList3 == null ? q.a(R$string.open_finance_payments_no_auth_title, R$string.open_finance_payments_no_auth_subtitle) : arrayList3;
                        case 1:
                            og6.g content2 = (og6.g) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            ArrayList<OpenBankingBrazilLinkedAccountsGroup> arrayList4 = content2.f225046a;
                            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                            for (OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup : arrayList4) {
                                String str = openBankingBrazilLinkedAccountsGroup.f72390a.f73116b;
                                arrayList5.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(((di6.a) this.f16276b.f16280b).c(openBankingBrazilLinkedAccountsGroup.f72390a.f73115a), null, null, false, null, false, 60), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedQuantityClause(R$plurals.linked_account_number_of_accounts_format, Integer.valueOf(openBankingBrazilLinkedAccountsGroup.f72391b.size()), (List) null, (Style) null, 28), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, openBankingBrazilLinkedAccountsGroup.f72390a, null, 0, 0, 0, 0, 532675544));
                            }
                            ArrayList arrayListG = arrayList5.isEmpty() ? null : yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("LINKED_ACCOUNTS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_linked_accounts_shared_data, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                            return arrayListG == null ? q.a(R$string.open_finance_linked_accounts_no_auth_title, R$string.open_finance_linked_accounts_no_auth_subtitle) : arrayListG;
                        default:
                            whf.p content3 = (whf.p) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content3, "content");
                            return ((anf.w) this.f16276b.f16279a).c(content3, new whf.l(0), new whf.i(false));
                    }
                }
            });
        } else if (i == 2) {
            final int i3 = 0;
            list = (List) iii.c.f(domainState.f16270c, new bjg.c(8), new t(28), new Function3(this) { // from class: bk6.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f16276b;

                {
                    this.f16276b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i3) {
                        case 0:
                            og6.a content = (og6.a) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            ArrayList arrayList = content.f225035a;
                            og6.i iVar = og6.i.OUTBOUND_PAYMENT_AUTHORIZATION;
                            q qVar = this.f16276b;
                            ArrayList arrayListB = qVar.b(arrayList, iVar, "OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            List list2 = content.f225037c;
                            if (list2 == null) {
                                list2 = f0.f322471a;
                            }
                            ArrayList arrayListB2 = qVar.b(list2, og6.i.INBOUND_TOP_UP_AUTHORIZATION, "INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            ArrayList arrayListE0 = d0.E0(content.f225036b ? u.c(new RowDelegate.Model("PIX_AUTOMATICO_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_pix, null, R$attr.uikit_colorWhite, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(R$string.open_finance_pix_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_finance_pix_automatico_subtitle, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)) : f0.f322471a, arrayListB);
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayListE0.isEmpty()) {
                                a0.x(yp0.b.g(arrayListE0, new ListSubheaderDelegate.Model("OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_outbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            if (!arrayListB2.isEmpty()) {
                                a0.x(yp0.b.g(arrayListB2, new ListSubheaderDelegate.Model("INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_inbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                            return arrayList3 == null ? q.a(R$string.open_finance_payments_no_auth_title, R$string.open_finance_payments_no_auth_subtitle) : arrayList3;
                        case 1:
                            og6.g content2 = (og6.g) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            ArrayList<OpenBankingBrazilLinkedAccountsGroup> arrayList4 = content2.f225046a;
                            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                            for (OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup : arrayList4) {
                                String str = openBankingBrazilLinkedAccountsGroup.f72390a.f73116b;
                                arrayList5.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(((di6.a) this.f16276b.f16280b).c(openBankingBrazilLinkedAccountsGroup.f72390a.f73115a), null, null, false, null, false, 60), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedQuantityClause(R$plurals.linked_account_number_of_accounts_format, Integer.valueOf(openBankingBrazilLinkedAccountsGroup.f72391b.size()), (List) null, (Style) null, 28), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, openBankingBrazilLinkedAccountsGroup.f72390a, null, 0, 0, 0, 0, 532675544));
                            }
                            ArrayList arrayListG = arrayList5.isEmpty() ? null : yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("LINKED_ACCOUNTS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_linked_accounts_shared_data, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                            return arrayListG == null ? q.a(R$string.open_finance_linked_accounts_no_auth_title, R$string.open_finance_linked_accounts_no_auth_subtitle) : arrayListG;
                        default:
                            whf.p content3 = (whf.p) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content3, "content");
                            return ((anf.w) this.f16276b.f16279a).c(content3, new whf.l(0), new whf.i(false));
                    }
                }
            });
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            final int i5 = 1;
            list = (List) iii.c.f(domainState.d, new bjg.c(9), new t(29), new Function3(this) { // from class: bk6.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f16276b;

                {
                    this.f16276b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i5) {
                        case 0:
                            og6.a content = (og6.a) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            ArrayList arrayList = content.f225035a;
                            og6.i iVar = og6.i.OUTBOUND_PAYMENT_AUTHORIZATION;
                            q qVar = this.f16276b;
                            ArrayList arrayListB = qVar.b(arrayList, iVar, "OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            List list2 = content.f225037c;
                            if (list2 == null) {
                                list2 = f0.f322471a;
                            }
                            ArrayList arrayListB2 = qVar.b(list2, og6.i.INBOUND_TOP_UP_AUTHORIZATION, "INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID");
                            ArrayList arrayListE0 = d0.E0(content.f225036b ? u.c(new RowDelegate.Model("PIX_AUTOMATICO_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_pix, null, R$attr.uikit_colorWhite, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(R$string.open_finance_pix_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_finance_pix_automatico_subtitle, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)) : f0.f322471a, arrayListB);
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayListE0.isEmpty()) {
                                a0.x(yp0.b.g(arrayListE0, new ListSubheaderDelegate.Model("OUTBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_outbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            if (!arrayListB2.isEmpty()) {
                                a0.x(yp0.b.g(arrayListB2, new ListSubheaderDelegate.Model("INBOUND_AUTHORIZATIONS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_payments_inbound_authorizations, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
                            }
                            ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                            return arrayList3 == null ? q.a(R$string.open_finance_payments_no_auth_title, R$string.open_finance_payments_no_auth_subtitle) : arrayList3;
                        case 1:
                            og6.g content2 = (og6.g) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            ArrayList<OpenBankingBrazilLinkedAccountsGroup> arrayList4 = content2.f225046a;
                            ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                            for (OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup : arrayList4) {
                                String str = openBankingBrazilLinkedAccountsGroup.f72390a.f73116b;
                                arrayList5.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(((di6.a) this.f16276b.f16280b).c(openBankingBrazilLinkedAccountsGroup.f72390a.f73115a), null, null, false, null, false, 60), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedQuantityClause(R$plurals.linked_account_number_of_accounts_format, Integer.valueOf(openBankingBrazilLinkedAccountsGroup.f72391b.size()), (List) null, (Style) null, 28), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, openBankingBrazilLinkedAccountsGroup.f72390a, null, 0, 0, 0, 0, 532675544));
                            }
                            ArrayList arrayListG = arrayList5.isEmpty() ? null : yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("LINKED_ACCOUNTS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_finance_linked_accounts_shared_data, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                            return arrayListG == null ? q.a(R$string.open_finance_linked_accounts_no_auth_title, R$string.open_finance_linked_accounts_no_auth_subtitle) : arrayListG;
                        default:
                            whf.p content3 = (whf.p) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content3, "content");
                            return ((anf.w) this.f16276b.f16279a).c(content3, new whf.l(0), new whf.i(false));
                    }
                }
            });
        }
        List list2 = list;
        return new j(new TextLocalisedClause(R$string.open_finance_pix_subtitle, null, null, 14), d0.E0(list2, u.c(new TabsDelegate.Model("OPEN_FINANCE_TABS_LIST_ID", v.k(new com.revolut.core.ui_kit.views.q("TRANSACTIONS", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.open_finance_pix_tabs_all_payments, null, null, 14)), 58), new com.revolut.core.ui_kit.views.q("AUTHORIZATIONS", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.open_finance_pix_tabs_authorizations, null, null, 14)), 58), new com.revolut.core.ui_kit.views.q("LINKED_ACCOUNTS", new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(R$string.open_finance_pix_tabs_linked_accounts, null, null, 14)), 58)), domainState.f16268a.name(), null, null, null, 0, 0, null, 8184))));
    }
}
