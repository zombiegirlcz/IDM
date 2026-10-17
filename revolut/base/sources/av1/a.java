package av1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmDescriptor f9869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ApmDescriptor apmDescriptor) {
        super(apmDescriptor.getF62112a(), 0);
        Intrinsics.checkNotNullParameter(apmDescriptor, "apmDescriptor");
        this.f9869c = apmDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f9869c, ((a) obj2).f9869c);
    }

    public final int hashCode() {
        return this.f9869c.hashCode();
    }
}
