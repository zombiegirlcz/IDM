package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f111061b;

    public s(String title, ArrayList subsections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subsections, "subsections");
        this.f111060a = title;
        this.f111061b = subsections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f111060a, sVar.f111060a) && this.f111061b.equals(sVar.f111061b);
    }

    public final int hashCode() {
        return this.f111061b.hashCode() + (this.f111060a.hashCode() * 31);
    }
}
