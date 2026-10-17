package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272862c;
    public final String d;

    public j6(String label, String value, String optionType, String fieldType) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        this.f272860a = label;
        this.f272861b = value;
        this.f272862c = optionType;
        this.d = fieldType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj2;
        return Intrinsics.f(this.f272860a, j6Var.f272860a) && Intrinsics.f(this.f272861b, j6Var.f272861b) && Intrinsics.f(this.f272862c, j6Var.f272862c) && Intrinsics.f(this.d, j6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f272860a.hashCode() * 31, 31, this.f272861b), 31, this.f272862c);
    }
}
