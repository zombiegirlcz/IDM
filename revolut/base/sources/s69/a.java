package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260153a;

    public a(String htmlContent) {
        Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        this.f260153a = htmlContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f260153a, ((a) obj2).f260153a);
    }

    public final int hashCode() {
        return this.f260153a.hashCode();
    }
}
