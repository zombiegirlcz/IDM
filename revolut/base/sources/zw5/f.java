package zw5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325732a;

    public f(List currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f325732a = currencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f325732a, ((f) obj2).f325732a);
    }

    public final int hashCode() {
        return this.f325732a.hashCode();
    }
}
