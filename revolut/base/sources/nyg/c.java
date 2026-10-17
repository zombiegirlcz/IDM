package nyg;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f220871a;

    public c(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220871a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220871a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f220871a.equals(((c) obj2).f220871a);
    }

    public final int hashCode() {
        return this.f220871a.hashCode();
    }
}
