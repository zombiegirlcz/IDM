package xel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f304701c;

    public a(String rawValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f304699a = rawValue;
        this.f304700b = formattedValue;
        this.f304701c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304699a, aVar.f304699a) && Intrinsics.f(this.f304700b, aVar.f304700b) && this.f304701c == aVar.f304701c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304701c) + p.a.c(this.f304699a.hashCode() * 31, 31, this.f304700b);
    }
}
