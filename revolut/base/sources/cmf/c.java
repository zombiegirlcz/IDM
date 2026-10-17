package cmf;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yk5.a f25223a;

    public c(yk5.a cryptoActionRequiredDeposit) {
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposit, "cryptoActionRequiredDeposit");
        this.f25223a = cryptoActionRequiredDeposit;
        yk5.d dVar = cryptoActionRequiredDeposit.f314568c;
    }

    @Override // cmf.n
    public final boolean a() {
        return this.f25223a.d.contains(yk5.f.GAMBLING_BLOCK);
    }

    @Override // cmf.n
    public final boolean b() {
        return this.f25223a.f314567b == yk5.e.AVAILABLE_FOR_RETURN;
    }

    @Override // cmf.n
    public final boolean c() {
        return this.f25223a.d.contains(yk5.f.UNSUPPORTED_EMT);
    }

    @Override // cmf.n
    public final boolean d() {
        return this.f25223a.d.contains(yk5.f.UNSUPPORTED_ASSET);
    }

    @Override // cmf.n
    public final boolean e() {
        return this.f25223a.d.contains(yk5.f.EXCHANGE_BLACKLIST_MATCH);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f25223a, ((c) obj2).f25223a);
    }

    @Override // cmf.n
    public final boolean f() {
        return this.f25223a.f314567b == yk5.e.RETURNING;
    }

    @Override // cmf.n
    public final boolean g() {
        return this.f25223a.f314567b == yk5.e.RETURNED;
    }

    @Override // cmf.n
    public final Long h() {
        Instant instant;
        yk5.d dVar = this.f25223a.f314568c;
        if (dVar == null || (instant = dVar.f314573a) == null) {
            return null;
        }
        return Long.valueOf(instant.toEpochMilli());
    }

    public final int hashCode() {
        return this.f25223a.hashCode();
    }

    @Override // cmf.n
    public final boolean i() {
        return b() && this.f25223a.f314568c == null;
    }

    @Override // cmf.n
    public final boolean j() {
        return this.f25223a.d.contains(yk5.f.CURRENCY_DELISTED);
    }

    @Override // cmf.n
    public final boolean k() {
        return this.f25223a.d.contains(yk5.f.USER_RESTRICTED);
    }

    @Override // cmf.n
    public final boolean l() {
        return b() && this.f25223a.f314568c != null;
    }
}
