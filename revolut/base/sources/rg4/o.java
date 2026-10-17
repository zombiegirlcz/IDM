package rg4;

import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreApplicationChecksScenario f254029a;

    public o(PreApplicationChecksScenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        this.f254029a = scenario;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f254029a, ((o) obj2).f254029a);
    }

    public final int hashCode() {
        return this.f254029a.hashCode();
    }
}
