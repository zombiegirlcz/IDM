package qp7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f248310a;

    public m(ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f248310a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f248310a.equals(((m) obj2).f248310a);
    }

    public final int hashCode() {
        return this.f248310a.hashCode();
    }
}
