package fha;

import hha.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f135190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135191b;

    public a(d oldPlan, d newPlan) {
        Intrinsics.checkNotNullParameter(oldPlan, "oldPlan");
        Intrinsics.checkNotNullParameter(newPlan, "newPlan");
        this.f135190a = oldPlan;
        this.f135191b = newPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135190a, aVar.f135190a) && Intrinsics.f(this.f135191b, aVar.f135191b);
    }

    public final int hashCode() {
        return this.f135191b.hashCode() + (this.f135190a.hashCode() * 31);
    }
}
