package b1c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends com.revolut.feature.rev_points.impl.ui.trophy_room.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11786b;

    public k(int i, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f11785a = highlights;
        this.f11786b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f11785a.equals(kVar.f11785a) && this.f11786b == kVar.f11786b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11786b) + (this.f11785a.hashCode() * 31);
    }
}
