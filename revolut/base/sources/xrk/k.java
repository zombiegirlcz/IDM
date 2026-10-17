package xrk;

import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends iri.a implements a {
    public static final /* synthetic */ KProperty[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f308370b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f308371c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f308372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Sequence f308373h;

    static {
        h0 h0Var = new h0(k.class, "ref", "getRef()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        i = new KProperty[]{p0Var.j(h0Var), p.a.y(k.class, "ticker", "getTicker()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "selectedPeriodState", "getSelectedPeriodState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "annualStatementPeriodState", "getAnnualStatementPeriodState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "quarterlyStatementPeriodState", "getQuarterlyStatementPeriodState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "expandedItemsState", "getExpandedItemsState()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public k() {
        te0.j jVar = new te0.j();
        this.f308371c = jVar;
        csk.f.Companion.getClass();
        this.d = new te0.j(csk.e.f108514b);
        StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = csk.e.f108515c;
        this.e = new te0.j(stockFinancialsStatementPeriodState);
        Intrinsics.checkNotNullParameter(stockFinancialsStatementPeriodState, "default");
        this.f = new te0.j(stockFinancialsStatementPeriodState);
        Map mapG = r0.g();
        Intrinsics.checkNotNullParameter(mapG, "default");
        this.f308372g = new te0.j(mapG);
        te0.e[] elements = {w0(), jVar.getValue(this, i[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f308373h = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f308373h;
    }

    public final te0.e w0() {
        return this.f308370b.getValue(this, i[0]);
    }

    public final te0.e x0() {
        return this.d.getValue(this, i[2]);
    }
}
