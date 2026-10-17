package n0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211035b;

    public d(String experienceId, String optionId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        this.f211034a = experienceId;
        this.f211035b = optionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211034a, dVar.f211034a) && Intrinsics.f(this.f211035b, dVar.f211035b);
    }

    public final int hashCode() {
        return this.f211035b.hashCode() + (this.f211034a.hashCode() * 31);
    }
}
