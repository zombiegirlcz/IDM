package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f155289b;

    public k(String value, j type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f155288a = value;
        this.f155289b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f155288a, kVar.f155288a) && this.f155289b == kVar.f155289b;
    }

    public final int hashCode() {
        return this.f155289b.hashCode() + (this.f155288a.hashCode() * 31);
    }
}
