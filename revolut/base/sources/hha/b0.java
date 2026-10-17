package hha;

import java.io.Serializable;
import java.time.Instant;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f152282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f152283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f152284c;

    public b0(Period duration, Instant instant, Instant instant2) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f152282a = duration;
        this.f152283b = instant;
        this.f152284c = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f152282a, b0Var.f152282a) && Intrinsics.f(this.f152283b, b0Var.f152283b) && Intrinsics.f(this.f152284c, b0Var.f152284c);
    }

    public final int hashCode() {
        int iHashCode = this.f152282a.hashCode() * 31;
        Instant instant = this.f152283b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f152284c;
        return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
