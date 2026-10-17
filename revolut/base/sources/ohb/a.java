package ohb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225335c;
    public final String d;

    public a(String str, String str2, String str3, List contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f225333a = contacts;
        this.f225334b = str;
        this.f225335c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f225333a, aVar.f225333a) && Intrinsics.f(this.f225334b, aVar.f225334b) && Intrinsics.f(this.f225335c, aVar.f225335c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f225333a.hashCode() * 31;
        String str = this.f225334b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225335c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
