package xk5;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f306608a;

    public a(Map indexByCurrencyCode) {
        Intrinsics.checkNotNullParameter(indexByCurrencyCode, "indexByCurrencyCode");
        this.f306608a = indexByCurrencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f306608a, ((a) obj2).f306608a);
    }

    public final int hashCode() {
        return this.f306608a.hashCode();
    }
}
