package kxa;

import com.revolut.feature.referrals.impl.network.services.PersonalizedTrackingService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f190523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190524b;

    public e(f fVar, int i) {
        this.f190523a = fVar;
        this.f190524b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f190523a;
        ee0.a aVar = fVar.f190527c;
        nj0.a aVar2 = fVar.f190528g;
        int i = this.f190524b;
        if (i == 0) {
            ln3.b bVar = new ln3.b();
            cl3.a aVarD = fVar.f190525a.d();
            s.j(aVarD);
            vwa.b bVar2 = fVar.f190526b;
            wwa.b bVarA = bVar2.a();
            s.j(bVarA);
            wwa.f fVar2 = (wwa.f) bVar2.f292679r.get();
            s.j(fVar2);
            return new pxa.d(bVar, new jt0.b(aVarD, bVarA, fVar2));
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i == 2) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = fVar.d.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            i.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSessionProvider, "PERSONALIZED_TRACKING", mapper, 0, null, 56);
        }
        if (i == 3) {
            ue0.c cVar = (ue0.c) fVar.f190533n.get();
            mk0.a aVarA = fVar.f.a();
            s.j(aVarA);
            return new gxa.c(cVar, aVarA, (PersonalizedTrackingService) fVar.o.get(), (ne0.j) fVar.f190532m.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ek.a converterFactory = ((nj0.d) aVar2).d();
        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
        s.j(retrofitFactory);
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PersonalizedTrackingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PersonalizedTrackingService personalizedTrackingService = (PersonalizedTrackingService) objCreate;
        s.k(personalizedTrackingService);
        return personalizedTrackingService;
    }
}
