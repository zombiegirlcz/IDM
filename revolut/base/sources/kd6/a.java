package kd6;

import akg.n;
import ang.b;
import hng.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f182811a;

    public a(l61.a userCompanyInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
                this.f182811a = userCompanyInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
                this.f182811a = userCompanyInteractor;
                break;
        }
    }

    public n a() {
        return nim.a.v(e.b(g.b(((b) this.f182811a).f7765a)), new kcd.a(19));
    }
}
