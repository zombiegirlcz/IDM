package t48;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267922a;

    public j(List selectedPurposes) {
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f267922a = selectedPurposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f267922a, ((j) obj2).f267922a);
    }

    public final int hashCode() {
        return this.f267922a.hashCode();
    }

    public j() {
        this(f0.f322471a);
    }
}
