package p8a;

import android.content.Context;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.mapper.DonateSuccessStatusDialogMapper;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$InputData;
import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreenContract$InputData;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f234022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f234023c;
    public final Object d;

    public /* synthetic */ m(Object obj2, Object obj3, int i, int i2) {
        this.f234021a = i2;
        this.f234022b = obj2;
        this.d = obj3;
        this.f234023c = i;
    }

    private final Object a() {
        pa6.m mVar = (pa6.m) this.f234022b;
        zxb.k0 k0Var = mVar.f234398q;
        pa6.d dVar = (pa6.d) this.d;
        pa6.m mVar2 = dVar.f234355b;
        int i = this.f234023c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) dVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) dVar.f234356c.get(), (rp0.m) dVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (kb6.b) dVar.f234357g.get();
                lb6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                return new kb6.c(new ua6.a(), new DonateSuccessStatusDialogMapper());
            case 5:
                cli.n nVar2 = (cli.n) dVar.k.get();
                CharityDetailsScreenContract$InputData charityDetailsScreenContract$InputData = dVar.f234354a;
                aa6.c cVar = (aa6.c) mVar.T.get();
                a31.a aVarA = mVar.f234384a.a();
                xua.a aVarA2 = mVar.f234393j.a();
                vc.s.j(aVarA2);
                ihf.a aVar = (ihf.a) mVar.f234404y.d.get();
                vc.s.j(aVar);
                aa6.a aVar2 = (aa6.a) mVar.U.get();
                sa6.a0 a0Var = (sa6.a0) mVar.P.get();
                sa6.e eVar = (sa6.e) mVar.S.get();
                e4m.e eVar2 = mVar2.P;
                djf.c cVar2 = mVar2.f234402w;
                sa6.a0 a0Var2 = (sa6.a0) eVar2.get();
                sa6.h hVar = (sa6.h) mVar2.f234389d0.get();
                whf.n nVarB = cVar2.b();
                vc.s.j(nVarB);
                thf.g gVarE = cVar2.e();
                vc.s.j(gVarE);
                fub.k kVarD = mVar2.f234403x.d();
                vc.s.j(kVarD);
                tb6.c0 c0Var = new tb6.c0(a0Var2, hVar, nVarB, new sc6.a(gVarE, kVarD), mVar2.f234384a.a());
                ua6.a aVar3 = new ua6.a();
                l61.a aVarB = mVar2.f234399r.b();
                vc.s.j(aVarB);
                tb6.b bVar = new tb6.b(aVarB);
                cu8.r0 r0VarA = mVar.z.a();
                j60.a aVar4 = (j60.a) dVar.e.get();
                gte.a aVarB2 = mVar.o.b();
                vc.s.j(aVarB2);
                nyb.i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                eub.i iVarE = k0Var.e();
                vc.s.j(iVarE);
                kb6.b bVar2 = (kb6.b) dVar.f234357g.get();
                nyb.m0 m0VarG = k0Var.g();
                vc.s.j(m0VarG);
                return new com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c(nVar2, charityDetailsScreenContract$InputData, cVar, aVarA, aVarA2, aVar, aVar2, a0Var, eVar, c0Var, aVar3, bVar, r0VarA, aVar4, aVarB2, i0VarF, iVarE, bVar2, m0VarG);
            case 6:
                return new tb6.z(new vb6.c((vb6.e) dVar.i.get(), (wb6.a) dVar.f234359j.get()));
            case 7:
                return new tb6.e0();
            case 8:
                return new wb6.b();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object hVar;
        switch (this.f234021a) {
            case 0:
                n nVar = (n) this.d;
                d0 d0Var = (d0) this.f234022b;
                int i = this.f234023c;
                if (i == 0) {
                    PixAreaFlowContract$InputData pixAreaFlowContract$InputData = nVar.f234030a;
                    kz9.a aVarA = d0Var.f233931c.a();
                    vc.s.j(aVarA);
                    til.m mVarA = d0Var.d.a();
                    vc.s.j(mVarA);
                    f8a.a aVarB = d0Var.e.b();
                    vc.s.j(aVarB);
                    gte.a aVarB2 = d0Var.f.b();
                    vc.s.j(aVarB2);
                    return new com.revolut.feature.pix.impl.flow.pix_area.a(pixAreaFlowContract$InputData, aVarA, mVarA, aVarB, aVarB2);
                }
                if (i == 1) {
                    ry9.d extension = (ry9.d) nVar.e.get();
                    jaa.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                vy9.g factory = d0Var.f233932g.b();
                vc.s.j(factory);
                jaa.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 1:
                q qVar = (q) this.d;
                int i2 = this.f234023c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new k9a.g();
                    }
                    throw new AssertionError(i2);
                }
                c70.a aVarZ = ((d0) this.f234022b).f233933h.z();
                vc.s.j(aVarZ);
                return new k9a.f(aVarZ, (cli.n) qVar.f234058b.get(), qVar.f234057a);
            case 2:
                d0 d0Var2 = (d0) this.f234022b;
                c cVar = d0Var2.e;
                t tVar = (t) this.d;
                int i3 = this.f234023c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new o9a.d0((q9a.d) tVar.f234086b.get(), (q9a.b) tVar.f234087c.get());
                    }
                    if (i3 == 2) {
                        return new q9a.d();
                    }
                    if (i3 == 3) {
                        return new q9a.b();
                    }
                    throw new AssertionError(i3);
                }
                MutableStateFlow mutableStateFlow = tVar.f234085a;
                wsg.n nVarB = d0Var2.f233937n.b();
                ryc.a aVarC = cVar.c();
                s8a.f fVarD = cVar.d();
                vc.s.j(fVarD);
                zof.f fVarD2 = d0Var2.f233943w.d();
                vc.s.j(fVarD2);
                return new com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a(mutableStateFlow, nVarB, aVarC, fVarD, fVarD2, (cli.n) tVar.d.get());
            case 3:
                int i5 = this.f234023c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new w9a.h();
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar2 = (cli.n) ((v) this.d).f234101a.get();
                s8a.f fVarD3 = ((d0) this.f234022b).e.d();
                vc.s.j(fVarD3);
                return new w9a.g(nVar2, fVarD3);
            case 4:
                d0 d0Var3 = (d0) this.f234022b;
                djf.c cVar2 = d0Var3.f233935l;
                c cVar3 = d0Var3.e;
                w wVar = (w) this.d;
                int i6 = this.f234023c;
                if (i6 == 0) {
                    return kxa.j.k((j60.a) wVar.e.get());
                }
                if (i6 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) wVar.f234110c.get(), (rp0.m) wVar.d.get());
                }
                if (i6 == 2) {
                    return new rp0.m();
                }
                if (i6 != 3) {
                    if (i6 != 4) {
                        throw new AssertionError(i6);
                    }
                    thf.g gVarE = wVar.f234109b.f233935l.e();
                    vc.s.j(gVarE);
                    return new u9a.v(new u9a.x(gVarE));
                }
                cli.n nVar3 = (cli.n) wVar.f234111g.get();
                PixAutomaticoPaymentDetailsScreenContract$InputData pixAutomaticoPaymentDetailsScreenContract$InputData = wVar.f234108a;
                s8a.f fVarD4 = cVar3.d();
                vc.s.j(fVarD4);
                ryc.a aVarC2 = cVar3.c();
                j60.a aVar = (j60.a) wVar.e.get();
                c70.a aVarZ2 = d0Var3.f233933h.z();
                vc.s.j(aVarZ2);
                anf.b bVar = (anf.b) cVar2.Q.get();
                vc.s.j(bVar);
                whf.b bVarA = cVar2.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.pix.impl.flow.automatico.screens.details.a(nVar3, pixAutomaticoPaymentDetailsScreenContract$InputData, fVarD4, aVarC2, aVar, aVarZ2, bVar, bVarA);
            case 5:
                d0 d0Var4 = (d0) this.f234022b;
                int i21 = this.f234023c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new y9a.s();
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar4 = (cli.n) ((x) this.d).f234117a.get();
                zja.a aVarA2 = ((ika.b) d0Var4.f233929a).a();
                vc.s.j(aVarA2);
                s8a.f fVarD5 = d0Var4.e.d();
                vc.s.j(fVarD5);
                return new y9a.r(nVar4, aVarA2, fVarD5);
            case 6:
                c cVar4 = ((d0) this.f234022b).e;
                int i22 = this.f234023c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new daa.n();
                    }
                    throw new AssertionError(i22);
                }
                s8a.l lVarE = cVar4.e();
                i8a.e eVar = (i8a.e) cVar4.C.get();
                vc.s.j(eVar);
                tca.f fVar = (tca.f) cVar4.D.get();
                vc.s.j(fVar);
                return new daa.m(lVarE, eVar, fVar, (cli.n) ((z) this.d).f234128a.get());
            case 7:
                h0 h0Var = (h0) this.d;
                d0 d0Var5 = (d0) this.f234022b;
                l70.e eVar2 = d0Var5.f233933h;
                int i32 = this.f234023c;
                if (i32 == 0) {
                    PixQrCodeChangeAmountScreenContract$InputData pixQrCodeChangeAmountScreenContract$InputData = h0Var.f233977a;
                    cli.n nVar5 = (cli.n) h0Var.e.get();
                    w80.b bVarJ = eVar2.j();
                    vc.s.j(bVarJ);
                    hVar = new sba.h(pixQrCodeChangeAmountScreenContract$InputData, nVar5, bVarJ);
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            if (i32 != 3) {
                                throw new AssertionError(i32);
                            }
                            ldd.a factory2 = new ldd.a();
                            tba.b.Companion.getClass();
                            Intrinsics.checkNotNullParameter(factory2, "factory");
                            return new ldd.b();
                        }
                        ppf.a factory3 = d0Var5.f233943w.b();
                        vc.s.j(factory3);
                        ldd.b delegate = (ldd.b) h0Var.f233979c.get();
                        tba.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(delegate, "delegate");
                        return ppf.a.a(delegate);
                    }
                    w80.b bVarJ2 = eVar2.j();
                    vc.s.j(bVarJ2);
                    hVar = new sba.g(new u80.o(), bVarJ2, (yof.d) h0Var.d.get());
                }
                return hVar;
            case 8:
                j0 j0Var = (j0) this.d;
                d0 d0Var6 = (d0) this.f234022b;
                npf.a aVar2 = d0Var6.f233943w;
                l70.e eVar3 = d0Var6.f233933h;
                int i33 = this.f234023c;
                if (i33 == 0) {
                    PixQrCodeTransactionAmountScreenContract$InputData pixQrCodeTransactionAmountScreenContract$InputData = j0Var.f233994a;
                    wsg.n nVarB2 = d0Var6.f233937n.b();
                    w80.b bVarJ3 = eVar3.j();
                    vc.s.j(bVarJ3);
                    zof.f fVarD6 = aVar2.d();
                    vc.s.j(fVarD6);
                    return new qba.n(pixQrCodeTransactionAmountScreenContract$InputData, nVarB2, bVarJ3, fVarD6, (cli.n) j0Var.e.get());
                }
                if (i33 == 1) {
                    yof.d dVar = (yof.d) j0Var.d.get();
                    u80.o oVar = new u80.o();
                    w80.b bVarJ4 = eVar3.j();
                    vc.s.j(bVarJ4);
                    vo9.a aVarB3 = ((ut9.a) d0Var6.f233945y).b();
                    vc.s.j(aVarB3);
                    l80.e eVarH = eVar3.h();
                    vc.s.j(eVarH);
                    return new qba.m(dVar, oVar, bVarJ4, aVarB3, eVarH);
                }
                if (i33 != 2) {
                    if (i33 != 3) {
                        throw new AssertionError(i33);
                    }
                    ldd.a factory4 = new ldd.a();
                    rba.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return new ldd.b();
                }
                ppf.a factory5 = aVar2.b();
                vc.s.j(factory5);
                ldd.b delegate2 = (ldd.b) j0Var.f233996c.get();
                rba.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(delegate2, "delegate");
                return ppf.a.a(delegate2);
            case 9:
                int i43 = this.f234023c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new com.revolut.feature.pix.impl.flow.qr_code_transaction.a(((k0) this.d).f234004a);
                    }
                    throw new AssertionError(i43);
                }
                r10.f factory6 = ((d0) this.f234022b).f233944x.a();
                lba.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return factory6.d();
            case 10:
                d0 d0Var7 = (d0) this.f234022b;
                c cVar5 = d0Var7.e;
                l0 l0Var = (l0) this.d;
                int i59 = this.f234023c;
                if (i59 == 0) {
                    return kxa.j.k((j60.a) l0Var.e.get());
                }
                if (i59 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) l0Var.f234015c.get(), (rp0.m) l0Var.d.get());
                }
                if (i59 == 2) {
                    return new rp0.m();
                }
                if (i59 != 3) {
                    if (i59 != 4) {
                        throw new AssertionError(i59);
                    }
                    i8a.c cVar6 = (i8a.c) cVar5.B.get();
                    vc.s.j(cVar6);
                    return new wba.y(cVar6);
                }
                wba.i iVar = l0Var.f234013a;
                s8a.l lVarE2 = cVar5.e();
                zof.f fVarD7 = d0Var7.f233943w.d();
                vc.s.j(fVarD7);
                wj0.a aVarI = ((nj0.d) d0Var7.f233939q).i();
                vc.s.j(aVarI);
                d0 d0Var8 = l0Var.f234014b;
                sf0.h hVarB = d0Var8.z.b();
                vc.s.j(hVarB);
                v60.e eVarA = d0Var8.A.a();
                vc.s.j(eVarA);
                return new wba.e0(iVar, lVarE2, fVarD7, aVarI, new wba.v(hVarB, eVarA, new com.revolut.feature.pix.impl.domain.error.a()), (cli.n) l0Var.f234016g.get());
            case 11:
                m0 m0Var = (m0) this.d;
                d0 d0Var9 = (d0) this.f234022b;
                l70.e eVar4 = d0Var9.f233933h;
                int i66 = this.f234023c;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new AssertionError(i66);
                    }
                    w80.b bVarJ5 = eVar4.j();
                    vc.s.j(bVarJ5);
                    return new zba.k(new u80.o(), bVarJ5);
                }
                cli.n nVar6 = (cli.n) m0Var.f234026c.get();
                PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData = m0Var.f234024a;
                w80.b bVarJ6 = eVar4.j();
                vc.s.j(bVarJ6);
                return new zba.i(nVar6, pixQrRequestAddAmountScreenContract$InputData, bVarJ6, d0Var9.f233937n.b());
            case 12:
                p0 p0Var = (p0) this.d;
                d0 d0Var10 = (d0) this.f234022b;
                l70.e eVar5 = d0Var10.f233933h;
                int i74 = this.f234023c;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new AssertionError(i74);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) p0Var.f234053c.get();
                    eca.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    yy0.f fVarQ = jh.d.f(controller.m2()).Q();
                    vc.s.k(fVarQ);
                    return fVarQ;
                }
                dca.t tVar2 = new dca.t((j8a.a) p0Var.f234052b.E.get());
                MutableStateFlow mutableStateFlow2 = p0Var.f234051a;
                s8a.l lVarE3 = d0Var10.e.e();
                c70.a aVarZ3 = eVar5.z();
                vc.s.j(aVarZ3);
                tqi.g gVarE2 = d0Var10.i.e();
                yy0.f fVar2 = (yy0.f) p0Var.d.get();
                Context context = d0Var10.u;
                zk0.b bVarL = eVar5.l();
                vc.s.j(bVarL);
                l80.e eVarH2 = eVar5.h();
                vc.s.j(eVarH2);
                return new dca.r(tVar2, mutableStateFlow2, lVarE3, aVarZ3, gVarE2, fVar2, context, bVarL, eVarH2);
            case 13:
                q0 q0Var = (q0) this.d;
                d0 d0Var11 = (d0) this.f234022b;
                l70.e eVar6 = d0Var11.f233933h;
                int i92 = this.f234023c;
                if (i92 == 0) {
                    wsg.n nVarB3 = d0Var11.f233937n.b();
                    w80.b bVarJ7 = eVar6.j();
                    vc.s.j(bVarJ7);
                    t70.g gVarO = eVar6.o();
                    vc.s.j(gVarO);
                    return new gca.m(nVarB3, bVarJ7, gVarO, q0Var.f234060a, (cli.n) q0Var.e.get());
                }
                if (i92 == 1) {
                    yof.d dVar2 = (yof.d) q0Var.d.get();
                    u80.o oVar2 = new u80.o();
                    w80.b bVarJ8 = eVar6.j();
                    vc.s.j(bVarJ8);
                    return new gca.j(dVar2, oVar2, bVarJ8, (ldd.b) q0Var.f234062c.get());
                }
                if (i92 != 2) {
                    if (i92 != 3) {
                        throw new AssertionError(i92);
                    }
                    ldd.a factory7 = new ldd.a();
                    hca.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory7, "factory");
                    return new ldd.b();
                }
                ppf.a factory8 = d0Var11.f233943w.b();
                vc.s.j(factory8);
                ldd.b delegate3 = (ldd.b) q0Var.f234062c.get();
                hca.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory8, "factory");
                Intrinsics.checkNotNullParameter(delegate3, "delegate");
                return ppf.a.a(delegate3);
            case 14:
                d0 d0Var12 = (d0) this.f234022b;
                s0 s0Var = (s0) this.d;
                int i96 = this.f234023c;
                if (i96 == 0) {
                    return kxa.j.k((j60.a) s0Var.d.get());
                }
                if (i96 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) s0Var.f234082b.get(), (rp0.m) s0Var.f234083c.get());
                }
                if (i96 == 2) {
                    return new rp0.m();
                }
                if (i96 != 3) {
                    if (i96 == 4) {
                        return new ica.k();
                    }
                    throw new AssertionError(i96);
                }
                PixRefundReviewScreenContract$InputData pixRefundReviewScreenContract$InputData = s0Var.f234081a;
                wj0.a aVarI2 = ((nj0.d) d0Var12.f233939q).i();
                vc.s.j(aVarI2);
                f8a.a aVarB4 = d0Var12.e.b();
                vc.s.j(aVarB4);
                zof.f fVarD8 = d0Var12.f233943w.d();
                vc.s.j(fVarD8);
                return new ica.n(pixRefundReviewScreenContract$InputData, aVarI2, aVarB4, fVarD8, (cli.n) s0Var.f.get());
            case 15:
                d0 d0Var13 = (d0) this.f234022b;
                c cVar7 = d0Var13.e;
                t0 t0Var = (t0) this.d;
                d0 d0Var14 = t0Var.f234088a;
                int i99 = this.f234023c;
                if (i99 == 0) {
                    return kxa.j.k((j60.a) t0Var.d.get());
                }
                if (i99 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) t0Var.f234089b.get(), (rp0.m) t0Var.f234090c.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 != 3) {
                    if (i99 == 4) {
                        return new bba.u(((b3j.p) d0Var13.o).i(), d0Var13.v.a());
                    }
                    throw new AssertionError(i99);
                }
                cli.n nVar7 = (cli.n) t0Var.f.get();
                xx9.p pVarB = d0Var14.f233936m.b();
                vc.s.j(pVarB);
                ogm.i iVar2 = new ogm.i(pVarB);
                f8a.c cVar8 = (f8a.c) cVar7.F.get();
                vc.s.j(cVar8);
                s8a.l lVarE4 = cVar7.e();
                tca.f fVar3 = (tca.f) cVar7.D.get();
                vc.s.j(fVar3);
                yca.o oVar3 = new yca.o();
                i8a.a aVar3 = (i8a.a) d0Var14.e.G.get();
                vc.s.j(aVar3);
                bba.n nVar8 = new bba.n(oVar3, aVar3);
                i8a.e eVar7 = (i8a.e) cVar7.C.get();
                vc.s.j(eVar7);
                return new bba.s(nVar7, iVar2, cVar8, lVarE4, fVar3, nVar8, eVar7, (j60.a) t0Var.d.get());
            case 16:
                d0 d0Var15 = (d0) this.f234022b;
                c cVar9 = d0Var15.e;
                u0 u0Var = (u0) this.d;
                d0 d0Var16 = u0Var.f234097b;
                int i100 = this.f234023c;
                if (i100 == 0) {
                    lca.f extension2 = (lca.f) u0Var.e.get();
                    oca.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    vc.s.k(extension2);
                    return extension2;
                }
                if (i100 == 1) {
                    lx1.d dVarB = ((ey1.e) d0Var15.k).b();
                    vc.s.j(dVarB);
                    i8a.a aVar4 = (i8a.a) cVar9.G.get();
                    vc.s.j(aVar4);
                    j8a.b bVar2 = (j8a.b) cVar9.L.get();
                    vc.s.j(bVar2);
                    return new lca.l(dVarB, aVar4, bVar2);
                }
                if (i100 != 2) {
                    if (i100 != 3) {
                        throw new AssertionError(i100);
                    }
                    m provider = u0Var.d;
                    oca.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    return new oca.a(provider);
                }
                PixTransferNavigation$InputData pixTransferNavigation$InputData = u0Var.f234096a;
                gte.a aVarB5 = d0Var15.f.b();
                vc.s.j(aVarB5);
                kz9.a aVarA3 = d0Var15.f233931c.a();
                vc.s.j(aVarA3);
                x2k.e eVar8 = new x2k.e();
                hy1.c0 c0Var = (hy1.c0) ((ey1.e) d0Var16.k).O.get();
                vc.s.j(c0Var);
                fl3.a aVarE = d0Var16.B.e();
                vc.s.j(aVarE);
                lca.a factory9 = (lca.a) u0Var.f234099g.get();
                oca.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Object obj2 = ((oca.a) factory9).f224169a.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                pca.d dVar3 = new pca.d(new pca.b(c0Var, aVarE, (lca.f) obj2));
                lca.f fVar4 = (lca.f) u0Var.e.get();
                c cVar10 = d0Var16.e;
                s8a.l lVarE5 = cVar10.e();
                tca.f fVar5 = (tca.f) cVar10.D.get();
                vc.s.j(fVar5);
                hp.g gVarA = d0Var16.v.a();
                gte.a aVarB6 = d0Var16.f.b();
                vc.s.j(aVarB6);
                return new com.revolut.feature.pix.impl.flow.transfer.a(pixTransferNavigation$InputData, aVarB5, aVarA3, eVar8, dVar3, fVar4, new tca.e(lVarE5, fVar5, gVarA, aVarB6));
            case 17:
                d0 d0Var17 = (d0) this.f234022b;
                c cVar11 = d0Var17.e;
                v0 v0Var = (v0) this.d;
                int i101 = this.f234023c;
                if (i101 == 0) {
                    return kxa.j.k((j60.a) v0Var.e.get());
                }
                if (i101 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) v0Var.f234105c.get(), (rp0.m) v0Var.d.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 != 3) {
                    throw new AssertionError(i101);
                }
                yca.w wVar2 = new yca.w(v0Var.f234104b.v.a());
                PixTransferInputKeyScreenContract$InputData pixTransferInputKeyScreenContract$InputData = v0Var.f234103a;
                j60.a aVar5 = (j60.a) v0Var.e.get();
                yca.o oVar4 = new yca.o();
                i8a.a aVar6 = (i8a.a) cVar11.G.get();
                vc.s.j(aVar6);
                hp.g gVarA2 = d0Var17.v.a();
                f8a.c cVar12 = (f8a.c) cVar11.F.get();
                vc.s.j(cVar12);
                return new yca.t(wVar2, pixTransferInputKeyScreenContract$InputData, aVar5, oVar4, aVar6, gVarA2, cVar12, new x2k.e());
            case 18:
                w0 w0Var = (w0) this.d;
                d0 d0Var18 = w0Var.f234113a;
                int i102 = this.f234023c;
                if (i102 == 0) {
                    return kxa.j.k((j60.a) w0Var.e.get());
                }
                if (i102 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) w0Var.f234115c.get(), (rp0.m) w0Var.d.get());
                }
                if (i102 == 2) {
                    return new rp0.m();
                }
                if (i102 != 3) {
                    throw new AssertionError(i102);
                }
                dba.k kVar = new dba.k(((b3j.p) d0Var18.o).i());
                s8a.n nVar9 = (s8a.n) ((d0) this.f234022b).e.J.get();
                vc.s.j(nVar9);
                d3a.b bVarA2 = ((s3a.k) d0Var18.f233938p).a();
                vc.s.j(bVarA2);
                xx9.p pVarB2 = d0Var18.f233936m.b();
                vc.s.j(pVarB2);
                s8a.n nVar10 = (s8a.n) d0Var18.e.J.get();
                vc.s.j(nVar10);
                return new dba.i(kVar, nVar9, new jpc.e(bVarA2, pVarB2, nVar10), (j60.a) w0Var.e.get(), new fba.a(((b3j.p) d0Var18.o).i()));
            case 19:
                d0 d0Var19 = (d0) this.f234022b;
                nj0.a aVar7 = d0Var19.f233939q;
                c cVar13 = d0Var19.e;
                z0 z0Var = (z0) this.d;
                int i103 = this.f234023c;
                switch (i103) {
                    case 0:
                        return kxa.j.k((j60.a) z0Var.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) z0Var.f234131b.get(), (rp0.m) z0Var.f234132c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        z8a.a controller2 = (z8a.a) z0Var.f234133g.get();
                        haa.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        vc.s.k(controller2);
                        return controller2;
                    case 4:
                        s8a.c cVarA = cVar13.a();
                        vc.s.j(cVarA);
                        t8a.a aVar8 = (t8a.a) z0Var.f.get();
                        d9a.c cVar14 = new d9a.c();
                        wj0.a aVarI3 = ((nj0.d) aVar7).i();
                        vc.s.j(aVarI3);
                        return new z8a.d(cVarA, aVar8, cVar14, aVarI3);
                    case 5:
                        c70.a aVarZ4 = d0Var19.f233933h.z();
                        vc.s.j(aVarZ4);
                        return new t8a.b(aVarZ4, d0Var19.i.e());
                    case 6:
                        ReviewMigrateAliasScreenContract$InputData reviewMigrateAliasScreenContract$InputData = z0Var.f234130a;
                        j60.a aVar9 = (j60.a) z0Var.d.get();
                        gaa.d dVar4 = new gaa.d();
                        s8a.c cVarA2 = cVar13.a();
                        vc.s.j(cVarA2);
                        z8a.a aVar10 = (z8a.a) z0Var.f234133g.get();
                        wj0.a aVarI4 = ((nj0.d) aVar7).i();
                        vc.s.j(aVarI4);
                        return new gaa.j(reviewMigrateAliasScreenContract$InputData, aVar9, dVar4, cVarA2, aVar10, aVarI4);
                    default:
                        throw new AssertionError(i103);
                }
            case 20:
                d0 d0Var20 = (d0) this.f234022b;
                a1 a1Var = (a1) this.d;
                int i104 = this.f234023c;
                if (i104 == 0) {
                    return kxa.j.k((j60.a) a1Var.e.get());
                }
                if (i104 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) a1Var.f233892c.get(), (rp0.m) a1Var.d.get());
                }
                if (i104 == 2) {
                    return new rp0.m();
                }
                if (i104 != 3) {
                    throw new AssertionError(i104);
                }
                ReviewPortabilityInfoScreenContract$InputData reviewPortabilityInfoScreenContract$InputData = a1Var.f233890a;
                j60.a aVar11 = (j60.a) a1Var.e.get();
                hba.h hVar2 = new hba.h((j8a.a) a1Var.f233891b.E.get());
                s8a.c cVarA3 = d0Var20.e.a();
                vc.s.j(cVarA3);
                wj0.a aVarI5 = ((nj0.d) d0Var20.f233939q).i();
                vc.s.j(aVarI5);
                return new hba.l(reviewPortabilityInfoScreenContract$InputData, aVar11, hVar2, cVarA3, aVarI5);
            case 21:
                d0 d0Var21 = (d0) this.f234022b;
                c cVar15 = d0Var21.e;
                c1 c1Var = (c1) this.d;
                int i105 = this.f234023c;
                switch (i105) {
                    case 0:
                        return kxa.j.k((j60.a) c1Var.f233923c.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) c1Var.f233921a.get(), (rp0.m) c1Var.f233922b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        z8a.a controller3 = (z8a.a) c1Var.f.get();
                        g9a.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        vc.s.k(controller3);
                        return controller3;
                    case 4:
                        s8a.c cVarA4 = cVar15.a();
                        vc.s.j(cVarA4);
                        t8a.a aVar12 = (t8a.a) c1Var.e.get();
                        d9a.c cVar16 = new d9a.c();
                        wj0.a aVarI6 = ((nj0.d) d0Var21.f233939q).i();
                        vc.s.j(aVarI6);
                        return new z8a.d(cVarA4, aVar12, cVar16, aVarI6);
                    case 5:
                        c70.a aVarZ5 = d0Var21.f233933h.z();
                        vc.s.j(aVarZ5);
                        return new t8a.b(aVarZ5, d0Var21.i.e());
                    case 6:
                        f9a.l lVar = new f9a.l();
                        j60.a aVar13 = (j60.a) c1Var.f233923c.get();
                        z8a.a aVar14 = (z8a.a) c1Var.f.get();
                        s8a.c cVarA5 = cVar15.a();
                        vc.s.j(cVarA5);
                        return new f9a.k(lVar, aVar13, aVar14, cVarA5);
                    default:
                        throw new AssertionError(i105);
                }
            case 22:
                e1 e1Var = (e1) this.d;
                d0 d0Var22 = (d0) this.f234022b;
                l70.e eVar9 = d0Var22.f233933h;
                int i106 = this.f234023c;
                if (i106 == 0) {
                    cli.n nVar11 = (cli.n) e1Var.d.get();
                    w80.b bVarJ9 = eVar9.j();
                    vc.s.j(bVarJ9);
                    return new r9a.k(nVar11, bVarJ9, e1Var.f233955b, d0Var22.e.c());
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                w80.b bVarJ10 = eVar9.j();
                vc.s.j(bVarJ10);
                return new r9a.m(new u80.o(), bVarJ10);
            case 23:
                e1 e1Var2 = (e1) this.d;
                d0 d0Var23 = (d0) this.f234022b;
                l70.e eVar10 = d0Var23.f233933h;
                int i107 = this.f234023c;
                if (i107 == 0) {
                    cli.n nVar12 = (cli.n) e1Var2.d.get();
                    w80.b bVarJ11 = eVar10.j();
                    vc.s.j(bVarJ11);
                    return new r9a.k(nVar12, bVarJ11, e1Var2.f233955b, d0Var23.e.c());
                }
                if (i107 != 1) {
                    throw new AssertionError(i107);
                }
                w80.b bVarJ12 = eVar10.j();
                vc.s.j(bVarJ12);
                return new r9a.m(new u80.o(), bVarJ12);
            case 24:
                j1 j1Var = (j1) this.d;
                int i108 = this.f234023c;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new mba.g();
                    }
                    throw new AssertionError(i108);
                }
                PixQrCodeAdditionalInformationScreenContract$InputData pixQrCodeAdditionalInformationScreenContract$InputData = j1Var.f233998b;
                c70.a aVarZ6 = ((d0) this.f234022b).f233933h.z();
                vc.s.j(aVarZ6);
                return new mba.i(pixQrCodeAdditionalInformationScreenContract$InputData, aVarZ6, (cli.n) j1Var.f233999c.get());
            case 25:
                j1 j1Var2 = (j1) this.d;
                int i109 = this.f234023c;
                if (i109 != 0) {
                    if (i109 == 1) {
                        return new mba.g();
                    }
                    throw new AssertionError(i109);
                }
                PixQrCodeAdditionalInformationScreenContract$InputData pixQrCodeAdditionalInformationScreenContract$InputData2 = j1Var2.f233998b;
                c70.a aVarZ7 = ((d0) this.f234022b).f233933h.z();
                vc.s.j(aVarZ7);
                return new mba.i(pixQrCodeAdditionalInformationScreenContract$InputData2, aVarZ7, (cli.n) j1Var2.f233999c.get());
            case 26:
                pa6.a aVar15 = (pa6.a) this.d;
                pa6.m mVar = (pa6.m) this.f234022b;
                int i110 = this.f234023c;
                if (i110 == 0) {
                    return new rb6.m((aa6.c) mVar.T.get(), (aa6.a) mVar.U.get(), (jki.p) aVar15.f234345b.get(), aVar15.f234344a);
                }
                if (i110 == 1) {
                    return new rb6.n();
                }
                throw new AssertionError(i110);
            case 27:
                pa6.m mVar2 = (pa6.m) this.f234022b;
                zxb.k0 k0Var = mVar2.f234398q;
                int i111 = this.f234023c;
                if (i111 != 0) {
                    if (i111 == 1) {
                        return new com.revolut.feature.donations.impl.ui.kompot.flow.overview.c();
                    }
                    throw new AssertionError(i111);
                }
                nyb.i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                nb6.q qVar2 = new nb6.q();
                a31.a aVarA4 = mVar2.f234384a.a();
                zja.a aVarA5 = ((ika.b) mVar2.u).a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.donations.impl.ui.kompot.flow.overview.b(i0VarF, kVarC, qVar2, aVarA4, aVarA5, (cli.n) ((pa6.b) this.d).f234350c.get());
            case 28:
                return a();
            default:
                pa6.m mVar3 = (pa6.m) this.f234022b;
                int i112 = this.f234023c;
                if (i112 != 0) {
                    if (i112 == 1) {
                        return new com.revolut.feature.donations.impl.ui.kompot.flow.recurring.a(((pa6.e) this.d).f234361a);
                    }
                    throw new AssertionError(i112);
                }
                wj0.a idempotencyKeyHolder = ((nj0.d) mVar3.f234386b).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = mVar3.i.h();
                vc.s.j(dateProvider);
                pb6.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
        }
    }
}
