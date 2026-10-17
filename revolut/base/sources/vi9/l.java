package vi9;

import android.os.Parcelable;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements yh9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f289545a;

    public l(b merchantIconMapper) {
        Intrinsics.checkNotNullParameter(merchantIconMapper, "merchantIconMapper");
        this.f289545a = merchantIconMapper;
    }

    public static LayeredImage b(int i, int i2) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 2.0f, 2.0f, Float.valueOf(12.0f), 8);
    }

    public static Clause d(zh9.y yVar, boolean z) {
        if (z) {
            return new TextLocalisedClause(R$string.pay_later_repayment_in_withdrawal, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
        }
        int i = k.f289544a[yVar.f322366b.e.ordinal()];
        if (i == 1) {
            return new TimeClause(yVar.f322366b.f322317b.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.pay_later_repayment_due_today, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.pay_later_repayment_overdue, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.pay_later_repayment_paid, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.pay_later_repayment_cancelled, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LayeredImage e(zh9.y yVar, boolean z) {
        if (z) {
            return b(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange);
        }
        int i = k.f289544a[yVar.f322366b.e.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return b(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorOrange);
        }
        if (i == 3) {
            return b(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed);
        }
        if (i == 4) {
            return null;
        }
        if (i == 5) {
            return b(R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorDeepGrey);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause f(zh9.y yVar) {
        return new TextLocalisedClause(R$string.pay_later_repayments_number_of_count, zhm.v.k(Integer.valueOf(yVar.f322366b.f322316a + 1), Integer.valueOf(yVar.f322365a.B.size())), null, 12);
    }

    public final Image c(zh9.y yVar) {
        Float fValueOf;
        int i = k.f289544a[yVar.f322366b.e.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            fValueOf = null;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            fValueOf = Float.valueOf(0.3f);
        }
        return this.f289545a.c(u0.Y(yVar.f322365a), fValueOf);
    }

    public final ListSubheaderDelegate.Model g() {
        return new ListSubheaderDelegate.Model("id_plans_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_account_upcoming_repayments, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
