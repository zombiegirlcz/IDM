package da8;

import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$State;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f112486b;

    public /* synthetic */ l(AddressFlowContract$OutputData addressFlowContract$OutputData, int i) {
        this.f112485a = i;
        this.f112486b = addressFlowContract$OutputData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112485a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, null, null, this.f112486b.f60940a, null, false, LDSFile.EF_DG15_TAG);
            case 1:
                fa8.f update2 = (fa8.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Address address = this.f112486b.f60940a;
                Data juniorProfile = update2.f133250a;
                Data featureConfigs = update2.f133252c;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Intrinsics.checkNotNullParameter(featureConfigs, "featureConfigs");
                return new fa8.f(juniorProfile, address, featureConfigs);
            case 2:
                na8.l update3 = (na8.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return na8.l.a(update3, null, null, null, null, null, false, null, null, null, this.f112486b.f60940a, null, null, 3583);
            case 3:
                ovb.e update4 = (ovb.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ovb.e.a(update4, null, null, null, null, null, this.f112486b.f60940a, false, 95);
            default:
                CreditAddressV2FlowContract$State update5 = (CreditAddressV2FlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                ArrayList previousAddresses = d0.E0(u.c(this.f112486b.f60940a), update5.f66973a);
                Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
                return new CreditAddressV2FlowContract$State(previousAddresses);
        }
    }
}
