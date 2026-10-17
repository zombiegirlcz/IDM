package iy1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f169603b;

    public g(ArrayList arrayList, Integer num) {
        this.f169602a = arrayList;
        this.f169603b = num;
    }

    public final Integer a() {
        return this.f169603b;
    }

    public final List b() {
        return this.f169602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f169602a, gVar.f169602a) && Intrinsics.f(this.f169603b, gVar.f169603b);
    }

    public final int hashCode() {
        List list = this.f169602a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f169603b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
