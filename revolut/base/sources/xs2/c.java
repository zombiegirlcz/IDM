package xs2;

import cli.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308386a;

    public c(ArrayList eligibilityCriteria) {
        Intrinsics.checkNotNullParameter(eligibilityCriteria, "eligibilityCriteria");
        this.f308386a = eligibilityCriteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f308386a.equals(((c) obj2).f308386a);
    }

    public final int hashCode() {
        return this.f308386a.hashCode();
    }
}
