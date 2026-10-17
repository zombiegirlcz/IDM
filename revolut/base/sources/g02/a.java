package g02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f139250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139252c;

    public a(b type, String id10, String iban) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.f139250a = type;
        this.f139251b = id10;
        this.f139252c = iban;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f139250a == aVar.f139250a && Intrinsics.f(this.f139251b, aVar.f139251b) && Intrinsics.f(this.f139252c, aVar.f139252c);
    }

    public final int hashCode() {
        return this.f139252c.hashCode() + p.a.c(this.f139250a.hashCode() * 31, 31, this.f139251b);
    }
}
