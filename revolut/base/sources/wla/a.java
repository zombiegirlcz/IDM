package wla;

import do3.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f298460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f298462c;
    public final au8.a d;

    public a(n user, List taxResidencies, List accountPurposes, au8.a nameChangeState) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(accountPurposes, "accountPurposes");
        Intrinsics.checkNotNullParameter(nameChangeState, "nameChangeState");
        this.f298460a = user;
        this.f298461b = taxResidencies;
        this.f298462c = accountPurposes;
        this.d = nameChangeState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298460a, aVar.f298460a) && Intrinsics.f(this.f298461b, aVar.f298461b) && Intrinsics.f(this.f298462c, aVar.f298462c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f298460a.hashCode() * 31, 31, this.f298461b), 31, this.f298462c);
    }
}
