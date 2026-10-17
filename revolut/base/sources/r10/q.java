package r10;

import afj.g1;
import afj.t0;
import akl.o0;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaWebView;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.invest.smart_notifications.impl.data.network.InvestSmartNotificationsService;
import com.revolut.feature.revolutpay.management.api.declaration.RevolutPayManagementApi$Toggles$RevolutPaySettingsV2;
import com.revolut.feature.topup_screen.impl.data.network.service.CardTopUpRevampedService;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.user.api.UserApi$Toggles$MultipleCountryProfiles;
import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.kompot.navigable.vc.ViewController;
import do3.f;
import efm.d0;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.Instant;
import tof.a3;
import tx8.b0;
import v30.c0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements cij.a, ReadWriteProperty, xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f250850c;
    public Object d;

    public /* synthetic */ q() {
        this.f250848a = 8;
    }

    public static boolean b(a3 a3Var) {
        return (k71.k.Z(a3Var) || !k71.k.k0(a3Var) || k71.k.I(a3Var)) ? false : true;
    }

    public static akg.n j0(q qVar, f fVar, List list, int i) {
        if ((i & 2) != 0) {
            list = f0.f322471a;
        }
        return qVar.b0(fVar, list, w4l.j.f294644c);
    }

    public static akg.n k0(q qVar, f service) {
        Intrinsics.checkNotNullParameter(service, "service");
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((ang.f) qVar.f250850c).j(loadingStrategy), new an4.f(service, 12));
    }

    public static akg.n m0(q qVar, f service, List states, int i) {
        if ((i & 2) != 0) {
            states = f0.f322471a;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(states, "states");
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(qVar.b0(service, states, loadingStrategy), new anf.p(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fkf.c
            if (r0 == 0) goto L13
            r0 = r6
            fkf.c r0 = (fkf.c) r0
            int r1 = r0.f135810w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135810w = r1
            goto L18
        L13:
            fkf.c r0 = new fkf.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135810w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.d
            mkf.f r6 = (mkf.f) r6
            r0.f135810w = r3
            java.io.Serializable r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            if (r6 == 0) goto L42
            goto L43
        L42:
            r3 = 0
        L43:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.B(tof.a3, gim.c):java.lang.Object");
    }

    public boolean E() {
        return ((jte.d) ((gte.a) this.f250849b)).c(UserApi$Toggles$MultipleCountryProfiles.f94594c);
    }

    public boolean J(c0 feedType) {
        j30.c cVar = (j30.c) this.f250849b;
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        int i = f30.c.f131859a[feedType.ordinal()];
        if (i == 1 || i == 2) {
            return ((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatSearchMessages.f50979c);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.AirSearchMessages.f50966c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[PHI: r9
      0x0075: PHI (r9v1 fkf.f) = (r9v0 fkf.f), (r9v4 fkf.f), (r9v4 fkf.f), (r9v4 fkf.f), (r9v4 fkf.f) binds: [B:17:0x0047, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(fkf.f r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.M(fkf.f, gim.c):java.lang.Object");
    }

    public boolean O() {
        if (((jla.h) this.f250850c).d("REVOLUT_PAY.external_payment_processing", null) == bla.c.ENABLED) {
            return ((jte.d) ((gte.a) this.f250849b)).c(RevolutPayManagementApi$Toggles$RevolutPaySettingsV2.f84580c);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fkf.e
            if (r0 == 0) goto L13
            r0 = r6
            fkf.e r0 = (fkf.e) r0
            int r1 = r0.f135814w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135814w = r1
            goto L18
        L13:
            fkf.e r0 = new fkf.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135814w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            tof.z6 r5 = k71.k.l0(r5)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.f273199g
            if (r5 != 0) goto L3d
            goto L65
        L3d:
            java.lang.Object r6 = r4.f250849b
            cl3.a r6 = (cl3.a) r6
            wl3.h r6 = (wl3.h) r6
            rfm.w r5 = r6.c(r5)
            rfm.x r6 = new rfm.x
            r6.<init>(r5)
            java.lang.String r5 = "onErrorComplete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            r0.f135814w = r3
            java.lang.Object r6 = nim.a.i(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            zm3.a r6 = (zm3.a) r6
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r3 = 0
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.S(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList V(java.util.List r38, k71.q r39, java.util.Map r40, thf.m r41, thf.c r42) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.V(java.util.List, k71.q, java.util.Map, thf.m, thf.c):java.util.ArrayList");
    }

    public akg.n W(knh.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        twg.c cVar = (twg.c) this.d;
        InstrumentsTrendCollectionId instrumentsTrendCollectionId = source.f186164a;
        return nim.a.v(cVar.N(instrumentsTrendCollectionId, ((fnh.a) this.f250849b).a(instrumentsTrendCollectionId), ((fnh.c) this.f250850c).a(source), null, w4l.i.f294643c), new fkh.f(27));
    }

    @Override // cij.a
    public cij.a a(ViewController viewController) {
        switch (this.f250848a) {
            case 3:
                this.d = viewController;
                break;
            default:
                this.d = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public akg.n a0() {
        return ((cw9.d) this.f250849b).a() ? nim.a.v(j0((q) this.f250850c, f.BANKING, null, 6), new j3f.d(26)) : nim.a.v(((ang.f) this.d).j(w4l.h.f294642c), new j3f.d(27));
    }

    public akg.n b0(f service, List states, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((ang.f) this.f250850c).j(loadingStrategy), new amh.j(states, service, 9));
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f250850c, ViewController.class);
        vc.s.h((Boolean) this.d, Boolean.class);
        return new jyc.l((jyc.h) this.f250849b, (Boolean) this.d);
    }

    public doc.h c(doc.g delegates, doc.i input, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        doc.t tVar = new doc.t(input, (loc.b) this.f250849b, (eoc.a) this.f250850c, (eoc.b) this.d, bottomExpandableDialogControllerExtension);
        return new doc.h(tVar, new doc.n(tVar, delegates));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r2 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r10 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum d(fkf.f r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fkf.b
            if (r0 == 0) goto L13
            r0 = r10
            fkf.b r0 = (fkf.b) r0
            int r1 = r0.f135809y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135809y = r1
            goto L18
        L13:
            fkf.b r0 = new fkf.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f135807w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135809y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto Lae
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            int r9 = r0.v
            fkf.f r2 = r0.u
            yhm.o.b(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L79
        L40:
            yhm.o.b(r10)
            klf.j1 r10 = r9.f
            tof.a3 r2 = r9.f135815a
            boolean r10 = r10.c()
            if (r10 == 0) goto L4f
            goto Lb9
        L4f:
            java.lang.String r10 = r2.f272611s
            if (r10 == 0) goto L5d
            java.lang.String r6 = "suspicious_transaction_user_confirmed"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L5d
            r10 = r4
            goto L5e
        L5d:
            r10 = 0
        L5e:
            if (r10 == 0) goto L61
            goto Lb9
        L61:
            boolean r6 = b(r2)
            if (r6 != 0) goto L68
            goto Lb9
        L68:
            boolean r6 = r9.d
            if (r6 == 0) goto L84
            r0.u = r9
            r0.v = r10
            r0.f135809y = r4
            java.lang.Object r2 = r8.B(r2, r0)
            if (r2 != r1) goto L79
            goto Lad
        L79:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L84
            fkf.a r9 = fkf.a.REGULAR
            return r9
        L84:
            tof.a3 r9 = r9.f135815a
            tof.u1 r9 = r9.f272598k1
            if (r9 == 0) goto Lb9
            java.lang.String r9 = r9.f273097a
            if (r9 != 0) goto L8f
            goto Lb9
        L8f:
            java.lang.Object r2 = r8.f250850c
            co9.b r2 = (co9.b) r2
            kotlinx.coroutines.flow.Flow r9 = r2.d(r9)
            fk4.r r2 = new fk4.r
            r6 = 2
            r2.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            r0.u = r5
            r0.v = r10
            r0.f135809y = r3
            java.lang.Object r10 = vkm.q.x(r9, r0)
            if (r10 != r1) goto Lae
        Lad:
            return r1
        Lae:
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r10 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r10
            ho9.b r9 = r10.f79061b
            ho9.b r10 = ho9.b.UPI_CONTACT
            if (r9 != r10) goto Lb9
            fkf.a r9 = fkf.a.UPI
            return r9
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.d(fkf.f, gim.c):java.lang.Enum");
    }

    @Override // sim.d
    public Object getValue(Object obj2, KProperty property) {
        View thisRef = (View) obj2;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return (uw0.i) this.d;
    }

    public d0 i(UUID uuid) {
        return RxRoom.createSingle((RoomDatabase) this.f250849b, true, false, new be7.l(this, uuid, 18));
    }

    public Object k(y20.p pVar, Instant instant, Instant instant2, UUID uuid, gim.c cVar) {
        RoomDatabase roomDatabase = (RoomDatabase) this.f250849b;
        if (pVar instanceof y20.m) {
            return DBUtil.performSuspending(roomDatabase, true, false, new k(this, ((y20.m) pVar).f310523a, instant, instant2, uuid, 3), cVar);
        }
        if (pVar instanceof y20.o) {
            return DBUtil.performSuspending(roomDatabase, true, false, new l(1, uuid, instant, instant2, this, ((y20.o) pVar).f310529a), cVar);
        }
        if (pVar instanceof y20.n) {
            return DBUtil.performSuspending(roomDatabase, true, false, new k(this, ((y20.n) pVar).f310525a, instant, instant2, uuid, 1), cVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public Object q(List list, gim.c cVar) {
        return DBUtil.performSuspending((RoomDatabase) this.f250849b, true, false, new amh.n(this, prk.o.p("))", list, p.a.s("SELECT `id`, `createdAt`, `chatId`, `feedType`, `ticketCreatedAt`, `feedId`, `serverId`, `chatIdGroup`, `feedIdGroup`, `feedTypeGroup` FROM (SELECT * FROM messages WHERE id IN (")), list, 10), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r0(com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams r12, java.util.Map r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof df7.b
            if (r0 == 0) goto L13
            r0 = r14
            df7.b r0 = (df7.b) r0
            int r1 = r0.f113801x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113801x = r1
            goto L18
        L13:
            df7.b r0 = new df7.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113801x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r12 = r0.u
            yhm.o.b(r14)
            return r12
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r14)
            goto L59
        L38:
            yhm.o.b(r14)
            java.lang.Object r14 = r11.f250849b
            r6 = r14
            qf7.i r6 = (qf7.i) r6
            r0.f113801x = r4
            r6.getClass()
            qd8.e r5 = new qd8.e
            r10 = 3
            r9 = 0
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)
            if (r14 != r1) goto L59
            goto L7e
        L59:
            r12 = r14
            df7.a r12 = (df7.a) r12
            java.lang.Object r12 = r11.d
            om4.d0 r12 = (om4.d0) r12
            com.revolut.feature.slot_manager.api.model.SlotContext r12 = r12.h()
            java.lang.Object r13 = r11.f250850c
            skd.i r13 = (skd.i) r13
            r0.u = r14
            r0.f113801x = r3
            sk2.f r2 = new sk2.f
            r3 = 11
            r2.<init>(r3)
            java.lang.Object r12 = r13.l(r12, r2, r0)
            if (r12 != r1) goto L7a
            goto L7c
        L7a:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L7c:
            if (r12 != r1) goto L7f
        L7e:
            return r1
        L7f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.r0(com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams, java.util.Map, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s0(com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof df7.c
            if (r0 == 0) goto L13
            r0 = r8
            df7.c r0 = (df7.c) r0
            int r1 = r0.f113802w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113802w = r1
            goto L18
        L13:
            df7.c r0 = new df7.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113802w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L7a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L59
        L36:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f250849b
            qf7.i r8 = (qf7.i) r8
            r0.f113802w = r4
            r8.getClass()
            qc0.e1 r2 = new qc0.e1
            r4 = 6
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L56:
            if (r7 != r1) goto L59
            goto L79
        L59:
            java.lang.Object r7 = r6.d
            om4.d0 r7 = (om4.d0) r7
            com.revolut.feature.slot_manager.api.model.SlotContext r7 = r7.h()
            java.lang.Object r8 = r6.f250850c
            skd.i r8 = (skd.i) r8
            r0.f113802w = r3
            sk2.f r2 = new sk2.f
            r3 = 11
            r2.<init>(r3)
            java.lang.Object r7 = r8.l(r7, r2, r0)
            if (r7 != r1) goto L75
            goto L77
        L75:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L77:
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.s0(com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams, gim.c):java.lang.Object");
    }

    @Override // kotlin.properties.ReadWriteProperty
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void setValue(View thisRef, KProperty property, uw0.i iVar) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.f((uw0.i) this.d, iVar)) {
            return;
        }
        this.d = iVar;
        if (((Boolean) ((Function0) this.f250850c).invoke()).booleanValue()) {
            boolean z = jo0.m.f176847a;
            if (jo0.m.f176851h) {
                ((iv0.o) this.f250849b).a(iVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u10.l u0(v20.n r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.q.u0(v20.n):u10.l");
    }

    public ag1.k v0(ManualTransferData transferData, hrf.c cVar) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        dj0.d f92449a = ((ManualTransferContract$InputData) this.f250849b).getF92462a().getF92449a();
        return new ag1.k(new Flow[]{new go.g(((fuf.b) this.f250850c).b(new fuf.a(transferData.f92455a.getF92243g().f115082a, f92449a.f115082a, f92449a.f115083b, transferData.f, cVar)).f316033b, 2), new go.g(((l1l.h) this.d).a(new l1l.g(cVar != null ? Boolean.valueOf(foh.i.d(cVar)) : null)).f316033b, 2)}, 19);
    }

    public /* synthetic */ q(afj.b bVar, Object obj2, int i) {
        this.f250848a = i;
        this.f250849b = bVar;
        this.f250850c = obj2;
    }

    public q(Handler handler, Context context, HCaptchaConfig hCaptchaConfig, ii.e eVar, ii.k kVar, HCaptchaWebView hCaptchaWebView) {
        this.f250848a = 25;
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        if (eVar == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        if (hCaptchaWebView != null) {
            this.f250849b = hCaptchaConfig;
            this.f250850c = kVar;
            this.d = hCaptchaWebView;
            ii.g gVar = new ii.g(handler, hCaptchaConfig, kVar);
            ii.c cVar = new ii.c(context);
            WebSettings settings = hCaptchaWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setCacheMode(-1);
            settings.setGeolocationEnabled(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            hCaptchaWebView.setWebViewClient(new ay8.a(this, handler));
            if (qk.d.f246926a) {
                hCaptchaWebView.setWebChromeClient(new ii.i());
            }
            hCaptchaWebView.setBackgroundColor(0);
            if (hCaptchaConfig.getDisableHardwareAcceleration().booleanValue()) {
                hCaptchaWebView.setLayerType(1, null);
            }
            hCaptchaWebView.addJavascriptInterface(gVar, "JSInterface");
            hCaptchaWebView.addJavascriptInterface(cVar, "JSDI");
            hCaptchaWebView.loadDataWithBaseURL(hCaptchaConfig.getHost(), "<!DOCTYPE HTML>\n<html lang=\"en\">\n<head>\n    <title>hCaptcha Android</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n    <style>\n        * {\n            padding: 0;\n            margin: 0;\n        }\n        html {\n            height: 100%;\n        }\n        body {\n            display: table;\n            width: 100%;\n            height: 100%;\n            text-align: center;\n        }\n        #hcaptcha-container {\n            margin-top: 5px;\n            display: table-cell;\n            vertical-align: middle;\n        }\n        /* overwrite hCaptcha iframe overlay which adds a #FFF background with opacity 0.05 */\n        div > div:nth-child(2) {\n            opacity: 0 !important;\n        }\n    </style>\n</head>\n<body>\n<div id=\"hcaptcha-container\"></div>\n<script type=\"text/javascript\">\n    if (window.JSDI) {\n        JSON.parse(window.JSDI.getDebugInfo()).forEach(function (v) { window[v] = true; });\n        window.sysDebug = JSON.parse(window.JSDI.getSysDebug());\n    }\n</script>\n<script type=\"text/javascript\">\n    // Android will inject this bridge object as `JSInterface`\n    // Browser is missing it, so we mock it\n    var BridgeObject = window.JSInterface || {\n        getConfig: function getConfig() {\n            return JSON.stringify({\n                siteKey: '10000000-ffff-ffff-ffff-000000000001',\n                locale: 'ro',\n                size: 'compact',\n                orientation: 'portrait',\n                theme: 'dark',\n                sentry: true,\n                rqdata: null,\n                jsSrc: 'https://js.hcaptcha.com/1/api.js',\n                endpoint: null,\n                assethost: null,\n                imghost: null,\n                reportapi: null\n            });\n        },\n        onPass: function onPass(token) {\n            return console.log(\"pass: token \".concat(token));\n        },\n        onError: function onError(errCode) {\n            return console.log(\"error: code \".concat(errCode));\n        },\n        onLoaded: function onLoaded() {\n            return console.log('cb: api is loaded');\n        },\n        onOpen: function onOpen() {\n            return console.log('cb: challenge is visible');\n        }\n    };\n    var bridgeConfig = JSON.parse(BridgeObject.getConfig());\n    var hCaptchaID = null;\n    /**\n     * Called programmatically from HCaptchaWebViewHelper.\n     */\n    function resetAndExecute() {\n        hcaptcha.reset();\n        hcaptcha.execute(hCaptchaID);\n    }\n    function reset() {\n        hcaptcha.reset();\n    }\n    function getTheme(bridgeConfig) {\n        var theme = bridgeConfig.theme;\n        var customTheme = bridgeConfig.customTheme;\n        if (customTheme) {\n            try {\n                return JSON.parse(customTheme);\n            } catch (e) {\n                console.error(e);\n                BridgeObject.onError(32);\n            }\n        }\n        return theme;\n    }\n    function getRenderConfig() {\n        return {\n            sitekey: bridgeConfig.siteKey,\n            size: bridgeConfig.size,\n            orientation: bridgeConfig.orientation,\n            theme: getTheme(bridgeConfig),\n            callback: function callback(token) {\n                return BridgeObject.onPass(token);\n            },\n            'chalexpired-callback': function chalexpiredCallback() {\n                return BridgeObject.onError(15);\n            },\n            'close-callback': function closeCallback() {\n                return BridgeObject.onError(30);\n            },\n            'error-callback': function errorCallback(error) {\n                switch(error) {\n                    case \"rate-limited\":\n                        return BridgeObject.onError(31);\n                    case \"network-error\":\n                        return BridgeObject.onError(7);\n                    case \"invalid-data\":\n                        return BridgeObject.onError(8);\n                    case \"challenge-error\":\n                        return BridgeObject.onError(9);\n                    case \"internal-error\":\n                        return BridgeObject.onError(10);\n                    default:\n                        // Error not handled? Log it for debugging purposes\n                        console.error(error);\n                        return BridgeObject.onError(29);\n                }\n            },\n            'open-callback': function openCallback() {\n                return BridgeObject.onOpen();\n            }\n        };\n    }\n    function onHcaptchaLoaded() {\n        try {\n            var renderConfig = getRenderConfig();\n            hCaptchaID = hcaptcha.render('hcaptcha-container', renderConfig);\n            BridgeObject.onLoaded();\n            var rqdata = bridgeConfig.rqdata;\n            if (rqdata) {\n                hcaptcha.setData(hCaptchaID, { rqdata: rqdata });\n            }\n            if (renderConfig.size === 'invisible' && !bridgeConfig.hideDialog) {\n                // We want to auto execute in case of `invisible` checkbox.\n                // But not in case of `hideDialog` since verification process\n                // might be desired to happen at a later time.\n                hcaptcha.execute(hCaptchaID);\n            }\n        } catch (e) {\n            console.error(e);\n            BridgeObject.onError(29);\n        }\n    }\n    function addQueryParamIfDefined(url, queryName, queryValue) {\n        if (queryValue !== undefined && queryValue !== null) {\n            var link = url.indexOf('?') !== -1 ? '&' : '?';\n            return url + link + queryName + '=' + encodeURIComponent(queryValue);\n        }\n        return url;\n    }\n    function loadApi() {\n        var siteKey = bridgeConfig.siteKey;\n        var locale = bridgeConfig.locale;\n        var sentry = bridgeConfig.sentry;\n        var jsSrc = bridgeConfig.jsSrc;\n        var endpoint = bridgeConfig.endpoint;\n        var assethost = bridgeConfig.assethost;\n        var imghost = bridgeConfig.imghost;\n        var reportapi = bridgeConfig.reportapi;\n        var host = bridgeConfig.host || siteKey + '.android-sdk.hcaptcha.com';\n        var scriptSrc = jsSrc + '?render=explicit&onload=' + onHcaptchaLoaded.name;\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'recaptchacompat', 'off');\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'hl', locale);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'host', host);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'sentry', sentry);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'endpoint', endpoint);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'assethost', assethost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'imghost', imghost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'reportapi', reportapi);\n        if (bridgeConfig.customTheme) {\n            scriptSrc = addQueryParamIfDefined(scriptSrc, 'custom', 'true');\n        }\n        var script = document.createElement('script');\n        script.async = true;\n        script.src = scriptSrc;\n        script.onerror = function () {\n            // network issue\n            BridgeObject.onError(7);\n        };\n        document.head.appendChild(script);\n    }\n    var container = document.getElementById(\"hcaptcha-container\");\n    container.addEventListener(\"click\", function () {\n        if (window.hcaptcha) {\n            // Allows dismissal of checkbox view\n            window.hcaptcha.close();\n        } else {\n            BridgeObject.onError(30);\n        }\n    });\n    loadApi();\n</script>\n</body>\n</html>\n", "text/html", "UTF-8", null);
            hCaptchaWebView.isHardwareAccelerated();
            return;
        }
        throw new NullPointerException("webView is marked non-null but is null");
    }

    @Override // cij.a
    public g1 build() {
        switch (this.f250848a) {
            case 3:
                vc.s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f250849b, (t0) this.f250850c);
            default:
                vc.s.h((ViewController) this.d, ViewController.class);
                return new g1((afj.b) this.f250849b, (afj.m) this.f250850c);
        }
    }

    public q(htl.k mapper, htl.l navigationProvider, vrl.g investOrdersInteractor) {
        this.f250848a = 23;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        this.f250849b = mapper;
        this.f250850c = navigationProvider;
        this.d = investOrdersInteractor;
    }

    public q(cy8.a redirectMapper, b0 sdkVendorAnalyticsTracker) {
        this.f250848a = 10;
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        Intrinsics.checkNotNullParameter(sdkVendorAnalyticsTracker, "sdkVendorAnalyticsTracker");
        this.f250849b = redirectMapper;
        this.f250850c = sdkVendorAnalyticsTracker;
        this.d = vkm.q.b(1, 5, null);
    }

    public q(iv0.o animationHandler, Function0 animationCondition) {
        this.f250848a = 26;
        Intrinsics.checkNotNullParameter(animationHandler, "animationHandler");
        Intrinsics.checkNotNullParameter(animationCondition, "animationCondition");
        this.f250849b = animationHandler;
        this.f250850c = animationCondition;
    }

    public q(loc.b chartProvider, eoc.a chartSettingsActionHandler, eoc.b chartSettingsMapper) {
        this.f250848a = 12;
        Intrinsics.checkNotNullParameter(chartProvider, "chartProvider");
        Intrinsics.checkNotNullParameter(chartSettingsActionHandler, "chartSettingsActionHandler");
        Intrinsics.checkNotNullParameter(chartSettingsMapper, "chartSettingsMapper");
        this.f250849b = chartProvider;
        this.f250850c = chartSettingsActionHandler;
        this.d = chartSettingsMapper;
    }

    public q(j30.c chatFeatureToggles, qd0.b languageProvider, f30.k searchTextExtractor) {
        this.f250848a = 16;
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(searchTextExtractor, "searchTextExtractor");
        this.f250849b = chatFeatureToggles;
        this.f250850c = languageProvider;
        this.d = searchTextExtractor;
    }

    public q(akl.f0 oauthUserInfoRepository, o0 revolutAccountUserInfoRepository, rqk.m userInfoFromAppProvider) {
        this.f250848a = 28;
        Intrinsics.checkNotNullParameter(oauthUserInfoRepository, "oauthUserInfoRepository");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        this.f250849b = oauthUserInfoRepository;
        this.f250850c = revolutAccountUserInfoRepository;
        this.d = userInfoFromAppProvider;
    }

    public q(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, y9c.b revolutPayManagementRepository) {
        this.f250848a = 9;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(revolutPayManagementRepository, "revolutPayManagementRepository");
        this.f250849b = featureToggleInteractor;
        this.f250850c = productCatalogueInteractor;
        this.d = revolutPayManagementRepository;
    }

    public q(wsg.n walletInteractor, cfa.h removePocketExtensionProvider, m78.i juniorWalletInteractor, a88.d juniorRemovePocketContentProvider) {
        this.f250848a = 1;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(removePocketExtensionProvider, "removePocketExtensionProvider");
        Intrinsics.checkNotNullParameter(juniorWalletInteractor, "juniorWalletInteractor");
        Intrinsics.checkNotNullParameter(juniorRemovePocketContentProvider, "juniorRemovePocketContentProvider");
        this.f250849b = walletInteractor;
        this.f250850c = juniorWalletInteractor;
        this.d = juniorRemovePocketContentProvider;
    }

    public q(cw9.d paymentsProductFeatureChecker, q userRegisteredIdentitiesInteractor, ang.f userInteractor) {
        this.f250848a = 27;
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f250849b = paymentsProductFeatureChecker;
        this.f250850c = userRegisteredIdentitiesInteractor;
        this.d = userInteractor;
    }

    public q(ManualTransferContract$InputData inputData, fuf.b balanceValidator, l1l.h dealableCurrenciesValidator) {
        this.f250848a = 19;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balanceValidator, "balanceValidator");
        Intrinsics.checkNotNullParameter(dealableCurrenciesValidator, "dealableCurrenciesValidator");
        this.f250849b = inputData;
        this.f250850c = balanceValidator;
        this.d = dealableCurrenciesValidator;
    }

    public q(fnh.a collectionsAssetListSourceCollectionKeyProvider, fnh.c collectionsAssetListSourceFiltersProvider, twg.c instrumentsTrendCollectionsInteractor) {
        this.f250848a = 18;
        Intrinsics.checkNotNullParameter(collectionsAssetListSourceCollectionKeyProvider, "collectionsAssetListSourceCollectionKeyProvider");
        Intrinsics.checkNotNullParameter(collectionsAssetListSourceFiltersProvider, "collectionsAssetListSourceFiltersProvider");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        this.f250849b = collectionsAssetListSourceCollectionKeyProvider;
        this.f250850c = collectionsAssetListSourceFiltersProvider;
        this.d = instrumentsTrendCollectionsInteractor;
    }

    public q(InvestSmartNotificationsService service, ne0.j memoryCache, c18.a feedElementDao) {
        this.f250848a = 20;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(feedElementDao, "feedElementDao");
        this.f250849b = service;
        this.f250850c = memoryCache;
        this.d = feedElementDao;
    }

    public q(uke.b tradingBannersInteractor, q06.l deeplinkRouter, f80.a uriHelper) {
        this.f250848a = 15;
        Intrinsics.checkNotNullParameter(tradingBannersInteractor, "tradingBannersInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f250849b = tradingBannersInteractor;
        this.f250850c = deeplinkRouter;
        this.d = uriHelper;
    }

    public q(yd9.e ordersMapper, p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor, iva.a recurringBuysNavigationProvider) {
        this.f250848a = 2;
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        this.f250849b = ordersMapper;
        this.f250850c = fxOrderInteractor;
        this.d = recurringPaymentInteractor;
    }

    public q(PortfolioRecurringOrdersService portfolioRecurringOrdersService, w4l.f recurringOrdersByPortfolioIdDod, w4l.f recurringOrderByOrderIdDod) {
        this.f250848a = 14;
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersService, "portfolioRecurringOrdersService");
        Intrinsics.checkNotNullParameter(recurringOrdersByPortfolioIdDod, "recurringOrdersByPortfolioIdDod");
        Intrinsics.checkNotNullParameter(recurringOrderByOrderIdDod, "recurringOrderByOrderIdDod");
        this.f250849b = portfolioRecurringOrdersService;
        this.f250850c = recurringOrdersByPortfolioIdDod;
        this.d = recurringOrderByOrderIdDod;
    }

    public q(CardTopUpRevampedService cardTopUpService, hue.b cardTopUpStatusMapper, ywh.b deviceParamsProvider) {
        this.f250848a = 6;
        Intrinsics.checkNotNullParameter(cardTopUpService, "cardTopUpService");
        Intrinsics.checkNotNullParameter(cardTopUpStatusMapper, "cardTopUpStatusMapper");
        Intrinsics.checkNotNullParameter(deviceParamsProvider, "deviceParamsProvider");
        this.f250849b = cardTopUpService;
        this.f250850c = cardTopUpStatusMapper;
        this.d = deviceParamsProvider;
    }

    public q(gte.a featureToggleInteractor, ang.f userInteractor, hng.b selectedRegisteredIdentityIdRepository) {
        this.f250848a = 5;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdRepository, "selectedRegisteredIdentityIdRepository");
        this.f250849b = featureToggleInteractor;
        this.f250850c = userInteractor;
        this.d = selectedRegisteredIdentityIdRepository;
    }

    public q(qf7.i repository, skd.i slotManagerInteractor, om4.d0 mainSlotContextProvider) {
        this.f250848a = 11;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainSlotContextProvider, "mainSlotContextProvider");
        this.f250849b = repository;
        this.f250850c = slotManagerInteractor;
        this.d = mainSlotContextProvider;
    }

    public q(i9h.q state, su9.c mostTradedAssetsInteractor, ybl.l tradingConfigInteractor, kl.b0 footerDisclosurePresentationModel, d9h.a mostTradedAssetsRateProvider) {
        this.f250848a = 24;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mostTradedAssetsInteractor, "mostTradedAssetsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(footerDisclosurePresentationModel, "footerDisclosurePresentationModel");
        Intrinsics.checkNotNullParameter(mostTradedAssetsRateProvider, "mostTradedAssetsRateProvider");
        this.f250849b = state;
        this.f250850c = mostTradedAssetsInteractor;
        this.d = mostTradedAssetsRateProvider;
    }

    public q(lde.m sharedHelpTransactionItemsDelegate, hg0.p troubleshooterInteractor) {
        this.f250848a = 21;
        Intrinsics.checkNotNullParameter(sharedHelpTransactionItemsDelegate, "sharedHelpTransactionItemsDelegate");
        Intrinsics.checkNotNullParameter(troubleshooterInteractor, "troubleshooterInteractor");
        this.f250849b = sharedHelpTransactionItemsDelegate;
        this.f250850c = troubleshooterInteractor;
        this.d = vkm.q.b(0, 7, null);
    }

    public q(cl3.a contactsInteractor, co9.b paymentCounterpartyInteractor, mkf.f dataResolver) {
        this.f250848a = 17;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(dataResolver, "dataResolver");
        this.f250849b = contactsInteractor;
        this.f250850c = paymentCounterpartyInteractor;
        this.d = dataResolver;
    }

    public q(r39.a stopLimitSummaryMapper, o7.b orderQuoteInteractor, l4i.a amountConverter, ppk.f ratesInteractor) {
        this.f250848a = 13;
        Intrinsics.checkNotNullParameter(stopLimitSummaryMapper, "stopLimitSummaryMapper");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f250849b = stopLimitSummaryMapper;
        this.f250850c = orderQuoteInteractor;
        this.d = ratesInteractor;
    }

    public q(BackendFlow flow, FormScreen screen, fc0.i backendFlowTransactionInteractor) {
        this.f250848a = 7;
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(backendFlowTransactionInteractor, "backendFlowTransactionInteractor");
        this.f250849b = flow;
        this.f250850c = screen;
        this.d = backendFlowTransactionInteractor;
    }

    public q(Context context, n8b.a countryInteractor, t70.b currencyLocalization) {
        this.f250848a = 22;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        this.f250849b = context;
        this.f250850c = countryInteractor;
        this.d = currencyLocalization;
    }

    public q(ChatDatabase chatDatabase) {
        this.f250848a = 0;
        this.d = new s10.a();
        this.f250849b = chatDatabase;
        this.f250850c = new ofg.i(this, 17);
    }

    public q(jyc.h hVar) {
        this.f250848a = 29;
        this.f250849b = hVar;
    }
}
