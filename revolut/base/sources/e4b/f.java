package e4b;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122521a;

    public f(ArrayList avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f122521a = avatars;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f122521a.equals(((f) obj2).f122521a);
    }

    public final int hashCode() {
        return this.f122521a.hashCode();
    }
}
