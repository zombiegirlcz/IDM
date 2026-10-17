package e54;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f122748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f122749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f122750c;
    public final String d;
    public final Clause e;
    public final dx4.x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f122751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditAmountInputScreenContract$Configuration f122752h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dx4.t f122753j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f122754l;

    public m(long j2, long j3, Long l2, String rawAmount, Clause title, dx4.x xVar, Clause button, CreditAmountInputScreenContract$Configuration configuration, boolean z, dx4.t amountType, List infoRanges, boolean z3) {
        Intrinsics.checkNotNullParameter(rawAmount, "rawAmount");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(infoRanges, "infoRanges");
        this.f122748a = j2;
        this.f122749b = j3;
        this.f122750c = l2;
        this.d = rawAmount;
        this.e = title;
        this.f = xVar;
        this.f122751g = button;
        this.f122752h = configuration;
        this.i = z;
        this.f122753j = amountType;
        this.k = infoRanges;
        this.f122754l = z3;
    }

    public static m a(m mVar, long j2, long j3, Long l2, String str, Clause clause, Clause clause2, CreditAmountInputScreenContract$Configuration creditAmountInputScreenContract$Configuration, boolean z, dx4.t tVar, List list, boolean z3, int i) {
        long j5 = (i & 1) != 0 ? mVar.f122748a : j2;
        long j16 = (i & 2) != 0 ? mVar.f122749b : j3;
        Long l3 = (i & 4) != 0 ? mVar.f122750c : l2;
        String rawAmount = (i & 8) != 0 ? mVar.d : str;
        Clause title = (i & 16) != 0 ? mVar.e : clause;
        dx4.x xVar = mVar.f;
        Clause button = (i & 64) != 0 ? mVar.f122751g : clause2;
        CreditAmountInputScreenContract$Configuration configuration = (i & 128) != 0 ? mVar.f122752h : creditAmountInputScreenContract$Configuration;
        boolean z4 = (i & 256) != 0 ? mVar.i : z;
        dx4.t amountType = (i & 512) != 0 ? mVar.f122753j : tVar;
        List infoRanges = (i & 1024) != 0 ? mVar.k : list;
        boolean z6 = (i & 2048) != 0 ? mVar.f122754l : z3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(rawAmount, "rawAmount");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(infoRanges, "infoRanges");
        return new m(j5, j16, l3, rawAmount, title, xVar, button, configuration, z4, amountType, infoRanges, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f122748a == mVar.f122748a && this.f122749b == mVar.f122749b && Intrinsics.f(this.f122750c, mVar.f122750c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f122751g, mVar.f122751g) && Intrinsics.f(this.f122752h, mVar.f122752h) && this.i == mVar.i && Intrinsics.f(this.f122753j, mVar.f122753j) && Intrinsics.f(this.k, mVar.k) && this.f122754l == mVar.f122754l;
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.f122748a) * 31, 31, this.f122749b);
        Long l2 = this.f122750c;
        int iA = p.a.a(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e);
        dx4.x xVar = this.f;
        return Boolean.hashCode(this.f122754l) + p.a.d((this.f122753j.hashCode() + j6.a.c((this.f122752h.hashCode() + p.a.a((iA + (xVar != null ? xVar.hashCode() : 0)) * 31, 31, this.f122751g)) * 31, 31, this.i)) * 31, 31, this.k);
    }
}
