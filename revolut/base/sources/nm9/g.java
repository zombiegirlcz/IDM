package nm9;

import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesFlowType f217221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f217222b;

    public g(PayeesFlowType flowType, Data headerVersion) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(headerVersion, "headerVersion");
        this.f217221a = flowType;
        this.f217222b = headerVersion;
    }

    public static g a(g gVar, Data headerVersion) {
        PayeesFlowType flowType = gVar.f217221a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(headerVersion, "headerVersion");
        return new g(flowType, headerVersion);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f217221a, gVar.f217221a) && Intrinsics.f(this.f217222b, gVar.f217222b);
    }

    public final int hashCode() {
        return this.f217222b.hashCode() + (this.f217221a.hashCode() * 31);
    }
}
