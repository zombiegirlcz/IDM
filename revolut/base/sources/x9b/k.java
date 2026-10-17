package x9b;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(List list) {
        ArrayList<zlg.c> arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Address address = ((zlg.c) next).f323250a.e;
            String country = address != null ? address.getCountry() : null;
            if (country != null && !d0.W(country)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (zlg.c cVar : arrayList) {
            do3.e eVar = cVar.f323250a;
            String str = eVar.f116395a;
            Address address2 = eVar.e;
            String country2 = address2 != null ? address2.getCountry() : null;
            Intrinsics.h(country2);
            boolean z = cVar.f323252c;
            CountryImage countryImage = new CountryImage(country2, (Integer) null, (ez0.e) null, 14);
            wi0.b.Companion.getClass();
            AccountCellItemDelegate.Model model = new AccountCellItemDelegate.Model(str, z, (Image) countryImage, (Clause) new CountryClause(wi0.a.a(country2), null), (com.revolut.core.ui_kit.delegates.c) null, true, (Clause) (cVar.f323251b ? new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_screen_profiles_section_sub_title, null, null, 14) : null), (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) new c(str, country2), (Parcelable) null, 128912);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList2);
        if (arrayList2.size() < 2) {
            eVarB.add(new AccountCellItemDelegate.Model("ID_REGISTERED_IDENTITY_ADD_NEW_PROFILE", false, (Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 4.0f, null, null, 48), (Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_sheet_add_new_profile, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (com.revolut.core.ui_kit.delegates.c) com.revolut.core.ui_kit.delegates.b.f53699a, true, (Clause) null, (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) b.f303650a, (Parcelable) null, 128960));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, R$attr.uikit_dp24, 0, 0, 29);
        return eVarA;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        x9b.a domainState = (x9b.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f303649a, new x8i.h(this, 5), new x48.a(this, 23), new x0b.h(this, 5));
    }
}
