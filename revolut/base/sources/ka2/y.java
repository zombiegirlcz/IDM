package ka2;

import com.revolut.feature.apm.payid.impl.screen.area.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.area.c f182412b;

    public /* synthetic */ y(com.revolut.feature.apm.payid.impl.screen.area.c cVar, int i) {
        this.f182411a = i;
        this.f182412b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f182411a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.feature.apm.payid.impl.screen.area.c cVar = this.f182412b;
                cVar.H2(cVar.u, new jck.y(zBooleanValue, 15));
                break;
            default:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (z.f182413a[output.ordinal()] == 1) {
                    this.f182412b.C2(a.C0456a.f62710a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
