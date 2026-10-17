package po7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f237895a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237895a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f237895a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f237895a.equals(((g) obj2).f237895a);
    }

    public final int hashCode() {
        return this.f237895a.hashCode();
    }
}
