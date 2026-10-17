package ka2;

import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.payid.api.R$string;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import whf.j;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f182409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f182410b;

    public x(lx1.i apmRecipientMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f182409a = apmRecipientMapper;
        this.f182410b = transactionsListMapper;
    }

    public static LayeredImage a(int i) {
        return new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_56_oval_background, Integer.valueOf(R$attr.uikit_colorGrey2_20), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, (Integer) null, 12.0f, 12.0f, 12.0f, 12.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 66)), (Float) null, (Float) null, 14);
    }

    public static koi.j b() {
        TextDelegate.Model model = new TextDelegate.Model("LIST_ID_TRANSACTIONS_EMPTY", new TextLocalisedClause(R$string.pay_id_area_transactions_empty_title, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        if (!domainState.f182393a) {
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("LIST_ID_CREATE_PAYID", new TextLocalisedClause(R$string.pay_id_area_receive_transfers_with_payid_title, null, null, 14), new TextLocalisedClause(R$string.pay_id_area_receive_transfers_with_payid_subtitle, null, null, 14), new com.revolut.core.ui_kit.delegates.m(a(R$drawable.uikit_icn_24_arrow_bulk_request), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.pay_id_area_receive_transfers_with_payid_button, null, null, 14), null, false), null, null, null, false, 8144);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        ip0.z zVar = new ip0.z("LIST_ID_ACTIONS", zhm.v.k(new ActionsView.Item("LIST_ID_SEND_TRANSFER", null, false, null, null, new TextLocalisedClause(R$string.pay_id_area_actions_send, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670), new ActionsView.Item("LIST_ID_ADD_CONTACT", null, false, null, null, new TextLocalisedClause(R$string.pay_id_area_actions_add_contact, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_add_contact, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), null, mx0.l.HEADER_CIRCLE_ACTIONS, 0, 0, 116);
        final int i = 0;
        yp0.b.l(zVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(zVar);
        eVarB.addAll((Collection) iii.c.f(domainState.f182395c, new k9h.d(5), new k8d.s(8), new Function3(this) { // from class: ka2.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f182408b;

            {
                this.f182408b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i2 = i;
                x xVar = this.f182408b;
                switch (i2) {
                    case 0:
                        List content = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (content.isEmpty()) {
                            return f0.f322471a;
                        }
                        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("LIST_ID_RECENTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.pay_id_area_recent_contacts_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.pay_id_area_recent_contacts_button_open_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
                        List list = content;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((fy1.q) xVar.f182409a).h((PayIdBeneficiary) it8.next()));
                        }
                        eg egVar = new eg("LIST_ID_RECENTS_LIST", arrayList, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020);
                        yp0.b.l(egVar, 0, 0, 0, 0, null, false, 63);
                        return zhm.v.k(model2, egVar);
                    default:
                        whf.p content2 = (whf.p) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        if (content2.f297646a.isEmpty()) {
                            return zhm.u.c(x.b());
                        }
                        aim.e eVarB2 = zhm.u.b();
                        eVarB2.addAll(((anf.w) xVar.f182410b).c(content2, new whf.l(0), j.a.f297643a));
                        if (content2.f297646a.size() >= 3) {
                            eVarB2.add(new LargeActionButtonDelegate.Model("LIST_ID_TRANSACTIONS_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.pay_id_area_transactions_button_open_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, null, null, 1000));
                        }
                        aim.e eVarA = zhm.u.a(eVarB2);
                        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                        return eVarA;
                }
            }
        }));
        if (!domainState.f182394b) {
            ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model("LIST_ID_CONTACTS_PERMISSION", new TextLocalisedClause(R$string.pay_id_area_enable_contact_permission_title, null, null, 14), new TextLocalisedClause(R$string.pay_id_area_enable_contact_permission_subtitle, null, null, 14), new com.revolut.core.ui_kit.delegates.m(a(R$drawable.uikit_icn_24_phone_book), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.pay_id_area_enable_contact_permission_button_title, null, null, 14), null, false), null, null, null, false, 8144);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        Data data = domainState.d;
        eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_TRANSACTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.pay_id_area_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        final int i2 = 1;
        eVarB.addAll((Collection) iii.c.f(data, new k9h.d(6), new k8d.s(this, 9), new Function3(this) { // from class: ka2.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f182408b;

            {
                this.f182408b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i22 = i2;
                x xVar = this.f182408b;
                switch (i22) {
                    case 0:
                        List content = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (content.isEmpty()) {
                            return f0.f322471a;
                        }
                        ListSubheaderDelegate.Model model22 = new ListSubheaderDelegate.Model("LIST_ID_RECENTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.pay_id_area_recent_contacts_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.pay_id_area_recent_contacts_button_open_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
                        List list = content;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((fy1.q) xVar.f182409a).h((PayIdBeneficiary) it8.next()));
                        }
                        eg egVar = new eg("LIST_ID_RECENTS_LIST", arrayList, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020);
                        yp0.b.l(egVar, 0, 0, 0, 0, null, false, 63);
                        return zhm.v.k(model22, egVar);
                    default:
                        whf.p content2 = (whf.p) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        if (content2.f297646a.isEmpty()) {
                            return zhm.u.c(x.b());
                        }
                        aim.e eVarB2 = zhm.u.b();
                        eVarB2.addAll(((anf.w) xVar.f182410b).c(content2, new whf.l(0), j.a.f297643a));
                        if (content2.f297646a.size() >= 3) {
                            eVarB2.add(new LargeActionButtonDelegate.Model("LIST_ID_TRANSACTIONS_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.pay_id_area_transactions_button_open_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, null, null, 1000));
                        }
                        aim.e eVarA = zhm.u.a(eVarB2);
                        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                        return eVarA;
                }
            }
        }));
        return new u(zhm.u.a(eVarB));
    }
}
