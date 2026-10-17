package ew8;

import cli.g;
import cli.k;
import cli.y;
import cli.z;
import com.revolut.feature.kyc.impl.idnow.eid.screen.IdnowEidScreenContract$InputData;
import ebg.o;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements z {
    public final IdnowEidScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d4m.a f130110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f130111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f130112r;

    public e(IdnowEidScreenContract$InputData inputData, d4m.a eidSdk) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(eidSdk, "eidSdk");
        this.o = inputData;
        this.f130110p = eidSdk;
        this.f130111q = mra.d.b(this, k.f25028a, new a54.b(8), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new o(this, null, 29), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f130111q;
    }
}
