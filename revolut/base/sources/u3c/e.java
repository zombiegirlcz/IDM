package u3c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f276897b;

    public e(Data ippUserCart, Data vatType) {
        Intrinsics.checkNotNullParameter(ippUserCart, "ippUserCart");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        this.f276896a = ippUserCart;
        this.f276897b = vatType;
    }

    public static e a(e eVar, Data ippUserCart, Data vatType, int i) {
        if ((i & 1) != 0) {
            ippUserCart = eVar.f276896a;
        }
        if ((i & 2) != 0) {
            vatType = eVar.f276897b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(ippUserCart, "ippUserCart");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        return new e(ippUserCart, vatType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276896a, eVar.f276896a) && Intrinsics.f(this.f276897b, eVar.f276897b);
    }

    public final int hashCode() {
        return this.f276897b.hashCode() + (this.f276896a.hashCode() * 31);
    }
}
