package j8l;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f172238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f172239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f172240c;
    public final d d;
    public final j e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MoveMoneyReason f172241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f172242h;

    public /* synthetic */ k(long j2, h hVar, h hVar2, d dVar, j jVar) {
        this(j2, hVar, hVar2, dVar, jVar, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f172238a == kVar.f172238a && Intrinsics.f(this.f172239b, kVar.f172239b) && Intrinsics.f(this.f172240c, kVar.f172240c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f172241g, kVar.f172241g) && Intrinsics.f(this.f172242h, kVar.f172242h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f172240c.hashCode() + ((this.f172239b.hashCode() + (Long.hashCode(this.f172238a) * 31)) * 31)) * 31)) * 31;
        j jVar = this.e;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        MoveMoneyReason moveMoneyReason = this.f172241g;
        int iHashCode4 = (iHashCode3 + (moveMoneyReason == null ? 0 : moveMoneyReason.hashCode())) * 31;
        String str = this.f172242h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public k(long j2, h source, h target, d buyMode, j jVar, Integer num, MoveMoneyReason moveMoneyReason, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(buyMode, "buyMode");
        this.f172238a = j2;
        this.f172239b = source;
        this.f172240c = target;
        this.d = buyMode;
        this.e = jVar;
        this.f = num;
        this.f172241g = moveMoneyReason;
        this.f172242h = str;
    }
}
