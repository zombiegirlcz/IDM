package qij;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f246729a;

    public d(ArrayList esimProfiles) {
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f246729a = esimProfiles;
    }

    @Override // qij.k
    public final long a() {
        return 2000L;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f246729a.equals(((d) obj2).f246729a);
    }

    public final int hashCode() {
        return this.f246729a.hashCode();
    }
}
