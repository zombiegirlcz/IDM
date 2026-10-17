package k8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends com.revolut.feature.shared.help_centre.impl.faq.screens.list.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182117a;

    public k(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f182117a = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f182117a, ((k) obj2).f182117a);
    }

    public final int hashCode() {
        return this.f182117a.hashCode();
    }
}
