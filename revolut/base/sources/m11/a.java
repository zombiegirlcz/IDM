package m11;

import com.revolut.crypto.challenge.impl.model.PlanReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanReward.Eligible f201172a;

    public a(PlanReward.Eligible reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f201172a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f201172a, ((a) obj2).f201172a);
    }

    public final int hashCode() {
        return this.f201172a.hashCode();
    }
}
