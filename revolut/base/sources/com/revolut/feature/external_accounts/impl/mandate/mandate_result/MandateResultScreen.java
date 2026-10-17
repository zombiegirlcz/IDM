package com.revolut.feature.external_accounts.impl.mandate.mandate_result;

import aii.q;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import iv0.p;
import j68.a;
import java.util.List;
import jh6.d;
import jki.h;
import jki.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import xf6.w1;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/mandate_result/MandateResultScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljki/l;", "Lcom/revolut/feature/external_accounts/impl/mandate/mandate_result/MandateResultScreenContract$InputData;", "Laii/q;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateResultScreen extends BaseRecyclerViewScreen<l, MandateResultScreenContract$InputData, q> {
    public final Object U;
    public final Object V;
    public final f0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MandateResultScreen(MandateResultScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(this, inputData, 22));
        this.V = w.y0(new p(this, 28));
        this.W = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (w1) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF61669d0() {
        return this.W;
    }
}
