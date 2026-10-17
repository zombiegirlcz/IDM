package o5l;

import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements Serializable {

    @NotNull
    public static final q Companion = new q();
    public static final r e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f222477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f222478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f222479c;
    public final v d;

    static {
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.d;
        e = new r(dVar, dVar, null, null);
    }

    public r(dj0.d total, dj0.d fee2, ArrayList arrayList, v vVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f222477a = total;
        this.f222478b = fee2;
        this.f222479c = arrayList;
        this.d = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f222477a, rVar.f222477a) && Intrinsics.f(this.f222478b, rVar.f222478b) && Intrinsics.f(this.f222479c, rVar.f222479c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f222477a.hashCode() * 31, 31, this.f222478b);
        List list = this.f222479c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        v vVar = this.d;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }
}
