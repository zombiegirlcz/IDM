package ng5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f215112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f215113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215114c;
    public final String d;

    public a(b status, c cVar, String pickerDescription, String footer) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pickerDescription, "pickerDescription");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f215112a = status;
        this.f215113b = cVar;
        this.f215114c = pickerDescription;
        this.d = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f215112a == aVar.f215112a && Intrinsics.f(this.f215113b, aVar.f215113b) && Intrinsics.f(this.f215114c, aVar.f215114c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f215112a.hashCode() * 31;
        c cVar = this.f215113b;
        return this.d.hashCode() + p.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f215114c);
    }
}
