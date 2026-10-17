package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249284c;
    public final String d;

    public a0(String label, String value, String optionType, String fieldType) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        this.f249282a = label;
        this.f249283b = value;
        this.f249284c = optionType;
        this.d = fieldType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f249282a, a0Var.f249282a) && Intrinsics.f(this.f249283b, a0Var.f249283b) && Intrinsics.f(this.f249284c, a0Var.f249284c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f249282a.hashCode() * 31, 31, this.f249283b), 31, this.f249284c);
    }
}
