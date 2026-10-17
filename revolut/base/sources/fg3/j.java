package fg3;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.check_topup.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        fg3.a domainState = (fg3.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f134884a;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_check_confirmation_description, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List listK = v.k(new CellDetailsDelegate.Model("AMOUNT_ID", new TextLocalisedClause(R$string.topup_check_confirmation_amount, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("FEES_ID", new TextLocalisedClause(R$string.topup_check_confirmation_fees, null, null, 14), new MoneyClause(new dj0.d(0L, dVar.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("ARRIVES_ID", new TextLocalisedClause(R$string.topup_check_confirmation_arrives, null, null, 14), new TextLocalisedClause(R$string.topup_check_confirmation_arrives_days, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d(i2b.a.q(model, listK));
    }
}
