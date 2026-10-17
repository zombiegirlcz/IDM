package one;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f226944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f226945b;

    public d(ArrayList limitExemptions, ArrayList fullExemptions) {
        Intrinsics.checkNotNullParameter(limitExemptions, "limitExemptions");
        Intrinsics.checkNotNullParameter(fullExemptions, "fullExemptions");
        this.f226944a = limitExemptions;
        this.f226945b = fullExemptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f226944a.equals(dVar.f226944a) && this.f226945b.equals(dVar.f226945b);
    }

    public final int hashCode() {
        return this.f226945b.hashCode() + (this.f226944a.hashCode() * 31);
    }
}
