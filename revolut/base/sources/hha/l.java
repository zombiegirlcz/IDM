package hha;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152320a;

    public l(ArrayList arrayList) {
        this.f152320a = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f152320a, ((l) obj2).f152320a);
    }

    public final int hashCode() {
        List list = this.f152320a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
