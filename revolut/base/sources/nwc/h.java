package nwc;

import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qtc.k f219823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthProtectionFeatureState.Visible f219824b;

    public h(qtc.k feature, WealthProtectionFeatureState.Visible state) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f219823a = feature;
        this.f219824b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f219823a == hVar.f219823a && Intrinsics.f(this.f219824b, hVar.f219824b);
    }

    public final int hashCode() {
        return this.f219824b.hashCode() + (this.f219823a.hashCode() * 31);
    }
}
