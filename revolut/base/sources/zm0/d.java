package zm0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f323320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f323321c;

    public d(String value, e type, int i) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f323319a = value;
        this.f323320b = type;
        this.f323321c = null;
        if (type == e.TRANSIENT || !d0.W(value)) {
            return;
        }
        throw new IllegalArgumentException(("OTP can not be empty for non-transient code type=" + type).toString());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f323319a, dVar.f323319a) && this.f323320b == dVar.f323320b && Intrinsics.f(this.f323321c, dVar.f323321c);
    }

    public final int hashCode() {
        int iHashCode = (this.f323320b.hashCode() + (this.f323319a.hashCode() * 31)) * 961;
        Object obj2 = this.f323321c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
