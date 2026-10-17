package wpc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f299220b;

    public d(String str, e mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f299219a = str;
        this.f299220b = mode;
    }

    @Override // wpc.f
    public final e M() {
        return this.f299220b;
    }

    @Override // wpc.f
    public final String a() {
        return this.f299219a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f299219a, dVar.f299219a) && this.f299220b == dVar.f299220b;
    }

    public final int hashCode() {
        String str = this.f299219a;
        return this.f299220b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
