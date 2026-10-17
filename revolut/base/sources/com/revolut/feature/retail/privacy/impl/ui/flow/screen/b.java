package com.revolut.feature.retail.privacy.impl.ui.flow.screen;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.privacy.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import obg.q;
import ocb.a0;
import ocb.g;
import ocb.h;
import ocb.j;
import ocb.l;
import ocb.y;
import ocb.z;
import org.jetbrains.annotations.NotNull;
import rcb.c;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model b(c cVar) {
        if (cVar.f253244a || cVar.f253245b) {
            return new RowDelegate.Model("ID_PAYMENTS_STATUS_DISCOVERABLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.profile_privacy_make_me_discoverable_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.profile_privacy_discoverable_phone_revtag_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        }
        return null;
    }

    public static RowDelegate.Model d(b bVar, String str, int i, int i2, Integer num, List list, boolean z, int i3) {
        List list2 = (i3 & 16) != 0 ? f0.f322471a : list;
        bVar.getClass();
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(num.intValue(), list2, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532673496);
    }

    @Override // jki.p
    public final m a(i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f224173a, new q(this, 9), new ob2.a(11), new c1(this, domainState, 19)));
    }

    public final List c(g gVar) {
        RowDelegate.Model modelD;
        boolean z = gVar.f224179l;
        RowDelegate.Model modelD2 = d(this, "ID_HIDE_BALANCE", R$drawable.uikit_icn_24_eye_hide, R$string.profileHome_settings_item_hide_balances_toggle_title, Integer.valueOf(R$string.profileHome_settings_item_hide_balances_toggle_description), null, z, 208);
        j jVar = gVar.o;
        if (jVar instanceof ocb.i) {
            modelD = d(this, "ID_HIDE_ACCOUNT_DETAILS", R$drawable.uikit_icn_24_eye_hide, com.revolut.feature.pocket_details.api.R$string.profile_home_settings_item_hide_account_details_toggle_title, Integer.valueOf(com.revolut.feature.pocket_details.api.R$string.profile_home_settings_item_hide_account_details_toggle_description), null, ((ocb.i) jVar).f224183a, 208);
        } else {
            if (!Intrinsics.f(jVar, h.f224182a)) {
                throw new NoWhenBranchMatchedException();
            }
            modelD = null;
        }
        boolean z3 = gVar.f224174b;
        RowDelegate.Model[] elements = {modelD2, modelD, d(this, "ID_FLIP_GESTURE_HIDE_BALANCES", R$drawable.uikit_icn_24_device_down, R$string.profileHome_settings_item_hide_balances_gesture_toggle_title, Integer.valueOf(R$string.profileHome_settings_item_hide_balances_gesture_toggle_description), null, z3, 208)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }

    public final RowDelegate.Model e(a0 a0Var) {
        if (a0Var instanceof z) {
            return d(this, "ID_PAYMENTS_ADDING_TO_GROUPS", R$drawable.uikit_icn_24_people, R$string.profile_privacy_payments_group_addition_title, Integer.valueOf(R$string.profile_privacy_payments_group_addition_subtitle), null, ((z) a0Var).f224205a, 208);
        }
        if (a0Var instanceof y) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model f(int i, boolean z) {
        return d(this, "ID_MARKETING_STATUS_ANALYTICS", R$drawable.uikit_icn_24_profile, R$string.profile_privacy_advertising_title, Integer.valueOf(R$string.profile_privacy_advertising_subtitle_v2), v.k(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i, null, null, 14)), z, 192);
    }

    public final RowDelegate.Model g(a0 a0Var) {
        if (a0Var instanceof z) {
            return d(this, "ID_PAYMENTS_MESSAGING_WITH_FRIENDS", R$drawable.uikit_icn_24_chat, R$string.profile_privacy_payments_messaging_title, Integer.valueOf(R$string.profile_privacy_payments_messaging_subtitle), null, ((z) a0Var).f224205a, 208);
        }
        if (a0Var instanceof y) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
