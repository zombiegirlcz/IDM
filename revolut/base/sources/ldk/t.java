package ldk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f194177a;

    public t(ArrayList additionalRewards) {
        Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
        this.f194177a = additionalRewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f194177a.equals(((t) obj2).f194177a);
    }

    public final int hashCode() {
        return this.f194177a.hashCode();
    }
}
