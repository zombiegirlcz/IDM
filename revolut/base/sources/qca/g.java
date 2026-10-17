package qca;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f244672b;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f244671a, gVar.f244671a) && Intrinsics.f(this.f244672b, gVar.f244672b);
    }

    public final int hashCode() {
        int iHashCode = this.f244671a.hashCode() * 31;
        ApmDescriptor apmDescriptor = this.f244672b;
        return iHashCode + (apmDescriptor == null ? 0 : apmDescriptor.hashCode());
    }

    public g(String rawValue, ApmDescriptor apmDescriptor) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f244671a = rawValue;
        this.f244672b = apmDescriptor;
    }

    public /* synthetic */ g(int i) {
        this("", null);
    }
}
