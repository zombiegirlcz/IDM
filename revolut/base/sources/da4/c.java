package da4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f112469a;

    public c(Map documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f112469a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f112469a, ((c) obj2).f112469a);
    }

    public final int hashCode() {
        return this.f112469a.hashCode();
    }
}
