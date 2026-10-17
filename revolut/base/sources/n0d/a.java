package n0d;

import com.revolut.feature.semi_independent_activation.impl.data.service.SemiIndependentActivationInvitationService;
import k0d.f;
import kotlin.jvm.internal.Intrinsics;
import te8.y;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f211011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f211012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f211013c;

    public a(nj0.a aVar, ee0.a aVar2, an0.c cVar, se8.a aVar3) {
        this.f211011a = aVar;
        this.f211012b = aVar2;
        this.f211013c = cVar;
    }

    public final p0d.e a() {
        nj0.d dVar = (nj0.d) this.f211011a;
        ik0.b retrofitFactory = dVar.m();
        s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        c cVar = d.Companion;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SemiIndependentActivationInvitationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SemiIndependentActivationInvitationService semiIndependentActivationInvitationService = (SemiIndependentActivationInvitationService) objCreate;
        s.k(semiIndependentActivationInvitationService);
        cVar.getClass();
        return new p0d.e(new f(semiIndependentActivationInvitationService, new ne0.d(), b()), new y());
    }

    public final xe0.e b() {
        ee0.a aVar = this.f211012b;
        je0.d mapper = aVar.d();
        s.j(mapper);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        yk0.a dbSessionProvider = this.f211013c.b();
        s.j(dbSessionProvider);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        return xe0.f.f(storageFactory, dbSessionProvider, "semi_independent_activation_storage", mapper, 1, null, 48);
    }
}
