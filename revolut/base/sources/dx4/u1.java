package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120785c;

    public u1(String htmlUrl, String pdfUrl, String documentName) {
        Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        this.f120783a = htmlUrl;
        this.f120784b = pdfUrl;
        this.f120785c = documentName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f120783a, u1Var.f120783a) && Intrinsics.f(this.f120784b, u1Var.f120784b) && Intrinsics.f(this.f120785c, u1Var.f120785c);
    }

    public final int hashCode() {
        return this.f120785c.hashCode() + p.a.c(this.f120783a.hashCode() * 31, 31, this.f120784b);
    }
}
