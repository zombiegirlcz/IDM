package prf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239008b;

    public e(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f239007a = type;
        this.f239008b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239007a, eVar.f239007a) && Intrinsics.f(this.f239008b, eVar.f239008b);
    }

    public final int hashCode() {
        return this.f239008b.hashCode() + (this.f239007a.hashCode() * 31);
    }
}
