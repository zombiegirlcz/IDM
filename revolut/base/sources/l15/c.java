package l15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191457b;

    public c(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f191456a = title;
        this.f191457b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191456a, cVar.f191456a) && Intrinsics.f(this.f191457b, cVar.f191457b);
    }

    public final int hashCode() {
        return this.f191457b.hashCode() + (this.f191456a.hashCode() * 31);
    }
}
