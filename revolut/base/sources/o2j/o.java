package o2j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.balance.picker.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f221645a;

    public o(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f221645a = savingsInterestRateFormatter;
    }

    public static CompositeClause a(int i) {
        TextClause textClause = new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$drawable.uikit_icn_24_people;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGrey20);
        Float fValueOf = Float.valueOf(20.0f);
        return new CompositeClause(v.k(textClause, new ImageClause(i2, numValueOf, fValueOf, fValueOf, 16)), sx4.g.e(1), null, null, 12);
    }

    public static Clause b(s vault, boolean z) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        if (!z) {
            List list = vault.k;
            if (list != null) {
                return a(list.size());
            }
            return null;
        }
        if (opg.c.f(vault)) {
            return new TextLocalisedClause(R$string.payments_balance_picker_section_pro_title, null, null, 14);
        }
        if (vault.f234889n == pcd.b.PERSONAL_JOINT) {
            return new TextLocalisedClause(R$string.payments_balance_picker_section_joint_title, null, null, 14);
        }
        if (!opg.c.d(vault)) {
            return new TextLocalisedClause(R$string.payments_balance_picker_section_personal_title, null, null, 14);
        }
        List list2 = vault.k;
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.payments_balance_picker_section_personal_title, null, null, 14), a(list2 != null ? list2.size() : 0)), new DotDividerClause((Integer) null), null, null, 12);
    }
}
