package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290273b;

    public m(String label, String value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f290272a = label;
        this.f290273b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f290272a, mVar.f290272a) && Intrinsics.f(this.f290273b, mVar.f290273b);
    }

    public final int hashCode() {
        return this.f290273b.hashCode() + (this.f290272a.hashCode() * 31);
    }
}
