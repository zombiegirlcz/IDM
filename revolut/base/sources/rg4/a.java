package rg4;

import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreApplicationChecksScenario f254016a;

    public a(PreApplicationChecksScenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        this.f254016a = scenario;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f254016a, ((a) obj2).f254016a);
    }

    public final int hashCode() {
        return this.f254016a.hashCode();
    }
}
