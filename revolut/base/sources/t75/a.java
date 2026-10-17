package t75;

import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f268582a;

    public a(i selectedAccountData) {
        Intrinsics.checkNotNullParameter(selectedAccountData, "selectedAccountData");
        this.f268582a = selectedAccountData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f268582a, ((a) obj2).f268582a);
    }

    public final int hashCode() {
        return this.f268582a.hashCode();
    }
}
