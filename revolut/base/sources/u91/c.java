package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278346c;

    public c(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f278344a = title;
        this.f278345b = str;
        this.f278346c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278344a, cVar.f278344a) && Intrinsics.f(this.f278345b, cVar.f278345b) && Intrinsics.f(this.f278346c, cVar.f278346c);
    }

    public final int hashCode() {
        int iHashCode = this.f278344a.hashCode() * 31;
        String str = this.f278345b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f278346c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
