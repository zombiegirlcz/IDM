package nrc;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218604a;

    public a(String htmlContent) {
        Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        this.f218604a = htmlContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f218604a, ((a) obj2).f218604a);
    }

    public final int hashCode() {
        return this.f218604a.hashCode();
    }
}
