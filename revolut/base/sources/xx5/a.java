package xx5;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.e;
import te0.j;
import te0.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends iri.a implements my5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f309398g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f309399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f309400c;
    public final j d;
    public final j e;
    public final Sequence f;

    static {
        h0 h0Var = new h0(a.class, "searchActive", "getSearchActive()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f309398g = new KProperty[]{p0Var.j(h0Var), p.a.y(a.class, "latestSearchInput", "getLatestSearchInput()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(a.class, "sortingTypeSelection", "getSortingTypeSelection()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(a.class, "sortingTypeApplied", "getSortingTypeApplied()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public a() {
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        j jVar = new j(bool);
        this.f309399b = jVar;
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f309400c = new j("");
        SortingType.MarketCap marketCap = new SortingType.MarketCap(0);
        Intrinsics.checkNotNullParameter(marketCap, "default");
        j jVar2 = new j(marketCap);
        this.d = jVar2;
        SortingType.MarketCap marketCap2 = new SortingType.MarketCap(0);
        Intrinsics.checkNotNullParameter(marketCap2, "default");
        j jVar3 = new j(marketCap2);
        this.e = jVar3;
        KProperty[] kPropertyArr = f309398g;
        e[] elements = {jVar.getValue(this, kPropertyArr[0]), w0(), jVar2.getValue(this, kPropertyArr[2]), jVar3.getValue(this, kPropertyArr[3])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = d.E(elements);
    }

    @Override // my5.a
    public final v K() {
        return this.d.getValue(this, f309398g[2]);
    }

    @Override // my5.a
    public final v o() {
        return this.e.getValue(this, f309398g[3]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f;
    }

    public final e w0() {
        return this.f309400c.getValue(this, f309398g[1]);
    }
}
