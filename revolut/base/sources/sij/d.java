package sij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dfj.v2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sbb.w;
import tij.v;
import ukm.f;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v2 f263644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f263645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f263646n;

    public d(v2 esimProfilesInteractor, v esimTransferDialogBuilder) {
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(esimTransferDialogBuilder, "esimTransferDialogBuilder");
        this.f263644l = esimProfilesInteractor;
        this.f263645m = esimTransferDialogBuilder;
        this.f263646n = q.b(1, 1, f.DROP_OLDEST);
    }

    @Override // sij.b
    public final Flow Z2() {
        return this.f263646n;
    }

    @Override // sij.b
    public final void b3(EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        T2(new w(this, esimProfile, null, 12), new yi5.b(27));
    }
}
