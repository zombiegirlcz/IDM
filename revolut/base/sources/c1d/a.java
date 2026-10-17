package c1d;

import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingInvitationService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f20445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pqi.a f20446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f20447c;
    public final ee0.a d;
    public final an0.c e;
    public final se8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f20448g = this;

    public a(nj0.a aVar, l70.e eVar, ee0.a aVar2, an0.c cVar, se8.a aVar3, pqi.a aVar4) {
        this.f20445a = eVar;
        this.f20446b = aVar4;
        this.f20447c = aVar;
        this.d = aVar2;
        this.e = cVar;
        this.f = aVar3;
    }

    public final SemiIndependentOnboardingInvitationService a() {
        nj0.d dVar = (nj0.d) this.f20447c;
        ik0.b retrofitFactory = dVar.m();
        s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SemiIndependentOnboardingInvitationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SemiIndependentOnboardingInvitationService semiIndependentOnboardingInvitationService = (SemiIndependentOnboardingInvitationService) objCreate;
        s.k(semiIndependentOnboardingInvitationService);
        return semiIndependentOnboardingInvitationService;
    }

    public final xe0.e b() {
        ee0.a aVar = this.d;
        je0.d mapper = aVar.d();
        s.j(mapper);
        f storageFactory = aVar.f();
        s.j(storageFactory);
        yk0.a dbSessionProvider = this.e.b();
        s.j(dbSessionProvider);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        return f.f(storageFactory, dbSessionProvider, "semi_independent_onboarding_storage", mapper, 1, null, 48);
    }
}
