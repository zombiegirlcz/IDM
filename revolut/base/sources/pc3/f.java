package pc3;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f234815a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f234815a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f234815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f234815a.equals(((f) obj2).f234815a);
    }

    public final int hashCode() {
        return this.f234815a.hashCode();
    }
}
