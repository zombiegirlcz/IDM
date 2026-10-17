package yu5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List filters) {
        super(filters);
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f316888b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f316888b, ((h) obj2).f316888b);
    }

    public final int hashCode() {
        return this.f316888b.hashCode();
    }
}
