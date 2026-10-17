package mjl;

import akl.o0;
import android.view.View;
import b9.w2;
import bnh.a0;
import bnh.c0;
import bnh.e0;
import bnh.i0;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreenContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import com.revolut.feature.transactions.impl.data.network.WarrantService;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import com.revolut.feature.wealth.impl.data.network.recurring_buy_hub_collection.RecurringBuyHubCollectionService;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashHoldingsSelectorFlowFactory;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreen;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.youTransactor.uCube.rpc.Constants;
import ekf.c1;
import ekf.m0;
import elf.b2;
import elf.j2;
import elf.n1;
import elf.s1;
import elf.t0;
import elf.u0;
import elf.v1;
import elf.w0;
import elf.w1;
import elf.x;
import elf.y;
import et6.l3;
import imh.u;
import ip0.v7;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import joh.w;
import kkf.a2;
import kkf.a3;
import kkf.a5;
import kkf.a8;
import kkf.b5;
import kkf.c6;
import kkf.d1;
import kkf.d2;
import kkf.d3;
import kkf.e5;
import kkf.e7;
import kkf.e8;
import kkf.f9;
import kkf.h2;
import kkf.h6;
import kkf.i1;
import kkf.i5;
import kkf.i7;
import kkf.i9;
import kkf.j0;
import kkf.j5;
import kkf.j8;
import kkf.k1;
import kkf.k7;
import kkf.k9;
import kkf.l8;
import kkf.m2;
import kkf.m6;
import kkf.n4;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.o6;
import kkf.o8;
import kkf.p5;
import kkf.p7;
import kkf.q4;
import kkf.s7;
import kkf.s8;
import kkf.t2;
import kkf.t5;
import kkf.u1;
import kkf.u3;
import kkf.v2;
import kkf.v3;
import kkf.x2;
import kkf.x4;
import kkf.y5;
import kkf.y6;
import kkf.z3;
import kkf.z4;
import kl.b0;
import kl.t1;
import klf.b1;
import klf.b3;
import klf.f1;
import klf.f2;
import klf.h0;
import klf.m1;
import klf.r1;
import klf.s0;
import klf.y0;
import klf.z0;
import klf.z2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kyk.v;
import lbc.d0;
import lkf.l0;
import m8b.r;
import mkh.s;
import net.sf.scuba.smartcards.ISO7816;
import om4.n0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.LDSFile;
import pkf.a1;
import pkf.e1;
import pkf.e2;
import pkf.f0;
import pkf.h1;
import pkf.j1;
import pkf.k2;
import pkf.n2;
import pkf.p1;
import pkf.q0;
import pkf.q2;
import pkf.y1;
import pnh.g0;
import qgk.k3;
import r10.t;
import rp0.g1;
import rp0.p0;
import rp0.x0;
import sgm.e3;
import t80.e;
import vtc.k0;
import xif.z;
import xkf.c2;
import xkf.r0;
import xkf.v0;
import xkf.z1;
import z0h.q1;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f206069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206070c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f206068a = i2;
        this.f206069b = obj2;
        this.d = obj3;
        this.f206070c = i;
    }

    private final Object a() {
        s sVar = (s) this.f206069b;
        mkh.o oVar = (mkh.o) this.d;
        int i = this.f206070c;
        switch (i) {
            case 0:
                vmh.b extensions = (vmh.b) oVar.u.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f290581a;
            case 1:
                s sVar2 = oVar.f206381t;
                p2b.i iVarA = sVar2.X.a();
                aoh.a aVarJ = oVar.j();
                x8h.m mVarG = sVar2.d.g();
                vmh.p pVar = new vmh.p();
                nd.n factory = new nd.n(iVarA, aVarJ, mVarG, pVar);
                vmh.a delegates = oVar.f206358a;
                vmh.c input = oVar.f206360b;
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                vmh.k kVar = new vmh.k(input, iVarA, aVarJ, mVarG, pVar);
                return new vmh.b(new vmh.h(delegates, kVar), kVar);
            case 2:
                return f0k.d.f(sVar.Y.a(), oVar.f206362c, (e5d.a) oVar.f206386x.get());
            case 3:
                a5h.g gVarA = sVar.Y.a();
                ek1.a aVar = (ek1.a) oVar.f206381t.Z.f115441m.get();
                vc.s.j(aVar);
                return f0k.d.c(gVarA, new jmh.c(aVar, (vmh.d) oVar.f206384w.get()));
            case 4:
                vmh.b extensions2 = (vmh.b) oVar.u.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f290582b;
            case 5:
                gnh.d extensions3 = (gnh.d) oVar.z.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f144993a;
            case 6:
                cc7.l controllerModelExtension = new cc7.l(new lnh.d(), new onh.b(oVar.f206381t.d.I()), new t(new fnh.a(), new fnh.c()), new mnh.d(), new nnh.a(), new by5.a(new lnh.d()), new g9h.c());
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                by5.a factory2 = new by5.a(14);
                gnh.c delegates2 = oVar.d;
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegates2, "delegates");
                Intrinsics.checkNotNullParameter(delegates2, "delegates");
                return new gnh.d(new gnh.s(delegates2, controllerModelExtension), controllerModelExtension);
            case 7:
                lmh.b extensions4 = (lmh.b) oVar.B.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f197075a;
            case 8:
                cnh.f controllerModelExtension2 = oVar.b();
                Intrinsics.checkNotNullParameter(controllerModelExtension2, "controllerModelExtension");
                r39.a factory3 = new r39.a();
                lmh.a delegates3 = oVar.e;
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegates3, "delegates");
                Intrinsics.checkNotNullParameter(delegates3, "delegates");
                return new lmh.b(new lmh.k(delegates3, controllerModelExtension2), controllerModelExtension2);
            case 9:
                mmh.b extensions5 = (mmh.b) oVar.D.get();
                Intrinsics.checkNotNullParameter(extensions5, "extensions");
                return extensions5.f207221a;
            case 10:
                oVar.getClass();
                mmh.j controllerModelExtension3 = new mmh.j();
                Intrinsics.checkNotNullParameter(controllerModelExtension3, "controllerModelExtension");
                dcl.q factory4 = new dcl.q();
                mmh.a delegates4 = oVar.f;
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(delegates4, "delegates");
                Intrinsics.checkNotNullParameter(delegates4, "delegates");
                return new mmh.b(new mmh.i(controllerModelExtension3, delegates4), controllerModelExtension3);
            case 11:
                omh.b extension = (omh.b) oVar.F.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                return extension.f226847a;
            case 12:
                oVar.getClass();
                omh.f controllerModelExtension4 = new omh.f();
                Intrinsics.checkNotNullParameter(controllerModelExtension4, "controllerModelExtension");
                nd.n factory5 = new nd.n(4);
                omh.a delegates5 = oVar.f206365g;
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(delegates5, "delegates");
                Intrinsics.checkNotNullParameter(delegates5, "delegates");
                return new omh.b(new omh.e(controllerModelExtension4, delegates5), controllerModelExtension4);
            case 13:
                pmh.b extensions6 = (pmh.b) oVar.H.get();
                Intrinsics.checkNotNullParameter(extensions6, "extensions");
                return extensions6.f237569a;
            case 14:
                oVar.getClass();
                pmh.l controllerModelExtension5 = new pmh.l(new pmh.n());
                Intrinsics.checkNotNullParameter(controllerModelExtension5, "controllerModelExtension");
                nd.l factory6 = new nd.l();
                pmh.a delegates6 = oVar.f206366h;
                Intrinsics.checkNotNullParameter(factory6, "factory");
                Intrinsics.checkNotNullParameter(delegates6, "delegates");
                Intrinsics.checkNotNullParameter(delegates6, "delegates");
                return new pmh.b(new pmh.k(controllerModelExtension5, delegates6), controllerModelExtension5);
            case 15:
                aeh.d extensions7 = (aeh.d) oVar.J.get();
                Intrinsics.checkNotNullParameter(extensions7, "extensions");
                return extensions7.f3586a;
            case 16:
                r10.f factory7 = sVar.f206403b0.a();
                aeh.c delegates7 = oVar.i;
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(delegates7, "delegates");
                eeh.c controllerModelExtension6 = new eeh.c();
                Intrinsics.checkNotNullParameter(delegates7, "delegates");
                Intrinsics.checkNotNullParameter(controllerModelExtension6, "controllerModelExtension");
                return new aeh.d(new eeh.b(delegates7, controllerModelExtension6), controllerModelExtension6);
            case 17:
                rmh.d extensions8 = (rmh.d) oVar.L.get();
                Intrinsics.checkNotNullParameter(extensions8, "extensions");
                return extensions8.f255324a;
            case 18:
                oVar.getClass();
                rmh.b controllerModelExtension7 = new rmh.b();
                Intrinsics.checkNotNullParameter(controllerModelExtension7, "controllerModelExtension");
                nd.m factory8 = new nd.m(9);
                rmh.c delegates8 = oVar.f206368j;
                Intrinsics.checkNotNullParameter(factory8, "factory");
                Intrinsics.checkNotNullParameter(delegates8, "delegates");
                Intrinsics.checkNotNullParameter(delegates8, "delegates");
                return new rmh.d(new aah.g(delegates8, controllerModelExtension7), controllerModelExtension7);
            case 19:
                inh.b extensions9 = (inh.b) oVar.R.get();
                Intrinsics.checkNotNullParameter(extensions9, "extensions");
                return extensions9.f162940a;
            case 20:
                inh.h controllerModelExtension8 = new inh.h((h8b.h) oVar.Q.get());
                Intrinsics.checkNotNullParameter(controllerModelExtension8, "controllerModelExtension");
                r39.a factory9 = new r39.a();
                inh.a delegates9 = oVar.k;
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Intrinsics.checkNotNullParameter(delegates9, "delegates");
                Intrinsics.checkNotNullParameter(delegates9, "delegates");
                return new inh.b(new aah.g(delegates9, controllerModelExtension8), controllerModelExtension8);
            case 21:
                s sVar3 = oVar.f206381t;
                s sVar4 = oVar.f206381t;
                yhl.d dVarA = sVar3.c0.a();
                vc.s.j(dVarA);
                ybl.b bVarB = sVar4.f206413j.b();
                vc.s.j(bVarB);
                fkg.a aVar2 = new fkg.a(bVarB);
                l80.e eVarH = sVar3.I.h();
                vc.s.j(eVarH);
                h8b.k kVar2 = new h8b.k(aVar2, eVarH, dVarA);
                j60.a aVar3 = (j60.a) oVar.P.get();
                j8b.a aVar4 = new j8b.a();
                jx0.a aVar5 = new jx0.a(new t1(oVar.c()), new r(oVar.c()), new m8b.q());
                ybl.d dVarH = sVar4.f206413j.h();
                vc.s.j(dVarH);
                ybl.k kVarD = sVar4.f.d();
                vc.s.j(kVarD);
                l80.e eVarH2 = sVar4.I.h();
                vc.s.j(eVarH2);
                h8b.c cVar = new h8b.c(aVar4, aVar5, dVarH, kVarD, eVarH2);
                h8b.a aVar6 = new h8b.a();
                f80.a aVarX = sVar.I.x();
                vc.s.j(aVarX);
                l70.e eVar = sVar4.I;
                l80.e eVarH3 = eVar.h();
                vc.s.j(eVarH3);
                j8b.f fVar = new j8b.f();
                l80.e eVarH4 = eVar.h();
                vc.s.j(eVarH4);
                return new i8b.b(kVar2, aVar3, cVar, aVar6, aVarX, new j8b.h(eVarH3, fVar, new j8b.e(eVarH4), new j8b.d(), new j8b.c()));
            case 22:
                return ehe.n.s((com.revolut.kompot.navigable.a) oVar.N.get(), (rp0.m) oVar.O.get());
            case 23:
                return new rp0.m();
            case 24:
                qmh.e extension2 = (qmh.e) oVar.T.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return extension2.f247845a;
            case 25:
                oVar.getClass();
                qmh.j controllerModelExtension9 = new qmh.j();
                Intrinsics.checkNotNullParameter(controllerModelExtension9, "controllerModelExtension");
                nd.p factory10 = new nd.p();
                qmh.d delegates10 = oVar.f206370l;
                Intrinsics.checkNotNullParameter(factory10, "factory");
                Intrinsics.checkNotNullParameter(delegates10, "delegates");
                Intrinsics.checkNotNullParameter(delegates10, "delegates");
                return new qmh.e(new aah.g(controllerModelExtension9, delegates10), controllerModelExtension9);
            case 26:
                return kxa.j.k((j60.a) oVar.P.get());
            case 27:
                return a10.b.f((u8h.b) sVar.i, "factory");
            case 28:
                anh.b extensions10 = (anh.b) oVar.Y.get();
                Intrinsics.checkNotNullParameter(extensions10, "extensions");
                return extensions10.f7781a;
            case 29:
                anh.o recommendedBuysWidgetExtensionModel = new anh.o((oih.j) oVar.f206381t.y0.get(), new g9h.c());
                Intrinsics.checkNotNullParameter(recommendedBuysWidgetExtensionModel, "recommendedBuysWidgetExtensionModel");
                dcl.q factory11 = new dcl.q();
                anh.a delegates11 = oVar.f206371m;
                Intrinsics.checkNotNullParameter(factory11, "factory");
                Intrinsics.checkNotNullParameter(delegates11, "delegates");
                Intrinsics.checkNotNullParameter(delegates11, "delegates");
                return new anh.b(new anh.m(delegates11, recommendedBuysWidgetExtensionModel), recommendedBuysWidgetExtensionModel);
            case 30:
                bnh.p extensions11 = (bnh.p) oVar.f206361b0.get();
                Intrinsics.checkNotNullParameter(extensions11, "extensions");
                return extensions11.f17208a;
            case 31:
                clc.b bVarA = oVar.f206381t.D.a();
                vc.s.j(bVarA);
                c0 controllerModelExtension10 = new c0(bVarA, (vmh.d) oVar.f206359a0.get());
                Intrinsics.checkNotNullParameter(controllerModelExtension10, "controllerModelExtension");
                dcl.q factory12 = new dcl.q();
                bnh.o delegates12 = oVar.f206372n;
                Intrinsics.checkNotNullParameter(factory12, "factory");
                Intrinsics.checkNotNullParameter(delegates12, "delegates");
                Intrinsics.checkNotNullParameter(delegates12, "delegates");
                return new bnh.p(new a0(controllerModelExtension10, delegates12), controllerModelExtension10);
            case 32:
                vmh.d extension3 = (vmh.d) oVar.f206384w.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 33:
                wmh.b extension4 = (wmh.b) oVar.f206363d0.get();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                return extension4.f298667a;
            case 34:
                oVar.getClass();
                wmh.f controllerWidgetExtensionModel = new wmh.f();
                Intrinsics.checkNotNullParameter(controllerWidgetExtensionModel, "controllerWidgetExtensionModel");
                nd.k factory13 = new nd.k(19);
                wmh.a delegates13 = oVar.o;
                Intrinsics.checkNotNullParameter(factory13, "factory");
                Intrinsics.checkNotNullParameter(delegates13, "delegates");
                Intrinsics.checkNotNullParameter(delegates13, "delegates");
                return new wmh.b(new vzh.d(delegates13, controllerWidgetExtensionModel), controllerWidgetExtensionModel);
            case 35:
                ymh.b extensions12 = (ymh.b) oVar.f0.get();
                Intrinsics.checkNotNullParameter(extensions12, "extensions");
                return extensions12.f314995a;
            case 36:
                s sVar5 = oVar.f206381t;
                ymh.g privateBankBannerExtensionModel = new ymh.g(sVar5.z.a(), new wxk.c(((v) sVar5.A).k.f()));
                Intrinsics.checkNotNullParameter(privateBankBannerExtensionModel, "privateBankBannerExtensionModel");
                nd.p factory14 = new nd.p();
                ymh.a delegates14 = oVar.f206375p;
                Intrinsics.checkNotNullParameter(factory14, "factory");
                Intrinsics.checkNotNullParameter(delegates14, "delegates");
                Intrinsics.checkNotNullParameter(delegates14, "delegates");
                return new ymh.b(new ymh.e(delegates14, privateBankBannerExtensionModel), privateBankBannerExtensionModel);
            case 37:
                return n57.a.t((o5d.c) oVar.f206367h0.get());
            case 38:
                return n57.a.w(sVar.k.a(), oVar.f206376q);
            case 39:
                cnh.g extensions13 = (cnh.g) oVar.f206369k0.get();
                dnh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions13, "extensions");
                return extensions13.f25429a;
            case 40:
                cnh.e factory15 = (cnh.e) oVar.j0.get();
                cnh.h view = oVar.f206377r;
                dnh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory15, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                factory15.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                cnh.f fVar2 = factory15.f25424a;
                return new cnh.g(new cnh.d(fVar2, factory15.f25425b, view), fVar2);
            case 41:
                ybl.b bVarB2 = oVar.f206381t.f206413j.b();
                vc.s.j(bVarB2);
                return new cnh.e(new cnh.f(bVarB2), new cnh.a());
            case 42:
                vmh.d extension5 = (vmh.d) oVar.f206384w.get();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 43:
                gnh.d extensions14 = (gnh.d) oVar.z.get();
                Intrinsics.checkNotNullParameter(extensions14, "extensions");
                return extensions14.f144994b;
            case 44:
                lmh.b extensions15 = (lmh.b) oVar.B.get();
                Intrinsics.checkNotNullParameter(extensions15, "extensions");
                return extensions15.f197076b;
            case 45:
                mmh.b extensions16 = (mmh.b) oVar.D.get();
                Intrinsics.checkNotNullParameter(extensions16, "extensions");
                return extensions16.f207222b;
            case 46:
                emh.e extension6 = (emh.e) oVar.q0.get();
                fmh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                vc.s.k(extension6);
                return extension6;
            case 47:
                return new emh.e();
            case 48:
                omh.b extension7 = (omh.b) oVar.F.get();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                return extension7.f226848b;
            case 49:
                pmh.b extensions17 = (pmh.b) oVar.H.get();
                Intrinsics.checkNotNullParameter(extensions17, "extensions");
                return extensions17.f237570b;
            case 50:
                aeh.d extensions18 = (aeh.d) oVar.J.get();
                Intrinsics.checkNotNullParameter(extensions18, "extensions");
                return extensions18.f3587b;
            case 51:
                rmh.d extensions19 = (rmh.d) oVar.L.get();
                Intrinsics.checkNotNullParameter(extensions19, "extensions");
                return extensions19.f255325b;
            case 52:
                inh.b extensions20 = (inh.b) oVar.R.get();
                Intrinsics.checkNotNullParameter(extensions20, "extensions");
                return extensions20.f162941b;
            case 53:
                qmh.e extension8 = (qmh.e) oVar.T.get();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                return extension8.f247846b;
            case 54:
                anh.b extensions21 = (anh.b) oVar.Y.get();
                Intrinsics.checkNotNullParameter(extensions21, "extensions");
                return extensions21.f7782b;
            case 55:
                bnh.p extensions22 = (bnh.p) oVar.f206361b0.get();
                Intrinsics.checkNotNullParameter(extensions22, "extensions");
                return extensions22.f17209b;
            case 56:
                dlc.h extension9 = (dlc.h) oVar.A0.get();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                vc.s.k(extension9);
                return extension9;
            case 57:
                dmc.r rVar = sVar.f206433y;
                h9h.a aVar7 = rVar.f116028b;
                tzg.m wealthAccountsInteractor = aVar7.t();
                vc.s.j(wealthAccountsInteractor);
                ybl.l tradingConfigInteractor = aVar7.f();
                gte.a featureToggleInteractor = rVar.d.b();
                vc.s.j(featureToggleInteractor);
                zja.a productArticleInteractor = ((ika.b) rVar.k).a();
                vc.s.j(productArticleInteractor);
                Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
                qy5.a factory16 = new qy5.a(25);
                Intrinsics.checkNotNullParameter(factory16, "factory");
                return new llc.f(wealthAccountsInteractor, tradingConfigInteractor, featureToggleInteractor, productArticleInteractor);
            case 58:
                wmh.b extension10 = (wmh.b) oVar.f206363d0.get();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                return extension10.f298668b;
            case 59:
                ymh.b extensions23 = (ymh.b) oVar.f0.get();
                Intrinsics.checkNotNullParameter(extensions23, "extensions");
                return extensions23.f314996b;
            case 60:
                return n57.a.v((o5d.c) oVar.f206367h0.get());
            case 61:
                return n57.a.g((o5d.c) oVar.f206367h0.get());
            case 62:
                cnh.g extensions24 = (cnh.g) oVar.f206369k0.get();
                dnh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions24, "extensions");
                return extensions24.f25430b;
            case 63:
                oVar.getClass();
                s sVar6 = oVar.f206381t;
                vmh.m productUIResourceMapper = new vmh.m();
                Intrinsics.checkNotNullParameter(productUIResourceMapper, "productUIResourceMapper");
                vmh.n nVar = new vmh.n();
                h9h.a aVar8 = sVar6.d;
                jbh.e eVarC = aVar8.C();
                klh.c cVarB = sVar6.b();
                jbh.e eVarC2 = aVar8.C();
                w wVar = (w) sVar6.f206401a0;
                hph.k kVarI = wVar.i();
                th7.b bVar = (th7.b) sVar6.f206407d0;
                h9h.a aVar9 = bVar.d;
                gnh.m mVar = new gnh.m(eVarC, new gnh.k(cVarB, eVarC2, kVarI, new oi7.a(new adh.a(), aVar9.C()), new mi7.a(aVar9.C()), bVar.c(), new ni7.a(aVar9.C())), new hnh.a());
                u uVar = new u();
                imh.w wVar2 = new imh.w();
                imh.s sVar7 = new imh.s();
                ogm.i iVar = new ogm.i(new rmh.q(new rmh.o(wVar.a(), new hph.a())));
                lmh.o oVar2 = new lmh.o(wVar.i());
                b0 b0Var = new b0((emh.d) oVar.I0.get());
                omh.g gVar = new omh.g(sVar6.b());
                nbh.a instrumentImageProvider = new nbh.a();
                Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                dsd.i iVar2 = new dsd.i(mVar, uVar, wVar2, sVar7, iVar, oVar2, b0Var, gVar, new pmh.q(), (aeh.e) oVar.J0.get(), new inh.i(), new qmh.a(), new anh.p(bVar.c()), new e0(new bnh.c((qjh.b) sVar6.G0.get())), new wmh.g(), new ymh.h());
                q1 q1Var = (q1) oVar.H0.get();
                gte.a aVarB = sVar6.f206400a.b();
                vc.s.j(aVarB);
                bof.r rVar2 = new bof.r(nVar, iVar2, new tmh.d(q1Var, aVarB), new imh.q(), new imh.o(), new t5d.d());
                vmh.d dVar = (vmh.d) oVar.f206384w.get();
                gte.a aVarB2 = sVar6.f206400a.b();
                vc.s.j(aVarB2);
                zmh.c cVar2 = new zmh.c(aVarB2);
                whl.f fVar3 = sVar6.f206422r;
                h9h.a aVar10 = sVar6.d;
                yhl.g gVar2 = (yhl.g) fVar3.u.get();
                vc.s.j(gVar2);
                vfg.p pVar2 = new vfg.p(gVar2);
                kye.e eVar2 = new kye.e(aVar10.l(), new lnh.b());
                jpc.e eVar3 = new jpc.e(aVar10.r(), aVar10.D(), new adh.a());
                r10.q qVar = new r10.q(new fnh.a(), new fnh.c(), ((th7.b) sVar6.f206407d0).b());
                mnh.c cVar3 = new mnh.c(aVar10.o());
                ugl.c cVarD = sVar6.f206422r.d();
                vc.s.j(cVarD);
                kgm.c cVar4 = new kgm.c(new jx0.a(cVarD, sVar6.d.D()));
                su9.c cVarE = fVar3.e();
                ugl.c cVarD2 = sVar6.f206422r.d();
                vc.s.j(cVarD2);
                w2 w2Var = new w2(eVar2, eVar3, qVar, cVar3, cVar4, new a61.a(cVarE, new jx0.a(cVarD2, sVar6.d.D())));
                gnh.b bVar2 = new gnh.b();
                tzg.m mVarT = aVar10.t();
                vc.s.j(mVarT);
                utk.f fVar4 = new utk.f(pVar2, w2Var, bVar2, mVarT);
                cnh.f fVarB = oVar.b();
                ybl.b bVarB3 = sVar6.f206413j.b();
                vc.s.j(bVarB3);
                mmh.n nVar2 = new mmh.n(bVarB3, sVar6.d.g());
                nih.a aVar11 = (nih.a) sVar6.u0.get();
                gte.a aVarB3 = sVar6.f206400a.b();
                vc.s.j(aVarB3);
                kgm.i iVar3 = new kgm.i(aVar11, aVarB3);
                ybl.b bVarB4 = sVar6.f206413j.b();
                vc.s.j(bVarB4);
                pmh.u uVar2 = new pmh.u(bVarB4);
                aeh.g gVar3 = (aeh.g) oVar.K0.get();
                whl.f fVar5 = sVar6.f206422r;
                vnh.b bVar3 = sVar6.f206401a0;
                ugl.c cVarD3 = fVar5.d();
                vc.s.j(cVarD3);
                ooh.d dVar2 = new ooh.d();
                x8h.m mVarG2 = sVar6.d.g();
                ybl.b bVarB5 = ((w) bVar3).f177069c.b();
                vc.s.j(bVarB5);
                rmh.m mVar2 = new rmh.m(cVarD3, dVar2, mVarG2, new toh.c(bVarB5, 0));
                qmh.c cVar5 = new qmh.c(sVar6.d.b());
                l80.e eVarH5 = sVar6.I.h();
                vc.s.j(eVarH5);
                yhl.d dVarA2 = sVar6.c0.a();
                vc.s.j(dVarA2);
                ybl.b bVarB6 = sVar6.f206413j.b();
                vc.s.j(bVarB6);
                inh.k kVar3 = new inh.k(new fkg.a(bVarB6), eVarH5, dVarA2);
                tmh.g gVar4 = new tmh.g(oVar.j(), (aah.h) oVar.X.get());
                r10.q qVar2 = new r10.q(new fnh.a(), new fnh.c(), ((th7.b) sVar6.f206407d0).b());
                ybl.k kVarD2 = sVar6.f.d();
                vc.s.j(kVarD2);
                anh.s sVar8 = new anh.s(qVar2, kVarD2, sVar6.d.f());
                tzg.m mVarT2 = sVar6.d.t();
                vc.s.j(mVarT2);
                bnh.n nVarI = sVar6.i();
                gte.a aVarB4 = sVar6.f206400a.b();
                vc.s.j(aVarB4);
                i0 i0Var = new i0(mVarT2, nVarI, aVarB4);
                zdl.c cVar6 = sVar6.f206413j;
                ybl.b bVarB7 = cVar6.b();
                vc.s.j(bVarB7);
                zjh.f fVarC = cVar6.c();
                gte.a aVarB5 = sVar6.f206400a.b();
                vc.s.j(aVarB5);
                df0.b bVarA2 = sVar6.f206409e0.a();
                vc.s.j(bVarA2);
                wmh.i iVar4 = new wmh.i(bVarB7, fVarC, aVarB5, bVarA2, new wmh.h());
                zdl.f fVar6 = sVar6.f;
                ybl.i iVarB = fVar6.b();
                vc.s.j(iVarB);
                Map mapA = fVar6.a();
                vc.s.j(mapA);
                return new com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a(rVar2, dVar, cVar2, fVar4, fVarB, nVar2, iVar3, uVar2, gVar3, mVar2, cVar5, kVar3, gVar4, sVar8, i0Var, iVar4, new ymh.i(mapA, iVarB), (dlc.h) oVar.A0.get(), (o5d.a) oVar.L0.get(), (e5d.a) oVar.f206386x.get());
            case 64:
                h9h.a aVar12 = sVar.d;
                return new emh.g(h9h.a.y(), (q1) oVar.H0.get());
            case 65:
                return a10.b.g((u8h.b) sVar.i, "factory");
            case 66:
                r10.f factory17 = sVar.f206403b0.a();
                Intrinsics.checkNotNullParameter(factory17, "factory");
                return new eeh.e((adh.c) factory17.c);
            case 67:
                r10.f factory18 = sVar.f206403b0.a();
                Intrinsics.checkNotNullParameter(factory18, "factory");
                return new eeh.f((ybl.b) factory18.b);
            case 68:
                return n57.a.u((o5d.c) oVar.f206367h0.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        mlf.d dVar = (mlf.d) this.f206069b;
        mlf.c cVar = (mlf.c) this.d;
        int i = this.f206070c;
        if (i == 0) {
            return new ymf.k(cVar.f206721a, (rnf.g) dVar.E1.get(), new bmf.b(), dVar.f206769w.d(), (cli.n) cVar.f206722b.get());
        }
        if (i == 1) {
            return new ymf.l();
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        int i = this.f206070c;
        int i2 = i / 100;
        if (i2 == 0) {
            return o();
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return p();
            }
            if (i2 == 3) {
                return q();
            }
            throw new AssertionError(i);
        }
        mlf.d dVar = (mlf.d) this.f206069b;
        mlf.e eVar = (mlf.e) this.d;
        switch (i) {
            case 100:
                return new okf.w((h0) eVar.E.get(), (s0) eVar.f206799e1.get(), (vlf.b) eVar.O0.get(), (l8) eVar.f206801f1.get());
            case 101:
                CoroutineScope coroutineScope = (CoroutineScope) eVar.B.get();
                h0 h0Var = (h0) eVar.E.get();
                whf.b bVarA = dVar.f206738h.a();
                vc.s.j(bVarA);
                return new s0(coroutineScope, h0Var, bVarA);
            case 102:
                return new l8((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), dVar.o.e());
            case 103:
                h0 h0Var2 = (h0) eVar.E.get();
                mre.c cVarB = dVar.Q.b();
                vc.s.j(cVarB);
                return new kkf.h0(h0Var2, cVarB);
            case 104:
                klf.p pVar = (klf.p) eVar.f206819k1.get();
                whf.n nVarB = dVar.f206738h.b();
                vc.s.j(nVarB);
                return new nkf.c(pVar, nVarB, (y) eVar.f206829n1.get());
            case 105:
                h0 h0Var3 = (h0) eVar.E.get();
                whf.b bVarA2 = dVar.f206738h.a();
                vc.s.j(bVarA2);
                return new klf.p(h0Var3, bVarA2);
            case 106:
                return new y();
            case 107:
                h0 h0Var4 = (h0) eVar.E.get();
                vlf.b bVar = (vlf.b) eVar.O0.get();
                thf.m mVarG = dVar.f206738h.g();
                vc.s.j(mVarG);
                return new nkf.f(h0Var4, bVar, mVarG);
            case LDSFile.EF_DG12_TAG /* 108 */:
                return new j0((h0) eVar.E.get(), eVar.W(), (rhf.d) eVar.i0.get());
            case LDSFile.EF_DG13_TAG /* 109 */:
                h0 h0Var5 = (h0) eVar.E.get();
                klf.i iVar = (klf.i) eVar.P0.get();
                m1 m1Var = (m1) eVar.T.get();
                gte.a aVarB = dVar.f206729c.b();
                vc.s.j(aVarB);
                return new a2(h0Var5, iVar, m1Var, aVarB);
            case LDSFile.EF_DG14_TAG /* 110 */:
                h0 h0Var6 = (h0) eVar.E.get();
                m1 m1Var2 = (m1) eVar.T.get();
                m35.e eVarM = dVar.G0.m();
                vc.s.j(eVarM);
                toa.a aVarA = dVar.H0.a();
                vc.s.j(aVarA);
                y45.h hVarG = dVar.G0.g();
                ar3.c cVar = (ar3.c) dVar.I0.O.get();
                vc.s.j(cVar);
                return new x4(h0Var6, m1Var2, eVarM, aVarA, hVarG, cVar);
            case LDSFile.EF_DG15_TAG /* 111 */:
                h0 h0Var7 = (h0) eVar.E.get();
                n8b.a aVarA2 = dVar.T.a();
                vc.s.j(aVarA2);
                return new u1(h0Var7, aVarA2, dVar.R());
            case 112:
                return new o2((h0) eVar.E.get(), (m1) eVar.T.get(), new ujf.a());
            case 113:
                return new m2((h0) eVar.E.get(), (m1) eVar.T.get());
            case 114:
                klf.o oVar = (klf.o) eVar.C1.get();
                y9l.a aVar = (y9l.a) eVar.K.get();
                h0 h0Var8 = (h0) eVar.E.get();
                m1 m1Var3 = (m1) eVar.T.get();
                z9l.f fVar = (z9l.f) ((vxc.b) dVar.S).f293055s.get();
                vc.s.j(fVar);
                ep6.n nVar = (ep6.n) eVar.P.get();
                bp6.b bVarC = dVar.U.c();
                vc.s.j(bVarC);
                use.d dVarB = dVar.J0.b();
                vc.s.j(dVarB);
                return new kkf.q(oVar, aVar, h0Var8, m1Var3, fVar, nVar, bVarC, dVarB);
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                CoroutineScope coroutineScope2 = (CoroutineScope) eVar.B.get();
                h0 h0Var9 = (h0) eVar.E.get();
                bal.a aVarB2 = ((vxc.b) dVar.S).b();
                vc.s.j(aVarB2);
                return new klf.o(coroutineScope2, h0Var9, aVarB2);
            case 116:
                h0 h0Var10 = (h0) eVar.E.get();
                m1 m1Var4 = (m1) eVar.T.get();
                fal.b bVar2 = (fal.b) dVar.K0.f193459j.get();
                vc.s.j(bVar2);
                return new s7(h0Var10, m1Var4, bVar2, dVar.K0.a(), new sof.a(), ((s41.a) dVar.L0).d(), (j60.a) eVar.f206850r.get());
            case LDSFile.EF_DG2_TAG /* 117 */:
                return new k9((b3) eVar.O1.get(), (m1) eVar.T.get(), new ynf.l(), ((s41.a) dVar.L0).d());
            case LDSFile.EF_DG4_TAG /* 118 */:
                return new b3((CoroutineScope) eVar.B.get(), (h0) eVar.E.get(), eVar.B1());
            case LDSFile.EF_SOD_TAG /* 119 */:
                return new z((WarrantService) eVar.L1.get(), (ne0.j) eVar.M1.get(), new hif.d());
            case SyslogConstants.LOG_CLOCK /* 120 */:
                return gmf.b.u(((nj0.d) dVar.M0).f());
            case 121:
                return new ne0.d();
            case 122:
                h0 h0Var11 = (h0) eVar.E.get();
                xh9.a aVarE = dVar.N0.e();
                vc.s.j(aVarE);
                gte.a aVarB3 = dVar.f206729c.b();
                vc.s.j(aVarB3);
                return new n4(h0Var11, aVarE, aVarB3, dVar.N0.g(), dVar.N0.i(), dVar.N0.f(), dVar.N0.h(), dVar.N0.c());
            case 123:
                h0 h0Var12 = (h0) eVar.E.get();
                m1 m1Var5 = (m1) eVar.T.get();
                xh9.a aVarE2 = dVar.N0.e();
                vc.s.j(aVarE2);
                return new wkf.d(h0Var12, m1Var5, aVarE2, dVar.N0.d());
            case 124:
                return new wkf.f((h0) eVar.E.get(), dVar.N0.j(), (j60.a) eVar.f206850r.get());
            case ISO781611.SMT_TAG /* 125 */:
                h0 h0Var13 = (h0) eVar.E.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC);
                nhf.a aVarA3 = dVar.A.a();
                vc.s.j(aVarA3);
                thf.g gVarE = dVar.f206738h.e();
                vc.s.j(gVarE);
                return new t2(aVarC, h0Var13, aVarA3, gVarE);
            case 126:
                h0 h0Var14 = (h0) eVar.E.get();
                m1 m1Var6 = (m1) eVar.T.get();
                d0 d0VarA = dVar.F0.a();
                gte.a aVarB4 = dVar.f206729c.b();
                vc.s.j(aVarB4);
                return new v3(h0Var14, m1Var6, d0VarA, aVarB4);
            case CertificateBody.profileType /* 127 */:
                h0 h0Var15 = (h0) eVar.E.get();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC2);
                l61.a aVarB5 = dVar.f206757r.b();
                vc.s.j(aVarB5);
                return new p5(h0Var15, aVarC2, aVarB5);
            case 128:
                h0 h0Var16 = (h0) eVar.E.get();
                vlf.b bVar3 = (vlf.b) eVar.O0.get();
                m1 m1Var7 = (m1) eVar.T.get();
                thf.m mVarG2 = dVar.f206738h.g();
                vc.s.j(mVarG2);
                l93.f fVarJ = dVar.f206772x0.j();
                vc.s.j(fVarJ);
                return new i5(h0Var16, bVar3, m1Var7, mVarG2, fVarJ, dVar.O0.c(), new bmf.b());
            case 129:
                h0 h0Var17 = (h0) eVar.E.get();
                gte.a aVarB6 = dVar.f206729c.b();
                vc.s.j(aVarB6);
                return new j5(h0Var17, aVarB6, dVar.P0.a());
            case 130:
                qu6.b bVarI = dVar.Q0.i();
                hr6.l lVarL = dVar.Q0.l();
                vc.s.j(lVarL);
                return new e5(bVarI, lVarL, (f1) eVar.Y1.get());
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                b9k.f fVarH = dVar.Q0.h();
                CoroutineScope coroutineScope3 = (CoroutineScope) eVar.B.get();
                h0 h0Var18 = (h0) eVar.E.get();
                l3 l3VarP = dVar.Q0.p();
                vc.s.j(l3VarP);
                return new f1(fVarH, coroutineScope3, h0Var18, l3VarP);
            case 132:
                return new v2((h0) eVar.E.get(), dVar.F.b());
            case 133:
                h0 h0Var19 = (h0) eVar.E.get();
                f1 f1Var = (f1) eVar.Y1.get();
                m1 m1Var8 = (m1) eVar.T.get();
                jr6.m mVarM = dVar.Q0.m();
                vc.s.j(mVarM);
                return new m6(h0Var19, f1Var, m1Var8, mVarM);
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                r1 r1Var = (r1) eVar.c2.get();
                m1 m1Var9 = (m1) eVar.T.get();
                glc.b bVar4 = (glc.b) dVar.R0.f116042x.get();
                vc.s.j(bVar4);
                return new c6(r1Var, m1Var9, bVar4, new bmf.b(), (vlf.b) eVar.O0.get());
            case 135:
                CoroutineScope coroutineScope4 = (CoroutineScope) eVar.B.get();
                h0 h0Var20 = (h0) eVar.E.get();
                glc.d dVarA = dVar.R0.a();
                vc.s.j(dVarA);
                return new r1(coroutineScope4, h0Var20, dVarA);
            case 136:
                h0 h0Var21 = (h0) eVar.E.get();
                u80.t tVarU = dVar.f206726b.u();
                vc.s.j(tVarU);
                qd0.b bVarN = dVar.f206726b.n();
                vc.s.j(bVarN);
                return new j1(h0Var21, tVarU, bVarN);
            case 137:
                h0 h0Var22 = (h0) eVar.E.get();
                vlf.b bVar5 = (vlf.b) eVar.O0.get();
                thf.m mVarG3 = dVar.f206738h.g();
                vc.s.j(mVarG3);
                kye.e eVar2 = new kye.e(eVar.d.f206736g.d());
                w0i.b bVarF = dVar.f206754p.f();
                l4i.a aVar2 = new l4i.a();
                ang.f fVarC = dVar.f206757r.c();
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC3);
                return new pkf.h(h0Var22, bVar5, mVarG3, eVar2, bVarF, aVar2, fVarC, aVarC3, (x) eVar.f206806g2.get());
            case 138:
                return new x((h0) eVar.E.get(), new kye.e(eVar.d.f206736g.d()), dVar.z.b(), (jof.e) eVar.f206802f2.get(), dVar.k.a(), eVar.t0(), eVar.B(), (j60.a) eVar.f206850r.get());
            case 139:
                wnf.b bVar6 = (wnf.b) eVar.N0.get();
                ffk.t tVarF = dVar.O.f();
                vc.s.j(tVarF);
                wsg.n nVarB2 = dVar.z.b();
                ang.f fVarC2 = dVar.f206757r.c();
                yik.h hVarB = ((k3) dVar.S0).b();
                u80.t tVarU2 = dVar.f206726b.u();
                vc.s.j(tVarU2);
                qd0.b bVarN2 = dVar.f206726b.n();
                vc.s.j(bVarN2);
                gte.a aVarB7 = dVar.f206729c.b();
                vc.s.j(aVarB7);
                return new jof.d(bVar6, tVarF, nVarB2, fVarC2, hVarB, tVarU2, bVarN2, aVarB7);
            case 140:
                return new pkf.k((h0) eVar.E.get(), new hof.b(), (w0) eVar.i2.get());
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                c9e.c cVarB2 = dVar.f206767v0.b();
                vc.s.j(cVarB2);
                return new w0(cVarB2);
            case 142:
                return new pkf.n((h0) eVar.E.get());
            case 143:
                return new pkf.q((h0) eVar.E.get(), new hof.e());
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return new pkf.v((h0) eVar.E.get(), dVar.f206756q.b(), eVar.z1());
            case 145:
                h0 h0Var23 = (h0) eVar.E.get();
                m1 m1Var10 = (m1) eVar.T.get();
                n0 n0Var = (n0) dVar.E.L.get();
                vc.s.j(n0Var);
                return new d1(h0Var23, m1Var10, n0Var, dVar.f206749n.d());
            case 146:
                return new k1((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), dVar.o.e());
            case 147:
                h0 h0Var24 = (h0) eVar.E.get();
                vlf.b bVar7 = (vlf.b) eVar.O0.get();
                bej.m mVar = (bej.m) dVar.T0.F0.get();
                vc.s.j(mVar);
                return new e8(h0Var24, bVar7, mVar, new rjf.f(), eVar.q0());
            case 148:
                h0 h0Var25 = (h0) eVar.E.get();
                zf3.a aVar3 = (zf3.a) ((yf3.c) dVar.U0).f313159h.get();
                vc.s.j(aVar3);
                return new dlf.b(h0Var25, aVar3);
            case 149:
                h0 h0Var26 = (h0) eVar.E.get();
                nhf.a aVarA4 = dVar.A.a();
                vc.s.j(aVarA4);
                com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC4);
                thf.g gVarE2 = dVar.f206738h.e();
                vc.s.j(gVarE2);
                return new z3(aVarC4, h0Var26, aVarA4, gVarE2);
            case 150:
                h0 h0Var27 = (h0) eVar.E.get();
                nhf.a aVarA5 = dVar.A.a();
                vc.s.j(aVarA5);
                com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC5);
                thf.g gVarE3 = dVar.f206738h.e();
                vc.s.j(gVarE3);
                return new h2(aVarC5, h0Var27, aVarA5, gVarE3);
            case ISO7816.TAG_SM_EXPECTED_LENGTH /* 151 */:
                return new a8((h0) eVar.E.get(), (m1) eVar.T.get(), dVar.G0.i());
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                h0 h0Var28 = (h0) eVar.E.get();
                mof.c cVarK1 = eVar.k1();
                com.revolut.domain.interactors.transactions.a aVarC6 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC6);
                return new zkf.n(h0Var28, cVarK1, aVarC6);
            case 153:
                h0 h0Var29 = (h0) eVar.E.get();
                m1 m1Var11 = (m1) eVar.T.get();
                thf.m mVarG4 = dVar.f206738h.g();
                vc.s.j(mVarG4);
                return new dlf.q(h0Var29, m1Var11, mVarG4, (vlf.b) eVar.O0.get(), eVar.c1(), new mjf.t(), new bmf.b(), ((s41.a) dVar.L0).d());
            case Constants.EMVTag.TAG_9A_TRANSACTION_DATE /* 154 */:
                return new y5((h0) eVar.E.get(), (bub.a) eVar.z.get(), dVar.f206771x.a(), (b1) eVar.Z0.get(), (b3) eVar.O1.get(), (m1) eVar.T.get());
            case 155:
                return new c2((h0) eVar.E.get());
            case Constants.EMVTag.TAG_9C_TRANSACTION_TYPE /* 156 */:
                h0 h0Var30 = (h0) eVar.E.get();
                m1 m1Var12 = (m1) eVar.T.get();
                kof.f fVar2 = (kof.f) dVar.F1.get();
                f2 f2Var = (f2) eVar.y2.get();
                dVar.F.a();
                return new vkf.j(h0Var30, m1Var12, fVar2, f2Var);
            case 157:
                return new f2((mkd.d) eVar.R.get(), (CoroutineScope) eVar.B.get());
            case ISO781611.SMT_DO_DS /* 158 */:
                return new lkf.e0((h0) eVar.E.get());
            case 159:
                h0 h0Var31 = (h0) eVar.E.get();
                z2 z2Var = (z2) eVar.V.get();
                m1 m1Var13 = (m1) eVar.T.get();
                c9e.c cVarB3 = dVar.f206767v0.b();
                vc.s.j(cVarB3);
                return new v0(h0Var31, z2Var, m1Var13, cVarB3, new r0(), eVar.Q0());
            case 160:
                return new clf.a((f2) eVar.y2.get(), (mkd.d) eVar.R.get(), (k71.i) eVar.C.get(), (m1) eVar.T.get());
            case 161:
                return new b5((h0) eVar.E.get(), new t1j.b((wnf.b) eVar.N0.get()), (rhf.d) eVar.i0.get());
            case 162:
                h0 h0Var32 = (h0) eVar.E.get();
                zxd.c cVarA = ((eyd.b) dVar.v).a();
                vc.s.j(cVarA);
                return new l0(h0Var32, cVarA);
            case Constants.TAG_ACE_LAYER_VERSION /* 163 */:
                return new h6((klf.c2) eVar.F2.get(), (m1) eVar.T.get(), dVar.V0.a());
            case Constants.TAG_GPI_VERSION /* 164 */:
                CoroutineScope coroutineScope5 = (CoroutineScope) eVar.B.get();
                h0 h0Var33 = (h0) eVar.E.get();
                k0 k0Var = dVar.V0;
                ufm.d dVarC = k0Var.c();
                l80.e eVarH = k0Var.e.h();
                vc.s.j(eVarH);
                return new klf.c2(coroutineScope5, h0Var33, new r10.r(dVarC, new xtc.a(eVarH), k0Var.d()));
            case Constants.TAG_EMVL3_VERSION /* 165 */:
                h0 h0Var34 = (h0) eVar.E.get();
                use.d dVarB2 = dVar.J0.b();
                vc.s.j(dVarB2);
                vlf.c cVar2 = new vlf.c();
                ose.e eVarC = dVar.J0.c();
                n8b.a aVarA6 = dVar.T.a();
                vc.s.j(aVarA6);
                return new j8(h0Var34, dVarB2, cVar2, eVarC, aVarA6);
            case Constants.TAG_PAYMENT_APP_CLESS_VERSION /* 166 */:
                h0 h0Var35 = (h0) eVar.E.get();
                fsf.b bVar8 = (fsf.b) dVar.W0.f218861b.get();
                vc.s.j(bVar8);
                csf.b bVarC2 = dVar.X0.c();
                vc.s.j(bVarC2);
                return new s8(h0Var35, bVar8, bVarC2);
            case 167:
                return new d2((h0) eVar.E.get());
            case 168:
                h0 h0Var36 = (h0) eVar.E.get();
                fbj.a aVarA7 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA7);
                return new p1(h0Var36, aVarA7, new pkf.q1(), dVar.Z0.a());
            case 169:
                eVar.getClass();
                h0 h0Var37 = (h0) eVar.E.get();
                fbj.a aVarA8 = ((qbj.m) eVar.d.Y0).a();
                vc.s.j(aVarA8);
                y0 y0Var = new y0(h0Var37, aVarA8);
                vlf.b bVar9 = (vlf.b) eVar.O0.get();
                q2 q2VarD0 = eVar.d0();
                ue5.b bVar10 = dVar.f206728b1;
                return new n2(y0Var, bVar9, q2VarD0, new se5.a());
            case 170:
                h0 h0Var38 = (h0) eVar.E.get();
                vlf.b bVar11 = (vlf.b) eVar.O0.get();
                pkf.a2 a2VarA0 = eVar.a0();
                ap5.b bVarE = ((yo5.w) dVar.f206730c1).e();
                vc.s.j(bVarE);
                return new y1(h0Var38, bVar11, a2VarA0, bVarE, (elf.c0) eVar.M2.get());
            case 171:
                return new elf.c0();
            case 172:
                return new pkf.d2((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), new e2(), (wnf.b) eVar.N0.get(), (elf.b0) eVar.O2.get());
            case 173:
                h0 h0Var39 = (h0) eVar.E.get();
                zxd.c cVarA2 = ((eyd.b) dVar.v).a();
                vc.s.j(cVarA2);
                return new elf.b0(h0Var39, cVarA2);
            case 174:
                return new k2((h0) eVar.E.get(), eVar.c0(), (u0) eVar.Q2.get(), (rhf.d) eVar.i0.get());
            case 175:
                return new u0((rhf.d) eVar.i0.get());
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                h0 h0Var40 = (h0) eVar.E.get();
                l61.a aVarB8 = dVar.f206757r.b();
                vc.s.j(aVarB8);
                ang.f fVarC3 = dVar.f206757r.c();
                hc5.a aVarA9 = ((gc5.c) dVar.f206732d1).a();
                vc.s.j(aVarA9);
                bbj.c cVarA3 = dVar.f206734e1.a();
                vc.s.j(cVarA3);
                return new pkf.h2(h0Var40, aVarB8, fVarC3, aVarA9, cVarA3, (rhf.d) eVar.i0.get(), (v9j.a) eVar.S2.get());
            case 177:
                w9j.a aVarA10 = dVar.f206735f1.a();
                vc.s.j(aVarA10);
                return rga.l.q(aVarA10);
            case 178:
                h0 h0Var41 = (h0) eVar.E.get();
                fof.d dVar2 = new fof.d();
                vbj.c cVar3 = (vbj.c) ((qbj.m) dVar.Y0).f244320s.get();
                vc.s.j(cVar3);
                hlf.c cVar4 = (hlf.c) eVar.U2.get();
                sj5.a aVarD = ((ak5.i) dVar.a1).d();
                vc.s.j(aVarD);
                fbj.a aVarA11 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA11);
                return new pkf.w0(h0Var41, dVar2, cVar3, cVar4, aVarD, aVarA11);
            case 179:
                fof.d dVar3 = new fof.d();
                rm5.a aVarA12 = dVar.f206737g1.a();
                vc.s.j(aVarA12);
                ibj.a aVar4 = (ibj.a) ((qbj.m) dVar.Y0).f244318q.get();
                vc.s.j(aVar4);
                return new hlf.c(dVar3, aVarA12, aVar4);
            case 180:
                h0 h0Var42 = (h0) eVar.E.get();
                fof.a aVar5 = new fof.a();
                sj5.a aVarD2 = ((ak5.i) dVar.a1).d();
                vc.s.j(aVarD2);
                fbj.a aVarA13 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA13);
                return new a1(h0Var42, aVar5, aVarD2, aVarA13);
            case 181:
                h0 h0Var43 = (h0) eVar.E.get();
                vbj.c cVar5 = (vbj.c) ((qbj.m) dVar.Y0).f244320s.get();
                vc.s.j(cVar5);
                fof.c cVar6 = new fof.c();
                hlf.c cVar7 = (hlf.c) eVar.U2.get();
                sj5.a aVarD3 = ((ak5.i) dVar.a1).d();
                vc.s.j(aVarD3);
                fbj.a aVarA14 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA14);
                return new q0(h0Var43, cVar5, cVar6, cVar7, aVarD3, aVarA14);
            case 182:
                h0 h0Var44 = (h0) eVar.E.get();
                fbj.a aVarA15 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA15);
                pkf.a0 a0Var = new pkf.a0();
                dVar.f206728b1.getClass();
                return new pkf.z(h0Var44, aVarA15, a0Var, new se5.b());
            case 183:
                h0 h0Var45 = (h0) eVar.E.get();
                fbj.a aVarA16 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA16);
                pak.h hVarL1 = eVar.l1();
                ap5.b bVarE2 = ((yo5.w) dVar.f206730c1).e();
                vc.s.j(bVarE2);
                return new pkf.v2(h0Var45, aVarA16, hVarL1, bVarE2);
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
                eVar.getClass();
                h0 h0Var46 = (h0) eVar.E.get();
                fbj.a aVarA17 = ((qbj.m) eVar.d.Y0).a();
                vc.s.j(aVarA17);
                y0 y0Var2 = new y0(h0Var46, aVarA17);
                vlf.b bVar12 = (vlf.b) eVar.O0.get();
                h1 h1VarZ = eVar.Z();
                ue5.b bVar13 = dVar.f206728b1;
                return new e1(y0Var2, bVar12, h1VarZ, new se5.a());
            case 185:
                h0 h0Var47 = (h0) eVar.E.get();
                vlf.b bVar14 = (vlf.b) eVar.O0.get();
                ak5.i iVar2 = (ak5.i) eVar.d.a1;
                sj5.b bVar15 = (sj5.b) iVar2.f5693h.get();
                vc.s.j(bVar15);
                uj5.a aVarB9 = iVar2.b();
                vc.s.j(aVarB9);
                f0 f0Var = new f0(bVar15, aVarB9);
                wnf.b bVar16 = (wnf.b) eVar.N0.get();
                fbj.a aVarA18 = ((qbj.m) dVar.Y0).a();
                vc.s.j(aVarA18);
                return new pkf.d0(h0Var47, bVar14, f0Var, bVar16, aVarA18, (elf.b0) eVar.O2.get(), (elf.c0) eVar.M2.get());
            case 186:
                return new pkf.i0((h0) eVar.E.get(), new pkf.j0(), (wnf.b) eVar.N0.get(), new bmf.b(), new dof.a(), (elf.b0) eVar.O2.get());
            case 187:
                h0 h0Var48 = (h0) eVar.E.get();
                m1 m1Var14 = (m1) eVar.T.get();
                k61.a aVarE3 = dVar.f206774y.e();
                vc.s.j(aVarE3);
                ykf.c cVar8 = new ykf.c();
                c70.a aVarZ = dVar.f206726b.z();
                vc.s.j(aVarZ);
                return new ykf.b(h0Var48, m1Var14, aVarE3, cVar8, aVarZ);
            case 188:
                e4m.e eVar3 = eVar.E;
                mlf.d dVar4 = eVar.d;
                h0 h0Var49 = (h0) eVar3.get();
                m1 m1Var15 = (m1) eVar.T.get();
                c6k.e eVarC1 = eVar.c1();
                xkf.h1 h1Var = (xkf.h1) eVar.f206800e3.get();
                d3j.b bVarE3 = ((b3j.p) dVar.l0).e();
                x2k.e eVar4 = new x2k.e();
                gte.a aVarB10 = dVar.f206729c.b();
                vc.s.j(aVarB10);
                bmf.b bVar17 = new bmf.b();
                y1k.a aVarA19 = dVar.m0.a();
                vc.s.j(aVarA19);
                f01.a aVar6 = (f01.a) eVar.u0.get();
                tqi.g gVarE4 = dVar.f206769w.e();
                sri.m mVarS = dVar.S();
                pff.a aVar7 = (pff.a) dVar.u.f224814p.get();
                vc.s.j(aVar7);
                uig.a aVar8 = (uig.a) dVar4.f206760s.f289597b.get();
                vc.s.j(aVar8);
                kgm.i iVar3 = new kgm.i(aVar8, dVar4.f206763t.e());
                h0 h0Var50 = (h0) eVar.E.get();
                pff.a aVar9 = (pff.a) dVar4.u.f224814p.get();
                vc.s.j(aVar9);
                gte.a aVarB11 = dVar4.f206729c.b();
                vc.s.j(aVarB11);
                uig.a aVar10 = (uig.a) dVar4.f206760s.f289597b.get();
                vc.s.j(aVar10);
                return new xkf.q1(h0Var49, m1Var15, eVarC1, h1Var, bVarE3, eVar4, aVarB10, bVar17, aVarA19, aVar6, gVarE4, mVarS, aVar7, iVar3, new uvl.c(h0Var50, aVar9, aVarB11, new kgm.i(aVar10, dVar4.f206763t.e())), ((s41.a) dVar.L0).d());
            case 189:
                return new xkf.h1();
            case 190:
                h0 h0Var51 = (h0) eVar.E.get();
                fl9.d dVar5 = dVar.f206740h1;
                fl9.d dVar6 = dVar.f206740h1;
                fl9.a aVar11 = (fl9.a) dVar5;
                zk0.b bVarL = aVar11.f135909b.l();
                vc.s.j(bVarL);
                gte.a aVarB12 = aVar11.e.b();
                vc.s.j(aVarB12);
                hl9.d dVar7 = new hl9.d(bVarL, aVarB12);
                fl9.a aVar12 = (fl9.a) dVar6;
                gte.a aVarB13 = aVar12.e.b();
                vc.s.j(aVarB13);
                dl9.c cVar9 = new dl9.c(new zq.a(aVarB13, aVar12.f.a()));
                zk0.b bVarL2 = ((fl9.a) dVar6).f135909b.l();
                vc.s.j(bVarL2);
                fnc.s sVar = new fnc.s(bVarL2);
                gte.a aVarB14 = dVar.f206729c.b();
                vc.s.j(aVarB14);
                return new z1(h0Var51, dVar7, cVar9, sVar, aVarB14, new bmf.b());
            case 191:
                mae.p factory = dVar.f206767v0.e();
                vc.s.j(factory);
                f01.a uiKitResources = (f01.a) eVar.u0.get();
                t70.b currenciesLocalization = dVar.f206726b.g();
                vc.s.j(currenciesLocalization);
                rkf.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                return factory.c(uiKitResources, currenciesLocalization);
            case 192:
                xua.a aVarA20 = dVar.f206767v0.f303678t.a();
                vc.s.j(aVarA20);
                nd.l factory2 = new nd.l(aVarA20);
                rkf.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new wae.d(aVarA20);
            case Constants.TAG_ATMEL_SERIAL /* 193 */:
                return new elf.d1(((s41.a) dVar.L0).d());
            case 194:
                return new elf.k2();
            case 195:
                h0 h0Var52 = (h0) eVar.E.get();
                pff.a aVar13 = (pff.a) dVar.u.f224814p.get();
                vc.s.j(aVar13);
                gte.a aVarB15 = dVar.f206729c.b();
                vc.s.j(aVarB15);
                return new elf.h0(h0Var52, aVar13, aVarB15);
            case 196:
                bd3.a aVarA21 = dVar.f206741i1.a();
                vc.s.j(aVarA21);
                return new elf.o(aVarA21, new bmf.b());
            case Constants.TAG_BATTERY_STATE /* 197 */:
                return new s1((h0) eVar.E.get(), new bmf.b(), (e60.a) eVar.o.get(), (t80.c) eVar.f206815j.get(), (rnf.g) dVar.E1.get());
            case Constants.TAG_POWER_OFF_TIMEOUT /* 198 */:
                return new j2((h0) eVar.E.get());
            case 199:
                bmf.b bVar18 = new bmf.b();
                xua.a aVarA22 = dVar.c0.a();
                vc.s.j(aVarA22);
                return new elf.a1(bVar18, aVarA22, (h0) eVar.E.get(), (m1) eVar.T.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        mlg.b bVar = (mlg.b) this.f206069b;
        int i = this.f206070c;
        if (i != 0) {
            if (i == 1) {
                return new vlg.n();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) ((mlg.d) this.d).f206956a.get();
        n8b.a aVarA = bVar.f206947j.a();
        vc.s.j(aVarA);
        return new vlg.s(nVar, aVarA, (hlg.b) bVar.o.get());
    }

    private final Object e() {
        mn8.o oVar = (mn8.o) this.f206069b;
        zd8.a aVar = oVar.k;
        se8.a aVar2 = oVar.f207465g;
        mn8.c cVar = (mn8.c) this.d;
        int i = this.f206070c;
        if (i == 0) {
            return kxa.j.l((j60.a) cVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) cVar.f207420b.get(), (rp0.m) cVar.f207421c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            jo8.a coparentInviteItemMapper = new jo8.a();
            jo8.c coparentItemMapper = new jo8.c();
            Intrinsics.checkNotNullParameter(coparentInviteItemMapper, "coparentInviteItemMapper");
            Intrinsics.checkNotNullParameter(coparentItemMapper, "coparentItemMapper");
            return new ho8.l();
        }
        jki.p pVar = (jki.p) cVar.f.get();
        CoparentsSettingsScreenContract$InputData coparentsSettingsScreenContract$InputData = cVar.f207419a;
        te8.z zVarE = aVar2.e();
        vc.s.j(zVarE);
        te8.e eVarA = aVar2.a();
        vc.s.j(eVarA);
        ao.h hVarA = aVar.a();
        hj8.a aVarA = oVar.f.a();
        vc.s.j(aVarA);
        return new ho8.j(pVar, coparentsSettingsScreenContract$InputData, zVarE, eVarA, hVarA, aVarA, oVar.f207467j.e(), aVar2.f(), (j60.a) cVar.d.get(), aVar.c());
    }

    private final Object f() {
        mn8.o oVar = (mn8.o) this.f206069b;
        mn8.b bVar = oVar.f207464c;
        il8.b bVar2 = oVar.f207474s;
        mn8.h hVar = (mn8.h) this.d;
        int i = this.f206070c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) hVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) hVar.f207434c.get(), (rp0.m) hVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                return new fo8.b(new jl8.e((fl8.d) bVar2.i.get(), new te8.y(), bVar2.a()));
            case 4:
                hn8.b bVar3 = (hn8.b) bVar.o.get();
                vc.s.j(bVar3);
                kd8.e eVarA = oVar.d.a();
                vc.s.j(eVarA);
                return new nn8.g(bVar3, eVarA);
            case 5:
                JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = hVar.f207432a;
                hj8.a aVarA = oVar.f.a();
                vc.s.j(aVarA);
                zq.a aVarA2 = bVar2.a();
                fo8.a aVar = (fo8.a) hVar.f207435g.get();
                j60.a aVar2 = (j60.a) hVar.e.get();
                nn8.a aVar3 = (nn8.a) hVar.f207436h.get();
                jl8.c cVar = (jl8.c) bVar2.f162139j.get();
                vc.s.j(cVar);
                return new com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d(juniorAppAccessControllerContract$InputData, aVarA, aVarA2, aVar, aVar2, aVar3, cVar, bVar.c(), (cli.n) hVar.i.get());
            case 6:
                z80.b bVarS = hVar.f207433b.f207462a.s();
                vc.s.j(bVarS);
                return new do8.v(new go8.c(bVarS), (fo8.a) hVar.f207435g.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        mn8.k kVar = (mn8.k) this.d;
        mn8.o oVar = (mn8.o) this.f206069b;
        se8.a aVar = oVar.f207465g;
        mn8.b bVar = oVar.f207464c;
        ite.a aVar2 = oVar.o;
        int i = this.f206070c;
        if (i == 0) {
            return kxa.j.k((j60.a) kVar.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) kVar.f207444c.get(), (rp0.m) kVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            gte.a aVarB = aVar2.b();
            vc.s.j(aVarB);
            return new vo8.r0(aVarB);
        }
        JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = kVar.f207442a;
        hj8.a aVarA = oVar.f.a();
        vc.s.j(aVarA);
        t1 t1VarA = bVar.a();
        wk8.a aVar3 = (wk8.a) oVar.f207470n.f289886j.get();
        vc.s.j(aVar3);
        kd8.e eVarA = oVar.d.a();
        vc.s.j(eVarA);
        kbb.c cVarF = aVar.f();
        j60.a aVar4 = (j60.a) kVar.e.get();
        te8.z zVarE = aVar.e();
        vc.s.j(zVarE);
        f4h.a aVar5 = new f4h.a((gb8.b) oVar.f207473r.k.get());
        kgm.c cVarC = bVar.c();
        z80.b bVarS = oVar.f207462a.s();
        vc.s.j(bVarS);
        gte.a aVarB2 = aVar2.b();
        vc.s.j(aVarB2);
        mn8.o oVar2 = kVar.f207443b;
        gte.a aVarB3 = oVar2.o.b();
        vc.s.j(aVarB3);
        te8.z zVarE2 = oVar2.f207465g.e();
        vc.s.j(zVarE2);
        return new com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b(juniorSecurityAndPrivacyControllerContract$InputData, aVarA, t1VarA, aVar3, eVarA, cVarF, aVar4, zVarE, aVar5, cVarC, bVarS, aVarB2, new jul.o(aVarB3, zVarE2), (cli.n) kVar.f207445g.get());
    }

    private final Object h() {
        mn8.l lVar = (mn8.l) this.d;
        mn8.o oVar = (mn8.o) this.f206069b;
        int i = this.f206070c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) lVar.e.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) lVar.f207449c.get(), (rp0.m) lVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                return s2l.c.j((r60.b) lVar.f207451h.get());
            case 4:
                return s2l.c.q((com.revolut.kompot.navigable.a) lVar.f207449c.get(), (p0) lVar.f207450g.get(), kxa.j.o(new nji.b()));
            case 5:
                return new p0();
            case 6:
                v68.a extension = (v68.a) lVar.f207452j.get();
                w68.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                Set setZ2 = extension.Z2();
                vc.s.k(setZ2);
                return setZ2;
            case 7:
                r10.q factory = ((k78.b) oVar.e).w();
                w68.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                s78.b bVar = new s78.b();
                a88.d contentProvider = (a88.d) factory.d;
                Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
                return new r78.c(bVar, new cfa.g(contentProvider), (wsg.n) factory.f250849b, (m78.i) factory.f250850c);
            case 8:
                hj8.a aVarA = oVar.f.a();
                vc.s.j(aVarA);
                return new rc8.k(aVarA, lVar.b(), (rc8.g) lVar.f207453l.get());
            case 9:
                jul.o oVarB = lVar.b();
                wsg.n nVarB = oVar.f207466h.b();
                te8.e eVarA = oVar.f207465g.a();
                vc.s.j(eVarA);
                hj8.a aVarA2 = oVar.f.a();
                vc.s.j(aVarA2);
                return new rc8.e(oVarB, nVarB, eVarA, aVarA2, new sc8.a(), new sc8.b(), oVar.f207463b.a());
            case 10:
                wsg.n nVarB2 = oVar.f207466h.b();
                ic8.a aVar = (ic8.a) oVar.i.f.get();
                vc.s.j(aVar);
                hj8.a aVarA3 = oVar.f.a();
                vc.s.j(aVarA3);
                ang.f fVarE = oVar.f207467j.e();
                ao.h hVarA = oVar.k.a();
                l93.f fVarJ = oVar.f207468l.j();
                vc.s.j(fVarJ);
                j60.a aVar2 = (j60.a) lVar.e.get();
                da3.j jVar = lVar.f207448b.f207468l;
                m93.g gVarI = jVar.i();
                vc.s.j(gVarI);
                m93.d dVarF = jVar.f();
                vc.s.j(dVarF);
                pc8.a aVar3 = new pc8.a(gVarI, dVarF);
                zf8.n nVarB3 = oVar.f207469m.b();
                vc.s.j(nVarB3);
                return new oc8.n(nVarB2, aVar, aVarA3, fVarE, hVarA, fVarJ, aVar2, aVar3, nVarB3);
            case 11:
                JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = lVar.f207447a;
                mj8.b bVar2 = oVar.f;
                se8.a aVar4 = oVar.f207465g;
                hj8.a aVarA4 = bVar2.a();
                vc.s.j(aVarA4);
                wsg.n nVarB4 = oVar.f207466h.b();
                oc8.d dVar = (oc8.d) lVar.f207455n.get();
                rc8.h hVar = (rc8.h) lVar.f207454m.get();
                wk8.a aVar5 = (wk8.a) oVar.f207470n.f289886j.get();
                vc.s.j(aVar5);
                ao.h hVarA2 = oVar.k.a();
                kd8.e eVarA2 = oVar.d.a();
                vc.s.j(eVarA2);
                kbb.c cVarF = aVar4.f();
                gte.a aVarB = oVar.o.b();
                vc.s.j(aVarB);
                ang.f fVarE2 = oVar.f207467j.e();
                te8.z zVarE = aVar4.e();
                vc.s.j(zVarE);
                jla.h hVarA3 = oVar.f207471p.a();
                te8.e eVarA3 = aVar4.a();
                vc.s.j(eVarA3);
                v68.a aVar6 = (v68.a) lVar.f207452j.get();
                cge.h hVarA4 = oVar.f207472q.a();
                zo8.a juniorSettingsCoparentActionsProvider = new zo8.a();
                Intrinsics.checkNotNullParameter(juniorSettingsCoparentActionsProvider, "juniorSettingsCoparentActionsProvider");
                return new xo8.h0(juniorSettingsControllerContract$Input, aVarA4, nVarB4, dVar, hVar, aVar5, hVarA2, eVarA2, cVarF, aVarB, fVarE2, zVarE, hVarA3, eVarA3, aVar6, hVarA4, new xo8.l0());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        mo9.b bVar = (mo9.b) this.f206069b;
        mo9.a aVar = (mo9.a) this.d;
        int i = this.f206070c;
        switch (i) {
            case 0:
                n60.a extension = (n60.a) aVar.d.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) aVar.f207570c.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new n60.a(controller);
            case 2:
                q8k.r launcher = (q8k.r) aVar.f.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(launcher, "launcher");
                vc.s.k(launcher);
                return launcher;
            case 3:
                v8k.h hVar = bVar.f207581l;
                xmg.a aVar2 = hVar.e;
                lpf.a aVar3 = hVar.f;
                k9k.b bVar2 = new k9k.b(hVar.b(), aVar3.d(), new j9k.z(aVar2.e(), aVar3.a(), aVar3.f()));
                t1j.b bVarE = aVar3.e();
                rga.c cVarB = hVar.f286869g.b();
                vc.s.j(cVarB);
                j9k.c0 c0Var = new j9k.c0(bVarE, cVarB);
                j9k.p pVarB = hVar.b();
                fk3.a aVarA = hVar.f286866a.a();
                vc.s.j(aVarA);
                k61.a aVarE = hVar.f286867b.e();
                vc.s.j(aVarE);
                u5k.d dVar = new u5k.d(hVar.f286870h.a());
                wsg.n nVarB = hVar.f286868c.b();
                r9k.a aVar4 = new r9k.a();
                t1j.b bVarE2 = aVar3.e();
                l1l.a aVar5 = new l1l.a();
                l1l.d dVar2 = new l1l.d();
                l1l.f fVar = new l1l.f();
                l1l.j jVar = new l1l.j();
                l1l.m mVar = new l1l.m();
                ite.a aVar6 = hVar.i;
                gte.a aVarB = aVar6.b();
                vc.s.j(aVarB);
                l1l.s sVar = new l1l.s(aVarB);
                l1l.q qVar = new l1l.q();
                l1l.k kVar = new l1l.k();
                urf.f fVar2 = new urf.f();
                l80.e eVarH = hVar.f286871j.h();
                vc.s.j(eVarH);
                e5k.b bVar3 = new e5k.b(eVarH, 2);
                t9k.b bVar4 = new t9k.b();
                t9k.e eVar = new t9k.e();
                wt9.e eVarC = ((ut9.a) hVar.k).c();
                vc.s.j(eVarC);
                gte.a aVarB2 = aVar6.b();
                vc.s.j(aVarB2);
                l1l.h hVar2 = new l1l.h(aVarB2, 0);
                gte.a aVarB3 = aVar6.b();
                vc.s.j(aVarB3);
                r9k.k kVar2 = new r9k.k(pVarB, aVarA, aVarE, dVar, nVarB, aVar4, bVarE2, aVar5, dVar2, fVar, jVar, mVar, sVar, qVar, kVar, fVar2, bVar3, bVar4, eVar, eVarC, hVar2, new l1l.h(aVarB3, 1));
                b9k.f fVarA = hVar.a();
                ang.f fVarE = aVar2.e();
                bqf.d dVarA = aVar3.a();
                bqf.g gVarF = aVar3.f();
                by5.a factory = new by5.a(bVar2, c0Var, kVar2, fVarA, new p96.a(fVarE, dVarA, gVarF));
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) aVar.f207570c.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(controller2, "controller");
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new k9k.e(bVar2, c0Var, kVar2, fVarA.i(x0.a(g1.Companion, controller2.D2()), new b9k.t(fVarE, dVarA, gVarF)));
            case 4:
                a2k.c launcher2 = (a2k.c) aVar.f207572h.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(launcher2, "launcher");
                vc.s.k(launcher2);
                return launcher2;
            case 5:
                p2k.r rVar = bVar.f207582m;
                lpf.a aVar7 = rVar.f232451a;
                opf.z zVarD = aVar7.d();
                fk3.a aVarA2 = rVar.f232452b.a();
                vc.s.j(aVarA2);
                usg.a aVar8 = rVar.f232453c;
                q4k.c cVar = new q4k.c(zVarD, aVarA2, aVar8.b());
                p2k.f fVar3 = rVar.d;
                y1k.a aVarA3 = fVar3.a();
                vc.s.j(aVarA3);
                hlg.b bVar5 = (hlg.b) rVar.e.o.get();
                vc.s.j(bVar5);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) rVar.f).c();
                vc.s.j(aVarC);
                xmg.a aVar9 = rVar.f232454g;
                ang.f fVarE2 = aVar9.e();
                bqf.d dVarA2 = aVar7.a();
                n8b.a aVarA4 = rVar.f232455h.a();
                vc.s.j(aVarA4);
                p4k.g gVar = new p4k.g(aVarA3, bVar5, aVarC, fVarE2, dVarA2, new c8i.n(aVarA4, 1), new p4k.h());
                p2k.u uVar = rVar.i;
                g3k.d dVarB = uVar.b();
                vc.s.j(dVarB);
                opf.c0 c0Var2 = new opf.c0();
                ut9.a aVar10 = (ut9.a) rVar.f232456j;
                vo9.a aVarB4 = aVar10.b();
                vc.s.j(aVarB4);
                k61.a aVarE2 = rVar.k.e();
                vc.s.j(aVarE2);
                u5k.d dVar3 = new u5k.d(rVar.f232457l.a());
                wsg.n nVarB2 = aVar8.b();
                ang.f fVarE3 = aVar9.e();
                c5k.a aVar11 = new c5k.a();
                ite.a aVar12 = rVar.f232458m;
                gte.a aVarB5 = aVar12.b();
                vc.s.j(aVarB5);
                l1l.s sVar2 = new l1l.s(aVarB5);
                l1l.m mVar2 = new l1l.m();
                l1l.q qVar2 = new l1l.q();
                l1l.k kVar3 = new l1l.k();
                urf.f fVar4 = new urf.f();
                l70.e eVar2 = rVar.f232459n;
                l80.e eVarH2 = eVar2.h();
                vc.s.j(eVarH2);
                e5k.b bVar6 = new e5k.b(eVarH2, 0);
                e5k.f fVar5 = new e5k.f();
                e5k.d dVar4 = new e5k.d();
                e5k.g gVar2 = new e5k.g();
                kak.a aVarA5 = rVar.o.a();
                l1l.o oVar = new l1l.o();
                wt9.e eVarC2 = aVar10.c();
                vc.s.j(eVarC2);
                gte.a aVarB6 = aVar12.b();
                vc.s.j(aVarB6);
                l1l.h hVar3 = new l1l.h(aVarB6, 0);
                gte.a aVarB7 = aVar12.b();
                vc.s.j(aVarB7);
                l1l.h hVar4 = new l1l.h(aVarB7, 1);
                h2k.l lVarA = uVar.a();
                vc.s.j(lVarA);
                gte.a aVarB8 = aVar12.b();
                vc.s.j(aVarB8);
                gte.a aVarB9 = aVar12.b();
                vc.s.j(aVarB9);
                f4h.a aVar13 = new f4h.a(new g4k.p(gVar, dVarB, c0Var2, aVarB4, aVarE2, dVar3, nVarB2, fVarE3, aVar11, sVar2, mVar2, qVar2, kVar3, fVar4, bVar6, fVar5, dVar4, gVar2, aVarA5, oVar, eVarC2, hVar3, hVar4, new h2k.k(lVarA, aVarB8, new h2k.d(aVarB9), new h2k.e())));
                y1k.a aVarA6 = fVar3.a();
                vc.s.j(aVarA6);
                ce5.b bVar7 = rVar.f232460p;
                ldd.a aVar14 = new ldd.a();
                xdk.a aVar15 = new xdk.a();
                z71.a aVarF = ((c21.b) rVar.f232461q).f();
                vc.s.j(aVarF);
                utk.f fVar6 = new utk.f(aVar15, aVarF, aVar8.a());
                w2 w2VarB = rVar.f232462r.b();
                twg.c cVarB2 = rVar.f232463s.b();
                f2k.n nVar = new f2k.n();
                xf6.t tVar = (xf6.t) rVar.f232464t;
                xg6.l lVarD = tVar.d();
                vc.s.j(lVarD);
                com.revolut.feature.external_accounts.api.navigation.a aVarB10 = tVar.b();
                vc.s.j(aVarB10);
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                b9k.f fVar7 = new b9k.f(bVar7, aVar14, fVar6, w2VarB, cVarB2, nVar, lVarD, aVarB10, aVarX);
                nd.m factory2 = new nd.m(cVar, aVar13, aVarA6, fVar7);
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) aVar.f207570c.get();
                n60.a keyboardExtension = (n60.a) aVar.d.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(controller3, "controller");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                Intrinsics.checkNotNullParameter(controller3, "controller");
                Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                return new q4k.h(cVar, aVar13, aVarA6, fVar7.j(controller3, keyboardExtension));
            case 6:
                xpa.g launcher3 = (xpa.g) aVar.f207573j.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(launcher3, "launcher");
                vc.s.k(launcher3);
                return launcher3;
            case 7:
                jqa.o oVar2 = bVar.f207583n;
                lpf.a aVar16 = oVar2.f177629a;
                opf.z zVarD2 = aVar16.d();
                fk3.a aVarA7 = oVar2.f177630b.a();
                vc.s.j(aVarA7);
                psa.b transferDataBuilder = new psa.b(zVarD2, aVarA7);
                jid.z zVarA = oVar2.a();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) oVar2.f).c();
                vc.s.j(aVarC2);
                osa.f fVar8 = new osa.f(zVarA, aVarC2, aVar16.a());
                opf.c0 c0Var3 = new opf.c0();
                vo9.a aVarB11 = ((ut9.a) oVar2.f177632g).b();
                vc.s.j(aVarB11);
                jid.z zVarA2 = oVar2.a();
                u5k.d dVar5 = new u5k.d(oVar2.f177633h.a());
                wsg.n nVarB3 = oVar2.i.b();
                l1l.a aVar17 = new l1l.a();
                l1l.d dVar6 = new l1l.d();
                ite.a aVar18 = oVar2.f177634j;
                gte.a aVarB12 = aVar18.b();
                vc.s.j(aVarB12);
                l1l.s sVar3 = new l1l.s(aVarB12);
                l1l.q qVar3 = new l1l.q();
                l1l.k kVar4 = new l1l.k();
                urf.f fVar9 = new urf.f();
                wsa.c cVar2 = new wsa.c();
                gte.a aVarB13 = aVar18.b();
                vc.s.j(aVarB13);
                l1l.h hVar5 = new l1l.h(aVarB13, 0);
                gte.a aVarB14 = aVar18.b();
                vc.s.j(aVarB14);
                asa.m errorStateProvider = new asa.m(fVar8, c0Var3, aVarB11, zVarA2, dVar5, nVarB3, aVar17, dVar6, sVar3, qVar3, kVar4, fVar9, cVar2, hVar5, new l1l.h(aVarB14, 1), new asa.e());
                r10.r checksExtensionFactory = oVar2.b();
                Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
                Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
                Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
                nd.o factory3 = new nd.o();
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) aVar.f207570c.get();
                ro9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(controller4, "controller");
                Intrinsics.checkNotNullParameter(controller4, "controller");
                csa.c cVar3 = (csa.c) checksExtensionFactory.f250851a;
                utk.f fVar10 = (utk.f) checksExtensionFactory.f250852b;
                return new psa.e(transferDataBuilder, errorStateProvider, new asa.d(cVar3, new xdk.g((xdk.a) fVar10.f283121a, (z71.a) fVar10.f283122b, (wsg.b) fVar10.f283123c), ((w2) checksExtensionFactory.f250853c).m()));
            case 8:
                return new com.revolut.feature.payments.air.widget.impl.ui.flow.a(aVar.f207568a, aVar.f207569b, new no9.a((lo9.d) bVar.f207586r.get()), new com.revolut.feature.payments.air.widget.impl.ui.flow.b((q8k.r) aVar.f.get(), (a2k.c) aVar.f207572h.get(), (xpa.g) aVar.f207573j.get()), new qo9.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        mrg.b bVar = (mrg.b) this.d;
        BaseViewImageContract$InputData inputData = bVar.f208122a;
        int i = this.f206070c;
        if (i == 0) {
            return new prg.a(inputData, (bk0.a) ((mrg.c) this.f206069b).d.get(), (hrg.c) bVar.f208123b.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        qrg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new com.revolut.feature.view.image.core.a(inputData);
    }

    private final Object k() {
        int i = this.f206070c;
        if (i == 0) {
            mrg.d dVar = (mrg.d) this.d;
            return new com.revolut.feature.view.image.impl.flow.a(dVar.f208128a, (org.a) dVar.d.get());
        }
        if (i == 1) {
            return new org.c(((mrg.c) this.f206069b).f208125a);
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        ms1.k kVar = (ms1.k) this.d;
        ms1.j jVar = kVar.f208550a;
        ms1.j jVar2 = (ms1.j) this.f206069b;
        vy9.b bVar = jVar2.f208548x;
        p12.l lVar = jVar2.f208545s;
        int i = this.f206070c;
        if (i == 0) {
            ry9.d extension = (ry9.d) kVar.f208551b.get();
            us1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            vy9.g factory = bVar.b();
            vc.s.j(factory);
            us1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            a12.j jVarE = lVar.e();
            vc.s.j(jVarE);
            a12.e eVarL = lVar.l();
            vc.s.j(eVarL);
            a12.o oVarM = lVar.m();
            vc.s.j(oVarM);
            vs1.b bVar2 = new vs1.b((a9e.h) jVar.K.get());
            ty9.b bVarC = bVar.c();
            vc.s.j(bVarC);
            return new ts1.w(jVarE, eVarL, oVarM, bVar2, bVarC);
        }
        h12.h hVarF = jVar.f208545s.f();
        vc.s.j(hVarF);
        xua.a aVarA = jVar.f208549y.a();
        vc.s.j(aVarA);
        ss1.b bVar3 = new ss1.b(hVarF, aVarA);
        pak.h hVar = new pak.h((c12.f) jVar2.F.get());
        qr0.i iVar = new qr0.i((c12.z) jVar.G.get());
        h12.a aVarD = lVar.d();
        vc.s.j(aVarD);
        pn3.a aVar = (pn3.a) jVar2.I.get();
        vz1.j jVarI = ((lz1.m) jVar2.f208539l).i();
        vc.s.j(jVarI);
        e12.f fVar = (e12.f) jVar2.J.get();
        lx1.d dVarB = ((ey1.e) jVar2.i).b();
        vc.s.j(dVarB);
        return new ts1.u(bVar3, hVar, iVar, aVarD, aVar, jVarI, fVar, dVarB, (ry9.d) kVar.f208551b.get(), (jki.p) kVar.d.get());
    }

    private final Object m() {
        ms1.j jVar = (ms1.j) this.f206069b;
        ms1.l lVar = (ms1.l) this.d;
        ms1.j jVar2 = lVar.f208554b;
        int i = this.f206070c;
        if (i == 0) {
            Object extension = (ns1.b) lVar.f208555c.get();
            os1.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.apm.bizum.impl.ui.a(lVar.f208553a, (ns1.b) lVar.f208555c.get(), (d12.b) jVar.E.get(), new pak.h((c12.f) jVar2.F.get()), new qr0.i((c12.z) jVar2.G.get()));
            }
            throw new AssertionError(i);
        }
        sf0.h hVarB = jVar2.f208533a.b();
        vc.s.j(hVarB);
        v60.e eVarA = jVar2.f208534b.a();
        vc.s.j(eVarA);
        l80.e eVarH = jVar2.f208535c.h();
        vc.s.j(eVarH);
        ns1.f fVar = new ns1.f(hVarB, eVarA, eVarH);
        fk3.a aVarA = jVar.d.a();
        vc.s.j(aVarA);
        return new ns1.e(fVar, aVarA);
    }

    private final Object n() {
        ms1.n nVar = (ms1.n) this.d;
        ms1.j jVar = (ms1.j) this.f206069b;
        int i = this.f206070c;
        if (i == 0) {
            Object extension = (ns1.b) nVar.d.get();
            os1.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar2 = (yji.n) extension;
            vc.s.k(nVar2);
            return nVar2;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new ci2.a((ps1.b) jVar.D.get());
                }
                throw new AssertionError(i);
            }
            BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = nVar.f208559a;
            ns1.b bVar = (ns1.b) nVar.d.get();
            til.m mVarA = jVar.k.a();
            vc.s.j(mVarA);
            return new com.revolut.feature.apm.bizum.impl.ui.registration.a(bizumRegistrationFlowContract$InputData, bVar, mVarA);
        }
        ms1.j jVar2 = nVar.f208560b;
        sf0.h hVarB = jVar2.f208533a.b();
        vc.s.j(hVarB);
        v60.e eVarA = jVar2.f208534b.a();
        vc.s.j(eVarA);
        l80.e eVarH = jVar2.f208535c.h();
        vc.s.j(eVarH);
        ns1.f fVar = new ns1.f(hVarB, eVarA, eVarH);
        fk3.a aVarA = jVar.d.a();
        vc.s.j(aVarA);
        return new ns1.e(fVar, aVarA);
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object cVar;
        switch (this.f206068a) {
            case 0:
                c cVar2 = (c) this.d;
                int i = this.f206070c;
                if (i == 0) {
                    return new com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a(cVar2.f206071a, (o0) ((m) this.f206069b).D.get(), (g1) cVar2.e.get());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                ViewController controller = cVar2.f206072b;
                gpl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                x0 x0Var = g1.Companion;
                View decorView = controller.m2().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                return x0.a(x0Var, decorView);
            case 1:
                m mVar = (m) this.f206069b;
                o oVar = (o) this.d;
                int i2 = this.f206070c;
                if (i2 == 0) {
                    jpl.b extension = (jpl.b) oVar.f206118c.get();
                    ypl.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i2 == 1) {
                    gjl.b modelExtension = (gjl.b) oVar.f206117b.get();
                    r10.q factory = mVar.a();
                    ypl.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(modelExtension, "controllerModelExtension");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                    return new jpl.b(modelExtension);
                }
                if (i2 == 2) {
                    r10.q factory2 = mVar.a();
                    ypl.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return new jpl.d((akl.f0) factory2.f250849b, (o0) factory2.f250850c, false, (rqk.m) factory2.d);
                }
                if (i2 == 3) {
                    Object extension2 = (gjl.b) oVar.f206117b.get();
                    ypl.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar = (yji.n) extension2;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                gjl.b bVar2 = (gjl.b) oVar.f206117b.get();
                o0 o0Var = (o0) mVar.D.get();
                m mVar2 = oVar.f206116a;
                r10.q factory3 = mVar2.a();
                ypl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new xpl.l(bVar2, o0Var, new xpl.n(new jpl.f(), new tll.r(), mVar2.f206102l.a()));
            case 2:
                mkh.a aVar = (mkh.a) this.d;
                s sVar = (s) this.f206069b;
                int i3 = this.f206070c;
                switch (i3) {
                    case 0:
                        return kxa.j.k((j60.a) aVar.f206307s.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) aVar.f206305q.get(), (rp0.m) aVar.f206306r.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        ViewController screen = aVar.f206293a;
                        akh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        CashBalanceController cashBalanceController = (CashBalanceController) screen;
                        vc.s.k(cashBalanceController);
                        return cashBalanceController;
                    case 4:
                        return a10.b.f((u8h.b) sVar.i, "factory");
                    case 5:
                        return efk.j.d((dtl.a) aVar.f206310x.get());
                    case 6:
                        return efk.j.q(sVar.Q.a(), aVar.f206295b, (dtl.b) aVar.f206309w.get());
                    case 7:
                        return efk.j.r(sVar.Q.a());
                    case 8:
                        return kii.e.j((u8h.b) sVar.i, "factory");
                    case 9:
                        return h7d.d.a(aVar.d, (i7d.o) aVar.A.get(), sVar.R.d());
                    case 10:
                        return h7d.f.a(sVar.R.d(), Optional.empty());
                    case 11:
                        fsl.t tVarA = sVar.u.a();
                        vc.s.j(tVarA);
                        return fp8.c.p(tVarA, aVar.e, (fsl.i) aVar.C.get());
                    case 12:
                        fsl.t tVarA2 = sVar.u.a();
                        vc.s.j(tVarA2);
                        CashBalanceControllerContract$InputData inputData = aVar.f;
                        akh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        return fp8.c.q(tVarA2, new akh.a(inputData));
                    case 13:
                        return ige.d.m(sVar.v.b(), (htl.g) aVar.E.get(), (htl.d) aVar.F.get());
                    case 14:
                        return ige.d.n(sVar.v.b());
                    case 15:
                        hbh.j jVarA = sVar.S.a();
                        vc.s.j(jVarA);
                        return hy1.g.k(jVarA, aVar.f206298g, (h1h.b) aVar.H.get());
                    case 16:
                        hbh.j jVarA2 = sVar.S.a();
                        vc.s.j(jVarA2);
                        return hy1.g.l(jVarA2);
                    case 17:
                        f1h.c cVarA = sVar.f206416m.a();
                        vc.s.j(cVarA);
                        return fp8.c.s(cVarA, (f1h.f) aVar.J.get(), (f1h.b) aVar.K.get());
                    case 18:
                        f1h.c cVarA2 = sVar.f206416m.a();
                        vc.s.j(cVarA2);
                        return fp8.c.t(cVarA2);
                    case 19:
                        mhh.d factory4 = (mhh.d) sVar.T.f.get();
                        vc.s.j(factory4);
                        zjh.f screen2 = aVar.f206299h;
                        zgh.b controllerModelExtension = (zgh.b) aVar.M.get();
                        ahh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(screen2, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(screen2, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        bVar = new mhh.b(screen2, controllerModelExtension);
                        return bVar;
                    case 20:
                        mhh.d factory5 = (mhh.d) sVar.T.f.get();
                        vc.s.j(factory5);
                        zgh.d inputData2 = aVar.i;
                        ahh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        cVar = new mhh.c(inputData2, factory5.f205574a);
                        return cVar;
                    case 21:
                        toh.d factory6 = sVar.f206411h.c();
                        zjh.c screen3 = aVar.f206300j;
                        y5h.b controllerModelExtension2 = (y5h.b) aVar.O.get();
                        z5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        Intrinsics.checkNotNullParameter(screen3, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension2, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(screen3, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension2, "controllerModelExtension");
                        bVar = new x6h.b(screen3, controllerModelExtension2);
                        return bVar;
                    case 22:
                        toh.d factory7 = sVar.f206411h.c();
                        y5h.d inputData3 = aVar.k;
                        z5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        Intrinsics.checkNotNullParameter(inputData3, "inputData");
                        Intrinsics.checkNotNullParameter(inputData3, "inputData");
                        cVar = new x6h.d((zq.a) factory7.f273214a, (j6h.c) factory7.f273215b, inputData3);
                        return cVar;
                    case 23:
                        nd.p factory8 = new nd.p(sVar.f206411h.e.L());
                        zjh.i screen4 = aVar.f206301l;
                        u5h.b controllerModelExtension3 = (u5h.b) aVar.Q.get();
                        v5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory8, "factory");
                        Intrinsics.checkNotNullParameter(screen4, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension3, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(screen4, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension3, "controllerModelExtension");
                        cVar = new p6h.b(screen4, controllerModelExtension3);
                        return cVar;
                    case 24:
                        r10.r rVarL = sVar.f206411h.e.L();
                        nd.p factory9 = new nd.p(rVarL);
                        u5h.d inputData4 = aVar.f206302m;
                        v5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory9, "factory");
                        Intrinsics.checkNotNullParameter(inputData4, "inputData");
                        Intrinsics.checkNotNullParameter(inputData4, "inputData");
                        cVar = new p6h.c(inputData4, rVarL);
                        return cVar;
                    case 25:
                        h9h.a aVar2 = sVar.f206411h.e;
                        nd.k factory10 = new nd.k(aVar2.L(), aVar2.d());
                        zjh.j screen5 = aVar.f206303n;
                        w5h.b controllerModelExtension4 = (w5h.b) aVar.S.get();
                        x5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory10, "factory");
                        Intrinsics.checkNotNullParameter(screen5, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension4, "controllerModelExtension");
                        Intrinsics.checkNotNullParameter(screen5, "screen");
                        Intrinsics.checkNotNullParameter(controllerModelExtension4, "controllerModelExtension");
                        cVar = new w6h.b(screen5, controllerModelExtension4);
                        return cVar;
                    case 26:
                        h9h.a aVar3 = sVar.f206411h.e;
                        r10.r rVarL2 = aVar3.L();
                        x8h.k kVarD = aVar3.d();
                        nd.k factory11 = new nd.k(rVarL2, kVarD);
                        w5h.d inputData5 = aVar.o;
                        x5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory11, "factory");
                        Intrinsics.checkNotNullParameter(inputData5, "inputData");
                        Intrinsics.checkNotNullParameter(inputData5, "inputData");
                        cVar = new w6h.e(inputData5, rVarL2, kVarD);
                        return cVar;
                    case 27:
                        return efk.j.e((dtl.b) aVar.f206309w.get());
                    case 28:
                        e4m.e eVar = aVar.V;
                        s sVar2 = aVar.f206304p;
                        fsl.k kVar = (fsl.k) eVar.get();
                        zgh.e eVar2 = (zgh.e) aVar.W.get();
                        y5h.e eVar3 = (y5h.e) aVar.X.get();
                        u5h.e eVar4 = (u5h.e) aVar.Y.get();
                        q1 q1Var = (q1) aVar.Z.get();
                        gte.a aVarB = sVar2.f206400a.b();
                        vc.s.j(aVarB);
                        d1h.h hVar = (d1h.h) aVar.f206294a0.get();
                        h9h.a aVar4 = sVar2.f206411h.e;
                        nd.k factory12 = new nd.k(aVar4.L(), aVar4.d());
                        x5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory12, "factory");
                        w6h.g gVar = new w6h.g();
                        tzg.h hVarJ = sVar2.d.j();
                        vc.s.j(hVarJ);
                        zjh.b0 b0Var = new zjh.b0(kVar, eVar2, eVar3, eVar4, q1Var, aVarB, hVar, gVar, hVarJ);
                        CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = aVar.f;
                        zdl.f fVar = sVar.f;
                        h9h.a aVar5 = sVar.d;
                        ybl.k kVarD2 = fVar.d();
                        vc.s.j(kVarD2);
                        ybl.l lVarF = aVar5.f();
                        wzg.a aVarE = aVar5.e();
                        vc.s.j(aVarE);
                        z8h.g gVarU = aVar5.u();
                        fsl.m mVarB = sVar.u.b();
                        vc.s.j(mVarB);
                        h1h.b bVar3 = (h1h.b) aVar.H.get();
                        ybl.k kVarD3 = aVar5.f150256a.d();
                        vc.s.j(kVarD3);
                        bbh.c cVar3 = new bbh.c(kVarD3);
                        zgh.b bVar4 = (zgh.b) aVar.M.get();
                        y5h.b bVar5 = (y5h.b) aVar.O.get();
                        u5h.b bVar6 = (u5h.b) aVar.Q.get();
                        aah.h hVar2 = (aah.h) aVar.v.get();
                        w5h.b bVar7 = (w5h.b) aVar.S.get();
                        ybl.k kVarD4 = sVar2.f.d();
                        vc.s.j(kVarD4);
                        o7.b bVar8 = new o7.b(kVarD4);
                        gte.a aVarB2 = sVar.f206400a.b();
                        vc.s.j(aVarB2);
                        d1h.e eVar5 = (d1h.e) aVar.z.get();
                        i7d.o oVar2 = (i7d.o) aVar.A.get();
                        CashHoldingsSelectorFlowFactory cashHoldingsSelectorFlowFactory = new CashHoldingsSelectorFlowFactory();
                        tzg.h hVarJ2 = aVar5.j();
                        vc.s.j(hVarJ2);
                        return new com.revolut.feature.wealth.ui.impl.cash_balance.b(b0Var, cashBalanceControllerContract$InputData, kVarD2, lVarF, aVarE, gVarU, mVarB, bVar3, cVar3, bVar4, bVar5, bVar6, hVar2, bVar7, bVar8, aVarB2, eVar5, oVar2, cashHoldingsSelectorFlowFactory, hVarJ2);
                    case 29:
                        fsl.t tVarA3 = sVar.u.a();
                        vc.s.j(tVarA3);
                        return fp8.c.r(tVarA3, sVar.v.a());
                    case 30:
                        mhh.d factory13 = (mhh.d) sVar.T.f.get();
                        vc.s.j(factory13);
                        ahh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory13, "factory");
                        return new mhh.e();
                    case 31:
                        toh.d factory14 = sVar.f206411h.c();
                        z5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory14, "factory");
                        return new x6h.f();
                    case 32:
                        nd.p factory15 = new nd.p(sVar.f206411h.e.L());
                        v5h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory15, "factory");
                        return new p6h.e();
                    case 33:
                        return a10.b.g((u8h.b) sVar.i, "factory");
                    case 34:
                        return kii.e.k((u8h.b) sVar.i);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                mkh.c cVar4 = (mkh.c) this.d;
                u8h.c cVar5 = ((s) this.f206069b).i;
                int i5 = this.f206070c;
                if (i5 == 0) {
                    z0h.a aVarB3 = ((u8h.b) cVar5).b();
                    vc.s.j(aVarB3);
                    return new glh.f(aVarB3, new glh.g((q1) cVar4.f206316b.get()), cVar4.f206315a);
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                aah.i factory16 = ((u8h.b) cVar5).d();
                vc.s.j(factory16);
                hlh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory16, "factory");
                return factory16.b();
            case 4:
                h9h.a aVar6 = ((s) this.f206069b).d;
                mkh.f fVar2 = (mkh.f) this.d;
                int i6 = this.f206070c;
                if (i6 == 0) {
                    return new jkh.l((cli.n) fVar2.f206323b.get(), fVar2.f206322a, aVar6.d(), aVar6.f());
                }
                if (i6 == 1) {
                    return new jkh.a();
                }
                throw new AssertionError(i6);
            case 5:
                mkh.h hVar3 = (mkh.h) this.d;
                s sVar3 = hVar3.f206330c;
                s sVar4 = (s) this.f206069b;
                r7d.l lVar = sVar4.R;
                zdl.c cVar6 = sVar4.f206413j;
                int i21 = this.f206070c;
                if (i21 == 0) {
                    return h7d.d.a(hVar3.f206328a, (i7d.o) hVar3.d.get(), lVar.d());
                }
                if (i21 == 1) {
                    return h7d.f.a(lVar.d(), Optional.empty());
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                pnh.k inputData6 = hVar3.f206329b;
                qnh.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData6, "inputData");
                dfl.i0 i0Var = inputData6.f237789a;
                od0.i.Companion.getClass();
                od0.i iVar = od0.i.f224256b;
                pnh.j jVar = new pnh.j(i0Var, new Data(iVar, null, false, 6, null), new Data(new Pair(null, null), null, false, 6, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), zhm.f0.f322471a, iVar, new Data(iVar, null, false, 6, null), new Data(null, null, true, 3, null), null);
                h9h.a aVar7 = sVar3.d;
                l70.e eVar6 = sVar3.I;
                trl.a aVar8 = sVar3.f0;
                kbh.f fVarS = aVar7.s();
                l80.e eVarH = eVar6.h();
                vc.s.j(eVarH);
                xul.l lVarH = aVar8.h();
                vc.s.j(lVarH);
                xul.l lVarH2 = aVar8.h();
                vc.s.j(lVarH2);
                rnh.i iVar2 = new rnh.i(lVarH2);
                xul.l lVarH3 = aVar8.h();
                vc.s.j(lVarH3);
                rnh.b bVar9 = new rnh.b(lVarH3);
                rnh.o oVar3 = new rnh.o(sVar3.j());
                rnh.c cVar7 = new rnh.c();
                xul.l lVarH4 = aVar8.h();
                vc.s.j(lVarH4);
                rnh.g gVar2 = new rnh.g(lVarH4);
                rnh.j jVar2 = new rnh.j(aVar7.s(), new rnh.a());
                rnh.k kVar2 = new rnh.k(aVar7.s(), new rnh.a());
                rnh.a corporateTransactionMapper = new rnh.a();
                Intrinsics.checkNotNullParameter(corporateTransactionMapper, "corporateTransactionMapper");
                rnh.l lVar2 = new rnh.l();
                j8b.a aVar9 = new j8b.a();
                jx0.a aVar10 = new jx0.a(new t1(hVar3.b()), new r(hVar3.b()), new m8b.q());
                ybl.d dVarH = sVar3.f206413j.h();
                vc.s.j(dVarH);
                ybl.k kVarD5 = sVar3.f.d();
                vc.s.j(kVarD5);
                l80.e eVarH2 = eVar6.h();
                vc.s.j(eVarH2);
                g0 g0Var = new g0(fVarS, eVarH, lVarH, iVar2, bVar9, oVar3, cVar7, gVar2, jVar2, kVar2, lVar2, new h8b.c(aVar9, aVar10, dVarH, kVarD5, eVarH2), new wfl.b());
                ybl.o oVarL = cVar6.l();
                vc.s.j(oVarL);
                ybl.l lVarF2 = sVar4.d.f();
                zxd.c cVarA3 = ((eyd.b) sVar4.U).a();
                vc.s.j(cVarA3);
                ael.d0 d0VarK = cVar6.k();
                vc.s.j(d0VarK);
                ybl.b bVarB = cVar6.b();
                vc.s.j(bVarB);
                ybl.k kVarD6 = sVar4.f.d();
                vc.s.j(kVarD6);
                tga.k kVarB = sVar4.g0.b();
                kgm.c cVarD = sVar4.f206412h0.d();
                yhl.d dVarA = sVar4.c0.a();
                vc.s.j(dVarA);
                ybl.b bVarB2 = sVar3.f206413j.b();
                vc.s.j(bVarB2);
                return new com.revolut.feature.wealth.ui.impl.trades.b(jVar, g0Var, oVarL, lVarF2, cVarA3, d0VarK, bVarB, kVarD6, kVarB, cVarD, dVarA, new fkg.a(bVarB2), new h8b.a(), new rnh.e(), sVar4.V.e(), (i7d.o) hVar3.d.get(), hVar3.f206329b);
            case 6:
                mkh.i iVar3 = (mkh.i) this.d;
                InvestDocumentsDetailsScreenContract$InputData investDocumentsDetailsScreenContract$InputData = iVar3.f206332b;
                s sVar5 = (s) this.f206069b;
                u8h.c cVar8 = sVar5.i;
                int i22 = this.f206070c;
                if (i22 == 0) {
                    BaseScreen screen6 = iVar3.f206331a;
                    wkh.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(screen6, "screen");
                    return (InvestDocumentsDetailsScreen) screen6;
                }
                if (i22 == 1) {
                    return kii.e.j((u8h.b) cVar8, "factory");
                }
                if (i22 == 2) {
                    return new vkh.q((jki.p) iVar3.f206334g.get(), investDocumentsDetailsScreenContract$InputData, sVar5.f206431x.a(), (vi0.b) iVar3.f206335h.get(), sVar5.O.b(), (d1h.e) iVar3.e.get(), sVar5.d.f(), sVar5.f206433y.f());
                }
                if (i22 == 3) {
                    d1h.h hVar4 = (d1h.h) iVar3.f.get();
                    kpj.f fVarJ = sVar5.j();
                    gte.a aVarB4 = sVar5.f206400a.b();
                    vc.s.j(aVarB4);
                    return new com.revolut.feature.wealth.ui.impl.documents.details.b(investDocumentsDetailsScreenContract$InputData, hVar4, fVarJ, aVarB4);
                }
                if (i22 != 4) {
                    if (i22 != 5) {
                        throw new AssertionError(i22);
                    }
                    wkh.a.Companion.getClass();
                    return vi0.a.a(AccountId.Personal.f51414a);
                }
                gah.f factory17 = ((u8h.b) cVar8).a();
                vc.s.j(factory17);
                Intrinsics.checkNotNullParameter(factory17, "factory");
                return new gah.g();
            case 7:
                mkh.j jVar3 = (mkh.j) this.d;
                s sVar6 = (s) this.f206069b;
                h9h.a aVar11 = sVar6.d;
                u8h.c cVar9 = sVar6.i;
                int i32 = this.f206070c;
                if (i32 == 0) {
                    BaseScreen screen7 = jVar3.f206336a;
                    xkh.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(screen7, "screen");
                    return (InvestDocumentsScreen) screen7;
                }
                if (i32 == 1) {
                    return kii.e.j((u8h.b) cVar9, "factory");
                }
                if (i32 == 2) {
                    jki.p pVar = (jki.p) jVar3.f.get();
                    tzg.m mVarT = aVar11.t();
                    vc.s.j(mVarT);
                    return new ukh.m(pVar, mVarT, aVar11.f(), (d1h.e) jVar3.d.get());
                }
                if (i32 == 3) {
                    return new ukh.q(sVar6.j(), (d1h.h) jVar3.e.get());
                }
                if (i32 != 4) {
                    throw new AssertionError(i32);
                }
                gah.f factory18 = ((u8h.b) cVar9).a();
                vc.s.j(factory18);
                Intrinsics.checkNotNullParameter(factory18, "factory");
                return new gah.g();
            case 8:
                s sVar7 = (s) this.f206069b;
                mkh.k kVar3 = (mkh.k) this.d;
                int i33 = this.f206070c;
                if (i33 == 0) {
                    return n57.a.t((o5d.c) kVar3.f206342c.get());
                }
                if (i33 == 1) {
                    return n57.a.w(sVar7.k.a(), kVar3.f206340a);
                }
                if (i33 == 2) {
                    return n57.a.v((o5d.c) kVar3.f206342c.get());
                }
                if (i33 == 3) {
                    return n57.a.g((o5d.c) kVar3.f206342c.get());
                }
                if (i33 == 4) {
                    return new gmh.h(sVar7.d.l(), (o5d.a) kVar3.f206343g.get(), new ac4.g(kVar3.f206341b.b(), new t5d.d()));
                }
                if (i33 == 5) {
                    return n57.a.u((o5d.c) kVar3.f206342c.get());
                }
                throw new AssertionError(i33);
            case 9:
                mkh.l lVar3 = (mkh.l) this.d;
                s sVar8 = lVar3.f206345a;
                s sVar9 = (s) this.f206069b;
                h9h.a aVar12 = sVar9.d;
                int i43 = this.f206070c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new rlh.k();
                    }
                    throw new AssertionError(i43);
                }
                slh.b.Companion.getClass();
                rlh.n nVar2 = new rlh.n(0);
                rlh.a aVar13 = new rlh.a();
                nbh.a aVar14 = new nbh.a();
                t70.g gVarO = sVar8.I.o();
                vc.s.j(gVarO);
                qee.s sVar10 = new qee.s(new rlh.l(aVar13, aVar14, new tlh.b(gVarO, sVar8.f206415l.g())));
                rlh.t tVar = (rlh.t) lVar3.f206346b.get();
                gte.a aVarB5 = sVar9.f206400a.b();
                vc.s.j(aVarB5);
                nlh.b bVarA = sVar9.f206417n.a();
                vc.s.j(bVarA);
                ybl.b bVarB3 = sVar9.f206413j.b();
                vc.s.j(bVarB3);
                ybl.q qVarW = aVar12.w();
                ugc.a aVar15 = new ugc.a(new e8h.c0((ne0.j) aVar12.L.get(), (ue0.c) aVar12.X.get(), (RecurringBuyHubCollectionService) aVar12.B0.get()));
                tzg.m mVarT2 = sVar8.d.t();
                vc.s.j(mVarT2);
                ybl.k kVarD7 = sVar8.f.d();
                vc.s.j(kVarD7);
                gte.a aVarB6 = sVar8.f206400a.b();
                vc.s.j(aVarB6);
                return new rlh.j(nVar2, sVar10, tVar, aVarB5, bVarA, bVarB3, qVarW, aVar15, new tlh.a(mVarT2, kVarD7, aVarB6));
            case 10:
                return a();
            case 11:
                mkh.p pVar2 = (mkh.p) this.d;
                s sVar11 = (s) this.f206069b;
                yah.a aVar16 = sVar11.f206416m;
                ktl.a aVar17 = sVar11.v;
                int i59 = this.f206070c;
                if (i59 == 0) {
                    return ige.d.m(aVar17.b(), pVar2.f206389a, (htl.d) pVar2.e.get());
                }
                if (i59 == 1) {
                    return ige.d.n(aVar17.b());
                }
                if (i59 == 2) {
                    f1h.c cVarA4 = aVar16.a();
                    vc.s.j(cVarA4);
                    return fp8.c.s(cVarA4, pVar2.f206390b, (f1h.b) pVar2.f206392g.get());
                }
                if (i59 == 3) {
                    f1h.c cVarA5 = aVar16.a();
                    vc.s.j(cVarA5);
                    return fp8.c.t(cVarA5);
                }
                if (i59 != 4) {
                    throw new AssertionError(i59);
                }
                s sVar12 = pVar2.d;
                htl.f fVarA = sVar12.v.a();
                f1h.e eVar7 = (f1h.e) sVar12.f206416m.f312023c.get();
                vc.s.j(eVar7);
                fkh.l lVar4 = new fkh.l(fVarA, eVar7, new gkh.a(), new gkh.b(), pVar2.f206391c);
                UnsettledDialogInputData unsettledDialogInputData = pVar2.f206391c;
                vrl.g gVarB = aVar17.f189569a.b();
                vc.s.j(gVarB);
                return new com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.a(lVar4, unsettledDialogInputData, new fkg.a(gVarB), sVar11.d.A(), new gkh.a(), new gkh.b());
            case 12:
                mkh.q qVar = (mkh.q) this.d;
                s sVar13 = (s) this.f206069b;
                h9h.a aVar18 = sVar13.d;
                int i66 = this.f206070c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new ac4.g(sVar13.a());
                    }
                    throw new AssertionError(i66);
                }
                List list = qVar.f206394a;
                tzg.m mVarT3 = aVar18.t();
                vc.s.j(mVarT3);
                ybl.l lVarF3 = aVar18.f();
                ybl.i iVarB = sVar13.f.b();
                vc.s.j(iVarB);
                return new ajh.l(list, mVarT3, lVarF3, iVarB, sVar13.h(), (cli.n) qVar.f206395b.get());
            case 13:
                mlf.a aVar19 = (mlf.a) this.d;
                int i74 = this.f206070c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new vmf.m();
                    }
                    if (i74 == 2) {
                        return new vmf.a();
                    }
                    throw new AssertionError(i74);
                }
                cli.n nVar3 = (cli.n) aVar19.f206709b.get();
                vmf.g gVar3 = (vmf.g) aVar19.f206710c.get();
                EditNoteScreenContract$InputData editNoteScreenContract$InputData = aVar19.f206708a;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) ((mlf.d) this.f206069b).d).c();
                vc.s.j(aVarC);
                return new vmf.l(nVar3, gVar3, editNoteScreenContract$InputData, aVarC);
            case 14:
                mlf.b bVar10 = (mlf.b) this.d;
                mlf.d dVar = (mlf.d) this.f206069b;
                int i92 = this.f206070c;
                switch (i92) {
                    case 0:
                        return kxa.j.k((j60.a) bVar10.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) bVar10.d.get(), (rp0.m) bVar10.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return nga.c.s(dVar.e.c(), (mga.i0) bVar10.f206715h.get(), (mga.f0) bVar10.f206716j.get(), (on.a) bVar10.k.get());
                    case 4:
                        yji.o controller2 = (com.revolut.kompot.navigable.a) bVar10.d.get();
                        cof.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        mga.i0 i0Var2 = (mga.i0) controller2;
                        vc.s.k(i0Var2);
                        return i0Var2;
                    case 5:
                        return nga.c.u(dVar.e.c(), bVar10.f206711a, (wn.a) bVar10.i.get());
                    case 6:
                        return v7.z(dVar.f, "provider");
                    case 7:
                        os2.g factory19 = dVar.f.c();
                        Intrinsics.checkNotNullParameter(factory19, "factory");
                        return (sn.a) factory19.f229224b;
                    case 8:
                        wn.a aVar20 = (wn.a) bVar10.i.get();
                        n57.a.d(aVar20);
                        return aVar20;
                    case 9:
                        LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = bVar10.f206712b;
                        mlf.d dVar2 = bVar10.f206713c;
                        kye.e eVar8 = new kye.e(dVar2.f206736g.d());
                        cli.n nVar4 = (cli.n) bVar10.o.get();
                        hof.d dVarB = bVar10.b();
                        uig.a aVar21 = (uig.a) dVar2.f206760s.f289597b.get();
                        vc.s.j(aVar21);
                        kgm.i iVar4 = new kgm.i(aVar21, dVar2.f206763t.e());
                        j60.a aVar22 = (j60.a) bVar10.f.get();
                        pff.a aVar23 = (pff.a) dVar.u.f224814p.get();
                        vc.s.j(aVar23);
                        gte.a aVarB7 = dVar.f206729c.b();
                        vc.s.j(aVarB7);
                        zxd.c cVarA6 = ((eyd.b) dVar.v).a();
                        vc.s.j(cVarA6);
                        gte.a aVarB8 = dVar2.f206729c.b();
                        vc.s.j(aVarB8);
                        return new bof.q(linkedTransactionScreenContract$InputData, eVar8, nVar4, dVarB, iVar4, aVar22, aVar23, aVarB7, cVarA6, new vnf.a(aVarB8), dVar.o.i());
                    case 10:
                        return new bof.r((wnf.b) bVar10.f206719n.get(), bVar10.b(), bVar10.f206712b);
                    case 11:
                        qd0.b bVarN = bVar10.f206713c.f206726b.n();
                        vc.s.j(bVarN);
                        u80.m mVar3 = new u80.m(bVarN);
                        djf.c cVar10 = dVar.f206738h;
                        l70.e eVar9 = dVar.f206726b;
                        jr9.a aVar24 = dVar.i;
                        djf.c cVar11 = dVar.f206738h;
                        thf.m mVarG = cVar10.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar11.d();
                        vc.s.j(dVarD);
                        thf.c cVarC = cVar11.c();
                        vc.s.j(cVarC);
                        gte.a aVarB9 = bVar10.f206713c.f206729c.b();
                        vc.s.j(aVarB9);
                        vnf.a aVar25 = new vnf.a(aVarB9);
                        nq9.a aVarA = aVar24.a();
                        vc.s.j(aVarA);
                        nq9.e eVar10 = (nq9.e) aVar24.f.get();
                        vc.s.j(eVar10);
                        w0a.h hVar5 = (w0a.h) ((j1a.i) dVar.f206742j).u.get();
                        vc.s.j(hVar5);
                        gte.a aVarB10 = dVar.f206729c.b();
                        vc.s.j(aVarB10);
                        whf.n nVarB = cVar11.b();
                        vc.s.j(nVarB);
                        l4i.a aVar26 = new l4i.a();
                        u80.t tVarU = eVar9.u();
                        vc.s.j(tVarU);
                        v2k.c cVarA7 = dVar.k.a();
                        nmc.d dVarD2 = dVar.f206746l.d();
                        qd0.b bVarN2 = eVar9.n();
                        vc.s.j(bVarN2);
                        gi0.a aVar27 = new gi0.a();
                        cm4.f fVarF = dVar.f206749n.f();
                        wnf.g gVar4 = new wnf.g();
                        wa7.p pVarE = dVar.o.e();
                        thf.g gVarE = cVar11.e();
                        vc.s.j(gVarE);
                        return new wnf.e(mVar3, mVarG, dVarD, cVarC, aVar25, aVarA, eVar10, hVar5, aVarB10, nVarB, aVar26, tVarU, cVarA7, dVarD2, bVarN2, aVar27, fVarF, gVar4, pVarE, gVarE);
                    default:
                        throw new AssertionError(i92);
                }
            case 15:
                return b();
            case 16:
                return c();
            case 17:
                mlg.a aVar28 = (mlg.a) this.d;
                int i96 = this.f206070c;
                if (i96 == 0) {
                    return new tlg.h((cli.n) aVar28.f206940b.get(), aVar28.f206939a, (hlg.b) ((mlg.b) this.f206069b).o.get());
                }
                if (i96 == 1) {
                    return new tlg.g();
                }
                throw new AssertionError(i96);
            case 18:
                return d();
            case 19:
                return e();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                ms1.q qVar2 = (ms1.q) this.d;
                int i99 = this.f206070c;
                if (i99 == 0) {
                    return kxa.j.l((j60.a) qVar2.f208570c.get());
                }
                if (i99 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) qVar2.f208568a.get(), (rp0.m) qVar2.f208569b.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 == 3) {
                    return new ht1.k((ps1.b) ((ms1.j) this.f206069b).D.get(), new it1.a(), (j60.a) qVar2.f208570c.get(), (jki.p) qVar2.e.get());
                }
                if (i99 == 4) {
                    return new ht1.m();
                }
                throw new AssertionError(i99);
        }
    }

    public Object o() {
        mlf.d dVar = (mlf.d) this.f206069b;
        mlf.e eVar = (mlf.e) this.d;
        int i = this.f206070c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) eVar.o.get());
            case 1:
                return f0k.d.v((com.revolut.kompot.navigable.a) eVar.f206804g.get(), eVar.L0(), f60.x.a(), (rp0.m) eVar.f206822l.get(), (e60.t) eVar.f206827n.get(), new nji.b());
            case 2:
                f80.a aVarX = dVar.f206726b.x();
                vc.s.j(aVarX);
                l80.e eVarH = dVar.f206726b.h();
                vc.s.j(eVarH);
                zk0.b bVarL = dVar.f206726b.l();
                vc.s.j(bVarL);
                return new t80.b(aVarX, eVarH, bVarL);
            case 3:
                return pli.c.a(eVar.J0());
            case 4:
                gmf.f.Companion.getClass();
                return new t80.c(new e.a("txn_receipts"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 5:
                return t96.a.a();
            case 6:
                return f60.z.a();
            case 7:
                aii.o oVar = (aii.o) eVar.f206824m.get();
                y80.a aVarR = dVar.f206726b.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, eVar.n0(), Optional.empty());
            case 8:
                return gmf.b.t((com.revolut.kompot.navigable.a) eVar.f206804g.get(), (rp0.m) eVar.f206845q.get(), kxa.j.o(new nji.b()));
            case 9:
                return gmf.c.a();
            case 10:
                return gg0.g.q((com.revolut.kompot.navigable.a) eVar.f206804g.get(), (rp0.m) eVar.f206854s.get(), kxa.j.o(new nji.b()));
            case 11:
                return gmf.a.a();
            case 12:
                return nga.c.w(dVar.e.c(), (mga.l0) eVar.u.get(), (mga.f0) eVar.f206869w.get(), (on.a) eVar.f206873x.get());
            case 13:
                return gmf.b.z((com.revolut.kompot.navigable.a) eVar.f206804g.get());
            case 14:
                return nga.c.l(dVar.e.c(), eVar.f206777a, (wn.a) eVar.v.get());
            case 15:
                return n57.a.b(dVar.f.b());
            case 16:
                return pl1.d.A(dVar.f.c());
            case 17:
                return gmf.b.s((bub.a) eVar.z.get());
            case 18:
                return gmf.b.r(new g2e.t(dVar.f206771x.f326229b));
            case 19:
                return o5k.d.a((n5k.b) eVar.H.get());
            case 20:
                jlf.h hVarW0 = eVar.W0();
                p5k.k kVarX0 = eVar.X0();
                ffk.t tVarF = dVar.O.f();
                vc.s.j(tVarF);
                ang.f fVarC = dVar.f206757r.c();
                wif.a aVarA = dVar.N.a();
                gte.a aVarB = dVar.f206729c.b();
                vc.s.j(aVarB);
                j60.a aVar = (j60.a) eVar.f206850r.get();
                qpk.b bVarA = dVar.P.a();
                v2k.c cVarA = dVar.k.a();
                mre.c cVarB = dVar.Q.b();
                vc.s.j(cVarB);
                z0h.a aVarB2 = ((u8h.b) dVar.L).b();
                vc.s.j(aVarB2);
                return new n5k.p(hVarW0, kVarX0, tVarF, fVarC, aVarA, aVarB, aVar, bVarA, cVarA, cVarB, aVarB2, eVar.V(), dVar.R.b(), (n5k.q) eVar.G.get());
            case 21:
                CoroutineScope coroutineScope = (CoroutineScope) eVar.B.get();
                k71.i iVar = (k71.i) eVar.C.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC);
                k61.a aVarE = dVar.f206774y.e();
                vc.s.j(aVarE);
                return new h0(coroutineScope, iVar, aVarC, aVarE, dVar.f206757r.c(), dVar.z.b(), eVar.j(), dVar.o.d(), (znf.c) eVar.D.get());
            case 22:
                gmf.f.Companion.getClass();
                skm.p0 p0Var = skm.p0.f264001a;
                return rd0.e.a(zkm.o.f323119a.e);
            case 23:
                return gmf.b.y(eVar.f206784b);
            case 24:
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC2);
                nhf.a aVarA2 = dVar.A.a();
                vc.s.j(aVarA2);
                return new znf.c(aVarC2, aVarA2);
            case 25:
                aah.i iVarD = ((u8h.b) dVar.L).d();
                vc.s.j(iVarD);
                return o5k.i.C(iVarD);
            case 26:
                return new n5k.r(new RateExplanationDialogMapper());
            case 27:
                return o5k.i.a((n5k.q) eVar.G.get());
            case 28:
                byc.k kVarA = ((vxc.b) dVar.S).a();
                vc.s.j(kVarA);
                return xhi.f.i(kVarA);
            case 29:
                dmf.d dVar2 = (dmf.d) eVar.L.get();
                efk.j.B(dVar2);
                return dVar2;
            case 30:
                h0 h0Var = (h0) eVar.E.get();
                sjf.e eVarD = ((bjf.a) dVar.d).d();
                vc.s.j(eVarD);
                l80.e eVarH2 = dVar.f206726b.h();
                vc.s.j(eVarH2);
                return new dmf.d(h0Var, eVarD, eVarH2, eVar.o1(), (k71.i) eVar.C.get());
            case 31:
                e60.t tVar = (e60.t) eVar.f206827n.get();
                f60.w.a(tVar);
                return tVar;
            case 32:
                zo6.a aVarA3 = dVar.U.a();
                vc.s.j(aVarA3);
                return gg0.g.r(aVarA3, (j60.a) eVar.f206858t.get(), (g1) eVar.O.get());
            case 33:
                return gmf.b.v((com.revolut.kompot.navigable.a) eVar.f206804g.get());
            case 34:
                wn.a aVar2 = (wn.a) eVar.v.get();
                n57.a.d(aVar2);
                return aVar2;
            case 35:
                mkd.g gVar = eVar.f206790c;
                rkd.m mVarA = dVar.V.a();
                vc.s.j(mVarA);
                return gmf.b.w(gVar, mVarA);
            case 36:
                h0 h0Var2 = (h0) eVar.E.get();
                gte.a aVarB3 = dVar.f206729c.b();
                vc.s.j(aVarB3);
                return new akf.x0(h0Var2, aVarB3);
            case 37:
                h0 h0Var3 = (h0) eVar.E.get();
                cl3.a aVarD = dVar.W.d();
                vc.s.j(aVarD);
                g48.r0 r0VarC = dVar.X.c();
                bmf.b bVar = new bmf.b();
                y21.c cVarC = ((c21.b) dVar.Y).c();
                mq9.f fVarC2 = dVar.Z.c();
                vc.s.j(fVarC2);
                gkf.n nVar = new gkf.n();
                dVar.F.getClass();
                ejf.b.Companion.getClass();
                od0.i.Companion.getClass();
                return new akf.s1(h0Var3, aVarD, r0VarC, bVar, cVarC, fVarC2, nVar, (gkf.l) eVar.X.get(), new gkf.h(), ((j1a.i) dVar.f206742j).a(), ((j1a.i) dVar.f206742j).c());
            case 38:
                h0 h0Var4 = (h0) eVar.E.get();
                m1 m1Var = (m1) eVar.T.get();
                c61.a aVar3 = (c61.a) dVar.Z.M.get();
                vc.s.j(aVar3);
                return new gkf.l(h0Var4, m1Var, aVar3, dVar.D.a(), (klf.n2) eVar.U.get(), (k71.i) eVar.C.get(), (gkf.a) eVar.W.get(), new gkf.g());
            case 39:
                CoroutineScope coroutineScope2 = (CoroutineScope) eVar.B.get();
                h0 h0Var5 = (h0) eVar.E.get();
                hj8.a aVarA4 = dVar.f206725a0.a();
                vc.s.j(aVarA4);
                wsg.b bVarA2 = dVar.z.a();
                gte.a aVarB4 = dVar.f206729c.b();
                vc.s.j(aVarB4);
                xqe.b bVarA3 = dVar.f206727b0.a();
                vc.s.j(bVarA3);
                return new m1(coroutineScope2, h0Var5, aVarA4, bVarA2, aVarB4, bVarA3);
            case 40:
                CoroutineScope coroutineScope3 = (CoroutineScope) eVar.B.get();
                k71.i iVar2 = (k71.i) eVar.C.get();
                u71.a aVarG = ((c21.b) dVar.Y).g();
                vc.s.j(aVarG);
                fnc.s sVarB = ((j1a.i) dVar.f206742j).b();
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC3);
                gte.a aVarB5 = dVar.f206729c.b();
                vc.s.j(aVarB5);
                return new klf.n2(coroutineScope3, iVar2, aVarG, sVarB, aVarC3, aVarB5);
            case 41:
                z2 z2Var = (z2) eVar.V.get();
                gte.a aVarB6 = dVar.f206729c.b();
                vc.s.j(aVarB6);
                return new gkf.a(z2Var, aVarB6, ((j1a.i) dVar.f206742j).a());
            case 42:
                CoroutineScope coroutineScope4 = (CoroutineScope) eVar.B.get();
                h0 h0Var6 = (h0) eVar.E.get();
                k71.i iVar3 = (k71.i) eVar.C.get();
                xua.a aVarA5 = dVar.c0.a();
                vc.s.j(aVarA5);
                gte.a aVarB7 = dVar.f206729c.b();
                vc.s.j(aVarB7);
                return new z2(coroutineScope4, h0Var6, iVar3, aVarA5, aVarB7);
            case 43:
                z2 z2Var2 = (z2) eVar.V.get();
                klf.c cVar = (klf.c) eVar.Z.get();
                h0 h0Var7 = (h0) eVar.E.get();
                m1 m1Var2 = (m1) eVar.T.get();
                jla.h hVarA = dVar.f206733e0.a();
                gte.a aVarB8 = dVar.f206729c.b();
                vc.s.j(aVarB8);
                vr2.d dVar3 = (vr2.d) dVar.f206731d0.F.get();
                vc.s.j(dVar3);
                dVar.F.getClass();
                ejf.b.Companion.getClass();
                od0.i.Companion.getClass();
                return new akf.x(z2Var2, cVar, h0Var7, m1Var2, hVarA, aVarB8, dVar3);
            case 44:
                CoroutineScope coroutineScope5 = (CoroutineScope) eVar.B.get();
                ur2.c cVarA2 = dVar.f206731d0.a();
                vc.s.j(cVarA2);
                return new klf.c(coroutineScope5, cVarA2, (m1) eVar.T.get(), (h0) eVar.E.get());
            case 45:
                h0 h0Var8 = (h0) eVar.E.get();
                m1 m1Var3 = (m1) eVar.T.get();
                vz1.g gVarH = ((lz1.m) dVar.f0).h();
                vc.s.j(gVarH);
                return new akf.p0(h0Var8, m1Var3, gVarH, new wlf.b(new bmf.b()));
            case 46:
                return new akf.l0((klf.g1) eVar.c0.get(), (m1) eVar.T.get(), (k71.i) eVar.C.get());
            case 47:
                CoroutineScope coroutineScope6 = (CoroutineScope) eVar.B.get();
                k71.i iVar4 = (k71.i) eVar.C.get();
                h0 h0Var9 = (h0) eVar.E.get();
                al4.m mVarR = dVar.E.r();
                vc.s.j(mVarR);
                return new klf.g1(coroutineScope6, iVar4, h0Var9, mVarR, dVar.f206749n.a());
            case 48:
                m1 m1Var4 = (m1) eVar.T.get();
                k71.i iVar5 = (k71.i) eVar.C.get();
                h0 h0Var10 = (h0) eVar.E.get();
                al4.e eVarP = dVar.E.p();
                vc.s.j(eVarP);
                return new akf.i0(m1Var4, iVar5, h0Var10, eVarP);
            case 49:
                h0 h0Var11 = (h0) eVar.E.get();
                m1 m1Var5 = (m1) eVar.T.get();
                c73.j jVar = dVar.g0;
                return new akf.f1(h0Var11, m1Var5, new f73.c());
            case 50:
                h0 h0Var12 = (h0) eVar.E.get();
                m1 m1Var6 = (m1) eVar.T.get();
                gte.a aVarB9 = dVar.f206729c.b();
                vc.s.j(aVarB9);
                l61.a aVarB10 = eVar.d.f206757r.b();
                vc.s.j(aVarB10);
                return new akf.q(h0Var12, m1Var6, aVarB9, new t1(aVarB10), eVar.B());
            case 51:
                h0 h0Var13 = (h0) eVar.E.get();
                m1 m1Var7 = (m1) eVar.T.get();
                l61.a aVarB11 = eVar.d.f206757r.b();
                vc.s.j(aVarB11);
                return new akf.b0(h0Var13, m1Var7, new t1(aVarB11));
            case 52:
                return new akf.c((h0) eVar.E.get(), (m1) eVar.T.get(), (rhf.d) eVar.i0.get());
            case 53:
                TransactionDetailsScreenContract$InputData inputData = eVar.f206784b;
                gmf.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                rhf.d dVar4 = inputData.f92058b;
                vc.s.k(dVar4);
                return dVar4;
            case 54:
                h0 h0Var14 = (h0) eVar.E.get();
                g2e.t tVarS = eVar.s();
                m1 m1Var8 = (m1) eVar.T.get();
                sy1.d dVarA = dVar.i0.a();
                oy1.b bVarB = dVar.i0.b();
                mjf.u uVarA = dVar.j0.a();
                vc.s.j(uVarA);
                return new akf.k(h0Var14, tVarS, m1Var8, dVarA, bVarB, uVarA);
            case 55:
                h0 h0Var15 = (h0) eVar.E.get();
                a12.v vVar = (a12.v) dVar.f206744k0.F.get();
                vc.s.j(vVar);
                vz1.a aVar4 = (vz1.a) ((lz1.m) dVar.f0).C.get();
                vc.s.j(aVar4);
                return new lkf.d(h0Var15, vVar, aVar4);
            case 56:
                h0 h0Var16 = (h0) eVar.E.get();
                m1 m1Var9 = (m1) eVar.T.get();
                dVar.F.getClass();
                ejf.b.Companion.getClass();
                od0.i.Companion.getClass();
                gte.a aVarB12 = dVar.f206729c.b();
                vc.s.j(aVarB12);
                return new bkf.h(h0Var16, m1Var9, aVarB12);
            case 57:
                return new ckf.i((h0) eVar.E.get());
            case 58:
                return new ckf.e((h0) eVar.E.get());
            case 59:
                h0 h0Var17 = (h0) eVar.E.get();
                m1 m1Var10 = (m1) eVar.T.get();
                com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c cVarQ1 = eVar.q1();
                t70.g gVarO = ((b3j.p) eVar.d.l0).d.o();
                vc.s.j(gVarO);
                return new ikf.j(h0Var17, m1Var10, cVarQ1, new com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.a(new m3j.d(gVarO)), new com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.b(new x2k.e(), eVar.d.S()));
            case 60:
                h0 h0Var18 = (h0) eVar.E.get();
                m1 m1Var11 = (m1) eVar.T.get();
                mjf.u uVarA2 = dVar.j0.a();
                vc.s.j(uVarA2);
                bmf.b bVar2 = new bmf.b();
                k71.i iVar6 = (k71.i) eVar.C.get();
                gte.a aVarB13 = dVar.f206729c.b();
                vc.s.j(aVarB13);
                com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC4);
                return new ikf.h(h0Var18, m1Var11, uVarA2, bVar2, iVar6, aVarB13, aVarC4);
            case 61:
                h0 h0Var19 = (h0) eVar.E.get();
                m1 m1Var12 = (m1) eVar.T.get();
                ffk.t tVarF2 = dVar.O.f();
                vc.s.j(tVarF2);
                return new akf.u0(h0Var19, m1Var12, tVarF2);
            case 62:
                return new zkf.k((h0) eVar.E.get(), (m1) eVar.T.get());
            case 63:
                return new vkf.f((h0) eVar.E.get(), (m1) eVar.T.get(), (kof.f) dVar.F1.get());
            case 64:
                h0 h0Var20 = (h0) eVar.E.get();
                m1 m1Var13 = (m1) eVar.T.get();
                k61.a aVarE2 = dVar.f206774y.e();
                vc.s.j(aVarE2);
                return new c1(h0Var20, m1Var13, aVarE2, dVar.f206769w.d(), (f01.a) eVar.u0.get());
            case 65:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) eVar.f206804g.get();
                gmf.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new f01.c(controller.m2());
            case 66:
                h0 h0Var21 = (h0) eVar.E.get();
                m1 m1Var14 = (m1) eVar.T.get();
                com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC5);
                return new ekf.j(h0Var21, m1Var14, aVarC5, new bmf.b());
            case 67:
                return new lkf.c0((h0) eVar.E.get());
            case 68:
                h0 h0Var22 = (h0) eVar.E.get();
                m1 m1Var15 = (m1) eVar.T.get();
                zd8.a aVar5 = dVar.q0;
                tr8.a aVar6 = dVar.f206758r0;
                ao.h hVarA2 = aVar5.a();
                e3 e3VarB = aVar6.b();
                ekf.p pVar = new ekf.p();
                lr8.a aVar7 = (lr8.a) eVar.d.f206758r0.f273760p.get();
                vc.s.j(aVar7);
                ekf.q qVar = new ekf.q(aVar7);
                lr8.a aVar8 = (lr8.a) aVar6.f273760p.get();
                vc.s.j(aVar8);
                return new ekf.v(h0Var22, m1Var15, hVarA2, e3VarB, pVar, qVar, aVar8);
            case 69:
                h0 h0Var23 = (h0) eVar.E.get();
                m0 m0Var = (m0) eVar.z0.get();
                ekf.y yVar = new ekf.y(new ekf.w());
                cl3.a aVarD2 = dVar.W.d();
                vc.s.j(aVarD2);
                g48.r0 r0VarC2 = dVar.X.c();
                y8k.b bVarA4 = dVar.f206761s0.a();
                mjf.u uVarA3 = dVar.j0.a();
                vc.s.j(uVarA3);
                return new ekf.i0(h0Var23, m0Var, yVar, aVarD2, r0VarC2, bVarA4, uVarA3, (ekf.w0) eVar.A0.get());
            case 70:
                return new m0((h0) eVar.E.get(), (m1) eVar.T.get(), ((c21.b) dVar.Y).c(), dVar.D.a());
            case 71:
                com.revolut.domain.interactors.transactions.a aVarC6 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC6);
                ife.d dVar5 = (ife.d) dVar.f206764t0.f204992b.get();
                vc.s.j(dVar5);
                return new ekf.w0(aVarC6, dVar5, new ekf.d1());
            case 72:
                h0 h0Var24 = (h0) eVar.E.get();
                m1 m1Var16 = (m1) eVar.T.get();
                p2k.f fVar = dVar.m0;
                x2k.e eVar2 = new x2k.e();
                mjf.u uVarA4 = dVar.j0.a();
                vc.s.j(uVarA4);
                cw9.d dVarA2 = dVar.D.a();
                co9.b bVarB2 = dVar.u0.b();
                vc.s.j(bVarB2);
                mlf.d dVar6 = eVar.d;
                cl3.a aVarD3 = dVar6.W.d();
                vc.s.j(aVarD3);
                co9.b bVarB3 = dVar6.u0.b();
                vc.s.j(bVarB3);
                return new ekf.f(h0Var24, m1Var16, eVar2, uVarA4, dVarA2, bVarB2, new fkf.i(new r10.q(aVarD3, bVarB3, eVar.H())), eVar.H(), (ekf.w0) eVar.A0.get());
            case 73:
                h0 h0Var25 = (h0) eVar.E.get();
                com.revolut.domain.interactors.transactions.a aVarC7 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC7);
                nhf.a aVarA6 = dVar.A.a();
                vc.s.j(aVarA6);
                thf.g gVarE = dVar.f206738h.e();
                vc.s.j(gVarE);
                thf.d dVarD = dVar.f206738h.d();
                vc.s.j(dVarD);
                return new mkf.i0(h0Var25, aVarC7, aVarA6, gVarE, dVarD);
            case 74:
                h0 h0Var26 = (h0) eVar.E.get();
                z2 z2Var3 = (z2) eVar.V.get();
                m1 m1Var17 = (m1) eVar.T.get();
                c9e.c cVarB2 = dVar.f206767v0.b();
                vc.s.j(cVarB2);
                kpj.f fVar2 = new kpj.f(14, (Set) eVar.E0.get());
                t70.g gVarO2 = eVar.d.f206726b.o();
                vc.s.j(gVarO2);
                return new mkf.c0(h0Var26, z2Var3, m1Var17, cVarB2, fVar2, new mkf.d0(gVarO2), new bmf.b());
            case 75:
                TransactionDetailsScreenContract$InputData inputData2 = eVar.f206784b;
                gmf.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                Set set = inputData2.f92059c;
                vc.s.k(set);
                return set;
            case 76:
                z2 z2Var4 = (z2) eVar.V.get();
                m1 m1Var18 = (m1) eVar.T.get();
                c9e.c cVarB3 = dVar.f206767v0.b();
                vc.s.j(cVarB3);
                return new skf.f(z2Var4, m1Var18, cVarB3, new skf.d(), new skf.g());
            case 77:
                h0 h0Var27 = (h0) eVar.E.get();
                m1 m1Var19 = (m1) eVar.T.get();
                rul.e eVarA = dVar.f206770w0.a();
                a2c.e eVarB = dVar.f206770w0.b();
                gte.a aVarB14 = eVar.d.f206729c.b();
                vc.s.j(aVarB14);
                return new dkf.g(h0Var27, m1Var19, eVarA, eVarB, new dkf.b(new dkf.a(aVarB14, 0)));
            case 78:
                h0 h0Var28 = (h0) eVar.E.get();
                m1 m1Var20 = (m1) eVar.T.get();
                com.revolut.domain.interactors.transactions.a aVarC8 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC8);
                return new ekf.m(h0Var28, m1Var20, aVarC8, new bmf.b(), new fkf.j());
            case 79:
                return new akf.j1((h0) eVar.E.get());
            case 80:
                return new kkf.c((h0) eVar.E.get(), new unf.b());
            case 81:
                h0 h0Var29 = (h0) eVar.E.get();
                th0.a aVar9 = dVar.f206748m;
                return new kkf.m1(h0Var29, new gi0.a());
            case 82:
                h0 h0Var30 = (h0) eVar.E.get();
                m1 m1Var21 = (m1) eVar.T.get();
                tga.k kVarB = dVar.f206756q.b();
                prl.e eVarZ1 = eVar.z1();
                gte.a aVarB15 = dVar.f206729c.b();
                vc.s.j(aVarB15);
                return new f9(h0Var30, m1Var21, kVarB, eVarZ1, aVarB15);
            case 83:
                h0 h0Var31 = (h0) eVar.E.get();
                vlf.b bVar3 = (vlf.b) eVar.O0.get();
                klf.i iVar7 = (klf.i) eVar.P0.get();
                m1 m1Var22 = (m1) eVar.T.get();
                wlf.a aVarN0 = eVar.N0();
                dVar.F.getClass();
                ejf.b.Companion.getClass();
                od0.i.Companion.getClass();
                return new kkf.i(h0Var31, bVar3, iVar7, m1Var22, aVarN0);
            case 84:
                wnf.b bVar4 = (wnf.b) eVar.N0.get();
                thf.m mVarG = dVar.f206738h.g();
                vc.s.j(mVarG);
                thf.d dVarD2 = dVar.f206738h.d();
                vc.s.j(dVarD2);
                return new vlf.b(bVar4, mVarG, dVarD2, dVar.o.e(), new t1j.b((wnf.b) eVar.N0.get()), (rhf.d) eVar.i0.get());
            case 85:
                qd0.b bVarN = eVar.d.f206726b.n();
                vc.s.j(bVarN);
                u80.m mVar = new u80.m(bVarN);
                djf.c cVar2 = dVar.f206738h;
                jr9.a aVar10 = dVar.i;
                thf.m mVarG2 = cVar2.g();
                vc.s.j(mVarG2);
                thf.d dVarD3 = dVar.f206738h.d();
                vc.s.j(dVarD3);
                thf.c cVarC2 = dVar.f206738h.c();
                vc.s.j(cVarC2);
                gte.a aVarB16 = eVar.d.f206729c.b();
                vc.s.j(aVarB16);
                vnf.a aVar11 = new vnf.a(aVarB16);
                nq9.a aVarA7 = aVar10.a();
                vc.s.j(aVarA7);
                nq9.e eVar3 = (nq9.e) aVar10.f.get();
                vc.s.j(eVar3);
                w0a.h hVar = (w0a.h) ((j1a.i) dVar.f206742j).u.get();
                vc.s.j(hVar);
                gte.a aVarB17 = dVar.f206729c.b();
                vc.s.j(aVarB17);
                whf.n nVarB = dVar.f206738h.b();
                vc.s.j(nVarB);
                l4i.a aVar12 = new l4i.a();
                u80.t tVarU = dVar.f206726b.u();
                vc.s.j(tVarU);
                v2k.c cVarA3 = dVar.k.a();
                nmc.d dVarD4 = dVar.f206746l.d();
                qd0.b bVarN2 = dVar.f206726b.n();
                vc.s.j(bVarN2);
                gi0.a aVar13 = new gi0.a();
                cm4.f fVarF = dVar.f206749n.f();
                wnf.g gVar2 = new wnf.g();
                wa7.p pVarE = dVar.o.e();
                thf.g gVarE2 = dVar.f206738h.e();
                vc.s.j(gVarE2);
                return new wnf.e(mVar, mVarG2, dVarD3, cVarC2, aVar11, aVarA7, eVar3, hVar, aVarB17, nVarB, aVar12, tVarU, cVarA3, dVarD4, bVarN2, aVar13, fVarF, gVar2, pVarE, gVarE2);
            case 86:
                CoroutineScope coroutineScope7 = (CoroutineScope) eVar.B.get();
                h0 h0Var32 = (h0) eVar.E.get();
                l93.f fVarJ = dVar.f206772x0.j();
                vc.s.j(fVarJ);
                return new klf.i(coroutineScope7, h0Var32, fVarJ, dVar.y0.a());
            case 87:
                thf.m mVarG3 = dVar.f206738h.g();
                vc.s.j(mVarG3);
                return new ynf.k(mVarG3, (f01.a) eVar.u0.get(), (wnf.b) eVar.N0.get(), dVar.o.e());
            case 88:
                h0 h0Var33 = (h0) eVar.E.get();
                m1 m1Var23 = (m1) eVar.T.get();
                eub.a aVarA8 = dVar.z0.a();
                vc.s.j(aVarA8);
                com.revolut.feature.rev_points.api.navigation.a aVarA9 = dVar.A0.a();
                vc.s.j(aVarA9);
                return new t5(h0Var33, m1Var23, aVarA8, aVarA9, (vlf.b) eVar.O0.get());
            case 89:
                h0 h0Var34 = (h0) eVar.E.get();
                bw9.a aVar14 = dVar.D;
                j1a.a aVar15 = dVar.B0;
                cw9.d dVarA3 = aVar14.a();
                klf.n2 n2Var = (klf.n2) eVar.U.get();
                m1 m1Var24 = (m1) eVar.T.get();
                w0a.h hVar2 = (w0a.h) ((j1a.i) dVar.f206742j).u.get();
                vc.s.j(hVar2);
                m1a.q qVarB = aVar15.b();
                m1a.i iVarA = aVar15.a();
                cl3.a aVarD4 = dVar.W.d();
                vc.s.j(aVarD4);
                return new e7(h0Var34, dVarA3, n2Var, m1Var24, hVar2, qVarB, iVarA, aVarD4, (b2) eVar.T0.get());
            case 90:
                q1a.b bVarC = ((j1a.i) dVar.f206742j).c();
                mq9.f fVarC3 = dVar.Z.c();
                vc.s.j(fVarC3);
                return new b2(bVarC, fVarC3, dVar.B0.b());
            case 91:
                h0 h0Var35 = (h0) eVar.E.get();
                m1 m1Var25 = (m1) eVar.T.get();
                elf.e eVar4 = (elf.e) eVar.V0.get();
                thf.c cVarC3 = dVar.f206738h.c();
                vc.s.j(cVarC3);
                return new kkf.e(h0Var35, m1Var25, eVar4, cVarC3);
            case 92:
                h0 h0Var36 = (h0) eVar.E.get();
                tsi.b bVar5 = (tsi.b) dVar.C0.f291811g.get();
                vc.s.j(bVar5);
                eqj.g gVarG = ((dqj.r) dVar.D0).g();
                vc.s.j(gVarG);
                return new elf.e(h0Var36, bVar5, gVarG);
            case 93:
                h0 h0Var37 = (h0) eVar.E.get();
                nhf.a aVarA10 = dVar.A.a();
                vc.s.j(aVarA10);
                return new i7(h0Var37, aVarA10, (z2) eVar.V.get(), (klf.c) eVar.Z.get());
            case 94:
                h0 h0Var38 = (h0) eVar.E.get();
                t70.b bVarG = eVar.d.f206726b.g();
                vc.s.j(bVarG);
                return new kkf.w0(h0Var38, new g2e.t(bVarG));
            case 95:
                h0 h0Var39 = (h0) eVar.E.get();
                b1 b1Var = (b1) eVar.Z0.get();
                ea6.b bVar6 = (ea6.b) dVar.E0.Y.get();
                vc.s.j(bVar6);
                mlf.d dVar7 = eVar.d;
                sa6.z externalDonationsInteractor = (sa6.z) dVar7.E0.W.get();
                Intrinsics.checkNotNullParameter(externalDonationsInteractor, "externalDonationsInteractor");
                dcl.q factory = new dcl.q();
                sri.m navigator = dVar7.S();
                gmf.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                return new kkf.p0(h0Var39, b1Var, bVar6, new cb6.a(navigator, externalDonationsInteractor));
            case 96:
                CoroutineScope coroutineScope8 = (CoroutineScope) eVar.B.get();
                h0 h0Var40 = (h0) eVar.E.get();
                a31.a aVarA11 = dVar.E0.f234384a.a();
                sa6.z zVar = (sa6.z) dVar.E0.W.get();
                vc.s.j(zVar);
                n8b.a aVarA12 = dVar.T.a();
                vc.s.j(aVarA12);
                return new b1(coroutineScope8, h0Var40, aVarA11, zVar, aVarA12);
            case 97:
                h0 h0Var41 = (h0) eVar.E.get();
                u80.t tVarU2 = dVar.f206726b.u();
                vc.s.j(tVarU2);
                qd0.b bVarN3 = dVar.f206726b.n();
                vc.s.j(bVarN3);
                return new kkf.s0(h0Var41, tVarU2, bVarN3);
            case 98:
                h0 h0Var42 = (h0) eVar.E.get();
                m1 m1Var26 = (m1) eVar.T.get();
                vac.a aVar16 = dVar.F0;
                l70.e eVar5 = dVar.f206726b;
                vac.a aVar17 = dVar.F0;
                wac.a aVar18 = (wac.a) aVar16.f287258n.get();
                vc.s.j(aVar18);
                kac.e eVar6 = (kac.e) aVar17.o.get();
                vc.s.j(eVar6);
                qac.b bVar7 = (qac.b) aVar17.f287257m.get();
                vc.s.j(bVar7);
                c70.a aVarZ = eVar5.z();
                vc.s.j(aVarZ);
                r70.c cVarA4 = eVar5.A();
                vc.s.j(cVarA4);
                return new i1(h0Var42, m1Var26, aVar18, eVar6, bVar7, aVarZ, cVarA4);
            case 99:
                return new okf.k((klf.g1) eVar.c0.get(), (vlf.b) eVar.O0.get());
            default:
                throw new AssertionError(i);
        }
    }

    public Object p() {
        mlf.d dVar = (mlf.d) this.f206069b;
        mlf.e eVar = (mlf.e) this.d;
        int i = this.f206070c;
        switch (i) {
            case 200:
                h0 h0Var = (h0) eVar.E.get();
                m1 m1Var = (m1) eVar.T.get();
                thf.m mVarG = dVar.f206738h.g();
                vc.s.j(mVarG);
                return new elf.p0(h0Var, m1Var, mVarG);
            case 201:
                g76.a aVar = dVar.f206743j1;
                return ige.d.i(new f61.a(new i76.c()));
            case 202:
                return new elf.d2((j60.a) eVar.f206850r.get(), dVar.k.a());
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1 /* 203 */:
                ppg.b bVarB = ((wpg.l) dVar.B).b();
                vc.s.j(bVarB);
                kpg.a aVar2 = (kpg.a) ((wpg.l) dVar.B).I.get();
                vc.s.j(aVar2);
                clc.b bVarA = dVar.f206745k1.a();
                vc.s.j(bVarA);
                return new elf.z1(bVarB, aVar2, bVarA);
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2 /* 204 */:
                mq9.f fVarC = dVar.Z.c();
                vc.s.j(fVarC);
                return new elf.j0(fVarC);
            case Constants.TAG_KSN_FORMATS /* 205 */:
                return new t0();
            case 206:
                h0 h0Var2 = (h0) eVar.E.get();
                qce.t0 t0VarY1 = eVar.y1();
                oce.h hVarX1 = eVar.x1();
                ur2.c cVarA = dVar.f206731d0.a();
                vc.s.j(cVarA);
                xua.a aVarA = dVar.c0.a();
                vc.s.j(aVarA);
                return new elf.m(h0Var2, t0VarY1, hVarX1, cVarA, aVarA, (j60.a) eVar.f206850r.get());
            case Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION /* 207 */:
                mae.p pVarE = dVar.f206767v0.e();
                vc.s.j(pVarE);
                f01.a aVar3 = (f01.a) eVar.u0.get();
                t70.b bVarG = dVar.f206726b.g();
                vc.s.j(bVarG);
                return gmf.b.x(pVarE, aVar3, bVarG);
            case 208:
                xig.b bVar = (xig.b) dVar.f206747l1.o.get();
                vc.s.j(bVar);
                yig.a aVar4 = (yig.a) dVar.f206747l1.f126890n.get();
                vc.s.j(aVar4);
                return new elf.h2(bVar, aVar4, (j60.a) eVar.f206850r.get(), ((s41.a) dVar.L0).d(), dVar.m1.a(), (h0) eVar.E.get());
            case Constants.TAG_FIRMWARE_VERSION /* 209 */:
                return new hlf.e((h0) eVar.E.get());
            case Constants.TAG_SVPP_CHECKSUM /* 210 */:
                h0 h0Var3 = (h0) eVar.E.get();
                ap5.b bVarE = ((yo5.w) dVar.f206730c1).e();
                vc.s.j(bVarE);
                return new hlf.b(h0Var3, bVarE);
            case 211:
                f01.a aVar5 = (f01.a) eVar.u0.get();
                c70.a aVarZ = dVar.f206726b.z();
                vc.s.j(aVarZ);
                return new elf.c1(aVar5, aVarZ);
            case Constants.TAG_PCI_PED_CHECKSUM /* 212 */:
                c70.a aVarZ2 = dVar.f206726b.z();
                vc.s.j(aVarZ2);
                return new elf.p(aVarZ2);
            case Constants.TAG_EMV_L1_VERSION /* 213 */:
                h0 h0Var4 = (h0) eVar.E.get();
                tqi.e eVarD = dVar.f206769w.d();
                vte.a aVarC = dVar.f206751n1.c();
                vc.s.j(aVarC);
                return new elf.r0(h0Var4, eVarD, aVarC);
            case Constants.TAG_EMV_L1_CHECKSUM /* 214 */:
                return new v1((j60.a) eVar.f206850r.get(), ((blb.e) dVar.f206753o1).b(), ((blb.e) dVar.f206753o1).a(), ((s41.a) dVar.L0).d());
            case Constants.TAG_EMV_L2_VERSION /* 215 */:
                return new w1((j60.a) eVar.f206850r.get(), ((blb.e) dVar.f206753o1).b());
            case Constants.TAG_EMV_L2_CHECKSUM /* 216 */:
                return new elf.g((h0) eVar.E.get(), eVar.s(), dVar.i0.b());
            case Constants.TAG_BOOT_LOADER_VERSION /* 217 */:
                return new glf.a();
            case Constants.TAG_BOOT_LOADER_CHECKSUM /* 218 */:
                return new glf.b();
            case Constants.TAG_KSL_ID /* 219 */:
                return new jlf.l(eVar.Y0());
            case 220:
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC2);
                return new elf.n0(aVarC2, dVar.o.h(), (h0) eVar.E.get());
            case 221:
                h0 h0Var5 = (h0) eVar.E.get();
                gqa.b bVarE2 = ((jqa.p) dVar.f206755p1).e();
                vc.s.j(bVarE2);
                return new jlf.r(h0Var5, bVarE2, eVar.i1());
            case 222:
                h0 h0Var6 = (h0) eVar.E.get();
                m1 m1Var2 = (m1) eVar.T.get();
                gqa.b bVarE3 = ((jqa.p) dVar.f206755p1).e();
                vc.s.j(bVarE3);
                lra.d dVarB = ((jqa.p) dVar.f206755p1).b();
                vc.s.j(dVarB);
                return new ekf.r0(h0Var6, m1Var2, bVarE3, dVarB, new ekf.n0(), (ekf.w0) eVar.A0.get());
            case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                h0 h0Var7 = (h0) eVar.E.get();
                gte.a aVarB = dVar.f206729c.b();
                vc.s.j(aVarB);
                cl3.a aVarD = dVar.W.d();
                vc.s.j(aVarD);
                return new jlf.e(h0Var7, aVarB, aVarD);
            case BERTags.FLAGS /* 224 */:
                return new jlf.b((h0) eVar.E.get(), eVar.H());
            case Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE /* 225 */:
                h0 h0Var8 = (h0) eVar.E.get();
                bmf.b bVar2 = new bmf.b();
                m1 m1Var3 = (m1) eVar.T.get();
                mjf.b bVarA2 = ((bjf.a) dVar.d).a();
                vc.s.j(bVarA2);
                klf.i iVar = (klf.i) eVar.P0.get();
                l93.f fVarJ = dVar.f206772x0.j();
                vc.s.j(fVarJ);
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC3);
                fal.b bVar3 = (fal.b) dVar.K0.f193459j.get();
                vc.s.j(bVar3);
                return new n1(h0Var8, bVar2, m1Var3, bVarA2, iVar, fVarJ, aVarC3, bVar3, new f73.c());
            case Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION /* 226 */:
                return new flf.c((h0) eVar.E.get());
            case Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS /* 227 */:
                h0 h0Var9 = (h0) eVar.E.get();
                vz1.g gVarH = ((lz1.m) dVar.f0).h();
                vc.s.j(gVarH);
                return new flf.f(h0Var9, gVarH);
            case Constants.TAG_E4_CUSTOMER_DATA /* 228 */:
                h0 h0Var10 = (h0) eVar.E.get();
                ulf.q qVarM0 = eVar.m0();
                vz1.g gVarH2 = ((lz1.m) dVar.f0).h();
                vc.s.j(gVarH2);
                return new flf.j(h0Var10, qVarM0, gVarH2);
            case Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION /* 229 */:
                h0 h0Var11 = (h0) eVar.E.get();
                ulf.s sVar = new ulf.s(eVar.l0(), new ulf.f(), new ulf.i(eVar.l0()));
                com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC4);
                u0f.a aVar6 = (u0f.a) dVar.f206762s1.f230029a.get();
                vc.s.j(aVar6);
                return new flf.t(h0Var11, sVar, aVarC4, aVar6, new ulf.c(), eVar.j1(), new mkf.k0((h0) eVar.E.get()));
            case 230:
                h0 h0Var12 = (h0) eVar.E.get();
                jr1.f fVarB = ((ir1.b) dVar.f206765t1).b();
                vc.s.j(fVarB);
                g1 g1Var = (g1) eVar.O.get();
                er1.b bVarA3 = ((ir1.b) dVar.f206765t1).a();
                vc.s.j(bVarA3);
                return new flf.n(h0Var12, fVarB, g1Var, bVarA3);
            case Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION /* 231 */:
                return new fmf.n0((CoroutineScope) eVar.B.get(), eVar.p1(), (dmf.d) eVar.L.get(), (rp0.l0) eVar.O6.get(), (elf.c1) eVar.B3.get(), (k71.i) eVar.C.get(), (cli.n) eVar.P6.get());
            case 232:
                return new hmf.l((h0) eVar.E.get(), eVar.R(), eVar.A(), (amf.o) eVar.V3.get(), eVar.A0(), (kkf.d0) eVar.W3.get(), eVar.r0(), (skf.f) eVar.G0.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.C0(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (l8) eVar.f206801f1.get(), (f9) eVar.M0.get(), (okf.k) eVar.f206794d1.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get(), (s8) eVar.I2.get(), (akf.x0) eVar.S.get());
            case Constants.TAG_USB_CAPABILITY /* 233 */:
                return new amf.o((h0) eVar.E.get(), (m1) eVar.T.get(), (j2) eVar.o3.get(), new amf.m());
            case Constants.TAG_EMV_ICC_CONFIG_VERSION /* 234 */:
                return new kkf.d0((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), (elf.b0) eVar.O2.get(), new kkf.c0());
            case Constants.TAG_EMV_NFC_CONFIG_VERSION /* 235 */:
                return new klf.m((CoroutineScope) eVar.B.get(), (h0) eVar.E.get(), new kye.e(eVar.d.f206736g.d()));
            case Constants.TAG_OS_VERSION /* 236 */:
                return new o1((h0) eVar.E.get(), (elf.h0) eVar.l3.get());
            case Constants.TAG_MPOS_MODULE_STATE /* 237 */:
                return new i9((h0) eVar.E.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), (j2) eVar.o3.get());
            case Constants.TAG_EE_SUPPORTED_RPC_ID_LIST /* 238 */:
                return new k7((h0) eVar.E.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), new t1j.b((wnf.b) eVar.N0.get()));
            case 239:
                return new n7((h0) eVar.E.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), (elf.d1) eVar.j3.get());
            case 240:
                return new hmf.g((h0) eVar.E.get(), eVar.O(), (amf.e) eVar.f206797d4.get(), (amf.o) eVar.V3.get(), (amf.l) eVar.e4.get(), eVar.A0(), (akf.x) eVar.f206778a0.get(), (kkf.i) eVar.R0.get(), (n7) eVar.b4.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), eVar.p0(), (s7) eVar.K1.get(), (kkf.q) eVar.H1.get(), (clf.a) eVar.C2.get(), (elf.p0) eVar.f206847q3.get());
            case Constants.TAG_TRANSACTION_DATA /* 241 */:
                return new amf.e((elf.p0) eVar.f206847q3.get(), (m1) eVar.T.get());
            case 242:
                return new amf.l((h0) eVar.E.get(), (m1) eVar.T.get(), (s1) eVar.n3.get());
            case Constants.TAG_F3_BUILD_CONFIGURATION /* 243 */:
                return new hmf.h((h0) eVar.E.get(), eVar.R(), (nof.i) eVar.f206811h4.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (amf.e) eVar.f206797d4.get(), (amf.h) eVar.f206816j4.get(), (amf.l) eVar.e4.get(), (amf.o) eVar.V3.get(), (akf.c) eVar.j0.get(), (akf.q) eVar.g0.get(), (akf.b0) eVar.f206809h0.get(), (akf.x) eVar.f206778a0.get(), (akf.i0) eVar.f206798e0.get(), (akf.l0) eVar.f206793d0.get(), (akf.f1) eVar.f0.get(), (akf.s1) eVar.Y.get(), (kkf.c) eVar.K0.get(), (kkf.e) eVar.W0.get(), eVar.M(), (kkf.i) eVar.R0.get(), (kkf.n) eVar.f206831n4.get(), (kkf.q) eVar.H1.get(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (okf.k) eVar.f206794d1.get(), (kkf.h0) eVar.f206810h1.get(), (j0) eVar.f206856s1.get(), (kkf.w0) eVar.Y0.get(), (kkf.p0) eVar.a1.get(), eVar.p0(), (k1) eVar.f206836o2.get(), (kkf.m1) eVar.L0.get(), (o1) eVar.Y3.get(), eVar.z0(), (u1) eVar.f206875x1.get(), eVar.C0(), (a2) eVar.f206860t1.get(), (m2) eVar.A1.get(), (o2) eVar.f206880y1.get(), eVar.I0(), (n4) eVar.Q1.get(), eVar.d1(), (x4) eVar.f206867v1.get(), (z4) eVar.f206848q4.get(), (b5) eVar.D2.get(), (t5) eVar.S0.get(), (y5) eVar.f206871w2.get(), (y6) eVar.r4.get(), (e7) eVar.U0.get(), (kkf.k) eVar.s4.get(), (kkf.m) eVar.f206861t4.get(), (i7) eVar.X0.get(), (s7) eVar.K1.get(), eVar.v1(), new p7((z2) eVar.V.get(), (a9e.d) eVar.h3.get(), (d9e.a) eVar.i3.get()), (f9) eVar.M0.get(), (i9) eVar.Z3.get(), (clf.a) eVar.C2.get(), (elf.p0) eVar.f206847q3.get(), (rhf.d) eVar.i0.get());
            case Constants.TAG_F4 /* 244 */:
                nof.h hVar = (nof.h) eVar.f206807g4.get();
                j9l.a aVarB2 = dVar.K.b();
                le3.i iVar2 = (le3.i) dVar.f206766u1.v.get();
                vc.s.j(iVar2);
                com.revolut.domain.interactors.transactions.a aVarC5 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC5);
                mhf.b bVarB2 = ((bjf.a) dVar.d).b();
                vc.s.j(bVarB2);
                return new nof.m(hVar, aVarB2, iVar2, aVarC5, bVarB2, dVar.z.b());
            case Constants.TAG_F5 /* 245 */:
                return new nof.a();
            case 246:
                return new amf.a((h0) eVar.E.get(), (m1) eVar.T.get(), (elf.e) eVar.V0.get(), eVar.q());
            case Constants.TAG_BLE_FIRMWARE_VERSION /* 247 */:
                return new amf.h((h0) eVar.E.get(), (z2) eVar.V.get(), (m1) eVar.T.get(), (elf.a1) eVar.p3.get(), dVar.z.b());
            case Constants.TAG_FULL_SVPP_IDENTIFICATION /* 248 */:
                mae.p pVarE2 = dVar.f206767v0.e();
                vc.s.j(pVarE2);
                return gmf.b.l(pVarE2, (f01.a) eVar.u0.get());
            case Constants.TAG_RESOURCE_FILE_VERSION /* 249 */:
                return new kkf.n((h0) eVar.E.get(), (klf.k) eVar.f206826m4.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), (elf.o) eVar.m3.get());
            case Constants.TAG_SUPPORTED_LOCALE_LIST /* 250 */:
                return new klf.k((h0) eVar.E.get(), (ynf.b) eVar.l4.get());
            case Constants.TAG_FB_CHARGING_STATUS /* 251 */:
                whf.b bVarA4 = dVar.f206738h.a();
                vc.s.j(bVarA4);
                com.revolut.domain.interactors.transactions.a aVarC6 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC6);
                anf.b bVar4 = (anf.b) dVar.f206738h.Q.get();
                vc.s.j(bVar4);
                return new ynf.d(bVarA4, aVarC6, bVar4, eVar.j(), (znf.c) eVar.D.get());
            case Constants.TAG_FC_SPEED_MODE /* 252 */:
                return new kkf.x((h0) eVar.E.get(), (klf.m) eVar.X3.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), dVar.f206757r.c(), (x) eVar.f206806g2.get(), (elf.d2) eVar.s3.get(), (elf.e0) eVar.f206837o4.get(), eVar.t0());
            case Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION /* 253 */:
                return new elf.e0((j60.a) eVar.f206850r.get(), eVar.t0());
            case 254:
                return new z4((h0) eVar.E.get(), (rnf.g) dVar.E1.get(), (s1) eVar.n3.get());
            case 255:
                h0 h0Var13 = (h0) eVar.E.get();
                m1 m1Var4 = (m1) eVar.T.get();
                k71.i iVar3 = (k71.i) eVar.C.get();
                jhf.a aVar7 = dVar.d;
                pa6.m mVar = dVar.E0;
                com.revolut.domain.interactors.transactions.a aVarC7 = ((bjf.a) aVar7).c();
                vc.s.j(aVarC7);
                vlf.b bVar5 = (vlf.b) eVar.O0.get();
                xoj.a aVarA2 = dVar.H.a();
                vc.s.j(aVarA2);
                ppg.a aVarA3 = ((wpg.l) dVar.B).a();
                vc.s.j(aVarA3);
                eub.a aVarA4 = dVar.z0.a();
                vc.s.j(aVarA4);
                qmc.h hVarA = dVar.w1.a();
                a31.a aVarA5 = mVar.a();
                aa6.c cVarB = mVar.b();
                vc.s.j(cVarB);
                return new y6(h0Var13, m1Var4, iVar3, aVarC7, bVar5, aVarA2, aVarA3, aVarA4, hVarA, aVarA5, cVarB, (elf.z1) eVar.t3.get());
            case 256:
                return new kkf.k((h0) eVar.E.get(), (klf.i) eVar.P0.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get());
            case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                return new kkf.m((h0) eVar.E.get(), (klf.i) eVar.P0.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get(), (elf.d1) eVar.j3.get());
            case 258:
                h0 h0Var14 = (h0) eVar.E.get();
                jt0.b bVarR = eVar.R();
                nof.i iVar4 = (nof.i) eVar.f206872w4.get();
                amf.o oVar = (amf.o) eVar.V3.get();
                amf.a aVar8 = (amf.a) eVar.f206814i4.get();
                amf.c cVarA0 = eVar.A0();
                ikf.j jVar = (ikf.j) eVar.p0.get();
                akf.c cVar = (akf.c) eVar.j0.get();
                ikf.h hVar2 = (ikf.h) eVar.q0.get();
                zkf.k kVar = (zkf.k) eVar.f206855s0.get();
                vkf.f fVar = (vkf.f) eVar.f206859t0.get();
                xkf.q1 q1Var = (xkf.q1) eVar.f206803f3.get();
                dlf.q qVar = (dlf.q) eVar.v2.get();
                k7 k7Var = (k7) eVar.f206781a4.get();
                dlf.b bVar6 = (dlf.b) eVar.f206846q2.get();
                kkf.y1 y1VarC0 = eVar.C0();
                k1 k1Var = (k1) eVar.f206836o2.get();
                l8 l8Var = (l8) eVar.f206801f1.get();
                kkf.d0 d0Var = (kkf.d0) eVar.W3.get();
                xkf.y0 y0VarS0 = eVar.S0();
                h0 h0Var15 = (h0) eVar.E.get();
                co9.b bVarB3 = eVar.d.u0.b();
                vc.s.j(bVarB3);
                return new hmf.n0(h0Var14, bVarR, iVar4, oVar, aVar8, cVarA0, jVar, cVar, hVar2, kVar, fVar, q1Var, qVar, k7Var, bVar6, y1VarC0, k1Var, l8Var, d0Var, y0VarS0, new dlf.j(h0Var15, bVarB3), (c2) eVar.f206876x2.get(), (dlf.k) eVar.f206877x4.get(), (u1) eVar.f206875x1.get(), (mkf.l) eVar.f206882y4.get(), eVar.D0(), eVar.s0(), new xkf.x0((h0) eVar.E.get()), eVar.T0(), (kkf.e) eVar.W0.get(), (i7) eVar.X0.get(), eVar.I0(), (dlf.m) eVar.z4.get(), eVar.M0(), (vkf.j) eVar.f206884z2.get(), (z3) eVar.r2.get(), (zkf.n) eVar.u2.get(), (zkf.b) eVar.A4.get(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get(), new kkf.m0((h0) eVar.E.get()));
            case 259:
                nof.h hVar3 = (nof.h) eVar.v4.get();
                j9l.a aVarB3 = dVar.K.b();
                le3.i iVar5 = (le3.i) dVar.f206766u1.v.get();
                vc.s.j(iVar5);
                com.revolut.domain.interactors.transactions.a aVarC8 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC8);
                mhf.b bVarB4 = ((bjf.a) dVar.d).b();
                vc.s.j(bVarB4);
                return new nof.m(hVar3, aVarB3, iVar5, aVarC8, bVarB4, dVar.z.b());
            case 260:
                thf.m mVarG2 = dVar.f206738h.g();
                vc.s.j(mVarG2);
                return new nof.b(mVarG2);
            case 261:
                return new dlf.k((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), (x) eVar.f206806g2.get());
            case 262:
                return new mkf.l((h0) eVar.E.get());
            case 263:
                return new dlf.m((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), (j2) eVar.o3.get());
            case 264:
                return new zkf.b((h0) eVar.E.get());
            case 265:
                return new hmf.i((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.n) eVar.f206831n4.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 266:
                return new jmf.a((h0) eVar.E.get(), eVar.Q(), (amf.o) eVar.V3.get(), eVar.A0(), (nkf.f) eVar.f206841p1.get(), (nkf.c) eVar.f206835o1.get(), (i9) eVar.Z3.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 267:
                return new kmf.a((h0) eVar.E.get(), eVar.T(), (nof.i) eVar.f206811h4.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (amf.e) eVar.f206797d4.get(), (amf.h) eVar.f206816j4.get(), (amf.l) eVar.e4.get(), (amf.o) eVar.V3.get(), (akf.q) eVar.g0.get(), (akf.x) eVar.f206778a0.get(), (akf.l0) eVar.f206793d0.get(), (akf.f1) eVar.f0.get(), (akf.s1) eVar.Y.get(), (kkf.e) eVar.W0.get(), eVar.M(), (kkf.n) eVar.f206831n4.get(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (okf.k) eVar.f206794d1.get(), (kkf.h0) eVar.f206810h1.get(), (j0) eVar.f206856s1.get(), (kkf.w0) eVar.Y0.get(), (kkf.p0) eVar.a1.get(), eVar.p0(), (k1) eVar.f206836o2.get(), (kkf.m1) eVar.L0.get(), (o1) eVar.Y3.get(), eVar.z0(), (u1) eVar.f206875x1.get(), eVar.C0(), (a2) eVar.f206860t1.get(), (m2) eVar.A1.get(), (o2) eVar.f206880y1.get(), eVar.I0(), (x4) eVar.f206867v1.get(), (n4) eVar.Q1.get(), (z4) eVar.f206848q4.get(), (t5) eVar.S0.get(), (y5) eVar.f206871w2.get(), (y6) eVar.r4.get(), (e7) eVar.U0.get(), (kkf.k) eVar.s4.get(), (kkf.m) eVar.f206861t4.get(), (i7) eVar.X0.get(), (s7) eVar.K1.get(), eVar.v1(), (f9) eVar.M0.get(), (i9) eVar.Z3.get(), (clf.a) eVar.C2.get(), (kkf.i) eVar.R0.get(), (elf.p0) eVar.f206847q3.get(), (rhf.d) eVar.i0.get());
            case 268:
                return new kmf.d((h0) eVar.E.get(), eVar.R(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (okf.f) eVar.F4.get(), eVar.p0(), (k1) eVar.f206836o2.get(), (kkf.i) eVar.R0.get(), (okf.h) eVar.G4.get(), (o1) eVar.Y3.get(), (clf.a) eVar.C2.get());
            case 269:
                h0 h0Var16 = (h0) eVar.E.get();
                al4.q qVarA = dVar.E.a();
                al4.n nVarS = dVar.E.s();
                vc.s.j(nVarS);
                return new okf.f(h0Var16, qVarA, nVarS);
            case 270:
                return new okf.h((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), (x) eVar.f206806g2.get());
            case 271:
                return new kmf.c((h0) eVar.E.get(), (i9) eVar.Z3.get(), (okf.k) eVar.f206794d1.get(), (amf.o) eVar.V3.get(), eVar.A0(), eVar.T(), eVar.p0(), (clf.a) eVar.C2.get());
            case 272:
                return new kmf.b((h0) eVar.E.get(), eVar.T(), (amf.o) eVar.V3.get(), (amf.l) eVar.e4.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (kkf.m1) eVar.L0.get(), (k7) eVar.f206781a4.get(), (okf.b) eVar.J4.get(), (t5) eVar.S0.get(), (kkf.e) eVar.W0.get(), (i9) eVar.Z3.get(), (z4) eVar.f206848q4.get(), (okf.k) eVar.f206794d1.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 273:
                return new okf.b((h0) eVar.E.get(), (klf.i) eVar.P0.get(), (m1) eVar.T.get(), (vlf.b) eVar.O0.get());
            case 274:
                return new kmf.f((h0) eVar.E.get(), eVar.T(), (akf.l0) eVar.f206793d0.get(), (amf.a) eVar.f206814i4.get(), (amf.l) eVar.e4.get(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (k1) eVar.f206836o2.get(), (kkf.i) eVar.R0.get(), (kkf.e) eVar.W0.get(), (z4) eVar.f206848q4.get(), (okf.c0) eVar.L4.get(), (okf.k) eVar.f206794d1.get(), (i9) eVar.Z3.get(), (amf.o) eVar.V3.get(), (kkf.x) eVar.f206842p4.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (i7) eVar.X0.get(), (nof.i) eVar.f206811h4.get(), (clf.a) eVar.C2.get(), (okf.u) eVar.M4.get(), (okf.w) eVar.f206805g1.get(), (okf.z) eVar.N4.get());
            case 275:
                return new okf.c0((h0) eVar.E.get());
            case 276:
                s0 s0Var = (s0) eVar.f206799e1.get();
                thf.g gVarE = dVar.f206738h.e();
                vc.s.j(gVarE);
                return new okf.u(s0Var, gVarE, (glf.b) eVar.I3.get());
            case 277:
                return new okf.z((h0) eVar.E.get());
            case 278:
                return new kmf.e((h0) eVar.E.get(), eVar.R(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (okf.f) eVar.F4.get(), (okf.r) eVar.P4.get(), (okf.o) eVar.Q4.get(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 279:
                h0 h0Var17 = (h0) eVar.E.get();
                whf.b bVarA5 = dVar.f206738h.a();
                vc.s.j(bVarA5);
                whf.n nVarB = dVar.f206738h.b();
                vc.s.j(nVarB);
                return new okf.r(h0Var17, bVarA5, nVarB, (glf.b) eVar.I3.get());
            case 280:
                h0 h0Var18 = (h0) eVar.E.get();
                al4.n nVarS2 = dVar.E.s();
                vc.s.j(nVarS2);
                return new okf.o(h0Var18, nVarS2, dVar.f206749n.k(), (glf.a) eVar.H3.get());
            case 281:
                return new lmf.i((h0) eVar.E.get(), eVar.b0(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (s7) eVar.K1.get(), (o2) eVar.f206880y1.get(), eVar.p0(), (n2) eVar.L2.get(), (k1) eVar.f206836o2.get(), (y1) eVar.N2.get(), (pkf.d2) eVar.P2.get(), (k2) eVar.R2.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (pkf.h2) eVar.T2.get(), (clf.a) eVar.C2.get(), (hlf.e) eVar.z3.get());
            case 282:
                return new lmf.d((h0) eVar.E.get(), eVar.Y(), (i9) eVar.Z3.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (p1) eVar.K2.get(), eVar.p0(), (pkf.w0) eVar.V2.get(), (a1) eVar.W2.get(), (q0) eVar.X2.get(), (pkf.z) eVar.Y2.get(), (pkf.v2) eVar.Z2.get(), (e1) eVar.f206780a3.get(), (l8) eVar.f206801f1.get(), (pkf.d0) eVar.f206788b3.get(), (pkf.i0) eVar.c3.get(), (amf.o) eVar.V3.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (clf.a) eVar.C2.get(), (hlf.b) eVar.A3.get());
            case 283:
                return new mmf.a((h0) eVar.E.get(), new slf.c(eVar.R(), (h0) eVar.E.get()), eVar.A0(), (l8) eVar.f206801f1.get(), eVar.e0(), (o1) eVar.Y3.get());
            case 284:
                return new mmf.b((h0) eVar.E.get(), new slf.c(eVar.R(), (h0) eVar.E.get()), eVar.A0(), (ckf.e) eVar.f206834o0.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), eVar.h0(), eVar.g0(), (o1) eVar.Y3.get());
            case 285:
                h0 h0Var19 = (h0) eVar.E.get();
                h76.a aVarB4 = dVar.f206743j1.b();
                vc.s.j(aVarB4);
                return new z0(h0Var19, aVarB4);
            case 286:
                return new elf.d0((c76.a) eVar.r3.get());
            case 287:
                return new mmf.c((h0) eVar.E.get(), new slf.c(eVar.R(), (h0) eVar.E.get()), eVar.A0(), (ckf.i) eVar.f206828n0.get(), (k1) eVar.f206836o2.get(), eVar.i0(), eVar.j0(), (o1) eVar.Y3.get());
            case 288:
                return new hmf.j((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.z) eVar.Z4.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 289:
                return new kkf.z((h0) eVar.E.get(), (vlf.b) eVar.O0.get());
            case 290:
                return new hmf.u((h0) eVar.E.get(), (akf.s1) eVar.Y.get(), eVar.R(), eVar.A0(), (kkf.e) eVar.W0.get(), (n7) eVar.b4.get(), (kkf.d0) eVar.W3.get(), (k7) eVar.f206781a4.get(), eVar.C0(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), (q4) eVar.b5.get(), (akf.p0) eVar.f206785b0.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 291:
                h0 h0Var20 = (h0) eVar.E.get();
                m1 m1Var5 = (m1) eVar.T.get();
                xua.a aVarA6 = dVar.c0.a();
                vc.s.j(aVarA6);
                return new q4(h0Var20, m1Var5, aVarA6, (w0) eVar.i2.get());
            case 292:
                return new hmf.k((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (o6) eVar.d5.get(), (kkf.d0) eVar.W3.get(), (kkf.s0) eVar.f206786b1.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 293:
                h0 h0Var21 = (h0) eVar.E.get();
                vlf.b bVar7 = (vlf.b) eVar.O0.get();
                thf.m mVarG3 = dVar.f206738h.g();
                vc.s.j(mVarG3);
                return new o6(h0Var21, bVar7, mVarG3);
            case 294:
                return new lmf.e((h0) eVar.E.get(), eVar.R(), (kkf.d0) eVar.W3.get(), (kkf.s0) eVar.f206786b1.get(), (o1) eVar.Y3.get(), (clf.a) eVar.C2.get());
            case 295:
                return new hmf.w((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.s1) eVar.Y.get(), (akf.c) eVar.j0.get(), (akf.l0) eVar.f206793d0.get(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (i1) eVar.f206791c1.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.C0(), (t2) eVar.T1.get(), (i9) eVar.Z3.get(), (v3) eVar.U1.get(), (p5) eVar.V1.get(), (j5) eVar.X1.get(), (t5) eVar.S0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (e8) eVar.p2.get(), eVar.t1(), (kkf.x) eVar.f206842p4.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 296:
                return new lmf.f((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), eVar.A0(), (o6) eVar.d5.get(), (kkf.d0) eVar.W3.get(), (j1) eVar.e2.get(), (kkf.e) eVar.W0.get(), (i9) eVar.Z3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 297:
                return new lmf.b((h0) eVar.E.get(), (vlf.b) eVar.O0.get(), eVar.A(), (amf.o) eVar.V3.get(), eVar.A0(), (bkf.h) eVar.m0.get(), (pkf.q) eVar.l2.get(), (pkf.s) eVar.i5.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (kkf.d0) eVar.W3.get(), (pkf.h) eVar.h2.get(), (pkf.k) eVar.j2.get(), (pkf.n) eVar.f206820k2.get(), (pkf.v) eVar.f206825m2.get(), (i9) eVar.Z3.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get(), (akf.x0) eVar.S.get());
            case 298:
                h0 h0Var22 = (h0) eVar.E.get();
                vlf.b bVar8 = (vlf.b) eVar.O0.get();
                thf.m mVarG4 = dVar.f206738h.g();
                vc.s.j(mVarG4);
                return new pkf.s(h0Var22, bVar8, mVarG4);
            case 299:
                return new hmf.v((h0) eVar.E.get(), eVar.m1(), (i5) eVar.W1.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            default:
                throw new AssertionError(i);
        }
    }

    public Object q() {
        mlf.d dVar = (mlf.d) this.f206069b;
        mlf.e eVar = (mlf.e) this.d;
        int i = this.f206070c;
        switch (i) {
            case 300:
                return new hmf.t((h0) eVar.E.get(), eVar.R(), eVar.A0(), (akf.j1) eVar.J0.get(), (akf.s1) eVar.Y.get(), (clf.a) eVar.C2.get(), (o2) eVar.f206880y1.get(), eVar.p0(), (j8) eVar.H2.get(), (lkf.d) eVar.l0.get(), (lkf.m) eVar.l5.get(), (n7) eVar.b4.get(), (k7) eVar.f206781a4.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (lkf.w) eVar.m5.get(), (kkf.d0) eVar.W3.get(), (lkf.k) eVar.f206832n5.get(), new o8((h0) eVar.E.get()), (xkf.a1) eVar.f206843p5.get(), (e7) eVar.U0.get(), eVar.z0(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (mkf.l) eVar.f206882y4.get());
            case 301:
                return new lkf.m((h0) eVar.E.get(), (wnf.b) eVar.N0.get());
            case 302:
                return new lkf.w((h0) eVar.E.get());
            case 303:
                return new lkf.k((h0) eVar.E.get());
            case 304:
                return new xkf.a1((h0) eVar.E.get(), eVar.U0(), (jlf.f) eVar.f206838o5.get());
            case 305:
                return new jlf.f((n5k.b) eVar.H.get());
            case 306:
                return new nmf.a((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.n) eVar.f206831n4.get(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 307:
                return new nmf.b((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), eVar.A0(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), (u3) eVar.f206857s5.get(), (i9) eVar.Z3.get(), (n7) eVar.b4.get(), (e5) eVar.Z1.get(), (m6) eVar.f206787b2.get(), (k7) eVar.f206781a4.get(), eVar.p0(), (kkf.e) eVar.W0.get(), (l8) eVar.f206801f1.get(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 308:
                return new u3((h0) eVar.E.get());
            case 309:
                return new nmf.d((h0) eVar.E.get(), eVar.R(), (nof.i) eVar.f206811h4.get(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (d1) eVar.f206830n2.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (z3) eVar.r2.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (l8) eVar.f206801f1.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 310:
                return new hmf.a0((h0) eVar.E.get(), eVar.R(), eVar.A(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), eVar.n1(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get(), (akf.x0) eVar.S.get());
            case 311:
                return new hmf.s((h0) eVar.E.get(), eVar.R(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (kkf.l3) eVar.w5.get(), (k1) eVar.f206836o2.get(), eVar.G0(), eVar.H0(), eVar.F0(), eVar.C0(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 312:
                return new kkf.l3((h0) eVar.E.get());
            case 313:
                CoroutineScope coroutineScope = (CoroutineScope) eVar.B.get();
                h0 h0Var = (h0) eVar.E.get();
                y45.j jVarH = dVar.G0.h();
                m35.c cVarL = dVar.G0.l();
                vc.s.j(cVarL);
                return new klf.p1(coroutineScope, h0Var, jVarH, cVarL);
            case 314:
                return new klf.o1((CoroutineScope) eVar.B.get(), (h0) eVar.E.get());
            case 315:
                return new hmf.r((h0) eVar.E.get(), eVar.R(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (d3) eVar.A5.get(), (a3) eVar.B5.get(), (x2) eVar.C5.get(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 316:
                h0 h0Var2 = (h0) eVar.E.get();
                y45.i iVarI = dVar.G0.i();
                m35.r rVarO = dVar.G0.o();
                vc.s.j(rVarO);
                return new d3(h0Var2, iVarI, rVarO);
            case 317:
                h0 h0Var3 = (h0) eVar.E.get();
                l61.a aVarB = dVar.f206757r.b();
                vc.s.j(aVarB);
                l35.b bVarN = dVar.G0.n();
                vc.s.j(bVarN);
                return new a3(h0Var3, aVarB, bVarN);
            case 318:
                return new x2((h0) eVar.E.get(), (vlf.b) eVar.O0.get());
            case 319:
                return new hmf.m((h0) eVar.E.get(), eVar.R(), eVar.A(), (akf.c) eVar.j0.get(), (akf.l0) eVar.f206793d0.get(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), (h6) eVar.G2.get(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (okf.k) eVar.f206794d1.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (s7) eVar.K1.get(), (k9) eVar.P1.get(), (kkf.q) eVar.H1.get(), (clf.a) eVar.C2.get());
            case 320:
                return new hmf.p((h0) eVar.E.get(), eVar.R(), eVar.A0(), eVar.B0(), (o1) eVar.Y3.get(), (u1) eVar.f206875x1.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 321:
                return new tmf.c((h0) eVar.E.get(), eVar.R(), eVar.A(), (amf.o) eVar.V3.get(), eVar.A0(), (blf.i) eVar.H5.get(), eVar.C0(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), (blf.k) eVar.I5.get(), (blf.b) eVar.J5.get(), (a5) eVar.K5.get(), (i9) eVar.Z3.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (z3) eVar.r2.get(), (clf.a) eVar.C2.get(), (akf.x0) eVar.S.get());
            case 322:
                h0 h0Var4 = (h0) eVar.E.get();
                klf.z1 z1Var = (klf.z1) eVar.G5.get();
                m1 m1Var = (m1) eVar.T.get();
                vlf.b bVar = (vlf.b) eVar.O0.get();
                thf.m mVarG = dVar.f206738h.g();
                vc.s.j(mVarG);
                elf.b0 b0Var = (elf.b0) eVar.O2.get();
                elf.d1 d1Var = (elf.d1) eVar.j3.get();
                l80.e eVarH = dVar.f206726b.h();
                vc.s.j(eVarH);
                return new blf.i(h0Var4, z1Var, m1Var, bVar, mVarG, b0Var, d1Var, eVarH);
            case 323:
                CoroutineScope coroutineScope2 = (CoroutineScope) eVar.B.get();
                h0 h0Var5 = (h0) eVar.E.get();
                djb.n nVarA = dVar.R.a();
                vc.s.j(nVarA);
                ypg.f fVar = (ypg.f) ((wpg.l) dVar.B).Q.get();
                vc.s.j(fVar);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC);
                return new klf.z1(coroutineScope2, h0Var5, nVarA, fVar, aVarC);
            case 324:
                return new blf.k((h0) eVar.E.get(), (klf.z1) eVar.G5.get(), (w1) eVar.F3.get());
            case 325:
                return new blf.b((h0) eVar.E.get(), (klf.z1) eVar.G5.get());
            case 326:
                return new a5((z2) eVar.V.get(), (m1) eVar.T.get(), (w0) eVar.i2.get(), (vlf.b) eVar.O0.get(), (a9e.b) eVar.f206821k4.get());
            case 327:
                return new tmf.a((h0) eVar.E.get(), eVar.R(), eVar.A0(), (blf.i) eVar.H5.get(), (l8) eVar.f206801f1.get(), (blf.e) eVar.M5.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 328:
                return new blf.e((h0) eVar.E.get(), (klf.z1) eVar.G5.get(), (v1) eVar.E3.get());
            case 329:
                return new lmf.g((h0) eVar.E.get(), new olf.n(eVar.R(), (h0) eVar.E.get()), (amf.o) eVar.V3.get(), eVar.A0(), (kkf.d0) eVar.W3.get(), (k7) eVar.f206781a4.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 330:
                return new lmf.h((h0) eVar.E.get(), new olf.n(eVar.R(), (h0) eVar.E.get()), (amf.o) eVar.V3.get(), eVar.A0(), (kkf.d0) eVar.W3.get(), (pkf.u1) eVar.P5.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 331:
                return new pkf.u1(dVar.f206773x1.a(), (h0) eVar.E.get());
            case 332:
                return new tmf.b((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), eVar.A0(), (k7) eVar.f206781a4.get(), (i9) eVar.Z3.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 333:
                return new imf.a((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.s1) eVar.Y.get(), (lkf.r) eVar.S5.get(), (kkf.m1) eVar.L0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (k1) eVar.f206836o2.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), (e7) eVar.U0.get(), eVar.z0(), (kkf.e) eVar.W0.get(), (i9) eVar.Z3.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 334:
                return new lkf.r((h0) eVar.E.get(), eVar.N0());
            case 335:
                return new imf.b((h0) eVar.E.get(), eVar.R(), (amf.o) eVar.V3.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (lkf.r) eVar.S5.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), (kkf.e) eVar.W0.get(), (i7) eVar.X0.get(), (i9) eVar.Z3.get(), (o1) eVar.Y3.get(), (z3) eVar.r2.get(), eVar.p0(), (nof.i) eVar.f206811h4.get(), (clf.a) eVar.C2.get());
            case 336:
                return new imf.c((h0) eVar.E.get(), eVar.y(), (elf.g) eVar.G3.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.k) eVar.f206818k0.get(), (akf.s1) eVar.Y.get(), (lkf.h) eVar.V5.get(), (clf.a) eVar.C2.get(), (o2) eVar.f206880y1.get(), eVar.p0(), (xkf.q1) eVar.f206803f3.get(), (lkf.m) eVar.l5.get(), (lkf.z) eVar.W5.get(), (n7) eVar.b4.get(), (k7) eVar.f206781a4.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (kkf.d0) eVar.W3.get(), (xkf.a1) eVar.f206843p5.get(), (e7) eVar.U0.get(), eVar.z0(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (s8) eVar.I2.get());
            case 337:
                return new lkf.h((h0) eVar.E.get(), eVar.s());
            case 338:
                h0 h0Var6 = (h0) eVar.E.get();
                z80.b bVarS = dVar.f206726b.s();
                vc.s.j(bVarS);
                return new lkf.z(h0Var6, bVarS);
            case 339:
                return new imf.d((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.s1) eVar.Y.get(), (lkf.h0) eVar.Y5.get(), (lkf.c0) eVar.f206874x0.get(), (lkf.e0) eVar.A2.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), eVar.z0(), (kkf.e) eVar.W0.get(), (i9) eVar.Z3.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get(), (l0) eVar.E2.get());
            case 340:
                return new lkf.h0((h0) eVar.E.get(), (wnf.b) eVar.N0.get());
            case 341:
                return new imf.e((h0) eVar.E.get(), (nof.i) eVar.f206789b6.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.k) eVar.f206818k0.get(), (akf.p0) eVar.f206785b0.get(), (akf.c) eVar.j0.get(), eVar.e1(), (akf.s1) eVar.Y.get(), (kkf.e) eVar.W0.get(), eVar.f1(), (mkf.r) eVar.c6.get(), new mkf.u((h0) eVar.E.get()), (mkf.c0) eVar.F0.get(), new mkf.f0((h0) eVar.E.get()), (kkf.d0) eVar.W3.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), (xkf.q1) eVar.f206803f3.get(), (zkf.p) eVar.d6.get(), (clf.a) eVar.C2.get(), (e7) eVar.U0.get(), (i7) eVar.X0.get(), (s7) eVar.K1.get(), new o8((h0) eVar.E.get()), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get());
            case 342:
                nof.h hVar = (nof.h) eVar.f206783a6.get();
                j9l.a aVarB2 = dVar.K.b();
                le3.i iVar = (le3.i) dVar.f206766u1.v.get();
                vc.s.j(iVar);
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) dVar.d).c();
                vc.s.j(aVarC2);
                mhf.b bVarB = ((bjf.a) dVar.d).b();
                vc.s.j(bVarB);
                return new nof.m(hVar, aVarB2, iVar, aVarC2, bVarB, dVar.z.b());
            case 343:
                return new nof.n();
            case 344:
                return new mkf.r((h0) eVar.E.get(), (m1) eVar.T.get(), (j2) eVar.o3.get(), new mkf.q(), new mkf.v());
            case 345:
                return new zkf.p((h0) eVar.E.get(), new zkf.q());
            case 346:
                return new hmf.z((h0) eVar.E.get(), eVar.R(), (nof.i) eVar.f206811h4.get(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (d1) eVar.f206830n2.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (z3) eVar.r2.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (l8) eVar.f206801f1.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 347:
                return new hmf.l0((h0) eVar.E.get(), eVar.R(), eVar.A(), (amf.o) eVar.V3.get(), eVar.A0(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.C0(), (k1) eVar.f206836o2.get(), (l8) eVar.f206801f1.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), (a5) eVar.K5.get(), (i9) eVar.Z3.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), eVar.p0(), (z3) eVar.r2.get(), (clf.a) eVar.C2.get(), (akf.x0) eVar.S.get());
            case 348:
                return new hmf.m0((h0) eVar.E.get(), eVar.s1(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), eVar.C0(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (a8) eVar.t2.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 349:
                return new hmf.q((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (kkf.d0) eVar.W3.get(), (o1) eVar.Y3.get(), eVar.C0(), (kkf.e2) eVar.i6.get(), (h2) eVar.s2.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.p0(), (clf.a) eVar.C2.get());
            case 350:
                return new kkf.e2();
            case 351:
                return new hmf.o((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (akf.u0) eVar.f206851r0.get(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (d1) eVar.f206830n2.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.C0(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (f9) eVar.M0.get(), eVar.p0(), (kkf.x) eVar.f206842p4.get(), (clf.a) eVar.C2.get(), (b5) eVar.D2.get());
            case 352:
                return new omf.a((h0) eVar.E.get(), eVar.R(), eVar.A0(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (kkf.d0) eVar.W3.get(), eVar.u0(), (o1) eVar.Y3.get(), (akf.x0) eVar.S.get());
            case 353:
                return new omf.b((h0) eVar.E.get(), eVar.R(), eVar.A0(), eVar.w0(), (v2) eVar.f206779a2.get(), (o1) eVar.Y3.get());
            case 354:
                return new omf.c((h0) eVar.E.get(), eVar.R(), eVar.A0(), eVar.x0(), (v2) eVar.f206779a2.get(), (o1) eVar.Y3.get());
            case 355:
                return new omf.d((h0) eVar.E.get(), eVar.R(), eVar.A0(), eVar.y0(), (v2) eVar.f206779a2.get(), (o1) eVar.Y3.get());
            case 356:
                return new umf.a((h0) eVar.E.get(), (olf.l) eVar.f206844p6.get(), eVar.A0(), (c6) eVar.f206795d2.get(), (o1) eVar.Y3.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 357:
                jt0.b bVarR = eVar.R();
                r1 r1Var = (r1) eVar.c2.get();
                glc.b bVar2 = (glc.b) dVar.R0.f116042x.get();
                vc.s.j(bVar2);
                return new olf.l(bVarR, r1Var, bVar2);
            case 358:
                return new qmf.a((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (k7) eVar.f206781a4.get(), (kkf.d0) eVar.W3.get(), (wkf.f) eVar.S1.get(), (wkf.d) eVar.R1.get(), (kkf.e) eVar.W0.get());
            case 359:
                return new hmf.x((h0) eVar.E.get(), eVar.R(), (akf.c) eVar.j0.get(), (akf.s1) eVar.Y.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (kkf.x) eVar.f206842p4.get(), new kkf.m0((h0) eVar.E.get()), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), eVar.p0(), (o2) eVar.f206880y1.get(), (clf.a) eVar.C2.get());
            case 360:
                h0 h0Var7 = (h0) eVar.E.get();
                nof.i iVar2 = (nof.i) eVar.f206789b6.get();
                prl.e eVarI = eVar.I();
                jlf.b bVar3 = (jlf.b) eVar.O3.get();
                amf.a aVar = (amf.a) eVar.f206814i4.get();
                amf.c cVarA0 = eVar.A0();
                amf.l lVar = (amf.l) eVar.e4.get();
                akf.c cVar = (akf.c) eVar.j0.get();
                ekf.f fVar2 = (ekf.f) eVar.C0.get();
                ekf.m mVar = (ekf.m) eVar.I0.get();
                vkf.f fVar3 = (vkf.f) eVar.f206859t0.get();
                dkf.g gVar = (dkf.g) eVar.H0.get();
                akf.s1 s1Var = (akf.s1) eVar.Y.get();
                kkf.e eVar2 = (kkf.e) eVar.W0.get();
                jt0.b bVarD = eVar.D();
                mkf.c cVarG = eVar.G();
                mkf.h hVar2 = (mkf.h) eVar.f206862t6.get();
                mkf.l lVar2 = (mkf.l) eVar.f206882y4.get();
                xkf.e eVar3 = (xkf.e) eVar.f206865u6.get();
                mkf.r rVar = (mkf.r) eVar.c6.get();
                mkf.u uVar = new mkf.u((h0) eVar.E.get());
                mkf.c0 c0Var = (mkf.c0) eVar.F0.get();
                mkf.f0 f0Var = new mkf.f0((h0) eVar.E.get());
                kkf.d0 d0Var = (kkf.d0) eVar.W3.get();
                sz5.f fVarK0 = eVar.k0();
                mkf.i0 i0Var = (mkf.i0) eVar.D0.get();
                k7i.i iVarO0 = eVar.o0();
                rhf.d dVar2 = (rhf.d) eVar.i0.get();
                kkf.y0 y0VarP0 = eVar.p0();
                k1 k1Var = (k1) eVar.f206836o2.get();
                o1 o1Var = (o1) eVar.Y3.get();
                e84.e eVarZ0 = eVar.z0();
                vkf.j jVar = (vkf.j) eVar.f206884z2.get();
                kkf.y1 y1VarC0 = eVar.C0();
                d2 d2Var = (d2) eVar.J2.get();
                z3 z3Var = (z3) eVar.r2.get();
                xkf.x0 x0Var = new xkf.x0((h0) eVar.E.get());
                h0 h0Var8 = (h0) eVar.E.get();
                co9.b bVarB2 = eVar.d.u0.b();
                vc.s.j(bVarB2);
                dlf.j jVar2 = new dlf.j(h0Var8, bVarB2);
                xkf.q1 q1Var = (xkf.q1) eVar.f206803f3.get();
                zkf.p pVar = (zkf.p) eVar.d6.get();
                mkf.o0 o0VarG1 = eVar.g1();
                z4 z4Var = (z4) eVar.f206848q4.get();
                b5 b5Var = (b5) eVar.D2.get();
                t5 t5Var = (t5) eVar.S0.get();
                z1 z1Var2 = (z1) eVar.g3.get();
                h6 h6Var = (h6) eVar.G2.get();
                clf.a aVar2 = (clf.a) eVar.C2.get();
                n7 n7Var = (n7) eVar.b4.get();
                mkf.u0 u0VarR1 = eVar.r1();
                e7 e7Var = (e7) eVar.U0.get();
                i7 i7Var = (i7) eVar.X0.get();
                k7 k7Var = (k7) eVar.f206781a4.get();
                s7 s7Var = (s7) eVar.K1.get();
                j8 j8Var = (j8) eVar.H2.get();
                o8 o8Var = new o8((h0) eVar.E.get());
                s8 s8Var = (s8) eVar.I2.get();
                mkf.w0 w0VarW1 = eVar.w1();
                gte.a aVarB3 = dVar.f206729c.b();
                vc.s.j(aVarB3);
                return new rmf.a(h0Var7, iVar2, eVarI, bVar3, aVar, cVarA0, lVar, cVar, fVar2, mVar, fVar3, gVar, s1Var, eVar2, bVarD, cVarG, hVar2, lVar2, eVar3, rVar, uVar, c0Var, f0Var, d0Var, fVarK0, i0Var, iVarO0, dVar2, y0VarP0, k1Var, o1Var, eVarZ0, jVar, y1VarC0, d2Var, z3Var, x0Var, jVar2, q1Var, pVar, o0VarG1, z4Var, b5Var, t5Var, z1Var2, h6Var, aVar2, n7Var, u0VarR1, e7Var, i7Var, k7Var, s7Var, j8Var, o8Var, s8Var, w0VarW1, aVarB3);
            case 361:
                return new mkf.h((h0) eVar.E.get(), (wnf.b) eVar.N0.get());
            case 362:
                return new xkf.e((h0) eVar.E.get(), eVar.u1(), eVar.J(), (jlf.f) eVar.f206838o5.get());
            case 363:
                return new rmf.d((h0) eVar.E.get(), (nof.i) eVar.f206789b6.get(), eVar.R0(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (amf.o) eVar.V3.get(), (akf.c) eVar.j0.get(), (vkf.f) eVar.f206859t0.get(), (akf.r0) eVar.f206878x6.get(), (ekf.v) eVar.y0.get(), (ekf.i0) eVar.B0.get(), (akf.s1) eVar.Y.get(), new ekf.y(new ekf.w()), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (rhf.d) eVar.i0.get(), eVar.p0(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.z0(), (vkf.j) eVar.f206884z2.get(), eVar.C0(), (xkf.s) eVar.f206883y6.get(), (kkf.j2) eVar.z6.get(), (o2) eVar.f206880y1.get(), (xkf.w) eVar.A6.get(), eVar.I0(), (xkf.f0) eVar.B6.get(), (xkf.a1) eVar.f206843p5.get(), (xkf.m0) eVar.C6.get(), (v0) eVar.B2.get(), (xkf.q1) eVar.f206803f3.get(), (h6) eVar.G2.get(), (e7) eVar.U0.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (s7) eVar.K1.get(), (l8) eVar.f206801f1.get(), (s8) eVar.I2.get(), (k9) eVar.P1.get(), (clf.a) eVar.C2.get(), (jlf.e) eVar.N3.get(), new rmf.b());
            case 364:
                return new akf.r0((wnf.b) eVar.N0.get(), (klf.h1) eVar.w6.get(), (t0) eVar.f206868v3.get());
            case 365:
                CoroutineScope coroutineScope3 = (CoroutineScope) eVar.B.get();
                h0 h0Var9 = (h0) eVar.E.get();
                wsg.n nVarB = dVar.z.b();
                ao.h hVarA = dVar.q0.a();
                ogm.i iVar3 = new ogm.i((wq8.c) ((oq8.a) dVar.f206776z1).o.get());
                hj8.a aVarA = dVar.f206725a0.a();
                vc.s.j(aVarA);
                return new klf.h1(coroutineScope3, h0Var9, nVarB, hVarA, iVar3, aVarA);
            case 366:
                return new xkf.s((h0) eVar.E.get(), dVar.f206758r0.b(), dVar.q0.a(), new xkf.p(), eVar.E0());
            case 367:
                return new kkf.j2((wnf.b) eVar.N0.get(), (klf.h1) eVar.w6.get(), (t0) eVar.f206868v3.get());
            case 368:
                h0 h0Var10 = (h0) eVar.E.get();
                fnc.s sVarB = ((j1a.i) dVar.f206742j).b();
                ge3.e eVarD = dVar.f206766u1.d();
                vc.s.j(eVarD);
                thf.d dVarD = dVar.f206738h.d();
                vc.s.j(dVarD);
                return new xkf.w(h0Var10, sVarB, eVarD, dVarD);
            case 369:
                return new xkf.f0((h0) eVar.E.get(), new xkf.d0(), eVar.O0(), (j2) eVar.o3.get());
            case 370:
                return new xkf.m0((h0) eVar.E.get(), new xkf.j0(), eVar.P0());
            case 371:
                return new rmf.e((h0) eVar.E.get(), (m1) eVar.T.get(), (nof.i) eVar.f206789b6.get(), (jlf.l) eVar.J3.get(), eVar.Z0(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (ekf.j) eVar.f206870w0.get(), (akf.r0) eVar.f206878x6.get(), (c1) eVar.f206866v0.get(), (xkf.b) eVar.E6.get(), (kkf.e) eVar.W0.get(), (kkf.x) eVar.f206842p4.get(), (kkf.d0) eVar.W3.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), (kkf.j2) eVar.z6.get(), (xkf.c1) eVar.F6.get(), (xkf.e1) eVar.G6.get(), (ykf.b) eVar.f206796d3.get(), (xkf.q1) eVar.f206803f3.get(), (clf.a) eVar.C2.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (l8) eVar.f206801f1.get());
            case 372:
                h0 h0Var11 = (h0) eVar.E.get();
                k61.a aVarE = dVar.f206774y.e();
                vc.s.j(aVarE);
                return new xkf.b(h0Var11, aVarE, dVar.A1.a());
            case 373:
                return new xkf.c1((h0) eVar.E.get());
            case 374:
                return new xkf.e1((h0) eVar.E.get(), eVar.a1());
            case 375:
                return new rmf.f((h0) eVar.E.get(), (nof.i) eVar.f206789b6.get(), (tlf.q) eVar.I6.get(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (akf.c) eVar.j0.get(), (ekf.r0) eVar.M3.get(), (akf.s1) eVar.Y.get(), (kkf.e) eVar.W0.get(), (kkf.d0) eVar.W3.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.C0(), (xkf.a1) eVar.f206843p5.get(), (xkf.q1) eVar.f206803f3.get(), (xkf.t1) eVar.J6.get(), (h6) eVar.G2.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (n7) eVar.b4.get(), (s7) eVar.K1.get(), (j8) eVar.H2.get(), (s8) eVar.I2.get(), (i9) eVar.Z3.get(), (k9) eVar.P1.get(), (jlf.r) eVar.L3.get());
            case 376:
                jt0.b bVarR2 = eVar.R();
                h0 h0Var12 = (h0) eVar.E.get();
                gqa.b bVarE = ((jqa.p) dVar.f206755p1).e();
                vc.s.j(bVarE);
                return new tlf.q(bVarR2, h0Var12, bVarE, eVar.h1());
            case 377:
                h0 h0Var13 = (h0) eVar.E.get();
                aqa.e eVarD2 = ((jqa.p) dVar.f206755p1).d();
                vc.s.j(eVarD2);
                return new xkf.t1(h0Var13, eVarD2);
            case 378:
                return new smf.a((h0) eVar.E.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), (amf.o) eVar.V3.get(), eVar.A0(), (akf.c) eVar.j0.get(), (o6) eVar.d5.get(), (kkf.d0) eVar.W3.get(), (kkf.e) eVar.W0.get(), (o1) eVar.Y3.get(), (i9) eVar.Z3.get(), (alf.c) eVar.L6.get(), (clf.a) eVar.C2.get());
            case 379:
                h0 h0Var14 = (h0) eVar.E.get();
                m1 m1Var2 = (m1) eVar.T.get();
                wwa.b bVarA = dVar.B1.a();
                vc.s.j(bVarA);
                return new alf.c(h0Var14, m1Var2, bVarA, ((s41.a) dVar.L0).d());
            case 380:
                return new pmf.a((h0) eVar.E.get(), (nof.i) eVar.f206789b6.get(), eVar.R(), (amf.a) eVar.f206814i4.get(), eVar.A0(), (dkf.g) eVar.H0.get(), (kkf.e) eVar.W0.get(), (xkf.e) eVar.f206865u6.get(), (k1) eVar.f206836o2.get(), (o1) eVar.Y3.get(), eVar.C0(), (z3) eVar.r2.get(), (b5) eVar.D2.get(), (t5) eVar.S0.get(), (i7) eVar.X0.get(), (k7) eVar.f206781a4.get(), (s7) eVar.K1.get());
            case 381:
                return gmf.b.q((com.revolut.kompot.navigable.a) eVar.f206804g.get());
            case 382:
                return new fmf.q0((vlf.b) eVar.O0.get());
            default:
                throw new AssertionError(i);
        }
    }
}
