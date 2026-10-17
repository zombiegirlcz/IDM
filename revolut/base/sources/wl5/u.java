package wl5;

import aw0.k7;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.spare.change.api.R$string;
import ip0.c0;
import ip0.ck0;
import ip0.cs;
import ip0.pb0;
import ip0.s7;
import ip0.tm0;
import ip0.um0;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements jki.p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul5.g f298435a;

    public u(ul5.g spareChangeMultipliersProvider) {
        Intrinsics.checkNotNullParameter(spareChangeMultipliersProvider, "spareChangeMultipliersProvider");
        this.f298435a = spareChangeMultipliersProvider;
    }

    public static AnimatedResourceImage b(yl5.a aVar, yl5.a aVar2) {
        if (aVar == aVar2) {
            return new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite));
        }
        return null;
    }

    public static TextLocalisedClause c(yl5.a aVar, yl5.a aVar2) {
        if (aVar != aVar2) {
            if (aVar2 != yl5.a.CREATE && aVar2 != yl5.a.UPDATE) {
                if (aVar2 == yl5.a.REMOVE) {
                    return new TextLocalisedClause(R$string.crypto_sparechange_actionfooter_remove_title, null, null, 14);
                }
            }
            return new TextLocalisedClause(R$string.crypto_sparechange_actionfooter_save_title, null, null, 14);
        }
        return null;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        boolean z;
        rp0.l lVar;
        rp0.t tVar;
        Integer num;
        z zVar;
        TextDelegate.Model model;
        boolean z3;
        qv0.n um0Var;
        List listF0;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.crypto_settings_sparechange_status_title, null, null, 14), new TextLocalisedClause(R$string.crypto_sparechange_header_subtitle, null, null, 14), null, 28);
        rp0.l lVar2 = rp0.l.WINDOW;
        boolean z4 = domainState.f;
        yl5.a aVar = domainState.f298417g;
        xi0.b bVar = domainState.d;
        xi0.b bVar2 = domainState.f298416c;
        Integer num2 = domainState.f298415b;
        Integer num3 = domainState.f298414a;
        if (z4) {
            aim.e eVarB = zhm.u.b();
            pb0 pb0Var = new pb0("ROW_LOADING_LIST_ID");
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(pb0Var);
            c0 c0Var = new c0("ACTIONS_LOADING_LIST_ID", new u.a(0, 3), R$attr.uikit_dp16, 0, 56);
            int i = R$attr.uikit_dp0;
            List listK = v.k(c0Var, new s7("CELL_DETAILS_LOADING_LIST_ID", i, i, 0, 0, false, null, SyslogConstants.LOG_CLOCK));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            eVarB.addAll(listK);
            cs csVar = new cs("LARGE_ACTION_BUTTON_LOADING_LIST_ID");
            int i2 = R$attr.uikit_dp16;
            yp0.b.p(csVar, i2, i2, i2, i2);
            eVarB.add(csVar);
            listF0 = zhm.u.a(eVarB);
            lVar = lVar2;
            tVar = tVar2;
            z3 = false;
            z = true;
        } else {
            xi0.b bVar3 = bVar2 == null ? bVar : bVar2;
            z = true;
            RowDelegate.Model model2 = new RowDelegate.Model("CURRENCY_PICKER_LIST_ID", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(bVar3, CurrencyClause.Format.Ticker.f57756a, null, 4), null, 0, new CurrencyClause(bVar3, null, null, 6), null, null, 0, new pf(new TextLocalisedClause(R$string.crypto_sparechange_currency_button_title, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, bVar3, null, 0, 0, 0, 0, 532675544);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            List listC = zhm.u.c(model2);
            Integer num4 = num2 == null ? num3 : num2;
            ul5.g gVar = this.f298435a;
            List listA = gVar.a();
            Integer num5 = num4;
            ArrayList arrayList = new ArrayList(w.t(listA, 10));
            Iterator it8 = listA.iterator();
            int i3 = 0;
            while (it8.hasNext()) {
                Object next = it8.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                rp0.l lVar3 = lVar2;
                ul5.f fVar = (ul5.f) next;
                rp0.t tVar3 = tVar2;
                int i6 = fVar.f280893b;
                Iterator it9 = it8;
                arrayList.add(new ActionsView.Item(a0.d.n("SPARE_CHANGE_MULTIPLIER_ITEM_ID", i6), (num5 != null && num5.intValue() == i6) || (num5 == null && i3 == 0) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(fVar.f280892a, null, null, 14), null, null, null, null, false, null, null, Integer.valueOf(i6), null, 24476));
                it8 = it9;
                i3 = i5;
                lVar2 = lVar3;
                tVar2 = tVar3;
            }
            lVar = lVar2;
            tVar = tVar2;
            z zVar2 = new z("SPARE_CHANGE_MULTIPLIER_ITEM_ID", arrayList, null, mx0.l.FLEXBOX, 0, 0, 116);
            xi0.b bVar4 = domainState.e;
            if (bVar4 == null) {
                num = num3;
                zVar = zVar2;
                model = null;
            } else {
                int iIntValue = num2 != null ? num2.intValue() : num3 != null ? num3.intValue() : ((ul5.f) d0.b0(gVar.a())).f280893b;
                int i21 = R$string.crypto_sparechange_multiplier_subtitle;
                num = num3;
                zVar = zVar2;
                dj0.d dVar = new dj0.d(960L, bVar4);
                k7 k7Var = k7.NEVER;
                model = new TextDelegate.Model("SPARE_CHANGE_MULTIPLIER_DESCRIPTION_LIST_ID", new TextLocalisedClause(i21, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), new MoneyClause(new dj0.d(((long) iIntValue) * 40, bVar4), new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12)), null, 12), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
            }
            z3 = false;
            qv0.i[] elements = {zVar, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            ArrayList arrayListE0 = d0.E0(listL, listC);
            if (num == null) {
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                yl5.a aVar2 = yl5.a.CREATE;
                um0Var = new LargeActionButtonDelegate.Model("SAVE_SPARE_CHANGE_BUTTON_ITEM_ID", defaultFilledButton, b(aVar, aVar2), c(aVar, aVar2), false, null, null, null, null, 744);
                int i22 = R$attr.uikit_dp16;
                yp0.b.p(um0Var, i22, i22, i22, i22);
            } else {
                int iIntValue2 = num.intValue();
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                yl5.a aVar3 = yl5.a.REMOVE;
                tm0 tm0Var = new tm0(defaultFilledButton2, b(aVar, aVar3), c(aVar, aVar3), true, null, null, 48);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton3 = LargeActionButton.ButtonStyle.f58725a;
                yl5.a aVar4 = yl5.a.UPDATE;
                um0Var = new um0("HORIZONTAL_BUTTONS_ITEM_ID", tm0Var, new tm0(defaultFilledButton3, b(aVar, aVar4), c(aVar, aVar4), ((num2 == null || iIntValue2 != num2.intValue()) && num2 != null) || !(Intrinsics.f(bVar, bVar2) || bVar2 == null), null, null, 48), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016);
            }
            listF0 = d0.F0(um0Var, arrayListE0);
        }
        return new h(new y(listF0, tVar, lVar, 80, null, null, 1000), aVar == null ? z : z3);
    }
}
