package dmc;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.a1;
import dw3.b1;
import dw3.c1;
import dw3.d1;
import dw3.e1;
import dw3.f4;
import dw3.k0;
import dw3.l0;
import dw3.n0;
import dw3.o0;
import dw3.p0;
import dw3.q0;
import dw3.r0;
import dw3.s0;
import dw3.s4;
import dw3.t0;
import dw3.x0;
import dw3.z0;
import ft3.j1;
import j54.y0;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import t80.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f115926c;
    public final Object d;

    public /* synthetic */ b0(Object obj2, Object obj3, int i, int i2) {
        this.f115924a = i2;
        this.f115926c = obj2;
        this.d = obj3;
        this.f115925b = i;
    }

    private final Object a() {
        c1 c1Var = (c1) this.f115926c;
        dw3.x xVar = (dw3.x) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(xVar.f120094a, (j60.a) xVar.f120097g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(xVar.f120094a, (com.revolut.kompot.navigable.a) xVar.e.get(), (rp0.m) xVar.f.get());
            case 2:
                iq3.a aVar = xVar.f120094a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) xVar.f120104q.get());
            case 4:
                return new c84.z((c84.g) xVar.f120103p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) xVar.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) xVar.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) xVar.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) xVar.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) xVar.i.get();
                c1 c1Var2 = xVar.f120096c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) xVar.f120099j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) xVar.f120099j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) xVar.f120102n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) xVar.f120100l.get(), li4.e.class, (li4.b) xVar.f120101m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return db5.e.u((lik.a) xVar.f120106s.get());
            case 13:
                lik.b bVar4 = (lik.b) c1Var.M.f245992y.get();
                vc.s.j(bVar4);
                return db5.e.t(bVar4);
            case 14:
                c84.z zVar = (c84.z) xVar.f120104q.get();
                e5f.b.a(zVar);
                return zVar;
            case 15:
                ffk.t tVarF = c1Var.G.f();
                vc.s.j(tVarF);
                return new cj4.d(tVarF, (vfk.c) xVar.v.get(), new sg4.a());
            case 16:
                lik.a binder = (lik.a) xVar.f120106s.get();
                dj4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(binder, "binder");
                return binder.f195536a;
            case 17:
                xq3.d dVar = (xq3.d) c1Var.f118428c.M.get();
                vc.s.j(dVar);
                return new t54.b(dVar);
            case 18:
                return new d84.g(ImmutableSet.of((d84.a) xVar.f120109x.get()));
            case 19:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) xVar.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 20:
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                BannerFlowContract$InputData bannerFlowContract$InputData = xVar.f120095b;
                s54.g gVar = new s54.g();
                wli.x xVarD = ((s41.a) c1Var.f118485x).d();
                cj4.a aVar3 = (cj4.a) xVar.f120108w.get();
                d84.e eVar2 = (d84.e) xVar.f120110y.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) xVar.i.get();
                c84.g gVar2 = (c84.g) xVar.f120103p.get();
                xa4.a aVar4 = (xa4.a) xVar.k.get();
                c1 c1Var3 = xVar.f120096c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.banner.a(cVar3, bannerFlowContract$InputData, gVar, xVarD, aVar3, eVar2, e5f.b.w(pluginFlowContract$Input4, gVar2, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        c1 c1Var = (c1) this.f115926c;
        dw3.a0 a0Var = (dw3.a0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(a0Var.f118226a, (j60.a) a0Var.f118229g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(a0Var.f118226a, (com.revolut.kompot.navigable.a) a0Var.e.get(), (rp0.m) a0Var.f.get());
            case 2:
                iq3.a aVar = a0Var.f118226a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) a0Var.f118236q.get());
            case 4:
                return new c84.z((c84.g) a0Var.f118235p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) a0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) a0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) a0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) a0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) a0Var.i.get();
                c1 c1Var2 = a0Var.f118228c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) a0Var.f118231j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) a0Var.f118231j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) a0Var.f118234n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) a0Var.f118232l.get(), li4.e.class, (li4.b) a0Var.f118233m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) a0Var.f118236q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) a0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                BirthPlaceRootFlowContract$InputData birthPlaceRootFlowContract$InputData = a0Var.f118227b;
                hw3.a aVar3 = (hw3.a) c1Var.v2.get();
                e4m.e eVar2 = a0Var.u;
                e4m.e eVar3 = a0Var.v;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) a0Var.i.get();
                c84.g gVar = (c84.g) a0Var.f118235p.get();
                xa4.a aVar4 = (xa4.a) a0Var.k.get();
                c1 c1Var3 = a0Var.f118228c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a(birthPlaceRootFlowContract$InputData, aVar3, eVar2, eVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                n8b.b bVarB = c1Var.C.b();
                vc.s.j(bVarB);
                fk3.a aVarA = c1Var.Y.a();
                vc.s.j(aVarA);
                return new w54.d(bVarB, aVarA);
            case 16:
                return new w54.b((hw3.a) c1Var.v2.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        c1 c1Var = (c1) this.f115926c;
        dw3.b0 b0Var = (dw3.b0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(b0Var.f118302a, (j60.a) b0Var.f118305g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(b0Var.f118302a, (com.revolut.kompot.navigable.a) b0Var.e.get(), (rp0.m) b0Var.f.get());
            case 2:
                iq3.a aVar = b0Var.f118302a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) b0Var.f118312q.get());
            case 4:
                return new c84.z((c84.g) b0Var.f118311p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) b0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) b0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) b0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) b0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) b0Var.i.get();
                c1 c1Var2 = b0Var.f118304c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) b0Var.f118307j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) b0Var.f118307j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) b0Var.f118310n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b0Var.f118308l.get(), li4.e.class, (li4.b) b0Var.f118309m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) b0Var.f118312q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) b0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                CalculatorFlowContract$InputData calculatorFlowContract$InputData = b0Var.f118303b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) b0Var.i.get();
                c84.g gVar = (c84.g) b0Var.f118311p.get();
                xa4.a aVar3 = (xa4.a) b0Var.k.get();
                c1 c1Var3 = b0Var.f118304c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new c64.e(cVar3, calculatorFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new c64.b((hw3.c) c1Var.f118472s0.get(), (ne0.j) b0Var.v.get());
            case 16:
                d64.b.Companion.getClass();
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        c1 c1Var = (c1) this.f115926c;
        dw3.c0 c0Var = (dw3.c0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(c0Var.f118403a, (j60.a) c0Var.f118406g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(c0Var.f118403a, (com.revolut.kompot.navigable.a) c0Var.e.get(), (rp0.m) c0Var.f.get());
            case 2:
                iq3.a aVar = c0Var.f118403a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) c0Var.f118413q.get());
            case 4:
                return new c84.z((c84.g) c0Var.f118412p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) c0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) c0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) c0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) c0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) c0Var.i.get();
                c1 c1Var2 = c0Var.f118405c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) c0Var.f118408j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) c0Var.f118408j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) c0Var.f118411n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) c0Var.f118409l.get(), li4.e.class, (li4.b) c0Var.f118410m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return kxa.j.m((j60.a) c0Var.f118416t.get());
            case 13:
                return wp5.y.r((com.revolut.kompot.navigable.a) c0Var.e.get(), (rp0.m) c0Var.f118415s.get());
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) c0Var.f118413q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) c0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                nw3.d dVar = (nw3.d) c1Var.J1.get();
                CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = c0Var.f118404b;
                c1 c1Var3 = c0Var.f118405c;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) c0Var.i.get();
                c84.g gVar = (c84.g) c0Var.f118412p.get();
                xa4.a aVar3 = (xa4.a) c0Var.k.get();
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                e84.e eVarW = e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB);
                j60.a aVar4 = (j60.a) c0Var.f118416t.get();
                wli.x xVarD = ((s41.a) c1Var.f118485x).d();
                g64.a aVar5 = new g64.a();
                sh3.a aVarA = c1Var3.F.a();
                vc.s.j(aVarA);
                ffk.t tVarF = c1Var3.G.f();
                vc.s.j(tVarF);
                hy2.f fVarA = c1Var3.H.a();
                l93.f fVarJ = c1Var3.f118474t.j();
                vc.s.j(fVarJ);
                g64.z zVar2 = new g64.z(aVarA, tVarF, fVarA, fVarJ);
                an4.i iVarN = c1Var.o.n();
                hw3.e eVar2 = (hw3.e) c1Var.Q0.get();
                hw3.e eVar3 = (hw3.e) c1Var3.Q0.get();
                q89.e eVarA = c1Var3.I.a();
                vc.s.j(eVarA);
                nw3.d dVar2 = (nw3.d) c1Var3.J1.get();
                ii4.o oVar2 = (ii4.o) c0Var.o.get();
                ffk.t tVarF2 = c1Var3.G.f();
                vc.s.j(tVarF2);
                d4m.a aVarA2 = e4m.b.a(c1Var3.f118470r1);
                gte.a aVarB2 = c1Var3.f118423b.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a(dVar, cardOrderingFlowContract$InputData, eVarW, aVar4, xVarD, aVar5, zVar2, iVarN, eVar2, new g64.s(eVar3, eVarA, dVar2, oVar2, tVarF2, aVarA2, aVarB2));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        c1 c1Var = (c1) this.f115926c;
        dw3.h0 h0Var = (dw3.h0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(h0Var.f118837a, (j60.a) h0Var.f118840g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(h0Var.f118837a, (com.revolut.kompot.navigable.a) h0Var.e.get(), (rp0.m) h0Var.f.get());
            case 2:
                iq3.a aVar = h0Var.f118837a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) h0Var.f118847q.get());
            case 4:
                return new c84.z((c84.g) h0Var.f118846p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) h0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) h0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) h0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) h0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) h0Var.i.get();
                c1 c1Var2 = h0Var.f118839c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) h0Var.f118842j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) h0Var.f118842j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) h0Var.f118845n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) h0Var.f118843l.get(), li4.e.class, (li4.b) h0Var.f118844m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) h0Var.f118847q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) h0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                CoBorrowerConsentInitiatorFlowContract$InputData coBorrowerConsentInitiatorFlowContract$InputData = h0Var.f118838b;
                pw3.a aVar3 = (pw3.a) c1Var.L1.get();
                ln3.b bVar4 = new ln3.b();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) h0Var.i.get();
                c84.g gVar = (c84.g) h0Var.f118846p.get();
                xa4.a aVar4 = (xa4.a) h0Var.k.get();
                c1 c1Var3 = h0Var.f118839c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b(coBorrowerConsentInitiatorFlowContract$InputData, aVar3, bVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        c1 c1Var = (c1) this.f115926c;
        dw3.i0 i0Var = (dw3.i0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(i0Var.f118927a, (j60.a) i0Var.f118930g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(i0Var.f118927a, (com.revolut.kompot.navigable.a) i0Var.e.get(), (rp0.m) i0Var.f.get());
            case 2:
                iq3.a aVar = i0Var.f118927a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) i0Var.f118937q.get());
            case 4:
                return new c84.z((c84.g) i0Var.f118936p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) i0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) i0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) i0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) i0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) i0Var.i.get();
                c1 c1Var2 = i0Var.f118929c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) i0Var.f118932j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) i0Var.f118932j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) i0Var.f118935n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) i0Var.f118933l.get(), li4.e.class, (li4.b) i0Var.f118934m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) i0Var.f118937q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) i0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) i0Var.i.get();
                c84.g gVar = (c84.g) i0Var.f118936p.get();
                xa4.a aVar3 = (xa4.a) i0Var.k.get();
                c1 c1Var3 = i0Var.f118929c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.a(e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new o64.d(i0Var.f118928b, (ne0.j) i0Var.v.get(), (pw3.b) c1Var.N1.get());
            case 16:
                p64.b.Companion.getClass();
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        c1 c1Var = (c1) this.f115926c;
        dw3.j0 j0Var = (dw3.j0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(j0Var.f118997a, (j60.a) j0Var.f119000g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(j0Var.f118997a, (com.revolut.kompot.navigable.a) j0Var.e.get(), (rp0.m) j0Var.f.get());
            case 2:
                iq3.a aVar = j0Var.f118997a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) j0Var.f119007q.get());
            case 4:
                return new c84.z((c84.g) j0Var.f119006p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) j0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) j0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) j0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) j0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) j0Var.i.get();
                c1 c1Var2 = j0Var.f118999c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) j0Var.f119002j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) j0Var.f119002j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) j0Var.f119005n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) j0Var.f119003l.get(), li4.e.class, (li4.b) j0Var.f119004m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return kxa.j.m((j60.a) j0Var.f119010t.get());
            case 13:
                return wp5.y.r((com.revolut.kompot.navigable.a) j0Var.e.get(), (rp0.m) j0Var.f119009s.get());
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) j0Var.f119007q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) j0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                ComboCardOrderingFlowContract$InputData comboCardOrderingFlowContract$InputData = j0Var.f118998b;
                c1 c1Var3 = j0Var.f118999c;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) j0Var.i.get();
                c84.g gVar = (c84.g) j0Var.f119006p.get();
                xa4.a aVar3 = (xa4.a) j0Var.k.get();
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                e84.e eVarW = e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB);
                nw3.d dVar = (nw3.d) c1Var.J1.get();
                u24.a aVar4 = (u24.a) c1Var.I1.get();
                hw3.e eVar2 = (hw3.e) c1Var3.Q0.get();
                q89.e eVarA = c1Var3.I.a();
                vc.s.j(eVarA);
                nw3.d dVar2 = (nw3.d) c1Var3.J1.get();
                ii4.o oVar2 = (ii4.o) j0Var.o.get();
                ffk.t tVarF = c1Var3.G.f();
                vc.s.j(tVarF);
                d4m.a aVarA = e4m.b.a(c1Var3.f118470r1);
                gte.a aVarB2 = c1Var3.f118423b.b();
                vc.s.j(aVarB2);
                return new u64.d(comboCardOrderingFlowContract$InputData, eVarW, dVar, aVar4, new g64.s(eVar2, eVarA, dVar2, oVar2, tVarF, aVarA, aVarB2));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        c1 c1Var = (c1) this.f115926c;
        l0 l0Var = (l0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(l0Var.f119144a, (j60.a) l0Var.f119147g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(l0Var.f119144a, (com.revolut.kompot.navigable.a) l0Var.e.get(), (rp0.m) l0Var.f.get());
            case 2:
                iq3.a aVar = l0Var.f119144a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) l0Var.f119154q.get());
            case 4:
                return new c84.z((c84.g) l0Var.f119153p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) l0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) l0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) l0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) l0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) l0Var.i.get();
                c1 c1Var2 = l0Var.f119146c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) l0Var.f119149j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) l0Var.f119149j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) l0Var.f119152n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) l0Var.f119150l.get(), li4.e.class, (li4.b) l0Var.f119151m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) l0Var.f119154q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) l0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                ConfirmationFlowContract$InputData confirmationFlowContract$InputData = l0Var.f119145b;
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) l0Var.i.get();
                c84.g gVar = (c84.g) l0Var.f119153p.get();
                xa4.a aVar3 = (xa4.a) l0Var.k.get();
                c1 c1Var3 = l0Var.f119146c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b(cVar3, confirmationFlowContract$InputData, aVarM2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        c1 c1Var = (c1) this.f115926c;
        n0 n0Var = (n0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                Object extension = (j60.a) n0Var.f119309g.get();
                z64.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) n0Var.e.get();
                rp0.m dialogDisplayer = (rp0.m) n0Var.f.get();
                he2.b dialogHostFinder = ehe.n.r();
                z64.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                z64.b.Companion.getClass();
                return new rp0.m();
            case 3:
                return ige.d.h(n0Var.f119306a, (j60.a) n0Var.f119311j.get());
            case 4:
                return com.revolut.data.database.models.openbanking.d.q(n0Var.f119306a, (com.revolut.kompot.navigable.a) n0Var.e.get(), (rp0.m) n0Var.i.get());
            case 5:
                iq3.a aVar = n0Var.f119306a;
                return new rp0.m();
            case 6:
                return e5f.b.x((c84.z) n0Var.f119319t.get());
            case 7:
                return new c84.z((c84.g) n0Var.f119318s.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) n0Var.f119312l.get());
            case 8:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) n0Var.f119312l.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) n0Var.f119314n.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) n0Var.f119317r.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 9:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) n0Var.f119312l.get();
                c1 c1Var2 = n0Var.f119308c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) n0Var.f119313m.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) n0Var.f119313m.get()), new ya4.g(new py3.f())));
            case 10:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 11:
                return new ii4.z((li4.a) n0Var.f119316q.get());
            case 12:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) n0Var.o.get(), li4.e.class, (li4.b) n0Var.f119315p.get()));
            case 13:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 14:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 15:
                c84.z zVar = (c84.z) n0Var.f119319t.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) n0Var.f119312l.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                qw3.a aVar3 = (qw3.a) c1Var.E1.get();
                CongratulationFlowContract$InputData congratulationFlowContract$InputData = n0Var.f119307b;
                j60.a aVar4 = (j60.a) n0Var.f119309g.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) n0Var.f119312l.get();
                c84.g gVar = (c84.g) n0Var.f119318s.get();
                xa4.a aVar5 = (xa4.a) n0Var.f119314n.get();
                c1 c1Var3 = n0Var.f119308c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b(aVar3, congratulationFlowContract$InputData, aVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        c1 c1Var = (c1) this.f115926c;
        o0 o0Var = (o0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(o0Var.f119381a, (j60.a) o0Var.f119384g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(o0Var.f119381a, (com.revolut.kompot.navigable.a) o0Var.e.get(), (rp0.m) o0Var.f.get());
            case 2:
                iq3.a aVar = o0Var.f119381a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) o0Var.f119391q.get());
            case 4:
                return new c84.z((c84.g) o0Var.f119390p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) o0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) o0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) o0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) o0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) o0Var.i.get();
                c1 c1Var2 = o0Var.f119383c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) o0Var.f119386j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) o0Var.f119386j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) o0Var.f119389n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) o0Var.f119387l.get(), li4.e.class, (li4.b) o0Var.f119388m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) o0Var.f119391q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) o0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                ConsentsFlowContract$InputData consentsFlowContract$InputData = o0Var.f119382b;
                lx4.a aVarE2 = c1Var.f118489y.e();
                vc.s.j(aVarE2);
                sw3.c cVar3 = (sw3.c) c1Var.a1.get();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) o0Var.i.get();
                c84.g gVar = (c84.g) o0Var.f119390p.get();
                xa4.a aVar3 = (xa4.a) o0Var.k.get();
                c1 c1Var3 = o0Var.f119383c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a(consentsFlowContract$InputData, aVarE2, cVar3, aVarM2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        c1 c1Var = (c1) this.f115926c;
        p0 p0Var = (p0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(p0Var.f119477a, (j60.a) p0Var.f119480g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(p0Var.f119477a, (com.revolut.kompot.navigable.a) p0Var.e.get(), (rp0.m) p0Var.f.get());
            case 2:
                iq3.a aVar = p0Var.f119477a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) p0Var.f119487q.get());
            case 4:
                return new c84.z((c84.g) p0Var.f119486p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) p0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) p0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) p0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) p0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) p0Var.i.get();
                c1 c1Var2 = p0Var.f119479c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) p0Var.f119482j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) p0Var.f119482j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) p0Var.f119485n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) p0Var.f119483l.get(), li4.e.class, (li4.b) p0Var.f119484m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) p0Var.f119487q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) p0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                ConsentsV1FlowContract$InputData consentsV1FlowContract$InputData = p0Var.f119478b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) p0Var.i.get();
                c84.g gVar = (c84.g) p0Var.f119486p.get();
                xa4.a aVar3 = (xa4.a) p0Var.k.get();
                c1 c1Var3 = p0Var.f119479c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a(cVar3, consentsV1FlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        c1 c1Var = (c1) this.f115926c;
        r0 r0Var = (r0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(r0Var.f119612a, (j60.a) r0Var.f119615g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(r0Var.f119612a, (com.revolut.kompot.navigable.a) r0Var.e.get(), (rp0.m) r0Var.f.get());
            case 2:
                iq3.a aVar = r0Var.f119612a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) r0Var.f119622q.get());
            case 4:
                return new c84.z((c84.g) r0Var.f119621p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) r0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) r0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) r0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) r0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) r0Var.i.get();
                c1 c1Var2 = r0Var.f119614c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) r0Var.f119617j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) r0Var.f119617j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) r0Var.f119620n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) r0Var.f119618l.get(), li4.e.class, (li4.b) r0Var.f119619m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) r0Var.f119622q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) r0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                tw3.a aVar3 = (tw3.a) c1Var.X2.get();
                ConveyancingAppointmentSchedulingFlowContract$InputData conveyancingAppointmentSchedulingFlowContract$InputData = r0Var.f119613b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) r0Var.i.get();
                c84.g gVar = (c84.g) r0Var.f119621p.get();
                xa4.a aVar4 = (xa4.a) r0Var.k.get();
                c1 c1Var3 = r0Var.f119614c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c(aVar3, conveyancingAppointmentSchedulingFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        c1 c1Var = (c1) this.f115926c;
        s0 s0Var = (s0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(s0Var.f119709a, (j60.a) s0Var.f119712g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(s0Var.f119709a, (com.revolut.kompot.navigable.a) s0Var.e.get(), (rp0.m) s0Var.f.get());
            case 2:
                iq3.a aVar = s0Var.f119709a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) s0Var.f119719q.get());
            case 4:
                return new c84.z((c84.g) s0Var.f119718p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) s0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) s0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) s0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) s0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) s0Var.i.get();
                c1 c1Var2 = s0Var.f119711c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) s0Var.f119714j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) s0Var.f119714j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) s0Var.f119717n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) s0Var.f119715l.get(), li4.e.class, (li4.b) s0Var.f119716m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return kxa.j.m((j60.a) s0Var.f119722t.get());
            case 13:
                return wp5.y.r((com.revolut.kompot.navigable.a) s0Var.e.get(), (rp0.m) s0Var.f119721s.get());
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) s0Var.f119719q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) s0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                CreditAddonFlowContract$InputData creditAddonFlowContract$InputData = s0Var.f119710b;
                f84.k kVar = (f84.k) s0Var.f119724x.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) s0Var.i.get();
                c84.g gVar = (c84.g) s0Var.f119718p.get();
                xa4.a aVar3 = (xa4.a) s0Var.k.get();
                c1 c1Var3 = s0Var.f119711c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.b(creditAddonFlowContract$InputData, kVar, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 18:
                return new f84.k((PluginFlowContract$Input) s0Var.i.get(), (uw3.a) c1Var.g3.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        c1 c1Var = (c1) this.f115926c;
        t0 t0Var = (t0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(t0Var.f119807a, (j60.a) t0Var.f119810g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(t0Var.f119807a, (com.revolut.kompot.navigable.a) t0Var.e.get(), (rp0.m) t0Var.f.get());
            case 2:
                iq3.a aVar = t0Var.f119807a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) t0Var.f119817q.get());
            case 4:
                return new c84.z((c84.g) t0Var.f119816p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) t0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) t0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) t0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) t0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) t0Var.i.get();
                c1 c1Var2 = t0Var.f119809c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) t0Var.f119812j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) t0Var.f119812j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) t0Var.f119815n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) t0Var.f119813l.get(), li4.e.class, (li4.b) t0Var.f119814m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) t0Var.f119817q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) t0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                CreditAddressFlowContract$InputData creditAddressFlowContract$InputData = t0Var.f119808b;
                zi1.d dVarA = c1Var.B.a();
                vc.s.j(dVarA);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) t0Var.i.get();
                c84.g gVar = (c84.g) t0Var.f119816p.get();
                xa4.a aVar3 = (xa4.a) t0Var.k.get();
                c1 c1Var3 = t0Var.f119809c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c(creditAddressFlowContract$InputData, dVarA, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        c1 c1Var = (c1) this.f115926c;
        x0 x0Var = (x0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(x0Var.f120111a, (j60.a) x0Var.f120114g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(x0Var.f120111a, (com.revolut.kompot.navigable.a) x0Var.e.get(), (rp0.m) x0Var.f.get());
            case 2:
                iq3.a aVar = x0Var.f120111a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) x0Var.f120121q.get());
            case 4:
                return new c84.z((c84.g) x0Var.f120120p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) x0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) x0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) x0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) x0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) x0Var.i.get();
                c1 c1Var2 = x0Var.f120113c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) x0Var.f120116j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) x0Var.f120116j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) x0Var.f120119n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) x0Var.f120117l.get(), li4.e.class, (li4.b) x0Var.f120118m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) x0Var.f120121q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) x0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                CreditAddressV2FlowContract$InputData creditAddressV2FlowContract$InputData = x0Var.f120112b;
                iw3.a aVar3 = (iw3.a) c1Var.f118467q3.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) x0Var.i.get();
                c84.g gVar = (c84.g) x0Var.f120120p.get();
                xa4.a aVar4 = (xa4.a) x0Var.k.get();
                c1 c1Var3 = x0Var.f120113c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.address_v2.b(creditAddressV2FlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        c1 c1Var = (c1) this.f115926c;
        z0 z0Var = (z0) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(z0Var.f120250a, (j60.a) z0Var.f120253g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(z0Var.f120250a, (com.revolut.kompot.navigable.a) z0Var.e.get(), (rp0.m) z0Var.f.get());
            case 2:
                iq3.a aVar = z0Var.f120250a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) z0Var.f120260q.get());
            case 4:
                return new c84.z((c84.g) z0Var.f120259p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) z0Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) z0Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) z0Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) z0Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) z0Var.i.get();
                c1 c1Var2 = z0Var.f120252c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) z0Var.f120255j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) z0Var.f120255j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) z0Var.f120258n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) z0Var.f120256l.get(), li4.e.class, (li4.b) z0Var.f120257m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) z0Var.f120260q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) z0Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                CreditAgreementsV2FlowContract$InputData creditAgreementsV2FlowContract$InputData = z0Var.f120251b;
                lw3.b bVar4 = (lw3.b) c1Var.H1.get();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) z0Var.i.get();
                c84.g gVar = (c84.g) z0Var.f120259p.get();
                xa4.a aVar3 = (xa4.a) z0Var.k.get();
                c1 c1Var3 = z0Var.f120252c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a(creditAgreementsV2FlowContract$InputData, bVar4, aVarM2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        a1 a1Var = (a1) this.d;
        iq3.a aVar = a1Var.f118241a;
        c1 c1Var = (c1) this.f115926c;
        uq3.b bVar = c1Var.f118428c;
        int i = this.f115925b;
        if (i == 0) {
            return ige.d.h(aVar, (j60.a) a1Var.f118244g.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.q(aVar, (com.revolut.kompot.navigable.a) a1Var.e.get(), (rp0.m) a1Var.f.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            ow3.e eVar = (ow3.e) c1Var.Y0.get();
            wli.x xVarD = ((s41.a) c1Var.f118485x).d();
            hw3.c cVar = (hw3.c) c1Var.f118472s0.get();
            ow3.g gVar = (ow3.g) c1Var.U1.get();
            dq3.a aVar2 = (dq3.a) c1Var.W1.get();
            j54.v vVar = (j54.v) a1Var.i.get();
            aq3.a aVarE = bVar.e();
            vc.s.j(aVarE);
            return new com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c(eVar, xVarD, cVar, gVar, aVar2, vVar, aVarE);
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData = a1Var.f118242b;
            xq3.j jVarH = bVar.h();
            vc.s.j(jVarH);
            return new h64.c(creditApplicationCloseFlowContract$InputData, jVarH, c1Var.k.e());
        }
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        xq3.j jVarD = bVar.d();
        vc.s.j(jVarD);
        hy3.j jVar = (hy3.j) c1Var.Q1.get();
        vie.i iVarB = c1Var.z.b();
        vc.s.j(iVarB);
        gte.a aVarB = c1Var.f118423b.b();
        vc.s.j(aVarB);
        return new j54.y(wVarA, jVarD, jVar, iVarB, aVarB);
    }

    private final Object r() {
        b1 b1Var = (b1) this.d;
        c1 c1Var = (c1) this.f115926c;
        int i = this.f115925b;
        switch (i) {
            case 0:
                til.m mVarA = c1Var.f118420a0.a();
                vc.s.j(mVarA);
                j54.i0 i0Var = (j54.i0) b1Var.f118322j.get();
                j54.v vVar = (j54.v) b1Var.f118321h.get();
                xq3.j jVarH = c1Var.f118428c.h();
                vc.s.j(jVarH);
                return new y0(mVarA, i0Var, vVar, jVarH, (j54.f) b1Var.i.get());
            case 1:
                CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = b1Var.f118317a;
                c1 c1Var2 = b1Var.f118318b;
                rz3.c cVar = (rz3.c) c1Var.f118470r1.get();
                rz3.c cVar2 = (rz3.c) c1Var.A2.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                ii4.o oVar = (ii4.o) b1Var.f118320g.get();
                ang.f fVarE = c1Var.k.e();
                j54.v vVar2 = (j54.v) b1Var.f118321h.get();
                j54.f fVar = (j54.f) b1Var.i.get();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(14);
                j1 j1Var = j1.CREDIT_CARD;
                cri.d dVar = c1Var2.u;
                mri.w wVarA = ((ozl.a) dVar).a();
                vc.s.j(wVarA);
                Context context = c1Var2.f118454m;
                builderBuilderWithExpectedSize.put(j1Var, new lz3.b(wVarA, dw3.l.y(context)));
                j1 j1Var2 = j1.CREDIT_CARD_LIMIT_DECREASE;
                jm4.r rVar = c1Var2.f118447j;
                al4.q qVarA = rVar.a();
                al4.n nVarS = rVar.s();
                vc.s.j(nVarS);
                builderBuilderWithExpectedSize.put(j1Var2, new lz3.d(qVarA, nVarS));
                builderBuilderWithExpectedSize.put(j1.CREDIT_CARD_LIMIT_INCREASE, new lz3.f(rVar.a(), dw3.l.y(context)));
                j1 j1Var3 = j1.FAMILY_CREDIT_CARD;
                mri.w wVarA2 = ((ozl.a) dVar).a();
                vc.s.j(wVarA2);
                builderBuilderWithExpectedSize.put(j1Var3, new lz3.g(wVarA2, dw3.l.y(context)));
                builderBuilderWithExpectedSize.put(j1.FIXED_TERM_CREDIT, new lz3.h(dw3.l.y(context)));
                builderBuilderWithExpectedSize.put(j1.MORTGAGE, new lz3.k());
                builderBuilderWithExpectedSize.put(j1.REFINANCING_MORTGAGE, new lz3.k());
                builderBuilderWithExpectedSize.put(j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, new lz3.o(dw3.l.y(context)));
                builderBuilderWithExpectedSize.put(j1.NON_EMBEDDED_CREDIT_INSURANCE_CC, new lz3.m(dw3.l.y(context)));
                builderBuilderWithExpectedSize.put(j1.FTC_FORBEARANCE, new lz3.j(dw3.l.y(c1Var2.f118454m)));
                builderBuilderWithExpectedSize.put(j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, new lz3.j(dw3.l.y(c1Var2.f118454m)));
                builderBuilderWithExpectedSize.put(j1.POST_TERMINATION_REPAYMENT_PLAN, new lz3.j(dw3.l.y(c1Var2.f118454m)));
                j1 j1Var4 = j1.OVERDRAFT;
                k95.a aVar = c1Var2.f118465q;
                o95.i iVarD = aVar.d();
                vc.s.j(iVarD);
                vx4.b bVarE = aVar.e();
                vc.s.j(bVarE);
                builderBuilderWithExpectedSize.put(j1Var4, new lz3.d(iVarD, bVarE));
                builderBuilderWithExpectedSize.put(j1.BUY_NOW_PAY_LATER, new lz3.r(c1Var2.f118424b0.e(), dw3.l.y(context)));
                return new j54.r0(creditApplicationFlowContract$InputData, cVar, cVar2, jVarH2, oVar, fVarE, vVar2, fVar, new ib7.j(builderBuilderWithExpectedSize.build(), 2));
            case 2:
                return new ii4.z((li4.a) b1Var.f.get());
            case 3:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b1Var.d.get(), li4.e.class, (li4.b) b1Var.e.get()));
            case 4:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 5:
                uq3.b bVar = c1Var.f118428c;
                uq3.b bVar2 = c1Var.f118428c;
                xq3.j jVarH4 = bVar.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar2.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar2.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 6:
                mri.w wVarA3 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA3);
                xq3.j jVarD = c1Var.f118428c.d();
                vc.s.j(jVarD);
                hy3.j jVar = (hy3.j) c1Var.Q1.get();
                vie.i iVarB = c1Var.z.b();
                vc.s.j(iVarB);
                gte.a aVarB = c1Var.f118423b.b();
                vc.s.j(aVarB);
                return new j54.y(wVarA3, jVarD, jVar, iVarB, aVarB);
            case 7:
                ow3.e eVar = (ow3.e) c1Var.Y0.get();
                wli.x xVarD = ((s41.a) c1Var.f118485x).d();
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                ow3.g gVar = (ow3.g) c1Var.U1.get();
                dq3.a aVar2 = (dq3.a) c1Var.W1.get();
                j54.v vVar3 = (j54.v) b1Var.f118321h.get();
                aq3.a aVarE = c1Var.f118428c.e();
                vc.s.j(aVarE);
                return new com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c(eVar, xVarD, cVar3, gVar, aVar2, vVar3, aVarE);
            case 8:
                CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData2 = b1Var.f118317a;
                xmg.a aVar3 = c1Var.k;
                jm4.r rVar2 = c1Var.f118447j;
                ang.f fVarE2 = aVar3.e();
                zja.a aVarA = ((ika.b) c1Var.L).a();
                vc.s.j(aVarA);
                return new com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d(creditApplicationFlowContract$InputData2, fVarE2, aVarA, rVar2.i(), rVar2.j(), (j54.v) b1Var.f118321h.get());
            case 9:
                cri.d dVar2 = c1Var.u;
                uq3.b bVar3 = c1Var.f118428c;
                mri.w wVarA4 = ((ozl.a) dVar2).a();
                vc.s.j(wVarA4);
                sp3.a aVarM2 = bVar3.m();
                vc.s.j(aVarM2);
                ang.f fVarE3 = c1Var.k.e();
                xq3.j jVarH5 = bVar3.h();
                vc.s.j(jVarH5);
                return new j54.s(wVarA4, aVarM2, fVarE3, jVarH5);
            case 10:
                rz3.e eVar2 = new rz3.e();
                qr0.i iVar = new qr0.i(b1Var.f118317a);
                uq3.b bVar4 = c1Var.f118428c;
                uq3.b bVar5 = c1Var.f118428c;
                xq3.j jVarH6 = bVar4.h();
                vc.s.j(jVarH6);
                ow3.e eVar3 = (ow3.e) c1Var.Y0.get();
                xq3.j jVarG = bVar5.g();
                vc.s.j(jVarG);
                xq3.j jVar2 = (xq3.j) bVar5.C.get();
                vc.s.j(jVar2);
                cu8.r0 r0VarA = c1Var.c0.a();
                ang.f fVarE4 = c1Var.k.e();
                hz3.c cVarB = c1Var.b();
                al4.p pVarI = c1Var.f118447j.i();
                hw3.l lVar = (hw3.l) c1Var.B2.get();
                gte.a aVarB2 = c1Var.f118423b.b();
                vc.s.j(aVarB2);
                h54.a aVar4 = new h54.a();
                sp3.a aVarM3 = bVar5.m();
                vc.s.j(aVarM3);
                j24.c cVar4 = (j24.c) c1Var.C2.get();
                CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData3 = b1Var.f118317a;
                j54.i0 i0Var2 = (j54.i0) b1Var.f118322j.get();
                j54.s0 s0Var = (j54.s0) b1Var.k.get();
                j54.f fVar2 = (j54.f) b1Var.i.get();
                j54.v vVar4 = (j54.v) b1Var.f118321h.get();
                j54.z zVar = (j54.z) b1Var.f118323l.get();
                j54.s sVar = (j54.s) b1Var.f118324m.get();
                wli.x xVarD2 = ((s41.a) c1Var.f118485x).d();
                yp.b bVarA = c1Var.f118430d0.a();
                vie.i iVarB2 = c1Var.z.b();
                vc.s.j(iVarB2);
                aq3.a aVarE2 = bVar5.e();
                vc.s.j(aVarE2);
                return new com.revolut.feature.credit.application.plugins.impl.ui.application.d(eVar2, iVar, jVarH6, eVar3, jVarG, jVar2, r0VarA, fVarE4, cVarB, pVarI, lVar, aVarB2, aVar4, aVarM3, cVar4, creditApplicationFlowContract$InputData3, i0Var2, s0Var, fVar2, vVar4, zVar, sVar, xVarD2, bVarA, iVarB2, aVarE2, (rg4.d) b1Var.f118325n.get());
            case 11:
                xq3.z zVar2 = (xq3.z) c1Var.f118428c.f282088e0.get();
                vc.s.j(zVar2);
                com.revolut.feature.credit.application.models.preapplication.a aVar5 = new com.revolut.feature.credit.application.models.preapplication.a();
                gte.a aVarB3 = c1Var.f118423b.b();
                vc.s.j(aVarB3);
                return new rg4.f(zVar2, aVar5, aVarB3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        c1 c1Var = (c1) this.f115926c;
        d1 d1Var = (d1) this.d;
        int i = this.f115925b;
        switch (i) {
            case 0:
                return ige.d.h(d1Var.f118534a, (j60.a) d1Var.f118537g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(d1Var.f118534a, (com.revolut.kompot.navigable.a) d1Var.e.get(), (rp0.m) d1Var.f.get());
            case 2:
                iq3.a aVar = d1Var.f118534a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) d1Var.f118544q.get());
            case 4:
                return new c84.z((c84.g) d1Var.f118543p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) d1Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) d1Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) d1Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) d1Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) d1Var.i.get();
                c1 c1Var2 = d1Var.f118536c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) d1Var.f118539j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) d1Var.f118539j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) d1Var.f118542n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) d1Var.f118540l.get(), li4.e.class, (li4.b) d1Var.f118541m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) d1Var.f118544q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) d1Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                CreditCardApplicationAutopayFlowContract$InputData creditCardApplicationAutopayFlowContract$InputData = d1Var.f118535b;
                wj4.a aVar3 = new wj4.a();
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                hw3.e eVar2 = (hw3.e) c1Var.Q0.get();
                lb5.a aVar4 = (lb5.a) c1Var.V.o.get();
                vc.s.j(aVar4);
                uj4.a aVar5 = (uj4.a) c1Var.U.d.get();
                vc.s.j(aVar5);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) d1Var.i.get();
                c84.g gVar = (c84.g) d1Var.f118543p.get();
                xa4.a aVar6 = (xa4.a) d1Var.k.get();
                c1 c1Var3 = d1Var.f118536c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b(creditCardApplicationAutopayFlowContract$InputData, aVar3, cVar3, eVar2, aVar4, aVar5, e5f.b.w(pluginFlowContract$Input4, gVar, aVar6, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new m54.a(c1Var.W.a());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object zVar;
        Object bVar;
        switch (this.f115924a) {
            case 0:
                r rVar = (r) this.f115926c;
                z zVar2 = (z) this.d;
                int i = this.f115925b;
                if (i == 0) {
                    return new lnc.f((lnc.g) zVar2.f116108c.get(), zVar2.f116107b, rVar.e.c(), new onc.c((aii.o) zVar2.d.get()), new pnc.c((aii.o) zVar2.d.get()));
                }
                if (i == 1) {
                    return new lnc.g(new onc.b(new nnc.d(), new nnc.b()), new pnc.b(new nnc.d(), new nnc.b()), rVar.e.d(), zVar2.f116107b);
                }
                throw new AssertionError(i);
            case 1:
                c1 c1Var = (c1) this.f115926c;
                dw3.q qVar = (dw3.q) this.d;
                int i2 = this.f115925b;
                switch (i2) {
                    case 0:
                        return ige.d.h(qVar.f119539a, (j60.a) qVar.f119543h.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(qVar.f119539a, (com.revolut.kompot.navigable.a) qVar.f.get(), (rp0.m) qVar.f119542g.get());
                    case 2:
                        iq3.a aVar = qVar.f119539a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) qVar.f119550r.get());
                    case 4:
                        return new c84.z((c84.g) qVar.f119549q.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) qVar.f119544j.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) qVar.f119544j.get();
                        e4m.e eVar = c1Var.f118470r1;
                        uq3.b bVar2 = c1Var.f118428c;
                        rz3.c cVar = (rz3.c) eVar.get();
                        xa4.a aVar2 = (xa4.a) qVar.f119545l.get();
                        xq3.j jVarH = bVar2.h();
                        vc.s.j(jVarH);
                        mri.w wVarA = ((ozl.a) c1Var.u).a();
                        vc.s.j(wVarA);
                        ii4.o oVar = (ii4.o) qVar.f119548p.get();
                        aq3.a aVarE = bVar2.e();
                        vc.s.j(aVarE);
                        return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) qVar.f119544j.get();
                        c1 c1Var2 = qVar.f119541c;
                        return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) qVar.k.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) qVar.k.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                        xq3.j jVarH2 = c1Var.f118428c.h();
                        vc.s.j(jVarH2);
                        return new ya4.f(cVar2, jVarH2);
                    case 8:
                        return new ii4.z((li4.a) qVar.o.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) qVar.f119546m.get(), li4.e.class, (li4.b) qVar.f119547n.get()));
                    case 10:
                        xq3.j jVarH3 = c1Var.f118428c.h();
                        vc.s.j(jVarH3);
                        return new li4.c(jVarH3);
                    case 11:
                        uq3.b bVar3 = c1Var.f118428c;
                        uq3.b bVar4 = c1Var.f118428c;
                        xq3.j jVarH4 = bVar3.h();
                        vc.s.j(jVarH4);
                        xq3.c cVarF = bVar4.f();
                        vc.s.j(cVarF);
                        sp3.a aVarM = bVar4.m();
                        vc.s.j(aVarM);
                        return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
                    case 12:
                        return f60.i.a((e60.a) qVar.A.get());
                    case 13:
                        com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) qVar.f.get();
                        g60.a aVarA = f60.e.a((com.revolut.kompot.navigable.a) qVar.f.get());
                        Activity activityA = f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get());
                        t80.g gVar = (t80.g) qVar.f119552t.get();
                        com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) qVar.f.get();
                        f60.h.a(aVar4);
                        d4m.a aVarA2 = e4m.b.a(qVar.u);
                        nli.a aVar5 = new nli.a((t80.c) qVar.v.get(), f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get()));
                        t80.g gVar2 = (t80.g) qVar.f119552t.get();
                        zk0.b bVarL = qVar.f119541c.f118443h.l();
                        vc.s.j(bVarL);
                        return f60.j.a(aVar3, new t80.v(aVarA, activityA, gVar, aVar4, aVarA2, aVar5, new oli.c(gVar2, bVarL, new nli.a((t80.c) qVar.v.get(), f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get())), f60.e.a((com.revolut.kompot.navigable.a) qVar.f.get()), qVar.c()), new oli.g(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get())), pli.b.a(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get()))), new ami.n(e4m.b.a(qVar.f119553w), 1), e4m.b.a(qVar.u), (t80.g) qVar.f119552t.get(), new nli.a((t80.c) qVar.v.get(), f60.b.a((com.revolut.kompot.navigable.a) qVar.f.get())), new i90.b(), qVar.b(), qVar.c()), qVar.c()), f60.g.a(), (rp0.m) qVar.f119554x.get(), (e60.t) qVar.z.get(), new nji.b());
                    case 14:
                        l70.e eVar2 = c1Var.f118443h;
                        l70.e eVar3 = c1Var.f118443h;
                        f80.a aVarX = eVar2.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar3.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar3.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX, eVarH, bVarL2);
                    case 15:
                        com.revolut.kompot.navigable.a aVar6 = (com.revolut.kompot.navigable.a) qVar.f.get();
                        f60.h.a(aVar6);
                        return pli.c.a(new ks0.n(aVar6));
                    case 16:
                        nb4.b.Companion.getClass();
                        return new t80.c(new e.a("FinancialEvidence"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 17:
                        return t96.a.a();
                    case 18:
                        return f60.c.a();
                    case 19:
                        aii.o oVar2 = (aii.o) qVar.f119555y.get();
                        y80.a aVarR = c1Var.f118443h.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar2, aVarR, qVar.b(), Optional.empty());
                    case 20:
                        c84.z zVar3 = (c84.z) qVar.f119550r.get();
                        e5f.b.a(zVar3);
                        return zVar3;
                    case 21:
                        e60.t tVar = (e60.t) qVar.z.get();
                        f60.f.a(tVar);
                        return tVar;
                    case 22:
                        PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) qVar.f119544j.get();
                        xr3.y yVarK = c1Var.f118428c.k();
                        vc.s.j(yVarK);
                        return new c84.c(pluginFlowContract$Input3, yVarK);
                    case 23:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a(qVar.f119540b, (sb4.c) qVar.F.get(), (e60.a) qVar.A.get(), (c84.g) qVar.f119549q.get());
                    case 24:
                        return new sb4.c((hx3.a) c1Var.J2.get(), (PluginFlowContract$Input) qVar.f119544j.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                dw3.r rVar2 = (dw3.r) this.d;
                int i3 = this.f115925b;
                if (i3 == 0) {
                    return e5f.b.d((com.revolut.kompot.navigable.a) rVar2.f119608a.get(), (c84.b) rVar2.f119610c.get(), (PluginFlowContract$Input) ((s4) this.f115926c).i.get());
                }
                if (i3 == 1) {
                    return new c84.b();
                }
                if (i3 == 2) {
                    return new t84.g((jki.p) rVar2.f.get());
                }
                if (i3 == 3) {
                    return new t84.h();
                }
                throw new AssertionError(i3);
            case 3:
                c1 c1Var3 = (c1) this.f115926c;
                dw3.t tVar2 = (dw3.t) this.d;
                int i5 = this.f115925b;
                switch (i5) {
                    case 0:
                        return ige.d.h(tVar2.f119793a, (j60.a) tVar2.f119796g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(tVar2.f119793a, (com.revolut.kompot.navigable.a) tVar2.e.get(), (rp0.m) tVar2.f.get());
                    case 2:
                        iq3.a aVar7 = tVar2.f119793a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) tVar2.f119803q.get());
                    case 4:
                        return new c84.z((c84.g) tVar2.f119802p.get(), (rz3.c) c1Var3.f118470r1.get(), (PluginFlowContract$Input) tVar2.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) tVar2.i.get();
                        e4m.e eVar4 = c1Var3.f118470r1;
                        uq3.b bVar5 = c1Var3.f118428c;
                        rz3.c cVar3 = (rz3.c) eVar4.get();
                        xa4.a aVar8 = (xa4.a) tVar2.k.get();
                        xq3.j jVarH5 = bVar5.h();
                        vc.s.j(jVarH5);
                        mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                        vc.s.j(wVarA2);
                        ii4.o oVar3 = (ii4.o) tVar2.o.get();
                        aq3.a aVarE2 = bVar5.e();
                        vc.s.j(aVarE2);
                        return new c84.i(pluginFlowContract$Input4, cVar3, aVar8, jVarH5, wVarA2, oVar3, aVarE2);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input5 = (PluginFlowContract$Input) tVar2.i.get();
                        c1 c1Var4 = tVar2.f119795c;
                        return new xa4.b(pluginFlowContract$Input5, ImmutableSet.of((ya4.g) new ya4.c(c1Var4.i(), (ya4.f) tVar2.f119798j.get()), (ya4.g) new ya4.c(c1Var4.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) tVar2.f119798j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar4 = (rz3.c) c1Var3.f118470r1.get();
                        xq3.j jVarH6 = c1Var3.f118428c.h();
                        vc.s.j(jVarH6);
                        return new ya4.f(cVar4, jVarH6);
                    case 8:
                        return new ii4.z((li4.a) tVar2.f119801n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) tVar2.f119799l.get(), li4.e.class, (li4.b) tVar2.f119800m.get()));
                    case 10:
                        xq3.j jVarH7 = c1Var3.f118428c.h();
                        vc.s.j(jVarH7);
                        return new li4.c(jVarH7);
                    case 11:
                        uq3.b bVar6 = c1Var3.f118428c;
                        uq3.b bVar7 = c1Var3.f118428c;
                        xq3.j jVarH8 = bVar6.h();
                        vc.s.j(jVarH8);
                        xq3.c cVarF2 = bVar7.f();
                        vc.s.j(cVarF2);
                        sp3.a aVarM2 = bVar7.m();
                        vc.s.j(aVarM2);
                        return new ji4.b(jVarH8, cVarF2, aVarM2, c1Var3.i());
                    case 12:
                        c84.z zVar4 = (c84.z) tVar2.f119803q.get();
                        e5f.b.a(zVar4);
                        return zVar4;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input6 = (PluginFlowContract$Input) tVar2.i.get();
                        xr3.y yVarK2 = c1Var3.f118428c.k();
                        vc.s.j(yVarK2);
                        return new c84.c(pluginFlowContract$Input6, yVarK2);
                    case 14:
                        x44.c cVar5 = (x44.c) tVar2.u.get();
                        CreditApplicationAgreementsFlowContract$InputData creditApplicationAgreementsFlowContract$InputData = tVar2.f119794b;
                        sp3.a aVarM3 = c1Var3.f118428c.m();
                        vc.s.j(aVarM3);
                        PluginFlowContract$Input pluginFlowContract$Input7 = (PluginFlowContract$Input) tVar2.i.get();
                        c84.g gVar3 = (c84.g) tVar2.f119802p.get();
                        xa4.a aVar9 = (xa4.a) tVar2.k.get();
                        c1 c1Var5 = tVar2.f119795c;
                        gte.a aVarB = c1Var5.f118423b.b();
                        vc.s.j(aVarB);
                        hz3.c cVarB = c1Var5.b();
                        xq3.j jVarD = c1Var5.f118428c.d();
                        vc.s.j(jVarD);
                        mri.w wVarA3 = ((ozl.a) c1Var5.u).a();
                        vc.s.j(wVarA3);
                        hy3.j jVar = (hy3.j) c1Var5.Q1.get();
                        vie.i iVarB = c1Var5.z.b();
                        vc.s.j(iVarB);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a(cVar5, creditApplicationAgreementsFlowContract$InputData, aVarM3, e5f.b.w(pluginFlowContract$Input7, gVar3, aVar9, aVarB, cVarB, jVarD, wVarA3, jVar, iVarB));
                    case 15:
                        return new x44.c((PluginFlowContract$Input) tVar2.i.get(), (lw3.a) c1Var3.G1.get(), (hw3.e) c1Var3.Q0.get());
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                dw3.u uVar = (dw3.u) this.d;
                int i6 = this.f115925b;
                if (i6 == 0) {
                    c54.f fVar = uVar.f119872a;
                    f80.a aVarX2 = ((c1) this.f115926c).f118443h.x();
                    vc.s.j(aVarX2);
                    return new c54.k(fVar, aVarX2, (c54.a) uVar.f119874c.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                ViewController controller = uVar.f119873b;
                d54.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c54.d(controller.m2());
            case 5:
                c1 c1Var6 = (c1) this.f115926c;
                dw3.v vVar = (dw3.v) this.d;
                int i21 = this.f115925b;
                switch (i21) {
                    case 0:
                        return ige.d.h(vVar.f119945a, (j60.a) vVar.f119948g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(vVar.f119945a, (com.revolut.kompot.navigable.a) vVar.e.get(), (rp0.m) vVar.f.get());
                    case 2:
                        iq3.a aVar10 = vVar.f119945a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) vVar.f119955q.get());
                    case 4:
                        return new c84.z((c84.g) vVar.f119954p.get(), (rz3.c) c1Var6.f118470r1.get(), (PluginFlowContract$Input) vVar.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input8 = (PluginFlowContract$Input) vVar.i.get();
                        e4m.e eVar5 = c1Var6.f118470r1;
                        uq3.b bVar8 = c1Var6.f118428c;
                        rz3.c cVar6 = (rz3.c) eVar5.get();
                        xa4.a aVar11 = (xa4.a) vVar.k.get();
                        xq3.j jVarH9 = bVar8.h();
                        vc.s.j(jVarH9);
                        mri.w wVarA4 = ((ozl.a) c1Var6.u).a();
                        vc.s.j(wVarA4);
                        ii4.o oVar4 = (ii4.o) vVar.o.get();
                        aq3.a aVarE3 = bVar8.e();
                        vc.s.j(aVarE3);
                        return new c84.i(pluginFlowContract$Input8, cVar6, aVar11, jVarH9, wVarA4, oVar4, aVarE3);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input9 = (PluginFlowContract$Input) vVar.i.get();
                        c1 c1Var7 = vVar.f119947c;
                        return new xa4.b(pluginFlowContract$Input9, ImmutableSet.of((ya4.g) new ya4.c(c1Var7.i(), (ya4.f) vVar.f119950j.get()), (ya4.g) new ya4.c(c1Var7.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) vVar.f119950j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar7 = (rz3.c) c1Var6.f118470r1.get();
                        xq3.j jVarH10 = c1Var6.f118428c.h();
                        vc.s.j(jVarH10);
                        return new ya4.f(cVar7, jVarH10);
                    case 8:
                        return new ii4.z((li4.a) vVar.f119953n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) vVar.f119951l.get(), li4.e.class, (li4.b) vVar.f119952m.get()));
                    case 10:
                        xq3.j jVarH11 = c1Var6.f118428c.h();
                        vc.s.j(jVarH11);
                        return new li4.c(jVarH11);
                    case 11:
                        uq3.b bVar9 = c1Var6.f118428c;
                        uq3.b bVar10 = c1Var6.f118428c;
                        xq3.j jVarH12 = bVar9.h();
                        vc.s.j(jVarH12);
                        xq3.c cVarF3 = bVar10.f();
                        vc.s.j(cVarF3);
                        sp3.a aVarM4 = bVar10.m();
                        vc.s.j(aVarM4);
                        return new ji4.b(jVarH12, cVarF3, aVarM4, c1Var6.i());
                    case 12:
                        c84.z zVar5 = (c84.z) vVar.f119955q.get();
                        e5f.b.a(zVar5);
                        return zVar5;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input10 = (PluginFlowContract$Input) vVar.i.get();
                        xr3.y yVarK3 = c1Var6.f118428c.k();
                        vc.s.j(yVarK3);
                        return new c84.c(pluginFlowContract$Input10, yVarK3);
                    case 14:
                        AkahuFlowContract$InputData akahuFlowContract$InputData = vVar.f119946b;
                        mw3.c cVar8 = (mw3.c) c1Var6.Y2.get();
                        mw3.e eVar6 = (mw3.e) c1Var6.f118458n1.get();
                        PluginFlowContract$Input pluginFlowContract$Input11 = (PluginFlowContract$Input) vVar.i.get();
                        c84.g gVar4 = (c84.g) vVar.f119954p.get();
                        xa4.a aVar12 = (xa4.a) vVar.k.get();
                        c1 c1Var8 = vVar.f119947c;
                        gte.a aVarB2 = c1Var8.f118423b.b();
                        vc.s.j(aVarB2);
                        hz3.c cVarB2 = c1Var8.b();
                        xq3.j jVarD2 = c1Var8.f118428c.d();
                        vc.s.j(jVarD2);
                        mri.w wVarA5 = ((ozl.a) c1Var8.u).a();
                        vc.s.j(wVarA5);
                        hy3.j jVar2 = (hy3.j) c1Var8.Q1.get();
                        vie.i iVarB2 = c1Var8.z.b();
                        vc.s.j(iVarB2);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.akahu.b(akahuFlowContract$InputData, cVar8, eVar6, e5f.b.w(pluginFlowContract$Input11, gVar4, aVar12, aVarB2, cVarB2, jVarD2, wVarA5, jVar2, iVarB2));
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                c1 c1Var9 = (c1) this.f115926c;
                dw3.w wVar = (dw3.w) this.d;
                int i22 = this.f115925b;
                switch (i22) {
                    case 0:
                        return ige.d.h(wVar.f120032a, (j60.a) wVar.f120035g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(wVar.f120032a, (com.revolut.kompot.navigable.a) wVar.e.get(), (rp0.m) wVar.f.get());
                    case 2:
                        iq3.a aVar13 = wVar.f120032a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) wVar.f120042q.get());
                    case 4:
                        zVar = new c84.z((c84.g) wVar.f120041p.get(), (rz3.c) c1Var9.f118470r1.get(), (PluginFlowContract$Input) wVar.i.get());
                        return zVar;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input12 = (PluginFlowContract$Input) wVar.i.get();
                        e4m.e eVar7 = c1Var9.f118470r1;
                        uq3.b bVar11 = c1Var9.f118428c;
                        rz3.c cVar9 = (rz3.c) eVar7.get();
                        xa4.a aVar14 = (xa4.a) wVar.k.get();
                        xq3.j jVarH13 = bVar11.h();
                        vc.s.j(jVarH13);
                        mri.w wVarA6 = ((ozl.a) c1Var9.u).a();
                        vc.s.j(wVarA6);
                        ii4.o oVar5 = (ii4.o) wVar.o.get();
                        aq3.a aVarE4 = bVar11.e();
                        vc.s.j(aVarE4);
                        return new c84.i(pluginFlowContract$Input12, cVar9, aVar14, jVarH13, wVarA6, oVar5, aVarE4);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input13 = (PluginFlowContract$Input) wVar.i.get();
                        c1 c1Var10 = wVar.f120034c;
                        bVar = new xa4.b(pluginFlowContract$Input13, ImmutableSet.of((ya4.g) new ya4.c(c1Var10.i(), (ya4.f) wVar.f120037j.get()), (ya4.g) new ya4.c(c1Var10.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) wVar.f120037j.get()), new ya4.g(new py3.f())));
                        return bVar;
                    case 7:
                        rz3.c cVar10 = (rz3.c) c1Var9.f118470r1.get();
                        xq3.j jVarH14 = c1Var9.f118428c.h();
                        vc.s.j(jVarH14);
                        return new ya4.f(cVar10, jVarH14);
                    case 8:
                        bVar = new ii4.z((li4.a) wVar.f120040n.get());
                        return bVar;
                    case 9:
                        bVar = new li4.a(ImmutableMap.of(li4.d.class, (li4.b) wVar.f120038l.get(), li4.e.class, (li4.b) wVar.f120039m.get()));
                        return bVar;
                    case 10:
                        xq3.j jVarH15 = c1Var9.f118428c.h();
                        vc.s.j(jVarH15);
                        return new li4.c(jVarH15);
                    case 11:
                        uq3.b bVar12 = c1Var9.f118428c;
                        uq3.b bVar13 = c1Var9.f118428c;
                        xq3.j jVarH16 = bVar12.h();
                        vc.s.j(jVarH16);
                        xq3.c cVarF4 = bVar13.f();
                        vc.s.j(cVarF4);
                        sp3.a aVarM5 = bVar13.m();
                        vc.s.j(aVarM5);
                        return new ji4.b(jVarH16, cVarF4, aVarM5, c1Var9.i());
                    case 12:
                        c84.z zVar6 = (c84.z) wVar.f120042q.get();
                        e5f.b.a(zVar6);
                        return zVar6;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input14 = (PluginFlowContract$Input) wVar.i.get();
                        xr3.y yVarK4 = c1Var9.f118428c.k();
                        vc.s.j(yVarK4);
                        zVar = new c84.c(pluginFlowContract$Input14, yVarK4);
                        return zVar;
                    case 14:
                        AutopayFlowContract$InputData autopayFlowContract$InputData = wVar.f120033b;
                        wj4.a aVar15 = new wj4.a();
                        hw3.c cVar11 = (hw3.c) c1Var9.f118472s0.get();
                        hw3.c0 c0Var = (hw3.c0) c1Var9.f118479v0.get();
                        py3.b bVarC = c1Var9.c();
                        uj4.a aVar16 = (uj4.a) c1Var9.U.d.get();
                        vc.s.j(aVar16);
                        PluginFlowContract$Input pluginFlowContract$Input15 = (PluginFlowContract$Input) wVar.i.get();
                        c84.g gVar5 = (c84.g) wVar.f120041p.get();
                        xa4.a aVar17 = (xa4.a) wVar.k.get();
                        c1 c1Var11 = wVar.f120034c;
                        gte.a aVarB3 = c1Var11.f118423b.b();
                        vc.s.j(aVarB3);
                        hz3.c cVarB3 = c1Var11.b();
                        xq3.j jVarD3 = c1Var11.f118428c.d();
                        vc.s.j(jVarD3);
                        mri.w wVarA7 = ((ozl.a) c1Var11.u).a();
                        vc.s.j(wVarA7);
                        hy3.j jVar3 = (hy3.j) c1Var11.Q1.get();
                        vie.i iVarB3 = c1Var11.z.b();
                        vc.s.j(iVarB3);
                        zVar = new com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a(autopayFlowContract$InputData, aVar15, cVar11, c0Var, bVarC, aVar16, e5f.b.w(pluginFlowContract$Input15, gVar5, aVar17, aVarB3, cVarB3, jVarD3, wVarA7, jVar3, iVarB3));
                        return zVar;
                    case 15:
                        return new o54.b((hw3.c0) c1Var9.f118479v0.get());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                return a();
            case 8:
                dw3.y yVar = (dw3.y) this.d;
                int i32 = this.f115925b;
                if (i32 == 0) {
                    return e5f.b.d((com.revolut.kompot.navigable.a) yVar.f120184b.get(), (c84.b) yVar.d.get(), (PluginFlowContract$Input) ((dw3.a0) this.f115926c).i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                if (i32 == 2) {
                    return new y54.l((jki.p) yVar.f120186g.get(), yVar.f120183a);
                }
                if (i32 == 3) {
                    return new y54.m();
                }
                throw new AssertionError(i32);
            case 9:
                return b();
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                return g();
            case 15:
                k0 k0Var = (k0) this.d;
                int i33 = this.f115925b;
                if (i33 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) k0Var.f119065b.get(), (c84.b) k0Var.d.get(), (PluginFlowContract$Input) ((f4) this.f115926c).i.get());
                }
                if (i33 == 1) {
                    return new c84.b();
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                ConfirmationBottomSheetContract$InputData confirmationBottomSheetContract$InputData = k0Var.f119064a;
                return new de4.g(confirmationBottomSheetContract$InputData, new de4.h(confirmationBottomSheetContract$InputData));
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                q0 q0Var = (q0) this.d;
                c1 c1Var12 = (c1) this.f115926c;
                cri.b bVar14 = c1Var12.f118485x;
                int i43 = this.f115925b;
                if (i43 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var12.f118443h, (com.revolut.kompot.navigable.a) q0Var.f119558c.get());
                }
                if (i43 == 1) {
                    lx4.a aVarE5 = c1Var12.f118489y.e();
                    return new kx4.a(aVarE5, com.revolut.data.database.models.openbanking.d.v(aVarE5), ((s41.a) bVar14).d());
                }
                if (i43 == 2) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b((cx4.a) q0Var.e.get(), ((s41.a) bVar14).d(), new qee.s(new s74.p(q0Var.f119556a, new q74.b(), q0Var.f119557b.f118489y.c())));
                }
                throw new AssertionError(i43);
            case 21:
                return l();
            case 22:
                return m();
            case 23:
                return n();
            case 24:
                return o();
            case 25:
                return p();
            case 26:
                return q();
            case 27:
                return r();
            case 28:
                return s();
            default:
                c1 c1Var13 = (c1) this.f115926c;
                e1 e1Var = (e1) this.d;
                int i59 = this.f115925b;
                switch (i59) {
                    case 0:
                        return ige.d.h(e1Var.f118607a, (j60.a) e1Var.f118610g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(e1Var.f118607a, (com.revolut.kompot.navigable.a) e1Var.e.get(), (rp0.m) e1Var.f.get());
                    case 2:
                        iq3.a aVar18 = e1Var.f118607a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) e1Var.f118617q.get());
                    case 4:
                        return new c84.z((c84.g) e1Var.f118616p.get(), (rz3.c) c1Var13.f118470r1.get(), (PluginFlowContract$Input) e1Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input16 = (PluginFlowContract$Input) e1Var.i.get();
                        e4m.e eVar8 = c1Var13.f118470r1;
                        uq3.b bVar15 = c1Var13.f118428c;
                        rz3.c cVar12 = (rz3.c) eVar8.get();
                        xa4.a aVar19 = (xa4.a) e1Var.k.get();
                        xq3.j jVarH17 = bVar15.h();
                        vc.s.j(jVarH17);
                        mri.w wVarA8 = ((ozl.a) c1Var13.u).a();
                        vc.s.j(wVarA8);
                        ii4.o oVar6 = (ii4.o) e1Var.o.get();
                        aq3.a aVarE6 = bVar15.e();
                        vc.s.j(aVarE6);
                        return new c84.i(pluginFlowContract$Input16, cVar12, aVar19, jVarH17, wVarA8, oVar6, aVarE6);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input17 = (PluginFlowContract$Input) e1Var.i.get();
                        c1 c1Var14 = e1Var.f118609c;
                        return new xa4.b(pluginFlowContract$Input17, ImmutableSet.of((ya4.g) new ya4.c(c1Var14.i(), (ya4.f) e1Var.f118612j.get()), (ya4.g) new ya4.c(c1Var14.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) e1Var.f118612j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar13 = (rz3.c) c1Var13.f118470r1.get();
                        xq3.j jVarH18 = c1Var13.f118428c.h();
                        vc.s.j(jVarH18);
                        return new ya4.f(cVar13, jVarH18);
                    case 8:
                        return new ii4.z((li4.a) e1Var.f118615n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) e1Var.f118613l.get(), li4.e.class, (li4.b) e1Var.f118614m.get()));
                    case 10:
                        xq3.j jVarH19 = c1Var13.f118428c.h();
                        vc.s.j(jVarH19);
                        return new li4.c(jVarH19);
                    case 11:
                        uq3.b bVar16 = c1Var13.f118428c;
                        uq3.b bVar17 = c1Var13.f118428c;
                        xq3.j jVarH20 = bVar16.h();
                        vc.s.j(jVarH20);
                        xq3.c cVarF5 = bVar17.f();
                        vc.s.j(cVarF5);
                        sp3.a aVarM6 = bVar17.m();
                        vc.s.j(aVarM6);
                        return new ji4.b(jVarH20, cVarF5, aVarM6, c1Var13.i());
                    case 12:
                        return kxa.j.m((j60.a) e1Var.f118620t.get());
                    case 13:
                        return wp5.y.r((com.revolut.kompot.navigable.a) e1Var.e.get(), (rp0.m) e1Var.f118619s.get());
                    case 14:
                        return new rp0.m();
                    case 15:
                        return db5.e.u((lik.a) e1Var.v.get());
                    case 16:
                        lik.b bVar18 = (lik.b) c1Var13.M.f245992y.get();
                        vc.s.j(bVar18);
                        return db5.e.t(bVar18);
                    case 17:
                        c84.z zVar7 = (c84.z) e1Var.f118617q.get();
                        e5f.b.a(zVar7);
                        return zVar7;
                    case 18:
                        ffk.t tVarF = c1Var13.G.f();
                        vc.s.j(tVarF);
                        return new cj4.d(tVarF, (vfk.c) e1Var.f118623y.get(), new sg4.a());
                    case 19:
                        lik.a binder = (lik.a) e1Var.v.get();
                        dj4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(binder, "binder");
                        return binder.f195536a;
                    case 20:
                        return new mf4.c((rx3.b) c1Var13.i2.get(), (PluginFlowContract$Input) e1Var.i.get());
                    case 21:
                        PluginFlowContract$Input pluginFlowContract$Input18 = (PluginFlowContract$Input) e1Var.i.get();
                        xr3.y yVarK5 = c1Var13.f118428c.k();
                        vc.s.j(yVarK5);
                        return new c84.c(pluginFlowContract$Input18, yVarK5);
                    case 22:
                        CreditCardOfferFlowContract$InputData creditCardOfferFlowContract$InputData = e1Var.f118608b;
                        g84.e eVar9 = (g84.e) e1Var.C.get();
                        egk.e eVarE = c1Var13.f118434e0.e();
                        vc.s.j(eVarE);
                        ffk.t tVarF2 = c1Var13.G.f();
                        vc.s.j(tVarF2);
                        yik.b bVar19 = new yik.b();
                        cj4.a aVar20 = (cj4.a) e1Var.z.get();
                        wli.x xVarD = ((s41.a) c1Var13.f118485x).d();
                        hw3.c cVar14 = (hw3.c) c1Var13.f118472s0.get();
                        rx3.a aVar21 = (rx3.a) c1Var13.f118473s1.get();
                        sg4.a aVar22 = new sg4.a();
                        PluginFlowContract$Input pluginFlowContract$Input19 = (PluginFlowContract$Input) e1Var.i.get();
                        c84.g gVar6 = (c84.g) e1Var.f118616p.get();
                        xa4.a aVar23 = (xa4.a) e1Var.k.get();
                        c1 c1Var15 = e1Var.f118609c;
                        gte.a aVarB4 = c1Var15.f118423b.b();
                        vc.s.j(aVarB4);
                        hz3.c cVarB4 = c1Var15.b();
                        xq3.j jVarD4 = c1Var15.f118428c.d();
                        vc.s.j(jVarD4);
                        mri.w wVarA9 = ((ozl.a) c1Var15.u).a();
                        vc.s.j(wVarA9);
                        hy3.j jVar4 = (hy3.j) c1Var15.Q1.get();
                        vie.i iVarB4 = c1Var15.z.b();
                        vc.s.j(iVarB4);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i(creditCardOfferFlowContract$InputData, eVar9, eVarE, tVarF2, bVar19, aVar20, xVarD, cVar14, aVar21, aVar22, e5f.b.w(pluginFlowContract$Input19, gVar6, aVar23, aVarB4, cVarB4, jVarD4, wVarA9, jVar4, iVarB4));
                    case 23:
                        return new g84.m((vw3.d) c1Var13.f118477u1.get(), e1Var.f118608b, (vw3.f) c1Var13.f118480v1.get());
                    default:
                        throw new AssertionError(i59);
                }
        }
    }
}
