package nr4;

import akg.n;
import bn2.p;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import kotlin.jvm.internal.Intrinsics;
import md6.e;
import nnf.h;
import om4.k3;
import w4d.j;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f218528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f218529b;

    public b(p backgroundsInteractor, k3 preferenceInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(preferenceInteractor, "preferenceInteractor");
        this.f218528a = backgroundsInteractor;
        this.f218529b = preferenceInteractor;
    }

    public final n a(String facilityId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(u0.m(this.f218528a.g(new RetailBackgroundKey.Credit(null, currency, new EntityInfo(e.CREDIT, null, null, 6))), this.f218529b.a(facilityId, w4l.j.f294644c)), new h(26));
    }
}
