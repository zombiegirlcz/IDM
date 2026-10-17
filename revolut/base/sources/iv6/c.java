package iv6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw6.d f168754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jw6.c f168755b;

    public c(jw6.d customerMapper, jw6.c customerAddressMapper) {
        Intrinsics.checkNotNullParameter(customerMapper, "customerMapper");
        Intrinsics.checkNotNullParameter(customerAddressMapper, "customerAddressMapper");
        this.f168754a = customerMapper;
        this.f168755b = customerAddressMapper;
    }

    public static CellDetailsDelegate.Model a(String str, int i, or6.a aVar) {
        int i2;
        Float fValueOf = Float.valueOf(18.0f);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i3 = b.f168753b[aVar.ordinal()];
        if (i3 == 1) {
            i2 = R$string.freelancer_sale_acquiring_payment_details_card_check_failed;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.freelancer_sale_acquiring_payment_details_card_check_passed;
        }
        return new CellDetailsDelegate.Model(str, textLocalisedClause, new CompositeClause(v.k(new TextLocalisedClause(i2, null, null, 14), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar == or6.a.PASS ? new ImageClause(R$drawable.uikit_icn_24_check_success, Integer.valueOf(R$attr.uikit_colorGreen), fValueOf, fValueOf, 16) : new ImageClause(R$drawable.uikit_icn_24_cross_circle, Integer.valueOf(R$attr.uikit_colorOrange), fValueOf, fValueOf, 16)), null, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static aim.e b(or6.g gVar, pr6.c cVar, int i) {
        String strName;
        String strName2;
        String str;
        int i2;
        aim.e eVarB = u.b();
        or6.e eVar = gVar.e;
        or6.f fVar = gVar.f;
        if (eVar != null || fVar != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            or6.e eVar2 = gVar.e;
            String str2 = "";
            if (eVar2 == null || (strName = eVar2.name()) == null) {
                strName = "";
            }
            if (fVar != null && (strName2 = fVar.name()) != null) {
                str2 = strName2;
            }
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_CARD_TYPE_ITEM", textLocalisedClause, new TextClause(d0.F0(strName + " " + str2).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        Boolean bool = gVar.f228072g;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_card_category, null, null, 14);
            if (zBooleanValue) {
                i2 = R$string.freelancer_sale_acquiring_payment_details_card_commercial;
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.freelancer_sale_acquiring_payment_details_card_consumer;
            }
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_CATEGORY_ITEM", textLocalisedClause2, new TextLocalisedClause(i2, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        String str3 = gVar.f228070b;
        if (str3 != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_LAST_FOUR_ITEM", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_card_number, null, null, 14), new TextClause("•• ".concat(str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        String str4 = gVar.d;
        if (str4 != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_CARD_EXPIRY_ITEM", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_expiry_date, null, null, 14), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        if (cVar != null && (str = cVar.f) != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_CARDHOLDER_ITEM", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_name_on_card, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        wi0.b bVar = gVar.f228074j;
        if (bVar != null) {
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_COUNTRY_CODE_ITEM", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_country, null, null, 14), new CountryClause(bVar, null), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        return u.a(eVarB);
    }
}
