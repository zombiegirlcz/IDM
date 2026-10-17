package ljl;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.wallet.WalletConstants;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase;
import com.revolut.feature.retail.cfd.impl.network.CfdService;
import com.revolut.feature.revolut_shop.data.service.IppShopService;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import h80.e;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jm4.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import lp.j4;
import lp.l4;
import lp.n9;
import lp.s4;
import lp.z4;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.LDSFile;
import qgk.i3;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f196142c;

    public /* synthetic */ y(Object obj2, int i, int i2) {
        this.f196140a = i2;
        this.f196142c = obj2;
        this.f196141b = i;
    }

    private final Object a() {
        b60.a aVar;
        lp.q1 q1Var = (lp.q1) this.f196142c;
        int i = this.f196141b;
        int i2 = i / 100;
        if (i2 == 0) {
            switch (i) {
                case 0:
                    b60.a aVar2 = (b60.a) ((m46.a) q1Var.f197936sc.get()).e.get();
                    vc.s.k(aVar2);
                    return aVar2;
                case 1:
                    b60.a aVar3 = (b60.a) ((j26.a) q1Var.f197864pb.get()).f170707n.get();
                    vc.s.k(aVar3);
                    return aVar3;
                case 2:
                    b60.a aVar4 = (b60.a) ((j26.a) q1Var.f197864pb.get()).f170708p.get();
                    vc.s.k(aVar4);
                    return aVar4;
                case 3:
                    b60.a aVar5 = (b60.a) ((k36.a) q1Var.f197487a.f198614o5.get()).f.get();
                    vc.s.k(aVar5);
                    return aVar5;
                case 4:
                    b60.a aVar6 = (b60.a) ((q36.a) q1Var.f197487a.f198639p5.get()).u.get();
                    vc.s.k(aVar6);
                    return aVar6;
                case 5:
                    b60.a aVar7 = (b60.a) ((y46.a) q1Var.f197814nb.get()).f.get();
                    vc.s.k(aVar7);
                    return aVar7;
                case 6:
                    b60.a aVar8 = (b60.a) ((f56.a) q1Var.f198094zb.get()).f132285q.get();
                    vc.s.k(aVar8);
                    return aVar8;
                case 7:
                    b60.a aVar9 = (b60.a) ((f56.a) q1Var.f198094zb.get()).f132286r.get();
                    vc.s.k(aVar9);
                    return aVar9;
                case 8:
                    b60.a aVar10 = (b60.a) ((v66.a) q1Var.f198044xb.get()).f286328h.get();
                    vc.s.k(aVar10);
                    return aVar10;
                case 9:
                    b60.a aVar11 = (b60.a) ((v66.a) q1Var.f198044xb.get()).f286329j.get();
                    vc.s.k(aVar11);
                    return aVar11;
                case 10:
                    b60.a aVar12 = (b60.a) ((f76.a) q1Var.f198003vc.get()).e.get();
                    vc.s.k(aVar12);
                    return aVar12;
                case 11:
                    b60.a aVar13 = (b60.a) ((d66.a) q1Var.f197487a.q5.get()).e.get();
                    vc.s.k(aVar13);
                    return aVar13;
                case 12:
                    b60.a aVar14 = (b60.a) ((l76.a) q1Var.Z8.get()).f192536a.get();
                    vc.s.k(aVar14);
                    return aVar14;
                case 13:
                    b60.a aVar15 = (b60.a) ((o76.a) q1Var.f197520b9.get()).i.get();
                    vc.s.k(aVar15);
                    return aVar15;
                case 14:
                    b60.a aVar16 = (b60.a) ((ze5.a) q1Var.f197487a.f198687r5.get()).k.get();
                    vc.s.k(aVar16);
                    return aVar16;
                case 15:
                    b60.a aVar17 = (b60.a) ((eq6.a) q1Var.J9.get()).f128364g.get();
                    vc.s.k(aVar17);
                    return aVar17;
                case 16:
                    b60.a aVar18 = (b60.a) ((csc.a) q1Var.f197666h9.get()).f108466g.get();
                    vc.s.k(aVar18);
                    return aVar18;
                case 17:
                    b60.a aVar19 = (b60.a) ((e59.c) q1Var.f197820nk.get()).e.get();
                    vc.s.k(aVar19);
                    return aVar19;
                case 18:
                    b60.a aVar20 = (b60.a) ((tq3.a) q1Var.A8.get()).f273517q.get();
                    vc.s.k(aVar20);
                    return aVar20;
                case 19:
                    b60.a aVar21 = (b60.a) ((bw3.d) q1Var.f197502ah.get()).f19210o0.get();
                    vc.s.k(aVar21);
                    return aVar21;
                case 20:
                    b60.a aVar22 = (b60.a) ((cb5.a) q1Var.f197597eg.get()).d.get();
                    vc.s.k(aVar22);
                    return aVar22;
                case 21:
                    b60.a aVar23 = (b60.a) ((u9k.a) q1Var.Rg.get()).i.get();
                    vc.s.k(aVar23);
                    return aVar23;
                case 22:
                    b60.a aVar24 = (b60.a) ((u9k.a) q1Var.Rg.get()).f278505j.get();
                    vc.s.k(aVar24);
                    return aVar24;
                case 23:
                    b60.a aVar25 = (b60.a) ((cw3.a) q1Var.T2.get()).f109530c.get();
                    vc.s.k(aVar25);
                    return aVar25;
                case 24:
                    b60.a aVar26 = (b60.a) ((qz4.c) q1Var.f197487a.f198713s5.get()).k.get();
                    vc.s.k(aVar26);
                    return aVar26;
                case 25:
                    b60.a aVar27 = (b60.a) ((ltb.a) q1Var.f197707ir.get()).f.get();
                    vc.s.k(aVar27);
                    return aVar27;
                case 26:
                    b60.a aVar28 = (b60.a) ((ltb.a) q1Var.f197707ir.get()).f199849g.get();
                    vc.s.k(aVar28);
                    return aVar28;
                case 27:
                    b60.a aVar29 = (b60.a) ((lbb.d) q1Var.f197655gr.get()).J.get();
                    vc.s.k(aVar29);
                    return aVar29;
                case 28:
                    b60.a aVar30 = (b60.a) ((lbb.a) q1Var.Aj.get()).e.get();
                    vc.s.k(aVar30);
                    return aVar30;
                case 29:
                    b60.a aVar31 = (b60.a) ((l49.a) q1Var.Yp.get()).f192078b.get();
                    vc.s.k(aVar31);
                    return aVar31;
                case 30:
                    b60.a aVar32 = (b60.a) ((p49.c) q1Var.f197487a.t5.get()).d.get();
                    vc.s.k(aVar32);
                    return aVar32;
                case 31:
                    b60.a aVar33 = (b60.a) ((ubb.a) q1Var.Wp.get()).E.get();
                    vc.s.k(aVar33);
                    return aVar33;
                case 32:
                    b60.a aVar34 = (b60.a) ((ige.c) q1Var.f197954t6.get()).J.get();
                    vc.s.k(aVar34);
                    return aVar34;
                case 33:
                    b60.a aVar35 = (b60.a) ((ige.c) q1Var.f197954t6.get()).F.get();
                    vc.s.k(aVar35);
                    return aVar35;
                case 34:
                    b60.a aVar36 = (b60.a) ((ige.c) q1Var.f197954t6.get()).K.get();
                    vc.s.k(aVar36);
                    return aVar36;
                case 35:
                    b60.a aVar37 = (b60.a) ((ige.c) q1Var.f197954t6.get()).M.get();
                    vc.s.k(aVar37);
                    return aVar37;
                case 36:
                    b60.a aVar38 = (b60.a) ((ige.c) q1Var.f197954t6.get()).H.get();
                    vc.s.k(aVar38);
                    return aVar38;
                case 37:
                    b60.a aVar39 = (b60.a) ((ige.c) q1Var.f197954t6.get()).B.get();
                    vc.s.k(aVar39);
                    return aVar39;
                case 38:
                    b60.a aVar40 = (b60.a) ((ige.c) q1Var.f197954t6.get()).z.get();
                    vc.s.k(aVar40);
                    return aVar40;
                case 39:
                    b60.a aVar41 = (b60.a) ((ige.c) q1Var.f197954t6.get()).D.get();
                    vc.s.k(aVar41);
                    return aVar41;
                case 40:
                    b60.a aVar42 = (b60.a) ((dhe.a) q1Var.f197752kr.get()).f114803s0.get();
                    vc.s.k(aVar42);
                    return aVar42;
                case 41:
                    b60.a aVar43 = (b60.a) ((rke.b) q1Var.Qj.get()).f254838a0.get();
                    vc.s.k(aVar43);
                    return aVar43;
                case 42:
                    b60.a aVar44 = (b60.a) ((gje.a) q1Var.wq.get()).U.get();
                    vc.s.k(aVar44);
                    return aVar44;
                case 43:
                    b60.a aVarA = ((ule.a) q1Var.Hq.get()).a();
                    vc.s.k(aVarA);
                    return aVarA;
                case 44:
                    b60.a aVar45 = (b60.a) ((xy5.a) q1Var.f197671he.get()).D.get();
                    vc.s.k(aVar45);
                    return aVar45;
                case 45:
                    b60.a aVar46 = (b60.a) ((b89.a) q1Var.f197719je.get()).i.get();
                    vc.s.k(aVar46);
                    return aVar46;
                case 46:
                    b60.a aVar47 = (b60.a) ((b89.a) q1Var.f197719je.get()).f13144g.get();
                    vc.s.k(aVar47);
                    return aVar47;
                case 47:
                    b60.a aVar48 = (b60.a) ((b6e.a) q1Var.f197870ph.get()).f12741l.get();
                    vc.s.k(aVar48);
                    return aVar48;
                case 48:
                    b60.a aVar49 = (b60.a) ((t15.g) q1Var.f197623fh.get()).D.get();
                    vc.s.k(aVar49);
                    return aVar49;
                case 49:
                    b60.a aVar50 = (b60.a) ((t15.g) q1Var.f197623fh.get()).E.get();
                    vc.s.k(aVar50);
                    return aVar50;
                case 50:
                    b60.a aVar51 = (b60.a) ((i78.b) q1Var.Lf.get()).S.get();
                    vc.s.k(aVar51);
                    return aVar51;
                case 51:
                    b60.a aVar52 = (b60.a) ((dqe.a) q1Var.Jp.get()).f116976j.get();
                    vc.s.k(aVar52);
                    return aVar52;
                case 52:
                    b60.a aVar53 = (b60.a) ((uf6.d) q1Var.f197721jh.get()).i.get();
                    vc.s.k(aVar53);
                    return aVar53;
                case 53:
                    b60.a aVar54 = (b60.a) ((xha.a) q1Var.f197766le.get()).f305848s.get();
                    vc.s.k(aVar54);
                    return aVar54;
                case 54:
                    b60.a aVarA2 = ((r29.d) q1Var.K8.get()).a();
                    vc.s.k(aVarA2);
                    return aVarA2;
                case 55:
                    b60.a aVar55 = (b60.a) ((r29.e) q1Var.f197746kl.get()).e.get();
                    vc.s.k(aVar55);
                    return aVar55;
                case 56:
                    b60.a aVar56 = (b60.a) ((r29.f) q1Var.f197795ml.get()).f.get();
                    vc.s.k(aVar56);
                    return aVar56;
                case 57:
                    b60.a aVar57 = (b60.a) ((n19.a) q1Var.I8.get()).f.get();
                    vc.s.k(aVar57);
                    return aVar57;
                case 58:
                    b60.a aVar58 = (b60.a) ((r29.b) q1Var.v7.get()).f251073c.get();
                    vc.s.k(aVar58);
                    return aVar58;
                case 59:
                    b60.a aVar59 = (b60.a) ((r29.a) q1Var.G8.get()).d.get();
                    vc.s.k(aVar59);
                    return aVar59;
                case 60:
                    b60.a aVar60 = (b60.a) ((r29.a) q1Var.G8.get()).f.get();
                    vc.s.k(aVar60);
                    return aVar60;
                case 61:
                    b60.a aVar61 = (b60.a) ((d39.a) q1Var.f197701il.get()).v.get();
                    vc.s.k(aVar61);
                    return aVar61;
                case 62:
                    b60.a aVar62 = (b60.a) ((xxb.b) q1Var.Ue.get()).W.get();
                    vc.s.k(aVar62);
                    return aVar62;
                case 63:
                    b60.a aVar63 = (b60.a) ((xxb.b) q1Var.Ue.get()).X.get();
                    vc.s.k(aVar63);
                    return aVar63;
                case 64:
                    b60.a aVar64 = (b60.a) ((xxb.b) q1Var.Ue.get()).Y.get();
                    vc.s.k(aVar64);
                    return aVar64;
                case 65:
                    b60.a aVar65 = (b60.a) ((xxb.a) q1Var.F7.get()).z.get();
                    vc.s.k(aVar65);
                    return aVar65;
                case 66:
                    b60.a aVar66 = (b60.a) ((xxb.a) q1Var.F7.get()).C.get();
                    vc.s.k(aVar66);
                    return aVar66;
                case 67:
                    b60.a aVar67 = (b60.a) ((xxb.a) q1Var.F7.get()).A.get();
                    vc.s.k(aVar67);
                    return aVar67;
                case 68:
                    b60.a aVar68 = (b60.a) ((xxb.d) q1Var.t7.get()).e.get();
                    vc.s.k(aVar68);
                    return aVar68;
                case 69:
                    b60.a aVar69 = (b60.a) ((xxb.c) q1Var.f197632fs.get()).e.get();
                    vc.s.k(aVar69);
                    return aVar69;
                case 70:
                    b60.a aVar70 = (b60.a) ((hdi.b) q1Var.Rk.get()).k.get();
                    vc.s.k(aVar70);
                    return aVar70;
                case 71:
                    b60.a aVar71 = (b60.a) ((hdi.b) q1Var.Rk.get()).f151452l.get();
                    vc.s.k(aVar71);
                    return aVar71;
                case 72:
                    b60.a aVar72 = (b60.a) ((hdi.b) q1Var.Rk.get()).f151453m.get();
                    vc.s.k(aVar72);
                    return aVar72;
                case 73:
                    b60.a aVar73 = (b60.a) ((hdi.a) q1Var.z6.get()).i.get();
                    vc.s.k(aVar73);
                    return aVar73;
                case 74:
                    b60.a aVar74 = (b60.a) ((hdi.d) q1Var.f197792mh.get()).i.get();
                    vc.s.k(aVar74);
                    return aVar74;
                case 75:
                    b60.a aVar75 = (b60.a) ((hdi.c) q1Var.f197690i8.get()).f151455b.get();
                    vc.s.k(aVar75);
                    return aVar75;
                case 76:
                    b60.a aVar76 = (b60.a) ((gwb.b) q1Var.Tk.get()).f147300t.get();
                    vc.s.k(aVar76);
                    return aVar76;
                case 77:
                    b60.a aVar77 = (b60.a) ((gwb.b) q1Var.Tk.get()).u.get();
                    vc.s.k(aVar77);
                    return aVar77;
                case 78:
                    b60.a aVar78 = (b60.a) ((gwb.b) q1Var.Tk.get()).v.get();
                    vc.s.k(aVar78);
                    return aVar78;
                case 79:
                    b60.a aVar79 = (b60.a) ((gwb.b) q1Var.Tk.get()).f147301w.get();
                    vc.s.k(aVar79);
                    return aVar79;
                case 80:
                    b60.a aVar80 = (b60.a) ((gwb.a) q1Var.x7.get()).i.get();
                    vc.s.k(aVar80);
                    return aVar80;
                case 81:
                    b60.a aVar81 = (b60.a) ((kvb.f) q1Var.f197494a8.get()).f190090p.get();
                    vc.s.k(aVar81);
                    return aVar81;
                case 82:
                    b60.a aVar82 = (b60.a) ((kvb.f) q1Var.f197494a8.get()).f190091q.get();
                    vc.s.k(aVar82);
                    return aVar82;
                case 83:
                    b60.a aVar83 = (b60.a) ((uub.b) q1Var.f197504al.get()).f283203m.get();
                    vc.s.k(aVar83);
                    return aVar83;
                case 84:
                    b60.a aVar84 = (b60.a) ((uub.b) q1Var.f197504al.get()).f283204n.get();
                    vc.s.k(aVar84);
                    return aVar84;
                case 85:
                    b60.a aVar85 = (b60.a) ((uub.a) q1Var.B7.get()).i.get();
                    vc.s.k(aVar85);
                    return aVar85;
                case 86:
                    b60.a aVar86 = (b60.a) ((v1c.b) q1Var.f197487a.u5.get()).i.get();
                    vc.s.k(aVar86);
                    return aVar86;
                case 87:
                    b60.a aVar87 = (b60.a) ((v1c.a) q1Var.f198090z7.get()).f285284g.get();
                    vc.s.k(aVar87);
                    return aVar87;
                case 88:
                    b60.a aVar88 = (b60.a) ((bfb.b) q1Var.f197601el.get()).v.get();
                    vc.s.k(aVar88);
                    return aVar88;
                case 89:
                    b60.a aVar89 = (b60.a) ((bfb.b) q1Var.f197601el.get()).f14936r.get();
                    vc.s.k(aVar89);
                    return aVar89;
                case 90:
                    b60.a aVar90 = (b60.a) ((bfb.b) q1Var.f197601el.get()).f14938t.get();
                    vc.s.k(aVar90);
                    return aVar90;
                case 91:
                    b60.a aVar91 = (b60.a) ((bfb.a) q1Var.f197554cl.get()).f14924b.get();
                    vc.s.k(aVar91);
                    return aVar91;
                case 92:
                    return new vhi.a();
                case 93:
                    z4.r((iza.a) q1Var.f197487a.f198268a.Cg.get());
                    return new nza.a();
                case 94:
                    gte.a aVarB = ((j4i.a) q1Var.ns.get()).f171402g.b();
                    vc.s.j(aVarB);
                    return new o4i.c(aVarB, new o4i.a());
                case 95:
                    return new oyk.c();
                case 96:
                    return new oyk.b();
                case 97:
                    return new oyk.a();
                case 98:
                    b60.a aVar92 = (b60.a) ((dzj.a) q1Var.f197513b.f198110a.f197487a.f198537l.get()).f121350l.get();
                    vc.s.k(aVar92);
                    vc.s.k((ezj.a) aVar92.b());
                    return new dzj.c();
                case 99:
                    return new gde.e(new ogk.f());
                default:
                    throw new AssertionError(i);
            }
        }
        if (i2 == 1) {
            return b();
        }
        if (i2 == 2) {
            return c();
        }
        if (i2 == 3) {
            return d();
        }
        if (i2 != 4) {
            throw new AssertionError(i);
        }
        switch (i) {
            case 400:
                bmd.a aVar93 = (bmd.a) ((jmd.d) q1Var.f197500af.get()).J0.get();
                vc.s.k(aVar93);
                return aVar93;
            case 401:
                bmd.e eVar = (bmd.e) ((jmd.d) q1Var.f197500af.get()).K0.get();
                vc.s.k(eVar);
                return eVar;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                b60.a aVar94 = (b60.a) ((vj2.a) q1Var.f197513b.f198110a.l5.get()).f289645t.get();
                vc.s.k(aVar94);
                xj2.n nVar = (xj2.n) aVar94.b();
                vc.s.k(nVar);
                return nVar.a();
            case 403:
                u0j.b bVar = (u0j.b) ((zvj.a) q1Var.Ig.get()).N.get();
                vc.s.k(bVar);
                return bVar;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                u0j.b bVar2 = (u0j.b) ((zvj.a) q1Var.Ig.get()).N.get();
                vc.s.k(bVar2);
                return bVar2;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                sri.m mVarD = ((g8b.a) ((zvj.a) q1Var.Ig.get()).E).d();
                vc.s.j(mVarD);
                return new cid.a(mVarD, 3);
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                s41.a aVar95 = (s41.a) q1Var.f197513b.i6();
                Context context = aVar95.f259711a;
                phm.a aVar96 = (phm.a) kii.e.l(context, "context", context, tv9.a.class);
                b60.a aVar97 = aVar96 != null ? (b60.a) aVar96.get() : null;
                if (aVar97 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", tv9.a.class, " is not found"));
                }
                vv9.c cVarC = ((s6k.b) ((tv9.a) aVar97.b())).c();
                vc.s.k(cVarC);
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar98 = (phm.a) j6.a.i(context, tv9.a.class);
                b60.a aVar99 = aVar98 != null ? (b60.a) aVar98.get() : null;
                if (aVar99 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", tv9.a.class, " is not found"));
                }
                vv9.a aVarA3 = ((s6k.b) ((tv9.a) aVar99.b())).a();
                vc.s.k(aVarA3);
                cl3.a aVarA4 = aVar95.a();
                sri.m mVarD2 = ((g8b.a) aVar95.f259712b).d();
                vc.s.j(mVarD2);
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar100 = (phm.a) j6.a.i(context, mj8.b.class);
                aVar = aVar100 != null ? (b60.a) aVar100.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", mj8.b.class, " is not found"));
                }
                hj8.a aVarA5 = ((mj8.b) aVar.b()).a();
                vc.s.k(aVarA5);
                return new vli.k(cVarC, aVarA3, aVarA4, mVarD2, aVarA5);
            case 407:
                s41.a aVar101 = (s41.a) q1Var.f197513b.i6();
                sri.m mVarD3 = ((g8b.a) aVar101.f259712b).d();
                vc.s.j(mVarD3);
                return new vli.d(aVar101.b(), mVarD3);
            case 408:
                sri.m mVarD4 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD4);
                return new vli.m(mVarD4);
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                s41.a aVar102 = (s41.a) q1Var.f197513b.i6();
                sri.m mVarD5 = ((g8b.a) aVar102.f259712b).d();
                vc.s.j(mVarD5);
                Context context2 = aVar102.f259711a;
                phm.a aVar103 = (phm.a) kii.e.l(context2, "context", context2, l70.e.class);
                b60.a aVar104 = aVar103 != null ? (b60.a) aVar103.get() : null;
                if (aVar104 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                }
                b80.c cVarP = ((l70.e) aVar104.b()).p();
                vc.s.k(cVarP);
                gte.a aVarB2 = aVar102.b();
                Intrinsics.checkNotNullParameter(context2, "context");
                phm.a aVar105 = (phm.a) j6.a.i(context2, l70.e.class);
                aVar = aVar105 != null ? (b60.a) aVar105.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                }
                z70.a aVarF = ((l70.e) aVar.b()).f();
                vc.s.k(aVarF);
                return new vli.b(mVarD5, cVarP, aVarB2, aVarF);
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                sri.m mVarD6 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD6);
                return new vli.l(mVarD6);
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                sri.m mVarD7 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD7);
                return new kfe.a(mVarD7);
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                return ((s41.a) q1Var.f197513b.i6()).e();
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                return ((s41.a) q1Var.f197513b.i6()).e();
            case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
                return ((s41.a) q1Var.f197513b.i6()).e();
            case WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE /* 415 */:
                return ((s41.a) q1Var.f197513b.i6()).e();
            case 416:
                return ((s41.a) q1Var.f197513b.i6()).e();
            case 417:
                return ((s41.a) q1Var.f197513b.i6()).g();
            case 418:
                return ((s41.a) q1Var.f197513b.i6()).g();
            case 419:
                return ((s41.a) q1Var.f197513b.i6()).g();
            case 420:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 421:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 422:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 423:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 424:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 425:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 426:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 427:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 428:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 429:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 430:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 431:
                return ((s41.a) q1Var.f197513b.i6()).c();
            case 432:
                s41.a aVar106 = (s41.a) q1Var.f197513b.i6();
                cl3.a aVarA6 = aVar106.a();
                sri.m mVarD8 = ((g8b.a) aVar106.f259712b).d();
                vc.s.j(mVarD8);
                return new nz9.e(aVarA6, mVarD8);
            case OnfidoActivity.ONFIDO_RECREATE /* 433 */:
                return ((s41.a) q1Var.f197513b.i6()).f();
            case 434:
                return ((s41.a) q1Var.f197513b.i6()).f();
            case 435:
                return ((s41.a) q1Var.f197513b.i6()).f();
            case 436:
                sri.m mVarD9 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD9);
                return new ta3.b(mVarD9);
            case 437:
                sri.m mVarD10 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD10);
                return new cid.a(mVarD10, 4);
            case 438:
                sri.m mVarD11 = ((g8b.a) ((s41.a) q1Var.f197513b.i6()).f259712b).d();
                vc.s.j(mVarD11);
                return new cid.a(mVarD11, 6);
            case 439:
                ysa.b bVar3 = (ysa.b) ((fta.b) s4.t(s4.x((fta.g) q1Var.f197487a.B3.get()))).f137982n.get();
                vc.s.k(bVar3);
                return bVar3;
            case 440:
                sfb.b bVar4 = (sfb.b) ((wfb.i) ((wfb.u) q1Var.f197646ge.get())).D.get();
                vc.s.k(bVar4);
                return bVar4;
            case 441:
                sfb.d dVar = (sfb.d) ((wfb.i) ((wfb.u) q1Var.f197646ge.get())).E.get();
                vc.s.k(dVar);
                return dVar;
            case 442:
                wpc.a aVar107 = (wpc.a) ((zpc.k) q1Var.f197487a.W2.get()).F.get();
                vc.s.k(aVar107);
                return aVar107;
            case 443:
                vme.b bVar5 = (vme.b) ((lne.c) q1Var.E7.get()).f197224m.get();
                vc.s.k(bVar5);
                return bVar5;
            case OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP /* 444 */:
                bne.b bVar6 = (bne.b) ((voe.c) q1Var.Zn.get()).k.get();
                vc.s.k(bVar6);
                return bVar6;
            case OnfidoActivity.RESULT_EXIT_INVALID_CERTIFICATE /* 445 */:
                sri.m mVarD12 = ((g8b.a) ((erl.a) q1Var.f197487a.d6.get()).d).d();
                vc.s.j(mVarD12);
                return new drl.a(mVarD12);
            case OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED /* 446 */:
                ah3.f fVar = (ah3.f) ((vg3.g) q1Var.f197487a.fn()).f288735r.get();
                vc.s.k(fVar);
                return fVar;
            case OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG /* 447 */:
                ah3.c cVar = (ah3.c) ((vg3.g) q1Var.f197487a.fn()).f288736s.get();
                vc.s.k(cVar);
                return cVar;
            case CaptureActivity.RESULT_EXIT_USER_FLOW /* 448 */:
                ke6.v vVar = (ke6.v) q1Var.f197487a.fo().M.get();
                vc.s.k(vVar);
                return vVar;
            case 449:
                ke6.x xVar = (ke6.x) q1Var.f197487a.fo().N.get();
                vc.s.k(xVar);
                return xVar;
            case 450:
                ke6.d dVar2 = (ke6.d) q1Var.f197487a.fo().O.get();
                vc.s.k(dVar2);
                return dVar2;
            case 451:
                ax7.b bVar7 = (ax7.b) j4.p(j4.v((cx7.a) q1Var.f197487a.f198663q4.get())).G.get();
                vc.s.k(bVar7);
                return bVar7;
            case 452:
                b60.a aVar108 = (b60.a) ((cv2.b) q1Var.f197513b.f198110a.f197487a.f198737t4.get()).f.get();
                vc.s.k(aVar108);
                ev2.c cVar2 = (ev2.c) aVar108.b();
                vc.s.k(cVar2);
                bv2.b bVar8 = (bv2.b) cVar2.f129689g.get();
                vc.s.k(bVar8);
                return bVar8;
            case 453:
                nb2.b bVar9 = (nb2.b) q1Var.Op.get();
                jla.h hVarA = bVar9.f213959a.a();
                Context context3 = bVar9.f213960b;
                Intrinsics.checkNotNullParameter(context3, "context");
                return new edk.e(hVarA, sri.o.c(context3, null, null, 14));
            case 454:
                b60.a aVar109 = (b60.a) ((r3i.a) q1Var.f197513b.f198110a.f197487a.f198761u4.get()).f251296c.get();
                vc.s.k(aVar109);
                s3i.a aVar110 = (s3i.a) aVar109.b();
                vc.s.k(aVar110);
                p3i.b bVar10 = (p3i.b) aVar110.d.get();
                vc.s.k(bVar10);
                return bVar10;
            case 455:
                b60.a aVar111 = (b60.a) ((zgi.e) q1Var.f197513b.f198110a.f197487a.D4.get()).f322137c.get();
                vc.s.k(aVar111);
                zgi.a aVar112 = (zgi.a) aVar111.b();
                vc.s.k(aVar112);
                wgi.c cVar3 = (wgi.c) aVar112.e.get();
                vc.s.k(cVar3);
                return cVar3;
            case 456:
                b60.a aVar113 = (b60.a) ((dg8.a) q1Var.f197513b.f198110a.f197487a.N4.get()).f114608x.get();
                vc.s.k(aVar113);
                eg8.a aVar114 = (eg8.a) aVar113.b();
                vc.s.k(aVar114);
                cg8.b bVar11 = (cg8.b) aVar114.f125566y.get();
                vc.s.k(bVar11);
                return bVar11;
            case 457:
                jk8.a aVar115 = (jk8.a) ((jk8.d) q1Var.Mp.get());
                xoj.a aVarA7 = aVar115.f175125c.a();
                vc.s.j(aVarA7);
                jx0.a aVar116 = new jx0.a(aVarA7, aVar115.a());
                z70.a aVarF2 = aVar115.f175126g.f();
                vc.s.j(aVarF2);
                return new edk.e(aVar116, jge.r.p(aVarF2));
            case 458:
                vj3.a aVar117 = (vj3.a) ((yj3.a) q1Var.E6.get()).f314405n.get();
                vc.s.k(aVar117);
                return aVar117;
            case 459:
                s5j.b bVar12 = (s5j.b) ((w5j.b) q1Var.Ft.get()).L.get();
                vc.s.k(bVar12);
                return bVar12;
            case 460:
                ebj.c cVarC2 = q1Var.f197513b.e().c();
                vc.s.k(cVarC2);
                return cVarC2;
            case 461:
                ebj.c cVarB = q1Var.f197513b.e().b();
                vc.s.k(cVarB);
                return cVarB;
            case 462:
                ebj.c cVarA = q1Var.f197513b.e().a();
                vc.s.k(cVarA);
                return cVarA;
            case 463:
                go5.d dVar3 = (go5.d) ((yo5.w) ((go5.c) q1Var.f198080yn.get())).F.get();
                vc.s.k(dVar3);
                return dVar3;
            case 464:
                go5.d dVar4 = (go5.d) ((yo5.w) ((go5.c) q1Var.f198080yn.get())).F.get();
                vc.s.k(dVar4);
                return dVar4;
            case 465:
                go5.d dVar5 = (go5.d) ((yo5.w) ((go5.c) q1Var.f198080yn.get())).F.get();
                vc.s.k(dVar5);
                return dVar5;
            case 466:
                rh5.b bVar13 = (rh5.b) ((ei5.d) q1Var.f197511at.get()).f126436w.get();
                vc.s.k(bVar13);
                return bVar13;
            case 467:
                rh5.b bVar14 = (rh5.b) ((ei5.d) q1Var.f197511at.get()).f126436w.get();
                vc.s.k(bVar14);
                return bVar14;
            case 468:
                mt5.b bVar15 = (mt5.b) ((ku5.g) q1Var.M9.get()).E.get();
                vc.s.k(bVar15);
                return bVar15;
            case 469:
                xtd.a aVar118 = (xtd.a) ((qud.c) q1Var.Sb.get()).D.get();
                vc.s.k(aVar118);
                return aVar118;
            case 470:
                hl5.b bVar16 = (hl5.b) ((nl5.e) q1Var.f197923rq.get()).f217020n.get();
                vc.s.k(bVar16);
                return bVar16;
            case 471:
                b60.a aVar119 = (b60.a) ((oe5.e) q1Var.f197513b.f198110a.f197487a.W4.get()).f224550h.get();
                vc.s.k(aVar119);
                oe5.c cVar4 = (oe5.c) aVar119.b();
                vc.s.k(cVar4);
                me5.b bVar17 = (me5.b) cVar4.f224542j.get();
                vc.s.k(bVar17);
                return bVar17;
            case 472:
                b60.a aVar120 = (b60.a) ((dm5.f) q1Var.f197513b.f198110a.f197487a.X4.get()).f.get();
                vc.s.k(aVar120);
                dm5.d dVar6 = (dm5.d) aVar120.b();
                vc.s.k(dVar6);
                bm5.b bVar18 = (bm5.b) dVar6.f115866h.get();
                vc.s.k(bVar18);
                return bVar18;
            case 473:
                b60.a aVar121 = (b60.a) ((qf5.c) q1Var.f197513b.f198110a.bt.get()).f245256s.get();
                vc.s.k(aVar121);
                tf5.e eVar2 = (tf5.e) aVar121.b();
                vc.s.k(eVar2);
                kf5.b bVar19 = (kf5.b) eVar2.f270237q.get();
                vc.s.k(bVar19);
                return bVar19;
            case 474:
                b60.a aVar122 = (b60.a) ((jg5.h) q1Var.f197513b.f198110a.f197487a.f5.get()).f173930g.get();
                vc.s.k(aVar122);
                jg5.g gVar = (jg5.g) aVar122.b();
                vc.s.k(gVar);
                fg5.b bVar20 = (fg5.b) gVar.f173926h.get();
                vc.s.k(bVar20);
                return bVar20;
            case 475:
                d5c.b bVar21 = (d5c.b) q1Var.f197487a.cs().i.get();
                vc.s.k(bVar21);
                return bVar21;
            case 476:
                v9k.c cVar5 = (v9k.c) ((w9k.a) q1Var.Sg.get()).o.get();
                vc.s.k(cVar5);
                return cVar5;
            case 477:
                return q1Var.f197513b.h().d();
            case 478:
                return q1Var.f197513b.h().d();
            case 479:
                return q1Var.f197513b.h().d();
            case DefaultFrameSampler.DESIRED_FRAME_WIDTH /* 480 */:
                return q1Var.f197513b.h().d();
            case 481:
                wfe.b bVarD = ((jge.m) q1Var.f197487a.a()).d();
                vc.s.k(bVarD);
                return bVarD;
            case 482:
                uge.g gVarI = ((jge.m) q1Var.f197487a.a()).i();
                vc.s.k(gVarI);
                return gVarI;
            case 483:
                uge.i iVarJ = ((jge.m) q1Var.f197487a.a()).j();
                vc.s.k(iVarJ);
                return iVarJ;
            case 484:
                jke.b bVarC = ((ske.c) ((gke.a) q1Var.Rj.get())).c();
                vc.s.k(bVarC);
                return bVarC;
            case 485:
                jke.a aVarA8 = ((ske.c) ((gke.a) q1Var.Rj.get())).a();
                vc.s.k(aVarA8);
                return aVarA8;
            case 486:
                yke.b bVarB = ((ske.c) ((gke.a) q1Var.Rj.get())).b();
                vc.s.k(bVarB);
                return bVarB;
            case 487:
                cje.b bVarA = ((jje.c) ((aje.a) q1Var.f198058xq.get())).a();
                vc.s.k(bVarA);
                return bVarA;
            case 488:
                return ((jje.c) ((aje.a) q1Var.f198058xq.get())).b();
            case 489:
                cje.f fVarC = ((jje.c) ((aje.a) q1Var.f198058xq.get())).c();
                vc.s.k(fVarC);
                return fVarC;
            case 490:
                cje.h hVar = (cje.h) ((jje.c) ((aje.a) q1Var.f198058xq.get())).c0.get();
                vc.s.k(hVar);
                return hVar;
            case 491:
                cje.d dVar7 = (cje.d) ((jje.c) ((aje.a) q1Var.f198058xq.get())).f174830d0.get();
                vc.s.k(dVar7);
                return dVar7;
            case 492:
                op3.b bVar22 = (op3.b) ((t15.d) ((lp3.a) q1Var.gh.get())).O.get();
                vc.s.k(bVar22);
                return bVar22;
            case 493:
                s29.g gVar2 = (s29.g) ((t29.c) ((s19.a) q1Var.L8.get())).D.get();
                vc.s.k(gVar2);
                return gVar2;
            case 494:
                s29.b bVar23 = (s29.b) ((t29.c) ((s19.a) q1Var.L8.get())).E.get();
                vc.s.k(bVar23);
                return bVar23;
            case 495:
                xtb.a aVar123 = (xtb.a) ((zxb.e) q1Var.f197895ql.get()).f326118a0.get();
                vc.s.k(aVar123);
                return aVar123;
            case 496:
                evb.a aVar124 = (evb.a) ((kvb.b) q1Var.f197519b8.get()).o.get();
                vc.s.k(aVar124);
                return aVar124;
            default:
                throw new AssertionError(i);
        }
    }

    public Object b() {
        lp.q1 q1Var = (lp.q1) this.f196142c;
        int i = this.f196141b;
        switch (i) {
            case 100:
                gte.a aVarB = ((fma.h) q1Var.Lk.get()).f136132c.b();
                vc.s.j(aVarB);
                return new fma.l0(aVarB);
            case 101:
                gte.a aVarB2 = ((mva.b) q1Var.Bi.get()).f.b();
                vc.s.j(aVarB2);
                return new kva.b(aVarB2);
            case 102:
                uie.l lVar = (uie.l) q1Var.f197551ch.get();
                vie.h hVarA = lVar.f280401b.a();
                vc.s.j(hVarA);
                return new wie.b(new xie.c(hVarA, (vie.j) lVar.i.get()));
            case 103:
                gte.a featureToggle = ((ap3.h) q1Var.f197513b.c()).f8088b.b();
                vc.s.j(featureToggle);
                Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
                return new com.revolut.feature.corporate_events.impl.navigation.a();
            case 104:
                return new ni9.b(((oi9.f) q1Var.f198072ye.get()).o());
            case 105:
                b60.a aVar = (b60.a) ((r2j.b) q1Var.f197513b.f198110a.f197487a.S.get()).f251132l.get();
                vc.s.k(aVar);
                vc.s.k((s2j.c) aVar.b());
                return new r2j.a();
            case 106:
                return new uhc.d();
            case 107:
                uri.a aVar2 = (uri.a) ((c4f.a) q1Var.Cs.get()).f21192y.get();
                vc.s.k(aVar2);
                return aVar2;
            case LDSFile.EF_DG12_TAG /* 108 */:
                return new y0e.c();
            case LDSFile.EF_DG13_TAG /* 109 */:
                uri.a aVar3 = (uri.a) ((qth.g) q1Var.Br.get()).f249145t.get();
                vc.s.k(aVar3);
                return aVar3;
            case LDSFile.EF_DG14_TAG /* 110 */:
                b60.a aVar4 = (b60.a) ((ow9.k) q1Var.f197513b.f198110a.f197487a.q1.get()).B.get();
                vc.s.k(aVar4);
                vc.s.k((ow9.a) aVar4.b());
                return new nw9.h();
            case LDSFile.EF_DG15_TAG /* 111 */:
                uri.a aVar5 = (uri.a) ((l9f.k) q1Var.f197487a.Y2.get()).Q.get();
                vc.s.k(aVar5);
                return aVar5;
            case 112:
                return new hne.a();
            case 113:
                uri.a aVar6 = (uri.a) ((u45.h) q1Var.f197619fd.get()).F.get();
                vc.s.k(aVar6);
                return aVar6;
            case 114:
                return new gde.e(new gde.d());
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                return new wce.a(((ede.b) q1Var.f197736k4.get()).k.g(), new gde.d());
            case 116:
                return new gde.b();
            case LDSFile.EF_DG2_TAG /* 117 */:
                return new gde.c();
            case LDSFile.EF_DG4_TAG /* 118 */:
                return new r83.s(((c73.j) q1Var.Pn.get()).a());
            case LDSFile.EF_SOD_TAG /* 119 */:
                return new tda.b();
            case SyslogConstants.LOG_CLOCK /* 120 */:
                q1Var.f197513b.n6();
                return new mzc.a();
            case 121:
                uri.a aVar7 = (uri.a) ((y77.c) q1Var.f198051xj.get()).f311375w.get();
                vc.s.k(aVar7);
                return aVar7;
            case 122:
                return new rjf.h();
            case 123:
                f80.a aVarX = ((wab.a) q1Var.f197487a.f198588n2.get()).f295857b.x();
                vc.s.j(aVarX);
                return new tab.a(aVarX);
            case 124:
                return new tab.c();
            case ISO781611.SMT_TAG /* 125 */:
                uri.a aVar8 = (uri.a) ((ztg.n) q1Var.Ri.get()).A.get();
                vc.s.k(aVar8);
                return aVar8;
            case 126:
                uri.a aVar9 = (uri.a) ((ztg.n) q1Var.Ri.get()).B.get();
                vc.s.k(aVar9);
                return aVar9;
            case CertificateBody.profileType /* 127 */:
                return new hte.b();
            case 128:
                fy2.d dVar = (fy2.d) q1Var.Nn.get();
                return new mx2.f(dVar.f138886h.c(), new w38.t(), dVar.i.e());
            case 129:
                gte.a aVarB3 = ((s13.d) q1Var.c6.get()).f.b();
                vc.s.j(aVarB3);
                return new o33.b(aVarB3);
            case 130:
                b60.a aVar10 = (b60.a) ((id9.a) q1Var.f197513b.f198110a.f197487a.H3.get()).f160451g.get();
                vc.s.k(aVar10);
                vc.s.k((d99.a) aVar10.b());
                return new id9.b();
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                gte.a aVarB4 = ((ee6.b) ((xd6.a) q1Var.f197630fq.get())).f125081g.b();
                vc.s.j(aVarB4);
                return new de6.d(aVarB4);
            case 132:
                b60.a aVar11 = (b60.a) ((kzl.b) q1Var.f197513b.f198110a.f197487a.J3.get()).f191128a.get();
                vc.s.k(aVar11);
                vc.s.k((kzl.a) aVar11.b());
                return new pwl.a();
            case 133:
                return new com.revolut.feature.stories.navigation.a(((w3e.a) ((w3e.b) q1Var.q5.get())).a());
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                b60.a aVar12 = (b60.a) ((ln8.a) q1Var.f197513b.f198110a.Hf.get()).A.get();
                vc.s.k(aVar12);
                mn8.o oVar = (mn8.o) aVar12.b();
                vc.s.k(oVar);
                f80.a aVarX2 = oVar.f207462a.x();
                vc.s.j(aVarX2);
                return new ln8.b(aVarX2);
            case 135:
                b60.a aVar13 = (b60.a) ((z6d.a) q1Var.f197513b.f198110a.f197487a.P4.get()).f319717b.get();
                vc.s.k(aVar13);
                vc.s.k((u6d.a) aVar13.b());
                return new x6d.b();
            case 136:
                b60.a aVar14 = (b60.a) ((hl8.a) q1Var.f197513b.f198110a.f198098zf.get()).f153410m.get();
                vc.s.k(aVar14);
                il8.k kVar = (il8.k) aVar14.b();
                vc.s.k(kVar);
                uri.a aVar15 = (uri.a) kVar.f162168h.get();
                vc.s.k(aVar15);
                return aVar15;
            case 137:
                b60.a aVar16 = (b60.a) ((ltb.a) q1Var.f197513b.f198110a.f197707ir.get()).f.get();
                vc.s.k(aVar16);
                dtb.a aVar17 = (dtb.a) aVar16.b();
                vc.s.k(aVar17);
                uri.a aVar18 = (uri.a) ((mtb.d) aVar17).e.get();
                vc.s.k(aVar18);
                return aVar18;
            case 138:
                b60.a aVar19 = (b60.a) ((ltb.a) q1Var.f197513b.f198110a.f197707ir.get()).f.get();
                vc.s.k(aVar19);
                dtb.a aVar20 = (dtb.a) aVar19.b();
                vc.s.k(aVar20);
                uri.a aVar21 = (uri.a) ((mtb.d) aVar20).f.get();
                vc.s.k(aVar21);
                return aVar21;
            case 139:
                return new fff.b();
            case 140:
                h1b.a aVar22 = (h1b.a) ((k1b.c) q1Var.A0.get()).f180202s.get();
                vc.s.k(aVar22);
                return aVar22;
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                wqb.a aVar23 = (wqb.a) q1Var.f197876pr.get();
                sri.m mVarD = ((g8b.a) aVar23.f299431b).d();
                vc.s.j(mVarD);
                return new vqb.d(mVarD, aVar23.f());
            case 142:
                pxc.a aVar24 = (pxc.a) ((qxc.a) q1Var.f197513b.g()).e.get();
                vc.s.k(aVar24);
                return aVar24;
            case 143:
                pxc.g gVar = (pxc.g) ((qxc.a) q1Var.f197513b.g()).f.get();
                vc.s.k(gVar);
                return gVar;
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                pxc.j jVar = (pxc.j) ((qxc.a) q1Var.f197513b.g()).f250065g.get();
                vc.s.k(jVar);
                return jVar;
            case 145:
                pxc.l lVar2 = (pxc.l) ((qxc.a) q1Var.f197513b.g()).f250066h.get();
                vc.s.k(lVar2);
                return lVar2;
            case 146:
                pxc.n nVar = (pxc.n) ((qxc.a) q1Var.f197513b.g()).f250067j.get();
                vc.s.k(nVar);
                return nVar;
            case 147:
                of3.h hVarB = q1Var.f197513b.b();
                return new sf3.i((sri.m) hVarB.f224722c.get(), ((h30.n) hVarB.f224721b).k());
            case 148:
                return new sf3.a((sri.m) q1Var.f197513b.b().f224722c.get());
            case 149:
                z3h.g gVar2 = (z3h.g) ((m2h.b) q1Var.Ro.get());
                ybl.b bVarB = gVar2.f319280b.b();
                vc.s.j(bVarB);
                ybl.i iVarB = gVar2.f319283h.b();
                vc.s.j(iVarB);
                sri.m mVar = (sri.m) gVar2.u.get();
                i0h.c cVar = (i0h.c) gVar2.f319284j.E0.get();
                vc.s.j(cVar);
                return new t4h.e(bVarB, iVarB, mVar, cVar, gVar2.f319290r.a());
            case 150:
                Context context = ((ad3.f) q1Var.f197840oe.get()).f;
                zc3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new zc3.c(sri.o.c(context, null, null, 14));
            case ISO7816.TAG_SM_EXPECTED_LENGTH /* 151 */:
                pvi.a aVar25 = (pvi.a) ((cwi.x) q1Var.js.get()).f109804o0.get();
                vc.s.k(aVar25);
                return aVar25;
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                pvi.a aVar26 = (pvi.a) ((cwi.x) q1Var.js.get()).f109804o0.get();
                vc.s.k(aVar26);
                return aVar26;
            case 153:
                pvi.a aVar27 = (pvi.a) ((cwi.x) q1Var.js.get()).f109804o0.get();
                vc.s.k(aVar27);
                return aVar27;
            case Constants.EMVTag.TAG_9A_TRANSACTION_DATE /* 154 */:
                pvi.a aVar28 = (pvi.a) ((cwi.x) q1Var.js.get()).f109804o0.get();
                vc.s.k(aVar28);
                return aVar28;
            case 155:
                p5b.a aVar29 = (p5b.a) ((b6b.h) q1Var.Rh.get()).f12606p.get();
                vc.s.k(aVar29);
                return aVar29;
            case Constants.EMVTag.TAG_9C_TRANSACTION_TYPE /* 156 */:
                oxk.d dVar2 = (oxk.d) ((kyk.v) ((kyk.y) q1Var.Pe.get())).T.get();
                vc.s.k(dVar2);
                return dVar2;
            case 157:
                oxk.r rVar = (oxk.r) ((kyk.v) ((kyk.y) q1Var.Pe.get())).U.get();
                vc.s.k(rVar);
                return rVar;
            case ISO781611.SMT_DO_DS /* 158 */:
                oxk.l lVar3 = (oxk.l) ((kyk.v) ((kyk.y) q1Var.Pe.get())).V.get();
                vc.s.k(lVar3);
                return lVar3;
            case 159:
                oxk.p pVar = (oxk.p) ((kyk.v) ((kyk.y) q1Var.Pe.get())).W.get();
                vc.s.k(pVar);
                return pVar;
            case 160:
                oxk.t tVar = (oxk.t) ((kyk.v) ((kyk.y) q1Var.Pe.get())).X.get();
                vc.s.k(tVar);
                return tVar;
            case 161:
                oxk.j jVar2 = (oxk.j) ((kyk.v) ((kyk.y) q1Var.Pe.get())).Y.get();
                vc.s.k(jVar2);
                return jVar2;
            case 162:
                oxk.h hVar = (oxk.h) ((kyk.v) ((kyk.y) q1Var.Pe.get())).Z.get();
                vc.s.k(hVar);
                return hVar;
            case Constants.TAG_ACE_LAYER_VERSION /* 163 */:
                oxk.x xVar = (oxk.x) ((kyk.v) ((kyk.y) q1Var.Pe.get())).f190981a0.get();
                vc.s.k(xVar);
                return xVar;
            case Constants.TAG_GPI_VERSION /* 164 */:
                oxk.v vVar = (oxk.v) ((kyk.v) ((kyk.y) q1Var.Pe.get())).f190983b0.get();
                vc.s.k(vVar);
                return vVar;
            case Constants.TAG_EMVL3_VERSION /* 165 */:
                oxk.n nVar2 = (oxk.n) ((kyk.v) ((kyk.y) q1Var.Pe.get())).c0.get();
                vc.s.k(nVar2);
                return nVar2;
            case Constants.TAG_PAYMENT_APP_CLESS_VERSION /* 166 */:
                oxk.b bVar = (oxk.b) ((kyk.v) ((kyk.y) q1Var.Pe.get())).f190985d0.get();
                vc.s.k(bVar);
                return bVar;
            case 167:
                oxk.f fVar = (oxk.f) ((kyk.v) ((kyk.y) q1Var.Pe.get())).f190986e0.get();
                vc.s.k(fVar);
                return fVar;
            case 168:
                b60.a aVar30 = (b60.a) ((dzj.a) q1Var.f197513b.f198110a.f197487a.f198537l.get()).f121352n.get();
                vc.s.k(aVar30);
                yyj.a aVar31 = (yyj.a) aVar30.b();
                vc.s.k(aVar31);
                azj.b bVar2 = (azj.b) ((ezj.b) aVar31).f130954g.get();
                vc.s.k(bVar2);
                return bVar2;
            case 169:
                cgk.a aVar32 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar32);
                return aVar32;
            case 170:
                cgk.a aVar33 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar33);
                return aVar33;
            case 171:
                cgk.a aVar34 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar34);
                return aVar34;
            case 172:
                cgk.a aVar35 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar35);
                return aVar35;
            case 173:
                cgk.a aVar36 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar36);
                return aVar36;
            case 174:
                cgk.a aVar37 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar37);
                return aVar37;
            case 175:
                cgk.a aVar38 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar38);
                return aVar38;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                cgk.a aVar39 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar39);
                return aVar39;
            case 177:
                cgk.a aVar40 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar40);
                return aVar40;
            case 178:
                cgk.a aVar41 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar41);
                return aVar41;
            case 179:
                cgk.a aVar42 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar42);
                return aVar42;
            case 180:
                cgk.a aVar43 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar43);
                return aVar43;
            case 181:
                cgk.a aVar44 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar44);
                return aVar44;
            case 182:
                cgk.a aVar45 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar45);
                return aVar45;
            case 183:
                cgk.a aVar46 = (cgk.a) ((i3) q1Var.Y1.get()).Y.get();
                vc.s.k(aVar46);
                return aVar46;
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
                sla.e eVar = (sla.e) ((fma.h) q1Var.Lk.get()).f136145x.get();
                vc.s.k(eVar);
                return eVar;
            case 185:
                sla.g gVar3 = (sla.g) ((fma.h) q1Var.Lk.get()).f136146y.get();
                vc.s.k(gVar3);
                return gVar3;
            case 186:
                sla.d dVar3 = (sla.d) ((fma.h) q1Var.Lk.get()).f136146y.get();
                vc.s.k(dVar3);
                return dVar3;
            case 187:
                fma.h hVar2 = (fma.h) q1Var.Lk.get();
                sri.m mVar2 = (sri.m) hVar2.f136144w.get();
                gte.a aVarB5 = hVar2.f136132c.b();
                vc.s.j(aVarB5);
                return new jma.j(aVarB5, mVar2);
            case 188:
                return new jma.b((sri.m) ((fma.h) q1Var.Lk.get()).f136144w.get());
            case 189:
                return new cid.a((sri.m) ((fma.h) q1Var.Lk.get()).f136144w.get(), 2);
            case 190:
                sla.b bVar3 = (sla.b) ((fma.h) q1Var.Lk.get()).G.get();
                vc.s.k(bVar3);
                return bVar3;
            case 191:
                b60.a aVar47 = (b60.a) ((fma.n) q1Var.f197513b.f198110a.f197487a.f198562m.get()).f136208b.get();
                vc.s.k(aVar47);
                fma.m mVar3 = (fma.m) aVar47.b();
                vc.s.k(mVar3);
                return new dbi.c(mVar3.f136206a.a());
            case 192:
                sa.c cVar2 = (sa.c) ((va.a) q1Var.Dk.get()).f287094t.get();
                vc.s.k(cVar2);
                return cVar2;
            case Constants.TAG_ATMEL_SERIAL /* 193 */:
                rtc.f fVar2 = (rtc.f) ((vtc.t) q1Var.Pr.get()).f292059a0.get();
                vc.s.k(fVar2);
                return fVar2;
            case 194:
                return new cid.a((sri.m) ((re9.a) ((re9.c) q1Var.f197726jn.get())).k.get(), 5);
            case 195:
                b60.a aVar48 = (b60.a) ((gtc.a) q1Var.f197513b.f198110a.f197487a.z.get()).f.get();
                vc.s.k(aVar48);
                htc.b bVar4 = (htc.b) aVar48.b();
                vc.s.k(bVar4);
                ftc.b bVar5 = (ftc.b) bVar4.i.get();
                vc.s.k(bVar5);
                return bVar5;
            case 196:
                t67.b bVar6 = (t67.b) ((y67.a) q1Var.Yl.get()).e.get();
                vc.s.k(bVar6);
                return bVar6;
            case Constants.TAG_BATTERY_STATE /* 197 */:
                v0i.b bVar7 = (v0i.b) q1Var.C9.get();
                sri.m mVar4 = (sri.m) bVar7.f284871w.get();
                ai5.b bVarB2 = bVar7.f284865n.b();
                vc.s.j(bVarB2);
                gte.a aVarB6 = bVar7.f.b();
                vc.s.j(aVarB6);
                return new y0i.e(mVar4, bVarB2, aVarB6);
            case Constants.TAG_POWER_OFF_TIMEOUT /* 198 */:
                ln2.b bVar8 = (ln2.b) ((vn2.e) q1Var.Nd.get()).f.get();
                vc.s.k(bVar8);
                return bVar8;
            case 199:
                rq9.b bVar9 = (rq9.b) ((kr9.l) q1Var.Ht.get()).H.get();
                vc.s.k(bVar9);
                return bVar9;
            default:
                throw new AssertionError(i);
        }
    }

    public jf0.d c() {
        lp.q1 q1Var = (lp.q1) this.f196142c;
        int i = this.f196141b;
        switch (i) {
            case 200:
                ir9.e eVar = (ir9.e) ((kr9.l) q1Var.Ht.get()).I.get();
                vc.s.k(eVar);
                return eVar;
            case 201:
                ir9.g gVar = (ir9.g) ((kr9.l) q1Var.Ht.get()).J.get();
                vc.s.k(gVar);
                return gVar;
            case 202:
                zdk.b bVar = (zdk.b) ((kek.c) q1Var.f198052xk.get()).f183122q.get();
                vc.s.k(bVar);
                return bVar;
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1 /* 203 */:
                b3a.b bVar2 = (b3a.b) ((s3a.k) ((s3a.r) q1Var.f197602em.get())).q0.get();
                vc.s.k(bVar2);
                return bVar2;
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2 /* 204 */:
                return ((s3a.k) ((s3a.r) q1Var.f197602em.get())).g();
            case Constants.TAG_KSN_FORMATS /* 205 */:
                return ((s3a.k) ((s3a.r) q1Var.f197602em.get())).g();
            case 206:
                iyj.b bVar3 = (iyj.b) ((nyj.c) ((nyj.h) q1Var.Hb.get())).L.get();
                vc.s.k(bVar3);
                return bVar3;
            case Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION /* 207 */:
                iyj.a aVar = (iyj.a) ((nyj.c) ((nyj.h) q1Var.Hb.get())).M.get();
                vc.s.k(aVar);
                return aVar;
            case 208:
                gva.b bVar4 = (gva.b) ((mva.b) q1Var.Bi.get()).k.get();
                vc.s.k(bVar4);
                return bVar4;
            case Constants.TAG_FIRMWARE_VERSION /* 209 */:
                gva.b bVar5 = (gva.b) ((mva.b) q1Var.Bi.get()).k.get();
                vc.s.k(bVar5);
                return bVar5;
            case Constants.TAG_SVPP_CHECKSUM /* 210 */:
                yl4.c cVar = (yl4.c) ((a3) q1Var.ue.get()).Z.get();
                vc.s.k(cVar);
                return cVar;
            case 211:
                k95.a aVar2 = (k95.a) q1Var.Ld.get();
                Context context = aVar2.f182271g;
                m95.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new edk.e(sri.o.c(context, null, null, 14), (h95.a) aVar2.f182280s.get());
            case Constants.TAG_PCI_PED_CHECKSUM /* 212 */:
                return ((oa5.b) q1Var.Xc.get()).a();
            case Constants.TAG_EMV_L1_VERSION /* 213 */:
                return ((oa5.b) q1Var.Xc.get()).a();
            case Constants.TAG_EMV_L1_CHECKSUM /* 214 */:
                sri.m mVarD = ((g8b.a) ((ap3.h) q1Var.f197513b.c()).f8087a).d();
                vc.s.j(mVarD);
                return new zo3.a(mVarD);
            case Constants.TAG_EMV_L2_VERSION /* 215 */:
                ke6.t tVar = (ke6.t) ((xf6.r1) q1Var.W5.get()).B.get();
                vc.s.k(tVar);
                return tVar;
            case Constants.TAG_EMV_L2_CHECKSUM /* 216 */:
                ke6.f fVar = (ke6.f) ((xf6.r1) q1Var.W5.get()).C.get();
                vc.s.k(fVar);
                return fVar;
            case Constants.TAG_BOOT_LOADER_VERSION /* 217 */:
                gpg.b bVar6 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar6);
                return bVar6;
            case Constants.TAG_BOOT_LOADER_CHECKSUM /* 218 */:
                gpg.b bVar7 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar7);
                return bVar7;
            case Constants.TAG_KSL_ID /* 219 */:
                gpg.b bVar8 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar8);
                return bVar8;
            case 220:
                gpg.b bVar9 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar9);
                return bVar9;
            case 221:
                gpg.b bVar10 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar10);
                return bVar10;
            case 222:
                gpg.b bVar11 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar11);
                return bVar11;
            case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                gpg.b bVar12 = (gpg.b) ((wpg.l) ((fpg.c) q1Var.Gr.get())).J.get();
                vc.s.k(bVar12);
                return bVar12;
            case BERTags.FLAGS /* 224 */:
                zof.c cVar2 = (zof.c) ((lpf.i) q1Var.f197513b.o6()).f199044q.get();
                vc.s.k(cVar2);
                return cVar2;
            case Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE /* 225 */:
                zof.h hVar = (zof.h) ((lpf.i) q1Var.f197513b.o6()).f199045r.get();
                vc.s.k(hVar);
                return hVar;
            case Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION /* 226 */:
                zof.e eVar2 = (zof.e) ((lpf.i) q1Var.f197513b.o6()).f199046s.get();
                vc.s.k(eVar2);
                return eVar2;
            case Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS /* 227 */:
                kjb.b bVar13 = (kjb.b) ((anb.n) ((nib.c) q1Var.f198097ze.get())).I.get();
                vc.s.k(bVar13);
                return bVar13;
            case Constants.TAG_E4_CUSTOMER_DATA /* 228 */:
                df9.b bVar14 = (df9.b) ((lf9.a) q1Var.f197513b.t()).e.get();
                vc.s.k(bVar14);
                return bVar14;
            case Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION /* 229 */:
                df9.d dVar = (df9.d) ((lf9.a) q1Var.f197513b.t()).f.get();
                vc.s.k(dVar);
                return dVar;
            case 230:
                df9.f fVar2 = (df9.f) ((lf9.a) q1Var.f197513b.t()).f194681g.get();
                vc.s.k(fVar2);
                return fVar2;
            case Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION /* 231 */:
                b60.a aVar3 = (b60.a) ((xk9.a) q1Var.f197513b.f198110a.f197487a.Q.get()).d.get();
                vc.s.k(aVar3);
                yk9.a aVar4 = (yk9.a) aVar3.b();
                vc.s.k(aVar4);
                wk9.b bVar15 = (wk9.b) aVar4.e.get();
                vc.s.k(bVar15);
                return bVar15;
            case 232:
                kq3.c cVar3 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar3);
                return cVar3;
            case Constants.TAG_USB_CAPABILITY /* 233 */:
                kq3.c cVar4 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar4);
                return cVar4;
            case Constants.TAG_EMV_ICC_CONFIG_VERSION /* 234 */:
                kq3.c cVar5 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar5);
                return cVar5;
            case Constants.TAG_EMV_NFC_CONFIG_VERSION /* 235 */:
                kq3.c cVar6 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar6);
                return cVar6;
            case Constants.TAG_OS_VERSION /* 236 */:
                kq3.c cVar7 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar7);
                return cVar7;
            case Constants.TAG_MPOS_MODULE_STATE /* 237 */:
                kq3.c cVar8 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar8);
                return cVar8;
            case Constants.TAG_EE_SUPPORTED_RPC_ID_LIST /* 238 */:
                kq3.c cVar9 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar9);
                return cVar9;
            case 239:
                kq3.c cVar10 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar10);
                return cVar10;
            case 240:
                kq3.c cVar11 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar11);
                return cVar11;
            case Constants.TAG_TRANSACTION_DATA /* 241 */:
                kq3.c cVar12 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar12);
                return cVar12;
            case 242:
                kq3.c cVar13 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar13);
                return cVar13;
            case Constants.TAG_F3_BUILD_CONFIGURATION /* 243 */:
                kq3.c cVar14 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar14);
                return cVar14;
            case Constants.TAG_F4 /* 244 */:
                kq3.c cVar15 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar15);
                return cVar15;
            case Constants.TAG_F5 /* 245 */:
                kq3.c cVar16 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar16);
                return cVar16;
            case 246:
                kq3.c cVar17 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar17);
                return cVar17;
            case Constants.TAG_BLE_FIRMWARE_VERSION /* 247 */:
                kq3.c cVar18 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar18);
                return cVar18;
            case Constants.TAG_FULL_SVPP_IDENTIFICATION /* 248 */:
                kq3.c cVar19 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar19);
                return cVar19;
            case Constants.TAG_RESOURCE_FILE_VERSION /* 249 */:
                kq3.c cVar20 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar20);
                return cVar20;
            case Constants.TAG_SUPPORTED_LOCALE_LIST /* 250 */:
                kq3.c cVar21 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar21);
                return cVar21;
            case Constants.TAG_FB_CHARGING_STATUS /* 251 */:
                kq3.c cVar22 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar22);
                return cVar22;
            case Constants.TAG_FC_SPEED_MODE /* 252 */:
                kq3.c cVar23 = (kq3.c) q1Var.f197513b.d().k.get();
                vc.s.k(cVar23);
                return cVar23;
            case Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION /* 253 */:
                kq3.a aVar5 = (kq3.a) q1Var.f197513b.d().f218362l.get();
                vc.s.k(aVar5);
                return aVar5;
            case 254:
                kq3.d dVar2 = (kq3.d) q1Var.f197513b.d().f218363m.get();
                vc.s.k(dVar2);
                return dVar2;
            case 255:
                bw5.b bVar16 = (bw5.b) ((mw5.l) q1Var.f197495aa.get()).z.get();
                vc.s.k(bVar16);
                return bVar16;
            case 256:
                bw5.b bVar17 = (bw5.b) ((mw5.l) q1Var.f197495aa.get()).z.get();
                vc.s.k(bVar17);
                return bVar17;
            case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                bw5.b bVar18 = (bw5.b) ((mw5.l) q1Var.f197495aa.get()).z.get();
                vc.s.k(bVar18);
                return bVar18;
            case 258:
                er6.a aVar6 = (er6.a) ((us6.e2) q1Var.f198007vg.get()).f282514n.get();
                vc.s.k(aVar6);
                return aVar6;
            case 259:
                b60.a aVar7 = (b60.a) ((pqk.a) q1Var.f197513b.f198110a.f197728jp.get()).f238805p.get();
                vc.s.k(aVar7);
                qqk.a aVar8 = (qqk.a) aVar7.b();
                vc.s.k(aVar8);
                pqk.c cVar24 = (pqk.c) aVar8.d.get();
                vc.s.k(cVar24);
                return cVar24;
            case 260:
                ywj.b bVar19 = (ywj.b) q1Var.f197513b.k6();
                bjl.f fVar3 = (bjl.f) ((q0) bVar19.f317453b).f196066k0.get();
                vc.s.j(fVar3);
                return new zwj.e(fVar3, bVar19.e);
            case 261:
                wx8.a aVarA = ((ywj.b) q1Var.f197513b.k6()).f.a();
                vc.s.j(aVarA);
                return new dbi.c(aVarA);
            case 262:
                return new cid.a((sri.m) ((did.d) q1Var.Dh.get()).z.get(), 0);
            case 263:
                whc.s sVar = (whc.s) q1Var.f197984uf.get();
                sri.m mVarD2 = ((g8b.a) sVar.f297570g).d();
                vc.s.j(mVarD2);
                h4g.g gVarB = sVar.k.b();
                did.s sVar2 = sVar.f297573l;
                ika.b bVar20 = (ika.b) sVar2.f115054a;
                zja.a aVarA2 = bVar20.a();
                vc.s.j(aVarA2);
                return new vhc.g(mVarD2, gVarB, new nid.d(aVarA2, bVar20.b(), sVar2.f115055b.b()));
            case 264:
                b60.a aVar9 = (b60.a) ((ork.a) q1Var.f197513b.f198110a.f197972ts.get()).U.get();
                vc.s.k(aVar9);
                prk.n0 n0Var = (prk.n0) aVar9.b();
                vc.s.k(n0Var);
                prk.g0 g0Var = (prk.g0) n0Var;
                sri.m mVar = (sri.m) g0Var.O.get();
                b4f.b bVarA = g0Var.f239140b.a();
                gte.a aVarB = g0Var.f239141c.b();
                vc.s.j(aVarB);
                return new bsk.c(mVar, bVarA, aVarB);
            case 265:
                b60.a aVar10 = (b60.a) ((dd9.i) q1Var.f197513b.f198110a.f197487a.f198610o0.get()).f113157l.get();
                vc.s.k(aVar10);
                a99.e eVar3 = (a99.e) aVar10.b();
                vc.s.k(eVar3);
                a99.f fVar4 = (a99.f) ((dd9.e) eVar3).f113138n.get();
                vc.s.k(fVar4);
                return fVar4;
            case 266:
                y89.b bVar21 = (y89.b) ((qc9.c) q1Var.f197946sp.get()).f244627s.get();
                vc.s.k(bVar21);
                return bVar21;
            case 267:
                tq6.a aVar11 = (tq6.a) ((wq6.a) q1Var.Mg.get()).i.get();
                vc.s.k(aVar11);
                return aVar11;
            case 268:
                tq6.a aVar12 = (tq6.a) ((wq6.a) q1Var.Mg.get()).i.get();
                vc.s.k(aVar12);
                return aVar12;
            case 269:
                rzi.d dVar3 = (rzi.d) ((erj.h) q1Var.f197596ef.get()).D.get();
                vc.s.k(dVar3);
                return dVar3;
            case 270:
                zo.c cVar25 = (zo.c) q1Var.gk.get();
                Context context2 = cVar25.f323839a;
                zo.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new edk.e(sri.o.c(context2, null, null, 14), cVar25.a());
            case 271:
                k38.b bVar22 = (k38.b) q1Var.f197513b.o().A.get();
                vc.s.k(bVar22);
                return bVar22;
            case 272:
                k38.b bVar23 = (k38.b) q1Var.f197513b.o().A.get();
                vc.s.k(bVar23);
                return bVar23;
            case 273:
                k38.b bVar24 = (k38.b) q1Var.f197513b.o().A.get();
                vc.s.k(bVar24);
                return bVar24;
            case 274:
                k1d.b bVar25 = (k1d.b) ((k2d.d) q1Var.Qs.get()).f180473j.get();
                vc.s.k(bVar25);
                return bVar25;
            case 275:
                t1d.b bVar26 = (t1d.b) ((k3d.a) q1Var.f197865pc.get()).f180692m.get();
                vc.s.k(bVar26);
                return bVar26;
            case 276:
                b60.a aVar13 = (b60.a) ((a3d.d) q1Var.f197513b.f198110a.f197487a.y0.get()).d.get();
                vc.s.k(aVar13);
                r1d.a aVar14 = (r1d.a) aVar13.b();
                vc.s.k(aVar14);
                q1d.b bVar27 = (q1d.b) ((c3d.b) aVar14).e.get();
                vc.s.k(bVar27);
                return bVar27;
            case 277:
                b60.a aVar15 = (b60.a) ((nu2.a) q1Var.f197513b.f198110a.f197487a.K0.get()).d.get();
                vc.s.k(aVar15);
                ou2.a aVar16 = (ou2.a) aVar15.b();
                vc.s.k(aVar16);
                mu2.a aVar17 = (mu2.a) ((ou2.d) aVar16).f.get();
                vc.s.k(aVar17);
                return aVar17;
            case 278:
                o7c.f fVar5 = (o7c.f) ((p7c.r) q1Var.Q6.get()).i0.get();
                vc.s.k(fVar5);
                return fVar5;
            case 279:
                o7c.e eVar4 = (o7c.e) ((p7c.r) q1Var.Q6.get()).j0.get();
                vc.s.k(eVar4);
                return eVar4;
            case 280:
                z5c.a aVar18 = (z5c.a) ((p7c.r) q1Var.Q6.get()).f233679k0.get();
                vc.s.k(aVar18);
                return aVar18;
            case 281:
                z5c.c cVar26 = (z5c.c) ((p7c.r) q1Var.Q6.get()).m0.get();
                vc.s.k(cVar26);
                return cVar26;
            case 282:
                z5c.d dVar4 = (z5c.d) ((p7c.r) q1Var.Q6.get()).f233683n0.get();
                vc.s.k(dVar4);
                return dVar4;
            case 283:
                z5c.b bVar28 = (z5c.b) ((p7c.r) q1Var.Q6.get()).f233684o0.get();
                vc.s.k(bVar28);
                return bVar28;
            case 284:
                o7c.g gVar2 = (o7c.g) ((p7c.u0) q1Var.Eg.get()).f233730g.get();
                vc.s.k(gVar2);
                return gVar2;
            case 285:
                acc.a aVar19 = (acc.a) ((jcc.e) q1Var.f197665h8.get()).f172779r.get();
                vc.s.k(aVar19);
                return aVar19;
            case 286:
                acc.b bVar29 = (acc.b) ((jcc.e) q1Var.f197665h8.get()).f172780s.get();
                vc.s.k(bVar29);
                return bVar29;
            case 287:
                return ((eyd.b) ((vxd.b) q1Var.fi.get())).b();
            case 288:
                return ((eyd.b) ((vxd.b) q1Var.fi.get())).b();
            case 289:
                tyd.h hVar2 = (tyd.h) ((eyd.b) ((vxd.b) q1Var.fi.get())).F.get();
                vc.s.k(hVar2);
                return hVar2;
            case 290:
                rte.f fVar6 = (rte.f) ((ove.t) q1Var.Ic.get()).I.get();
                vc.s.k(fVar6);
                return fVar6;
            case 291:
                mb3.i iVar = (mb3.i) q1Var.m6.get();
                return new pb3.b(iVar.a(), m4d.e.i(iVar.e), 0);
            case 292:
                mb3.i iVar2 = (mb3.i) q1Var.m6.get();
                return new pb3.b(iVar2.a(), m4d.e.i(iVar2.e), 1);
            case 293:
                lr2.c cVar27 = (lr2.c) ((tr2.m) q1Var.Ec.get()).I.get();
                vc.s.k(cVar27);
                return cVar27;
            case 294:
                lr2.c cVar28 = (lr2.c) ((tr2.m) q1Var.Ec.get()).I.get();
                vc.s.k(cVar28);
                return cVar28;
            case 295:
                c43.h hVar3 = (c43.h) q1Var.f197487a.E0.get();
                sri.m mVar2 = (sri.m) hVar3.f21030y.get();
                l93.f fVarJ = hVar3.d.j();
                vc.s.j(fVarJ);
                return new x43.b(mVar2, fVarJ);
            case 296:
                i0h.a aVar20 = (i0h.a) ((h9h.a) q1Var.Es.get()).D0.get();
                vc.s.k(aVar20);
                return aVar20;
            case 297:
                h9h.a aVar21 = (h9h.a) q1Var.Es.get();
                sri.m mVar3 = (sri.m) aVar21.C0.get();
                xoj.a aVarA3 = aVar21.f150263g.a();
                vc.s.j(aVarA3);
                gte.a aVarB2 = aVar21.f150284x.b();
                vc.s.j(aVarB2);
                return new s8h.t(mVar3, aVarA3, aVarB2);
            case 298:
                h9h.a aVar22 = (h9h.a) q1Var.Es.get();
                sri.m mVar4 = (sri.m) aVar22.C0.get();
                ybl.i iVarB = aVar22.f150256a.b();
                vc.s.j(iVarB);
                xoj.a aVarA4 = aVar22.f150263g.a();
                vc.s.j(aVarA4);
                gte.a aVarB3 = aVar22.f150284x.b();
                vc.s.j(aVarB3);
                return new s8h.x(mVar4, iVarB, aVarA4, aVarB3, aVar22.B.e());
            case 299:
                h9h.a aVar23 = (h9h.a) q1Var.Es.get();
                sri.m mVar5 = (sri.m) aVar23.C0.get();
                xoj.a aVarA5 = aVar23.f150263g.a();
                vc.s.j(aVarA5);
                gte.a aVarB4 = aVar23.f150284x.b();
                vc.s.j(aVarB4);
                return new s8h.j0(mVar5, aVarA5, aVarB4, aVar23.I());
            default:
                throw new AssertionError(i);
        }
    }

    public jf0.d d() {
        lp.q1 q1Var = (lp.q1) this.f196142c;
        int i = this.f196141b;
        switch (i) {
            case 300:
                h9h.a aVar = (h9h.a) q1Var.Es.get();
                ugl.c cVarD = aVar.B.d();
                vc.s.j(cVarD);
                return new s8h.b0(cVarD, (sri.m) aVar.C0.get());
            case 301:
                i0h.c cVar = (i0h.c) ((h9h.a) q1Var.Es.get()).E0.get();
                vc.s.k(cVar);
                return cVar;
            case 302:
                h9h.a aVar2 = (h9h.a) q1Var.Es.get();
                sri.m mVar = (sri.m) aVar2.C0.get();
                ybl.k kVarD = aVar2.f150256a.d();
                vc.s.j(kVarD);
                return new s8h.r0(mVar, kVarD);
            case 303:
                ynh.b bVar = (ynh.b) ((joh.w) ((vnh.b) q1Var.f197844oj.get())).f177073l.get();
                vc.s.k(bVar);
                return bVar;
            case 304:
                b60.a aVar3 = (b60.a) ((d9g.c) q1Var.f197513b.f198110a.f197487a.X0.get()).f.get();
                vc.s.k(aVar3);
                g9g.m1 m1Var = (g9g.m1) aVar3.b();
                vc.s.k(m1Var);
                f9g.c cVar2 = (f9g.c) m1Var.f141745g.get();
                vc.s.k(cVar2);
                return cVar2;
            case 305:
                rhf.b bVar2 = (rhf.b) q1Var.f197513b.u().i.get();
                vc.s.k(bVar2);
                return bVar2;
            case 306:
                rhf.b bVar3 = (rhf.b) q1Var.f197513b.u().i.get();
                vc.s.k(bVar3);
                return bVar3;
            case 307:
                dmc.b bVar4 = (dmc.b) q1Var.f197786ma.get();
                sri.m mVar2 = (sri.m) bVar4.i.get();
                clc.b bVar5 = (clc.b) bVar4.f115923j.get();
                fmc.q qVar = new fmc.q(bVar4.c());
                omc.a aVar4 = new omc.a();
                pmc.a aVar5 = new pmc.a();
                zjh.f fVarA = bVar4.f.a();
                xkc.a aVar6 = (xkc.a) bVar4.k.get();
                fmc.l lVar = new fmc.l(bVar4.c(), (clc.b) bVar4.f115923j.get());
                fmc.v vVarC = bVar4.c();
                xvh.c cVarA = ((a6d.e) bVar4.f115922h).a();
                vc.s.j(cVarA);
                com.revolut.feature.robo.impl.navigation.d dVar = new com.revolut.feature.robo.impl.navigation.d();
                ybl.k kVarD2 = bVar4.f115919b.d();
                vc.s.j(kVarD2);
                fmc.c0 c0Var = new fmc.c0(vVarC, cVarA, dVar, new fmc.x(new fmc.z(new qmc.b(kVarD2)), ((ika.b) bVar4.f115921g).b()));
                fmc.o oVar = new fmc.o(bVar4.c(), new znc.k(bVar4.f115920c.G()), (clc.b) bVar4.f115923j.get());
                fmc.j jVar = new fmc.j(bVar4.c(), (clc.b) bVar4.f115923j.get());
                fmc.v vVarC2 = bVar4.c();
                gte.a aVarB = bVar4.d.b();
                vc.s.j(aVarB);
                return new cmc.h(mVar2, bVar5, qVar, aVar4, aVar5, fVarA, aVar6, lVar, c0Var, oVar, jVar, new fmc.b(vVarC2, aVarB));
            case 308:
                b60.a aVar7 = (b60.a) ((a4f.c) q1Var.f197513b.f198110a.f197487a.f198468i1.get()).f1255b.get();
                vc.s.k(aVar7);
                c4f.i iVar = (c4f.i) aVar7.b();
                vc.s.k(iVar);
                c3f.a aVar8 = (c3f.a) iVar.f21219c.get();
                vc.s.k(aVar8);
                return aVar8;
            case 309:
                a1e.b bVar6 = (a1e.b) ((u0e.a) q1Var.Qo.get());
                x8h.n0 n0VarQ = bVar6.f589a.q();
                d1e.a aVar9 = new d1e.a();
                sri.m mVarD = ((g8b.a) bVar6.f590b).d();
                vc.s.j(mVarD);
                return new z0e.b(n0VarQ, aVar9, mVarD);
            case 310:
                b60.a aVar10 = (b60.a) ((wsb.a) q1Var.f197513b.f198110a.f197992up.get()).o.get();
                vc.s.k(aVar10);
                ysb.e eVar = (ysb.e) aVar10.b();
                vc.s.k(eVar);
                xsb.c cVar3 = (xsb.c) ((ysb.d) eVar).f316446c.get();
                vc.s.k(cVar3);
                return cVar3;
            case 311:
                b60.a aVar11 = (b60.a) ((wsb.a) q1Var.f197513b.f198110a.f197992up.get()).o.get();
                vc.s.k(aVar11);
                ysb.e eVar2 = (ysb.e) aVar11.b();
                vc.s.k(eVar2);
                ysb.d dVar2 = (ysb.d) eVar2;
                Context context = dVar2.f316444a;
                zsb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new xsb.b(sri.o.c(context, null, null, 14), dVar2.f316445b.a());
            case 312:
                b60.a aVar12 = (b60.a) ((rkc.a) q1Var.f197513b.f198110a.f197487a.m1.get()).d.get();
                vc.s.k(aVar12);
                skc.b bVar7 = (skc.b) aVar12.b();
                vc.s.k(bVar7);
                nkc.b bVar8 = (nkc.b) bVar7.f.get();
                vc.s.k(bVar8);
                return bVar8;
            case 313:
                b60.a aVar13 = (b60.a) ((psb.a) q1Var.f197513b.f198110a.d6.get()).f239467c.get();
                vc.s.k(aVar13);
                rsb.d dVar3 = (rsb.d) aVar13.b();
                vc.s.k(dVar3);
                jf0.d dVar4 = (jf0.d) ((rsb.c) dVar3).f257046b.get();
                vc.s.k(dVar4);
                return dVar4;
            case 314:
                b60.a aVar14 = (b60.a) ((psb.a) q1Var.f197513b.f198110a.d6.get()).f239467c.get();
                vc.s.k(aVar14);
                rsb.d dVar5 = (rsb.d) aVar14.b();
                vc.s.k(dVar5);
                jf0.d dVar6 = (jf0.d) ((rsb.c) dVar5).f257046b.get();
                vc.s.k(dVar6);
                return dVar6;
            case 315:
                gt8.b bVar9 = (gt8.b) ((zu8.c0) q1Var.Ys.get()).z.get();
                vc.s.k(bVar9);
                return bVar9;
            case 316:
                gt8.b bVar10 = (gt8.b) ((zu8.c0) q1Var.Ys.get()).z.get();
                vc.s.k(bVar10);
                return bVar10;
            case 317:
                v8f.a aVar15 = (v8f.a) ((l9f.k) q1Var.f197487a.Y2.get()).R.get();
                vc.s.k(aVar15);
                return aVar15;
            case 318:
                v8f.c cVar4 = (v8f.c) ((l9f.k) q1Var.f197487a.Y2.get()).S.get();
                vc.s.k(cVar4);
                return cVar4;
            case 319:
                ke6.a0 a0Var = (ke6.a0) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).J.get();
                vc.s.k(a0Var);
                return a0Var;
            case 320:
                ke6.z zVar = (ke6.z) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).P.get();
                vc.s.k(zVar);
                return zVar;
            case 321:
                ke6.b0 b0Var = (ke6.b0) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).Q.get();
                vc.s.k(b0Var);
                return b0Var;
            case 322:
                ke6.r rVar = (ke6.r) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).R.get();
                vc.s.k(rVar);
                return rVar;
            case 323:
                ke6.q qVar2 = (ke6.q) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).T.get();
                vc.s.k(qVar2);
                return qVar2;
            case 324:
                ke6.h hVar = (ke6.h) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).U.get();
                vc.s.k(hVar);
                return hVar;
            case 325:
                ke6.j jVar2 = (ke6.j) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).V.get();
                vc.s.k(jVar2);
                return jVar2;
            case 326:
                ke6.p pVar = (ke6.p) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).W.get();
                vc.s.k(pVar);
                return pVar;
            case 327:
                ke6.l lVar2 = (ke6.l) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).Y.get();
                vc.s.k(lVar2);
                return lVar2;
            case 328:
                ke6.l lVar3 = (ke6.l) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).Y.get();
                vc.s.k(lVar3);
                return lVar3;
            case 329:
                ke6.l lVar4 = (ke6.l) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).Y.get();
                vc.s.k(lVar4);
                return lVar4;
            case 330:
                ke6.n nVar = (ke6.n) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).Z.get();
                vc.s.k(nVar);
                return nVar;
            case 331:
                ke6.c0 c0Var2 = (ke6.c0) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).f305059a0.get();
                vc.s.k(c0Var2);
                return c0Var2;
            case 332:
                ke6.b bVar11 = (ke6.b) ((xf6.t) ((je6.g) q1Var.f197679hn.get())).f305061b0.get();
                vc.s.k(bVar11);
                return bVar11;
            case 333:
                b60.a aVar16 = (b60.a) ((ol7.a) q1Var.f197513b.f198110a.f197978u8.get()).f226354s.get();
                vc.s.k(aVar16);
                fl7.a aVar17 = (fl7.a) aVar16.b();
                vc.s.k(aVar17);
                gl7.b bVar12 = (gl7.b) ((ql7.k0) aVar17).f247360p.get();
                vc.s.k(bVar12);
                return bVar12;
            case 334:
                yr7.b bVar13 = (yr7.b) ((bt7.i) q1Var.f197598eh.get()).f18436s.get();
                vc.s.k(bVar13);
                return bVar13;
            case 335:
                b60.a aVar18 = (b60.a) ((ow7.a) q1Var.f197487a.f198268a.f197932s8.get()).f230324m.get();
                vc.s.k(aVar18);
                qw7.e eVar3 = (qw7.e) aVar18.b();
                vc.s.k(eVar3);
                hw7.b bVar14 = (hw7.b) eVar3.f249815s.get();
                vc.s.k(bVar14);
                return bVar14;
            case 336:
                b60.a aVar19 = (b60.a) ((ju7.a) q1Var.f197513b.f198110a.f197685ht.get()).f178637p.get();
                vc.s.k(aVar19);
                lu7.s sVar = (lu7.s) aVar19.b();
                vc.s.k(sVar);
                cu7.b bVar15 = (cu7.b) sVar.v.get();
                vc.s.k(bVar15);
                return bVar15;
            case 337:
                xw1.b bVar16 = (xw1.b) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).f200874a0.get();
                vc.s.k(bVar16);
                return bVar16;
            case 338:
                xw1.j jVar3 = (xw1.j) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).f200876b0.get();
                vc.s.k(jVar3);
                return jVar3;
            case 339:
                xw1.d dVar7 = (xw1.d) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).c0.get();
                vc.s.k(dVar7);
                return dVar7;
            case 340:
                xw1.f fVar = (xw1.f) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).f200878d0.get();
                vc.s.k(fVar);
                return fVar;
            case 341:
                xw1.l lVar5 = (xw1.l) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).f0.get();
                vc.s.k(lVar5);
                return lVar5;
            case 342:
                xw1.h hVar2 = (xw1.h) ((lz1.m) ((uw1.b) q1Var.f197945so.get())).g0.get();
                vc.s.k(hVar2);
                return hVar2;
            case 343:
                xw1.n nVar2 = (xw1.n) ((nz1.a) q1Var.Rm.get()).k.get();
                vc.s.k(nVar2);
                return nVar2;
            case 344:
                zc2.b bVar17 = (zc2.b) ((fd2.f) q1Var.Xq.get()).f133867m.get();
                vc.s.k(bVar17);
                return bVar17;
            case 345:
                p52.b bVar18 = (p52.b) ((z52.g) q1Var.Kl.get()).i.get();
                vc.s.k(bVar18);
                return bVar18;
            case 346:
                u62.b bVar19 = (u62.b) ((i72.k) q1Var.Ml.get()).f159112g.get();
                vc.s.k(bVar19);
                return bVar19;
            case 347:
                bc2.b bVar20 = (bc2.b) ((hc2.i) q1Var.Ol.get()).f150789g.get();
                vc.s.k(bVar20);
                return bVar20;
            case 348:
                ch2.b bVar21 = (ch2.b) ((nh2.l) q1Var.Sl.get()).f215306j.get();
                vc.s.k(bVar21);
                return bVar21;
            case 349:
                xe2.b bVar22 = (xe2.b) ((if2.f) q1Var.Bl.get()).J.get();
                vc.s.k(bVar22);
                return bVar22;
            case 350:
                nuf.b bVar23 = (nuf.b) ((hvf.b) ((muf.b) q1Var.Ee.get())).f155874w.get();
                vc.s.k(bVar23);
                return bVar23;
            case 351:
                return ((u45.h) q1Var.f197619fd.get()).p();
            case 352:
                return ((u45.h) q1Var.f197619fd.get()).p();
            case 353:
                dw2.a aVar20 = (dw2.a) ((fw2.d) q1Var.f197487a.C0.get()).f138533r.get();
                vc.s.k(aVar20);
                return aVar20;
            case 354:
                dw2.a aVar21 = (dw2.a) ((fw2.d) q1Var.f197487a.C0.get()).f138533r.get();
                vc.s.k(aVar21);
                return aVar21;
            case 355:
                b60.a aVar22 = (b60.a) ((clg.a) q1Var.f197513b.f198110a.f197487a.f198877z1.get()).f24994c.get();
                vc.s.k(aVar22);
                tkg.a aVar23 = (tkg.a) aVar22.b();
                vc.s.k(aVar23);
                ukg.b bVar24 = (ukg.b) ((elg.e) aVar23).e.get();
                vc.s.k(bVar24);
                return bVar24;
            case 356:
                j6e.b bVar25 = (j6e.b) ((r6e.o) q1Var.f197672hf.get()).M.get();
                vc.s.k(bVar25);
                return bVar25;
            case 357:
                vce.h hVar3 = (vce.h) ((ede.b) q1Var.f197736k4.get()).f124997r.get();
                vc.s.k(hVar3);
                return hVar3;
            case 358:
                vce.h hVar4 = (vce.h) ((ede.b) q1Var.f197736k4.get()).f124997r.get();
                vc.s.k(hVar4);
                return hVar4;
            case 359:
                vce.d dVar8 = (vce.d) ((ede.b) q1Var.f197736k4.get()).f124998s.get();
                vc.s.k(dVar8);
                return dVar8;
            case 360:
                vce.b bVar26 = (vce.b) ((ede.b) q1Var.f197736k4.get()).f124999t.get();
                vc.s.k(bVar26);
                return bVar26;
            case 361:
                vce.l lVar6 = (vce.l) ((ede.b) q1Var.f197736k4.get()).u.get();
                vc.s.k(lVar6);
                return lVar6;
            case 362:
                vce.f fVar2 = (vce.f) ((ede.b) q1Var.f197736k4.get()).v.get();
                vc.s.k(fVar2);
                return fVar2;
            case 363:
                lcf.a aVar24 = (lcf.a) ((ubf.d) q1Var.Pi.get()).R.get();
                vc.s.k(aVar24);
                return aVar24;
            case 364:
                Context context2 = ((zc6.a) ((zc6.b) q1Var.Q3.get())).f321237b;
                zc6.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new cid.a(sri.o.c(context2, null, null, 14), 1);
            case 365:
                m2b.v vVar = (m2b.v) q1Var.tj.get();
                sri.m mVarD2 = ((g8b.a) vVar.f201921a).d();
                vc.s.j(mVarD2);
                ybl.k kVarD3 = vVar.f201922b.d();
                vc.s.j(kVarD3);
                a2b.b bVarF = vVar.f201923c.f();
                vc.s.j(bVarF);
                m4f.b bVar27 = new m4f.b();
                ybl.d dVarH = vVar.e.h();
                vc.s.j(dVarH);
                return new l2b.f(mVarD2, kVarD3, bVarF, bVar27, dVarH);
            case 366:
                ec7.a aVar25 = (ec7.a) ((tc7.d) ((fc7.b) q1Var.Vh.get())).Q2.get();
                vc.s.k(aVar25);
                return aVar25;
            case 367:
                cf7.b bVar28 = (cf7.b) ((cf7.l) q1Var.f197595ee.get());
                return new mf7.g((sri.m) bVar28.f23584s.get(), bVar28.a(), new mf7.a());
            case 368:
                n63.f fVar3 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar3);
                return fVar3;
            case 369:
                n63.f fVar4 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar4);
                return fVar4;
            case 370:
                n63.f fVar5 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar5);
                return fVar5;
            case 371:
                n63.f fVar6 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar6);
                return fVar6;
            case 372:
                n63.f fVar7 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar7);
                return fVar7;
            case 373:
                n63.f fVar8 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar8);
                return fVar8;
            case 374:
                n63.f fVar9 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar9);
                return fVar9;
            case 375:
                n63.f fVar10 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar10);
                return fVar10;
            case 376:
                n63.f fVar11 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar11);
                return fVar11;
            case 377:
                n63.f fVar12 = (n63.f) ((c73.j) q1Var.Pn.get()).f21875y.get();
                vc.s.k(fVar12);
                return fVar12;
            case 378:
                rhf.c cVar5 = (rhf.c) ((djf.c) q1Var.Ur.get()).X.get();
                vc.s.k(cVar5);
                return cVar5;
            case 379:
                i91.a aVar26 = (i91.a) ((r91.g) lp.a.r(lp.a.u((p91.a) q1Var.f197487a.J1.get()))).f252484m.get();
                vc.s.k(aVar26);
                return aVar26;
            case 380:
                mre.b bVar29 = (mre.b) ((ore.b) q1Var.Q1.get()).f228125p.get();
                vc.s.k(bVar29);
                return bVar29;
            case 381:
                b60.a aVar27 = (b60.a) ((edb.c) q1Var.f197513b.f198110a.f197487a.O1.get()).d.get();
                vc.s.k(aVar27);
                cdb.a aVar28 = (cdb.a) aVar27.b();
                vc.s.k(aVar28);
                ddb.a aVar29 = (ddb.a) ((fdb.a) aVar28).e.get();
                vc.s.k(aVar29);
                return aVar29;
            case 382:
                return new dbi.c((xai.a) ((oai.i0) q1Var.f197869pg.get()).f223715y.get());
            case 383:
                zdj.a aVar30 = (zdj.a) ((afj.b) q1Var.f197961te.get()).J0.get();
                vc.s.k(aVar30);
                return aVar30;
            case 384:
                hbk.a aVar31 = (hbk.a) ((obk.a) q1Var.f197555cm.get()).E.get();
                vc.s.k(aVar31);
                return aVar31;
            case 385:
                obk.a aVar32 = (obk.a) q1Var.f197555cm.get();
                sri.m mVarD3 = ((g8b.a) aVar32.k).d();
                vc.s.j(mVarD3);
                return new nbk.b(mVarD3, (tbk.b) aVar32.v.get(), (lbk.a) aVar32.B.get());
            case 386:
                fdk.g gVarR = l4.r(l4.B((ddk.a) q1Var.f197487a.U1.get()));
                sri.m mVar3 = (sri.m) gVarR.o.get();
                gte.a aVarB2 = gVarR.f133982a.b();
                vc.s.j(aVarB2);
                return new edk.e(aVarB2, mVar3);
            case 387:
                b60.a aVarA = ((qde.b) q1Var.f197513b.f198110a.f197487a.X1.get()).a();
                vc.s.k(aVarA);
                tce.a aVar33 = (tce.a) aVarA.b();
                vc.s.k(aVar33);
                vce.j jVar4 = (vce.j) ((rde.h) aVar33).f253440m.get();
                vc.s.k(jVar4);
                return jVar4;
            case 388:
                b60.a aVar34 = (b60.a) ((in9.a) q1Var.f197513b.f198110a.f197487a.Z1.get()).f162697g.get();
                vc.s.k(aVar34);
                kn9.a aVar35 = (kn9.a) aVar34.b();
                vc.s.k(aVar35);
                dn9.a aVar36 = (dn9.a) aVar35.i.get();
                vc.s.k(aVar36);
                return aVar36;
            case 389:
                h8a.c cVar6 = (h8a.c) ((p8a.c) q1Var.f198053xl.get()).P.get();
                vc.s.k(cVar6);
                return cVar6;
            case 390:
                d87.b bVar30 = (d87.b) ((y77.c) q1Var.f198051xj.get()).v.get();
                vc.s.k(bVar30);
                return bVar30;
            case 391:
                return new mxa.a((sri.m) q1Var.f197513b.h6().f.get());
            case 392:
                vva.c cVar7 = (vva.c) q1Var.f197513b.h6().f190516g.get();
                vc.s.k(cVar7);
                return cVar7;
            case 393:
                vva.b bVar31 = (vva.b) q1Var.f197513b.h6().f190517h.get();
                vc.s.k(bVar31);
                return bVar31;
            case 394:
                vva.d dVar9 = (vva.d) q1Var.f197513b.h6().i.get();
                vc.s.k(dVar9);
                return dVar9;
            case 395:
                ntg.a aVar37 = (ntg.a) ((ztg.n) q1Var.Ri.get()).f325164y.get();
                vc.s.k(aVar37);
                return aVar37;
            case 396:
                ntg.b bVar32 = (ntg.b) ((ztg.n) q1Var.Ri.get()).z.get();
                vc.s.k(bVar32);
                return bVar32;
            case 397:
                ufh.i iVarP = n9.p(n9.z((sfh.a) q1Var.f197487a.f198268a.f198085ys.get()));
                sri.m mVar4 = (sri.m) iVarP.f279863t.get();
                zdl.f fVar13 = iVarP.f279851b;
                ybl.i iVarB = fVar13.b();
                vc.s.j(iVarB);
                Map mapA = fVar13.a();
                vc.s.j(mapA);
                c1l.e eVarA = iVarP.f279852c.a();
                nlh.b bVarA = iVarP.d.a();
                vc.s.j(bVarA);
                return new tfh.c(mVar4, iVarB, mapA, eVarA, bVarA);
            case 398:
                b60.a aVar38 = (b60.a) ((il0.b) q1Var.f197513b.f198110a.f197487a.K2.get()).f162041c.get();
                vc.s.k(aVar38);
                il0.c cVar8 = (il0.c) aVar38.b();
                vc.s.k(cVar8);
                hl0.b bVar33 = (hl0.b) ((il0.a) cVar8).f162038c.get();
                vc.s.k(bVar33);
                return bVar33;
            case 399:
                bmd.c cVar9 = (bmd.c) ((jmd.d) q1Var.f197500af.get()).I0.get();
                vc.s.k(cVar9);
                return cVar9;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object bVar;
        int i = this.f196140a;
        int i2 = 0;
        Continuation continuation = null;
        int i3 = 5;
        int i5 = this.f196141b;
        Object obj2 = this.f196142c;
        int i6 = 1;
        switch (i) {
            case 0:
                if (i5 == 0) {
                    return new cnl.c((jki.p) ((z) obj2).f196148b.get());
                }
                if (i5 == 1) {
                    return new cnl.d();
                }
                throw new AssertionError(i5);
            case 1:
                d0 d0Var = (d0) obj2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new xni.g();
                    }
                    if (i5 == 2) {
                        return new vni.f(d0Var.f195916a, (xni.f) d0Var.f195918c.get(), new vni.g());
                    }
                    throw new AssertionError(i5);
                }
                Object extension = (xni.f) d0Var.f195918c.get();
                yni.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 2:
                e0 e0Var = (e0) obj2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new xni.g();
                    }
                    if (i5 == 2) {
                        return new uni.i(e0Var.f195925a, (xni.f) e0Var.f195927c.get(), new uni.j());
                    }
                    throw new AssertionError(i5);
                }
                Object extension2 = (xni.f) e0Var.f195927c.get();
                yni.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                vc.s.k(nVar2);
                return nVar2;
            case 3:
                return a();
            case 4:
                if (i5 == 0) {
                    lpf.e eVar = (lpf.e) obj2;
                    return new qqf.n(eVar.f199019a, (jki.p) eVar.f199020b.get());
                }
                if (i5 == 1) {
                    return new qqf.a();
                }
                throw new AssertionError(i5);
            case 5:
                lpf.i iVar = (lpf.i) obj2;
                jhf.a aVar = iVar.f199035b;
                if (i5 == 0) {
                    sri.m mVar = (sri.m) iVar.f199043p.get();
                    x2k.e eVar2 = new x2k.e();
                    com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar).c();
                    vc.s.j(aVarC);
                    dVar = new qpf.d(mVar, eVar2, aVarC, ((b3j.p) iVar.f199036c).e());
                } else {
                    if (i5 == 1) {
                        Context context = iVar.f199034a;
                        lpf.a0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    }
                    if (i5 != 2) {
                        if (i5 == 3) {
                            return new qpf.f((sri.m) iVar.f199043p.get());
                        }
                        if (i5 == 4) {
                            lpf.c0.Companion.getClass();
                            return new fqf.a();
                        }
                        if (i5 != 5) {
                            throw new AssertionError(i5);
                        }
                        lpf.c0.Companion.getClass();
                        return new vqf.a();
                    }
                    com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar).c();
                    vc.s.j(aVarC2);
                    dVar = new qpf.l(aVarC2, (sri.m) iVar.f199043p.get());
                }
                return dVar;
            case 6:
                lpf.n nVar3 = (lpf.n) obj2;
                if (i5 == 0) {
                    n60.b bVar2 = (n60.b) nVar3.d.get();
                    o5k.i.n(bVar2);
                    return bVar2;
                }
                if (i5 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) nVar3.f199066c.get());
                }
                if (i5 == 2) {
                    n60.a aVar2 = (n60.a) nVar3.f.get();
                    o5k.i.k(aVar2);
                    return aVar2;
                }
                if (i5 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) nVar3.f199066c.get());
                }
                if (i5 == 4) {
                    return new cqf.h(nVar3.f199065b, (jki.p) nVar3.f199068h.get());
                }
                if (i5 == 5) {
                    return new cqf.g();
                }
                throw new AssertionError(i5);
            case 7:
                lpf.n nVar4 = (lpf.n) obj2;
                if (i5 == 0) {
                    n60.b bVar3 = (n60.b) nVar4.d.get();
                    o5k.i.n(bVar3);
                    return bVar3;
                }
                if (i5 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) nVar4.f199066c.get());
                }
                if (i5 == 2) {
                    n60.a aVar3 = (n60.a) nVar4.f.get();
                    o5k.i.k(aVar3);
                    return aVar3;
                }
                if (i5 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) nVar4.f199066c.get());
                }
                if (i5 == 4) {
                    return new cqf.h(nVar4.f199065b, (jki.p) nVar4.f199068h.get());
                }
                if (i5 == 5) {
                    return new cqf.g();
                }
                throw new AssertionError(i5);
            case 8:
                if (i5 == 0) {
                    lpf.q qVar = (lpf.q) obj2;
                    return new gqf.h(qVar.f199074a, (jki.p) qVar.f199075b.get());
                }
                if (i5 == 1) {
                    return new gqf.a();
                }
                throw new AssertionError(i5);
            case 9:
                lpf.s sVar = (lpf.s) obj2;
                if (i5 == 0) {
                    n60.b bVar4 = (n60.b) sVar.d.get();
                    o5k.i.n(bVar4);
                    return bVar4;
                }
                if (i5 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) sVar.f199082c.get());
                }
                if (i5 == 2) {
                    n60.a aVar4 = (n60.a) sVar.f.get();
                    o5k.i.k(aVar4);
                    return aVar4;
                }
                if (i5 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) sVar.f199082c.get());
                }
                if (i5 == 4) {
                    return new sqf.g(sVar.f199081b, (jki.p) sVar.f199084h.get());
                }
                if (i5 == 5) {
                    return new sqf.f();
                }
                throw new AssertionError(i5);
            case 10:
                lpf.s sVar2 = (lpf.s) obj2;
                if (i5 == 0) {
                    n60.b bVar5 = (n60.b) sVar2.d.get();
                    o5k.i.n(bVar5);
                    return bVar5;
                }
                if (i5 == 1) {
                    return o5k.i.s((com.revolut.kompot.navigable.a) sVar2.f199082c.get());
                }
                if (i5 == 2) {
                    n60.a aVar5 = (n60.a) sVar2.f.get();
                    o5k.i.k(aVar5);
                    return aVar5;
                }
                if (i5 == 3) {
                    return o5k.i.p((com.revolut.kompot.navigable.a) sVar2.f199082c.get());
                }
                if (i5 == 4) {
                    return new sqf.g(sVar2.f199081b, (jki.p) sVar2.f199084h.get());
                }
                if (i5 == 5) {
                    return new sqf.f();
                }
                throw new AssertionError(i5);
            case 11:
                if (i5 == 0) {
                    return new mqe.b();
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                lqe.a aVar6 = (lqe.a) obj2;
                return new a2d.m(aVar6.f199308a, aVar6.f199309b, aVar6.f199310c, 19);
            case 12:
                lrb.c cVar = (lrb.c) obj2;
                ee0.a aVar7 = cVar.d;
                l70.e eVar3 = cVar.k;
                if (i5 == 0) {
                    ue0.c storage = (ue0.c) cVar.f199491m.get();
                    bsb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(storage, "storage");
                    return new te0.u(storage);
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new AssertionError(i5);
                    }
                    w80.b formatter = eVar3.j();
                    vc.s.j(formatter);
                    qd0.b languageProvider = eVar3.n();
                    vc.s.j(languageProvider);
                    bsb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(formatter, "formatter");
                    Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                    vdf.b.Companion.getClass();
                    return vdf.a.a(formatter, languageProvider);
                }
                je0.d mapper = aVar7.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = cVar.e.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar7.f();
                vc.s.j(storageFactory);
                lrb.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "trading_advanced_charts_storage", mapper, 1, zhm.f0.f322471a, 32);
            case 13:
                if (i5 == 0) {
                    ltb.a aVar8 = (ltb.a) obj2;
                    return new ajf.d(aVar8.f199846a, aVar8.f199847b, aVar8.f199848c, aVar8.d, aVar8.e, 16);
                }
                if (i5 == 1) {
                    return new otb.b();
                }
                throw new AssertionError(i5);
            case 14:
                lti.u uVar = (lti.u) obj2;
                if (i5 == 0) {
                    return new fji.r((cli.n) uVar.f199960c.get(), uVar.f199959b);
                }
                if (i5 == 1) {
                    return new fji.s();
                }
                throw new AssertionError(i5);
            case 15:
                lu7.h0 h0Var = (lu7.h0) obj2;
                if (i5 == 0) {
                    return new gv7.e((cli.n) h0Var.f200108c.get(), h0Var.f200107b);
                }
                if (i5 == 1) {
                    return new gv7.f();
                }
                throw new AssertionError(i5);
            case 16:
                lu7.h0 h0Var2 = (lu7.h0) obj2;
                if (i5 == 0) {
                    return new gv7.e((cli.n) h0Var2.f200108c.get(), h0Var2.f200107b);
                }
                if (i5 == 1) {
                    return new gv7.f();
                }
                throw new AssertionError(i5);
            case 17:
                lu7.h0 h0Var3 = (lu7.h0) obj2;
                if (i5 == 0) {
                    return new gv7.e((cli.n) h0Var3.f200108c.get(), h0Var3.f200107b);
                }
                if (i5 == 1) {
                    return new gv7.f();
                }
                throw new AssertionError(i5);
            case 18:
                lu7.h0 h0Var4 = (lu7.h0) obj2;
                if (i5 == 0) {
                    return new gv7.e((cli.n) h0Var4.f200108c.get(), h0Var4.f200107b);
                }
                if (i5 == 1) {
                    return new gv7.f();
                }
                throw new AssertionError(i5);
            case 19:
                lz1.n nVar5 = (lz1.n) obj2;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    tz1.b bVar6 = (tz1.b) nVar5.d.get();
                    b90.a aVarA = nVar5.f200897b.a();
                    vc.s.j(aVarA);
                    lz1.k.Companion.getClass();
                    e.a aVar9 = h80.e.f149935b;
                    vc.s.k(aVar9);
                    sri.m mVarD = ((g8b.a) nVar5.f200898c).d();
                    vc.s.j(mVarD);
                    return new tz1.g(bVar6, aVarA, aVar9, mVarD);
                }
                ry1.e eVar4 = nVar5.f200896a;
                ls1.h bizum = eVar4.f258199b.a();
                bu1.f blik = eVar4.f258200c.a();
                g72.g mbway = eVar4.f.a();
                ry1.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bizum, "bizum");
                Intrinsics.checkNotNullParameter(blik, "blik");
                Intrinsics.checkNotNullParameter(mbway, "mbway");
                my1.b[] elements = {bizum, blik, mbway};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                vc.s.k(setY0);
                return new tz1.b(new sy1.g(setY0));
            case 20:
                m16.a aVar10 = (m16.a) obj2;
                a31.a aVar11 = aVar10.i;
                a31.a aVar12 = aVar10.d;
                a31.a aVar13 = aVar10.f201238c;
                ecm.q qVar2 = aVar10.f201236a;
                if (i5 == 0) {
                    return new hc2.e(qVar2, aVar10.f201237b, aVar13, aVar12, aVar10.e, aVar10.f, aVar10.f201247r, aVar10.k, aVar11, aVar10.f201242l, aVar10.f201243m, aVar10.f201244n, aVar10.o, aVar10.f201245p);
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return new n16.h(aVar13, aVar10.f201239g, aVar12, aVar10.f201240h, aVar11, aVar10.f201241j, qVar2);
                    }
                    throw new AssertionError(i5);
                }
                n16.g gVar = (n16.g) ((n16.h) aVar10.f201246q.get()).b();
                vc.s.k(gVar);
                return gVar;
            case 21:
                m18.e eVar5 = (m18.e) obj2;
                an0.c cVar2 = eVar5.e;
                ee0.a aVar14 = eVar5.f201263c;
                switch (i5) {
                    case 0:
                        ik0.b retrofitFactory = ((nj0.d) eVar5.f201262b).m();
                        vc.s.j(retrofitFactory);
                        Json json = (Json) eVar5.f201272r.get();
                        m18.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(json, "json");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, p.a.g(ulm.b1.Companion, "application/json", json), null, 27);
                        vc.s.k(retrofitA);
                        return retrofitA;
                    case 1:
                        Json baseJson = fe0.d.a();
                        m18.p.Companion.getClass();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new m18.n(i6));
                    case 2:
                        m18.h.Companion.getClass();
                        return new ne0.n(TimeUnit.MINUTES.toMillis(1L), Integer.MAX_VALUE);
                    case 3:
                        SmartNotificationsDatabase database = (SmartNotificationsDatabase) eVar5.u.get();
                        m18.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        c18.a aVarG = database.g();
                        vc.s.k(aVarG);
                        return aVarG;
                    case 4:
                        Context context2 = eVar5.d;
                        yk0.a databaseSessionProvider2 = cVar2.b();
                        vc.s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) eVar5.f).b();
                        m18.j.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        SmartNotificationsDatabase.Companion aVar15 = SmartNotificationsDatabase.INSTANCE;
                        aVar15.getClass();
                        SmartNotificationsDatabase smartNotificationsDatabase = (SmartNotificationsDatabase) aVar15.a(context2, databaseSessionProvider2, SmartNotificationsDatabase.f, databaseEncryptionMigratorFactory);
                        vc.s.k(smartNotificationsDatabase);
                        return smartNotificationsDatabase;
                    case 5:
                        g18.c dodProvider = new g18.c(eVar5.d(), (ne0.j) eVar5.f201275w.get(), (ue0.c) eVar5.f201277y.get());
                        m18.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
                        return new x4l.c(new f5h.b(dodProvider, continuation, 20), new g1.b(dodProvider, i3), new fv1.a(dodProvider, 17), new g18.b(dodProvider, continuation, i2), new dp4.f1(dodProvider, continuation, 21), new g18.b(dodProvider, continuation, i6));
                    case 6:
                        return new ne0.d();
                    case 7:
                        je0.d mapper2 = (je0.d) eVar5.f201276x.get();
                        yk0.a databaseSessionProvider3 = cVar2.b();
                        vc.s.j(databaseSessionProvider3);
                        xe0.f storageFactory2 = aVar14.f();
                        vc.s.j(storageFactory2);
                        m18.m.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider3, "smart_notifications_insights_storage", mapper2, 0, null, 56);
                    case 8:
                        Json json2 = (Json) eVar5.f201272r.get();
                        me0.a factory = aVar14.e();
                        vc.s.j(factory);
                        m18.p.Companion.getClass();
                        Intrinsics.checkNotNullParameter(json2, "json");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.a(json2);
                    default:
                        throw new AssertionError(i5);
                }
            case 22:
                m2b.e eVar6 = (m2b.e) obj2;
                switch (i5) {
                    case 0:
                        return new p2b.j((y1b.a) eVar6.f201809n.get());
                    case 1:
                        return new p2b.b((g3b.b) eVar6.f201807l.get(), eVar6.f.a(), (g3b.k) eVar6.f201808m.get());
                    case 2:
                        CfdService cfdServiceB = eVar6.b();
                        ne0.j jVar = (ne0.j) eVar6.f201806j.get();
                        ue0.c cVar3 = (ue0.c) eVar6.k.get();
                        CoroutineScope coroutineScopeA = eVar6.e.a();
                        vc.s.j(coroutineScopeA);
                        return new g3b.g(cfdServiceB, jVar, cVar3, coroutineScopeA);
                    case 3:
                        return new ne0.d();
                    case 4:
                        je0.d mapper3 = eVar6.f201803c.b();
                        vc.s.j(mapper3);
                        yk0.a databaseSessionProvider4 = eVar6.d.b();
                        vc.s.j(databaseSessionProvider4);
                        xe0.f storageFactory3 = eVar6.f201803c.f();
                        vc.s.j(storageFactory3);
                        n2b.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSessionProvider4, "margin_trading_storage", mapper3, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
                    case 5:
                        CfdService cfdServiceB2 = eVar6.b();
                        ne0.d dVar2 = new ne0.d();
                        CoroutineScope coroutineScopeA2 = eVar6.e.a();
                        vc.s.j(coroutineScopeA2);
                        return new g3b.k(cfdServiceB2, dVar2, coroutineScopeA2);
                    case 6:
                        l80.e eVarH = eVar6.f201804g.h();
                        vc.s.j(eVarH);
                        com.revolut.analytics.tracking.v3.d dVarF = eVar6.f201805h.f();
                        vc.s.j(dVarF);
                        return new f3b.f(eVarH, dVarF);
                    case 7:
                        return new k5b.d();
                    case 8:
                        return new c5b.a();
                    case 9:
                        return new s2b.b((te0.u) eVar6.f201813s.get());
                    case 10:
                        ue0.c storage2 = (ue0.c) eVar6.k.get();
                        n2b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(storage2, "storage");
                        return new te0.u(storage2);
                    case 11:
                        return new d5b.a();
                    case 12:
                        return new c3b.a();
                    case 13:
                        return new p2b.c();
                    default:
                        throw new AssertionError(i5);
                }
            case 23:
                m2b.v vVar = (m2b.v) obj2;
                h9h.a aVar16 = vVar.o;
                m2b.e eVar7 = vVar.f201923c;
                if (i5 == 0) {
                    qy5.a componentFactory = new qy5.a(26);
                    m2b.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
                    a2b.b bVarF = eVar7.f();
                    vc.s.j(bVarF);
                    tzg.m mVarT = aVar16.t();
                    vc.s.j(mVarT);
                    bVar = new i5b.b(new i5b.j(bVarF, mVarT), new i5b.k(new j5b.b()));
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            return new u2b.a();
                        }
                        if (i5 != 3) {
                            throw new AssertionError(i5);
                        }
                        y1b.a aVarD = eVar7.d();
                        vc.s.j(aVarD);
                        return new p2b.l(aVarD);
                    }
                    x8h.k kVarD = aVar16.d();
                    p2b.j jVarH = eVar7.h();
                    vc.s.j(jVarH);
                    bVar = new t2b.h(kVarD, jVarH);
                }
                return bVar;
            case 24:
                m3c.e eVar8 = (m3c.e) obj2;
                if (i5 == 0) {
                    return new com.revolut.feature.revolut_shop.ui.flow.ipp_shop.b(eVar8.f202331a, (rp0.g1) eVar8.e.get());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) eVar8.d.get();
                r3c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            case 25:
                m3c.i iVar2 = (m3c.i) obj2;
                PaymentMethodScreenContract$InputData paymentMethodScreenContract$InputData = iVar2.f202343a;
                if (i5 == 0) {
                    return new m4c.h(paymentMethodScreenContract$InputData, (cli.n) iVar2.f202344b.get());
                }
                if (i5 == 1) {
                    return new m4c.k(paymentMethodScreenContract$InputData, new o4c.a(paymentMethodScreenContract$InputData, new z3c.a()));
                }
                throw new AssertionError(i5);
            case 26:
                m3c.j jVar2 = (m3c.j) obj2;
                switch (i5) {
                    case 0:
                        return new k3c.p((IppShopService) jVar2.f202349g.get(), (ne0.j) jVar2.f202350h.get());
                    case 1:
                        Retrofit retrofit = ((nj0.d) jVar2.f202346a.f177304a).f();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        kg.o gson = fe0.c.a();
                        m3c.p.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        kg.p pVar = new kg.p(gson);
                        he0.m mVar2 = j3c.j.f171066a;
                        Objects.requireNonNull(mVar2);
                        pVar.e.add(mVar2);
                        GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(pVar.b());
                        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                        List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
                        Intrinsics.checkNotNullExpressionValue(listConverterFactories, "converterFactories(...)");
                        ListIterator<Converter.Factory> listIterator = listConverterFactories.listIterator();
                        while (listIterator.hasNext()) {
                            Converter.Factory next = listIterator.next();
                            if (next instanceof GsonConverterFactory) {
                                next = gsonConverterFactoryCreate;
                            }
                            listIterator.set(next);
                        }
                        Object objCreate = builderNewBuilder.build().create(IppShopService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        IppShopService ippShopService = (IppShopService) objCreate;
                        vc.s.k(ippShopService);
                        return ippShopService;
                    case 2:
                        m3c.p.Companion.getClass();
                        return new ne0.d();
                    case 3:
                        z3c.i productMapper = new z3c.i();
                        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
                        return new i4c.j();
                    case 4:
                        return new m3c.n();
                    case 5:
                        return new n3c.a((e3c.a) jVar2.i.get(), (k3c.b) jVar2.f202352l.get());
                    case 6:
                        return new k3c.b((ne0.j) jVar2.f202350h.get());
                    default:
                        throw new AssertionError(i5);
                }
            case 27:
                if (i5 == 0) {
                    return new mc3.c((cli.n) ((mb3.w) obj2).f204111a.get());
                }
                if (i5 == 1) {
                    return new mc3.d();
                }
                throw new AssertionError(i5);
            case 28:
                if (i5 == 0) {
                    return new ac3.f((cli.n) ((mb3.x) obj2).f204113a.get());
                }
                if (i5 == 1) {
                    return new ac3.g();
                }
                throw new AssertionError(i5);
            default:
                mfe.a aVar17 = (mfe.a) obj2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new ife.d();
                    }
                    throw new AssertionError(i5);
                }
                com.revolut.domain.interactors.transactions.a aVarC3 = ((bjf.a) aVar17.f204991a).c();
                vc.s.j(aVarC3);
                return new ofe.b(aVarC3, new ofe.c(), (ife.d) aVar17.f204992b.get());
        }
    }
}
