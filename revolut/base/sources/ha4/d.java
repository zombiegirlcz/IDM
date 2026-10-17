package ha4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy3.a f150437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150438b;

    public d(oy3.a details, List sourceInputs) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sourceInputs, "sourceInputs");
        this.f150437a = details;
        this.f150438b = sourceInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f150437a, dVar.f150437a) && Intrinsics.f(this.f150438b, dVar.f150438b);
    }

    public final int hashCode() {
        return this.f150438b.hashCode() + (this.f150437a.hashCode() * 31);
    }
}
