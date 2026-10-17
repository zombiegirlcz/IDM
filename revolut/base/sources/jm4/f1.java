package jm4;

import android.text.InputFilter;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$InputData;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementFinancingRedesign;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import dw3.l6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f176071c;
    public final Object d;

    public /* synthetic */ f1(a3 a3Var, Object obj2, int i, int i2) {
        this.f176069a = i2;
        this.f176070b = a3Var;
        this.d = obj2;
        this.f176071c = i;
    }

    private final Object a() {
        a3 a3Var = this.f176070b;
        r rVar = a3Var.f175965b;
        djf.c cVar = a3Var.f175971h;
        m3 m3Var = (m3) this.d;
        int i = this.f176071c;
        if (i == 0) {
            return kxa.j.k((j60.a) m3Var.d.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) m3Var.f176202b.get(), (rp0.m) m3Var.f176203c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            whf.n nVarB = cVar.b();
            vc.s.j(nVarB);
            return new ft4.l0(nVarB);
        }
        InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData = m3Var.f176201a;
        whf.b bVarA = cVar.a();
        vc.s.j(bVarA);
        al4.m mVarR = rVar.r();
        vc.s.j(mVarR);
        al4.e eVarP = rVar.p();
        vc.s.j(eVarP);
        return new ft4.i0(instalmentTransactionsScreenContract$InputData, bVarA, mVarR, eVarP, a3Var.f.e(), new ft4.b(), (cli.n) m3Var.f.get());
    }

    private final Object b() {
        int i = this.f176071c;
        if (i == 0) {
            return new fz4.l(((s41.a) this.f176070b.f175975l).d(), new xy4.b(), (jki.p) ((dw3.m4) this.d).f119276b.get());
        }
        if (i == 1) {
            return new fz4.m();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        l6 l6Var = (l6) this.d;
        int i = this.f176071c;
        if (i == 0) {
            return kxa.j.l((j60.a) l6Var.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) l6Var.f119211c.get(), (rp0.m) l6Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new wk4.m(new yk4.a(), (j60.a) l6Var.e.get(), l6Var.f119210b, (jki.p) l6Var.f119212g.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        om4.j4 j4Var = (om4.j4) this.f176070b.f175965b.H.get();
        vc.s.j(j4Var);
        return new wk4.o(j4Var);
    }

    private final Object d() {
        l6 l6Var = (l6) this.d;
        int i = this.f176071c;
        if (i == 0) {
            return kxa.j.l((j60.a) l6Var.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) l6Var.f119211c.get(), (rp0.m) l6Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new wk4.m(new yk4.a(), (j60.a) l6Var.e.get(), l6Var.f119210b, (jki.p) l6Var.f119212g.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        om4.j4 j4Var = (om4.j4) this.f176070b.f175965b.H.get();
        vc.s.j(j4Var);
        return new wk4.o(j4Var);
    }

    private final Object e() {
        t3 t3Var = (t3) this.d;
        l70.e eVar = this.f176070b.k;
        int i = this.f176071c;
        if (i == 0) {
            CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData = t3Var.f176369b;
            w80.b bVarJ = eVar.j();
            vc.s.j(bVarJ);
            return new tq4.g(creditCardLimitDecreaseAmountScreenContract$InputData, bVarJ, (cli.n) t3Var.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        w80.b bVarJ2 = eVar.j();
        vc.s.j(bVarJ2);
        return new tq4.m(bVarJ2);
    }

    private final Object f() {
        t3 t3Var = (t3) this.d;
        a3 a3Var = this.f176070b;
        int i = this.f176071c;
        if (i == 0) {
            CreditCardLimitDecreaseAmountScreenContract$InputData creditCardLimitDecreaseAmountScreenContract$InputData = t3Var.f176369b;
            w80.b bVarJ = a3Var.k.j();
            vc.s.j(bVarJ);
            return new tq4.g(creditCardLimitDecreaseAmountScreenContract$InputData, bVarJ, (cli.n) t3Var.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        w80.b bVarJ2 = a3Var.k.j();
        vc.s.j(bVarJ2);
        return new tq4.m(bVarJ2);
    }

    @Override // phm.a
    public final Object get() {
        Object uVar;
        Object zVar;
        switch (this.f176069a) {
            case 0:
                a3 a3Var = this.f176070b;
                l70.e eVar = a3Var.k;
                g1 g1Var = (g1) this.d;
                int i = this.f176071c;
                if (i == 0) {
                    return kxa.j.k((j60.a) g1Var.e.get());
                }
                if (i == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) g1Var.f176085c.get(), (rp0.m) g1Var.d.get());
                }
                if (i == 2) {
                    return new rp0.m();
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new AssertionError(i);
                    }
                    w80.b bVarJ = eVar.j();
                    vc.s.j(bVarJ);
                    return new ss4.d0(new u80.o(), bVarJ);
                }
                CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = g1Var.f176083a;
                wsg.n nVarB = a3Var.o.b();
                al4.m mVarR = a3Var.f175965b.r();
                vc.s.j(mVarR);
                j60.a aVar = (j60.a) g1Var.e.get();
                w80.b bVarJ2 = eVar.j();
                vc.s.j(bVarJ2);
                return new ss4.y(creditCardInstalmentRepayChooseAmountScreenContract$InputData, nVarB, mVarR, aVar, bVarJ2, (cli.n) g1Var.f176086g.get());
            case 1:
                a3 a3Var2 = this.f176070b;
                djf.c cVar = a3Var2.f175971h;
                u1 u1Var = (u1) this.d;
                a3 a3Var3 = u1Var.f176381b;
                int i2 = this.f176071c;
                if (i2 == 0) {
                    CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = u1Var.f176380a;
                    al4.m mVarR2 = a3Var2.f175965b.r();
                    vc.s.j(mVarR2);
                    whf.b bVarA = cVar.a();
                    vc.s.j(bVarA);
                    return new bs4.t(creditCardPrePurchaseDetailsScreenContract$InputData, mVarR2, bVarA, (cli.n) u1Var.f176382c.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData2 = u1Var.f176380a;
                yr4.a aVar2 = new yr4.a();
                thf.m mVarG = a3Var3.f175971h.g();
                vc.s.j(mVarG);
                thf.d dVarD = a3Var3.f175971h.d();
                vc.s.j(dVarD);
                yr4.e eVar2 = new yr4.e(mVarG, new gs4.f(dVarD));
                thf.m mVarG2 = cVar.g();
                vc.s.j(mVarG2);
                thf.d dVarD2 = a3Var3.f175971h.d();
                vc.s.j(dVarD2);
                gs4.f fVar = new gs4.f(dVarD2);
                whf.n nVarB2 = cVar.b();
                vc.s.j(nVarB2);
                return new bs4.w(creditCardPrePurchaseDetailsScreenContract$InputData2, aVar2, eVar2, mVarG2, fVar, nVarB2);
            case 2:
                w1 w1Var = (w1) this.d;
                int i3 = this.f176071c;
                if (i3 == 0) {
                    n60.b bVar = (n60.b) w1Var.d.get();
                    o5k.i.m(bVar);
                    return bVar;
                }
                if (i3 == 1) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) w1Var.f176417c.get());
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = w1Var.f176415a;
                a3 a3Var4 = this.f176070b;
                al4.n nVarS = a3Var4.f175965b.s();
                vc.s.j(nVarS);
                ang.f fVarE = a3Var4.f.e();
                w80.b bVarJ3 = a3Var4.k.j();
                vc.s.j(bVarJ3);
                n60.b bVar2 = (n60.b) w1Var.d.get();
                ou4.a aVarE = a3Var4.f175963a.e();
                a3 a3Var5 = w1Var.f176416b;
                l70.e eVar3 = a3Var5.k;
                zk4.a aVar3 = a3Var5.f175963a;
                w80.b bVarJ4 = eVar3.j();
                vc.s.j(bVarJ4);
                return new ju4.q(creditCardPseRepayContract$InputData, nVarS, fVarE, bVarJ3, bVar2, aVarE, new ju4.s(bVarJ4, aVar3.l(), aVar3.h()));
            case 3:
                b2 b2Var = (b2) this.d;
                a3 a3Var6 = b2Var.f176001b;
                a3 a3Var7 = this.f176070b;
                ax4.e eVar4 = a3Var7.L;
                l70.e eVar5 = a3Var7.k;
                int i5 = this.f176071c;
                if (i5 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(eVar5, (com.revolut.kompot.navigable.a) b2Var.f176002c.get());
                }
                if (i5 == 1) {
                    lx4.a aVarE2 = eVar4.e();
                    return new kx4.a(aVarE2, com.revolut.data.database.models.openbanking.d.v(aVarE2), ((s41.a) a3Var7.f175975l).d());
                }
                if (i5 == 2) {
                    qd0.b bVarN = a3Var6.k.n();
                    vc.s.j(bVarN);
                    ow4.a aVar4 = new ow4.a(bVarN, 0);
                    CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = b2Var.f176000a;
                    om4.z3 z3Var = (om4.z3) a3Var7.f175983r0.get();
                    cli.n nVar = (cli.n) b2Var.f176004h.get();
                    cx4.a aVar5 = (cx4.a) b2Var.e.get();
                    lb5.b bVarA2 = a3Var7.d.a();
                    vc.s.j(bVarA2);
                    uVar = new qu4.u(aVar4, creditCardRepayPaymentAmountScreenContract$InputData, z3Var, nVar, aVar5, bVarA2);
                } else {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                throw new AssertionError(i5);
                            }
                            ru4.b.Companion.getClass();
                            return new mp0.d(11);
                        }
                        qd0.b languageProvider = eVar5.n();
                        vc.s.j(languageProvider);
                        ru4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    }
                    CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData2 = b2Var.f176000a;
                    u80.o oVar = new u80.o();
                    w80.b bVar3 = (w80.b) b2Var.f.get();
                    InputFilter inputFilter = (InputFilter) b2Var.f176003g.get();
                    mx4.x xVarB = eVar4.b();
                    f90.b bVarT = a3Var6.k.t();
                    vc.s.j(bVarT);
                    uVar = new qu4.x(creditCardRepayPaymentAmountScreenContract$InputData2, oVar, bVar3, inputFilter, xVarB, new qu4.c(bVarT));
                }
                return uVar;
            case 4:
                c2 c2Var = (c2) this.d;
                a3 a3Var8 = c2Var.f176020b;
                a3 a3Var9 = this.f176070b;
                ax4.e eVar6 = a3Var9.L;
                l70.e eVar7 = a3Var9.k;
                int i6 = this.f176071c;
                if (i6 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(eVar7, (com.revolut.kompot.navigable.a) c2Var.f176021c.get());
                }
                if (i6 == 1) {
                    lx4.a aVarE3 = eVar6.e();
                    return new kx4.a(aVarE3, com.revolut.data.database.models.openbanking.d.v(aVarE3), ((s41.a) a3Var9.f175975l).d());
                }
                if (i6 != 2) {
                    if (i6 == 3) {
                        return new su4.w(eVar6.b(), new u80.o(), (w80.b) c2Var.f.get());
                    }
                    if (i6 != 4) {
                        throw new AssertionError(i6);
                    }
                    qd0.b languageProvider2 = eVar7.n();
                    vc.s.j(languageProvider2);
                    tu4.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                    return v80.b.b(languageProvider2, false, false, 58);
                }
                CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData = c2Var.f176019a;
                om4.z3 z3Var2 = (om4.z3) a3Var9.f175983r0.get();
                i1j.a aVar6 = (i1j.a) a3Var9.f175968d0.get();
                cx4.a aVar7 = (cx4.a) c2Var.e.get();
                o7.b bVarA3 = a3Var9.W.a();
                su4.b bVar4 = new su4.b(a3Var8.X.a());
                kl.t1 t1VarC = a3Var9.X.c();
                wj0.a aVarI = ((nj0.d) a3Var9.M).i();
                vc.s.j(aVarI);
                vt4.b bVar5 = new vt4.b();
                sf0.h hVarB = a3Var8.f175984s.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a(creditCardRepayPaymentReviewScreenContract$InputData, z3Var2, aVar6, aVar7, bVarA3, bVar4, t1VarC, aVarI, bVar5, new uu4.b(hVarB), (cli.n) c2Var.f176022g.get());
            case 5:
                int i21 = this.f176071c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new mu4.i();
                    }
                    throw new AssertionError(i21);
                }
                d2 d2Var = (d2) this.d;
                CreditCardRepaySpeiDetailsScreenContract$InputData creditCardRepaySpeiDetailsScreenContract$InputData = d2Var.f176035a;
                cli.n nVar2 = (cli.n) d2Var.f176036b.get();
                a3 a3Var10 = this.f176070b;
                al4.n nVarS2 = a3Var10.f175965b.s();
                vc.s.j(nVarS2);
                c70.a aVarZ = a3Var10.k.z();
                vc.s.j(aVarZ);
                return new mu4.g(creditCardRepaySpeiDetailsScreenContract$InputData, nVar2, nVarS2, aVarZ);
            case 6:
                i2 i2Var = (i2) this.d;
                int i22 = this.f176071c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new yu4.h();
                    }
                    throw new AssertionError(i22);
                }
                CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData = i2Var.f176118a;
                al4.n nVarS3 = this.f176070b.f175965b.s();
                vc.s.j(nVarS3);
                return new yu4.g(creditCardSelectDueDateScreenContract$InputData, nVarS3, (cli.n) i2Var.f176119b.get());
            case 7:
                k2 k2Var = (k2) this.d;
                a3 a3Var11 = this.f176070b;
                int i32 = this.f176071c;
                if (i32 == 0) {
                    CreditCardSettingsScreenContract$InputData creditCardSettingsScreenContract$InputData = k2Var.f176168a;
                    al4.n nVarS4 = a3Var11.f175965b.s();
                    vc.s.j(nVarS4);
                    return new bv4.i(creditCardSettingsScreenContract$InputData, nVarS4, (cli.n) k2Var.f176169b.get());
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                f90.b bVarT2 = a3Var11.k.t();
                vc.s.j(bVarT2);
                return new bv4.j(bVarT2);
            case 8:
                l2 l2Var = (l2) this.d;
                a3 a3Var12 = this.f176070b;
                xmg.a aVar8 = a3Var12.f;
                pb5.a aVar9 = a3Var12.d;
                int i33 = this.f176071c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new om4.q();
                    }
                    if (i33 != 2) {
                        throw new AssertionError(i33);
                    }
                    n3i.b bVarA4 = a3Var12.v.a();
                    lb5.b bVarA5 = aVar9.a();
                    vc.s.j(bVarA5);
                    return new om4.p(bVarA4, bVarA5, (ck4.b) l2Var.d.get(), aVar8.e());
                }
                CreditCardSetupAutopayFlowContract$InputData creditCardSetupAutopayFlowContract$InputData = l2Var.f176184a;
                lb5.b bVarA6 = aVar9.a();
                vc.s.j(bVarA6);
                vt4.b bVar6 = new vt4.b();
                sf0.h hVarB2 = a3Var12.f175984s.b();
                vc.s.j(hVarB2);
                i1j.a aVar10 = (i1j.a) a3Var12.f175968d0.get();
                ck4.b bVar7 = (ck4.b) l2Var.d.get();
                ang.f fVarE2 = aVar8.e();
                bp4.a aVar11 = new bp4.a();
                zwc.a aVar12 = (zwc.a) a3Var12.f175986t.f.get();
                vc.s.j(aVar12);
                al4.n nVarS5 = a3Var12.f175965b.s();
                vc.s.j(nVarS5);
                vj4.a aVar13 = (vj4.a) a3Var12.u.f314413g.get();
                vc.s.j(aVar13);
                return new com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c(creditCardSetupAutopayFlowContract$InputData, bVarA6, bVar6, hVarB2, aVar10, bVar7, fVarE2, aVar11, aVar12, nVarS5, aVar13);
            case 9:
                m2 m2Var = (m2) this.d;
                a3 a3Var13 = this.f176070b;
                int i43 = this.f176071c;
                if (i43 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(a3Var13.k, (com.revolut.kompot.navigable.a) m2Var.f176200c.get());
                }
                if (i43 == 1) {
                    lx4.a aVarE4 = a3Var13.L.e();
                    return new kx4.a(aVarE4, com.revolut.data.database.models.openbanking.d.v(aVarE4), ((s41.a) a3Var13.f175975l).d());
                }
                if (i43 == 2) {
                    return new wv4.i(m2Var.f176198a, (om4.c4) a3Var13.f175987t0.get(), (om4.e3) a3Var13.l0.get(), (cx4.a) m2Var.e.get(), new wv4.l(m2Var.f176199b.L.b(), new mx4.h()));
                }
                throw new AssertionError(i43);
            case 10:
                o2 o2Var = (o2) this.d;
                int i59 = this.f176071c;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    bp4.j statementLocalizationProvider = new bp4.j();
                    Intrinsics.checkNotNullParameter(statementLocalizationProvider, "statementLocalizationProvider");
                    return new nv4.z();
                }
                CreditCardStatementExportScreenContract$InputData creditCardStatementExportScreenContract$InputData = o2Var.f176229a;
                an4.e eVar8 = new an4.e(((eyd.b) o2Var.f176230b.F).c());
                a3 a3Var14 = this.f176070b;
                al4.n nVarS6 = a3Var14.f175965b.s();
                vc.s.j(nVarS6);
                return new com.revolut.feature.credit.card.impl.ui.statement.export.b(creditCardStatementExportScreenContract$InputData, eVar8, nVarS6, ((nj0.d) a3Var14.M).j(), a3Var14.f.e(), (cli.n) o2Var.f176231c.get());
            case 11:
                a3 a3Var15 = this.f176070b;
                r rVar = a3Var15.f175965b;
                ite.a aVar14 = a3Var15.f175982r;
                p2 p2Var = (p2) this.d;
                a3 a3Var16 = p2Var.f176248b;
                int i66 = this.f176071c;
                if (i66 == 0) {
                    return kxa.j.k((j60.a) p2Var.e.get());
                }
                if (i66 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) p2Var.f176249c.get(), (rp0.m) p2Var.d.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 != 3) {
                    if (i66 != 4) {
                        throw new AssertionError(i66);
                    }
                    vt4.e eVar9 = new vt4.e();
                    gte.a aVarB = aVar14.b();
                    vc.s.j(aVarB);
                    return new bw4.v(eVar9, aVarB, new he2.b(new lt4.b(), new lt4.e()), new gs4.l());
                }
                CreditCardStatementFinancingConfirmationScreenContract$InputData creditCardStatementFinancingConfirmationScreenContract$InputData = p2Var.f176247a;
                al4.m mVarR3 = rVar.r();
                vc.s.j(mVarR3);
                al4.n nVarS7 = rVar.s();
                vc.s.j(nVarS7);
                vt4.b bVar8 = new vt4.b();
                dw4.a aVar15 = new dw4.a();
                j60.a aVar16 = (j60.a) p2Var.e.get();
                lt4.d dVar = new lt4.d();
                r rVar2 = a3Var16.f175965b;
                al4.m mVarR4 = rVar2.r();
                vc.s.j(mVarR4);
                al4.e eVarP = rVar2.p();
                vc.s.j(eVarP);
                smd.s sVar = new smd.s(mVarR4, eVarP);
                al4.m mVarR5 = a3Var16.f175965b.r();
                vc.s.j(mVarR5);
                pak.h hVar = new pak.h(mVarR5);
                gte.a aVarB2 = aVar14.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a(creditCardStatementFinancingConfirmationScreenContract$InputData, mVarR3, nVarS7, bVar8, aVar15, aVar16, dVar, sVar, hVar, aVarB2, (cli.n) p2Var.f176250g.get());
            case 12:
                a3 a3Var17 = this.f176070b;
                r rVar3 = a3Var17.f175965b;
                q2 q2Var = (q2) this.d;
                a3 a3Var18 = q2Var.f176269b;
                int i74 = this.f176071c;
                if (i74 == 0) {
                    CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = q2Var.f176268a;
                    al4.m mVarR6 = rVar3.r();
                    vc.s.j(mVarR6);
                    al4.m mVarR7 = a3Var18.f175965b.r();
                    vc.s.j(mVarR7);
                    pak.h hVar2 = new pak.h(mVarR7);
                    lt4.d dVar2 = new lt4.d();
                    al4.n nVarS8 = rVar3.s();
                    vc.s.j(nVarS8);
                    return new com.revolut.feature.credit.card.impl.ui.statement_financing.details.a(creditCardStatementFinancingDetailsScreenContract$InputData, mVarR6, hVar2, dVar2, nVarS8, new yr4.g(new bp4.e()), a3Var17.f.e(), new vt4.b(), (cli.n) q2Var.f176270c.get());
                }
                if (i74 != 1) {
                    throw new AssertionError(i74);
                }
                CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData2 = q2Var.f176268a;
                yr4.a aVar17 = new yr4.a();
                thf.d dVarD3 = a3Var18.f175971h.d();
                vc.s.j(dVarD3);
                gs4.f fVar2 = new gs4.f(dVarD3);
                he2.b bVar9 = new he2.b(new lt4.b(), new lt4.e());
                gs4.l lVar = new gs4.l();
                thf.m mVarG3 = a3Var18.f175971h.g();
                vc.s.j(mVarG3);
                thf.d dVarD4 = a3Var18.f175971h.d();
                vc.s.j(dVarD4);
                return new ew4.z(creditCardStatementFinancingDetailsScreenContract$InputData2, aVar17, fVar2, bVar9, lVar, new yr4.e(mVarG3, new gs4.f(dVarD4)));
            case 13:
                a3 a3Var19 = this.f176070b;
                r rVar4 = a3Var19.f175965b;
                s2 s2Var = (s2) this.d;
                int i92 = this.f176071c;
                switch (i92) {
                    case 0:
                        return kxa.j.k((j60.a) s2Var.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) s2Var.f176351b.get(), (rp0.m) s2Var.f176352c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        CreditCardStatementFinancingSetupScreenContract$InputData creditCardStatementFinancingSetupScreenContract$InputData = s2Var.f176350a;
                        al4.m mVarR8 = rVar4.r();
                        vc.s.j(mVarR8);
                        al4.n nVarS9 = rVar4.s();
                        vc.s.j(nVarS9);
                        return new com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b(creditCardStatementFinancingSetupScreenContract$InputData, mVarR8, nVarS9, (j60.a) s2Var.d.get(), new com.revolut.feature.credit.card.impl.ui.statement_financing.setup.a(), (cli.n) s2Var.f176354h.get());
                    case 4:
                        gte.a featureToggleInteractor = a3Var19.f175982r.b();
                        vc.s.j(featureToggleInteractor);
                        f1 mapperOld = s2Var.f;
                        f1 mapperNew = s2Var.f176353g;
                        jw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(mapperOld, "mapperOld");
                        Intrinsics.checkNotNullParameter(mapperNew, "mapperNew");
                        return ((jte.d) featureToggleInteractor).c(CreditCardApi$Toggles$CreditCardStatementFinancingRedesign.f68687c) ? (cli.n) mapperNew.get() : (cli.n) mapperOld.get();
                    case 5:
                        return new iw4.t(new vt4.h());
                    case 6:
                        return new com.revolut.feature.credit.card.impl.ui.statement_financing.setup.c(new vt4.h());
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                u2 u2Var = (u2) this.d;
                int i96 = this.f176071c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new qv4.o();
                    }
                    throw new AssertionError(i96);
                }
                CreditCardStatementHubScreenContract$InputData creditCardStatementHubScreenContract$InputData = u2Var.f176383a;
                al4.n nVarS10 = this.f176070b.f175965b.s();
                vc.s.j(nVarS10);
                return new qv4.n(creditCardStatementHubScreenContract$InputData, nVarS10, (cli.n) u2Var.f176384b.get());
            case 15:
                v2 v2Var = (v2) this.d;
                a3 a3Var20 = this.f176070b;
                int i99 = this.f176071c;
                switch (i99) {
                    case 0:
                        return kxa.j.k((j60.a) v2Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) v2Var.f176400c.get(), (rp0.m) v2Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (f15.a) v2Var.f176401g.get();
                        mv4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar3 = (yji.n) extension;
                        vc.s.k(nVar3);
                        return nVar3;
                    case 4:
                        j15.e provider = a3Var20.C.a();
                        vc.s.j(provider);
                        mv4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider.a();
                    case 5:
                        ssi.m extension2 = (ssi.m) v2Var.f176403j.get();
                        mv4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 6:
                        oqk.l transactionsWidgetActionExtensionProvider = a3Var20.N.b();
                        vc.s.j(transactionsWidgetActionExtensionProvider);
                        j60.a bottomDialogExtension = (j60.a) v2Var.e.get();
                        rp0.l0 popupMenuDialogDisplayer = (rp0.l0) v2Var.i.get();
                        mv4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtensionProvider, "transactionsWidgetActionExtensionProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                        return transactionsWidgetActionExtensionProvider.a(bottomDialogExtension, popupMenuDialogDisplayer);
                    case 7:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) v2Var.f176400c.get();
                        mv4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new rp0.l0(controller.m2());
                    case 8:
                        CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData = v2Var.f176398a;
                        a3 a3Var21 = v2Var.f176399b;
                        al4.n nVarS11 = a3Var20.f175965b.s();
                        vc.s.j(nVarS11);
                        ang.f fVarE3 = a3Var20.f.e();
                        f15.a aVar18 = (f15.a) v2Var.f176401g.get();
                        r rVar5 = a3Var21.f175965b;
                        al4.q qVarA = rVar5.a();
                        al4.m mVarR9 = rVar5.r();
                        vc.s.j(mVarR9);
                        fm4.a aVarA = a3Var21.f175963a.a();
                        whf.b bVarA7 = a3Var21.f175971h.a();
                        vc.s.j(bVarA7);
                        lal.a aVar19 = new lal.a(qVarA, mVarR9, aVarA, bVarA7);
                        ssi.m mVar = (ssi.m) v2Var.f176403j.get();
                        al4.q qVarA2 = a3Var20.f175965b.a();
                        r rVar6 = a3Var21.f175965b;
                        x9e.a aVar20 = a3Var21.Q;
                        al4.q qVarA3 = rVar6.a();
                        g9e.a aVarC = aVar20.c();
                        vc.s.j(aVarC);
                        whf.b bVarA8 = a3Var21.f175971h.a();
                        vc.s.j(bVarA8);
                        h9e.h hVar3 = (h9e.h) aVar20.H.get();
                        vc.s.j(hVar3);
                        return new lv4.b0(creditCardStatementPageScreenContract$InputData, nVarS11, fVarE3, aVar18, aVar19, mVar, qVarA2, new om4.f4(qVarA3, aVarC, bVarA8, hVar3), (cli.n) v2Var.f176404l.get());
                    case 9:
                        djf.c cVar2 = v2Var.f176399b.f175971h;
                        thf.l lVarF = cVar2.f();
                        vc.s.j(lVarF);
                        thf.d dVarD5 = cVar2.d();
                        vc.s.j(dVarD5);
                        thf.m mVarG4 = cVar2.g();
                        vc.s.j(mVarG4);
                        return new lv4.d0(new sv4.k(lVarF, dVarD5, mVarG4), new he2.b(new lt4.b(), new lt4.e()), new bp4.j());
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                a3 a3Var22 = this.f176070b;
                r rVar7 = a3Var22.f175965b;
                w2 w2Var = (w2) this.d;
                int i100 = this.f176071c;
                if (i100 == 0) {
                    return kxa.j.l((j60.a) w2Var.e.get());
                }
                if (i100 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) w2Var.f176420c.get(), (rp0.m) w2Var.d.get());
                }
                if (i100 == 2) {
                    return new rp0.m();
                }
                if (i100 != 3) {
                    if (i100 == 4) {
                        return new ev4.r();
                    }
                    throw new AssertionError(i100);
                }
                CreditCardStatementScreenContract$InputData creditCardStatementScreenContract$InputData = w2Var.f176418a;
                j60.a aVar21 = (j60.a) w2Var.e.get();
                al4.n nVarS12 = rVar7.s();
                vc.s.j(nVarS12);
                return new ev4.q(creditCardStatementScreenContract$InputData, aVar21, nVarS12, rVar7.a(), new sv4.a(), new an4.e(((eyd.b) w2Var.f176419b.F).c()), ((nj0.d) a3Var22.M).j(), a3Var22.f.e(), (jki.p) w2Var.f176421g.get());
            case 17:
                y2 y2Var = (y2) this.d;
                a3 a3Var23 = this.f176070b;
                int i101 = this.f176071c;
                switch (i101) {
                    case 0:
                        return kxa.j.k((j60.a) y2Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) y2Var.f176450c.get(), (rp0.m) y2Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.b bVar10 = (n60.b) y2Var.f176451g.get();
                        o5k.i.m(bVar10);
                        return bVar10;
                    case 4:
                        return o5k.i.r((com.revolut.kompot.navigable.a) y2Var.f176450c.get());
                    case 5:
                        mw4.a aVar22 = new mw4.a();
                        vt4.b bVar11 = new vt4.b();
                        j60.a aVar23 = (j60.a) y2Var.e.get();
                        n60.b bVar12 = (n60.b) y2Var.f176451g.get();
                        w80.b bVar13 = (w80.b) y2Var.i.get();
                        ite.a aVar24 = a3Var23.f175982r;
                        r rVar8 = a3Var23.f175965b;
                        gte.a aVarB3 = aVar24.b();
                        vc.s.j(aVarB3);
                        al4.n nVarS13 = rVar8.s();
                        vc.s.j(nVarS13);
                        al4.q qVarA4 = rVar8.a();
                        wsg.n nVarB3 = a3Var23.o.b();
                        ang.f fVarE4 = a3Var23.f.e();
                        CreditCardTopupScreenContract$InputData creditCardTopupScreenContract$InputData = y2Var.f176448a;
                        r70.c cVarA = a3Var23.k.A();
                        vc.s.j(cVarA);
                        zVar = new kw4.z(aVar22, bVar11, aVar23, bVar12, bVar13, aVarB3, nVarS13, qVarA4, nVarB3, fVarE4, creditCardTopupScreenContract$InputData, cVarA, (cli.n) y2Var.f176454l.get());
                        break;
                    case 6:
                        w80.b amountFormatter = a3Var23.k.j();
                        vc.s.j(amountFormatter);
                        lw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
                        return amountFormatter;
                    case 7:
                        gte.a aVarB4 = y2Var.f176449b.f175982r.b();
                        vc.s.j(aVarB4);
                        mw4.f fVar3 = new mw4.f(aVarB4);
                        nw4.d dVar3 = new nw4.d();
                        u80.o oVar2 = new u80.o();
                        w80.b bVarJ5 = y2Var.f176449b.k.j();
                        vc.s.j(bVarJ5);
                        zVar = new kw4.a0(fVar3, new mw4.i(dVar3, oVar2, bVarJ5), new mw4.l((cy0.c) y2Var.f176453j.get()), (cm4.r) y2Var.k.get(), new nw4.d());
                        break;
                    case 8:
                        lw4.b.Companion.getClass();
                        return new cy0.d(0);
                    case 9:
                        return new wq4.c();
                    default:
                        throw new AssertionError(i101);
                }
                return zVar;
            case 18:
                e3 e3Var = (e3) this.d;
                a3 a3Var24 = e3Var.f176058b;
                a3 a3Var25 = this.f176070b;
                l70.e eVar10 = a3Var25.k;
                r rVar9 = a3Var25.f175965b;
                int i102 = this.f176071c;
                if (i102 == 0) {
                    n60.b bVar14 = (n60.b) e3Var.d.get();
                    o5k.i.m(bVar14);
                    return bVar14;
                }
                if (i102 == 1) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) e3Var.f176059c.get());
                }
                if (i102 != 2) {
                    if (i102 == 3) {
                        return new rq4.q((InputFilter) e3Var.f176060g.get(), new u80.o(), (w80.b) e3Var.f.get());
                    }
                    if (i102 != 4) {
                        if (i102 != 5) {
                            throw new AssertionError(i102);
                        }
                        sq4.b.Companion.getClass();
                        return new mp0.d(11);
                    }
                    qd0.b languageProvider3 = eVar10.n();
                    vc.s.j(languageProvider3);
                    sq4.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider3, "languageProvider");
                    return v80.b.b(languageProvider3, false, false, 58);
                }
                CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = e3Var.f176057a;
                om4.y2 y2Var2 = (om4.y2) rVar9.N.get();
                vc.s.j(y2Var2);
                r70.c cVarA2 = eVar10.A();
                vc.s.j(cVarA2);
                rq4.a aVar25 = new rq4.a();
                al4.n nVarS14 = rVar9.s();
                vc.s.j(nVarS14);
                om4.k0 k0VarQ = rVar9.q();
                vc.s.j(k0VarQ);
                qd0.b bVarN2 = a3Var24.k.n();
                vc.s.j(bVarN2);
                return new com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c(creditLimitCapChangeScreenContract$InputData, y2Var2, cVarA2, aVar25, nVarS14, k0VarQ, new ow4.a(bVarN2, 0), (n60.b) e3Var.d.get(), rVar9.i(), (al4.o) a3Var25.m0.get(), a3Var25.f.e(), (om4.e3) a3Var25.l0.get(), new an4.e(((eyd.b) a3Var24.F).c()), (cli.n) e3Var.f176061h.get());
            case 19:
                int i103 = this.f176071c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new ny4.l();
                    }
                    throw new AssertionError(i103);
                }
                a3 a3Var26 = this.f176070b;
                ang.f fVarE5 = a3Var26.f.e();
                wli.x xVarD = ((s41.a) a3Var26.f175975l).d();
                dw3.d2 d2Var2 = (dw3.d2) this.d;
                return new ny4.k(fVarE5, xVarD, d2Var2.f118549b, (jki.p) d2Var2.f118550c.get());
            case 20:
                i3 i3Var = (i3) this.d;
                InputAmountScreenContract$InputData inputAmountScreenContract$InputData = i3Var.f176121a;
                a3 a3Var27 = this.f176070b;
                l70.e eVar11 = a3Var27.k;
                int i104 = this.f176071c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    w80.b bVarJ6 = eVar11.j();
                    vc.s.j(bVarJ6);
                    return new jk4.r(bVarJ6, new u80.o(), inputAmountScreenContract$InputData);
                }
                wsg.n nVarB4 = a3Var27.o.b();
                w80.b bVarJ7 = eVar11.j();
                vc.s.j(bVarJ7);
                cli.n nVar4 = (cli.n) i3Var.f176123c.get();
                opf.c0 c0Var = new opf.c0();
                i1j.a aVar26 = (i1j.a) a3Var27.f175968d0.get();
                lb5.b bVarA9 = a3Var27.d.a();
                vc.s.j(bVarA9);
                return new com.revolut.feature.credit.autopay.ui.screen.amount.input.b(nVarB4, bVarJ7, inputAmountScreenContract$InputData, nVar4, c0Var, aVar26, bVarA9);
            case 21:
                j3 j3Var = (j3) this.d;
                a3 a3Var28 = j3Var.f176156b;
                int i105 = this.f176071c;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new AssertionError(i105);
                    }
                    whf.n nVarB5 = a3Var28.f175971h.b();
                    vc.s.j(nVarB5);
                    return new tr4.u(new gs4.n(nVarB5), new gs4.l(), new bp4.g());
                }
                InstalmentConfirmationScreenContract$InputData instalmentConfirmationScreenContract$InputData = j3Var.f176155a;
                r rVar10 = a3Var28.f175965b;
                al4.m mVarR10 = rVar10.r();
                vc.s.j(mVarR10);
                al4.e eVarP2 = rVar10.p();
                vc.s.j(eVarP2);
                smd.s sVar2 = new smd.s(mVarR10, eVarP2);
                gs4.i iVar = new gs4.i(new bp4.g());
                whf.n nVarB6 = a3Var28.f175971h.b();
                vc.s.j(nVarB6);
                gs4.s sVar3 = new gs4.s(nVarB6);
                a3 a3Var29 = this.f176070b;
                ang.f fVarE6 = a3Var29.f.e();
                whf.b bVarA10 = a3Var29.f175971h.a();
                vc.s.j(bVarA10);
                al4.m mVarR11 = a3Var28.f175965b.r();
                vc.s.j(mVarR11);
                return new com.revolut.feature.credit.card.impl.ui.instalment.confirmation.a(instalmentConfirmationScreenContract$InputData, sVar2, iVar, sVar3, fVarE6, bVarA10, new pak.h(mVarR11), (cli.n) j3Var.f176157c.get());
            case 22:
                l3 l3Var = (l3) this.d;
                InstalmentTermScreenContract$InputData instalmentTermScreenContract$InputData = l3Var.f176187a;
                a3 a3Var30 = l3Var.f176188b;
                int i106 = this.f176071c;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new AssertionError(i106);
                    }
                    vt4.h hVar4 = new vt4.h();
                    bp4.g gVar = new bp4.g();
                    whf.n nVarB7 = a3Var30.f175971h.b();
                    vc.s.j(nVarB7);
                    return new dt4.r(hVar4, gVar, new gs4.n(nVarB7));
                }
                gs4.i iVar2 = new gs4.i(new bp4.g());
                r rVar11 = a3Var30.f175965b;
                al4.m mVarR12 = rVar11.r();
                vc.s.j(mVarR12);
                al4.e eVarP3 = rVar11.p();
                vc.s.j(eVarP3);
                com.revolut.feature.credit.card.impl.ui.instalment.term.a aVar27 = new com.revolut.feature.credit.card.impl.ui.instalment.term.a(instalmentTermScreenContract$InputData, mVarR12, eVarP3);
                whf.n nVarB8 = a3Var30.f175971h.b();
                vc.s.j(nVarB8);
                gs4.s sVar4 = new gs4.s(nVarB8);
                a3 a3Var31 = this.f176070b;
                ang.f fVarE7 = a3Var31.f.e();
                whf.b bVarA11 = a3Var31.f175971h.a();
                vc.s.j(bVarA11);
                return new com.revolut.feature.credit.card.impl.ui.instalment.term.b(instalmentTermScreenContract$InputData, iVar2, aVar27, sVar4, fVarE7, bVarA11, (cli.n) l3Var.f176189c.get());
            case 23:
                return a();
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                w3 w3Var = (w3) this.d;
                CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData = w3Var.f176424b;
                a3 a3Var32 = this.f176070b;
                int i107 = this.f176071c;
                if (i107 == 0) {
                    return new com.revolut.feature.credit.card.impl.ui.description.a(creditCardDescriptionScreenContract$InputData, ((s41.a) a3Var32.f175975l).d(), (jki.p) w3Var.d.get());
                }
                if (i107 != 1) {
                    throw new AssertionError(i107);
                }
                qd0.b bVarN3 = w3Var.f176425c.k.n();
                vc.s.j(bVarN3);
                return yf6.b.o(creditCardDescriptionScreenContract$InputData, new u80.m(bVarN3), new bp4.h(), a3Var32.L.b());
        }
    }
}
