package dcf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading_add_ons.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f112928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f112929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f112930c;
    public final c d;
    public final fcf.a e;
    public v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rp0.y f112931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public rp0.y f112932h;
    public rp0.y i;

    public f(b binder, w api2, j60.a dialogView, c dependencies, fcf.a eligibilityDialogMapper) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(eligibilityDialogMapper, "eligibilityDialogMapper");
        this.f112928a = binder;
        this.f112929b = api2;
        this.f112930c = dialogView;
        this.d = dependencies;
        this.e = eligibilityDialogMapper;
        this.f = t.f112965a;
    }

    public final void a() {
        c cVar = this.d;
        Flow flow = cVar.f112918a;
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: dcf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f112915b;

            {
                this.f112915b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f112915b;
                        rp0.y yVar = fVar.f112931g;
                        if (yVar == null && fVar.f112932h == null) {
                            v vVar = fVar.f;
                            rp0.y yVar2 = null;
                            if (vVar.equals(t.f112965a)) {
                                rp0.y yVar3 = fVar.i;
                                if (yVar3 != null) {
                                    fVar.b(yVar3);
                                } else {
                                    i0 i0Var = (i0) fVar.f112929b;
                                    i0Var.getClass();
                                    i0Var.l2(new c0(2, i0Var, null), new yi5.b(26));
                                }
                            } else {
                                if (!(vVar instanceof u)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fcf.a aVar = fVar.e;
                                lbf.l eligibility = ((u) vVar).f112966a;
                                ((fcf.c) aVar).getClass();
                                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                                if (fcf.b.f133728a[eligibility.ordinal()] == 1) {
                                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_title, null, null, 14), new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_description, null, null, 14), null, 28);
                                    List listC = zhm.u.c(new LargeActionButtonDelegate.Model("GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_got_it, null, null, 14), false, null, null, null, null, 1000));
                                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                                    yVar2 = new rp0.y(listC, tVar, null, null, null, null, 1020);
                                }
                                if (yVar2 != null) {
                                    fVar.b(yVar2);
                                }
                            }
                        } else if (yVar != null) {
                            fVar.b(yVar);
                        } else {
                            rp0.y yVar4 = fVar.f112932h;
                            if (yVar4 != null) {
                                fVar.b(yVar4);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        j60.a.v(this.f112915b.f112930c, false, null, 3);
                        return Unit.f186387a;
                    default:
                        f fVar2 = this.f112915b;
                        j60.a.v(fVar2.f112930c, false, null, 3);
                        i0 i0Var2 = (i0) fVar2.f112929b;
                        i0Var2.getClass();
                        i0Var2.l2(new c0(2, i0Var2, null), new yi5.b(26));
                        return Unit.f186387a;
                }
            }
        };
        b bVar = this.f112928a;
        bVar.e(flow, function1);
        LargeActionButtonDelegate largeActionButtonDelegate = cVar.f112919b;
        final int i2 = 1;
        bVar.e(new d83.i(rd0.e.b(largeActionButtonDelegate.d.f121375b), 6), new Function1(this) { // from class: dcf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f112915b;

            {
                this.f112915b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f112915b;
                        rp0.y yVar = fVar.f112931g;
                        if (yVar == null && fVar.f112932h == null) {
                            v vVar = fVar.f;
                            rp0.y yVar2 = null;
                            if (vVar.equals(t.f112965a)) {
                                rp0.y yVar3 = fVar.i;
                                if (yVar3 != null) {
                                    fVar.b(yVar3);
                                } else {
                                    i0 i0Var = (i0) fVar.f112929b;
                                    i0Var.getClass();
                                    i0Var.l2(new c0(2, i0Var, null), new yi5.b(26));
                                }
                            } else {
                                if (!(vVar instanceof u)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fcf.a aVar = fVar.e;
                                lbf.l eligibility = ((u) vVar).f112966a;
                                ((fcf.c) aVar).getClass();
                                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                                if (fcf.b.f133728a[eligibility.ordinal()] == 1) {
                                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_title, null, null, 14), new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_description, null, null, 14), null, 28);
                                    List listC = zhm.u.c(new LargeActionButtonDelegate.Model("GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_got_it, null, null, 14), false, null, null, null, null, 1000));
                                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                                    yVar2 = new rp0.y(listC, tVar, null, null, null, null, 1020);
                                }
                                if (yVar2 != null) {
                                    fVar.b(yVar2);
                                }
                            }
                        } else if (yVar != null) {
                            fVar.b(yVar);
                        } else {
                            rp0.y yVar4 = fVar.f112932h;
                            if (yVar4 != null) {
                                fVar.b(yVar4);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        j60.a.v(this.f112915b.f112930c, false, null, 3);
                        return Unit.f186387a;
                    default:
                        f fVar2 = this.f112915b;
                        j60.a.v(fVar2.f112930c, false, null, 3);
                        i0 i0Var2 = (i0) fVar2.f112929b;
                        i0Var2.getClass();
                        i0Var2.l2(new c0(2, i0Var2, null), new yi5.b(26));
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 2;
        bVar.e(new d83.i(rd0.e.b(largeActionButtonDelegate.d.f121375b), 7), new Function1(this) { // from class: dcf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f112915b;

            {
                this.f112915b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f112915b;
                        rp0.y yVar = fVar.f112931g;
                        if (yVar == null && fVar.f112932h == null) {
                            v vVar = fVar.f;
                            rp0.y yVar2 = null;
                            if (vVar.equals(t.f112965a)) {
                                rp0.y yVar3 = fVar.i;
                                if (yVar3 != null) {
                                    fVar.b(yVar3);
                                } else {
                                    i0 i0Var = (i0) fVar.f112929b;
                                    i0Var.getClass();
                                    i0Var.l2(new c0(2, i0Var, null), new yi5.b(26));
                                }
                            } else {
                                if (!(vVar instanceof u)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fcf.a aVar = fVar.e;
                                lbf.l eligibility = ((u) vVar).f112966a;
                                ((fcf.c) aVar).getClass();
                                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                                if (fcf.b.f133728a[eligibility.ordinal()] == 1) {
                                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_title, null, null, 14), new TextLocalisedClause(R$string.price_plan_add_ons_eligibility_trading_pro_buy_order_block_banner_description, null, null, 14), null, 28);
                                    List listC = zhm.u.c(new LargeActionButtonDelegate.Model("GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_got_it, null, null, 14), false, null, null, null, null, 1000));
                                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                                    yVar2 = new rp0.y(listC, tVar, null, null, null, null, 1020);
                                }
                                if (yVar2 != null) {
                                    fVar.b(yVar2);
                                }
                            }
                        } else if (yVar != null) {
                            fVar.b(yVar);
                        } else {
                            rp0.y yVar4 = fVar.f112932h;
                            if (yVar4 != null) {
                                fVar.b(yVar4);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        j60.a.v(this.f112915b.f112930c, false, null, 3);
                        return Unit.f186387a;
                    default:
                        f fVar2 = this.f112915b;
                        j60.a.v(fVar2.f112930c, false, null, 3);
                        i0 i0Var2 = (i0) fVar2.f112929b;
                        i0Var2.getClass();
                        i0Var2.l2(new c0(2, i0Var2, null), new yi5.b(26));
                        return Unit.f186387a;
                }
            }
        });
    }

    public final void b(rp0.y yVar) {
        c cVar = this.d;
        List listK = zhm.v.k(cVar.f112919b, cVar.f112920c, cVar.d, cVar.e);
        j60.a aVar = this.f112930c;
        aVar.d(listK);
        aVar.x(yVar);
    }
}
