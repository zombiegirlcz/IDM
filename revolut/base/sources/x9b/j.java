package x9b;

import cli.y;
import do3.s;
import kotlin.jvm.internal.Intrinsics;
import nd.m;
import org.jetbrains.annotations.NotNull;
import r10.q;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements d {

    @NotNull
    public static final h Companion = new h();
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f303657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f303658q;

    public j(k stateMapper, q userRegisteredIdentitiesInteractor, m switchCountryProfileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(switchCountryProfileInteractor, "switchCountryProfileInteractor");
        this.o = userRegisteredIdentitiesInteractor;
        this.f303657p = switchCountryProfileInteractor;
        this.f303658q = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.j0(this.o, do3.f.BANKING, v.k(s.CREATED, s.ACTIVE), 4), null, null, new x64.b(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f303658q;
    }
}
