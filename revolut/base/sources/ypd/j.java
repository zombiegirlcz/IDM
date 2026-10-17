package ypd;

import aie.v;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations_execution.IncomeSorterDestinationsExecutionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends oki.h implements dli.b {

    @NotNull
    public static final g Companion = new g();
    public final IncomeSorterDestinationsExecutionContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f315842p;

    public j(IncomeSorterDestinationsExecutionContract$InputData inputData, j9l.a moneyCalculator, k stateMapper) {
        dj0.d dVarA = inputData.f87741c;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        f0 f0Var = f0.f322471a;
        if (inputData.f87740b == null) {
            xi0.b bVar = dVarA.f115083b;
            ArrayList arrayList = inputData.f87739a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((IncomeSorterHomeContract$DestinationValue) it8.next()).f87826b);
            }
            dVarA = moneyCalculator.a(bVar, arrayList2, this.o.d);
            if (dVarA == null) {
                dVarA = this.o.f87741c;
            }
        }
        IncomeSorterDestinationsExecutionContract$InputData incomeSorterDestinationsExecutionContract$InputData = this.o;
        this.f315842p = mra.d.b(this, new a(f0Var, null, dVarA, incomeSorterDestinationsExecutionContract$InputData.f87741c, incomeSorterDestinationsExecutionContract$InputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new v(this, (Continuation) null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f315842p;
    }
}
