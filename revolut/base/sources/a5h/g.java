package a5h;

import a5h.g;
import ael.d0;
import akl.f1;
import akl.n1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LruCache;
import androidx.lifecycle.LifecycleOwner;
import au0.g4;
import au0.x1;
import aw0.t1;
import aw0.v1;
import bjl.p0;
import com.google.gson.reflect.TypeToken;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.javax.inject.Provider;
import com.revolut.core.ui_kit.views.navbar.NavBarNavigationButtonView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.pricingplans.models.PricingPlanNextPlanInfo;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.network.BeneficiarySuggestionsService;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.network.services.SignUpService;
import dfj.k0;
import dfj.s3;
import dp4.a1;
import f5j.l;
import f5j.n;
import f5j.p;
import f5j.q;
import ffk.t;
import g1i.o0;
import g2e.m0;
import gkl.g1;
import gkl.h1;
import gkl.i1;
import gkl.j1;
import gkl.k1;
import gv5.k;
import hha.s;
import hzj.m;
import ix0.f2;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import jkl.u2;
import kg.o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import lbm.j;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import r10.r;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;
import sbb.c0;
import skm.a2;
import skm.e0;
import yjl.v;
import yjl.w;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements g4, xki.d, CallAdapter, nj.a, el.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1407c;
    public Object d;
    public Object e;
    public Object f;

    public static Long b0(a97.c cVar) {
        long jLongValue;
        BigDecimal bigDecimal = cVar.f2367b;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(cp5.d.j(cVar.f2366a));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigInteger bigInteger = bigDecimalMultiply.toBigInteger();
        if (bigInteger.compareTo(BigInteger.ZERO) >= 0) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(Long.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
            while (bigInteger.compareTo(bigIntegerValueOf) > 0) {
                bigInteger = bigInteger.divide(BigInteger.TEN);
            }
            jLongValue = bigInteger.longValue();
        } else {
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(Long.MIN_VALUE);
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf2, "valueOf(...)");
            while (bigInteger.compareTo(bigIntegerValueOf2) < 0) {
                bigInteger = bigInteger.divide(BigInteger.TEN);
            }
            jLongValue = bigInteger.longValue();
        }
        return Long.valueOf(Math.abs(jLongValue));
    }

    public static final k1 d(g gVar, Response response) throws Throwable {
        if (!response.isSuccessful()) {
            return new i1(((w) ((v) gVar.f1407c)).a(response));
        }
        int iCode = response.code();
        if (iCode == 200) {
            Lazy lazy = ikl.a.f161999a;
            Object objBody = response.body();
            if (objBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            o oVarA = ikl.a.a();
            Type type = new TypeToken<u2>() { // from class: com.revolut.sso.impl.data.repositories.SignUpRepositoryImpl$processResponse$$inlined$fromJson$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objD = oVarA.d((String) objBody, type);
            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
            u2 u2Var = (u2) objD;
            gVar.D0(new mkl.b(u2Var.getSessionToken()));
            return new j1(new SessionToken(u2Var.getSessionToken()));
        }
        if (iCode != 202) {
            Throwable thInitCause = new HttpException(response).initCause(new IllegalStateException(a0.d.n("Unexpected sign up response code: ", iCode)));
            Intrinsics.checkNotNullExpressionValue(thInitCause, "initCause(...)");
            throw thInitCause;
        }
        Lazy lazy2 = ikl.a.f161999a;
        Object objBody2 = response.body();
        if (objBody2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        o oVarA2 = ikl.a.a();
        Type type2 = new TypeToken<jkl.h>() { // from class: com.revolut.sso.impl.data.repositories.SignUpRepositoryImpl$processResponse$$inlined$fromJson$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        Object objD2 = oVarA2.d((String) objBody2, type2);
        Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
        jkl.h hVar = (jkl.h) objD2;
        if (hVar instanceof jkl.a) {
            jkl.a aVar = (jkl.a) hVar;
            gVar.D0(new mkl.b(aVar.getSessionToken()));
            return new g1(yjl.h.c(aVar.getClaimRequired()));
        }
        if (hVar instanceof jkl.c) {
            jkl.c cVar = (jkl.c) hVar;
            if (cVar.getSessionToken() != null) {
                gVar.D0(new mkl.b(cVar.getSessionToken()));
            }
            return new h1(yjl.f.a(cVar.getChallenge()), yjl.d.b(cVar.getAvailableMethods()));
        }
        if (!(hVar instanceof jkl.d) && !(hVar instanceof jkl.f) && !(hVar instanceof jkl.e) && !(hVar instanceof jkl.g)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable thInitCause2 = new HttpException(response).initCause(new IllegalStateException(a0.d.n("Unexpected sign up response code: ", iCode)));
        Intrinsics.checkNotNullExpressionValue(thInitCause2, "initCause(...)");
        throw thInitCause2;
    }

    public static xi0.b u0(xi0.b bVar, xi0.b bVar2) {
        if (!Intrinsics.f(bVar, bVar2)) {
            return bVar;
        }
        xi0.b.Companion.getClass();
        xi0.b bVar3 = xi0.b.i;
        return Intrinsics.f(bVar, bVar3) ? xi0.b.f306272g : bVar3;
    }

    public Object A0(c0 c0Var) {
        hha.d dVarD;
        vjg.g gVar = (vjg.g) this.e;
        GlobalThemeDeclaration globalThemeDeclaration = ((ekg.g) this.f1406b).j().f94561a;
        if (globalThemeDeclaration.getD() != vjg.e.PLAN) {
            globalThemeDeclaration = null;
        }
        if (globalThemeDeclaration != null && (dVarD = ((t) this.f).d()) != null && !vc.o.h(s.f(dVarD)).contains(globalThemeDeclaration.getF94454a())) {
            GlobalThemeDeclaration globalThemeDeclarationA = gVar.a(vc.o.e(s.f(dVarD)));
            if (globalThemeDeclarationA == null) {
                globalThemeDeclarationA = ((gwl.d) gVar).e();
            }
            Object objK0 = K0(globalThemeDeclaration, globalThemeDeclarationA, c0Var);
            return objK0 == fim.a.COROUTINE_SUSPENDED ? objK0 : Unit.f186387a;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable B(a97.d r11, xi0.b r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.B(a97.d, xi0.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
    
        if (skm.e0.G(r2, r3) == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(java.lang.String r20, zm3.a r21, gim.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.B0(java.lang.String, zm3.a, gim.c):java.lang.Object");
    }

    public void C0(ff.b bVar) {
        this.e = bVar;
    }

    public void D0(mkl.d dVar) {
        this.f = dVar;
        if (dVar instanceof mkl.b) {
            ((n1) ((f1) this.d)).i(new SessionToken(((mkl.b) dVar).f206501a));
        } else if (!(dVar instanceof mkl.a) && !(dVar instanceof mkl.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable E(a97.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d3i.q
            if (r0 == 0) goto L13
            r0 = r6
            d3i.q r0 = (d3i.q) r0
            int r1 = r0.f111191x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111191x = r1
            goto L18
        L13:
            d3i.q r0 = new d3i.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111191x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a97.d r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f1406b
            wsg.n r6 = (wsg.n) r6
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r6 = r6.x(r2)
            r0.u = r5
            r0.f111191x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            xi0.b r6 = (xi0.b) r6
            a97.c r0 = r5.f2368a
            a97.c r5 = r5.f2369b
            if (r0 == 0) goto L67
            if (r5 == 0) goto L67
            java.math.BigDecimal r6 = r0.f2367b
            if (r6 != 0) goto L61
            java.math.BigDecimal r6 = r5.f2367b
            if (r6 == 0) goto L61
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r5, r0)
            return r6
        L61:
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r0, r5)
            return r6
        L67:
            if (r0 != 0) goto L6a
            r0 = r5
        L6a:
            if (r0 == 0) goto L81
            kotlin.jvm.internal.Intrinsics.h(r6)
            xi0.b r5 = r0.f2366a
            xi0.b r5 = u0(r6, r5)
            a97.c r6 = new a97.c
            r1 = 0
            r6.<init>(r1, r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r6)
            return r5
        L81:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.E(a97.d, gim.c):java.io.Serializable");
    }

    public void E0(String str) {
        this.f = str;
    }

    public void F0(d7.b bVar) {
    }

    public void G0(String str) {
        this.f1407c = str;
    }

    public void H0(String str) {
        this.d = str;
    }

    public void I0(ff.d dVar) {
        this.f = dVar;
    }

    public Object J(PricingPlanSubscription pricingPlanSubscription, gim.i iVar) {
        vjg.g gVar = (vjg.g) this.e;
        ekg.g gVar2 = (ekg.g) this.f1406b;
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = pricingPlanSubscription.f81134j;
        hha.d dVar = pricingPlanSubscription.f81129a;
        if (pricingPlanNextPlanInfo != null && !Intrinsics.f(dVar.f152287a, pricingPlanNextPlanInfo.f81118a)) {
            return Unit.f186387a;
        }
        GlobalThemeDeclaration globalThemeDeclaration = gVar2.j().f94561a;
        boolean z = globalThemeDeclaration.getD() == vjg.e.PLAN;
        if (!globalThemeDeclaration.getD() && !z) {
            return Unit.f186387a;
        }
        GlobalThemeDeclaration globalThemeDeclarationA = gVar.a(vc.o.e(s.f(dVar)));
        if (globalThemeDeclarationA != null) {
            Object objK0 = K0(globalThemeDeclaration, globalThemeDeclarationA, iVar);
            return objK0 == fim.a.COROUTINE_SUSPENDED ? objK0 : Unit.f186387a;
        }
        Object objN = gVar2.n(((gwl.d) gVar).e(), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objN != aVar) {
            objN = Unit.f186387a;
        }
        return objN == aVar ? objN : Unit.f186387a;
    }

    public void J0(String str) {
        this.f1406b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K0(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cok.a
            if (r0 == 0) goto L13
            r0 = r8
            cok.a r0 = (cok.a) r0
            int r1 = r0.f25570y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25570y = r1
            goto L18
        L13:
            cok.a r0 = new cok.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f25568w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25570y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r0.v
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r6 = r0.u
            yhm.o.b(r8)
            goto L4e
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r5.f1406b
            ekg.g r8 = (ekg.g) r8
            r0.u = r6
            r0.v = r7
            r0.f25570y = r4
            java.lang.Object r8 = r8.n(r7, r0)
            if (r8 != r1) goto L4e
            goto L69
        L4e:
            java.lang.Object r8 = r5.f1407c
            bn2.p r8 = (bn2.p) r8
            boolean r8 = r8.d(r6)
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r5.d
            bn2.s r8 = (bn2.s) r8
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f25570y = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.K0(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, gim.c):java.lang.Object");
    }

    public String L0(q params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof n) {
            n nVar = (n) params;
            return "ExistingBeneficiary(beneficiaryId=[" + nVar.f132355a + "], context=[" + nVar.f132356b + "])";
        }
        if (!(params instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) params;
        String str = pVar.f132357a;
        String str2 = pVar.f132358b;
        TreeMap treeMapE = q0.e(pVar.f132359c);
        l lVar = pVar.e;
        StringBuilder sbM = v0.a.m("NewBeneficiary(bankCountry=[", str, "], currency=[", str2, "], fields=[");
        sbM.append(treeMapE);
        sbM.append("], context=[");
        sbM.append(lVar);
        sbM.append("])");
        return sbM.toString();
    }

    public ff.a M() {
        return new ff.a((String) this.f1406b, (String) this.f1407c, (String) this.d, (ff.b) this.e, (ff.d) this.f);
    }

    public void O(Function2 onValue, List flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(onValue, "onValue");
        f2 f2Var = (f2) this.f;
        f2Var.a();
        int i = 0;
        for (Object obj2 : flows) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            onValue.invoke(Integer.valueOf(i), ((StateFlow) obj2).getValue());
            i = i2;
        }
        this.f1407c = flows;
        this.d = onValue;
        if (f2Var.f169236c) {
            z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(a97.d r26, gim.c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.S(a97.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(d3i.c r19, a97.d r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.V(d3i.c, a97.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(a97.d r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof d3i.t
            if (r0 == 0) goto L13
            r0 = r11
            d3i.t r0 = (d3i.t) r0
            int r1 = r0.f111200y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111200y = r1
            goto L18
        L13:
            d3i.t r0 = new d3i.t
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f111198w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111200y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            a97.c r10 = r0.v
            a97.c r0 = r0.u
            yhm.o.b(r11)
            goto L88
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            a97.c r10 = r0.v
            a97.c r2 = r0.u
            yhm.o.b(r11)
            goto L6e
        L41:
            yhm.o.b(r11)
            goto L51
        L45:
            yhm.o.b(r11)
            r0.f111200y = r5
            java.io.Serializable r11 = r9.E(r10, r0)
            if (r11 != r1) goto L51
            goto L86
        L51:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r10 = r11.f186385a
            a97.c r10 = (a97.c) r10
            java.lang.Object r11 = r11.f186386b
            a97.c r11 = (a97.c) r11
            xi0.b r2 = r10.f2366a
            r0.u = r10
            r0.v = r11
            r0.f111200y = r4
            java.lang.Object r2 = r9.j0(r2, r0)
            if (r2 != r1) goto L6a
            goto L86
        L6a:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L6e:
            java.util.Set r11 = (java.util.Set) r11
            xi0.b r4 = r10.f2366a
            boolean r11 = r11.contains(r4)
            if (r11 == 0) goto L96
            xi0.b r11 = r10.f2366a
            r0.u = r2
            r0.v = r10
            r0.f111200y = r3
            java.lang.Object r11 = r9.j0(r11, r0)
            if (r11 != r1) goto L87
        L86:
            return r1
        L87:
            r0 = r2
        L88:
            java.util.Set r11 = (java.util.Set) r11
            xi0.b r1 = r0.f2366a
            boolean r11 = r11.contains(r1)
            if (r11 != 0) goto L94
            r2 = r0
            goto L96
        L94:
            r5 = 0
            goto L97
        L96:
            r0 = r2
        L97:
            r11 = 0
            if (r5 == 0) goto Laa
            d3i.b r1 = new d3i.b
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r1.<init>(r0, r10, r2, r11)
            return r1
        Laa:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.W(a97.d, gim.c):java.lang.Object");
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a0(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ae8.e
            if (r0 == 0) goto L13
            r0 = r7
            ae8.e r0 = (ae8.e) r0
            int r1 = r0.f3507w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3507w = r1
            goto L18
        L13:
            ae8.e r0 = new ae8.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3507w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L5a
        L36:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.e
            fe8.a r7 = (fe8.a) r7
            fe8.i r7 = (fe8.i) r7
            r7.getClass()
            java.lang.String r2 = "invitationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.junior_coparent.impl.services.JuniorCoparentService r7 = r7.f134469a
            efm.b r6 = r7.declineInvitation(r6)
            pfm.r r6 = te0.w.g0(r6)
            r0.f3507w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5a
            goto L6e
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r0.f3507w = r3
            ae8.g r7 = new ae8.g
            r2 = 1
            r3 = 0
            r7.<init>(r5, r3, r2)
            java.lang.Object r7 = skm.e0.G(r7, r0)
            if (r7 != r1) goto L6c
            r6 = r7
        L6c:
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.a0(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        CallAdapter callAdapter = (CallAdapter) this.f1406b;
        Intrinsics.checkNotNullParameter(call, "call");
        ulm.j1 j1VarRequest = call.request();
        String str = j1VarRequest.f281095a.d;
        List list = (List) this.f1407c;
        if (!list.isEmpty()) {
            List<Pair> list2 = (List) ((Lazy) this.f).getValue();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Pair pair : list2) {
                    String str2 = (String) pair.f186385a;
                    String str3 = (String) pair.f186386b;
                    if (Intrinsics.f(str, str2) || a0.y(str, str3, false)) {
                        return callAdapter.adapt(new qbm.c(call, (j) ((Function1) this.e).invoke(j1VarRequest), new akl.p((Function1) this.d, 9)));
                    }
                }
            }
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "RevolutCircuitBreakerCallAdapterFactory", "Domain is not allowed. host:" + str + ". domains:" + list, null, h0Var);
        return callAdapter.adapt(call);
    }

    @Override // au0.g4
    public void b(v1 colorScheme) {
        switch (this.f1405a) {
            case 3:
                Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
                if (((v1) this.f) != colorScheme) {
                    this.f = colorScheme;
                    Context context = ((x1) this.d).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    this.e = new gs0.c(context, colorScheme);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
                Context cVar = (Context) this.f1407c;
                Context[] contextArr = (Context[]) this.d;
                if (contextArr == null) {
                    contextArr = new Context[v1.b().size()];
                    this.d = contextArr;
                }
                int iOrdinal = colorScheme.ordinal();
                Context context2 = contextArr[iOrdinal];
                if (context2 == null) {
                    v1 v1VarA = (v1) this.e;
                    if (v1VarA == null) {
                        v1.Companion.getClass();
                        v1VarA = t1.a(cVar);
                        this.e = v1VarA;
                    }
                    if (v1VarA != colorScheme) {
                        cVar = new gs0.c(cVar, colorScheme);
                    }
                    contextArr[iOrdinal] = cVar;
                    context2 = cVar;
                }
                if (context2 != ((Context) this.f)) {
                    this.f = context2;
                    ((qp0.a) ((View) this.f1406b)).x();
                    break;
                }
                break;
        }
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f1407c, ViewController.class);
        vc.s.h((String) this.d, String.class);
        vc.s.h((Boolean) this.f, Boolean.class);
        return new jyc.f((jyc.h) this.f1406b, (String) this.d, (IncomeSource) this.e, (Boolean) this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ae8.d
            if (r0 == 0) goto L13
            r0 = r9
            ae8.d r0 = (ae8.d) r0
            int r1 = r0.f3506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3506x = r1
            goto L18
        L13:
            ae8.d r0 = new ae8.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3506x
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r8 = r0.u
            yhm.o.b(r9)
            return r8
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L58
        L3a:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.e
            fe8.a r9 = (fe8.a) r9
            r0.f3506x = r5
            fe8.i r9 = (fe8.i) r9
            r9.getClass()
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            fe8.e r5 = new fe8.e
            r5.<init>(r9, r8, r6, r3)
            java.lang.Object r9 = skm.e0.J(r2, r5, r0)
            if (r9 != r1) goto L58
            goto L6f
        L58:
            r8 = r9
            com.revolut.feature.junior_coparent.api.models.InvitationAcceptanceResponse r8 = (com.revolut.feature.junior_coparent.api.models.InvitationAcceptanceResponse) r8
            r0.u = r9
            r0.f3506x = r4
            ae8.g r8 = new ae8.g
            r8.<init>(r7, r6, r3)
            java.lang.Object r8 = skm.e0.G(r8, r0)
            if (r8 != r1) goto L6b
            goto L6d
        L6b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L6d:
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.c(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // nj.a
    public boolean contains(String str) {
        Lock lock = (Lock) this.f1406b;
        lock.lock();
        try {
            return ((com.bumptech.glide.g) this.d).f26094a.containsKey(str);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f1405a) {
            case 28:
                return new nl.p((DocumentConfigurationManager) ((Provider) this.f1406b).get(), (pl.j) ((jx0.a) this.f1407c).get(), (Navigator) ((Provider) this.d).get(), (sl.d) ((prl.e) this.e).get(), (OnfidoRemoteConfig) ((il.a) this.f).get());
            default:
                return new ol.l((Navigator) ((Provider) this.f1406b).get(), (sl.f) ((Provider) this.f1407c).get(), (String) ((il.e) this.d).get(), (ol.f) ((r) this.e).get(), (OnfidoAnalytics) ((il.d) this.f).get());
        }
    }

    @Override // nj.a
    public Map getAll() {
        Lock lock = (Lock) this.f1406b;
        lock.lock();
        try {
            Map map = ((com.bumptech.glide.g) this.d).f26094a;
            HashMap map2 = new HashMap(map.size());
            for (String str : map.keySet()) {
                Object hashSet = map.get(str);
                ((ie.a) this.f).getClass();
                if (hashSet instanceof Set) {
                    hashSet = new HashSet((Set) hashSet);
                }
                map2.put(str, hashSet);
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            lock.unlock();
            return mapUnmodifiableMap;
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }

    @Override // au0.g4
    public void i(float f) {
        int iD = io0.a.d(f, kli.a.s(R$attr.uikit_colorElevatedPopoverBackground, (Context) this.e));
        ((NavBarNavigationButtonView) this.f1406b).setBackgroundColor(iD);
        com.revolut.core.ui_kit.internal.views.navbar.d dVar = (com.revolut.core.ui_kit.internal.views.navbar.d) this.f1407c;
        dVar.e(dVar.f, dVar.d, iD);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j0(xi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d3i.u
            if (r0 == 0) goto L13
            r0 = r7
            d3i.u r0 = (d3i.u) r0
            int r1 = r0.f111201w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111201w = r1
            goto L18
        L13:
            d3i.u r0 = new d3i.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111201w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f1407c
            x0i.f r7 = (x0i.f) r7
            wd6.c r2 = wd6.c.ALL
            zhm.h0 r4 = zhm.h0.f322473a
            ufm.i r6 = r7.b(r6, r2, r4)
            r0.f111201w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.j0(xi0.b, gim.c):java.lang.Object");
    }

    @Override // nj.a
    public Object k(Object obj2, String str) {
        Lock lock = (Lock) this.f1406b;
        lock.lock();
        try {
            Object hashSet = ((com.bumptech.glide.g) this.d).f26094a.get(str);
            if (hashSet == null) {
                return obj2;
            }
            ((ie.a) this.f).getClass();
            if (hashSet instanceof Set) {
                hashSet = new HashSet((Set) hashSet);
            }
            return hashSet;
        } finally {
            lock.unlock();
        }
    }

    public String k0(String str) {
        LruCache lruCache = (LruCache) this.e;
        String str2 = (String) lruCache.get(str);
        if (str2 != null) {
            return str2;
        }
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) this.f1406b, str);
        Intrinsics.h(bestDateTimePattern);
        lruCache.put(str, bestDateTimePattern);
        return bestDateTimePattern;
    }

    public Context m0() {
        return (Context) this.f;
    }

    @Override // au0.g4
    public void q(boolean z) {
        ((com.revolut.core.ui_kit.internal.views.navbar.d) this.f1407c).d(z);
        ((NavBarNavigationButtonView) this.f1406b).setReflectiveOuterBorderEnabled$ui_kit_components_release(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable r0(xi0.b r5, xi0.b r6, xi0.b r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof d3i.v
            if (r0 == 0) goto L13
            r0 = r8
            d3i.v r0 = (d3i.v) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            d3i.v r0 = new d3i.v
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f111203x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xi0.b r7 = r0.f111202w
            xi0.b r6 = r0.v
            xi0.b r5 = r0.u
            yhm.o.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            r0.u = r5
            r0.v = r6
            r0.f111202w = r7
            r0.z = r3
            java.lang.Object r8 = r4.j0(r5, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.util.Set r8 = (java.util.Set) r8
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto L50
            return r6
        L50:
            xi0.b r5 = u0(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.r0(xi0.b, xi0.b, xi0.b, gim.c):java.io.Serializable");
    }

    @Override // au0.g4
    public void reset() {
        ((com.revolut.core.ui_kit.internal.views.navbar.d) this.f1407c).e = null;
        ((NavBarNavigationButtonView) this.f1406b).setBackgroundColor(0);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        Type typeResponseType = ((CallAdapter) this.f1406b).responseType();
        Intrinsics.checkNotNullExpressionValue(typeResponseType, "responseType(...)");
        return typeResponseType;
    }

    public DateTimeFormatter s0(int i) {
        DateTimeFormatter dateTimeFormatterWithLocale;
        Locale locale = (Locale) this.f1406b;
        DateTimeFormatter[] dateTimeFormatterArr = (DateTimeFormatter[]) this.d;
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr[i];
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        if (i == 0) {
            dateTimeFormatterWithLocale = DateTimeFormat.fullDate().withLocale(locale);
        } else if (i == 1) {
            dateTimeFormatterWithLocale = DateTimeFormat.longDate().withLocale(locale);
        } else if (i == 2) {
            dateTimeFormatterWithLocale = DateTimeFormat.mediumDate().withLocale(locale);
        } else if (i == 3) {
            dateTimeFormatterWithLocale = DateTimeFormat.shortDate().withLocale(locale);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException();
            }
            dateTimeFormatterWithLocale = DateTimeFormat.shortTime().withLocale(locale);
        }
        dateTimeFormatterArr[i] = dateTimeFormatterWithLocale;
        Intrinsics.h(dateTimeFormatterWithLocale);
        return dateTimeFormatterWithLocale;
    }

    public DateTimeFormatter t0(String skeleton) {
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) ((LruCache) this.f).get(skeleton);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(k0(skeleton));
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterForPattern, "forPattern(...)");
        return dateTimeFormatterForPattern;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public efm.d0 v0(czj.d r13, com.revolut.core.model.account.AccountId r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.v0(czj.d, com.revolut.core.model.account.AccountId):efm.d0");
    }

    public SimpleDateFormat w0(int i) {
        SimpleDateFormat simpleDateFormat;
        Locale locale = (Locale) this.f1406b;
        SimpleDateFormat[] simpleDateFormatArr = (SimpleDateFormat[]) this.f1407c;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormatArr[i];
        if (simpleDateFormat2 != null) {
            return simpleDateFormat2;
        }
        switch (i) {
            case 0:
                simpleDateFormat = new SimpleDateFormat("LLLL", locale);
                break;
            case 1:
                simpleDateFormat = new SimpleDateFormat("MMM", locale);
                break;
            case 2:
                simpleDateFormat = new SimpleDateFormat("E", locale);
                break;
            case 3:
                simpleDateFormat = new SimpleDateFormat(k0("MMMMy"), locale);
                break;
            case 4:
                simpleDateFormat = new SimpleDateFormat(k0("MMMy"), locale);
                break;
            case 5:
                simpleDateFormat = new SimpleDateFormat("''yy", locale);
                break;
            case 6:
                simpleDateFormat = new SimpleDateFormat("MMM ''yy", locale);
                break;
            case 7:
                simpleDateFormat = new SimpleDateFormat("MMMM ''yy", locale);
                break;
            case 8:
                simpleDateFormat = new SimpleDateFormat("d MMM", locale);
                break;
            case 9:
                simpleDateFormat = new SimpleDateFormat(new Regex("y+").i(k0("MMMyy"), "''yy"), locale);
                break;
            default:
                throw new IllegalArgumentException();
        }
        simpleDateFormatArr[i] = simpleDateFormat;
        return simpleDateFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x0(xi0.b r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof d3i.w
            if (r0 == 0) goto L13
            r0 = r12
            d3i.w r0 = (d3i.w) r0
            int r1 = r0.f111205w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111205w = r1
            goto L18
        L13:
            d3i.w r0 = new d3i.w
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111205w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L27
            goto L4f
        L27:
            r0 = move-exception
            r11 = r0
            goto L54
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r12)
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            java.lang.Object r12 = r10.f1406b     // Catch: java.lang.Throwable -> L27
            r4 = r12
            wsg.n r4 = (wsg.n) r4     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            r5 = r11
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            r0.f111205w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r12 = nim.a.b(r11, r0)     // Catch: java.lang.Throwable -> L27
            if (r12 != r1) goto L4f
            return r1
        L4f:
            io3.d r12 = (io3.d) r12     // Catch: java.lang.Throwable -> L27
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L5a
        L54:
            yhm.m$a r12 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r11)
        L5a:
            java.lang.Throwable r11 = yhm.m.a(r12)
            if (r11 == 0) goto L66
            boolean r0 = r11 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L65
            goto L66
        L65:
            throw r11
        L66:
            boolean r11 = r12 instanceof yhm.n
            r11 = r11 ^ r3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.x0(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y0(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof d3i.x
            if (r0 == 0) goto L13
            r0 = r5
            d3i.x r0 = (d3i.x) r0
            int r1 = r0.f111206w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111206w = r1
            goto L18
        L13:
            d3i.x r0 = new d3i.x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111206w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.d
            s99.i r5 = (s99.i) r5
            r0.f111206w = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r5 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r5
            boolean r0 = r5 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r0 == 0) goto L47
            r3 = 0
            goto L4b
        L47:
            boolean r5 = r5 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch
            if (r5 == 0) goto L50
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L50:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.y0(gim.c):java.lang.Object");
    }

    public void z0() {
        Function2 function2;
        a2 a2Var = (a2) this.f1406b;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f1406b = null;
        CoroutineScope coroutineScope = (CoroutineScope) this.e;
        if (coroutineScope == null || (function2 = (Function2) this.d) == null || ((List) this.f1407c).isEmpty()) {
            return;
        }
        this.f1406b = e0.C(coroutineScope, null, null, new im9.h(this, function2, continuation, 22), 3);
    }

    public /* synthetic */ g(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f1405a = i;
        this.f1406b = obj2;
        this.f1407c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(iv.a r4, iv.b r5, fn2.c r6) {
        /*
            r3 = this;
            r0 = 13
            r3.f1405a = r0
            java.lang.String r0 = "faceQualityCollectionStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "frameAnalysisCollectionStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "modelsVersionsCollectionStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r3.<init>()
            r3.f1406b = r4
            r3.f1407c = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.d = r4
            java.lang.Object r4 = r6.f136517b
            xv.h r4 = (xv.h) r4
            xv.g r5 = r4.c()
            boolean r6 = r5 instanceof xv.f
            r0 = 0
            if (r6 == 0) goto L33
            xv.f r5 = (xv.f) r5
            java.lang.String r5 = r5.f309126a
            goto L34
        L33:
            r5 = r0
        L34:
            if (r5 == 0) goto L6b
            java.util.Set r4 = r4.b()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L45:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof r00.a
            if (r2 == 0) goto L45
            r6.add(r1)
            goto L45
        L57:
            java.lang.Object r4 = zhm.d0.d0(r6)
            r00.a r4 = (r00.a) r4
            if (r4 == 0) goto L62
            java.lang.String r4 = r4.f250672a
            goto L63
        L62:
            r4 = r0
        L63:
            if (r4 == 0) goto L6b
            gv.o r6 = new gv.o
            r6.<init>(r5, r4)
            goto L6c
        L6b:
            r6 = r0
        L6c:
            r3.e = r6
            gv.q r4 = new gv.q
            java.lang.Object r5 = r3.d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.<init>(r0, r5, r6)
            r3.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5h.g.<init>(iv.a, iv.b, fn2.c):void");
    }

    public g(rz7.j nameFieldPresentationModel, rz7.h genderFieldPresentationModel, rz7.d breedFieldPresentationModel, rz7.f dobFieldPresentationModel, rz7.b amountFieldPresentationModel) {
        this.f1405a = 24;
        Intrinsics.checkNotNullParameter(nameFieldPresentationModel, "nameFieldPresentationModel");
        Intrinsics.checkNotNullParameter(genderFieldPresentationModel, "genderFieldPresentationModel");
        Intrinsics.checkNotNullParameter(breedFieldPresentationModel, "breedFieldPresentationModel");
        Intrinsics.checkNotNullParameter(dobFieldPresentationModel, "dobFieldPresentationModel");
        Intrinsics.checkNotNullParameter(amountFieldPresentationModel, "amountFieldPresentationModel");
        this.f1406b = nameFieldPresentationModel;
        this.f1407c = genderFieldPresentationModel;
        this.d = breedFieldPresentationModel;
        this.e = dobFieldPresentationModel;
        this.f = amountFieldPresentationModel;
    }

    public g(b5h.b ratingsWidgetDialogProvider, d0 stocksInteractor, ybl.b instrumentTickerInteractor, c4h.c stockOnboardingInteractor, u4h.b fitchRatingMapper) {
        this.f1405a = 0;
        Intrinsics.checkNotNullParameter(ratingsWidgetDialogProvider, "ratingsWidgetDialogProvider");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(fitchRatingMapper, "fitchRatingMapper");
        this.f1406b = ratingsWidgetDialogProvider;
        this.f1407c = stocksInteractor;
        this.d = instrumentTickerInteractor;
        this.e = stockOnboardingInteractor;
        this.f = fitchRatingMapper;
    }

    public g(View dynamicContextView) {
        this.f1405a = 11;
        Intrinsics.checkNotNullParameter(dynamicContextView, "dynamicContextView");
        this.f1406b = dynamicContextView;
        Context context = dynamicContextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f1407c = context;
        Context context2 = dynamicContextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f = context2;
    }

    public g(f4h.a airTipInteractor, gte.a featureToggleInteractor, ix5.b mapperProvider, os2.g viewableRecordItemCollectorFactory, ix5.b adsTrackingInteractorProvider) {
        this.f1405a = 21;
        Intrinsics.checkNotNullParameter(airTipInteractor, "airTipInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollectorFactory, "viewableRecordItemCollectorFactory");
        Intrinsics.checkNotNullParameter(adsTrackingInteractorProvider, "adsTrackingInteractorProvider");
        this.f1406b = airTipInteractor;
        this.f1407c = featureToggleInteractor;
        this.d = mapperProvider;
        this.e = viewableRecordItemCollectorFactory;
        this.f = adsTrackingInteractorProvider;
    }

    public g(BeneficiarySuggestionsService beneficiarySuggestionsService, ne0.j memoryCache, ue0.c storage, g3j.a beneficiarySuggestionsCacheKeyMapper) {
        this.f1405a = 10;
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsService, "beneficiarySuggestionsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsCacheKeyMapper, "beneficiarySuggestionsCacheKeyMapper");
        this.f1406b = beneficiarySuggestionsService;
        this.f1407c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new frk.a(this, continuation, 20), new Function1(this) { // from class: g3j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140296b;

            {
                this.f140296b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        p params = (p) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f140296b;
                        return (List) ((ne0.j) gVar.f1407c).get(gVar.L0(params));
                    default:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar2 = this.f140296b;
                        return (List) ((ne0.j) gVar2.f1407c).get(gVar2.L0(params2));
                }
            }
        }, new Function2(this) { // from class: g3j.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140298b;

            {
                this.f140298b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        p params = (p) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        g gVar = this.f140298b;
                        ((ne0.j) gVar.f1407c).f(gVar.L0(params), data);
                        break;
                    default:
                        n params2 = (n) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        g gVar2 = this.f140298b;
                        ((ne0.j) gVar2.f1407c).f(gVar2.L0(params2), data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g3j.d(this, continuation, 1), new m0(this, continuation, 4));
        final int i2 = 1;
        this.f = new x4l.c(new frk.a(this, continuation, 19), new Function1(this) { // from class: g3j.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140296b;

            {
                this.f140296b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        p params = (p) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        g gVar = this.f140296b;
                        return (List) ((ne0.j) gVar.f1407c).get(gVar.L0(params));
                    default:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        g gVar2 = this.f140296b;
                        return (List) ((ne0.j) gVar2.f1407c).get(gVar2.L0(params2));
                }
            }
        }, new Function2(this) { // from class: g3j.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f140298b;

            {
                this.f140298b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        p params = (p) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        g gVar = this.f140298b;
                        ((ne0.j) gVar.f1407c).f(gVar.L0(params), data);
                        break;
                    default:
                        n params2 = (n) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        g gVar2 = this.f140298b;
                        ((ne0.j) gVar2.f1407c).f(gVar2.L0(params2), data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g3j.d(this, continuation, 0), new m0(this, continuation, 3));
    }

    public g(k investmentsWidgetItemsListModifier, jv5.g itemsMapper, ut5.c cryptoStatsDataProvider, ut5.h pocketsDataProvider, kv5.c pocketUiDataToInvestItemMapper) {
        this.f1405a = 15;
        Intrinsics.checkNotNullParameter(investmentsWidgetItemsListModifier, "investmentsWidgetItemsListModifier");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(cryptoStatsDataProvider, "cryptoStatsDataProvider");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(pocketUiDataToInvestItemMapper, "pocketUiDataToInvestItemMapper");
        this.f1406b = investmentsWidgetItemsListModifier;
        this.f1407c = itemsMapper;
        this.d = cryptoStatsDataProvider;
        this.e = pocketsDataProvider;
        this.f = pocketUiDataToInvestItemMapper;
    }

    public g(NavBarNavigationButtonView navigationButton, com.revolut.core.ui_kit.internal.views.navbar.d navBarMenu, x1 navBarView) {
        this.f1405a = 3;
        Intrinsics.checkNotNullParameter(navigationButton, "navigationButton");
        Intrinsics.checkNotNullParameter(navBarMenu, "navBarMenu");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        this.f1406b = navigationButton;
        this.f1407c = navBarMenu;
        this.d = navBarView;
        Context context = navBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.e = context;
    }

    public g(dw.j backUpImagesProvider, Executor executor, bw.f converterAnalyzer, LifecycleOwner lifecycleOwner) {
        this.f1405a = 4;
        Intrinsics.checkNotNullParameter(backUpImagesProvider, "backUpImagesProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(converterAnalyzer, "converterAnalyzer");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f1406b = backUpImagesProvider;
        this.f1407c = executor;
        this.d = converterAnalyzer;
        this.e = lifecycleOwner;
    }

    public g(ekg.g uiPersonalisationInteractor, bn2.p backgroundsInteractor, bn2.s backgroundsMigrator, vjg.g themeCatalog, t pricingPlanInteractor) {
        this.f1405a = 6;
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(backgroundsMigrator, "backgroundsMigrator");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f1406b = uiPersonalisationInteractor;
        this.f1407c = backgroundsInteractor;
        this.d = backgroundsMigrator;
        this.e = themeCatalog;
        this.f = pricingPlanInteractor;
    }

    public g(t pricingPlanInteractor, ffk.j pricingPlanLimitsInteractor, mt8.d kycInteractor, m promptModelMapper, l61.a userCompanyInteractor) {
        this.f1405a = 26;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(promptModelMapper, "promptModelMapper");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f1406b = pricingPlanInteractor;
        this.f1407c = pricingPlanLimitsInteractor;
        this.d = kycInteractor;
        this.e = promptModelMapper;
        this.f = userCompanyInteractor;
    }

    public g(SignUpService signUpService, v errorMapper, f1 sessionTokenRepository, p0 dependenciesProvider) {
        this.f1405a = 2;
        Intrinsics.checkNotNullParameter(signUpService, "signUpService");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        this.f1406b = signUpService;
        this.f1407c = errorMapper;
        this.d = sessionTokenRepository;
        this.e = dependenciesProvider;
    }

    public g(CreditCardService api2, xx4.d memoryCache, xx4.e storage, wj0.a idempotencyKeyHolder) {
        this.f1405a = 8;
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f1406b = api2;
        this.f1407c = memoryCache;
        this.d = storage;
        this.e = idempotencyKeyHolder;
        Continuation continuation = null;
        this.f = new x4l.c(new a1(this, continuation, 3), new dmj.e0(this, 17), new dgj.h(this, 23), new dob.c(this, continuation, 7), new dp4.f1(this, continuation, 0));
    }

    public g(g6e.d subAccountInteractor, te8.v juniorPocketsProductInteractor, ksd.a juniorPocketsNetWorthProductsMapper, ppk.f ratesInteractor, wsg.n walletInteractor) {
        this.f1405a = 19;
        Intrinsics.checkNotNullParameter(subAccountInteractor, "subAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsNetWorthProductsMapper, "juniorPocketsNetWorthProductsMapper");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f1406b = subAccountInteractor;
        this.f1407c = juniorPocketsProductInteractor;
        this.d = juniorPocketsNetWorthProductsMapper;
        this.e = ratesInteractor;
        this.f = walletInteractor;
    }

    public g(wsg.n walletsInteractor, hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor, fe8.a repository, l93.f revolutCardsInteractor) {
        this.f1405a = 1;
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f1406b = walletsInteractor;
        this.f1407c = juniorProfileInteractor;
        this.d = juniorAccountInteractor;
        this.e = repository;
        this.f = revolutCardsInteractor;
    }

    public g(zf8.o juniorPocketsInteractor, wsg.n walletInteractor, ppk.f ratesInteractor, isd.c juniorCashProductMapper, g juniorPocketsNetWorthProductsLoader, hj8.a juniorProfileInteractor) {
        this.f1405a = 12;
        Intrinsics.checkNotNullParameter(juniorPocketsInteractor, "juniorPocketsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(juniorCashProductMapper, "juniorCashProductMapper");
        Intrinsics.checkNotNullParameter(juniorPocketsNetWorthProductsLoader, "juniorPocketsNetWorthProductsLoader");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f1406b = juniorPocketsInteractor;
        this.f1407c = walletInteractor;
        this.d = ratesInteractor;
        this.e = juniorPocketsNetWorthProductsLoader;
        this.f = juniorProfileInteractor;
    }

    public g(ao.h hVar, gpk.c cVar, ecm.q qVar, com.bumptech.glide.g gVar, com.google.firebase.messaging.t tVar, ie.a aVar) {
        this.f1405a = 27;
        Lock lock = ((ReadWriteLock) hVar.f7847b).readLock();
        this.f1406b = lock;
        this.f1407c = qVar;
        this.d = gVar;
        this.e = tVar;
        this.f = aVar;
        lock.lock();
        try {
            cVar.j(new ag.q(this, 26)).i();
        } finally {
            lock.unlock();
        }
    }

    public g(Drawable.Callback callback, d7.b bVar) {
        this.f1405a = 14;
        this.f1406b = new jx0.a();
        this.f1407c = new HashMap();
        this.d = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            r7.c.b("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public g(vb0.b promptControllerFactory, oa0.a addressFlowFactory, oa0.c metaSsoFlowFactory, oa0.e permissionFlowFactory, lal.a countrySelectionListStyleControllerFactory) {
        this.f1405a = 23;
        Intrinsics.checkNotNullParameter(promptControllerFactory, "promptControllerFactory");
        Intrinsics.checkNotNullParameter(addressFlowFactory, "addressFlowFactory");
        Intrinsics.checkNotNullParameter(metaSsoFlowFactory, "metaSsoFlowFactory");
        Intrinsics.checkNotNullParameter(permissionFlowFactory, "permissionFlowFactory");
        Intrinsics.checkNotNullParameter(countrySelectionListStyleControllerFactory, "countrySelectionListStyleControllerFactory");
        this.f1406b = promptControllerFactory;
        this.f1407c = addressFlowFactory;
        this.d = metaSsoFlowFactory;
        this.e = permissionFlowFactory;
        this.f = countrySelectionListStyleControllerFactory;
    }

    public g(ViewGroup view) {
        this.f1405a = 18;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f1407c = f0.f322471a;
        this.f = new f2(view, new ks0.n(this, 0));
    }

    public g(s3 esimSubscriptionsInteractor, k0 esimInstallationStateInteractor, bej.f esimPlanOffersInteractor, t pricingPlanInteractor, dm0.d deviceIdProvider) {
        this.f1405a = 20;
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimPlanOffersInteractor, "esimPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f1406b = esimSubscriptionsInteractor;
        this.f1407c = esimInstallationStateInteractor;
        this.d = esimPlanOffersInteractor;
        this.e = pricingPlanInteractor;
        this.f = deviceIdProvider;
    }

    public g(gr6.e freelancerAvailabilityInteractor, gr6.a freelancerAccountDetailsInteractor, msd.d proNetWorthProductsMapper, wsg.n walletInteractor, ppk.f ratesInteractor, twg.c totalWealthPocketsInteractor) {
        this.f1405a = 25;
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(proNetWorthProductsMapper, "proNetWorthProductsMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(totalWealthPocketsInteractor, "totalWealthPocketsInteractor");
        this.f1406b = freelancerAvailabilityInteractor;
        this.f1407c = freelancerAccountDetailsInteractor;
        this.d = walletInteractor;
        this.e = ratesInteractor;
        this.f = totalWealthPocketsInteractor;
    }

    public g(wsg.n walletInteractor, x0i.f exchangeCurrenciesInteractor, s99.i globalAccessInteractor, i90.b uuidUtils, o0 draftMutator) {
        this.f1405a = 7;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(globalAccessInteractor, "globalAccessInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        this.f1406b = walletInteractor;
        this.f1407c = exchangeCurrenciesInteractor;
        this.d = globalAccessInteractor;
        this.e = uuidUtils;
        this.f = draftMutator;
    }

    public g(Locale locale) {
        this.f1405a = 5;
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f1406b = locale;
        this.f1407c = new SimpleDateFormat[10];
        this.d = new DateTimeFormatter[5];
        this.e = new LruCache(10);
        this.f = new LruCache(10);
    }

    public g(CallAdapter nextAdapter, List domains, kh4.b responseSuccess, Function1 requestToCircuitBreaker) {
        this.f1405a = 17;
        Intrinsics.checkNotNullParameter(nextAdapter, "nextAdapter");
        Intrinsics.checkNotNullParameter(domains, "domains");
        Intrinsics.checkNotNullParameter(responseSuccess, "responseSuccess");
        Intrinsics.checkNotNullParameter(requestToCircuitBreaker, "requestToCircuitBreaker");
        this.f1406b = nextAdapter;
        this.f1407c = domains;
        this.d = responseSuccess;
        this.e = requestToCircuitBreaker;
        this.f = yhm.j.b(new k98.a(this, 6));
    }

    public g(jyc.h hVar) {
        this.f1405a = 16;
        this.f1406b = hVar;
    }
}
