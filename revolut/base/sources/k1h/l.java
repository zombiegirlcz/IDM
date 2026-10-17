package k1h;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180267a;

    public l(ArrayList avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f180267a = avatars;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f180267a.equals(((l) obj2).f180267a);
    }

    public final int hashCode() {
        return this.f180267a.hashCode();
    }
}
