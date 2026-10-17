package b47;

import au6.a3;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final r10.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f12196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaxHubReminderScreenContract$InputData f12197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f12198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f12199s;

    public h(r10.f taxProfileInteractor, ang.f userInteractor, TaxHubReminderScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(taxProfileInteractor, "taxProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = taxProfileInteractor;
        this.f12196p = userInteractor;
        this.f12197q = inputData;
        this.f12198r = new vii.b();
        this.f12199s = mra.d.b(this, new e(inputData.f74366b, 3), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f12198r, new a3(continuation, this, 8)), new b0a.j(12)), null, null, new avk.i(this, continuation, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f12199s;
    }
}
