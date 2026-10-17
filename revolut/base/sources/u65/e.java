package u65;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f277490b;

    public e(ArrayList partialDocuments, List fullDocuments) {
        Intrinsics.checkNotNullParameter(fullDocuments, "fullDocuments");
        Intrinsics.checkNotNullParameter(partialDocuments, "partialDocuments");
        this.f277489a = fullDocuments;
        this.f277490b = partialDocuments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f277489a, eVar.f277489a) && this.f277490b.equals(eVar.f277490b);
    }

    public final int hashCode() {
        return this.f277490b.hashCode() + (this.f277489a.hashCode() * 31);
    }
}
