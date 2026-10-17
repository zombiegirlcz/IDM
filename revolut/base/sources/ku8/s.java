package ku8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f189752a;

    public s(ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f189752a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f189752a.equals(((s) obj2).f189752a);
    }

    public final int hashCode() {
        return this.f189752a.hashCode();
    }
}
