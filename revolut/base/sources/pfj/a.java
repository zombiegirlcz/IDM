package pfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235600b;

    public a(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f235599a = title;
        this.f235600b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f235599a, aVar.f235599a) && Intrinsics.f(this.f235600b, aVar.f235600b);
    }

    public final int hashCode() {
        return this.f235600b.hashCode() + (this.f235599a.hashCode() * 31);
    }
}
