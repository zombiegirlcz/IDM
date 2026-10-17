package aok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8011a;

    public i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f8011a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f8011a, ((i) obj2).f8011a);
    }

    public final int hashCode() {
        return this.f8011a.hashCode();
    }
}
