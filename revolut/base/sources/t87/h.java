package t87;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f268850b;

    public h(String indexName, ArrayList charts) {
        Intrinsics.checkNotNullParameter(indexName, "indexName");
        Intrinsics.checkNotNullParameter(charts, "charts");
        this.f268849a = indexName;
        this.f268850b = charts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f268849a, hVar.f268849a) && this.f268850b.equals(hVar.f268850b);
    }

    public final int hashCode() {
        return this.f268850b.hashCode() + (this.f268849a.hashCode() * 31);
    }
}
