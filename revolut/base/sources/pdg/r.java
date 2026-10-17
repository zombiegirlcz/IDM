package pdg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f235215a;

    public r(ArrayList imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f235215a = imageUrls;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f235215a.equals(((r) obj2).f235215a);
    }

    public final int hashCode() {
        return this.f235215a.hashCode();
    }
}
