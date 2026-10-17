package h26;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f148714c = {null, yhm.j.c(yhm.k.PUBLICATION, new gx2.a(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148716b;

    public /* synthetic */ f(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(d.f148713a.getDescriptor(), i, 3);
            throw null;
        }
        this.f148715a = str;
        this.f148716b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f148715a, fVar.f148715a) && Intrinsics.f(this.f148716b, fVar.f148716b);
    }

    public final int hashCode() {
        return this.f148716b.hashCode() + (this.f148715a.hashCode() * 31);
    }

    public f(String previousRangeCloseRate, ArrayList points) {
        Intrinsics.checkNotNullParameter(previousRangeCloseRate, "previousRangeCloseRate");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f148715a = previousRangeCloseRate;
        this.f148716b = points;
    }
}
