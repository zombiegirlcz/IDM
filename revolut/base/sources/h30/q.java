package h30;

import ahe.h0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.webkit.WebSettings;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.core.ui_kit_resources.R$font;
import com.revolut.data.model.Data;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import com.revolut.feature.selfserve.core.instructions.InstructionsService;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature_cpg.impl.network.CardPaymentsGatewayService;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import com.trustdockekyc.core.backend.domain.model.AppError;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import h30.q;
import ix0.o1;
import ix0.p1;
import ix0.q1;
import ix0.r1;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jpl.e;
import klf.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kr.h2;
import lqa.y;
import ne0.d;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import skm.p0;
import ufm.i;
import ulm.i1;
import ulm.j1;
import w4l.f;
import zh9.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements sji.a, xki.d, jbj.c, Callback, gf3.a, el.b, ut5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f148941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f148942c;
    public Object d;
    public Object e;

    public /* synthetic */ q(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f148940a = i;
        this.f148941b = obj2;
        this.f148942c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public static String s0(String str) {
        String strQ = j6.a.q("+", str);
        if (kotlin.text.a0.H(str, "+", false)) {
            strQ = null;
        }
        return strQ == null ? str : strQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h4k.n
            if (r0 == 0) goto L13
            r0 = r6
            h4k.n r0 = (h4k.n) r0
            int r1 = r0.f149400x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149400x = r1
            goto L18
        L13:
            h4k.n r0 = new h4k.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149400x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Set r0 = r0.u
            java.util.Set r0 = (java.util.Set) r0
            yhm.o.b(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            xi0.a r6 = xi0.b.Companion
            r6.getClass()
            xi0.b r6 = xi0.b.D
            java.lang.String r6 = r6.f306286a
            java.util.Set r6 = zhm.y0.b(r6)
            r2 = r6
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f149400x = r3
            java.lang.Object r0 = r5.Q0(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r4 = r0
            r0 = r6
            r6 = r4
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5d
            return r0
        L5d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.A0(gim.c):java.lang.Object");
    }

    @Override // ut5.h
    public Flow B() {
        Flow flowQ;
        kv5.o oVar = (kv5.o) this.f148942c;
        if (((jte.d) oVar.e).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c)) {
            flowQ = vkm.q.Q(oVar.d.a(), new kv5.n(null, oVar, 0));
        } else {
            flowQ = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        return I0(rd0.e.c(flowQ, kotlin.coroutines.g.f186406a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r7 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(gim.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f148941b
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData r0 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData) r0
            boolean r1 = r7 instanceof h4k.o
            if (r1 == 0) goto L17
            r1 = r7
            h4k.o r1 = (h4k.o) r1
            int r2 = r1.f149401w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f149401w = r2
            goto L1c
        L17:
            h4k.o r1 = new h4k.o
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149401w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r7)
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L8b
        L3a:
            yhm.o.b(r7)
            f5j.a r7 = r0.getF102077a()
            java.lang.String r7 = r7.f132337n
            xi0.a r3 = xi0.b.Companion
            r3.getClass()
            xi0.b r3 = xi0.b.D
            java.lang.String r3 = r3.f306286a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r3)
            if (r7 == 0) goto L9d
            f5j.a r7 = r0.getF102077a()
            wi0.a r3 = wi0.b.Companion
            r3.getClass()
            wi0.b r3 = wi0.b.A
            boolean r7 = f5j.c.d(r7, r3)
            if (r7 == 0) goto L9d
            f5j.a r7 = r0.getF102077a()
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Map r7 = r7.u
            if (r7 == 0) goto L79
            java.lang.String r0 = "ACCOUNT_OWNER"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            goto L7a
        L79:
            r7 = 0
        L7a:
            java.lang.String r0 = "SELF"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 != 0) goto L93
            r1.f149401w = r5
            java.lang.Object r7 = r6.E0(r1)
            if (r7 != r2) goto L8b
            goto L9b
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9d
        L93:
            r1.f149401w = r4
            java.lang.Object r7 = r6.H0(r1)
            if (r7 != r2) goto L9c
        L9b:
            return r2
        L9c:
            return r7
        L9d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.B0(gim.c):java.lang.Object");
    }

    public Object C0(gim.c cVar) {
        return ((BankTransferAmountScreenContract$InputData) this.f148941b).getF102077a().f132335l == f5j.r.PIX_ALIAS ? Boolean.TRUE : B0(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h4k.p
            if (r0 == 0) goto L13
            r0 = r5
            h4k.p r0 = (h4k.p) r0
            int r1 = r0.f149402w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149402w = r1
            goto L18
        L13:
            h4k.p r0 = new h4k.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149402w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f149402w = r3
            java.lang.Object r5 = r4.C0(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.e
            gte.a r5 = (gte.a) r5
            com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts r0 = com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts.f61801c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r0)
            if (r5 == 0) goto L52
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.D0(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h4k.q
            if (r0 == 0) goto L13
            r0 = r5
            h4k.q r0 = (h4k.q) r0
            int r1 = r0.f149403w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149403w = r1
            goto L18
        L13:
            h4k.q r0 = new h4k.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149403w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.d
            uw1.c r5 = (uw1.c) r5
            ty1.b r5 = (ty1.b) r5
            yoj.c r2 = yoj.c.PIX_BRL
            pfm.z r5 = r5.c(r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            pfm.z r5 = ue0.e.F(r5, r2)
            r0.f149403w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.E0(gim.c):java.lang.Object");
    }

    public boolean F0() {
        return ((jte.d) ((gte.a) this.f148941b)).c(StoreApi$Toggles$Store.f88419c) && ((nyb.b) ((eub.a) this.f148942c)).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof k2j.g
            if (r0 == 0) goto L13
            r0 = r5
            k2j.g r0 = (k2j.g) r0
            int r1 = r0.f180609w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180609w = r1
            goto L18
        L13:
            k2j.g r0 = new k2j.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180609w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.e
            l61.a r5 = (l61.a) r5
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r0.f180609w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            l71.d r5 = (l71.d) r5
            boolean r5 = l71.f.a(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.G0(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H0(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h4k.r
            if (r0 == 0) goto L13
            r0 = r7
            h4k.r r0 = (h4k.r) r0
            int r1 = r0.f149404w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149404w = r1
            goto L18
        L13:
            h4k.r r0 = new h4k.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149404w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L63
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f148942c
            ang.f r7 = (ang.f) r7
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            h3d.a r2 = new h3d.a
            r4 = 13
            r2.<init>(r4)
            h0l.g r4 = new h0l.g
            r5 = 15
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            pfm.z r7 = ue0.e.F(r2, r7)
            r0.f149404w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.H0(gim.c):java.lang.Object");
    }

    public akg.n I0(efm.r pocketsDataObservable) {
        jx0.a aVar = (jx0.a) this.f148941b;
        Intrinsics.checkNotNullParameter(pocketsDataObservable, "pocketsDataObservable");
        efm.r rVarSwitchMap = xv5.c.b((xv5.c) aVar.f179039c).switchMap(new ksb.a(new kp0.q(aVar, pocketsDataObservable, 15), 14));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        vkm.d dVarB = rd0.e.b(rVarSwitchMap);
        jul.o oVar = (jul.o) this.d;
        Continuation continuation = null;
        akg.n nVarV = nim.a.v(vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) oVar.f178696c)), new a3(continuation, oVar, 8)), new ksk.h(21));
        q qVar = (q) this.e;
        return nim.a.v(u0.i(dVarB, nVarV, nim.a.v(n14.k.p(vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) qVar.f148942c)), new a3(continuation, qVar, 9)), new ksk.h(23)), new ksk.h(24))), new ksk.h(22));
    }

    public efm.r J0(boolean z) {
        return ue0.e.E(xx9.p.c((xx9.p) this.f148942c, z, null, 2), new Data(zhm.f0.f322471a, null, false, 6, null));
    }

    public long K0(o1 priority) {
        Object obj2;
        Context contextI;
        Context contextI2;
        Object obj3;
        Object obj4 = this.f148941b;
        Context context = (Context) this.e;
        Intrinsics.checkNotNullParameter(priority, "priority");
        r1 r1Var = (r1) this.d;
        q1 q1VarA = r1Var.a();
        if (q1VarA == null || (obj2 = q1VarA.f169282b) == null) {
            obj2 = obj4;
        }
        if (q1VarA == null || (contextI = (Context) q1VarA.d.get()) == null) {
            contextI = z92.f.i(context);
        }
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(context, "context");
        long j2 = r1Var.f169285a;
        r1Var.f169285a = 1 + j2;
        r1Var.f169286b.push(new q1(j2, null, priority, new WeakReference(context)));
        q1 q1VarA2 = r1Var.a();
        if (q1VarA2 != null && (obj3 = q1VarA2.f169282b) != null) {
            obj4 = obj3;
        }
        if (((q1VarA2 != null && (contextI2 = (Context) q1VarA2.d.get()) != null) || (contextI2 = z92.f.i(context)) != null) && (!Intrinsics.f(obj2, obj4) || contextI == null || kli.a.q(contextI) != kli.a.q(contextI2))) {
            ((p1) this.f148942c).f(obj4, contextI2);
        }
        return j2;
    }

    public void L0(hd.a aVar) throws GeneralSecurityException {
        aVar.getClass();
        hd.t tVar = new hd.t(hd.r.class, aVar.f151338a);
        HashMap map = (HashMap) this.f148942c;
        if (!map.containsKey(tVar)) {
            map.put(tVar, aVar);
            return;
        }
        hd.a aVar2 = (hd.a) map.get(tVar);
        if (aVar2.equals(aVar) && aVar.equals(aVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + tVar);
    }

    @Override // jbj.c
    public Flow M(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return nim.a.v(((k18.c) this.d).x((String) this.f148941b, w4l.h.f294642c), new bcj.i(blockchain, 8));
    }

    public void M0(hd.c cVar) throws GeneralSecurityException {
        hd.u uVar = new hd.u(cVar.f151340a, hd.r.class);
        HashMap map = (HashMap) this.f148941b;
        if (!map.containsKey(uVar)) {
            map.put(uVar, cVar);
            return;
        }
        hd.c cVar2 = (hd.c) map.get(uVar);
        if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + uVar);
    }

    public void N0(hd.m mVar) throws GeneralSecurityException {
        mVar.getClass();
        hd.t tVar = new hd.t(hd.s.class, mVar.f151356a);
        HashMap map = (HashMap) this.e;
        if (!map.containsKey(tVar)) {
            map.put(tVar, mVar);
            return;
        }
        hd.m mVar2 = (hd.m) map.get(tVar);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + tVar);
    }

    public void O0(hd.n nVar) throws GeneralSecurityException {
        hd.u uVar = new hd.u(nVar.f151357a, hd.s.class);
        HashMap map = (HashMap) this.d;
        if (!map.containsKey(uVar)) {
            map.put(uVar, nVar);
            return;
        }
        hd.n nVar2 = (hd.n) map.get(uVar);
        if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof itc.d
            if (r0 == 0) goto L13
            r0 = r5
            itc.d r0 = (itc.d) r0
            int r1 = r0.f168363w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168363w = r1
            goto L18
        L13:
            itc.d r0 = new itc.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168363w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L4b
        L27:
            r5 = move-exception
            goto L4e
        L29:
            r5 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.d     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            skd.i r5 = (skd.i) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r2 = r4.e     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            om4.d0 r2 = (om4.d0) r2     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r2.h()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f168363w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.d(r2, r3, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L4b
            return r1
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4e:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            return r2
        L59:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.P0(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h4k.s
            if (r0 == 0) goto L13
            r0 = r5
            h4k.s r0 = (h4k.s) r0
            int r1 = r0.f149405w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149405w = r1
            goto L18
        L13:
            h4k.s r0 = new h4k.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149405w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f149405w = r3
            java.lang.Object r5 = r4.C0(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.e
            gte.a r5 = (gte.a) r5
            com.revolut.feature.apm.core.api.ApmToggles$PixFxTransfers r0 = com.revolut.feature.apm.core.api.ApmToggles$PixFxTransfers.f61800c
            boolean r5 = r5.a(r0)
            if (r5 == 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.Q0(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R0(gim.c r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.e
            gte.a r0 = (gte.a) r0
            boolean r1 = r6 instanceof h4k.t
            if (r1 == 0) goto L17
            r1 = r6
            h4k.t r1 = (h4k.t) r1
            int r2 = r1.f149406w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f149406w = r2
            goto L1c
        L17:
            h4k.t r1 = new h4k.t
            r1.<init>(r5, r6)
        L1c:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149406w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r6)
            goto L3f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            r1.f149406w = r4
            java.lang.Object r6 = r5.C0(r1)
            if (r6 != r2) goto L3f
            return r2
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts r6 = com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts.f61801c
            boolean r6 = r0.a(r6)
            if (r6 == 0) goto L58
            com.revolut.feature.apm.core.api.ApmToggles$PixFxTransfers r6 = com.revolut.feature.apm.core.api.ApmToggles$PixFxTransfers.f61800c
            boolean r6 = r0.a(r6)
            if (r6 == 0) goto L58
            goto L59
        L58:
            r4 = 0
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.R0(gim.c):java.lang.Object");
    }

    @Override // sji.a
    public Object S(BaseScreen baseScreen) {
        throw null;
    }

    public void S0(FeatureDefinition feature, ite.d shouldCrashOnValidationFailure) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(shouldCrashOnValidationFailure, "shouldCrashOnValidationFailure");
        Experiment experimentQ8 = feature.q8();
        if (experimentQ8 == null) {
            return;
        }
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e() || od0.a.i() || od0.a.h()) {
            return;
        }
        CoroutineScope coroutineScope = (CoroutineScope) this.f148942c;
        p0 p0Var = p0.f264001a;
        skm.e0.C(coroutineScope, elm.f.f127540b, null, new c00.d(this, experimentQ8, shouldCrashOnValidationFailure, null, 3), 2);
    }

    @Override // ut5.h
    public Flow W() {
        kv5.o oVar = (kv5.o) this.f148942c;
        return I0(rd0.e.c(((jte.d) oVar.e).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) ? oVar.b(new h2(26)) : ta6.a.h(oVar.b(new h2(26)), oVar.b(new kob.a(oVar, 8)), new kv5.q(oVar.f189973b.o(), 0), new h0(4, 5, null)), kotlin.coroutines.g.f186406a));
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        switch (this.f148940a) {
            case 1:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            case 20:
                throw null;
            default:
                throw null;
        }
    }

    @Override // jbj.c
    public Flow b(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return new go.g(null, 2);
    }

    @Override // ut5.h
    public Flow b0() {
        return I0(rd0.e.c(((kv5.o) this.f148942c).a(), kotlin.coroutines.g.f186406a));
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public sji.b mo3800build() {
        vc.s.h((BaseScreen) this.d, BaseScreen.class);
        vc.s.h((ChatListContract$InputData) this.e, ChatListContract$InputData.class);
        return new r((n) this.f148941b, (o) this.f148942c, (BaseScreen) this.d, (ChatListContract$InputData) this.e);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new kl.e0((hl.a) ((Provider) this.f148941b).get(), (OnfidoRemoteConfig) ((il.a) this.f148942c).get(), (SchedulersProvider) ((il.g) this.d).get(), (WaitingScreenTracker) ((il.a) this.e).get());
    }

    @Override // jbj.c
    public Flow k(xi0.b fallbackCurrency) {
        Intrinsics.checkNotNullParameter(fallbackCurrency, "fallbackCurrency");
        return boh.f.e(((g26.b) this.e).a((String) this.f148942c, w4l.h.f294642c), new gwe.d(this, 29));
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable t2) {
        AppError networkConnectionFailedError;
        AppError appErrorA;
        Call call2 = (Call) this.f148941b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t2, "t");
        r10.v vVar = (r10.v) this.e;
        i2m.g gVar = (i2m.g) vVar.d;
        Retrofit retrofit = (Retrofit) vVar.f250863b;
        if (t2 instanceof HttpException) {
            HttpException httpException = (HttpException) t2;
            Response<?> response = httpException.response();
            if (response != null) {
                appErrorA = gVar.a(response, retrofit, httpException);
                if ((appErrorA instanceof w1m.a) || ((AtomicInteger) this.d).incrementAndGet() > 3) {
                    String message = "communication failed. error=" + appErrorA;
                    Intrinsics.checkNotNullParameter(message, "message");
                    u1m.f0 f0Var = u1m.f0.VERBOSE;
                    ((Callback) this.f148942c).onFailure(call, appErrorA);
                }
                String message2 = "retrying due to communication failure. url=" + call2.request().f281095a;
                Intrinsics.checkNotNullParameter(message2, "message");
                u1m.f0 f0Var2 = u1m.f0.VERBOSE;
                call2.clone().enqueue(this);
                return;
            }
            networkConnectionFailedError = new AppError.ServerError(new w1m.c(29, null, null, t2));
        } else if (t2 instanceof SocketTimeoutException) {
            networkConnectionFailedError = new AppError.TimeoutError(new w1m.c(29, null, null, t2));
        } else {
            networkConnectionFailedError = t2 instanceof UnknownHostException ? true : t2 instanceof ConnectException ? new AppError.NetworkConnectionFailedError(new w1m.c(29, null, null, t2)) : t2 instanceof IOException ? new AppError.IoError(new w1m.c(29, null, null, t2)) : new AppError.UnknownError(new w1m.c(29, null, null, t2));
        }
        appErrorA = networkConnectionFailedError;
        if (appErrorA instanceof w1m.a) {
        }
        String message3 = "communication failed. error=" + appErrorA;
        Intrinsics.checkNotNullParameter(message3, "message");
        u1m.f0 f0Var3 = u1m.f0.VERBOSE;
        ((Callback) this.f148942c).onFailure(call, appErrorA);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Callback callback = (Callback) this.f148942c;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            r10.v vVar = (r10.v) this.e;
            callback.onFailure(call, ((i2m.g) vVar.d).a(response, (Retrofit) vVar.f250863b, null));
            return;
        }
        String message = "communication succeeded. url=" + call.request().f281095a;
        Intrinsics.checkNotNullParameter(message, "message");
        u1m.f0 f0Var = u1m.f0.VERBOSE;
        callback.onResponse(call, response);
    }

    public Object r0(String str, Boolean bool, gim.i iVar) throws Throwable {
        ltc.a aVar = (ltc.a) this.f148942c;
        aVar.getClass();
        km2.n nVar = new km2.n(23, aVar, bool, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, nVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public id.l t0() throws GeneralSecurityException {
        Integer num = (Integer) this.f148941b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f148942c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((id.c) this.d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((id.c) this.e) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f148941b));
        }
        Integer num2 = (Integer) this.f148942c;
        int iIntValue = num2.intValue();
        id.c cVar = (id.c) this.d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (cVar == id.c.f160347g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (cVar == id.c.f160348h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (cVar == id.c.i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (cVar == id.c.f160349j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (cVar != id.c.k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new id.l(((Integer) this.f148941b).intValue(), ((Integer) this.f148942c).intValue(), (id.c) this.e, (id.c) this.d);
    }

    public Typeface u0(String url2) throws IOException {
        Intrinsics.checkNotNullParameter(url2, "url");
        g80.c cVar = (g80.c) this.d;
        g80.b bVar = g80.c.Companion;
        String strB = ((g80.a) cVar).b(url2, null);
        zk0.b bVar2 = (zk0.b) this.f148942c;
        File fileM = ((a80.h) bVar2).m(zk0.a.INTERNAL_CACHE, strB);
        if (!fileM.exists()) {
            i1 i1Var = new i1();
            i1Var.e(url2);
            okhttp3.Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) this.f148941b).b(new j1(i1Var)));
            try {
                if (!responseExecute.f226097q) {
                    throw new IllegalStateException("Failed to download font from " + url2 + ": " + responseExecute.d);
                }
                fileM = ((a80.h) bVar2).q(responseExecute.f226090g.byteStream(), strB);
                responseExecute.close();
                if (fileM == null) {
                    throw new IllegalStateException(p.a.p("Font ", url2, " saving is not successful"));
                }
            } finally {
            }
        }
        is0.b.f();
        q2.a.r();
        Typeface.CustomFallbackBuilder customFallbackBuilderG = q2.a.g(q2.a.k(com.google.android.gms.common.stats.a.m(fileM).build()).build());
        q2.a.r();
        q2.a.x();
        Typeface typefaceBuild = customFallbackBuilderG.addCustomFallback(q2.a.k(is0.b.d((Resources) this.e, R$font.inter_variable).build()).build()).build();
        Intrinsics.checkNotNullExpressionValue(typefaceBuild, "build(...)");
        return typefaceBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v0(h2j.h r13, xi0.b r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.v0(h2j.h, xi0.b, gim.c):java.lang.Object");
    }

    public String w0() {
        ywh.a aVar = (ywh.a) this.f148942c;
        aVar.getClass();
        try {
            return WebSettings.getDefaultUserAgent(aVar.f317438a);
        } catch (Throwable th10) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "USER_AGENT", null, th10, h0Var);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x0(j1j.d r10, xi0.b r11, boolean r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.x0(j1j.d, xi0.b, boolean, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y0(java.lang.String r5, gim.c r6) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.q.y0(java.lang.String, gim.c):java.lang.Object");
    }

    public rfm.l z0() {
        twj.f fVar = (twj.f) ((fwj.p) this.f148942c).f138685a;
        fVar.getClass();
        rfm.o oVar = new rfm.o(new twj.b(fVar, 1));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        rfm.w wVarH0 = te0.w.h0(oVar);
        hw3.d dVar = new hw3.d(24, new hwf.b(26));
        int i = 2;
        rfm.f fVar2 = new rfm.f(wVarH0, dVar, i);
        Intrinsics.checkNotNullExpressionValue(fVar2, "filter(...)");
        rfm.x xVarX = ue0.e.x(fVar2);
        ufm.c cVar = new ufm.c(new h4d.d(this, 7), i);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        rfm.l lVarL = xVarX.l(cVar);
        Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
        return lVarL;
    }

    public /* synthetic */ q(Object obj2, xki.c cVar, int i) {
        this.f148940a = i;
        this.f148941b = obj2;
        this.f148942c = cVar;
    }

    public q(r10.v vVar, Call call, Callback callback) {
        this.f148940a = 9;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e = vVar;
        this.f148941b = call;
        this.f148942c = callback;
        this.d = new AtomicInteger(0);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public xki.e mo3783build() {
        switch (this.f148940a) {
            case 1:
                vc.s.h((ViewController) this.d, ViewController.class);
                vc.s.h((MessagesContract$InputData) this.e, MessagesContract$InputData.class);
                return new t((n) this.f148941b, (o) this.f148942c, (ViewController) this.d, (MessagesContract$InputData) this.e);
            case 18:
                vc.s.h((ViewController) this.d, ViewController.class);
                vc.s.h((StoreBrandDetailDiscountScreenContract$InputData) this.e, StoreBrandDetailDiscountScreenContract$InputData.class);
                return new k2e.b((k2e.j) this.f148941b, (k2e.d) this.f148942c, (StoreBrandDetailDiscountScreenContract$InputData) this.e);
            case 19:
                vc.s.h((ViewController) this.d, ViewController.class);
                vc.s.h((StoreBrandDetailEarnScreenContract$InputData) this.e, StoreBrandDetailEarnScreenContract$InputData.class);
                return new k2e.c((k2e.j) this.f148941b, (k2e.d) this.f148942c, (StoreBrandDetailEarnScreenContract$InputData) this.e);
            case 20:
                vc.s.h((ViewController) this.d, ViewController.class);
                vc.s.h((StoreBrandDetailMsiScreenContract$InputData) this.e, StoreBrandDetailMsiScreenContract$InputData.class);
                return new k2e.e((k2e.j) this.f148941b, (k2e.d) this.f148942c, (StoreBrandDetailMsiScreenContract$InputData) this.e);
            default:
                vc.s.h((ViewController) this.d, ViewController.class);
                vc.s.h((StoreBrandDetailRedeemScreenContract$InputData) this.e, StoreBrandDetailRedeemScreenContract$InputData.class);
                return new k2e.f((k2e.j) this.f148941b, (k2e.d) this.f148942c, (StoreBrandDetailRedeemScreenContract$InputData) this.e);
        }
    }

    public q(l30.b chatProvider, os2.g mainThreadIdleRegistry, j30.c chatFeatureToggles, df0.b dateProvider) {
        this.f148940a = 14;
        Intrinsics.checkNotNullParameter(chatProvider, "chatProvider");
        Intrinsics.checkNotNullParameter(mainThreadIdleRegistry, "mainThreadIdleRegistry");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f148941b = chatProvider;
        this.f148942c = mainThreadIdleRegistry;
        this.d = chatFeatureToggles;
        this.e = dateProvider;
    }

    public q(gte.a featureToggleInteractor, eub.a revPointsAvailabilityInteractor, svb.a revPointsGiftcardsFeatureInteractor, jla.h productCatalogueInteractor) {
        this.f148940a = 28;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f148941b = featureToggleInteractor;
        this.f148942c = revPointsAvailabilityInteractor;
        this.d = revPointsGiftcardsFeatureInteractor;
        this.e = productCatalogueInteractor;
    }

    public q(InstructionsService instructionsService, kxc.f instructionsMapper, ne0.d memoryCache) {
        this.f148940a = 27;
        Intrinsics.checkNotNullParameter(instructionsService, "instructionsService");
        Intrinsics.checkNotNullParameter(instructionsMapper, "instructionsMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f148941b = instructionsService;
        this.f148942c = instructionsMapper;
        this.d = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: kxc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f190564b;

            {
                this.f190564b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c it8 = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((InstructionsService) this.f190564b.f148941b).getInstructions(it8.f190555a.name(), it8.f190556b, it8.f190557c);
                    default:
                        c config = (c) obj2;
                        List instructions = (List) obj3;
                        Intrinsics.checkNotNullParameter(config, "config");
                        Intrinsics.checkNotNullParameter(instructions, "instructions");
                        ((ne0.d) this.f190564b.d).f(config.a(), instructions);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.e = new w4l.f(function2, new kxc.g(this, i2), new Function2(this) { // from class: kxc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f190564b;

            {
                this.f190564b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c it8 = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((InstructionsService) this.f190564b.f148941b).getInstructions(it8.f190555a.name(), it8.f190556b, it8.f190557c);
                    default:
                        c config = (c) obj2;
                        List instructions = (List) obj3;
                        Intrinsics.checkNotNullParameter(config, "config");
                        Intrinsics.checkNotNullParameter(instructions, "instructions");
                        ((ne0.d) this.f190564b.d).f(config.a(), instructions);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public q(j4j.f beneficiaryTypeMapper, j4j.h countryFieldMapper, j4j.i currencyFieldMapper, j4j.j expansionFieldMapper, j4j.l recipientDetailsMapper, p4j.a backendFieldsMapper, j4j.c backendFieldsFilteringDelegate) {
        this.f148940a = 15;
        Intrinsics.checkNotNullParameter(beneficiaryTypeMapper, "beneficiaryTypeMapper");
        Intrinsics.checkNotNullParameter(countryFieldMapper, "countryFieldMapper");
        Intrinsics.checkNotNullParameter(currencyFieldMapper, "currencyFieldMapper");
        Intrinsics.checkNotNullParameter(expansionFieldMapper, "expansionFieldMapper");
        Intrinsics.checkNotNullParameter(recipientDetailsMapper, "recipientDetailsMapper");
        Intrinsics.checkNotNullParameter(backendFieldsMapper, "backendFieldsMapper");
        Intrinsics.checkNotNullParameter(backendFieldsFilteringDelegate, "backendFieldsFilteringDelegate");
        this.f148941b = beneficiaryTypeMapper;
        this.f148942c = countryFieldMapper;
        this.d = backendFieldsMapper;
        this.e = backendFieldsFilteringDelegate;
    }

    public q(jx0.a pocketBalancesProvider, kv5.o splitPocketsProvider, jul.o averagePricesProvider, q ratesProvider) {
        this.f148940a = 25;
        Intrinsics.checkNotNullParameter(pocketBalancesProvider, "pocketBalancesProvider");
        Intrinsics.checkNotNullParameter(splitPocketsProvider, "splitPocketsProvider");
        Intrinsics.checkNotNullParameter(averagePricesProvider, "averagePricesProvider");
        Intrinsics.checkNotNullParameter(ratesProvider, "ratesProvider");
        this.f148941b = pocketBalancesProvider;
        this.f148942c = splitPocketsProvider;
        this.d = averagePricesProvider;
        this.e = ratesProvider;
    }

    public q(kdh.b deviceManagementInteractor, ltc.a secondDeviceLoginRepository, skd.i slotManagerInteractor, om4.d0 mainSlotContextProvider) {
        this.f148940a = 12;
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(secondDeviceLoginRepository, "secondDeviceLoginRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainSlotContextProvider, "mainSlotContextProvider");
        this.f148941b = deviceManagementInteractor;
        this.f148942c = secondDeviceLoginRepository;
        this.d = slotManagerInteractor;
        this.e = mainSlotContextProvider;
    }

    public q(z80.b phoneToolsProvider, fwj.p userOnboardingInteractor, qd0.b languageProvider, fk3.a configurationInteractor) {
        this.f148940a = 7;
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f148941b = phoneToolsProvider;
        this.f148942c = userOnboardingInteractor;
        this.d = languageProvider;
        this.e = configurationInteractor;
    }

    public q(CardPaymentsGatewayService cardPaymentsGatewayService, ywh.a defaultUserAgentProvider, ywh.b deviceParamsProvider, fxh.b paymentsResponseMapper) {
        this.f148940a = 6;
        Intrinsics.checkNotNullParameter(cardPaymentsGatewayService, "cardPaymentsGatewayService");
        Intrinsics.checkNotNullParameter(defaultUserAgentProvider, "defaultUserAgentProvider");
        Intrinsics.checkNotNullParameter(deviceParamsProvider, "deviceParamsProvider");
        Intrinsics.checkNotNullParameter(paymentsResponseMapper, "paymentsResponseMapper");
        this.f148941b = cardPaymentsGatewayService;
        this.f148942c = defaultUserAgentProvider;
        this.d = deviceParamsProvider;
        this.e = paymentsResponseMapper;
    }

    public q(BankTransferAmountScreenContract$InputData inputData, ang.f userInteractor, uw1.c apmFeatureChecker, gte.a featureToggleInteractor) {
        this.f148940a = 2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f148941b = inputData;
        this.f148942c = userInteractor;
        this.d = apmFeatureChecker;
        this.e = featureToggleInteractor;
    }

    public q(String accountId, String assetExternalId, k18.c accountsInteractor, g26.b assetDetailsInteractor) {
        this.f148940a = 3;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        this.f148941b = accountId;
        this.f148942c = assetExternalId;
        this.d = accountsInteractor;
        this.e = assetDetailsInteractor;
    }

    public q(mte.a appFailer, CoroutineScope coroutineScope, lte.b featureTogglesRegistry) {
        this.f148940a = 17;
        Intrinsics.checkNotNullParameter(appFailer, "appFailer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(featureTogglesRegistry, "featureTogglesRegistry");
        this.f148941b = appFailer;
        this.f148942c = coroutineScope;
        this.d = featureTogglesRegistry;
        this.e = hlm.j.a(1);
    }

    public q(OkHttpClient okHttpClient, zk0.b fileSystemRepository, g80.c urlHelper, Resources resources) {
        this.f148940a = 8;
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f148941b = okHttpClient;
        this.f148942c = fileSystemRepository;
        this.d = urlHelper;
        this.e = resources;
    }

    public q(mu5.f cryptoInvestmentsInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, ppk.f ratesInteractor, kv5.o splitPocketsProvider) {
        this.f148940a = 26;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(splitPocketsProvider, "splitPocketsProvider");
        this.f148941b = cryptoInvestmentsInteractor;
        this.f148942c = cryptoCommodityBaseCurrencyInteractor;
        this.d = ratesInteractor;
        this.e = splitPocketsProvider;
    }

    public q(DualChooserContract$InputData inputData, m2j.q balancesInternalInteractor, i2j.a dualChooserCountryProfilesDelegateInputData, l61.a userCompanyInteractor, k2j.a currencyPairCompatibilityCheck) {
        this.f148940a = 22;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesInternalInteractor, "balancesInternalInteractor");
        Intrinsics.checkNotNullParameter(dualChooserCountryProfilesDelegateInputData, "dualChooserCountryProfilesDelegateInputData");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(currencyPairCompatibilityCheck, "currencyPairCompatibilityCheck");
        this.f148941b = inputData;
        this.f148942c = balancesInternalInteractor;
        this.d = dualChooserCountryProfilesDelegateInputData;
        this.e = userCompanyInteractor;
    }

    public q(gte.a featureToggleInteractor, wsg.n walletInteractor, i61.b autoTopUpInteractor, u51.a topUpMethodsInteractor) {
        this.f148940a = 23;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(autoTopUpInteractor, "autoTopUpInteractor");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        this.f148941b = featureToggleInteractor;
        this.f148942c = walletInteractor;
        this.d = autoTopUpInteractor;
        this.e = topUpMethodsInteractor;
    }

    public q(ang.f userInteractor, xx9.p recentRecipientInteractor, tx9.f recentTimestampManager, jei.b tilesInteractor, l80.e dateProvider, cl3.a contactsInteractor) {
        this.f148940a = 4;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(recentTimestampManager, "recentTimestampManager");
        Intrinsics.checkNotNullParameter(tilesInteractor, "tilesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f148941b = userInteractor;
        this.f148942c = recentRecipientInteractor;
        this.d = recentTimestampManager;
        this.e = contactsInteractor;
    }

    public q(Push2CardAmountService service, ne0.d memoryCache, rga.c priceQuoteTraceIdHolder) {
        this.f148940a = 16;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f148941b = service;
        this.f148942c = memoryCache;
        this.d = priceQuoteTraceIdHolder;
        final int i = 0;
        final int i2 = 1;
        this.e = new w4l.f(new Function2(this) { // from class: jra.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f177983b;

            {
                this.f177983b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        hra.c params = (hra.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<y> properties = ((Push2CardAmountService) this.f177983b.f148941b).getProperties(params.f154803b, params.f154802a.f306286a);
                        jof.a aVar = new jof.a(19, new e(12));
                        properties.getClass();
                        i iVar = new i(properties, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        hra.c params2 = (hra.c) obj2;
                        hra.a domain = (hra.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ((d) this.f177983b.f148942c).f(params2.a(), domain);
                        return Unit.f186387a;
                }
            }
        }, new jlh.g(this, 14), new Function2(this) { // from class: jra.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f177983b;

            {
                this.f177983b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        hra.c params = (hra.c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<y> properties = ((Push2CardAmountService) this.f177983b.f148941b).getProperties(params.f154803b, params.f154802a.f306286a);
                        jof.a aVar = new jof.a(19, new e(12));
                        properties.getClass();
                        i iVar = new i(properties, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        hra.c params2 = (hra.c) obj2;
                        hra.a domain = (hra.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ((d) this.f177983b.f148942c).f(params2.a(), domain);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public q(int i) {
        this.f148940a = i;
        switch (i) {
            case 10:
                break;
            default:
                this.f148941b = new HashMap();
                this.f148942c = new HashMap();
                this.d = new HashMap();
                this.e = new HashMap();
                break;
        }
    }

    public q(hd.v vVar) {
        this.f148940a = 5;
        this.f148941b = new HashMap(vVar.f151372a);
        this.f148942c = new HashMap(vVar.f151373b);
        this.d = new HashMap(vVar.f151374c);
        this.e = new HashMap(vVar.d);
    }

    public q(u06.c cVar, vxc.i iVar, sse.b bVar) {
        this.f148940a = 11;
        this.f148941b = iVar;
        this.f148942c = bVar;
        this.d = cVar;
        int i = 14;
        this.e = new i72.j(this, 1, i);
        e4m.b.b(new i72.j(this, 0, i));
    }

    public q(Object obj2, p1 styleApplicator, r1 stack, Context context) {
        this.f148940a = 13;
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f148941b = obj2;
        this.f148942c = styleApplicator;
        this.d = stack;
        this.e = context;
    }
}
