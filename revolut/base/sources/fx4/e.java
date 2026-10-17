package fx4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f138726a;

    public e(ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f138726a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f138726a.equals(((e) obj2).f138726a);
    }

    public final int hashCode() {
        return this.f138726a.hashCode();
    }
}
