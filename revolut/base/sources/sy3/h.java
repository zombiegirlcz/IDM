package sy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f266620c;

    public h(String title, String description, g gVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f266618a = title;
        this.f266619b = description;
        this.f266620c = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f266618a, hVar.f266618a) && Intrinsics.f(this.f266619b, hVar.f266619b) && Intrinsics.f(this.f266620c, hVar.f266620c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f266618a.hashCode() * 31, 31, this.f266619b);
        g gVar = this.f266620c;
        return iC + (gVar == null ? 0 : gVar.f266617a.hashCode());
    }
}
