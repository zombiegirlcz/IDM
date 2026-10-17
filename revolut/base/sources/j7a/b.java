package j7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171878b;

    public b(String htmlContent, String fileName) {
        Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f171877a = htmlContent;
        this.f171878b = fileName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f171877a, bVar.f171877a) && Intrinsics.f(this.f171878b, bVar.f171878b);
    }

    public final int hashCode() {
        return this.f171878b.hashCode() + (this.f171877a.hashCode() * 31);
    }
}
