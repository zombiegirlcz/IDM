package wn7;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ll7.a f298722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f298723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f298724r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, ll7.a applicationFormRepository, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(applicationFormRepository, "applicationFormRepository");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f298722p = applicationFormRepository;
        this.f298723q = policyRepository;
        this.f298724r = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        w4l.f fVar = ((ll7.h) this.f298722p).f196635h;
        Unit unit = Unit.f186387a;
        yji.l.a1(this, rd0.e.b(fVar.f(unit, true)), null, null, new k(this, null, 0), 3);
        yji.l.a1(this, ((e0) this.f298723q).f.c(unit, true), null, null, new k(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298724r;
    }
}
