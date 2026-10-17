package ur7;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f282253a;

    public c(Data documentGroups) {
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        this.f282253a = documentGroups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f282253a, ((c) obj2).f282253a);
    }

    public final int hashCode() {
        return this.f282253a.hashCode();
    }
}
