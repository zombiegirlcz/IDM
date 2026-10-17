package sil;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f263662a;

    public g(ArrayList groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f263662a = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f263662a.equals(((g) obj2).f263662a);
    }

    public final int hashCode() {
        return this.f263662a.hashCode();
    }
}
