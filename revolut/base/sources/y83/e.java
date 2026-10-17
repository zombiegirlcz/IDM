package y83;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f311622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311623b;

    public e(f0 card, int i) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f311622a = card;
        this.f311623b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f311622a, eVar.f311622a) && this.f311623b == eVar.f311623b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f311623b) + (this.f311622a.hashCode() * 31);
    }
}
