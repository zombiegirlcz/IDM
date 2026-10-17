package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151880a;

    public p(ArrayList cities) {
        Intrinsics.checkNotNullParameter(cities, "cities");
        this.f151880a = cities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f151880a.equals(((p) obj2).f151880a);
    }

    public final int hashCode() {
        return this.f151880a.hashCode();
    }
}
