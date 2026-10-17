package adh;

import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.lf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nbh.f f3351a;

    public c(nbh.a instrumentImageProvider, nbh.f instrumentRowProvider) {
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        this.f3351a = instrumentRowProvider;
    }

    public final RowDelegate.Model a(a0 instrumentWithTicker, String listIdPrefix, Clause clause, Object parcel) {
        Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        nel.n nVar = instrumentWithTicker.f214560a;
        InstrumentTicker instrumentTicker = instrumentWithTicker.f214561b;
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(listIdPrefix, ".row.", nVar.e);
        nbh.f fVar = this.f3351a;
        TextClause textClauseF = fVar.f(nVar);
        lf lfVarE = fVar.e(nVar);
        TextClause textClauseD = fVar.d(nVar);
        z zVar = instrumentTicker != null ? instrumentTicker.d : null;
        return new RowDelegate.Model(strO, nbh.a.b(nVar), null, null, textClauseF, clause, textClauseD, lfVarE, 1, p1h.a.a(fVar, nVar, instrumentTicker, new MoneyClause.Format.Defaults(null, (zVar == null ? -1 : b.f3350a[zVar.ordinal()]) == 1 ? ScaleMode.TradingPrecise.f51443a : null, false, false, 5), null, 8), false, false, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 1056944236);
    }

    public final RowDelegate.Model b(a0 instrumentWithTicker, String listIdPrefix, Object parcel) {
        Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return a(instrumentWithTicker, listIdPrefix, this.f3351a.c(instrumentWithTicker.f214560a), parcel);
    }
}
