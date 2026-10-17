package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f325857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325858b;

    public v(dj0.d totalAmount, ArrayList pets) {
        Intrinsics.checkNotNullParameter(pets, "pets");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f325857a = pets;
        this.f325858b = totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f325857a.equals(vVar.f325857a) && this.f325858b.equals(vVar.f325858b);
    }

    public final int hashCode() {
        return this.f325858b.hashCode() + (this.f325857a.hashCode() * 31);
    }
}
