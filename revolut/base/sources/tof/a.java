package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f272572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f272574c;

    public a(c type, String str, b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272572a = type;
        this.f272573b = str;
        this.f272574c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f272572a == aVar.f272572a && Intrinsics.f(this.f272573b, aVar.f272573b) && Intrinsics.f(this.f272574c, aVar.f272574c);
    }

    public final int hashCode() {
        int iHashCode = this.f272572a.hashCode() * 31;
        String str = this.f272573b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f272574c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
