package tqi;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f273608a;

    public h(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f273608a = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f273608a, ((h) obj2).f273608a);
    }

    public final int hashCode() {
        return this.f273608a.hashCode();
    }
}
