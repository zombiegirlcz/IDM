package cd3;

import cd3.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b.AbstractC0145b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.d f23166a;

    public c(uc3.d cashbackSourceType) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        this.f23166a = cashbackSourceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f23166a == ((c) obj2).f23166a;
    }

    public final int hashCode() {
        return this.f23166a.hashCode();
    }
}
