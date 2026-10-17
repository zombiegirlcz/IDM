package nrc;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218605a;

    public b(String htmlContent) {
        Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        this.f218605a = htmlContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f218605a, ((b) obj2).f218605a);
    }

    public final int hashCode() {
        return this.f218605a.hashCode();
    }
}
