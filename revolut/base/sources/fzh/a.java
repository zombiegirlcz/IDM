package fzh;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import w80.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f139203a;

    public a(b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f139203a = amountFormatter;
    }

    public static boolean a(xi0.b bVar) {
        return Intrinsics.f(bVar.f306286a, "PTS");
    }

    public static d b(Amount amount, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        if (Intrinsics.f(amount.f104718b.f104720b, "PTS")) {
            return qvb.a.e(amount.f104717a).f83960a;
        }
        amountConverter.getClass();
        return l4i.a.b(amount);
    }

    public static CompositeClause c(d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        if (a(money.f115083b)) {
            return nub.a.l(new RevPoints(money), o9.SENSITIVE, null, null, BitmapDescriptorFactory.HUE_RED, 62);
        }
        return null;
    }
}
