package ldk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f194174a;

    public p(ArrayList additionalRewards) {
        Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
        this.f194174a = additionalRewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f194174a.equals(((p) obj2).f194174a);
    }

    public final int hashCode() {
        return this.f194174a.hashCode();
    }
}
