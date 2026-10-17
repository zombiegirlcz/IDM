package in1;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.functions.Function1;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferScheduleData f162609b;

    public /* synthetic */ q(TransferScheduleData transferScheduleData, int i) {
        this.f162608a = i;
        this.f162609b = transferScheduleData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f162608a) {
            case 0:
                return g.a((g) obj2, null, this.f162609b, null, 383);
            case 1:
                return mn1.h.a((mn1.h) obj2, null, this.f162609b, null, null, null, null, null, ISO781611.SMT_TAG);
            default:
                return wba.h.a((wba.h) obj2, null, null, this.f162609b, 23);
        }
    }
}
