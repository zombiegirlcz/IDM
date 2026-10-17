package n23;

import cli.n;
import cli.y;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import j23.p;
import j23.q;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements dli.b {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f211439p;

    public k(n stateMapper, OrderNewCardTabControllerContract$InputData inputData, q screenBuilderProvider) {
        p pVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenBuilderProvider, "screenBuilderProvider");
        SelectedTab tab2 = inputData.f65111a;
        screenBuilderProvider.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        phm.a aVar = (phm.a) screenBuilderProvider.f170674a.get(tab2);
        if (aVar == null || (pVar = (p) aVar.get()) == null) {
            throw new IllegalStateException(("Screen builder not found for tab " + tab2).toString());
        }
        this.o = pVar;
        this.f211439p = mra.d.b(this, new g(null, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        p pVar = this.o;
        yji.l.b1(this, pVar.a(), null, new j(this, null, 0), 3);
        yji.l.b1(this, pVar.b(), null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f211439p;
    }
}
