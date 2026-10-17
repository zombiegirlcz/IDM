package s96;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f261119a;

    public f(Uri imageUri) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.f261119a = imageUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f261119a, ((f) obj2).f261119a);
    }

    public final int hashCode() {
        return this.f261119a.hashCode();
    }
}
