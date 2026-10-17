package d58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111401c;

    public e(String phone, String displayPhone, String userName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(displayPhone, "displayPhone");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f111399a = phone;
        this.f111400b = displayPhone;
        this.f111401c = userName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f111399a, eVar.f111399a) && Intrinsics.f(this.f111400b, eVar.f111400b) && Intrinsics.f(this.f111401c, eVar.f111401c);
    }

    public final int hashCode() {
        return this.f111401c.hashCode() + p.a.c(this.f111399a.hashCode() * 31, 31, this.f111400b);
    }
}
