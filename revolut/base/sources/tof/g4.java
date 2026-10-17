package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.p f272766a;

    public g4(kq2.p pVar) {
        this.f272766a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g4) && Intrinsics.f(this.f272766a, ((g4) obj2).f272766a);
    }

    public final int hashCode() {
        kq2.p pVar = this.f272766a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
