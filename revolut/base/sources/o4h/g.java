package o4h;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f222276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f222277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.l f222278c;

    public g(Clause title, Clause description, yy0.l endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        this.f222276a = title;
        this.f222277b = description;
        this.f222278c = endImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f222276a.equals(gVar.f222276a) && this.f222277b.equals(gVar.f222277b) && this.f222278c.equals(gVar.f222278c);
    }

    public final int hashCode() {
        return this.f222278c.hashCode() + p.a.b(this.f222276a.hashCode() * 31, 31, this.f222277b);
    }
}
