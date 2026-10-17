package rm2;

import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import ip0.h2;
import ip0.j2;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements cli.n {
    public static TextLocalisedClause a(em2.b bVar) {
        switch (w.f255202a[bVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_uploaded, null, null, 14);
            case 2:
            case 3:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_abstract, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_lines, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_glow, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_particles, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_minimal, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_pride, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_glass, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_nature, null, null, 14);
            case 11:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_colours, null, null, 14);
            case 12:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_gradients, null, null, 14);
            case 13:
            case 14:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_cyberpunk, null, null, 14);
            case 15:
            case 16:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_halloween, null, null, 14);
            case 17:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_christmas, null, null, 14);
            case 18:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_upbeat, null, null, 14);
            case 19:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_invest, null, null, 14);
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_business, null, null, 14);
            case 32:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_revolut_x, null, null, 14);
            case 33:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_cyberpunk2, null, null, 14);
            case 34:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_premium, null, null, 14);
            case 35:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_ultra, null, null, 14);
            case 36:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_private, null, null, 14);
            case 37:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_metal, null, null, 14);
            case 38:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_zodiac, null, null, 14);
            case 39:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_snake, null, null, 14);
            case 40:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_lights, null, null, 14);
            case 41:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_apex, null, null, 14);
            case 42:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_horizon, null, null, 14);
            case 43:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_explore, null, null, 14);
            case 44:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_crypto, null, null, 14);
            case 45:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_lava, null, null, 14);
            case 46:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_alex_k, null, null, 14);
            case 47:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_geometric, null, null, 14);
            case 48:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_dogs, null, null, 14);
            case 49:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_psychedelic, null, null, 14);
            case 50:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_velvet, null, null, 14);
            case 51:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_flowers, null, null, 14);
            case 52:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_glow, null, null, 14);
            case 53:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_travertine, null, null, 14);
            case 54:
                return new TextLocalisedClause(R$string.background_picker_catalogue_section_title_uk_landscapes, null, null, 14);
            case 55:
                throw new IllegalStateException("SAVINGS_CHALLENGE should never be shown in the catalogue");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        com.revolut.core.ui_kit.views.q qVar;
        int i;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Map map = domainState.f255186a;
        if (map == null) {
            f0 f0Var = f0.f322471a;
            return new r(null, f0Var, f0Var, f0Var);
        }
        Set setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(zhm.w.t(setEntrySet, 10));
        int i2 = 0;
        for (Object obj2 : setEntrySet) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj2;
            em2.b bVar = (em2.b) entry.getKey();
            bn2.t tVar = (bn2.t) entry.getValue();
            ArrayList arrayListE0 = d0.E0((Iterable) iii.c.f(tVar.f17041a, new s(this, 1), new rhj.m(this, 21), new lk7.p(tVar, this, domainState, bVar)), w.f255202a[bVar.ordinal()] == 1 ? zhm.u.c(new h2("UPLOAD_BUTTON_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.background_picker_button_upload, null, null, 14), j2.GRID)) : f0.f322471a);
            String strValueOf = String.valueOf(i2);
            int i5 = -1;
            if (domainState.f255188c) {
                Iterator it8 = arrayListE0.iterator();
                int i6 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        koi.j jVar2 = (koi.j) it8.next();
                        if ((jVar2 instanceof BackgroundSelectionDelegate.Model) && ((BackgroundSelectionDelegate.Model) jVar2).f51695c) {
                            i5 = i6;
                            break;
                        }
                        i6++;
                    }
                }
            }
            xc xcVar = new xc(strValueOf, arrayListE0, i5, null, null, 0, 0, 0, 1012);
            int i21 = R$attr.uikit_dp2;
            xcVar.k = i21;
            xcVar.f167128l = i21;
            xcVar.f167129m = i21;
            xcVar.f167130n = i21;
            arrayList.add(xcVar);
            i2 = i3;
        }
        Set<Map.Entry> setEntrySet2 = map.entrySet();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(setEntrySet2, 10));
        for (Map.Entry entry2 : setEntrySet2) {
            em2.b bVar2 = (em2.b) entry2.getKey();
            UiAssetLockState uiAssetLockState = ((bn2.t) entry2.getValue()).f17042b;
            if (uiAssetLockState instanceof UiAssetLockState.Locked) {
                String id10 = bVar2.getId();
                TextLocalisedClause textLocalisedClauseA = a(bVar2);
                UiAssetLockReason uiAssetLockReason = ((UiAssetLockState.Locked) uiAssetLockState).f63806a;
                if (uiAssetLockReason instanceof UiAssetLockReason.Challenge) {
                    i = R$drawable.uikit_icn_16_lock_closed;
                } else {
                    if (!(uiAssetLockReason instanceof UiAssetLockReason.Plan)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_premium;
                }
                qVar = new com.revolut.core.ui_kit.views.q(id10, new com.revolut.core.ui_kit.views.u(textLocalisedClauseA, i), 58);
            } else {
                if (!Intrinsics.f(uiAssetLockState, UiAssetLockState.Available.f63805a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = new com.revolut.core.ui_kit.views.q(bVar2.getId(), new com.revolut.core.ui_kit.views.t(a(bVar2)), 58);
            }
            arrayList2.add(qVar);
        }
        em2.b bVar3 = domainState.d;
        String id11 = bVar3 != null ? bVar3.getId() : null;
        Map map2 = domainState.f255186a;
        return new r(id11, arrayList, arrayList2, (map2 == null || !map2.containsKey(em2.b.UPLOADED)) ? f0.f322471a : zhm.u.c(new TextNavBarMenuItem("upload_menu_item_id", new TextLocalisedClause(R$string.background_picker_button_upload, null, null, 14), null, null, 12)));
    }
}
