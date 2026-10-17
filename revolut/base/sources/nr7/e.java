package nr7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218593a;

    public e(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f218593a = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f218593a, ((e) obj2).f218593a);
    }

    public final int hashCode() {
        return this.f218593a.hashCode();
    }
}
