package bk4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ux4.e, Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16247c = new b("", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16249b;

    public b(String htmlUrl, String pdfUrl) {
        Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        this.f16248a = htmlUrl;
        this.f16249b = pdfUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f16248a, bVar.f16248a) && Intrinsics.f(this.f16249b, bVar.f16249b);
    }

    public final int hashCode() {
        return this.f16249b.hashCode() + (this.f16248a.hashCode() * 31);
    }

    @Override // ux4.e
    public final String j8() {
        return this.f16249b;
    }

    @Override // ux4.e
    public final String v5() {
        return this.f16248a;
    }
}
