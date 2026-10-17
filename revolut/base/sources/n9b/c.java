package n9b;

import com.revolut.feature.retail.global_accounts.impl.data.service.CountryProfilesManagementService;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8b.a f213622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ila.b f213623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f213624c;
    public final xmg.a d;
    public final p8l.a e;
    public final cri.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf0.a f213625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final co0.a f213626h;
    public final c i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f213627j = e4m.b.b(new m0m.a(13));

    public c(op.b bVar, nf0.a aVar, nj0.a aVar2, q8b.a aVar3, cri.b bVar2, p8l.a aVar4, ila.b bVar3, co0.a aVar5, xmg.a aVar6) {
        this.f213622a = aVar3;
        this.f213623b = bVar3;
        this.f213624c = aVar2;
        this.d = aVar6;
        this.e = aVar4;
        this.f = bVar2;
        this.f213625g = aVar;
        this.f213626h = aVar5;
    }

    public final c0 a() {
        nj0.d dVar = (nj0.d) this.f213624c;
        ik0.b retrofitFactory = dVar.m();
        s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CountryProfilesManagementService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CountryProfilesManagementService countryProfilesManagementService = (CountryProfilesManagementService) objCreate;
        s.k(countryProfilesManagementService);
        return new c0(countryProfilesManagementService);
    }
}
