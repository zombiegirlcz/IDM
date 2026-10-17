package qa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f243931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f243932c;
    public final int d;
    public final d e;

    public b(String serialNumber, String firmwareVersion, String bluetoothFirmwareVersion, int i, d internalState) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion, "bluetoothFirmwareVersion");
        Intrinsics.checkNotNullParameter(internalState, "internalState");
        this.f243930a = serialNumber;
        this.f243931b = firmwareVersion;
        this.f243932c = bluetoothFirmwareVersion;
        this.d = i;
        this.e = internalState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f243930a, bVar.f243930a) && Intrinsics.f(this.f243931b, bVar.f243931b) && Intrinsics.f(this.f243932c, bVar.f243932c) && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, p.a.c(p.a.c(this.f243930a.hashCode() * 31, 31, this.f243931b), 31, this.f243932c), 31);
    }
}
