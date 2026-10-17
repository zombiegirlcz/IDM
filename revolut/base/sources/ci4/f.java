package ci4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24370c;
    public final String d;

    public f(String solicitorName, String email, String contactName, String phoneNumber) {
        Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(contactName, "contactName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f24368a = solicitorName;
        this.f24369b = email;
        this.f24370c = contactName;
        this.d = phoneNumber;
    }

    public static f a(f fVar, String solicitorName, String email, String contactName, String phoneNumber, int i) {
        if ((i & 1) != 0) {
            solicitorName = fVar.f24368a;
        }
        if ((i & 2) != 0) {
            email = fVar.f24369b;
        }
        if ((i & 4) != 0) {
            contactName = fVar.f24370c;
        }
        if ((i & 8) != 0) {
            phoneNumber = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(contactName, "contactName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new f(solicitorName, email, contactName, phoneNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f24368a, fVar.f24368a) && Intrinsics.f(this.f24369b, fVar.f24369b) && Intrinsics.f(this.f24370c, fVar.f24370c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f24368a.hashCode() * 31, 31, this.f24369b), 31, this.f24370c);
    }
}
