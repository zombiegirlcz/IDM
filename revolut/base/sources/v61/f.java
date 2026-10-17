package v61;

import com.revolut.domain.models.moneyrequest.SplitPayerType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitPayerType f286283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286284b;

    public f(SplitPayerType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f286283a = type;
        this.f286284b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f286283a == fVar.f286283a && Intrinsics.f(this.f286284b, fVar.f286284b);
    }

    public final int hashCode() {
        return this.f286284b.hashCode() + (this.f286283a.hashCode() * 31);
    }
}
