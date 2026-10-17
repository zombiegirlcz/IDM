package gal;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f142196a;

    public d(FeatureCommand suspiciousTransactionCommand) {
        Intrinsics.checkNotNullParameter(suspiciousTransactionCommand, "suspiciousTransactionCommand");
        this.f142196a = suspiciousTransactionCommand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f142196a.equals(((d) obj2).f142196a);
    }

    public final int hashCode() {
        return this.f142196a.f98638a.hashCode();
    }
}
