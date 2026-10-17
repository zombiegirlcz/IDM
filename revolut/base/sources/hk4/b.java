package hk4;

import je6.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import rd0.e;
import te0.w;
import vkm.d;
import w4l.i;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements zj4.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f152847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f152848b;

    public b(n walletInteractor, h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f152847a = walletInteractor;
        this.f152848b = externalInstitutionLogoMapper;
    }

    public final d a() {
        return e.b(w.f0(nim.a.w(mo3.a.n(osg.b.g(this.f152847a, i.f294643c, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG)), new hg4.a(this, 11))));
    }
}
