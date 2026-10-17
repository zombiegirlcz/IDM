package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f215691c;

    public a(String type, String str, b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f215689a = type;
        this.f215690b = str;
        this.f215691c = bVar;
    }

    public final String a() {
        return this.f215690b;
    }

    public final b b() {
        return this.f215691c;
    }

    public final String c() {
        return this.f215689a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f215689a, aVar.f215689a) && Intrinsics.f(this.f215690b, aVar.f215690b) && Intrinsics.f(this.f215691c, aVar.f215691c);
    }

    public final int hashCode() {
        int iHashCode = this.f215689a.hashCode() * 31;
        String str = this.f215690b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f215691c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
