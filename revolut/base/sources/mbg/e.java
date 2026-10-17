package mbg;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f204210a;

    public e(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204210a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f204210a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f204210a.equals(((e) obj2).f204210a);
    }

    public final int hashCode() {
        return this.f204210a.hashCode();
    }
}
