package du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117497c;
    public final yt.a d;

    public j(String documentNumber, String dateOfBirth, String dateOfExpiry, yt.a documentType) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f117495a = documentNumber;
        this.f117496b = dateOfBirth;
        this.f117497c = dateOfExpiry;
        this.d = documentType;
    }

    public static j a(j jVar, String documentNumber, String dateOfBirth, String dateOfExpiry, int i) {
        if ((i & 1) != 0) {
            documentNumber = jVar.f117495a;
        }
        if ((i & 2) != 0) {
            dateOfBirth = jVar.f117496b;
        }
        if ((i & 4) != 0) {
            dateOfExpiry = jVar.f117497c;
        }
        yt.a documentType = jVar.d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return new j(documentNumber, dateOfBirth, dateOfExpiry, documentType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f117495a, jVar.f117495a) && Intrinsics.f(this.f117496b, jVar.f117496b) && Intrinsics.f(this.f117497c, jVar.f117497c) && this.d == jVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f117495a.hashCode() * 31, 31, this.f117496b), 31, this.f117497c);
    }
}
