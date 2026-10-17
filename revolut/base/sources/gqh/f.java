package gqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final moh.a f145732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145733c;

    public f() {
        this(null, 7);
    }

    public static f a(f fVar, String str, moh.a nameValidationStatus, String str2, int i) {
        if ((i & 1) != 0) {
            str = fVar.f145731a;
        }
        if ((i & 2) != 0) {
            nameValidationStatus = fVar.f145732b;
        }
        if ((i & 4) != 0) {
            str2 = fVar.f145733c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(nameValidationStatus, "nameValidationStatus");
        return new f(str, nameValidationStatus, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f145731a, fVar.f145731a) && this.f145732b == fVar.f145732b && Intrinsics.f(this.f145733c, fVar.f145733c);
    }

    public final int hashCode() {
        String str = this.f145731a;
        int iHashCode = (this.f145732b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f145733c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public f(String str, moh.a nameValidationStatus, String str2) {
        Intrinsics.checkNotNullParameter(nameValidationStatus, "nameValidationStatus");
        this.f145731a = str;
        this.f145732b = nameValidationStatus;
        this.f145733c = str2;
    }

    public /* synthetic */ f(String str, int i) {
        this(null, moh.a.INITIAL, (i & 4) != 0 ? null : str);
    }
}
