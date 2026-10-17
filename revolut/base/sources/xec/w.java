package xec;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import ip0.qd0;
import ip0.vd0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    public w(b itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    public final List a(String str, List list, Set set) {
        RowDelegate.Model model;
        if (list.isEmpty()) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("id_empty_state", new TextLocalisedClause(R$string.revolut_pay_order_summary_tips_missing_shipping_address, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D153", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model2);
        }
        List<ShippingContact> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ShippingContact shippingContact : list2) {
            String str2 = shippingContact.f84740a;
            Address address = shippingContact.f84741b;
            boolean z = !set.contains(str2);
            Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
            nec.a aVar = shippingContact.f84742c;
            String str3 = shippingContact.f84740a;
            int i = a.f304571a[aVar.ordinal()];
            if (i == 1) {
                model = new RowDelegate.Model(shippingContact.f84740a, null, new TextClause(String.valueOf(address.getStreetLine1()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, b.b(shippingContact, z), null, null, 0, b.a(R$drawable.uikit_icn_24_info_outline), true, null, false, null, zhm.u.c(new pc("SHIPPING_CONTACTS_ACCOUNT_ADDRESS_BADGE_ID", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_utilities, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.revolut_pay_shipping_addresses_account_address_badge_title, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), 10), new Color.Solid(R$attr.uikit_colorAccent_30), R$attr.uikit_colorTransparent, null, 1000), null)), null, null, null, null, new c(str3), null, 0, 0, 0, 0, 532640730);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new RowDelegate.Model(shippingContact.f84740a, null, new TextClause(String.valueOf(address.getStreetLine1()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, b.b(shippingContact, z), null, null, 0, b.a(R$drawable.uikit_icn_24_more), true, null, false, null, null, null, null, null, null, new d(str3), null, 0, 0, 0, 0, 532673498);
            }
            RowDelegate.Model model3 = model;
            String strR = a0.d.r(str3, "_selectable");
            qd0 qd0Var = qd0.SELECTED;
            if (!Intrinsics.f(str3, str)) {
                qd0Var = null;
            }
            if (qd0Var == null) {
                qd0Var = qd0.UNSELECTED;
            }
            arrayList.add(new SelectableDelegate.Model(strR, model3, qd0Var, SelectableDelegate.b.c.f53320a, vd0.RADIO, false, null, null, null, false, 32736));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        final e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration = domainState.d;
        String str = domainState.f304581b;
        Data data = domainState.f304580a;
        if (modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) {
            final int i = 0;
            return new m((List) iii.c.f(data, new xd2.n(this, 6), new xce.d(4), new Function3(this) { // from class: xec.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f304603b;

                {
                    this.f304603b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i2 = i;
                    nec.c wrappedShippingContacts = (nec.c) obj2;
                    ((Boolean) obj3).getClass();
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
                            List list = wrappedShippingContacts.f214428a;
                            e eVar = domainState;
                            return this.f304603b.a(eVar.f304581b, list, eVar.f);
                        default:
                            Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
                            List list2 = wrappedShippingContacts.f214428a;
                            return this.f304603b.a(domainState.f304581b, list2, zhm.h0.f322473a);
                    }
                }
            }), new l(new TextLocalisedClause(R$string.revolut_pay_shipping_title, null, null, 14), null), data.getContent() != null ? PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_CONTACT_METHOD_MENU_ITEM_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_new, null, null, 14), null, 60) : null, new k(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_save, null, null, 14), (data.getContent() == null || str == null) ? false : true));
        }
        if (!(modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.UpdatedDefaultContact)) {
            throw new NoWhenBranchMatchedException();
        }
        l lVar = new l(new TextLocalisedClause(R$string.revolut_pay_management_shipping_addresses_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_management_shipping_addresses_subtitle, null, null, 14));
        final int i2 = 1;
        return new m((List) iii.c.f(data, new xd2.n(this, 7), new xce.d(5), new Function3(this) { // from class: xec.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f304603b;

            {
                this.f304603b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i22 = i2;
                nec.c wrappedShippingContacts = (nec.c) obj2;
                ((Boolean) obj3).getClass();
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
                        List list = wrappedShippingContacts.f214428a;
                        e eVar = domainState;
                        return this.f304603b.a(eVar.f304581b, list, eVar.f);
                    default:
                        Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
                        List list2 = wrappedShippingContacts.f214428a;
                        return this.f304603b.a(domainState.f304581b, list2, zhm.h0.f322473a);
                }
            }
        }), lVar, data.getContent() != null ? PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ADD_CONTACT_METHOD_MENU_ITEM_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_new, null, null, 14), null, 60) : null, new k(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_select, null, null, 14), (data.getContent() == null || Intrinsics.f(str, domainState.f304582c)) ? false : true));
    }
}
