package rmk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f255351b;

    public c(Data subscription, Data isLegacyFamilyPlan) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(isLegacyFamilyPlan, "isLegacyFamilyPlan");
        this.f255350a = subscription;
        this.f255351b = isLegacyFamilyPlan;
    }

    public static c a(c cVar, Data subscription, Data isLegacyFamilyPlan, int i) {
        if ((i & 1) != 0) {
            subscription = cVar.f255350a;
        }
        if ((i & 2) != 0) {
            isLegacyFamilyPlan = cVar.f255351b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(isLegacyFamilyPlan, "isLegacyFamilyPlan");
        return new c(subscription, isLegacyFamilyPlan);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f255350a, cVar.f255350a) && Intrinsics.f(this.f255351b, cVar.f255351b);
    }

    public final int hashCode() {
        return this.f255351b.hashCode() + (this.f255350a.hashCode() * 31);
    }
}
