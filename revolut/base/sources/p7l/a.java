package p7l;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f233792c;

    public a(String str, String str2, LocalDate localDate) {
        this.f233790a = str;
        this.f233791b = str2;
        this.f233792c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f233790a, aVar.f233790a) && Intrinsics.f(this.f233791b, aVar.f233791b) && Intrinsics.f(this.f233792c, aVar.f233792c);
    }

    public final int hashCode() {
        String str = this.f233790a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f233791b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f233792c;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }
}
