package hog;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gog.a f154286a;

    public c(gog.a documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f154286a = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f154286a == ((c) obj2).f154286a;
    }

    public final int hashCode() {
        return this.f154286a.hashCode();
    }
}
