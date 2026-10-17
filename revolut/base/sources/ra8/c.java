package ra8;

import com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$InputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r83.g;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements j {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorIsaDetailsFlowContract$InputData f252791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f252792q;

    public c(hj8.a juniorProfileInteractor, JuniorIsaDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = juniorProfileInteractor;
        this.f252791p = inputData;
        this.f252792q = d.a(this, new r6f.i(this, 9));
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 7), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f252792q;
    }
}
