package dee;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f113422b;

    public /* synthetic */ u(z zVar, int i) {
        this.f113421a = i;
        this.f113422b = zVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f113421a) {
            case 0:
                z zVar = this.f113422b;
                zVar.H2(zVar.f113431r, new dcf.g0((Data) obj2, 6));
                break;
            case 1:
                z zVar2 = this.f113422b;
                zVar2.H2(zVar2.f113431r, new dcf.g0((Data) obj2, 7));
                break;
            default:
                z zVar3 = this.f113422b;
                zVar3.H2(zVar3.f113431r, new dcf.g0((Data) obj2, 8));
                break;
        }
        return Unit.f186387a;
    }
}
