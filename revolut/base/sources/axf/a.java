package axf;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f10935c;

    public a(String username, String password, LocalDateTime expirationDate) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f10933a = username;
        this.f10934b = password;
        this.f10935c = expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f10933a, aVar.f10933a) && Intrinsics.f(this.f10934b, aVar.f10934b) && Intrinsics.f(this.f10935c, aVar.f10935c);
    }

    public final int hashCode() {
        return this.f10935c.hashCode() + p.a.c(this.f10933a.hashCode() * 31, 31, this.f10934b);
    }
}
