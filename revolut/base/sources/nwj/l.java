package nwj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f219953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f219954b;

    public l(h user, q token) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f219953a = user;
        this.f219954b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f219953a, lVar.f219953a) && Intrinsics.f(this.f219954b, lVar.f219954b);
    }

    @Override // nwj.n
    public final q getToken() {
        return this.f219954b;
    }

    public final int hashCode() {
        return this.f219954b.hashCode() + (this.f219953a.hashCode() * 31);
    }
}
