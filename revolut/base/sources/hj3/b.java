package hj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152656b;

    public b(String str, String darkUrl) {
        Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
        this.f152655a = str;
        this.f152656b = darkUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f152655a, bVar.f152655a) && Intrinsics.f(this.f152656b, bVar.f152656b);
    }

    public final int hashCode() {
        String str = this.f152655a;
        return this.f152656b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
