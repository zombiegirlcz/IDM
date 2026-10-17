package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272838c;

    public j(String label, String name, String value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f272836a = label;
        this.f272837b = name;
        this.f272838c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f272836a, jVar.f272836a) && Intrinsics.f(this.f272837b, jVar.f272837b) && Intrinsics.f(this.f272838c, jVar.f272838c);
    }

    public final int hashCode() {
        return this.f272838c.hashCode() + p.a.c(this.f272836a.hashCode() * 31, 31, this.f272837b);
    }
}
