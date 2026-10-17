package u45;

import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2ControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreenContract$InputData;
import dw3.m4;
import i60.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f277107c;
    public final Object d;

    public /* synthetic */ e(h hVar, Object obj2, int i, int i2) {
        this.f277105a = i2;
        this.f277106b = hVar;
        this.d = obj2;
        this.f277107c = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f277105a) {
            case 0:
                f fVar = (f) this.d;
                h hVar = this.f277106b;
                j35.a aVar = hVar.f277124a;
                int i = this.f277107c;
                if (i != 0) {
                    if (i == 1) {
                        return new u65.j();
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) fVar.f277112b.get();
                LoanDocumentsControllerContract$InputData loanDocumentsControllerContract$InputData = fVar.f277111a;
                l35.b bVar = (l35.b) hVar.L.get();
                y45.i iVarI = aVar.i();
                vc.s.j(iVarI);
                y45.k kVarA = aVar.a();
                vc.s.j(kVarA);
                return new u65.i(nVar, loanDocumentsControllerContract$InputData, bVar, iVarI, kVarA);
            case 1:
                g gVar = (g) this.d;
                h hVar2 = gVar.f277118b;
                int i2 = this.f277107c;
                if (i2 == 0) {
                    Object extension = (f15.a) gVar.f277119c.get();
                    a65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar2 = (yji.n) extension;
                    vc.s.k(nVar2);
                    return nVar2;
                }
                h hVar3 = this.f277106b;
                if (i2 == 1) {
                    j15.e provider = hVar3.v.a();
                    vc.s.j(provider);
                    a65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    return provider.a();
                }
                if (i2 == 2) {
                    cli.n nVar3 = (cli.n) gVar.e.get();
                    l35.b bVar2 = (l35.b) hVar3.L.get();
                    y45.i iVarI2 = hVar3.f277124a.i();
                    vc.s.j(iVarI2);
                    ra5.b bVar3 = (ra5.b) hVar3.f277142w.f223537p.get();
                    vc.s.j(bVar3);
                    return new com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a(nVar3, bVar2, iVarI2, bVar3, gVar.f277117a, (m35.f) hVar3.T.get(), (m35.p) hVar3.V.get(), (m35.i) hVar3.Z.get(), (b55.b) hVar3.Y.get(), (f15.a) gVar.f277119c.get(), (r35.a) hVar3.Q.get(), (m35.c) hVar3.S.get(), hVar3.f277143x.a());
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                z55.b bVar4 = new z55.b((m35.r) hVar2.M.get(), new c55.r());
                l75.a aVar2 = new l75.a();
                c55.d0 loanRepaymentMethodItemMapper = new c55.d0();
                c55.h loanBackUpCardMethodMapper = new c55.h();
                Intrinsics.checkNotNullParameter(loanRepaymentMethodItemMapper, "loanRepaymentMethodItemMapper");
                Intrinsics.checkNotNullParameter(loanBackUpCardMethodMapper, "loanBackUpCardMethodMapper");
                z55.e eVar = new z55.e();
                m35.k kVar = (m35.k) hVar3.O.get();
                l80.e eVarH = hVar2.f277138q.h();
                vc.s.j(eVarH);
                b65.b bVar5 = new b65.b(eVarH);
                b65.f fVar2 = new b65.f();
                c45.b bVar6 = new c45.b();
                a75.a aVar3 = new a75.a();
                ky4.c cVarQ = hVar2.q();
                gte.a aVarB = hVar2.f277135m.b();
                vc.s.j(aVarB);
                return new z55.d0(bVar4, aVar2, eVar, kVar, bVar5, fVar2, new b65.e(bVar6, aVar3, cVarQ, aVarB));
            case 2:
                h hVar4 = this.f277106b;
                int i3 = this.f277107c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return new u55.a((l35.b) hVar4.L.get());
                        }
                        throw new AssertionError(i3);
                    }
                    l35.b loanInteractor = (l35.b) hVar4.L.get();
                    t55.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
                    return new u55.b(loanInteractor);
                }
                i iVar = (i) this.d;
                LoanAutopayFlowContract$InputData loanAutopayFlowContract$InputData = iVar.f277147a;
                wj4.a aVar4 = new wj4.a();
                u55.b bVar7 = (u55.b) iVar.d.get();
                ang.f fVarE = hVar4.f277133j.e();
                uj4.a aVar5 = (uj4.a) hVar4.f277134l.d.get();
                vc.s.j(aVar5);
                return new com.revolut.feature.credit.loan.impl.ui.autopay.flow.a(loanAutopayFlowContract$InputData, aVar4, bVar7, fVarE, aVar5);
            case 3:
                j jVar = (j) this.d;
                int i5 = this.f277107c;
                if (i5 == 0) {
                    Object extension2 = (e65.h) jVar.e.get();
                    f65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar4 = (yji.n) extension2;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i5 == 1) {
                    e impl = jVar.d;
                    f65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl, "impl");
                    Object obj2 = impl.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    return (e65.h) obj2;
                }
                h hVar5 = this.f277106b;
                if (i5 != 2) {
                    if (i5 == 3) {
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a(jVar.f277153a, (e65.h) jVar.e.get(), (r35.a) hVar5.Q.get());
                    }
                    throw new AssertionError(i5);
                }
                y45.i iVarI3 = hVar5.f277124a.i();
                vc.s.j(iVarI3);
                return new e65.v(iVarI3);
            case 4:
                h hVar6 = this.f277106b;
                j35.a aVar6 = hVar6.f277124a;
                k kVar2 = (k) this.d;
                int i6 = this.f277107c;
                if (i6 == 0) {
                    Object extension3 = (e65.h) kVar2.e.get();
                    l65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    yji.n nVar5 = (yji.n) extension3;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i6 == 1) {
                    e impl2 = kVar2.d;
                    l65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl2, "impl");
                    Object obj3 = impl2.get();
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    return (e65.h) obj3;
                }
                if (i6 == 2) {
                    y45.i iVarI4 = aVar6.i();
                    vc.s.j(iVarI4);
                    return new e65.v(iVarI4);
                }
                if (i6 != 3) {
                    throw new AssertionError(i6);
                }
                LoanCancellationV2FlowContract$InputData loanCancellationV2FlowContract$InputData = kVar2.f277160a;
                y45.b bVar8 = (y45.b) hVar6.f277130e0.get();
                y45.i iVarI5 = aVar6.i();
                vc.s.j(iVarI5);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a(loanCancellationV2FlowContract$InputData, bVar8, iVarI5, (r35.a) hVar6.Q.get(), (e65.h) kVar2.e.get());
            case 5:
                l lVar = (l) this.d;
                int i21 = this.f277107c;
                if (i21 == 0) {
                    Object extension4 = (o65.e) lVar.f277169c.get();
                    p65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    yji.n nVar6 = (yji.n) extension4;
                    vc.s.k(nVar6);
                    return nVar6;
                }
                if (i21 == 1) {
                    e impl3 = lVar.f277168b;
                    p65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(impl3, "impl");
                    Object obj4 = impl3.get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    return (o65.e) obj4;
                }
                h hVar7 = this.f277106b;
                if (i21 == 2) {
                    l35.b bVar9 = (l35.b) hVar7.L.get();
                    y45.i iVarI6 = hVar7.f277124a.i();
                    vc.s.j(iVarI6);
                    return new o65.o(bVar9, iVarI6, new n65.a());
                }
                if (i21 != 3) {
                    throw new AssertionError(i21);
                }
                LoanChangeRepaymentDayFlowContract$InputData loanChangeRepaymentDayFlowContract$InputData = lVar.f277167a;
                o65.e eVar2 = (o65.e) lVar.f277169c.get();
                n65.a aVar7 = new n65.a();
                gte.a aVarB2 = hVar7.f277135m.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.b(loanChangeRepaymentDayFlowContract$InputData, eVar2, aVar7, aVarB2);
            case 6:
                m mVar = (m) this.d;
                int i22 = this.f277107c;
                if (i22 == 0) {
                    return kxa.j.l((j60.a) mVar.d.get());
                }
                if (i22 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) mVar.f277174b.get(), (rp0.m) mVar.f277175c.get());
                }
                if (i22 == 2) {
                    return new rp0.m();
                }
                if (i22 == 3) {
                    return new q65.m((jki.p) mVar.f.get(), mVar.f277173a, (l35.b) this.f277106b.L.get(), new n65.a(), (rp0.m) mVar.f277175c.get());
                }
                if (i22 == 4) {
                    return new q65.n();
                }
                throw new AssertionError(i22);
            case 7:
                n nVar7 = (n) this.d;
                LoanConfirmWithdrawalControllerContract$InputData loanConfirmWithdrawalControllerContract$InputData = nVar7.f277179a;
                h hVar8 = this.f277106b;
                int i32 = this.f277107c;
                if (i32 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(hVar8.f277138q, (com.revolut.kompot.navigable.a) nVar7.f277181c.get());
                }
                if (i32 == 1) {
                    lx4.a aVarE = hVar8.A.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) hVar8.f277139r).d());
                }
                if (i32 != 2) {
                    throw new AssertionError(i32);
                }
                y45.b bVar10 = (y45.b) hVar8.f277130e0.get();
                cx4.a aVar8 = (cx4.a) nVar7.e.get();
                ax4.e eVar3 = nVar7.f277180b.A;
                return new i65.s(loanConfirmWithdrawalControllerContract$InputData, bVar10, aVar8, new i65.t(loanConfirmWithdrawalControllerContract$InputData, new mx4.f0(eVar3.a()), eVar3.c(), new ix4.b()));
            case 8:
                h hVar9 = this.f277106b;
                int i33 = this.f277107c;
                if (i33 == 0) {
                    return new com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a((l35.b) hVar9.L.get(), new xy4.b(), ((p) this.d).f277191a);
                }
                if (i33 == 1) {
                    return new kr4.a((l35.b) hVar9.L.get());
                }
                throw new AssertionError(i33);
            case 9:
                s sVar = (s) this.d;
                h hVar10 = this.f277106b;
                j35.a aVar9 = hVar10.f277124a;
                int i43 = this.f277107c;
                if (i43 == 0) {
                    Object extension5 = (f15.a) sVar.f277214c.get();
                    z65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.n nVar8 = (yji.n) extension5;
                    vc.s.k(nVar8);
                    return nVar8;
                }
                if (i43 == 1) {
                    j15.e provider2 = hVar10.v.a();
                    vc.s.j(provider2);
                    z65.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider2, "provider");
                    return provider2.a();
                }
                if (i43 != 2) {
                    throw new AssertionError(i43);
                }
                b55.b bVar11 = (b55.b) hVar10.Y.get();
                f15.a aVar10 = (f15.a) sVar.f277214c.get();
                y45.i iVarI7 = aVar9.i();
                vc.s.j(iVarI7);
                y45.k kVarA2 = aVar9.a();
                vc.s.j(kVarA2);
                ang.f fVarE2 = hVar10.f277133j.e();
                r35.e eVar4 = (r35.e) hVar10.P.get();
                m35.c cVar = (m35.c) hVar10.S.get();
                LoanInstalmentDetailsScreenContract$InputData loanInstalmentDetailsScreenContract$InputData = sVar.f277212a;
                h hVar11 = sVar.f277213b;
                m35.q qVarB = hVar11.f277124a.b();
                m35.r rVar = (m35.r) hVar11.M.get();
                y65.t loanPaymentScheduleMapper = new y65.t();
                Intrinsics.checkNotNullParameter(loanPaymentScheduleMapper, "loanPaymentScheduleMapper");
                y65.r rVar2 = new y65.r();
                gte.a aVarB3 = hVar11.f277135m.b();
                vc.s.j(aVarB3);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a(bVar11, aVar10, iVarI7, kVarA2, fVarE2, eVar4, cVar, loanInstalmentDetailsScreenContract$InputData, new y65.q(qVarB, rVar, rVar2, aVarB3));
            case 10:
                t tVar = (t) this.d;
                int i59 = this.f277107c;
                if (i59 == 0) {
                    return new com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.a((m35.f) this.f277106b.T.get(), (cli.n) tVar.f277219b.get(), tVar.f277218a);
                }
                if (i59 == 1) {
                    return new b75.j();
                }
                throw new AssertionError(i59);
            case 11:
                z zVar = (z) this.d;
                int i66 = this.f277107c;
                if (i66 == 0) {
                    return kxa.j.k((j60.a) zVar.d.get());
                }
                if (i66 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) zVar.f277260b.get(), (rp0.m) zVar.f277261c.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 != 3) {
                    if (i66 == 4) {
                        return new m75.l();
                    }
                    throw new AssertionError(i66);
                }
                LoanRefinancedCreditListV2ControllerContract$InputData loanRefinancedCreditListV2ControllerContract$InputData = zVar.f277259a;
                cli.n nVar9 = (cli.n) zVar.f.get();
                y45.i iVarI8 = this.f277106b.f277124a.i();
                vc.s.j(iVarI8);
                return new m75.j(loanRefinancedCreditListV2ControllerContract$InputData, nVar9, iVarI8, new m75.a(), (j60.a) zVar.d.get());
            case 12:
                int i74 = this.f277107c;
                if (i74 == 0) {
                    a0 a0Var = (a0) this.d;
                    return new o75.i(a0Var.f277047a, (jki.p) a0Var.f277048b.get(), (o55.c) this.f277106b.f277127b0.get());
                }
                if (i74 == 1) {
                    return new o75.j();
                }
                throw new AssertionError(i74);
            case 13:
                b0 b0Var = (b0) this.d;
                h hVar12 = b0Var.f277057b;
                h hVar13 = this.f277106b;
                int i92 = this.f277107c;
                switch (i92) {
                    case 0:
                        return kxa.j.k((j60.a) b0Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) b0Var.f277058c.get(), (rp0.m) b0Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = (LoanRepaymentAccountModelExtension) b0Var.f277059g.get();
                        trl.f.n(loanRepaymentAccountModelExtension);
                        return loanRepaymentAccountModelExtension;
                    case 4:
                        l35.b bVar12 = (l35.b) hVar13.L.get();
                        y45.i iVarI9 = hVar13.f277124a.i();
                        vc.s.j(iVarI9);
                        h6i.o oVarH = hVar13.z.h();
                        l35.h hVarF = hVar12.f277124a.f();
                        vc.s.j(hVarF);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b(bVar12, iVarI9, oVarH, new c55.f0(hVarF));
                    case 5:
                        cli.n nVar10 = (cli.n) b0Var.i.get();
                        LoanRepaymentBreakdownControllerContract$InputData loanRepaymentBreakdownControllerContract$InputData = b0Var.f277056a;
                        l35.b bVar13 = (l35.b) hVar13.L.get();
                        c55.m mVar2 = new c55.m();
                        l35.h hVarF2 = hVar12.f277124a.f();
                        vc.s.j(hVarF2);
                        c55.z zVar2 = new c55.z(mVar2, new c55.t(hVarF2));
                        l35.h hVarF3 = hVar12.f277124a.f();
                        vc.s.j(hVarF3);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a(nVar10, loanRepaymentBreakdownControllerContract$InputData, bVar13, zVar2, new c55.f0(hVarF3), (j60.a) b0Var.e.get(), (LoanRepaymentAccountModelExtension) b0Var.f277059g.get());
                    case 6:
                        a85.f hintMapper = new a85.f();
                        a85.h scheduleMapper = new a85.h();
                        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
                        Intrinsics.checkNotNullParameter(scheduleMapper, "scheduleMapper");
                        a85.d dVar = new a85.d();
                        a85.b bVar14 = new a85.b();
                        gte.a aVarB4 = hVar13.f277135m.b();
                        vc.s.j(aVarB4);
                        return new z75.a0(dVar, bVar14, aVarB4);
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                d0 d0Var = (d0) this.d;
                h hVar14 = this.f277106b;
                int i96 = this.f277107c;
                switch (i96) {
                    case 0:
                        return kxa.j.k((j60.a) d0Var.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) d0Var.f277100b.get(), (rp0.m) d0Var.f277101c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension6 = (f15.a) d0Var.f.get();
                        c85.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        yji.n nVar11 = (yji.n) extension6;
                        vc.s.k(nVar11);
                        return nVar11;
                    case 4:
                        j15.e provider3 = hVar14.v.a();
                        vc.s.j(provider3);
                        c85.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        return provider3.a();
                    case 5:
                        return new b85.j(d0Var.f277099a, (cli.n) d0Var.f277103h.get(), (f15.a) d0Var.f.get(), (b55.b) hVar14.Y.get(), (m35.c) hVar14.S.get());
                    case 6:
                        return new b85.l(hVar14.f277124a.b(), (m35.r) hVar14.M.get(), new c45.b());
                    default:
                        throw new AssertionError(i96);
                }
            case 15:
                e0 e0Var = (e0) this.d;
                int i99 = this.f277107c;
                if (i99 == 0) {
                    return new o85.m((cli.n) e0Var.f277109b.get(), e0Var.f277108a, (l35.b) this.f277106b.L.get());
                }
                if (i99 == 1) {
                    return new i3g.k(new p85.f(new p85.a()), new p85.d());
                }
                throw new AssertionError(i99);
            case 16:
                f0 f0Var = (f0) this.d;
                int i100 = this.f277107c;
                if (i100 == 0) {
                    return trl.f.i((t60.b) f0Var.f277116c.get());
                }
                if (i100 == 1) {
                    return trl.f.r(f0Var.f277114a);
                }
                h hVar15 = this.f277106b;
                if (i100 != 2) {
                    if (i100 == 3) {
                        return new n85.m((m35.h) hVar15.W.get(), (m35.j) hVar15.X.get());
                    }
                    throw new AssertionError(i100);
                }
                LoanRepaymentsListScreenContract$InputData loanRepaymentsListScreenContract$InputData = f0Var.f277115b;
                l35.b bVar15 = (l35.b) hVar15.L.get();
                y45.i iVarI10 = hVar15.f277124a.i();
                vc.s.j(iVarI10);
                return new n85.k(loanRepaymentsListScreenContract$InputData, bVar15, iVarI10, hVar15.f277133j.e(), (jki.p) f0Var.e.get());
            case 17:
                g0 g0Var = (g0) this.d;
                int i101 = this.f277107c;
                if (i101 == 0) {
                    return kxa.j.l((j60.a) g0Var.d.get());
                }
                if (i101 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) g0Var.f277121b.get(), (rp0.m) g0Var.f277122c.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 == 3) {
                    return new q85.h((j60.a) g0Var.d.get(), (l35.b) this.f277106b.L.get(), g0Var.f277120a, (jki.p) g0Var.f.get());
                }
                if (i101 == 4) {
                    return new q85.i();
                }
                throw new AssertionError(i101);
            case 18:
                i0 i0Var = (i0) this.d;
                int i102 = this.f277107c;
                if (i102 == 0) {
                    return new r65.i((jki.p) i0Var.f277152c.get(), i0Var.f277150a, (o55.c) this.f277106b.f277127b0.get(), new n65.a());
                }
                if (i102 != 1) {
                    throw new AssertionError(i102);
                }
                l80.e eVarH2 = i0Var.f277151b.f277138q.h();
                vc.s.j(eVarH2);
                return new anl.j(new n65.d(eVarH2));
            case 19:
                k0 k0Var = (k0) this.d;
                int i103 = this.f277107c;
                if (i103 == 0) {
                    return new g65.i((cli.n) k0Var.f277165b.get(), k0Var.f277164a);
                }
                if (i103 == 1) {
                    return new g65.j((m35.r) this.f277106b.M.get());
                }
                throw new AssertionError(i103);
            case 20:
                h hVar16 = this.f277106b;
                int i104 = this.f277107c;
                if (i104 == 0) {
                    return new com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a(((l0) this.d).f277170a, (l35.b) hVar16.L.get());
                }
                if (i104 == 1) {
                    return new m65.a(new c45.b(), hVar16.q());
                }
                throw new AssertionError(i104);
            case 21:
                n0 n0Var = (n0) this.d;
                int i105 = this.f277107c;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return new w85.i();
                    }
                    throw new AssertionError(i105);
                }
                LoanStatementsListScreenContract$InputData loanStatementsListScreenContract$InputData = n0Var.f277182a;
                y45.k kVarA3 = this.f277106b.f277124a.a();
                vc.s.j(kVarA3);
                return new w85.h(loanStatementsListScreenContract$InputData, kVarA3, (jki.p) n0Var.f277183b.get());
            case 22:
                o0 o0Var = (o0) this.d;
                int i106 = this.f277107c;
                if (i106 != 0) {
                    if (i106 == 1) {
                        return new anl.j(new c55.k(new c55.h()));
                    }
                    throw new AssertionError(i106);
                }
                h hVar17 = this.f277106b;
                l35.b bVar16 = (l35.b) hVar17.L.get();
                y45.i iVarI11 = hVar17.f277124a.i();
                vc.s.j(iVarI11);
                return new s85.k(bVar16, iVarI11, new s85.c((l35.b) o0Var.f277189b.L.get()), o0Var.f277188a, (jki.p) o0Var.f277190c.get());
            case 23:
                p0 p0Var = (p0) this.d;
                int i107 = this.f277107c;
                if (i107 == 0) {
                    return kxa.j.k((j60.a) p0Var.d.get());
                }
                if (i107 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) p0Var.f277195b.get(), (rp0.m) p0Var.f277196c.get());
                }
                if (i107 == 2) {
                    return new rp0.m();
                }
                if (i107 == 3) {
                    com.revolut.kompot.navigable.a aVar11 = (com.revolut.kompot.navigable.a) p0Var.f277195b.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar11);
                }
                if (i107 != 4) {
                    if (i107 != 5) {
                        throw new AssertionError(i107);
                    }
                    c55.d0 loanRepaymentMethodItemMapper2 = new c55.d0();
                    Intrinsics.checkNotNullParameter(loanRepaymentMethodItemMapper2, "loanRepaymentMethodItemMapper");
                    return new u85.l();
                }
                LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData = p0Var.f277194a;
                cli.n nVar12 = (cli.n) p0Var.f277197g.get();
                h hVar18 = this.f277106b;
                y45.i iVarI12 = hVar18.f277124a.i();
                vc.s.j(iVarI12);
                return new u85.j(loanWelcomeControllerContract$InputData, nVar12, iVarI12, (j60.a) p0Var.d.get(), (m35.f) hVar18.T.get(), (h60.d) p0Var.f.get());
            case 24:
                h hVar19 = this.f277106b;
                int i108 = this.f277107c;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new c75.h((m35.r) hVar19.M.get());
                    }
                    throw new AssertionError(i108);
                }
                y45.i iVarI13 = hVar19.f277124a.i();
                vc.s.j(iVarI13);
                return new c75.g(iVarI13, (jki.p) ((q0) this.d).f277202a.get());
            case 25:
                int i109 = this.f277107c;
                if (i109 == 0) {
                    return new fz4.l(((s41.a) this.f277106b.f277139r).d(), new xy4.b(), (jki.p) ((m4) this.d).f119276b.get());
                }
                if (i109 == 1) {
                    return new fz4.m();
                }
                throw new AssertionError(i109);
            case 26:
                r0 r0Var = (r0) this.d;
                h hVar20 = this.f277106b;
                j35.a aVar12 = hVar20.f277124a;
                l70.e eVar5 = hVar20.f277138q;
                int i110 = this.f277107c;
                switch (i110) {
                    case 0:
                        Object extension7 = (f15.a) r0Var.f277209c.get();
                        r75.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar13 = (yji.n) extension7;
                        vc.s.k(nVar13);
                        return nVar13;
                    case 1:
                        j15.e provider4 = hVar20.v.a();
                        vc.s.j(provider4);
                        r75.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        return provider4.a();
                    case 2:
                        LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension2 = (LoanRepaymentAccountModelExtension) r0Var.e.get();
                        trl.f.n(loanRepaymentAccountModelExtension2);
                        return loanRepaymentAccountModelExtension2;
                    case 3:
                        l35.b bVar17 = (l35.b) hVar20.L.get();
                        y45.i iVarI14 = aVar12.i();
                        vc.s.j(iVarI14);
                        h6i.o oVarH2 = hVar20.z.h();
                        l35.h hVarF4 = r0Var.f277208b.f277124a.f();
                        vc.s.j(hVarF4);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b(bVar17, iVarI14, oVarH2, new c55.f0(hVarF4));
                    case 4:
                        cli.n nVar14 = (cli.n) r0Var.f277210g.get();
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = r0Var.f277207a;
                        l35.b bVar18 = (l35.b) hVar20.L.get();
                        y45.i iVarI15 = aVar12.i();
                        vc.s.j(iVarI15);
                        i1j.a aVar13 = (i1j.a) r0Var.f277211h.get();
                        m35.p pVar = (m35.p) hVar20.V.get();
                        m35.f fVar3 = (m35.f) hVar20.T.get();
                        w80.b bVarJ = eVar5.j();
                        vc.s.j(bVarJ);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a(nVar14, loanPartialRepaymentControllerContract$InputData, bVar18, iVarI15, aVar13, pVar, fVar3, bVarJ, (b55.b) hVar20.Y.get(), (f15.a) r0Var.f277209c.get(), (LoanRepaymentAccountModelExtension) r0Var.e.get());
                    case 5:
                        w80.b bVarJ2 = eVar5.j();
                        vc.s.j(bVarJ2);
                        s75.a aVar14 = new s75.a();
                        gte.a aVarB5 = hVar20.f277135m.b();
                        vc.s.j(aVarB5);
                        return new q75.v(bVarJ2, aVar14, aVarB5);
                    case 6:
                        return new y45.m();
                    default:
                        throw new AssertionError(i110);
                }
            case 27:
                s0 s0Var = (s0) this.d;
                h hVar21 = this.f277106b;
                int i111 = this.f277107c;
                if (i111 == 0) {
                    return new p75.h((jki.p) s0Var.f277216b.get(), s0Var.f277215a, (l35.b) hVar21.L.get());
                }
                if (i111 == 1) {
                    return new p75.j((m35.r) hVar21.M.get());
                }
                throw new AssertionError(i111);
            case 28:
                u0 u0Var = (u0) this.d;
                int i112 = this.f277107c;
                if (i112 == 0) {
                    return kxa.j.k((j60.a) u0Var.e.get());
                }
                if (i112 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) u0Var.f277229c.get(), (rp0.m) u0Var.d.get());
                }
                if (i112 == 2) {
                    return new rp0.m();
                }
                if (i112 != 3) {
                    if (i112 == 4) {
                        return new w75.n(new c55.k(new c55.h()), new c55.d0());
                    }
                    throw new AssertionError(i112);
                }
                s85.c cVar2 = new s85.c((l35.b) u0Var.f277228b.L.get());
                j60.a aVar15 = (j60.a) u0Var.e.get();
                c55.d0 loanRepaymentMethodsItemMapper = new c55.d0();
                Intrinsics.checkNotNullParameter(loanRepaymentMethodsItemMapper, "loanRepaymentMethodsItemMapper");
                return new w75.l(cVar2, aVar15, new x75.b(), (l35.b) this.f277106b.L.get(), u0Var.f277227a, (cli.n) u0Var.f277230g.get());
            default:
                h hVar22 = this.f277106b;
                j35.a aVar16 = hVar22.f277124a;
                v0 v0Var = (v0) this.d;
                h hVar23 = v0Var.f277235b;
                int i113 = this.f277107c;
                switch (i113) {
                    case 0:
                        return kxa.j.k((j60.a) v0Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) v0Var.f277236c.get(), (rp0.m) v0Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension3 = (LoanRepaymentAccountModelExtension) v0Var.f277237g.get();
                        trl.f.n(loanRepaymentAccountModelExtension3);
                        return loanRepaymentAccountModelExtension3;
                    case 4:
                        l35.b bVar19 = (l35.b) hVar22.L.get();
                        y45.i iVarI16 = aVar16.i();
                        vc.s.j(iVarI16);
                        h6i.o oVarH3 = hVar22.z.h();
                        l35.h hVarF5 = hVar23.f277124a.f();
                        vc.s.j(hVarF5);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b(bVar19, iVarI16, oVarH3, new c55.f0(hVarF5));
                    case 5:
                        cli.n nVar15 = (cli.n) v0Var.i.get();
                        ReviewPaymentControllerContract$InputData reviewPaymentControllerContract$InputData = v0Var.f277234a;
                        l35.b bVar20 = (l35.b) hVar22.L.get();
                        c55.m mVar3 = new c55.m();
                        l35.h hVarF6 = hVar23.f277124a.f();
                        vc.s.j(hVarF6);
                        c55.z zVar3 = new c55.z(mVar3, new c55.t(hVarF6));
                        j60.a aVar17 = (j60.a) v0Var.e.get();
                        LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension4 = (LoanRepaymentAccountModelExtension) v0Var.f277237g.get();
                        y45.i iVarI17 = aVar16.i();
                        vc.s.j(iVarI17);
                        return new com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a(nVar15, reviewPaymentControllerContract$InputData, bVar20, zVar3, aVar17, loanRepaymentAccountModelExtension4, iVarI17);
                    case 6:
                        k85.h scheduleMapper2 = new k85.h();
                        Intrinsics.checkNotNullParameter(scheduleMapper2, "scheduleMapper");
                        return new i85.y(new k85.c(), new k85.a(), new k85.f(), new k85.d((m35.r) hVar23.M.get()));
                    default:
                        throw new AssertionError(i113);
                }
        }
    }
}
