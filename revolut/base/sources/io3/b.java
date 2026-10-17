package io3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f163142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163143b;

    public b(a type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f163142a = type;
        this.f163143b = value;
    }

    public final a a() {
        return this.f163142a;
    }

    public final String b() {
        return this.f163143b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f163142a == bVar.f163142a && Intrinsics.f(this.f163143b, bVar.f163143b);
    }

    public final int hashCode() {
        return this.f163143b.hashCode() + (this.f163142a.hashCode() * 31);
    }
}
