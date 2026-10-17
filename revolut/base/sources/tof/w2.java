package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273127c;

    public w2(String key, String name, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273125a = key;
        this.f273126b = name;
        this.f273127c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f273125a, w2Var.f273125a) && Intrinsics.f(this.f273126b, w2Var.f273126b) && Intrinsics.f(this.f273127c, w2Var.f273127c);
    }

    public final int hashCode() {
        return this.f273127c.hashCode() + p.a.c(this.f273125a.hashCode() * 31, 31, this.f273126b);
    }
}
