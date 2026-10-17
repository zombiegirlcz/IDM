package g1l;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f139714a;

    public a(FeatureCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f139714a = naviCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f139714a.equals(((a) obj2).f139714a);
    }

    public final int hashCode() {
        return this.f139714a.f98638a.hashCode();
    }
}
