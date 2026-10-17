package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21065a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkCardDetailsReviewScreenContract$InputData f21066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f21067c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21069h;

    public o(h hVar, j jVar, ViewController viewController, LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData) {
        this.f21067c = hVar;
        this.f21066b = linkCardDetailsReviewScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.e = e4m.b.b(new afj.d(hVar, jVar, this, 2, i));
        this.f = e4m.b.b(new afj.d(hVar, jVar, this, 1, i));
        this.f21068g = e4m.b.b(new afj.d(hVar, jVar, this, 0, i));
        this.f21069h = e4m.b.b(new afj.d(hVar, jVar, this, 3, i));
    }

    public final a9e.h b() {
        switch (this.f21065a) {
            case 0:
                h hVar = this.f21067c;
                mae.p pVarE = hVar.f21019j.e();
                s.j(pVarE);
                f01.c cVarG = hVar.k.g();
                t70.b bVarG = hVar.f21020l.g();
                s.j(bVarG);
                return c21.l.z(pVarE, cVarG, bVarG);
            default:
                h hVar2 = this.f21067c;
                mae.p pVarE2 = hVar2.f21019j.e();
                s.j(pVarE2);
                f01.c cVarG2 = hVar2.k.g();
                t70.b bVarG2 = hVar2.f21020l.g();
                s.j(bVarG2);
                return c21.l.z(pVarE2, cVarG2, bVarG2);
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f21065a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f21065a) {
        }
        return ImmutableSet.of((yji.d) this.f21068g.get());
    }

    public o(h hVar, l lVar, ViewController viewController, LinkCardDetailsReviewScreenContract$InputData linkCardDetailsReviewScreenContract$InputData) {
        this.f21067c = hVar;
        this.f21066b = linkCardDetailsReviewScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.e = e4m.b.b(new afj.d(hVar, lVar, this, 2, i));
        this.f = e4m.b.b(new afj.d(hVar, lVar, this, 1, i));
        this.f21068g = e4m.b.b(new afj.d(hVar, lVar, this, 0, i));
        this.f21069h = e4m.b.b(new afj.d(hVar, lVar, this, 3, i));
    }
}
