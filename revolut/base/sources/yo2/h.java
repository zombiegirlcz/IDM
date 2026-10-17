package yo2;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f315545c;
    public final g d;
    public final String e;
    public final f f;

    public h(String title, String str, LocalDateTime localDateTime, g type, String str2, f action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f315543a = title;
        this.f315544b = str;
        this.f315545c = localDateTime;
        this.d = type;
        this.e = str2;
        this.f = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f315543a, hVar.f315543a) && Intrinsics.f(this.f315544b, hVar.f315544b) && Intrinsics.f(this.f315545c, hVar.f315545c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f315543a.hashCode() * 31;
        String str = this.f315544b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDateTime localDateTime = this.f315545c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31)) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
