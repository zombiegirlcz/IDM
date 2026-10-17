package d71;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f111770a;

    public k(ArrayList bannersList) {
        Intrinsics.checkNotNullParameter(bannersList, "bannersList");
        this.f111770a = bannersList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f111770a.equals(((k) obj2).f111770a);
    }

    public final int hashCode() {
        return this.f111770a.hashCode();
    }
}
