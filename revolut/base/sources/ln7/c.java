package ln7;

import java.util.ArrayList;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f197110a;

    public c(ArrayList benefits) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f197110a = benefits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f197110a.equals(((c) obj2).f197110a);
    }

    public final int hashCode() {
        return this.f197110a.hashCode();
    }
}
