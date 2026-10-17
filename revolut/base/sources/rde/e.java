package rde;

import com.revolut.feature.support.impl.transfer_tracker.data.network.service.TransferTrackerService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f253424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f253425c;

    public /* synthetic */ e(h hVar, int i, int i2) {
        this.f253423a = i2;
        this.f253424b = hVar;
        this.f253425c = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f253423a) {
            case 0:
                int i = this.f253425c;
                if (i == 0) {
                    return new com.revolut.feature.support.impl.transfer_tracker.ui.a(new wde.a(), new lee.a(), new dee.e());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                h hVar = this.f253424b;
                n8b.a aVarA = hVar.i.a();
                s.j(aVarA);
                fk3.a aVarA2 = hVar.f253438j.a();
                s.j(aVarA2);
                return new xde.c(aVarA, aVarA2);
            default:
                int i2 = this.f253425c;
                if (i2 == 0) {
                    return new ude.b();
                }
                h hVar2 = this.f253424b;
                if (i2 == 1) {
                    sri.m mVarD = ((g8b.a) hVar2.f253433a).d();
                    s.j(mVarD);
                    return new vde.a(mVarD);
                }
                if (i2 == 2) {
                    return new sde.e((nde.d) hVar2.o.get(), (sde.b) hVar2.f253442p.get());
                }
                if (i2 == 3) {
                    return new nde.d((TransferTrackerService) hVar2.f253441n.get(), new ode.c());
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar2.e).c();
                    s.j(aVarC);
                    return new sde.b(aVarC);
                }
                Retrofit retrofit = ((nj0.d) hVar2.d).f();
                n.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(TransferTrackerService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TransferTrackerService transferTrackerService = (TransferTrackerService) objCreate;
                s.k(transferTrackerService);
                return transferTrackerService;
        }
    }
}
