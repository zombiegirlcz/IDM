package rw8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f257847b;

    public c(int i, Set missingConsentPayloads) {
        Intrinsics.checkNotNullParameter(missingConsentPayloads, "missingConsentPayloads");
        this.f257846a = i;
        this.f257847b = missingConsentPayloads;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f257846a == cVar.f257846a && Intrinsics.f(this.f257847b, cVar.f257847b);
    }

    public final int hashCode() {
        return this.f257847b.hashCode() + (Integer.hashCode(this.f257846a) * 31);
    }
}
