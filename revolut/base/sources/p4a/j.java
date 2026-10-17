package p4a;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ox5.r;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final am2.a f232871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f232872q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(am2.a profileTypeInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f232871p = profileTypeInteractor;
        this.f232872q = new d(null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mo3.a.g(rd0.e.b(this.f232871p.a()), null, new g(0), 1), null, null, new r(this, null, 8), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f232872q;
    }
}
