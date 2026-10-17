package drg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f117122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117123b;

    public b(Data documentsToAccept, List acceptedDocumentIds) {
        Intrinsics.checkNotNullParameter(documentsToAccept, "documentsToAccept");
        Intrinsics.checkNotNullParameter(acceptedDocumentIds, "acceptedDocumentIds");
        this.f117122a = documentsToAccept;
        this.f117123b = acceptedDocumentIds;
    }

    public static b a(b bVar, Data documentsToAccept, List acceptedDocumentIds, int i) {
        if ((i & 1) != 0) {
            documentsToAccept = bVar.f117122a;
        }
        if ((i & 2) != 0) {
            acceptedDocumentIds = bVar.f117123b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(documentsToAccept, "documentsToAccept");
        Intrinsics.checkNotNullParameter(acceptedDocumentIds, "acceptedDocumentIds");
        return new b(documentsToAccept, acceptedDocumentIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117122a, bVar.f117122a) && Intrinsics.f(this.f117123b, bVar.f117123b);
    }

    public final int hashCode() {
        return this.f117123b.hashCode() + (this.f117122a.hashCode() * 31);
    }
}
