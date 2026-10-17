package lx3;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import lv9.c;
import org.jmrtd.lds.LDSFile;
import w4l.i;
import wsg.n;
import xg6.j;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f200522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f200523b;

    public a(oe6.a externalInstitutionsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f200522a = walletInteractor;
        this.f200523b = externalInstitutionsInteractor;
    }

    public final r a() {
        return nim.a.w(kli.a.h(((j) this.f200523b).i(i.f294643c, oe6.b.f224551a), osg.b.e(this.f200522a, true, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG)), new c(this, 11));
    }
}
