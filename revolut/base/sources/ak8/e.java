package ak8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5737b;

    public e(String mail, String existingMail) {
        Intrinsics.checkNotNullParameter(mail, "mail");
        Intrinsics.checkNotNullParameter(existingMail, "existingMail");
        this.f5736a = mail;
        this.f5737b = existingMail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f5736a, eVar.f5736a) && Intrinsics.f(this.f5737b, eVar.f5737b);
    }

    public final int hashCode() {
        return this.f5737b.hashCode() + (this.f5736a.hashCode() * 31);
    }
}
