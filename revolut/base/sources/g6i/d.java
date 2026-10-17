package g6i;

import aii.u;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f140951b;

    public /* synthetic */ d(i iVar, int i) {
        this.f140950a = i;
        this.f140951b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dii.g result = (dii.g) obj2;
        switch (this.f140950a) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.c) {
                    i iVar = this.f140951b;
                    iVar.o.getClass();
                    iVar.A2(new ExternalDestination.Browser("https://www.revolut.com/en-LT/legal/deposit-insurance-information/?geo-redirect=true", null));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.c) {
                    i iVar2 = this.f140951b;
                    u uVarM0 = iVar2.f140956m.M0(((dii.c) result).f115066a);
                    if (uVarM0 != null) {
                        iVar2.A2(uVarM0);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
