package grd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmartEstimationAccess f146020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f146021c;
    public final /* synthetic */ Set d;

    public /* synthetic */ w(SmartEstimationAccess smartEstimationAccess, Set set, Set set2, int i) {
        this.f146019a = i;
        this.f146020b = smartEstimationAccess;
        this.f146021c = set;
        this.d = set2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146019a) {
            case 0:
                return a.a((a) obj2, null, null, null, null, null, null, false, this.f146020b, this.f146021c, this.d, 4095);
            default:
                return urd.a.a((urd.a) obj2, null, null, 0, this.f146020b, this.f146021c, this.d, 31);
        }
    }
}
