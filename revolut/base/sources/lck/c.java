package lck;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f193891c;

    public c(Data receiver, String receiverCode, String selectedPlanName) {
        Intrinsics.checkNotNullParameter(receiverCode, "receiverCode");
        Intrinsics.checkNotNullParameter(selectedPlanName, "selectedPlanName");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.f193889a = receiverCode;
        this.f193890b = selectedPlanName;
        this.f193891c = receiver;
    }

    public static c a(c cVar, Data receiver) {
        String receiverCode = cVar.f193889a;
        String selectedPlanName = cVar.f193890b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(receiverCode, "receiverCode");
        Intrinsics.checkNotNullParameter(selectedPlanName, "selectedPlanName");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return new c(receiver, receiverCode, selectedPlanName);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f193889a, cVar.f193889a) && Intrinsics.f(this.f193890b, cVar.f193890b) && Intrinsics.f(this.f193891c, cVar.f193891c);
    }

    public final int hashCode() {
        return this.f193891c.hashCode() + p.a.c(this.f193889a.hashCode() * 31, 31, this.f193890b);
    }
}
