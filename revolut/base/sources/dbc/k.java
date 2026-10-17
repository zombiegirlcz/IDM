package dbc;

import a3e.u;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final usc.a f112716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b6c.c f112717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kcc.a f112718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f112719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f112720t;

    public k(q revolutPayManagementInteractor, usc.a deliveryInteractor, b6c.c revolutPayInfoInteractor, kcc.a promotedMerchantsAvailabilityInteractor, u stateMapper) {
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        Intrinsics.checkNotNullParameter(deliveryInteractor, "deliveryInteractor");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantsAvailabilityInteractor, "promotedMerchantsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = revolutPayManagementInteractor;
        this.f112716p = deliveryInteractor;
        this.f112717q = revolutPayInfoInteractor;
        this.f112718r = promotedMerchantsAvailabilityInteractor;
        this.f112719s = new vii.b();
        this.f112720t = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        i iVar = new i(0, this, continuation);
        vii.b bVar = this.f112719s;
        l.a1(this, vkm.q.Q(bVar, iVar), null, null, new j(0, this, continuation), 3);
        l.a1(this, vkm.q.Q(bVar, new i(1, this, continuation)), null, null, new j(1, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112720t;
    }
}
