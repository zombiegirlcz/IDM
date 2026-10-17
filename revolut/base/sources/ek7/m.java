package ek7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f126970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f126971b;

    public m(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126970a = items;
        this.f126971b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f126970a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f126970a.equals(mVar.f126970a) && this.f126971b == mVar.f126971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126971b) + (this.f126970a.hashCode() * 31);
    }
}
