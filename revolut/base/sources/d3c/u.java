package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f111065b;

    public u(String title, ArrayList subsections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subsections, "subsections");
        this.f111064a = title;
        this.f111065b = subsections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f111064a, uVar.f111064a) && this.f111065b.equals(uVar.f111065b);
    }

    public final int hashCode() {
        return this.f111065b.hashCode() + (this.f111064a.hashCode() * 31);
    }
}
