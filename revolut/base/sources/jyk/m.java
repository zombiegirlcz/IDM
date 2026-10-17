package jyk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179493a;

    public m(ArrayList arrayList) {
        this.f179493a = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f179493a, ((m) obj2).f179493a);
    }

    public final int hashCode() {
        List list = this.f179493a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
