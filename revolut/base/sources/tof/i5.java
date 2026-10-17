package tof;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272802b;

    public i5(String key, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f272801a = key;
        this.f272802b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj2;
        return Intrinsics.f(this.f272801a, i5Var.f272801a) && Intrinsics.f(this.f272802b, i5Var.f272802b);
    }

    public final int hashCode() {
        int iHashCode = this.f272801a.hashCode() * 31;
        List list = this.f272802b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
