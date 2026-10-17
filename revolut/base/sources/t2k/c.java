package t2k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267588a;

    public c(List beneficiaries) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f267588a = beneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f267588a, ((c) obj2).f267588a);
    }

    public final int hashCode() {
        return this.f267588a.hashCode();
    }
}
