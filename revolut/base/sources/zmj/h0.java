package zmj;

import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import fej.d;
import jnj.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a f323558b;

    public /* synthetic */ h0(com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, int i) {
        this.f323557a = i;
        this.f323558b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323557a) {
            case 0:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, d.a.f134638a);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar = this.f323558b;
                if (zF) {
                    aVar.l2(new yzb.c(aVar, null, 28), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(y.f323598a);
                }
                return Unit.f186387a;
            case 1:
                String simProfileId = (String) obj2;
                Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = this.f323558b;
                return vkm.q.Q(aVar2.K, new wf0.f0(19, aVar2, simProfileId, (Continuation) null));
            default:
                jnj.e result = (jnj.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, e.a.f176814a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar3 = this.f323558b;
                EsimProfileEntry esimProfileEntryI2 = com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a.I2((n) ((j2) aVar3.J.f22677a).getValue());
                aVar3.C2(new x(esimProfileEntryI2 != null ? esimProfileEntryI2.f100440a : null));
                return Unit.f186387a;
        }
    }
}
