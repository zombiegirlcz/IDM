package dsb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import gsb.t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4h.b f117279a;

    public b(m4h.b instrumentWarningStateMapper) {
        Intrinsics.checkNotNullParameter(instrumentWarningStateMapper, "instrumentWarningStateMapper");
        this.f117279a = instrumentWarningStateMapper;
    }

    @Override // dsb.c
    public final boolean a(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        return tVar instanceof gsb.l;
    }

    @Override // dsb.c
    public final Clause b(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (tVar instanceof gsb.l) {
            return ce9.m.P(f(tradeInstrumentData.n(), (gsb.l) tVar, Integer.valueOf(R$attr.uikit_colorRed)), Integer.valueOf(R$attr.uikit_colorRed));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // dsb.c
    public final m c(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (tVar == null) {
            return null;
        }
        if (tVar instanceof gsb.l) {
            return new i((gsb.l) tVar, tradeInstrumentData);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // dsb.c
    public final boolean d(m parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return parcel instanceof i;
    }

    @Override // dsb.c
    public final aii.e e(m parcel) {
        Pair pair;
        TextLocalisedClause textLocalisedClauseA;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i iVar = (i) parcel;
        gsb.l lVar = iVar.f117284a;
        qrb.k kVar = iVar.f117285b;
        TextLocalisedClause textLocalisedClauseF = f(kVar.n(), lVar, null);
        nel.n nVarN = kVar.n();
        if (Intrinsics.f(lVar, gsb.h.f146358a)) {
            pair = new Pair(Integer.valueOf(R$string.wealth_stock_details_close_positions_warning), u.c(nVarN.d));
        } else {
            if (lVar instanceof gsb.k) {
                textLocalisedClauseA = this.f117279a.a(((gsb.k) lVar).f146361a, nVarN);
                return new rrb.a(textLocalisedClauseA, textLocalisedClauseF);
            }
            if (!Intrinsics.f(lVar, gsb.i.f146359a) && !Intrinsics.f(lVar, gsb.j.f146360a)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R$string.wealth_stock_details_suspended_warning), u.c(nVarN.d));
        }
        textLocalisedClauseA = new TextLocalisedClause(((Number) pair.f186385a).intValue(), (List) pair.f186386b, null, 12);
        return new rrb.a(textLocalisedClauseA, textLocalisedClauseF);
    }

    public final TextLocalisedClause f(nel.n nVar, gsb.l lVar, Integer num) {
        int i;
        if (Intrinsics.f(lVar, gsb.h.f146358a)) {
            i = R$string.instrument_restricted_delisted_title;
        } else {
            if (lVar instanceof gsb.k) {
                return this.f117279a.c(((gsb.k) lVar).f146361a, nVar, num);
            }
            if (!Intrinsics.f(lVar, gsb.i.f146359a) && !Intrinsics.f(lVar, gsb.j.f146360a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.instrument_restricted_suspended_title;
        }
        return new TextLocalisedClause(i, u.c(nVar.e), num != null ? new Custom(num, false, null, false, null, 254) : null, 8);
    }
}
