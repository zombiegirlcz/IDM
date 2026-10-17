package il5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162088b;

    public e(String pocketId, String type) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f162087a = pocketId;
        this.f162088b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162087a, eVar.f162087a) && Intrinsics.f(this.f162088b, eVar.f162088b);
    }

    public final int hashCode() {
        return this.f162088b.hashCode() + (this.f162087a.hashCode() * 31);
    }
}
