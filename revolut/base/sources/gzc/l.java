package gzc;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f148009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f148010b;

    public l(m defaultFrequency, ArrayList availableFrequencies) {
        Intrinsics.checkNotNullParameter(defaultFrequency, "defaultFrequency");
        Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
        this.f148009a = defaultFrequency;
        this.f148010b = availableFrequencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f148009a.equals(lVar.f148009a) && this.f148010b.equals(lVar.f148010b);
    }

    public final int hashCode() {
        return this.f148010b.hashCode() + (this.f148009a.hashCode() * 31);
    }
}
