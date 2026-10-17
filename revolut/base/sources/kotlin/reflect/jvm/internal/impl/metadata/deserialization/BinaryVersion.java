package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f187393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187395c;
    public final int d;
    public final List e;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BinaryVersion(@NotNull int... numbers) {
        List listD1;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f187393a = numbers;
        Integer numV = d.V(0, numbers);
        this.f187394b = numV != null ? numV.intValue() : -1;
        Integer numV2 = d.V(1, numbers);
        this.f187395c = numV2 != null ? numV2.intValue() : -1;
        Integer numV3 = d.V(2, numbers);
        this.d = numV3 != null ? numV3.intValue() : -1;
        if (numbers.length <= 3) {
            listD1 = f0.f322471a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(j6.a.t(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, CoreConstants.DOT));
            }
            Intrinsics.checkNotNullParameter(numbers, "<this>");
            listD1 = d0.d1(new c(new o(numbers, 1), 3, numbers.length));
        }
        this.e = listD1;
    }

    public boolean equals(Object obj2) {
        if (obj2 == null || !getClass().equals(obj2.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj2;
        return this.f187394b == binaryVersion.f187394b && this.f187395c == binaryVersion.f187395c && this.d == binaryVersion.d && Intrinsics.f(this.e, binaryVersion.e);
    }

    public final int getMajor() {
        return this.f187394b;
    }

    public final int getMinor() {
        return this.f187395c;
    }

    public int hashCode() {
        int i = this.f187394b;
        int i2 = (i * 31) + this.f187395c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.f187394b, version.f187395c, version.d);
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i5 = this.f187394b;
        if (i5 < i) {
            return true;
        }
        if (i5 > i) {
            return false;
        }
        int i6 = this.f187395c;
        if (i6 < i2) {
            return true;
        }
        return i6 <= i2 && this.d <= i3;
    }

    @NotNull
    public final int[] toArray() {
        return this.f187393a;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : d0.k0(arrayList, ".", null, null, 0, null, 62);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i5 = this.f187394b;
        if (i5 > i) {
            return true;
        }
        if (i5 < i) {
            return false;
        }
        int i6 = this.f187395c;
        if (i6 > i2) {
            return true;
        }
        return i6 >= i2 && this.d >= i3;
    }
}
