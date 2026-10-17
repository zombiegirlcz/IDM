package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f292387c;

    public o(String code, String label, q value) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f292385a = code;
        this.f292386b = label;
        this.f292387c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f292385a, oVar.f292385a) && Intrinsics.f(this.f292386b, oVar.f292386b) && Intrinsics.f(this.f292387c, oVar.f292387c);
    }

    public final int hashCode() {
        return this.f292387c.hashCode() + p.a.c(this.f292385a.hashCode() * 31, 31, this.f292386b);
    }
}
