package ua3;

import bi3.d;
import com.revolut.feature.cards_troubleshooter.impl.network.CardsTroubleshooterService;
import da3.j;
import ila.b;
import jla.h;
import jm4.r;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import retrofit2.Retrofit;
import vc.s;
import zf8.k;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f278536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nt8.a f278537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f278538c;
    public final yf8.a d;
    public final nj0.a e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f278539g;

    public a(j jVar, d dVar, nj0.a aVar, r rVar, yf8.a aVar2, nt8.a aVar3, b bVar) {
        this.f278536a = jVar;
        this.f278537b = aVar3;
        this.f278538c = dVar;
        this.d = aVar2;
        this.e = aVar;
        this.f = bVar;
        this.f278539g = rVar;
    }

    public final ie.a a() {
        j jVar = this.f278536a;
        f fVarJ = jVar.j();
        s.j(fVarJ);
        mt8.d dVarB = this.f278537b.b();
        s.j(dVarB);
        sh3.a aVarA = this.f278538c.a();
        s.j(aVarA);
        ia3.r rVarB = jVar.b();
        m93.d dVarF = jVar.f();
        s.j(dVarF);
        xa3.b bVar = new xa3.b(rVarB, dVarF);
        k kVarA = this.d.a();
        s.j(kVarA);
        Retrofit retrofit = ((nj0.d) this.e).f();
        va3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CardsTroubleshooterService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CardsTroubleshooterService cardsTroubleshooterService = (CardsTroubleshooterService) objCreate;
        s.k(cardsTroubleshooterService);
        mp.r rVar = new mp.r(cardsTroubleshooterService);
        h hVarA = this.f.a();
        al4.b bVarN = this.f278539g.n();
        s.j(bVarN);
        return new ie.a(fVarJ, dVarB, aVarA, bVar, kVarA, rVar, hVarA, bVarN);
    }
}
