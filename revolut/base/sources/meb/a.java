package meb;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204640c;

    public a(int i, List values, int i2) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f204638a = i;
        this.f204639b = values;
        this.f204640c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f204638a == aVar.f204638a && Intrinsics.f(this.f204639b, aVar.f204639b) && this.f204640c == aVar.f204640c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204640c) + p.a.d(Integer.hashCode(this.f204638a) * 31, 31, this.f204639b);
    }
}
