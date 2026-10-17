package qp7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f248309a;

    public l(ArrayList benefits) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f248309a = benefits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f248309a.equals(((l) obj2).f248309a);
    }

    public final int hashCode() {
        return this.f248309a.hashCode();
    }
}
