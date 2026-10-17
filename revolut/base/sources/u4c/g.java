package u4c;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_x_balances.api.R$string;
import dn8.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt5.f f277318a;

    public g(pt5.f activityWidgetMapper) {
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
        this.f277318a = activityWidgetMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t4c.a aVar = domainState.f277310b;
        int[] iArr = f.f277317a;
        int i = iArr[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_revx_pending_orders_bottom_sheet_available_title, null, null, 14);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.rates_revx_open_orders_bottom_sheet_title, null, null, 14);
        }
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_revx_pending_orders_bottom_sheet_description, null, null, 14);
        } else if (i2 == 2) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_revx_locked_balance_bottom_sheet_description, null, null, 14);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.rates_revx_open_orders_bottom_sheet_description, null, null, 14);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.rates_revx_open_orders_bottom_sheet_button_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        Data transactionsData = domainState.f277311c;
        TextLocalisedClause textLocalisedClause3 = aVar == t4c.a.VERBOSE ? new TextLocalisedClause(R$string.rates_revx_open_orders_bottom_sheet_title, null, null, 14) : null;
        dv5.f fVar = (dv5.f) this.f277318a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        return new d(eVar, (List) iii.c.f(transactionsData, new doe.c(fVar, textLocalisedClause3, 15), new dv5.b(fVar, 0), new k(textLocalisedClause3, fVar, 2)), aVar2);
    }
}
