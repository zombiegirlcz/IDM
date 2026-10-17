package i84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu3.g f159435a;

    public e(nu3.g content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f159435a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f159435a, ((e) obj2).f159435a);
    }

    public final int hashCode() {
        return this.f159435a.hashCode();
    }
}
