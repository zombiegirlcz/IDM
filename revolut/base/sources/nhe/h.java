package nhe;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f215425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f215426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.d f215427c;

    public h(i type, AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f215425a = type;
        this.f215426b = accountId;
        this.f215427c = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f215425a == hVar.f215425a && Intrinsics.f(this.f215426b, hVar.f215426b) && Intrinsics.f(this.f215427c, hVar.f215427c);
    }

    public final int hashCode() {
        return this.f215427c.hashCode() + h30.l.b(this.f215426b, this.f215425a.hashCode() * 31, 31);
    }
}
