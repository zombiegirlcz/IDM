package n8l;

import com.revolut.shared.feature.move_money.impl.data.MoveMoneyService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import m8l.g;
import nd.m;
import od0.h;
import t7i.i;
import t7i.p;
import u7i.e0;
import u7i.g0;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f213514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8l.a f213515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w7i.a f213516c;
    public final e d = e4m.b.b(new n51.b(this, 1));

    public a(nj0.a aVar, w7i.a aVar2, l8l.a aVar3) {
        this.f213514a = aVar;
        this.f213515b = aVar3;
        this.f213516c = aVar2;
    }

    public final kye.e a() {
        w7i.a aVar = this.f213516c;
        return new kye.e(aVar.c(), aVar.b());
    }

    public final o8l.c b() {
        MoveMoneyService moveMoneyService = (MoveMoneyService) this.d.get();
        wj0.a aVarI = ((nj0.d) this.f213514a).i();
        s.j(aVarI);
        w7i.a aVar = this.f213516c;
        g gVar = new g(moveMoneyService, aVarI, aVar.c());
        p pVarC = aVar.c();
        i iVarB = aVar.b();
        e0.Companion.getClass();
        h hVar = od0.i.Companion;
        hVar.getClass();
        od0.i moveMoneyCollateralTransferHandler = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(moveMoneyCollateralTransferHandler, "moveMoneyCollateralTransferHandler");
        m mVar = new m(13);
        kye.e eVar = new kye.e(aVar.c(), aVar.b());
        t7i.b bVarA = aVar.a();
        g0.Companion.getClass();
        hVar.getClass();
        return new o8l.c(gVar, pVarC, iVarB, mVar, eVar, bVarA);
    }
}
