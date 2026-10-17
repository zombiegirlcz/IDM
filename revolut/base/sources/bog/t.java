package bog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f17456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f17458c;

    public t(d firstName, f firstSurname, p secondSurname) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
        Intrinsics.checkNotNullParameter(secondSurname, "secondSurname");
        this.f17456a = firstName;
        this.f17457b = firstSurname;
        this.f17458c = secondSurname;
    }

    public static t a(t tVar, d firstName, f firstSurname, p secondSurname, int i) {
        if ((i & 1) != 0) {
            firstName = tVar.f17456a;
        }
        if ((i & 2) != 0) {
            firstSurname = tVar.f17457b;
        }
        if ((i & 4) != 0) {
            secondSurname = tVar.f17458c;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
        Intrinsics.checkNotNullParameter(secondSurname, "secondSurname");
        return new t(firstName, firstSurname, secondSurname);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f17456a, tVar.f17456a) && Intrinsics.f(this.f17457b, tVar.f17457b) && Intrinsics.f(this.f17458c, tVar.f17458c);
    }

    public final int hashCode() {
        return this.f17458c.hashCode() + ((this.f17457b.hashCode() + (this.f17456a.hashCode() * 31)) * 31);
    }
}
