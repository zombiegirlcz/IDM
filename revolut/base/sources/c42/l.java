package c42;

import c12.z;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends oki.h implements d {
    public final ApmRecipientListInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f20988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pn3.a f20989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vz1.j f20990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lx1.d f20991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f20992t;
    public final Lazy u;

    public l(ApmRecipientListInputData inputData, z extension, pn3.a contactsPermissionsController, vz1.j apmPreferencesRepository, lx1.d apmContactsInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f20988p = extension;
        this.f20989q = contactsPermissionsController;
        this.f20990r = apmPreferencesRepository;
        this.f20991s = apmContactsInteractor;
        this.f20992t = mra.d.b(this, new a(new Data(null, null, true, 3, null), "", false, inputData.i, extension.o0(inputData.f62262a)), stateMapper, null, false, 12);
        this.u = yhm.j.b(new bvb.a(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(w.l(((pn3.b) this.f20989q).b(), this.f20990r.a(this.f20988p.l1()))), null, null, new k(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f20989q).e();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f20992t;
    }
}
