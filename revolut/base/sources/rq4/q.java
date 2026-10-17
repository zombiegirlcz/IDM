package rq4;

import android.text.InputFilter;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rnd.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f256474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputFilter f256475b;

    public q(InputFilter amountInputFilter, u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        this.f256474a = amountFormatter;
        this.f256475b = amountInputFilter;
    }

    public static CompositeClause a(boolean z) {
        if (!z) {
            return null;
        }
        int i = R$drawable.uikit_icn_24_info_outline;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new HtmlLocalisedClause(R$string.credit_card_limit_cap_change_footer_description_with_link, (List) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) null, 26)), sx4.g.e(1), null, null, 12);
    }

    public static boolean b(jl4.a aVar, Long l2) {
        if (l2 == null || l2.longValue() < aVar.f175592c.f115082a || l2.longValue() > aVar.e.f115082a) {
            return false;
        }
        return l2.longValue() != aVar.f175590a.f115082a;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f256465a, new rpi.e(this, 5), new d0(9), new rbe.c(domainState, this, 9));
    }
}
