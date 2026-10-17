package vz6;

import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlowContract$Step;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wz6.e;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.perks.flow.b f293402b;

    public /* synthetic */ c(com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar, int i) {
        this.f293401a = i;
        this.f293402b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293401a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar = this.f293402b;
                h.t2(bVar, bVar.f74013q, bVar.f74012p.f74008a, false, null, false, 12);
                return Boolean.TRUE;
            case 1:
                e outputData = (e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData == null) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar2 = this.f293402b;
                h.u2(bVar2, bVar2.f74013q, new FreelancerPerksFlowContract$Step.PerksDetails(outputData.f301374a), null, 6);
                return Unit.f186387a;
            default:
                yja.b outputData2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i = d.f293403a[outputData2.ordinal()];
                com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar3 = this.f293402b;
                if (i == 1 || i == 2 || i == 3) {
                    h.t2(bVar3, bVar3.f74013q, bVar3.f74012p.f74008a, false, null, false, 12);
                } else {
                    h.D2(bVar3.f74013q);
                }
                return Unit.f186387a;
        }
    }
}
