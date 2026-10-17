package vd4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287779c;
    public final h d;
    public final boolean e;

    public e(String documentPath, String documentName, String str, h hVar, boolean z) {
        Intrinsics.checkNotNullParameter(documentPath, "documentPath");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        this.f287777a = documentPath;
        this.f287778b = documentName;
        this.f287779c = str;
        this.d = hVar;
        this.e = z;
    }

    public static e a(e eVar, String str, h hVar, boolean z, int i) {
        String documentPath = eVar.f287777a;
        String documentName = eVar.f287778b;
        if ((i & 4) != 0) {
            str = eVar.f287779c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            hVar = eVar.d;
        }
        h hVar2 = hVar;
        if ((i & 16) != 0) {
            z = eVar.e;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(documentPath, "documentPath");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        return new e(documentPath, documentName, str2, hVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f287777a, eVar.f287777a) && Intrinsics.f(this.f287778b, eVar.f287778b) && Intrinsics.f(this.f287779c, eVar.f287779c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f287777a.hashCode() * 31, 31, this.f287778b);
        String str = this.f287779c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }
}
