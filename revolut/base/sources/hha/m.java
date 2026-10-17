package hha;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f152321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f152322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f152323c;

    public m(BigDecimal percentage, Period duration, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f152321a = percentage;
        this.f152322b = duration;
        this.f152323c = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f152321a, mVar.f152321a) && Intrinsics.f(this.f152322b, mVar.f152322b) && Intrinsics.f(this.f152323c, mVar.f152323c);
    }

    public final int hashCode() {
        int iHashCode = (this.f152322b.hashCode() + (this.f152321a.hashCode() * 31)) * 31;
        DateTime dateTime = this.f152323c;
        return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }
}
