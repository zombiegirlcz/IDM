package uo7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281573b;

    public e(String registrationNumber, boolean z) {
        Intrinsics.checkNotNullParameter(registrationNumber, "registrationNumber");
        this.f281572a = registrationNumber;
        this.f281573b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f281572a, eVar.f281572a) && this.f281573b == eVar.f281573b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281573b) + (this.f281572a.hashCode() * 31);
    }
}
