package nyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f220865b;

    public b(String experienceId, a parameters) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f220864a = experienceId;
        this.f220865b = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f220864a, bVar.f220864a) && Intrinsics.f(this.f220865b, bVar.f220865b);
    }

    public final int hashCode() {
        return this.f220865b.hashCode() + (this.f220864a.hashCode() * 31);
    }
}
