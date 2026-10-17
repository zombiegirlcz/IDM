package db4;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f112665a;

    public e(FeatureCommand redirectDestination) {
        Intrinsics.checkNotNullParameter(redirectDestination, "redirectDestination");
        this.f112665a = redirectDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f112665a.equals(((e) obj2).f112665a);
    }

    public final int hashCode() {
        return this.f112665a.f98638a.hashCode();
    }
}
