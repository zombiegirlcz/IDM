package j18;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] f = {yhm.j.c(yhm.k.PUBLICATION, new j(2)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f170157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f170158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f170159c;
    public final Integer d;
    public final Instant e;

    public /* synthetic */ u(int i, s sVar, ej0.b bVar, BigDecimal bigDecimal, Integer num, Instant instant) {
        if (31 != (i & 31)) {
            j1.f(q.f170156a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170157a = sVar;
        this.f170158b = bVar;
        this.f170159c = bigDecimal;
        this.d = num;
        this.e = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f170157a == uVar.f170157a && Intrinsics.f(this.f170158b, uVar.f170158b) && Intrinsics.f(this.f170159c, uVar.f170159c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f170158b, this.f170157a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f170159c;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }
}
