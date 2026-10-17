package an9;

import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im9.c f6593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f6595c;
    public final Data d;
    public final PayeesFlowType e;

    public n(im9.c selectedFilter, String str, Set selected, Data recipients, PayeesFlowType flowType) {
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f6593a = selectedFilter;
        this.f6594b = str;
        this.f6595c = selected;
        this.d = recipients;
        this.e = flowType;
    }

    public static n a(n nVar, im9.c cVar, String str, Set set, Data data, int i) {
        if ((i & 1) != 0) {
            cVar = nVar.f6593a;
        }
        im9.c selectedFilter = cVar;
        if ((i & 2) != 0) {
            str = nVar.f6594b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            set = nVar.f6595c;
        }
        Set selected = set;
        if ((i & 8) != 0) {
            data = nVar.d;
        }
        Data recipients = data;
        PayeesFlowType flowType = nVar.e;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return new n(selectedFilter, str2, selected, recipients, flowType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f6593a == nVar.f6593a && Intrinsics.f(this.f6594b, nVar.f6594b) && Intrinsics.f(this.f6595c, nVar.f6595c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f6593a.hashCode() * 31;
        String str = this.f6594b;
        return this.e.hashCode() + kii.e.c(this.d, p.a.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6595c), 31);
    }
}
