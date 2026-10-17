package dej;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f113697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f113699c;
    public final h2 d;
    public final EsimSubscriptionCancellationConfirmation e;

    public z1(b2 state, String str, Instant instant, h2 h2Var, EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f113697a = state;
        this.f113698b = str;
        this.f113699c = instant;
        this.d = h2Var;
        this.e = esimSubscriptionCancellationConfirmation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return this.f113697a == z1Var.f113697a && Intrinsics.f(this.f113698b, z1Var.f113698b) && Intrinsics.f(this.f113699c, z1Var.f113699c) && Intrinsics.f(this.d, z1Var.d) && Intrinsics.f(this.e, z1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f113697a.hashCode() * 31;
        String str = this.f113698b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.f113699c;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        h2 h2Var = this.d;
        int iHashCode4 = (iHashCode3 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation = this.e;
        return iHashCode4 + (esimSubscriptionCancellationConfirmation != null ? esimSubscriptionCancellationConfirmation.hashCode() : 0);
    }
}
