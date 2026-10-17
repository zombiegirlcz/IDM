package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273047a;

    public s7(String str) {
        this.f273047a = str;
    }

    public final String a() {
        return this.f273047a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s7) && Intrinsics.f(this.f273047a, ((s7) obj2).f273047a);
    }

    public final int hashCode() {
        String str = this.f273047a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
