package com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker;

import a0.d;
import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.n;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$Context;
import ieg.z;
import ip0.nb0;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import jck.c;
import jck.l;
import jck.o;
import jck.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.h4;
import vim.f;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingReceiverPickerScreenContract$InputData f102514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f102515b;

    public b(PlanGiftingReceiverPickerScreenContract$InputData inputData, c itemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f102514a = inputData;
        this.f102515b = itemsMapper;
    }

    public static List a(o oVar) {
        String strG = g(oVar);
        return u.c(strG.length() > 0 ? b("id_clear_search", new TextLocalisedClause(R$string.premium_gift_recipient_search_empty_result_title, u.c(strG), null, 12), null, R$drawable.uikit_icn_24_binoculars, new TextLocalisedClause(R$string.premium_gift_recipient_search_empty_result_clear_action, null, null, 14)) : b("id_add_contacts", new TextLocalisedClause(R$string.premium_gift_recipient_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.premium_gift_recipient_empty_state_subtitle, null, null, 14), R$drawable.uikit_icn_24_add_contact, new TextLocalisedClause(R$string.premium_gift_recipient_empty_state_action, null, null, 14)));
    }

    public static FullScreenStateDelegate.Model b(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, TextLocalisedClause textLocalisedClause3) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(str, textLocalisedClause, textLocalisedClause2, new ComplexImage.Regular(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(12, textLocalisedClause3, null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ArrayList d() {
        IntRange intRange = new IntRange(0, 4, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, d.n("id_revolut_contact_", it8.nextInt()), false, 0, false, 30));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static List f(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(str, textLocalisedClause, textLocalisedClause2, new m(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (LayeredImage) null, (ProgressStyle) null, 6), null, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, null, null, true, 6096);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static String g(o oVar) {
        jck.n nVar = oVar.f172861a;
        if (nVar instanceof l) {
            return ((l) nVar).f172855a;
        }
        if (nVar instanceof jck.m) {
            return ((jck.m) nVar).f172858a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        p pVar;
        List list;
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PlanGiftingReceiverPickerScreenContract$Context planGiftingReceiverPickerScreenContract$Context = this.f102514a.f102504a;
        if (Intrinsics.f(planGiftingReceiverPickerScreenContract$Context, PlanGiftingReceiverPickerScreenContract$Context.General.f102503a)) {
            pVar = new p(new TextLocalisedClause(R$string.premium_gift_recipient_general_title, null, null, 14), null);
        } else {
            if (!Intrinsics.f(planGiftingReceiverPickerScreenContract$Context, PlanGiftingReceiverPickerScreenContract$Context.Birthdays.f102502a)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar = new p(new TextLocalisedClause(R$string.premium_gift_recipient_all_upcoming_birthdays_title, null, null, 14), new TextLocalisedClause(R$string.premium_gift_recipient_all_upcoming_birthdays_subtitle, null, null, 14));
        }
        TextClause textClause = new TextClause(g(domainState), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        jck.n nVar = domainState.f172861a;
        if (nVar instanceof jck.m) {
            jck.m mVar = (jck.m) nVar;
            list = (List) iii.c.f(t1.t(mVar.d, mVar.f172859b), new jcj.n(this, 10), new j7b.m(18), new a0i.a(this, 26, domainState, mVar));
        } else {
            if (!(nVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar = (l) nVar;
            list = (List) iii.c.f(t1.t(lVar.f172856b, lVar.f172857c), new jcj.n(this, 8), new j7b.m(17), new z(this, domainState, 24));
        }
        return new jck.w(pVar, textClause, list);
    }

    public final List e(List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("id_revolut_contact_header", (Image) null, (Clause) new TextLocalisedClause(R$string.premium_gift_recipient_friends_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List<zm3.l> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zm3.l contact : list2) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            arrayList.add(((xl3.d) this.f102515b.f172838a).m(contact));
        }
        return yp0.b.g(arrayList, model, null, 0, 0, 126);
    }
}
