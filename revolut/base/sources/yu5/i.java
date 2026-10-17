package yu5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av5.i f316889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f316890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(av5.i type, List filters) {
        super(filters);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f316889b = type;
        this.f316890c = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f316889b == iVar.f316889b && Intrinsics.f(this.f316890c, iVar.f316890c);
    }

    public final int hashCode() {
        return this.f316890c.hashCode() + (this.f316889b.hashCode() * 31);
    }
}
