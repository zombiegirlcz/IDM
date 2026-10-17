package zs9;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
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
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.R$string;
import ip0.jh0;
import ip0.lh0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jki.p {

    @NotNull
    public static final f Companion = new f();

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        boolean z;
        Iterable iterableK;
        List listE0;
        p domainState = (p) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.e;
        String str = domainState.f324836b;
        if (data.getLoading()) {
            listE0 = zhm.v.k(new pb0("1"), new pb0("2"), new pb0("3"));
            yp0.b.k(listE0, 0, 0, 0, 0, 31);
            z = false;
        } else {
            InputTextDelegate.Model model = new InputTextDelegate.Model("ID_NAME_INPUT", new TextClause(domainState.f324836b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_customisation_name_input_title, null, null, 14), null, null, null, null, true, 25, false, false, 0, true, 0, false, false, true, f0.f322471a, false, false, 0, false, false, null, 1056915448, 131071);
            int i = R$attr.uikit_dp16;
            yp0.b.l(model, i, i, i, i, null, false, 48);
            jh0 jh0Var = jh0.FLEXBOX;
            List<vq9.i> list = domainState.d;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (vq9.i iVar2 : list) {
                arrayList.add(new SuggestionsBarDelegate.Suggestion(iVar2.f291360a, new TextLocalisedClause(iVar2.f291361b, null, null, 14), null, Intrinsics.f(domainState.f324837c, iVar2) ? lh0.ACCENT : lh0.SEMIACCENT, null, false, iVar2, null, 372));
            }
            List listK = zhm.v.k(model, new nh("ID_SUGGESTION", arrayList, null, jh0Var, 0, 0, 0, 0, 0, 32756));
            xi0.b bVar = (xi0.b) data.getContent();
            if (bVar == null) {
                iterableK = f0.f322471a;
                z = false;
            } else {
                z = false;
                ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_CURRENCY_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.payments_groups_create_base_currency_header_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);
                RowDelegate.Model model3 = new RowDelegate.Model("ID_CURRENCY_ITEM", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new CurrencyClause(bVar, null, null, 6), null, null, 0, domainState.f324838g ? new pf(new TextLocalisedClause(R$string.payments_groups_base_currency_action_change, null, null, 14), null, null, false, null, null, 510) : null, domainState.f324838g, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                iterableK = zhm.v.k(model2, model3);
            }
            ArrayList arrayListE0 = d0.E0(iterableK, listK);
            st9.b groupSettingsCalculationType = domainState.f;
            Intrinsics.checkNotNullParameter(groupSettingsCalculationType, "groupSettingsCalculationType");
            listE0 = d0.E0(zhm.u.c(tr9.h.a(groupSettingsCalculationType)), arrayListE0);
        }
        return new s(listE0, domainState.f324835a, (!((kotlin.text.d0.W(str) || str.length() > 25) ? z : true) || data.getLoading()) ? z : true);
    }
}
