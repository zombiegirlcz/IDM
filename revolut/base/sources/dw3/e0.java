package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.date.DatePickerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.sources.DownPaymentSourcesControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.CheckoutControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118606c;
    public final Object d;
    public final Object e;

    public /* synthetic */ e0(c1 c1Var, Object obj2, Object obj3, int i, int i2) {
        this.f118604a = i2;
        this.f118605b = c1Var;
        this.d = obj2;
        this.e = obj3;
        this.f118606c = i;
    }

    private final Object a() {
        h4 h4Var = (h4) this.d;
        r4 r4Var = (r4) this.e;
        int i = this.f118606c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) r4Var.f119660b.get(), (c84.b) r4Var.d.get(), (PluginFlowContract$Input) h4Var.i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            Object extension = (qe4.e) r4Var.f.get();
            te4.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        c1 c1Var = this.f118605b;
        if (i == 3) {
            return new qe4.l((re4.e) h4Var.u.get(), new h54.a(), c1Var.c());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        re4.e eVar = (re4.e) h4Var.u.get();
        OtpScreenContract$InputData otpScreenContract$InputData = r4Var.f119659a;
        l80.e eVarH = c1Var.f118443h.h();
        vc.s.j(eVarH);
        return new se4.o(eVar, otpScreenContract$InputData, eVarH, (qe4.e) r4Var.f.get(), new se4.q(r4Var.f119659a));
    }

    private final Object b() {
        w4 w4Var = (w4) this.e;
        PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData = w4Var.f120060a;
        int i = this.f118606c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) w4Var.f120062c.get(), (c84.b) w4Var.e.get(), (PluginFlowContract$Input) ((r6) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        c1 c1Var = this.f118605b;
        if (i == 2) {
            return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) w4Var.f120062c.get());
        }
        if (i == 3) {
            lx4.a aVarE = c1Var.f118489y.e();
            return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
        }
        if (i == 4) {
            return new ei4.l(partnerSolicitorDetailsControllerContract$InputData, (cx4.a) w4Var.f120064h.get(), new ei4.a(), new ei4.m(partnerSolicitorDetailsControllerContract$InputData, w4Var.f120061b.f118489y.c()));
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        a5 a5Var = (a5) this.e;
        c1 c1Var = this.f118605b;
        int i = this.f118606c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) a5Var.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) a5Var.f118270c.get(), (rp0.m) a5Var.d.get());
            case 2:
                return new rp0.m();
            case 3:
                return e5f.b.e((com.revolut.kompot.navigable.a) a5Var.f118270c.get(), (c84.b) a5Var.f118272h.get(), (PluginFlowContract$Input) ((z4) this.d).i.get());
            case 4:
                return new c84.b();
            case 5:
                return new a84.e((a84.b) a5Var.f118273j.get());
            case 6:
                return agk.b.l(a5Var.f118268a);
            case 7:
                return new hg4.u((cli.n) a5Var.f118275m.get(), a5Var.f118269b, (vx3.a) c1Var.S1.get(), (j60.a) a5Var.e.get());
            case 8:
                qd0.b bVarN = c1Var.f118443h.n();
                vc.s.j(bVarN);
                return new hg4.w(bVarN);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        c5 c5Var = (c5) this.e;
        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = c5Var.f118508a;
        int i = this.f118606c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) c5Var.f118509b.get(), (c84.b) c5Var.d.get(), (PluginFlowContract$Input) ((b5) this.d).f118365j.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new lg4.s((cli.n) c5Var.f118511g.get(), photosUploadSummaryControllerContract$InputData, (wx3.c) this.f118605b.f118436e3.get());
        }
        if (i == 3) {
            return new lg4.t(photosUploadSummaryControllerContract$InputData);
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        l5 l5Var = (l5) this.e;
        c1 c1Var = this.f118605b;
        ax4.e eVar = c1Var.f118489y;
        int i = this.f118606c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) l5Var.f119204b.get(), (c84.b) l5Var.d.get(), (PluginFlowContract$Input) ((k5) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) l5Var.f119204b.get());
        }
        if (i == 3) {
            lx4.a aVarE = eVar.e();
            return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
        }
        if (i == 4) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a((ay3.a) c1Var.f118442g2.get(), (cli.n) l5Var.i.get(), l5Var.f119203a, (cx4.a) l5Var.f119206g.get(), new mx4.e0(), new fuf.b(new jh4.a()));
        }
        if (i == 5) {
            return new dh4.v(eVar.c());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object uVar;
        Object qVar;
        Object mVar;
        switch (this.f118604a) {
            case 0:
                f0 f0Var = (f0) this.e;
                int i = this.f118606c;
                if (i == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) f0Var.f118696b.get(), (c84.b) f0Var.d.get(), (PluginFlowContract$Input) ((u2) this.d).i.get());
                }
                if (i == 1) {
                    return new c84.b();
                }
                if (i != 2) {
                    if (i == 3) {
                        return new sa4.a();
                    }
                    throw new AssertionError(i);
                }
                CheckEmailInboxScreenContract$InputData checkEmailInboxScreenContract$InputData = f0Var.f118695a;
                c1 c1Var = this.f118605b;
                l80.h hVarV = c1Var.f118443h.v();
                vc.s.j(hVarV);
                return new qa4.k(checkEmailInboxScreenContract$InputData, hVarV, c1Var.k.e(), (sa4.a) f0Var.f118698g.get(), new qa4.l());
            case 1:
                g0 g0Var = (g0) this.e;
                c1 c1Var2 = this.f118605b;
                p7c.r rVar = c1Var2.l0;
                int i2 = this.f118606c;
                if (i2 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) g0Var.f118785c.get(), (c84.b) g0Var.e.get(), (PluginFlowContract$Input) ((y4) this.d).i.get());
                }
                if (i2 == 1) {
                    return new c84.b();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                CreditPluginsService creditPluginsService = (CreditPluginsService) c1Var2.p0.get();
                v14.d paymentRequestDtoMapper = new v14.d();
                v14.b paymentConfigurationDtoMapper = new v14.b();
                mp.p creditApplicationDtoMapper = uq3.b.a();
                Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
                Intrinsics.checkNotNullParameter(paymentRequestDtoMapper, "paymentRequestDtoMapper");
                Intrinsics.checkNotNullParameter(paymentConfigurationDtoMapper, "paymentConfigurationDtoMapper");
                Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
                smd.s sVar = new smd.s();
                sVar.f264432a = creditPluginsService;
                sVar.f264433b = creditApplicationDtoMapper;
                t1j.b bVar = new t1j.b(sVar);
                q7c.g gVarE = rVar.e();
                q7c.m mVarD = rVar.d();
                vc.s.j(mVarD);
                CheckoutControllerContract$InputData checkoutControllerContract$InputData = g0Var.f118783a;
                dec.r rVar2 = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar = new dec.a();
                l80.e eVarH = g0Var.f118784b.f118443h.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a(bVar, gVarE, mVarD, checkoutControllerContract$InputData, new bg4.c0(new bg4.d0(new dec.q(rVar2, gVar, aVar, eVarH))));
            case 2:
                m0 m0Var = (m0) this.e;
                c1 c1Var3 = this.f118605b;
                ax4.e eVar = c1Var3.f118489y;
                int i3 = this.f118606c;
                if (i3 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) m0Var.f119228b.get(), (c84.b) m0Var.d.get(), (PluginFlowContract$Input) ((n0) this.d).f119312l.get());
                }
                if (i3 == 1) {
                    return new c84.b();
                }
                if (i3 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var3.f118443h, (com.revolut.kompot.navigable.a) m0Var.f119228b.get());
                }
                if (i3 == 3) {
                    lx4.a aVarE = eVar.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var3.f118485x).d());
                }
                if (i3 == 4) {
                    return new x64.c(m0Var.f119227a, (cx4.a) m0Var.f119230g.get(), (qw3.a) c1Var3.E1.get(), (cli.n) m0Var.i.get());
                }
                if (i3 == 5) {
                    return new hb4.o(eVar.c(), 1);
                }
                throw new AssertionError(i3);
            case 3:
                u0 u0Var = (u0) this.e;
                c1 c1Var4 = this.f118605b;
                int i5 = this.f118606c;
                switch (i5) {
                    case 0:
                        return e5f.b.d((com.revolut.kompot.navigable.a) u0Var.f119877c.get(), (c84.b) u0Var.e.get(), (PluginFlowContract$Input) ((t0) this.d).i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        uVar = new m44.u((hw3.c) c1Var4.f118472s0.get(), (jki.p) u0Var.k.get(), u0Var.f119876b);
                        return uVar;
                    case 3:
                        qVar = new m44.q((hj1.b) u0Var.f119880j.get());
                        return qVar;
                    case 4:
                        t70.g gVarO = c1Var4.f118443h.o();
                        vc.s.j(gVarO);
                        n8b.a aVarA = c1Var4.C.a();
                        vc.s.j(aVarA);
                        uVar = new hj1.c(gVarO, aVarA, (c90.c) u0Var.f119879h.get(), (gj1.b) u0Var.i.get());
                        return uVar;
                    case 5:
                        BaseScreen screen = u0Var.f119875a;
                        n44.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        qVar = new c90.c(screen.m2());
                        return qVar;
                    case 6:
                        return new gj1.c();
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                v0 v0Var = (v0) this.e;
                int i6 = this.f118606c;
                if (i6 == 0) {
                    return e5f.b.d((com.revolut.kompot.navigable.a) v0Var.f119960b.get(), (c84.b) v0Var.d.get(), (PluginFlowContract$Input) ((t0) this.d).i.get());
                }
                if (i6 == 1) {
                    return new c84.b();
                }
                if (i6 == 2) {
                    mVar = new o44.m((hw3.c) this.f118605b.f118472s0.get(), (jki.p) v0Var.f119962g.get(), v0Var.f119959a, (e0m.f) v0Var.i.get());
                } else {
                    if (i6 == 3) {
                        return new o44.j();
                    }
                    if (i6 != 4) {
                        if (i6 != 5) {
                            throw new AssertionError(i6);
                        }
                        p44.b.Companion.getClass();
                        return new zzl.c();
                    }
                    zzl.b regexMatcher = (zzl.b) v0Var.f119963h.get();
                    p44.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                    mVar = new e0m.f(regexMatcher);
                }
                return mVar;
            case 5:
                w0 w0Var = (w0) this.e;
                int i21 = this.f118606c;
                if (i21 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) w0Var.f120047b.get(), (c84.b) w0Var.d.get(), (PluginFlowContract$Input) ((x0) this.d).i.get());
                }
                if (i21 == 1) {
                    return new c84.b();
                }
                c1 c1Var5 = this.f118605b;
                if (i21 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var5.f118443h, (com.revolut.kompot.navigable.a) w0Var.f120047b.get());
                }
                if (i21 == 3) {
                    lx4.a aVarE2 = c1Var5.f118489y.e();
                    return new kx4.a(aVarE2, com.revolut.data.database.models.openbanking.d.v(aVarE2), ((s41.a) c1Var5.f118485x).d());
                }
                if (i21 == 4) {
                    return new t44.p(w0Var.f120046a, new t44.q(), (cx4.a) w0Var.f120050h.get(), (iw3.a) c1Var5.f118467q3.get());
                }
                throw new AssertionError(i21);
            case 6:
                y0 y0Var = (y0) this.e;
                int i22 = this.f118606c;
                if (i22 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) y0Var.f120190c.get(), (c84.b) y0Var.e.get(), (PluginFlowContract$Input) ((x0) this.d).i.get());
                }
                if (i22 == 1) {
                    return new c84.b();
                }
                c1 c1Var6 = this.f118605b;
                if (i22 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var6.f118443h, (com.revolut.kompot.navigable.a) y0Var.f120190c.get());
                }
                if (i22 == 3) {
                    lx4.a aVarE3 = c1Var6.f118489y.e();
                    return new kx4.a(aVarE3, com.revolut.data.database.models.openbanking.d.v(aVarE3), ((s41.a) c1Var6.f118485x).d());
                }
                if (i22 != 4) {
                    throw new AssertionError(i22);
                }
                CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData = y0Var.f120188a;
                uh1.a aVar2 = (uh1.a) ((yh1.e) y0Var.f120189b.i0).f.get();
                vc.s.j(aVar2);
                s44.q qVar2 = new s44.q(aVar2);
                cx4.a aVar3 = (cx4.a) y0Var.i.get();
                iw3.a aVar4 = (iw3.a) c1Var6.f118467q3.get();
                til.m mVarA = c1Var6.f118420a0.a();
                vc.s.j(mVarA);
                jvh.a aVarA2 = c1Var6.j0.a();
                vc.s.j(aVarA2);
                return new s44.p(creditAddressInputScreenContract$InputData, qVar2, aVar3, aVar4, mVarA, aVarA2);
            case 7:
                e1 e1Var = (e1) this.d;
                f1 f1Var = (f1) this.e;
                int i32 = this.f118606c;
                if (i32 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) f1Var.f118702c.get(), (c84.b) f1Var.e.get(), (PluginFlowContract$Input) e1Var.i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                c1 c1Var7 = this.f118605b;
                if (i32 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var7.f118443h, (com.revolut.kompot.navigable.a) f1Var.f118702c.get());
                }
                if (i32 == 3) {
                    lx4.a aVarE4 = c1Var7.f118489y.e();
                    return new kx4.a(aVarE4, com.revolut.data.database.models.openbanking.d.v(aVarE4), ((s41.a) c1Var7.f118485x).d());
                }
                if (i32 == 4) {
                    return new i84.j(f1Var.f118700a, (g84.e) e1Var.C.get(), (cx4.a) f1Var.i.get(), new i84.l(f1Var.f118701b.f118489y.b()));
                }
                throw new AssertionError(i32);
            case 8:
                s1 s1Var = (s1) this.e;
                CustomSolicitorDetailsControllerContract$InputData customSolicitorDetailsControllerContract$InputData = s1Var.f119726a;
                int i33 = this.f118606c;
                if (i33 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) s1Var.f119728c.get(), (c84.b) s1Var.e.get(), (PluginFlowContract$Input) ((r6) this.d).i.get());
                }
                if (i33 == 1) {
                    return new c84.b();
                }
                if (i33 != 2) {
                    if (i33 != 3) {
                        throw new AssertionError(i33);
                    }
                    di4.b.Companion.getClass();
                    return new zzl.c();
                }
                ci4.q qVar3 = new ci4.q();
                z80.b bVarS = this.f118605b.f118443h.s();
                vc.s.j(bVarS);
                l70.e eVar2 = s1Var.f119727b.f118443h;
                z80.b bVarS2 = eVar2.s();
                vc.s.j(bVarS2);
                z80.b bVarS3 = eVar2.s();
                vc.s.j(bVarS3);
                return new ci4.o(customSolicitorDetailsControllerContract$InputData, qVar3, bVarS, new ci4.p(customSolicitorDetailsControllerContract$InputData, bVarS2, new zq.a(bVarS3, (zzl.b) s1Var.f119730h.get())));
            case 9:
                u1 u1Var = (u1) this.e;
                int i43 = this.f118606c;
                if (i43 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) u1Var.f119883b.get(), (c84.b) u1Var.d.get(), (PluginFlowContract$Input) ((r0) this.d).i.get());
                }
                if (i43 == 1) {
                    return new c84.b();
                }
                if (i43 == 2) {
                    return new m74.f((cli.n) u1Var.f119885g.get());
                }
                if (i43 != 3) {
                    throw new AssertionError(i43);
                }
                DatePickerScreenContract$InputData datePickerScreenContract$InputData = u1Var.f119882a;
                l80.e eVarH2 = this.f118605b.f118443h.h();
                vc.s.j(eVarH2);
                return new m74.g(datePickerScreenContract$InputData, eVarH2);
            case 10:
                s4 s4Var = (s4) this.d;
                y1 y1Var = (y1) this.e;
                int i59 = this.f118606c;
                if (i59 == 0) {
                    return e5f.b.d((com.revolut.kompot.navigable.a) y1Var.f120195b.get(), (c84.b) y1Var.d.get(), (PluginFlowContract$Input) s4Var.i.get());
                }
                if (i59 == 1) {
                    return new c84.b();
                }
                if (i59 == 2) {
                    return new x84.q(y1Var.f120194a, (ww3.c) this.f118605b.f118435e1.get(), (j60.a) s4Var.f119762t.get(), (jki.p) y1Var.f120197g.get());
                }
                if (i59 != 3) {
                    throw new AssertionError(i59);
                }
                z84.a mapper = new z84.a();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new x84.s();
            case 11:
                z1 z1Var = (z1) this.e;
                int i66 = this.f118606c;
                if (i66 == 0) {
                    return new e94.h(z1Var.f120264a, (xw3.a) this.f118605b.f118445h1.get(), (a94.k) ((t4) this.d).f119843s.get(), (cli.n) z1Var.f120265b.get());
                }
                if (i66 == 1) {
                    return new e94.r();
                }
                throw new AssertionError(i66);
            case 12:
                j2 j2Var = (j2) this.e;
                c1 c1Var8 = this.f118605b;
                int i74 = this.f118606c;
                switch (i74) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) j2Var.f119018c.get(), (c84.b) j2Var.e.get(), (PluginFlowContract$Input) ((o0) this.d).i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var8.f118443h, (com.revolut.kompot.navigable.a) j2Var.f119018c.get());
                    case 3:
                        return new a84.e((a84.b) j2Var.f119020h.get());
                    case 4:
                        return agk.b.l(j2Var.f119016a);
                    case 5:
                        lx4.a aVarE5 = c1Var8.f118489y.e();
                        return new kx4.a(aVarE5, com.revolut.data.database.models.openbanking.d.v(aVarE5), ((s41.a) c1Var8.f118485x).d());
                    case 6:
                        nj0.a aVar5 = c1Var8.d;
                        l70.e eVar3 = c1Var8.f118443h;
                        hk0.a aVarJ = ((nj0.d) aVar5).j();
                        zk0.b bVarL = eVar3.l();
                        vc.s.j(bVarL);
                        n80.d dVarA = eVar3.a();
                        vc.s.j(dVarA);
                        return new y74.d(aVarJ, bVarL, dVarA, c1Var8.f118482w.e());
                    case 7:
                        DocumentsContentContract$InputData documentsContentContract$InputData = j2Var.f119017b;
                        sw3.c cVar = (sw3.c) c1Var8.a1.get();
                        cx4.a aVar6 = (cx4.a) j2Var.f119021j.get();
                        f80.a aVarX = c1Var8.f118443h.x();
                        vc.s.j(aVarX);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b(documentsContentContract$InputData, cVar, aVar6, aVarX, (y74.a) j2Var.f119022l.get(), (cli.n) j2Var.f119023m.get());
                    case 8:
                        return new h74.r(c1Var8.f118489y.c(), new ix4.b());
                    case 9:
                        return jr9.h.A((com.revolut.kompot.navigable.a) j2Var.f119018c.get());
                    default:
                        throw new AssertionError(i74);
                }
            case 13:
                n2 n2Var = (n2) this.e;
                int i92 = this.f118606c;
                if (i92 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) n2Var.f119329c.get(), (c84.b) n2Var.e.get(), (PluginFlowContract$Input) ((o2) this.d).i.get());
                }
                if (i92 == 1) {
                    return new c84.b();
                }
                if (i92 != 2) {
                    throw new AssertionError(i92);
                }
                DownPaymentSourceDetailsControllerContract$InputData downPaymentSourceDetailsControllerContract$InputData = n2Var.f119327a;
                w80.b bVarJ = this.f118605b.f118443h.j();
                vc.s.j(bVarJ);
                return new ha4.l(downPaymentSourceDetailsControllerContract$InputData, bVarJ, new ha4.n(n2Var.f119328b.f118489y.a()));
            case 14:
                p2 p2Var = (p2) this.e;
                int i96 = this.f118606c;
                if (i96 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) p2Var.f119494c.get(), (c84.b) p2Var.e.get(), (PluginFlowContract$Input) ((o2) this.d).i.get());
                }
                if (i96 == 1) {
                    return new c84.b();
                }
                c1 c1Var9 = this.f118605b;
                if (i96 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var9.f118443h, (com.revolut.kompot.navigable.a) p2Var.f119494c.get());
                }
                if (i96 == 3) {
                    lx4.a aVarE6 = c1Var9.f118489y.e();
                    return new kx4.a(aVarE6, com.revolut.data.database.models.openbanking.d.v(aVarE6), ((s41.a) c1Var9.f118485x).d());
                }
                if (i96 != 4) {
                    throw new AssertionError(i96);
                }
                DownPaymentSourcesControllerContract$InputData downPaymentSourcesControllerContract$InputData = p2Var.f119492a;
                o7.b bVarF = c1Var9.f();
                cx4.a aVar7 = (cx4.a) p2Var.f119496h.get();
                ax4.e eVar4 = p2Var.f119493b.f118489y;
                return new ka4.q(downPaymentSourcesControllerContract$InputData, bVarF, aVar7, new af4.v(new mx4.f0(eVar4.a()), new mx4.h(), eVar4.c(), 1));
            case 15:
                r2 r2Var = (r2) this.e;
                int i99 = this.f118606c;
                if (i99 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) r2Var.f119642c.get(), (c84.b) r2Var.e.get(), (PluginFlowContract$Input) ((s2) this.d).i.get());
                }
                if (i99 == 1) {
                    return new c84.b();
                }
                if (i99 != 2) {
                    throw new AssertionError(i99);
                }
                ESignDocumentsScreenContract$InputData eSignDocumentsScreenContract$InputData = r2Var.f119640a;
                ex3.a aVar8 = (ex3.a) this.f118605b.f118429c1.get();
                nf0.a aVar9 = r2Var.f119641b.f118440g;
                sf0.h hVarB = aVar9.b();
                vc.s.j(hVarB);
                cb4.b bVar2 = new cb4.b(hVarB);
                sf0.h hVarB2 = aVar9.b();
                vc.s.j(hVarB2);
                return new ab4.s(eSignDocumentsScreenContract$InputData, aVar8, ImmutableSet.of((qk3.e) bVar2, new qk3.e(hVarB2)), new ab4.u(new mx4.r()));
            case 16:
                z2 z2Var = (z2) this.e;
                EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = z2Var.f120267a;
                int i100 = this.f118606c;
                if (i100 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) z2Var.f120268b.get(), (c84.b) z2Var.d.get(), (PluginFlowContract$Input) ((q) this.d).f119544j.get());
                }
                if (i100 == 1) {
                    return new c84.b();
                }
                if (i100 == 2) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a(evidenceTypeSelectionScreenContract$InputData, this.f118605b.f118482w.g(), new ob4.l(evidenceTypeSelectionScreenContract$InputData, new q74.b()));
                }
                throw new AssertionError(i100);
            case 17:
                f3 f3Var = (f3) this.e;
                c1 c1Var10 = this.f118605b;
                ax4.e eVar5 = c1Var10.f118489y;
                int i101 = this.f118606c;
                if (i101 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) f3Var.f118710b.get(), (c84.b) f3Var.d.get(), (PluginFlowContract$Input) ((e3) this.d).i.get());
                }
                if (i101 == 1) {
                    return new c84.b();
                }
                if (i101 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var10.f118443h, (com.revolut.kompot.navigable.a) f3Var.f118710b.get());
                }
                if (i101 == 3) {
                    lx4.a aVarE7 = eVar5.e();
                    return new kx4.a(aVarE7, com.revolut.data.database.models.openbanking.d.v(aVarE7), ((s41.a) c1Var10.f118485x).d());
                }
                if (i101 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e(f3Var.f118709a, (gx3.a) c1Var10.f118466q2.get(), (cx4.a) f3Var.f118712g.get(), (cli.n) f3Var.i.get());
                }
                if (i101 == 5) {
                    return new hb4.o(eVar5.c(), 0);
                }
                throw new AssertionError(i101);
            case 18:
                c1 c1Var11 = this.f118605b;
                ax4.e eVar6 = c1Var11.f118489y;
                j3 j3Var = (j3) this.e;
                int i102 = this.f118606c;
                if (i102 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) j3Var.f119026b.get(), (c84.b) j3Var.d.get(), (PluginFlowContract$Input) ((i3) this.d).i.get());
                }
                if (i102 == 1) {
                    return new c84.b();
                }
                if (i102 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var11.f118443h, (com.revolut.kompot.navigable.a) j3Var.f119026b.get());
                }
                if (i102 == 3) {
                    lx4.a aVarE8 = eVar6.e();
                    return new kx4.a(aVarE8, com.revolut.data.database.models.openbanking.d.v(aVarE8), ((s41.a) c1Var11.f118485x).d());
                }
                if (i102 == 4) {
                    return new ac4.f((cli.n) j3Var.i.get(), (cx4.a) j3Var.f119028g.get());
                }
                if (i102 == 5) {
                    return new ac4.g(j3Var.f119025a, eVar6.b());
                }
                throw new AssertionError(i102);
            case 19:
                n3 n3Var = (n3) this.e;
                int i103 = this.f118606c;
                if (i103 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) n3Var.f119333b.get(), (c84.b) n3Var.d.get(), (PluginFlowContract$Input) ((m3) this.d).i.get());
                }
                if (i103 == 1) {
                    return new c84.b();
                }
                if (i103 == 2) {
                    return new gc4.l((hw3.c) this.f118605b.f118472s0.get(), (cli.n) n3Var.f119335g.get(), n3Var.f119332a);
                }
                if (i103 == 3) {
                    return new gc4.m();
                }
                throw new AssertionError(i103);
            case 20:
                e4 e4Var = (e4) this.e;
                MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = e4Var.f118641a;
                int i104 = this.f118606c;
                if (i104 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) e4Var.f118643c.get(), (c84.b) e4Var.e.get(), (PluginFlowContract$Input) ((g4) this.d).i.get());
                }
                if (i104 == 1) {
                    return new c84.b();
                }
                if (i104 != 2) {
                    if (i104 == 3) {
                        return new me4.q(moneyInputControllerContract$InputData, new q74.b());
                    }
                    throw new AssertionError(i104);
                }
                w80.b bVarJ2 = this.f118605b.f118443h.j();
                vc.s.j(bVarJ2);
                return new me4.p(moneyInputControllerContract$InputData, bVarJ2, (cli.n) e4Var.f118645h.get());
            case 21:
                k4 k4Var = (k4) this.e;
                int i105 = this.f118606c;
                if (i105 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) k4Var.f119112c.get(), (c84.b) k4Var.e.get(), ((j4) this.d).f119032b);
                }
                if (i105 == 1) {
                    return new c84.b();
                }
                c1 c1Var12 = this.f118605b;
                if (i105 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var12.f118443h, (com.revolut.kompot.navigable.a) k4Var.f119112c.get());
                }
                if (i105 == 3) {
                    lx4.a aVarE9 = c1Var12.f118489y.e();
                    return new kx4.a(aVarE9, com.revolut.data.database.models.openbanking.d.v(aVarE9), ((s41.a) c1Var12.f118485x).d());
                }
                if (i105 != 4) {
                    throw new AssertionError(i105);
                }
                MortgageValuationSummaryControllerContract$InputData mortgageValuationSummaryControllerContract$InputData = k4Var.f119110a;
                qx3.a aVar10 = (qx3.a) c1Var12.f118478u3.get();
                hk0.a aVarJ2 = ((nj0.d) c1Var12.d).j();
                tqi.e eVarD = c1Var12.f118482w.d();
                cx4.a aVar11 = (cx4.a) k4Var.f119114h.get();
                ax4.e eVar7 = k4Var.f119111b.f118489y;
                return new af4.u(mortgageValuationSummaryControllerContract$InputData, aVar10, aVarJ2, eVarD, aVar11, new af4.v(new mx4.f0(eVar7.a()), new mx4.h(), eVar7.c(), 0));
            case 22:
                n4 n4Var = (n4) this.d;
                o4 o4Var = (o4) this.e;
                c1 c1Var13 = this.f118605b;
                int i106 = this.f118606c;
                switch (i106) {
                    case 0:
                        return kxa.j.k((j60.a) o4Var.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) o4Var.f119439c.get(), (rp0.m) o4Var.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.e((com.revolut.kompot.navigable.a) o4Var.f119439c.get(), (c84.b) o4Var.f119441h.get(), (PluginFlowContract$Input) n4Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var13.f118443h, (com.revolut.kompot.navigable.a) o4Var.f119439c.get());
                    case 6:
                        lx4.a aVarE10 = c1Var13.f118489y.e();
                        return new kx4.a(aVarE10, com.revolut.data.database.models.openbanking.d.v(aVarE10), ((s41.a) c1Var13.f118485x).d());
                    case 7:
                        return new ff4.b0((cli.n) o4Var.f119445n.get(), o4Var.f119437a, (cx4.a) o4Var.k.get(), (ff4.t) n4Var.v.get(), new f64.a(), (j60.a) o4Var.e.get());
                    case 8:
                        return new hf4.i(new ff4.b((c90.c) o4Var.f119444m.get(), o4Var.f119438b.f118489y.c()));
                    case 9:
                        return jr9.h.A((com.revolut.kompot.navigable.a) o4Var.f119439c.get());
                    default:
                        throw new AssertionError(i106);
                }
            case 23:
                n4 n4Var2 = (n4) this.d;
                p4 p4Var = (p4) this.e;
                c1 c1Var14 = this.f118605b;
                int i107 = this.f118606c;
                switch (i107) {
                    case 0:
                        return kxa.j.k((j60.a) p4Var.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) p4Var.d.get(), (rp0.m) p4Var.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return e5f.b.e((com.revolut.kompot.navigable.a) p4Var.d.get(), (c84.b) p4Var.i.get(), (PluginFlowContract$Input) n4Var2.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var14.f118443h, (com.revolut.kompot.navigable.a) p4Var.d.get());
                    case 6:
                        return new a84.e((a84.b) p4Var.f119505l.get());
                    case 7:
                        return agk.b.l(p4Var.f119499a);
                    case 8:
                        lx4.a aVarE11 = c1Var14.f118489y.e();
                        return new kx4.a(aVarE11, com.revolut.data.database.models.openbanking.d.v(aVarE11), ((s41.a) c1Var14.f118485x).d());
                    case 9:
                        return new ff4.b0((cli.n) p4Var.f119509q.get(), p4Var.f119500b, (cx4.a) p4Var.f119507n.get(), (ff4.t) n4Var2.v.get(), new f64.a(), (j60.a) p4Var.f.get());
                    case 10:
                        return new jf4.d(new ff4.b((c90.c) p4Var.f119508p.get(), p4Var.f119501c.f118489y.c()));
                    case 11:
                        return jr9.h.A((com.revolut.kompot.navigable.a) p4Var.d.get());
                    default:
                        throw new AssertionError(i107);
                }
            case 24:
                return a();
            case 25:
                return b();
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                c1 c1Var15 = this.f118605b;
                ax4.e eVar8 = c1Var15.f118489y;
                n5 n5Var = (n5) this.e;
                RefinancingAccountDetailsInputScreenContract$InputData refinancingAccountDetailsInputScreenContract$InputData = n5Var.f119352a;
                int i108 = this.f118606c;
                if (i108 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) n5Var.f119353b.get(), (c84.b) n5Var.d.get(), (PluginFlowContract$Input) ((m5) this.d).i.get());
                }
                if (i108 == 1) {
                    return new c84.b();
                }
                if (i108 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var15.f118443h, (com.revolut.kompot.navigable.a) n5Var.f119353b.get());
                }
                if (i108 == 3) {
                    lx4.a aVarE12 = eVar8.e();
                    return new kx4.a(aVarE12, com.revolut.data.database.models.openbanking.d.v(aVarE12), ((s41.a) c1Var15.f118485x).d());
                }
                if (i108 == 4) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c((ay3.a) c1Var15.f118442g2.get(), refinancingAccountDetailsInputScreenContract$InputData, new fuf.b(new jh4.a()), (cx4.a) n5Var.f119355g.get(), (cli.n) n5Var.i.get());
                }
                if (i108 == 5) {
                    return new ac4.g(refinancingAccountDetailsInputScreenContract$InputData, eVar8.c());
                }
                throw new AssertionError(i108);
        }
    }
}
