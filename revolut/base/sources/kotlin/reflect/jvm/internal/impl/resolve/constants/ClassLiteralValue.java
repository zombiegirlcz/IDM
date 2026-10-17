package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassId f187580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187581b;

    public ClassLiteralValue(@NotNull ClassId classId, int i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f187580a = classId;
        this.f187581b = i;
    }

    @NotNull
    public final ClassId component1() {
        return this.f187580a;
    }

    public final int component2() {
        return this.f187581b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj2;
        return Intrinsics.f(this.f187580a, classLiteralValue.f187580a) && this.f187581b == classLiteralValue.f187581b;
    }

    public final int getArrayNestedness() {
        return this.f187581b;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.f187580a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f187581b) + (this.f187580a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        int i;
        StringBuilder sb6 = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f187581b;
            if (i2 >= i) {
                break;
            }
            sb6.append("kotlin/Array<");
            i2++;
        }
        sb6.append(this.f187580a);
        for (int i3 = 0; i3 < i; i3++) {
            sb6.append(">");
        }
        return sb6.toString();
    }
}
