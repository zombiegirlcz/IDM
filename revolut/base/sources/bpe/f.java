package bpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17614a;

    public f(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f17614a = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f17614a, ((f) obj2).f17614a);
    }

    public final int hashCode() {
        return this.f17614a.hashCode();
    }
}
