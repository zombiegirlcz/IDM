package ql6;

import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundOpenBankingClient f247211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OpenBankingConsentsFlowContract$FlowType f247212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f247213c;
    public final Data d;

    public m(OutboundOpenBankingClient client, OpenBankingConsentsFlowContract$FlowType flowType, Data consents, Data data) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f247211a = client;
        this.f247212b = flowType;
        this.f247213c = consents;
        this.d = data;
    }

    public static m a(m mVar, Data consents, Data data, int i) {
        OutboundOpenBankingClient client = mVar.f247211a;
        OpenBankingConsentsFlowContract$FlowType flowType = mVar.f247212b;
        if ((i & 4) != 0) {
            consents = mVar.f247213c;
        }
        if ((i & 8) != 0) {
            data = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(consents, "consents");
        return new m(client, flowType, consents, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f247211a, mVar.f247211a) && Intrinsics.f(this.f247212b, mVar.f247212b) && Intrinsics.f(this.f247213c, mVar.f247213c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f247213c, (this.f247212b.hashCode() + (this.f247211a.hashCode() * 31)) * 31, 31);
        Data data = this.d;
        return iC + (data == null ? 0 : data.hashCode());
    }
}
