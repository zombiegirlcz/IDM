package a17;

import et6.h1;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f556q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h1 freelancerInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f555p = freelancerInteractor;
        this.f556q = j.f175191a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f556q;
    }
}
