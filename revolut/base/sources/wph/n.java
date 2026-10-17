package wph;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final moh.a f299334c;
    public final String d;
    public final Data e;

    public n() {
        this(null, 31);
    }

    public static n a(n nVar, String str, moh.a nameValidationStatus, String str2, Data data, int i) {
        String str3 = str;
        String str4 = nVar.f299332a;
        if ((i & 2) != 0) {
            str3 = nVar.f299333b;
        }
        if ((i & 4) != 0) {
            nameValidationStatus = nVar.f299334c;
        }
        if ((i & 8) != 0) {
            str2 = nVar.d;
        }
        if ((i & 16) != 0) {
            data = nVar.e;
        }
        Data data2 = data;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(nameValidationStatus, "nameValidationStatus");
        String str5 = str2;
        return new n(str4, str3, nameValidationStatus, str5, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f299332a, nVar.f299332a) && Intrinsics.f(this.f299333b, nVar.f299333b) && this.f299334c == nVar.f299334c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        String str = this.f299332a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f299333b;
        int iHashCode2 = (this.f299334c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Data data = this.e;
        return iHashCode3 + (data != null ? data.hashCode() : 0);
    }

    public n(String str, String str2, moh.a nameValidationStatus, String str3, Data data) {
        Intrinsics.checkNotNullParameter(nameValidationStatus, "nameValidationStatus");
        this.f299332a = str;
        this.f299333b = str2;
        this.f299334c = nameValidationStatus;
        this.d = str3;
        this.e = data;
    }

    public /* synthetic */ n(String str, int i) {
        this((i & 1) != 0 ? null : str, null, moh.a.INITIAL, null, null);
    }
}
