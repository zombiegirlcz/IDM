package ful;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import cul.v;
import ft4.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import nel.z;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdf.d f138284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f138285b;

    public c(vdf.d assetFormatter, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f138284a = assetFormatter;
        this.f138285b = tradingOrderMapper;
    }

    @Override // ful.h
    public final boolean a(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        n nVar = (n) domainState.H.getContent();
        if (nVar == null) {
            return false;
        }
        z zVar = nVar.f214597c;
        if (nVar.b()) {
            return false;
        }
        if (zVar == z.ADR || zVar == z.BOND || zVar == z.COMMODITY || zVar == z.CFD || io3.h.k(zVar) || zVar == z.EQUITY || zVar == z.SPAC || zVar == z.WARRANT || zVar == z.STRUCTURED_NOTE) {
            return true;
        }
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar == z.OPTION || zVar == z.UNSPECIFIED || zVar == z.MUTUAL_FUND;
    }

    @Override // ful.h
    public final Clause b(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = b.f138281a[domainState.f109175a.ordinal()];
        if (i == 1) {
            return CompositeClause.a(v1.c.f(zhm.v.l(c(domainState)), null), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 11);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.M;
        Data dataD0 = t1.d0(domainState.C, Boolean.FALSE);
        Data dataT = (data == null || dataD0 == null) ? null : t1.t(data, dataD0);
        Clause[] elements = {dataT != null ? (Clause) iii.c.f(dataT, new w(19), new fq7.j(23), new a(domainState, this)) : null, c(domainState)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return CompositeClause.a(v1.c.f(kotlin.collections.d.L(elements), null), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 11);
    }

    public final Clause c(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (Clause) iii.c.f(t1.t(domainState.H, domainState.I), new w(20), new fq7.j(24), new a(this, domainState));
    }
}
