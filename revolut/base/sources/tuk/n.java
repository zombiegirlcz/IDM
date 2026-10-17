package tuk;

import ael.d0;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreenContract$InputData;
import java.util.Set;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AttributesScreenContract$InputData f274629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f274630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f274631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f274632s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AttributesScreenContract$InputData inputData, d0 stocksInteractor, ImmutableSet glossaryInputDataFactories, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(glossaryInputDataFactories, "glossaryInputDataFactories");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f274629p = inputData;
        this.f274630q = stocksInteractor;
        this.f274631r = glossaryInputDataFactories;
        this.f274632s = new f(inputData.f103886a, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f274630q.a(this.f274629p.f103886a.f214596b, false)), null, null, new tna.p(this, null, 15), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f274632s;
    }
}
