package qnc;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f247934a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247934a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f247934a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f247934a.equals(((d) obj2).f247934a);
    }

    public final int hashCode() {
        return this.f247934a.hashCode();
    }
}
