package afj;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.apm.bills.bpay.impl.data.network.bills.BPayBillService;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenKompotBridgeContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.network.EsimInstructionsService;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4424c;

    public /* synthetic */ r2(Object obj2, int i, int i2) {
        this.f4422a = i2;
        this.f4424c = obj2;
        this.f4423b = i;
    }

    @Override // phm.a
    public final Object get() {
        dfj.b1 b1Var;
        switch (this.f4422a) {
            case 0:
                v1 v1Var = (v1) this.f4424c;
                int i = this.f4423b;
                if (i == 0) {
                    return new tjj.i((cli.n) v1Var.f4495c.get());
                }
                if (i == 1) {
                    return new tjj.k(v1Var.f4494b, new ugc.a(b.b()));
                }
                throw new AssertionError(i);
            case 1:
                v1 v1Var2 = (v1) this.f4424c;
                int i2 = this.f4423b;
                if (i2 == 0) {
                    return new tjj.i((cli.n) v1Var2.f4495c.get());
                }
                if (i2 == 1) {
                    return new tjj.k(v1Var2.f4494b, new ugc.a(b.b()));
                }
                throw new AssertionError(i2);
            case 2:
                v1 v1Var3 = (v1) this.f4424c;
                int i3 = this.f4423b;
                if (i3 == 0) {
                    return new tjj.i((cli.n) v1Var3.f4495c.get());
                }
                if (i3 == 1) {
                    return new tjj.k(v1Var3.f4494b, new ugc.a(b.b()));
                }
                throw new AssertionError(i3);
            case 3:
                b2 b2Var = (b2) this.f4424c;
                int i5 = this.f4423b;
                if (i5 == 0) {
                    return new akj.e((cli.n) b2Var.f4177c.get());
                }
                if (i5 == 1) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.b(b2Var.f4176b);
                }
                throw new AssertionError(i5);
            case 4:
                l2 l2Var = (l2) this.f4424c;
                EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData = l2Var.f4331b;
                int i6 = this.f4423b;
                if (i6 == 0) {
                    return new jmj.b((cli.n) l2Var.f4332c.get(), esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData);
                }
                if (i6 == 1) {
                    return new jmj.c(esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData);
                }
                throw new AssertionError(i6);
            case 5:
                int i21 = this.f4423b;
                if (i21 == 0) {
                    return new nmj.c((cli.n) ((n2) this.f4424c).f4361b.get());
                }
                if (i21 == 1) {
                    return new nmj.d();
                }
                throw new AssertionError(i21);
            case 6:
                t2 t2Var = (t2) this.f4424c;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData = t2Var.f4454b;
                int i22 = this.f4423b;
                if (i22 == 0) {
                    return new glj.g((cli.n) t2Var.f4455c.get(), esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData);
                }
                if (i22 == 1) {
                    return new glj.i(esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData);
                }
                throw new AssertionError(i22);
            case 7:
                t2 t2Var2 = (t2) this.f4424c;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData2 = t2Var2.f4454b;
                int i32 = this.f4423b;
                if (i32 == 0) {
                    return new glj.g((cli.n) t2Var2.f4455c.get(), esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData2);
                }
                if (i32 == 1) {
                    return new glj.i(esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData2);
                }
                throw new AssertionError(i32);
            case 8:
                z2 z2Var = (z2) this.f4424c;
                int i33 = this.f4423b;
                if (i33 == 0) {
                    return new vlj.e((cli.n) z2Var.f4557c.get());
                }
                if (i33 == 1) {
                    return new vlj.f(z2Var.f4556b, new ugc.a(b.b()));
                }
                throw new AssertionError(i33);
            case 9:
                z2 z2Var2 = (z2) this.f4424c;
                int i43 = this.f4423b;
                if (i43 == 0) {
                    return new vlj.e((cli.n) z2Var2.f4557c.get());
                }
                if (i43 == 1) {
                    return new vlj.f(z2Var2.f4556b, new ugc.a(b.b()));
                }
                throw new AssertionError(i43);
            case 10:
                z2 z2Var3 = (z2) this.f4424c;
                int i59 = this.f4423b;
                if (i59 == 0) {
                    return new vlj.e((cli.n) z2Var3.f4557c.get());
                }
                if (i59 == 1) {
                    return new vlj.f(z2Var3.f4556b, new ugc.a(b.b()));
                }
                throw new AssertionError(i59);
            case 11:
                b3 b3Var = (b3) this.f4424c;
                int i66 = this.f4423b;
                if (i66 == 0) {
                    return new smj.b(b3Var.f4179b, (cli.n) b3Var.d.get());
                }
                if (i66 == 1) {
                    return new smj.d(new umj.a((gej.a) b3Var.f4180c.K.get()));
                }
                throw new AssertionError(i66);
            case 12:
                b3 b3Var2 = (b3) this.f4424c;
                int i74 = this.f4423b;
                if (i74 == 0) {
                    return new smj.b(b3Var2.f4179b, (cli.n) b3Var2.d.get());
                }
                if (i74 == 1) {
                    return new smj.d(new umj.a((gej.a) b3Var2.f4180c.K.get()));
                }
                throw new AssertionError(i74);
            case 13:
                d3 d3Var = (d3) this.f4424c;
                int i92 = this.f4423b;
                if (i92 == 0) {
                    return new dnj.g((cli.n) d3Var.f4211c.get());
                }
                if (i92 == 1) {
                    return new dnj.j(d3Var.f4210b);
                }
                throw new AssertionError(i92);
            case 14:
                f3 f3Var = (f3) this.f4424c;
                int i96 = this.f4423b;
                if (i96 == 0) {
                    return new hnj.g((cli.n) f3Var.f4247c.get());
                }
                if (i96 == 1) {
                    return new hnj.j(f3Var.f4246b, new vnj.a());
                }
                throw new AssertionError(i96);
            case 15:
                h3 h3Var = (h3) this.f4424c;
                int i99 = this.f4423b;
                if (i99 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.b((cli.n) h3Var.f4277c.get(), h3Var.f4276b);
                }
                if (i99 == 1) {
                    return new fnj.i();
                }
                throw new AssertionError(i99);
            case 16:
                f3 f3Var2 = (f3) this.f4424c;
                int i100 = this.f4423b;
                if (i100 == 0) {
                    return new hnj.g((cli.n) f3Var2.f4247c.get());
                }
                if (i100 == 1) {
                    return new hnj.j(f3Var2.f4246b, new vnj.a());
                }
                throw new AssertionError(i100);
            case 17:
                h3 h3Var2 = (h3) this.f4424c;
                int i101 = this.f4423b;
                if (i101 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.b((cli.n) h3Var2.f4277c.get(), h3Var2.f4276b);
                }
                if (i101 == 1) {
                    return new fnj.i();
                }
                throw new AssertionError(i101);
            case 18:
                d3 d3Var2 = (d3) this.f4424c;
                int i102 = this.f4423b;
                if (i102 == 0) {
                    return new dnj.g((cli.n) d3Var2.f4211c.get());
                }
                if (i102 == 1) {
                    return new dnj.j(d3Var2.f4210b);
                }
                throw new AssertionError(i102);
            case 19:
                f3 f3Var3 = (f3) this.f4424c;
                int i103 = this.f4423b;
                if (i103 == 0) {
                    return new hnj.g((cli.n) f3Var3.f4247c.get());
                }
                if (i103 == 1) {
                    return new hnj.j(f3Var3.f4246b, new vnj.a());
                }
                throw new AssertionError(i103);
            case 20:
                h3 h3Var3 = (h3) this.f4424c;
                int i104 = this.f4423b;
                if (i104 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.b((cli.n) h3Var3.f4277c.get(), h3Var3.f4276b);
                }
                if (i104 == 1) {
                    return new fnj.i();
                }
                throw new AssertionError(i104);
            case 21:
                s3 s3Var = (s3) this.f4424c;
                ee0.a aVar = s3Var.f4441b;
                int i105 = this.f4423b;
                if (i105 == 0) {
                    Retrofit retrofit = ((nj0.d) s3Var.f4440a).f();
                    w3.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                    Object objCreate = retrofit.create(EsimInstructionsService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    EsimInstructionsService esimInstructionsService = (EsimInstructionsService) objCreate;
                    vc.s.k(esimInstructionsService);
                    return esimInstructionsService;
                }
                if (i105 == 1) {
                    w3.Companion.getClass();
                    return new ne0.d();
                }
                if (i105 != 2) {
                    throw new AssertionError(i105);
                }
                je0.d mapper = aVar.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = s3Var.f4442c.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                vc.s.j(storageFactory);
                w3.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "esim_instructions", mapper, 0, null, 56);
            case 22:
                t3 t3Var = (t3) this.f4424c;
                ila.b bVar = t3Var.f4457b;
                nej.a aVar2 = t3Var.f4458c;
                ite.a aVar3 = t3Var.f4456a;
                int i106 = this.f4423b;
                if (i106 == 0) {
                    cej.a aVar4 = (cej.a) t3Var.d.get();
                    oej.a aVarA = aVar2.a();
                    vc.s.j(aVarA);
                    b1Var = new dfj.b1(aVar4, aVarA);
                } else {
                    if (i106 == 1) {
                        gte.a aVarB = aVar3.b();
                        vc.s.j(aVarB);
                        return new efj.c(aVarB, bVar.a());
                    }
                    if (i106 == 2) {
                        cej.c cVar = (cej.c) t3Var.f.get();
                        oej.a aVarA2 = aVar2.a();
                        vc.s.j(aVarA2);
                        b1Var = new dfj.b1(cVar, aVarA2);
                    } else {
                        if (i106 == 3) {
                            gte.a aVarB2 = aVar3.b();
                            vc.s.j(aVarB2);
                            return new efj.e(aVarB2);
                        }
                        if (i106 != 4) {
                            if (i106 != 5) {
                                throw new AssertionError(i106);
                            }
                            gte.a aVarB3 = aVar3.b();
                            vc.s.j(aVarB3);
                            return new efj.d(aVarB3, bVar.a());
                        }
                        cej.b bVar2 = (cej.b) t3Var.f4460h.get();
                        oej.a aVarA3 = aVar2.a();
                        vc.s.j(aVarA3);
                        b1Var = new dfj.b1(bVar2, aVarA3);
                    }
                }
                return b1Var;
            case 23:
                ai3.c cVar2 = (ai3.c) this.f4424c;
                jk3.c cVar3 = cVar2.f5176m;
                ta9.m mVar = cVar2.i;
                efk.a aVar5 = cVar2.f5171c;
                fy2.d dVar = cVar2.f5170b;
                bi3.d dVar2 = cVar2.f5169a;
                nt8.a aVar6 = cVar2.f5172g;
                int i107 = this.f4423b;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new AssertionError(i107);
                    }
                    onh.b bVarB = cVar2.d.b();
                    li0.b bVarC = t2d.c.c(cVar2.e.f271230a);
                    cVar2.f.getClass();
                    f73.c cVar4 = new f73.c();
                    mt8.a aVarA4 = aVar6.a();
                    vc.s.j(aVarA4);
                    up3.a aVar7 = (up3.a) cVar2.f5173h.N.get();
                    vc.s.j(aVar7);
                    return new vh3.c(bVarB, bVarC, cVar4, aVarA4, aVar7);
                }
                sh3.a aVarA5 = dVar2.a();
                vc.s.j(aVarA5);
                hy2.f fVarA = dVar.a();
                ffk.t tVarF = aVar5.f();
                vc.s.j(tVarF);
                ph3.b bVar3 = (ph3.b) cVar2.f5178p.get();
                u89.a aVarB4 = mVar.b();
                vc.s.j(aVarB4);
                q89.e eVarA = mVar.a();
                vc.s.j(eVarA);
                bd3.a aVarA6 = cVar2.f5174j.a();
                vc.s.j(aVarA6);
                xoj.a aVarA7 = cVar2.k.a();
                vc.s.j(aVarA7);
                gte.a aVarB5 = cVar2.f5175l.b();
                vc.s.j(aVarB5);
                fk3.a aVarA8 = cVar3.a();
                vc.s.j(aVarA8);
                fk3.a aVarA9 = cVar3.a();
                vc.s.j(aVarA9);
                zh3.e eVar = new zh3.e(aVarA9, cVar2.f5177n.g());
                z43.a aVarA10 = cVar2.o.a();
                vc.s.j(aVarA10);
                mt8.d dVarB = aVar6.b();
                vc.s.j(dVarB);
                sh3.a aVarA11 = dVar2.a();
                vc.s.j(aVarA11);
                ffk.t tVarF2 = aVar5.f();
                vc.s.j(tVarF2);
                return new ai3.b(aVarA5, fVarA, tVarF, bVar3, aVarB4, eVarA, aVarA6, aVarA7, aVarB5, aVarA8, eVar, aVarA10, dVarB, new di3.k(aVarA11, tVarF2, new di3.x()), dVar.d());
            case 24:
                aj3.j jVar = (aj3.j) this.f4424c;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar.f5394b;
                int i108 = this.f4423b;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar.f5395c);
                    }
                    throw new AssertionError(i108);
                }
                ChooserScreenKompotBridgeContract$InputData inputData = ((aj3.h) jVar.f).f5387a;
                aj3.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                ChooserConfiguration chooserConfiguration = inputData.f65925a;
                vc.s.k(chooserConfiguration);
                return new y7a.f0(ImmutableMap.of("ChooserBridgePickerInteractor", new aj3.f(chooserConfiguration)), pickerScreenContract$InputData, (jki.p) jVar.d.get());
            case 25:
                ak5.e eVar2 = (ak5.e) this.f4424c;
                int i109 = this.f4423b;
                if (i109 == 0) {
                    return new tk5.g((cli.n) eVar2.f5679b.get(), eVar2.f5678a);
                }
                if (i109 == 1) {
                    return new tk5.i();
                }
                throw new AssertionError(i109);
            case 26:
                int i110 = this.f4423b;
                if (i110 == 0) {
                    anb.f fVar = (anb.f) this.f4424c;
                    return new fpb.f(fVar.f6635a, (cli.n) fVar.f6636b.get());
                }
                if (i110 == 1) {
                    return new fpb.e();
                }
                throw new AssertionError(i110);
            case 27:
                ao1.d dVar3 = (ao1.d) this.f4424c;
                int i111 = this.f4423b;
                if (i111 == 0) {
                    return new zn1.a();
                }
                if (i111 != 1) {
                    if (i111 == 2) {
                        return new xn1.e((BPayBillService) dVar3.f7880r.get());
                    }
                    throw new AssertionError(i111);
                }
                BPayBillService bPayBillService = (BPayBillService) a0.d.f((nj0.d) dVar3.f7871c, "retrofit", BPayBillService.class, "create(...)");
                vc.s.k(bPayBillService);
                return bPayBillService;
            case 28:
                ap3.g gVar = (ap3.g) this.f4424c;
                int i112 = this.f4423b;
                if (i112 == 0) {
                    return kxa.j.l((j60.a) gVar.d.get());
                }
                if (i112 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) gVar.f8083b.get(), (rp0.m) gVar.f8084c.get());
                }
                if (i112 == 2) {
                    return new rp0.m();
                }
                if (i112 == 3) {
                    return new ip3.l((jki.p) gVar.f8085g.get(), gVar.f8082a, (j60.a) gVar.d.get(), (ip3.f) gVar.f8086h.get());
                }
                if (i112 == 4) {
                    return new ip3.m();
                }
                throw new AssertionError(i112);
            default:
                aq1.a aVar8 = (aq1.a) this.f4424c;
                aq1.b bVar4 = aVar8.f8230b;
                int i113 = this.f4423b;
                if (i113 == 0) {
                    Object extension = (jq1.a) aVar8.f8231c.get();
                    dq1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i113 == 1) {
                    wo1.b bVarB2 = ((up1.e) bVar4.f8232a).b();
                    vc.s.j(bVarB2);
                    return new jq1.e(new zjh.j(bVarB2), new yp1.b(), new yp1.a());
                }
                if (i113 != 2) {
                    throw new AssertionError(i113);
                }
                wo1.b bVarB3 = ((up1.e) bVar4.f8232a).b();
                vc.s.j(bVarB3);
                zjh.j jVar2 = new zjh.j(bVarB3);
                jq1.a aVar9 = (jq1.a) aVar8.f8231c.get();
                gq1.b formItemMapper = new gq1.b();
                Intrinsics.checkNotNullParameter(formItemMapper, "formItemMapper");
                return new hq1.g(jVar2, aVar9, new hq1.h(), aVar8.f8229a);
        }
    }
}
