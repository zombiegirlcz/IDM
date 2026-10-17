package ug5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f279928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f279930c;

    public a(List column1, List column2, List column3) {
        Intrinsics.checkNotNullParameter(column1, "column1");
        Intrinsics.checkNotNullParameter(column2, "column2");
        Intrinsics.checkNotNullParameter(column3, "column3");
        this.f279928a = column1;
        this.f279929b = column2;
        this.f279930c = column3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f279928a, aVar.f279928a) && Intrinsics.f(this.f279929b, aVar.f279929b) && Intrinsics.f(this.f279930c, aVar.f279930c);
    }

    public final int hashCode() {
        return this.f279930c.hashCode() + p.a.d(this.f279928a.hashCode() * 31, 31, this.f279929b);
    }
}
