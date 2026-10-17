package b8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends com.revolut.feature.shared.help_centre.impl.faq.screens.article.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13180a;

    public n(String specialisationQueue) {
        Intrinsics.checkNotNullParameter(specialisationQueue, "specialisationQueue");
        this.f13180a = specialisationQueue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f13180a, ((n) obj2).f13180a);
    }

    public final int hashCode() {
        return this.f13180a.hashCode();
    }
}
