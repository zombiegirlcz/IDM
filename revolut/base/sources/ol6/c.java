package ol6;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nt4.f;
import oki.h;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements j {
    public final l61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f226341p;

    public c(l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = userCompanyInteractor;
        this.f226341p = d.a(this, new b(0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 26), new ok7.c(this, 2));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f226341p;
    }
}
