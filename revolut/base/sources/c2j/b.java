package c2j;

import cli.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20818a;

    public b(ArrayList savingsWithDisclaimers) {
        Intrinsics.checkNotNullParameter(savingsWithDisclaimers, "savingsWithDisclaimers");
        this.f20818a = savingsWithDisclaimers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f20818a.equals(((b) obj2).f20818a);
    }

    public final int hashCode() {
        return this.f20818a.hashCode();
    }
}
