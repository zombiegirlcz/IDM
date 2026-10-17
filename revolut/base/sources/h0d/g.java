package h0d;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzc.i f148356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148357b;

    public g(gzc.i evidenceDocument, int i) {
        Intrinsics.checkNotNullParameter("", "description");
        Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
        this.f148356a = evidenceDocument;
        this.f148357b = i;
    }

    @Override // h0d.j
    public final gzc.i a() {
        return this.f148356a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148356a, gVar.f148356a) && this.f148357b == gVar.f148357b;
    }

    @Override // h0d.j
    public final String getTitle() {
        return this.f148356a.f148004b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148357b) + (this.f148356a.hashCode() * 31);
    }
}
