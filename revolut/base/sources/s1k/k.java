package s1k;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payment_options.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ri4.o;
import ryd.l;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f259156a;

    public k(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f259156a = savingsInterestRateFormatter;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) iii.c.f(domainState.f259148b, new s1c.a(9), new l(29), new o(23, domainState, false, this)));
        arrayList.addAll((List) iii.c.f(domainState.f259149c, new s1c.a(8), new l(28), new o(this, 22)));
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("FUND_ACCOUNT_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.payment_options_screen_section_other_options_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(new RowDelegate.Model("ADD_MONEY", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.payment_options_screen_section_other_options_action_top_up, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804), new RowDelegate.Model("EXCHANGE_MONEY", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_arrow_exchange, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.payment_options_screen_section_other_options_action_exchange, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        arrayList.addAll(ue0.e.J(model, listK));
        return new i(arrayList);
    }
}
