package b2k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11961a;

    public c(List beneficiaries) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f11961a = beneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f11961a, ((c) obj2).f11961a);
    }

    public final int hashCode() {
        return this.f11961a.hashCode();
    }
}
