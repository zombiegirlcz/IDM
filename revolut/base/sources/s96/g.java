package s96;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f261120a;

    public g(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f261120a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f261120a, ((g) obj2).f261120a);
    }

    public final int hashCode() {
        return this.f261120a.hashCode();
    }
}
