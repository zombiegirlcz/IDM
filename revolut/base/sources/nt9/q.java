package nt9;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import ip0.jh0;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        qv0.i iVarB;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f219000b;
        xi0.b bVar = domainState.e;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_NAME_INPUT", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_customisation_name_input_title, null, null, 14), null, null, null, null, true, 25, false, false, 0, true, 0, false, false, true, f0.f322471a, false, false, 0, false, false, null, 1056915448, 131071);
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model, i2, R$attr.uikit_dp0, i2, i2, null, false, 48);
        jh0 jh0Var = jh0.FLEXBOX;
        List<h> list = domainState.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (h hVar : list) {
            arrayList.add(new SuggestionsBarDelegate.Suggestion(hVar.getId(), hVar.b(), null, null, domainState.f219001c == hVar ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, hVar, null, 364));
        }
        boolean z = false;
        List listK = v.k(model, new nh("ID_SUGGESTION", arrayList, null, jh0Var, 0, 0, 0, 0, 0, 32756));
        if (bVar != null) {
            i = 14;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.group_creation_currency_picker_cell_title, null, null, 14);
            List listK2 = v.k(new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(bVar, null, null, 6));
            m70.a.a(t0.f186434a);
            iVarB = new RowDelegate.Model("ID_CURRENCY_ITEM", image40, textLocalisedClause, null, 0, new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, domainState.f219002g ? new pf(new TextLocalisedClause(R$string.payments_groups_base_currency_action_change, null, null, 14), null, null, false, null, null, 510) : null, domainState.f219002g, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        } else {
            i = 14;
            iVarB = nb0.b(pb0.Companion, "ID_CURRENCY_ITEM", false, 0, false, 30);
        }
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_CURRENCY_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.payments_groups_create_base_currency_header_title, null, null, i), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);
        qv0.i iVar = iVarB;
        yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListE0 = d0.E0(v.k(model2, iVar), listK);
        st9.b groupSettingsCalculationType = domainState.f;
        Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
        ArrayList arrayListE02 = d0.E0(u.c(tr9.h.a(groupSettingsCalculationType)), arrayListE0);
        boolean z3 = !kotlin.text.d0.W(str) && str.length() <= 25;
        Image image = domainState.f218999a;
        if (z3 && bVar != null && image != null) {
            z = true;
        }
        return new j(arrayListE02, image, z);
    }
}
