package c84;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import cbh.b0;
import cbh.c0;
import cbh.d0;
import cbh.j0;
import cbh.n0;
import com.revolut.feature.address.impl.data.network.AddressService;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.swish.impl.data.network.SwishService;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.sso.impl.data.storage.RevolutAccountsManagerContentProvider;
import ee2.b;
import ip0.x10;
import java.util.concurrent.CopyOnWriteArrayList;
import kkd.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import om4.x2;
import pjl.z0;
import skm.e0;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f22111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22112x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22111w = obj2;
        this.f22112x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y((z) this.f22111w, (Intent) this.f22112x, continuation, 0);
            case 1:
                return new y((MoveMoneyBalanceSyncWorker) this.f22111w, (mri.s) this.f22112x, continuation, 1);
            case 2:
                return new y((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f22111w, (String) this.f22112x, continuation, 2);
            case 3:
                return new y((cam.t) this.f22111w, (WebView) this.f22112x, continuation, 3);
            case 4:
                return new y((cam.t) this.f22111w, (ConsoleMessage) this.f22112x, continuation, 4);
            case 5:
                return new y((cam.t) this.f22111w, (Uri) this.f22112x, continuation, 5);
            case 6:
                y yVar = new y((n0) this.f22112x, continuation, 6);
                yVar.f22111w = obj2;
                return yVar;
            case 7:
                return new y((cbk.o) this.f22111w, (sak.c) this.f22112x, continuation, 7);
            case 8:
                return new y((cbk.o) this.f22111w, (h1j.d) this.f22112x, continuation, 8);
            case 9:
                return new y((ce2.a) this.f22111w, (dj0.d) this.f22112x, continuation, 9);
            case 10:
                return new y((com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f22111w, (String) this.f22112x, continuation, 10);
            case 11:
                return new y((com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f22111w, (x10) this.f22112x, continuation, 11);
            case 12:
                return new y((com.revolut.feature.credit.application.plugins.impl.ui.offer.e) this.f22111w, (ff4.p) this.f22112x, continuation, 12);
            case 13:
                return new y((cfa.g) this.f22111w, (xfe.e) this.f22112x, continuation, 13);
            case 14:
                return new y((cg9.n) this.f22111w, (String) this.f22112x, continuation, 14);
            case 15:
                return new y((com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.f22111w, (ch6.i) this.f22112x, continuation, 15);
            case 16:
                return new y((cic.d) this.f22111w, (String) this.f22112x, continuation, 16);
            case 17:
                return new y((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f22111w, (String) this.f22112x, continuation, 17);
            case 18:
                return new y((kkd.d) this.f22111w, (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f22112x, continuation, 18);
            case 19:
                return new y((NewsUiItem) this.f22111w, (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f22112x, continuation, 19);
            case 20:
                y yVar2 = new y((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f22112x, continuation, 20);
                yVar2.f22111w = obj2;
                return yVar2;
            case 21:
                return new y((cj1.k) this.f22111w, (Address) this.f22112x, continuation, 21);
            case 22:
                return new y((com.revolut.feature.shops.impl.ui.details.a) this.f22112x, continuation, 22);
            case 23:
                return new y((com.revolut.feature.shops.impl.ui.details.a) this.f22111w, (ShopsCampaignOffer) this.f22112x, continuation, 23);
            case 24:
                y yVar3 = new y((RevolutAccountsManagerContentProvider) this.f22112x, continuation, 24);
                yVar3.f22111w = obj2;
                return yVar3;
            case 25:
                return new y((clk.c) this.f22111w, (PricingPlanSubscription) this.f22112x, continuation, 25);
            case 26:
                return new y((clm.q) this.f22111w, (flm.i) this.f22112x, continuation, 26);
            case 27:
                return new y((cmc.h) this.f22112x, continuation, 27);
            case 28:
                y yVar4 = new y((cmi.z) this.f22112x, continuation, 28);
                yVar4.f22111w = obj2;
                return yVar4;
            default:
                return new y((cmi.d) this.f22111w, (cmi.z) this.f22112x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objD;
        Object objUpdateLimits;
        Object objQ;
        Object objH;
        Object objB;
        Object suggestedAddressImprovement;
        Object objB2;
        Object objD2;
        Object objA;
        Context context;
        hf0.a aVarJ;
        Object objA2;
        Object objB3;
        NaviCommand naviCommand;
        int i = this.u;
        int i2 = 0;
        Object dVar = cmi.c.f25270a;
        Continuation continuation = null;
        Object obj3 = this.f22112x;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z zVar = (z) this.f22111w;
                    x xVar = new x((Intent) obj3, zVar, null);
                    this.v = 1;
                    if (zVar.Y2(this, xVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    c8i.m mVar = ((MoveMoneyBalanceSyncWorker) this.f22111w).f97399a;
                    mri.s sVar = (mri.s) obj3;
                    this.v = 1;
                    mVar.getClass();
                    if (Intrinsics.f(sVar, mri.h.INSTANCE)) {
                        objD = e0.o(new c8i.l(mVar, null), this);
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else if (sVar instanceof mri.n) {
                        mri.n nVar = (mri.n) sVar;
                        String str = nVar.f208141a;
                        mri.j jVar = nVar.f208142b;
                        rnb.w wVar = mVar.d;
                        if (str != null) {
                            objD = wVar.e(str, this);
                            if (objD != aVar2) {
                                objD = Unit.f186387a;
                            }
                        } else {
                            objD = wVar.f(c8i.m.a(jVar), false, this);
                            if (objD != aVar2) {
                                objD = Unit.f186387a;
                            }
                        }
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else if (Intrinsics.f(sVar, mri.r.INSTANCE)) {
                        objD = e0.o(new c1i.f(mVar, continuation, 20), this);
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else if (sVar instanceof mri.q) {
                        objD = nim.a.a(((ypg.p) mVar.f22208c).o(c8i.m.a(((mri.q) sVar).f208145a), false), this);
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else if (sVar instanceof mri.d) {
                        objD = ((x2) mVar.e).G(((mri.d) sVar).f208134a, this);
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else if (sVar instanceof mri.g) {
                        objD = ((ael.y) mVar.f22209g).g(((mri.g) sVar).f208136a, this);
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                        if (objD != aVar2) {
                            objD = Unit.f186387a;
                        }
                    } else {
                        if (!Intrinsics.f(sVar, mri.k.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        x4l.c cVar = ((pdi.k) mVar.f.f194134a).e;
                        Unit unit = Unit.f186387a;
                        objD = cVar.d(unit, false, this);
                        if (objD != aVar2) {
                            objD = unit;
                        }
                        if (objD != aVar2) {
                            objD = unit;
                        }
                        if (objD != aVar2) {
                            objD = unit;
                        }
                        if (objD != aVar2) {
                            objD = unit;
                        }
                    }
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar2 = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f22111w;
                c9d.m mVar2 = new c9d.m(cVar2, (String) obj3, continuation, i3);
                this.v = 1;
                Object objP2 = cVar2.p2(this, mVar2);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((cam.t) this.f22111w).i(cam.i.close, (WebView) obj3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((cam.t) this.f22111w).i(cam.i.console, (ConsoleMessage) obj3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((cam.t) this.f22111w).i(cam.i.hostblocked, (Uri) obj3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                n0 n0Var = (n0) obj3;
                cbh.e0 e0Var = (cbh.e0) this.f22111w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    a26.s sVar2 = new a26.s(n0Var, e0Var);
                    if (!e0Var.equals(b0.f22806a)) {
                        int i59 = 27;
                        if (e0Var.equals(d0.f22809a)) {
                            n0Var.T2(new j0(n0Var, sVar2, continuation, i2), new yi5.b(i59));
                        } else {
                            if (!(e0Var instanceof c0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n0Var.T2(new j0(n0Var, sVar2, continuation, i3), new yi5.b(i59));
                        }
                        return Unit.f186387a;
                    }
                    this.f22111w = null;
                    this.v = 1;
                    if (sVar2.a(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Unit unit2 = Unit.f186387a;
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    cbk.o oVar = (cbk.o) this.f22111w;
                    c64.d dVar2 = new c64.d(oVar, (sak.c) obj3, continuation, 4);
                    this.v = 1;
                    if (oVar.Y2(this, dVar2) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    cbk.o oVar2 = (cbk.o) this.f22111w;
                    bvb.o oVar3 = new bvb.o(oVar2, (h1j.d) obj3, null);
                    this.v = 1;
                    if (oVar2.Y2(this, oVar3) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    SwishService swishService = ((ce2.a) this.f22111w).f23342a;
                    dj0.d dVar3 = (dj0.d) obj3;
                    Intrinsics.checkNotNullParameter(dVar3, "<this>");
                    ee2.b bVar = new ee2.b(new b.a(mo3.a.p(dVar3)));
                    this.v = 1;
                    objUpdateLimits = swishService.updateLimits(bVar, this);
                    if (objUpdateLimits == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objUpdateLimits = obj2;
                }
                return de2.a.a((ee2.a) objUpdateLimits);
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar12 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f22111w;
                    cea.u uVar = new cea.u(aVar12, (String) obj3, null);
                    this.v = 1;
                    if (aVar12.p2(this, uVar) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar14 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f22111w;
                    cea.w wVar2 = new cea.w((x10) obj3, aVar14, null);
                    this.v = 1;
                    if (aVar14.p2(this, wVar2) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer.e) this.f22111w;
                com.revolut.feature.credit.application.plugins.impl.ui.offer.d dVar4 = new com.revolut.feature.credit.application.plugins.impl.ui.offer.d(eVar, (ff4.p) obj3, null);
                this.v = 1;
                Object objB4 = pu7.a.B(eVar.k, "load html", dVar4, this);
                return objB4 == aVar15 ? aVar15 : objB4;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((cfa.g) this.f22111w).f23669m.emit((xfe.e) obj3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                cg9.n nVar2 = (cg9.n) this.f22111w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    ack.n nVar3 = new ack.n(19);
                    cg9.k kVar = new cg9.k(nVar2, (String) obj3, continuation, i3);
                    this.v = 1;
                    objQ = n14.k.Q(nVar2, null, null, nVar3, kVar, this, 2);
                    if (objQ == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objQ = obj2;
                }
                if (((nii.e) objQ) instanceof nii.d) {
                    nVar2.C2(ef9.d.f125294a);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar2 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.f22111w;
                    c64.d dVar5 = new c64.d(bVar2, (ch6.i) obj3, continuation, 7);
                    this.v = 1;
                    if (bVar2.p2(this, dVar5) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar20 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((cic.d) this.f22111w).o, (String) obj3, aVar20, null, this, 4);
                return objX1 == aVar19 ? aVar19 : objX1;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar6 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f22111w;
                a41.s sVar3 = new a41.s(dVar6, (String) obj3, (Continuation) null, 28);
                this.v = 1;
                Object objP22 = dVar6.p2(this, sVar3);
                return objP22 == aVar21 ? aVar21 : objP22;
            case 18:
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar7 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3;
                kkd.d dVar8 = (kkd.d) this.f22111w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    boolean z = dVar8 instanceof kkd.e;
                    if (z && dVar7.N2(((kkd.e) dVar8).f184577a.a())) {
                        return Unit.f186387a;
                    }
                    f4h.a aVar23 = dVar7.P;
                    this.v = 1;
                    mp.p pVar = (mp.p) aVar23.f132229b;
                    if (z) {
                        objH = pVar.h(((kkd.e) dVar8).f184577a.a(), this);
                        if (objH != aVar22) {
                            objH = Unit.f186387a;
                        }
                    } else {
                        if (!(dVar8 instanceof d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i107 = jli.h.f175850a;
                        objH = Unit.f186387a;
                    }
                    if (objH == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    String str2 = ((NewsUiItem) this.f22111w).f98599c;
                    if (str2 == null) {
                        return null;
                    }
                    efm.d0 d0VarS1 = lg0.b.s1(((com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3).f89713x, str2, null, null, 6);
                    this.v = 1;
                    objB = nim.a.b(d0VarS1, this);
                    if (objB == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                return (Boolean) objB;
            case 20:
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f22111w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    the.a aVar26 = ((com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3).v;
                    ProductId f89727a = productAccountDescriptor$Value.getF89727a();
                    sfe.o oVar4 = new sfe.o(productAccountDescriptor$Value.getF89728b());
                    this.f22111w = null;
                    this.v = 1;
                    if (aVar26.a(f89727a, oVar4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    AddressService addressService = ((cj1.k) this.f22111w).f24595a;
                    Address address = (Address) obj3;
                    Intrinsics.checkNotNullParameter(address, "<this>");
                    bj1.a aVar28 = new bj1.a(address.getCountry(), address.getPostcode(), address.getStreetLine1(), address.getStreetLine2(), address.getCity(), address.getRegion(), address.getStreetType(), address.getStreet(), address.getHouseNumber(), address.getNeighborhood());
                    this.v = 1;
                    suggestedAddressImprovement = addressService.getSuggestedAddressImprovement(aVar28, this);
                    if (suggestedAddressImprovement == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    suggestedAddressImprovement = obj2;
                }
                return kotlin.jvm.internal.s.C((bj1.b) suggestedAddressImprovement);
            case 22:
                com.revolut.feature.shops.impl.ui.details.a aVar29 = (com.revolut.feature.shops.impl.ui.details.a) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarE = aVar29.z.e();
                    this.v = 1;
                    objB2 = nim.a.b(d0VarE, this);
                    if (objB2 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        if (i111 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar29 = (com.revolut.feature.shops.impl.ui.details.a) this.f22111w;
                        yhm.o.b(obj2);
                        objD2 = obj2;
                        return aVar29.C1(new BridgeDestination((NaviCommand) objD2));
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                hha.d dVar9 = (hha.d) objB2;
                jgk.v vVar = aVar29.A;
                Intrinsics.h(dVar9);
                this.f22111w = aVar29;
                this.v = 2;
                objD2 = ((jjk.c) vVar).d(dVar9, this);
                if (objD2 == aVar30) {
                    return aVar30;
                }
                return aVar29.C1(new BridgeDestination((NaviCommand) objD2));
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.shops.impl.ui.details.a aVar32 = (com.revolut.feature.shops.impl.ui.details.a) this.f22111w;
                c64.d dVar10 = new c64.d(aVar32, (ShopsCampaignOffer) obj3, continuation, 9);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar32.k, "shops_checkout", dVar10, this);
                return objB5 == aVar31 ? aVar31 : objB5;
            case 24:
                RevolutAccountsManagerContentProvider revolutAccountsManagerContentProvider = (RevolutAccountsManagerContentProvider) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = (jjl.a) jjl.d.Companion.c();
                        break;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (yhm.m.a(objA) != null) {
                        try {
                            context = revolutAccountsManagerContentProvider.getContext();
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        }
                        objA = (context != null && (aVarJ = ue0.e.j(context)) != null) ? (jjl.a) ue0.e.i(aVarJ, jjl.a.class) : null;
                        break;
                    }
                    if (objA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    uil.a aVarA = ((jjl.a) objA).a();
                    Context context2 = revolutAccountsManagerContentProvider.getContext();
                    Object systemService = context2 != null ? context2.getSystemService("keyguard") : null;
                    KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
                    if (keyguardManager != null) {
                        od0.a aVar34 = od0.a.f224253a;
                        if (!od0.a.e() && !keyguardManager.isKeyguardSecure()) {
                            this.f22111w = null;
                            this.v = 1;
                            if (((z0) aVarA).f(this) == aVar33) {
                                return aVar33;
                            }
                        }
                    }
                    return Unit.f186387a;
                }
                if (i113 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, null, "accounts deleted as KeyguardSecure disabled", null, null, 16);
                return Unit.f186387a;
            case 25:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((clk.c) this.f22111w).f25049h.J((PricingPlanSubscription) obj3, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                clm.q qVar = (clm.q) this.f22111w;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    hlm.c cVar3 = qVar.e;
                    this.v = 1;
                    if (cVar3.lock(null, this) != obj4) {
                    }
                    return obj4;
                }
                if (i115 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                obj4 = Unit.f186387a;
                if (!((flm.h) ((flm.i) obj3)).j(qVar, obj4)) {
                    qVar.e.unlock(null);
                }
                return obj4;
            case 27:
                cmc.h hVar = (cmc.h) obj3;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    fmc.l lVar = hVar.f;
                    this.v = 1;
                    objA2 = lVar.a(this);
                    if (objA2 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        naviCommand = (NaviCommand) this.f22111w;
                        yhm.o.b(obj2);
                        objB3 = obj2;
                        return com.revolut.retail.core.navigation.a.c(naviCommand, (NaviCommand) objB3);
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                NaviCommand naviCommand2 = (NaviCommand) objA2;
                fmc.c0 c0Var = hVar.f25206g;
                this.f22111w = naviCommand2;
                this.v = 2;
                objB3 = c0Var.b(this);
                if (objB3 == aVar36) {
                    return aVar36;
                }
                naviCommand = naviCommand2;
                return com.revolut.retail.core.navigation.a.c(naviCommand, (NaviCommand) objB3);
            case 28:
                cmi.z zVar2 = (cmi.z) obj3;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                try {
                } catch (RuntimeException e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeeplinkCoordinatorStateStorage", "Unable to restore deeplink coordinator state", e2, h0Var2);
                    this.f22111w = null;
                    this.v = 2;
                    if (zVar2.a(this) == aVar37) {
                        dVar = aVar37;
                    }
                    break;
                }
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    cmi.x xVar2 = (cmi.x) ((ue0.c) zVar2.d.getValue()).T2("active_processing", wim.z.d(o0.b(cmi.x.class)));
                    if (xVar2 != null) {
                        zli.b bVarB = zVar2.f25313c.b(xVar2.f25308a);
                        if (bVarB == null) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "DeeplinkCoordinatorStateStorage", "Unable to restore deeplink coordinator state: stored deeplink is not parseable", null, h0Var3);
                            this.f22111w = null;
                            this.v = 1;
                            if (zVar2.a(this) == aVar37) {
                                dVar = aVar37;
                            }
                        } else {
                            dVar = new cmi.d(bVarB, lg0.a.valueOf(xVar2.f25309b), wli.q.valueOf(xVar2.f25310c));
                        }
                    }
                } else {
                    if (i117 != 1) {
                        if (i117 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return dVar;
                    }
                    yhm.o.b(obj2);
                }
                return dVar;
            default:
                cmi.z zVar3 = (cmi.z) obj3;
                cmi.d dVar11 = (cmi.d) this.f22111w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                try {
                    if (i118 == 0) {
                        yhm.o.b(obj2);
                        if (dVar11.equals(dVar)) {
                            this.v = 1;
                            if (zVar3.a(this) == aVar38) {
                                return aVar38;
                            }
                        } else {
                            ((ue0.c) zVar3.d.getValue()).G(new cmi.x(dVar11.f25271a.f323278a, dVar11.f25272b.name(), dVar11.f25273c.name()), "active_processing", wim.z.d(o0.b(cmi.x.class)));
                        }
                    } else {
                        if (i118 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (RuntimeException e4) {
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeeplinkCoordinatorStateStorage", "Unable to store deeplink coordinator state", e4, h0Var4);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22112x = obj2;
    }
}
