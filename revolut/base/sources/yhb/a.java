package yhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313905a;

    public a(String workEmail) {
        Intrinsics.checkNotNullParameter(workEmail, "workEmail");
        this.f313905a = workEmail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f313905a, ((a) obj2).f313905a);
    }

    public final int hashCode() {
        return this.f313905a.hashCode();
    }
}
