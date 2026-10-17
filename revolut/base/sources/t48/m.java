package t48;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267925a;

    public m(List selectedPurposes) {
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f267925a = selectedPurposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f267925a, ((m) obj2).f267925a);
    }

    public final int hashCode() {
        return this.f267925a.hashCode();
    }
}
