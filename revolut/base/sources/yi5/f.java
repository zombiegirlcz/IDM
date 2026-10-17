package yi5;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer.core.models.CountryProfile;
import do3.n;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;
import yed.f0;
import z6k.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f314246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f314247c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(vkm.d dVar, Object obj2, Serializable serializable, Object obj3, int i) {
        this.f314245a = i;
        this.f314246b = dVar;
        this.f314247c = obj2;
        this.d = serializable;
        this.e = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f314245a) {
            case 0:
                Object objCollect = this.f314246b.collect(new f0(flowCollector, (j) this.f314247c, (String) this.d, (dsh.e) this.e, 2), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f314246b.collect(new f0(3, (ykf.b) this.f314247c, (a3) this.d, (n) this.e, flowCollector), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f314246b.collect(new f0(4, (yt9.g) this.f314247c, (io3.d) this.d, (CountryProfile) this.e, flowCollector), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect4 = this.f314246b.collect(new f0(5, (o) this.f314247c, (MoneyRequest) this.e, (String) this.d, flowCollector), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public f(vkm.d dVar, o oVar, MoneyRequest moneyRequest, String str) {
        this.f314245a = 3;
        this.f314246b = dVar;
        this.f314247c = oVar;
        this.e = moneyRequest;
        this.d = str;
    }
}
