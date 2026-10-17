package k7i;

import android.content.Context;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import ce9.m;
import cli.y;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.ui.processor.CaptureDocumentHelper$ShowCaptureScreenException;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerContract$InputData;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerDestination;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerLauncher;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerParams;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature_crypto_order_flow.api.CryptoOrderFlowCoreApi$Toggles$FirmPricesQuoteReviewUI;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import efm.f0;
import fgm.p;
import fmg.c0;
import fmg.d0;
import fmg.g0;
import fmg.l0;
import fmg.n0;
import g5a.u;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kl.c2;
import klf.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import l9k.v;
import m2f.l;
import m2f.t;
import ml.o0;
import ml.p0;
import ne0.j;
import pe0.q;
import pfm.r;
import qc0.e1;
import rc.k;
import retrofit2.Call;
import retrofit2.CallAdapter;
import sgm.e3;
import skm.e0;
import sl.n;
import t73.z2;
import tfm.q3;
import vkm.j2;
import zh9.u0;
import zhm.a0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements o, zp0.c, cal.c, p, el.b, APMPMWebContainerLauncher, SuccessContinuation, f0, CallAdapter, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f182069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f182070c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f182068a = i;
        this.f182069b = obj2;
        this.f182070c = obj3;
    }

    public static final ArrayList a(i iVar, n0 n0Var) {
        List list = n0Var.f136440b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((l0) it8.next()).f136438a);
        }
        ArrayList arrayListU = w.u(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListU) {
            fmg.f0 f0Var = ((g0) obj2).f136425h;
            if ((f0Var instanceof c0) || (f0Var instanceof d0)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #2 {Exception -> 0x006c, blocks: (B:26:0x0083, B:28:0x0089, B:37:0x00ce, B:19:0x004b, B:20:0x005a, B:22:0x0060, B:25:0x006f), top: B:49:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:33:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k7i.i r12, java.util.ArrayList r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.b(k7i.i, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k7i.i r6, java.util.ArrayList r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof lmg.r
            if (r0 == 0) goto L13
            r0 = r8
            lmg.r r0 = (lmg.r) r0
            int r1 = r0.f197070x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197070x = r1
            goto L18
        L13:
            lmg.r r0 = new lmg.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197070x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.LinkedHashMap r6 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L7f
        L2a:
            r6 = move-exception
            goto La4
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2a
            r2 = 10
            int r2 = zhm.w.t(r7, r2)     // Catch: java.lang.Exception -> L2a
            r8.<init>(r2)     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L2a
        L47:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L59
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Exception -> L2a
            fmg.d0 r2 = (fmg.d0) r2     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = r2.f136417a     // Catch: java.lang.Exception -> L2a
            r8.add(r2)     // Catch: java.lang.Exception -> L2a
            goto L47
        L59:
            java.util.Set r7 = zhm.d0.i1(r8)     // Catch: java.lang.Exception -> L2a
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L2a
            r8.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.f182070c     // Catch: java.lang.Exception -> L2a
            t9l.g r6 = (t9l.g) r6     // Catch: java.lang.Exception -> L2a
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Exception -> L2a
            kotlinx.coroutines.flow.Flow r6 = r6.d(r7, r2)     // Catch: java.lang.Exception -> L2a
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r7)     // Catch: java.lang.Exception -> L2a
            r0.u = r8     // Catch: java.lang.Exception -> L2a
            r0.f197070x = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = vkm.q.z(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L7c
            return r1
        L7c:
            r5 = r8
            r8 = r6
            r6 = r5
        L7f:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto La2
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r7 = r8.iterator()     // Catch: java.lang.Exception -> L2a
        L89:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto La2
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L2a
            v9l.a r8 = (v9l.a) r8     // Catch: java.lang.Exception -> L2a
            tof.a3 r0 = r8.f287078a     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = r0.f272581b     // Catch: java.lang.Exception -> L2a
            fmg.d0 r1 = new fmg.d0     // Catch: java.lang.Exception -> L2a
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L2a
            r6.put(r0, r1)     // Catch: java.lang.Exception -> L2a
            goto L89
        La2:
            r4 = r6
            goto Lad
        La4:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r4, r4, r6, r7)
        Lad:
            if (r4 != 0) goto Lb3
            java.util.Map r4 = zhm.r0.g()
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.c(k7i.i, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList d(k7i.i r7, java.util.List r8, java.util.Map r9, java.util.Map r10) {
        /*
            r7.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r1 = zhm.w.t(r8, r0)
            r7.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r8.next()
            fmg.l0 r1 = (fmg.l0) r1
            java.util.ArrayList r1 = r1.f136438a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = zhm.w.t(r1, r0)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r1.next()
            fmg.g0 r3 = (fmg.g0) r3
            fmg.f0 r4 = r3.f136425h
            boolean r5 = r4 instanceof fmg.c0
            r6 = 0
            if (r5 == 0) goto L45
            fmg.c0 r4 = (fmg.c0) r4
            goto L46
        L45:
            r4 = r6
        L46:
            if (r4 == 0) goto L5f
            java.lang.String r4 = r4.f136414a
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r9.get(r4)
            fmg.c0 r4 = (fmg.c0) r4
            if (r4 == 0) goto L59
            fmg.g0 r4 = fmg.g0.a(r3, r4)
            goto L5a
        L59:
            r4 = r6
        L5a:
            if (r4 != 0) goto L5d
            goto L5f
        L5d:
            r3 = r4
            goto L7f
        L5f:
            fmg.f0 r4 = r3.f136425h
            boolean r5 = r4 instanceof fmg.d0
            if (r5 == 0) goto L68
            fmg.d0 r4 = (fmg.d0) r4
            goto L69
        L68:
            r4 = r6
        L69:
            if (r4 == 0) goto L7b
            java.lang.String r4 = r4.f136417a
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r10.get(r4)
            fmg.d0 r4 = (fmg.d0) r4
            if (r4 == 0) goto L7b
            fmg.g0 r6 = fmg.g0.a(r3, r4)
        L7b:
            if (r6 != 0) goto L7e
            goto L7f
        L7e:
            r3 = r6
        L7f:
            r2.add(r3)
            goto L2f
        L83:
            java.lang.String r1 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            fmg.l0 r1 = new fmg.l0
            r1.<init>(r2)
            r7.add(r1)
            goto L14
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.d(k7i.i, java.util.List, java.util.Map, java.util.Map):java.util.ArrayList");
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new sz3.a(call, (py3.b) this.f182070c);
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f182068a) {
            case 1:
                o0 it8 = (o0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Observable observable = (Observable) this.f182069b;
                Observable observableCast = ((c2) this.f182070c).C.filter(kl.p.f185206c).cast(p0.class);
                Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                return observable.takeUntil(observableCast);
            case 13:
                pl.f outcome = (pl.f) obj2;
                nl.p pVar = (nl.p) this.f182069b;
                Intrinsics.checkNotNullParameter(outcome, "outcome");
                if (outcome instanceof pl.e) {
                    hx7.e.f(pVar.f216933c);
                    Completable completableA = pVar.d.a((n) this.f182070c, ((pl.e) outcome).f237226a);
                    completableA.getClass();
                    ogm.a aVar = new ogm.a(completableA, nl.o.f216929a, 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
                    return aVar;
                }
                if (outcome instanceof pl.b) {
                    return ogm.g.f225217a;
                }
                if (outcome instanceof pl.c) {
                    nl.h hVar = nl.h.f216912a;
                    Objects.requireNonNull(hVar, "throwable is null");
                    return new ogm.e(hVar, 1);
                }
                if (!(outcome instanceof pl.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                CaptureDocumentHelper$ShowCaptureScreenException captureDocumentHelper$ShowCaptureScreenException = CaptureDocumentHelper$ShowCaptureScreenException.f50201a;
                Objects.requireNonNull(captureDocumentHelper$ShowCaptureScreenException, "throwable is null");
                return new ogm.e(captureDocumentHelper$ShowCaptureScreenException, 1);
            default:
                Object objApply = ((kfm.o) this.f182070c).apply(obj2);
                mfm.f.b(objApply, "The mapper returned a null ObservableSource");
                return new q3((efm.w) objApply, new e3((kfm.c) this.f182069b, obj2, 3), 0);
        }
    }

    public r e(fg1.a cardActivation) {
        Intrinsics.checkNotNullParameter(cardActivation, "cardActivation");
        tg1.a aVar = (tg1.a) this.f182070c;
        Intrinsics.checkNotNullParameter(cardActivation, "<this>");
        return aVar.a(new jg1.a(cardActivation.f134881a, cardActivation.f134882b, cardActivation.f134883c, cardActivation.d));
    }

    public Integer f(Throwable th10) {
        ServerError serverError;
        ServerErrorException serverErrorException = th10 instanceof ServerErrorException ? (ServerErrorException) th10 : null;
        if (serverErrorException != null && (serverError = serverErrorException.f) != null) {
            return Integer.valueOf(serverError.f51362a);
        }
        ServerError serverErrorA = ((sf0.h) this.f182069b).a(th10);
        if (serverErrorA != null) {
            return Integer.valueOf(serverErrorA.f51362a);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(com.revolut.feature_move_money.api.model.AccountWrapper r5, x5i.d r6, com.revolut.feature_move_money.api.model.AccountWrapper r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof n7i.v
            if (r0 == 0) goto L13
            r0 = r8
            n7i.v r0 = (n7i.v) r0
            int r1 = r0.f213153x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213153x = r1
            goto L18
        L13:
            n7i.v r0 = new n7i.v
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213153x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L6f
        L29:
            r5 = move-exception
            goto L78
        L2b:
            r5 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            int[] r8 = n7i.t.f213148a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r6 = r8[r6]     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 == r3) goto L53
            r8 = 2
            if (r6 != r8) goto L4d
            kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L58
        L4d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r5.<init>()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            throw r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
        L53:
            kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
        L58:
            java.lang.Object r7 = r6.f186385a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = (com.revolut.feature_move_money.api.model.AccountWrapper) r7     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r6 = r6.f186386b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = (com.revolut.feature_move_money.api.model.AccountWrapper) r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r8 = r4.f182070c     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r7i.u r8 = (r7i.u) r8     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f213153x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r8 = r8.a(r7, r6, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            boolean r6 = r8.booleanValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 == 0) goto L87
            return r5
        L78:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            java.lang.Throwable r5 = yhm.m.a(r5)
            if (r5 == 0) goto L87
            hx7.e.n(r5)
        L87:
            r5 = 0
            return r5
        L89:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.g(com.revolut.feature_move_money.api.model.AccountWrapper, x5i.d, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new ol.e((Context) ((il.a) this.f182069b).get(), (Json) ((il.c) this.f182070c).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r10, x5i.d r11, com.revolut.feature_move_money.api.model.AccountWrapper r12, gim.c r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof n7i.u
            if (r0 == 0) goto L13
            r0 = r13
            n7i.u r0 = (n7i.u) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            n7i.u r0 = new n7i.u
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.B
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L57
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r10 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            goto L9c
        L2e:
            r10 = move-exception
            goto L9f
        L31:
            r10 = move-exception
            goto Laf
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            int r10 = r0.A
            int r11 = r0.z
            int r12 = r0.f213151y
            k7i.i r2 = r0.f213150x
            com.revolut.feature_move_money.api.model.AccountWrapper r4 = r0.f213149w
            x5i.d r6 = r0.v
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r7 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r8 = r7
            r7 = r10
            r10 = r8
            r8 = r12
            r12 = r11
            r11 = r6
            r6 = r2
            r2 = r13
            r13 = r8
            goto L83
        L57:
            yhm.o.b(r13)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.Object r13 = r9.f182069b     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            h6i.o r13 = (h6i.o) r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.String r2 = r10.f99404a     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            k1j.a r6 = r10.getF99407g()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.u = r10     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.v = r11     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f213149w = r12     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f213150x = r9     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r7 = 0
            r0.f213151y = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.z = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.A = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.D = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.Object r13 = r13.e(r0, r2, r6)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            if (r13 != r1) goto L7e
            goto L9b
        L7e:
            r6 = r9
            r4 = r12
            r2 = r13
            r12 = r7
            r13 = r12
        L83:
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = (com.revolut.feature_move_money.api.model.AccountWrapper) r2     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.u = r10     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.v = r5     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f213149w = r5     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f213150x = r5     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.f213151y = r13     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.z = r12     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.A = r7     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            r0.D = r3     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            java.lang.Object r13 = r6.g(r2, r11, r4, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L31
            if (r13 != r1) goto L9c
        L9b:
            return r1
        L9c:
            if (r13 == 0) goto Lae
            return r10
        L9f:
            yhm.m$a r11 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
            java.lang.Throwable r10 = yhm.m.a(r10)
            if (r10 == 0) goto Lae
            hx7.e.n(r10)
        Lae:
            return r5
        Laf:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.h(com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper, x5i.d, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    public String i(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f182070c;
        Object objB = linkedHashMap.get(countryCode);
        if (objB == null) {
            objB = ((o8b.c) ((n8b.a) this.f182069b)).b(countryCode.f297794a);
            linkedHashMap.put(countryCode, objB);
        }
        return (String) objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof opf.d0
            if (r0 == 0) goto L13
            r0 = r7
            opf.d0 r0 = (opf.d0) r0
            int r1 = r0.f227614y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227614y = r1
            goto L18
        L13:
            opf.d0 r0 = new opf.d0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f227612w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227614y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.v
            ne0.j r0 = r0.u
            yhm.o.b(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f182070c
            ne0.j r7 = (ne0.j) r7
            java.lang.String r2 = "CACHE_POCKET_KEY_PREFIX"
            java.lang.String r2 = j6.a.q(r2, r6)
            java.lang.Object r4 = r7.get(r2)
            if (r4 != 0) goto L62
            r0.u = r7
            r0.v = r2
            r0.f227614y = r3
            java.io.Serializable r6 = r5.l(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r7
            r7 = r6
            r6 = r2
        L56:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r7 = r7.f186385a
            fo3.c r7 = (fo3.c) r7
            java.lang.String r7 = r7.f136805h
            r0.f(r6, r7)
            return r7
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.j(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String extractedValue, String formatted, boolean z) {
        TradeRevPointsRate rate;
        TradeRevPointsTransferScreen tradeRevPointsTransferScreen = (TradeRevPointsTransferScreen) this.f182070c;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formatted, "formattedValue");
        int i = m2f.g.f201972a[((ip0.l0) this.f182069b).ordinal()];
        if (i == 1) {
            ((com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2()).L2(formatted);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) tradeRevPointsTransferScreen.R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(formatted, "text");
        y yVar = aVar.E;
        u2f.d dVar = (u2f.d) ((l) ((j2) yVar.f22677a).getValue()).f201977b.getContent();
        if (dVar == null || (rate = dVar.f276624m.f276642h) == null) {
            return;
        }
        m2f.c cVar = aVar.f91168t;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        int iIntValue = 0;
        try {
            Number number = cVar.f201965a.parse(formatted);
            if (number != null) {
                iIntValue = number.intValue();
            }
        } catch (ParseException unused) {
        }
        int i2 = iIntValue;
        if (i2 == ((l) ((j2) yVar.f22677a).getValue()).f201979g) {
            return;
        }
        if (i2 > 999999) {
            aVar.n2(new m2f.c0(aVar, formatted, null, 0), new whi.b(6));
            return;
        }
        aVar.f91169w.getClass();
        Intrinsics.checkNotNullParameter(rate, "rate");
        aVar.H2(yVar, new t(((double) i2) * rate.f91190a, aVar, i2, formatted, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable l(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof opf.e0
            if (r0 == 0) goto L13
            r0 = r7
            opf.e0 r0 = (opf.e0) r0
            int r1 = r0.f227618x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227618x = r1
            goto L18
        L13:
            opf.e0 r0 = new opf.e0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227618x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L59
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f182069b
            wsg.b r7 = (wsg.b) r7
            w4l.h r2 = w4l.h.f294642c
            akg.n r7 = r7.b(r2)
            zfd.e r7 = zi0.c.w(r7)
            op0.v3 r2 = new op0.v3
            r4 = 28
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.u = r6
            r0.f227618x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r7.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.f186385a
            fo3.c r1 = (fo3.c) r1
            java.lang.Object r0 = r0.f186386b
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            io3.d r2 = (io3.d) r2
            java.lang.String r3 = r2.f163145a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r3 == 0) goto L77
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r1, r2)
            return r6
        L91:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to find pocket with id="
            java.lang.String r6 = h30.l.r(r0, r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.l(java.lang.String, gim.c):java.io.Serializable");
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerLauncher
    public void launch(Context context, APMPMWebContainerParams params, String pageId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        e0.C((CoroutineScope) this.f182069b, null, null, new e1(this, u0.f(new AlipayPlusWebContainerDestination(new AlipayPlusWebContainerContract$InputData(params.getUrl(), params.getUserAgent(), params.getTitle(), params.getBizScenario(), params.getRequestId(), params.getForceHttps(), params.getH5ErrorPageUrl(), pageId))), null, 14), 3);
    }

    public Locale m() {
        Locale locale = ((WorkflowConfig) this.f182070c).getF50175c();
        if (locale != null) {
            return locale;
        }
        LocaleListCompat locales = ConfigurationCompat.getLocales(((Context) this.f182069b).getResources().getConfiguration());
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        if (locales.size() <= 0) {
            Locale locale2 = Locale.ENGLISH;
            Intrinsics.h(locale2);
            return locale2;
        }
        Locale locale3 = locales.get(0);
        if (locale3 == null) {
            locale3 = Locale.ENGLISH;
        }
        Intrinsics.h(locale3);
        return locale3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lyc.c
            if (r0 == 0) goto L13
            r0 = r7
            lyc.c r0 = (lyc.c) r0
            int r1 = r0.f200779w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200779w = r1
            goto L18
        L13:
            lyc.c r0 = new lyc.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200779w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L27
            goto L76
        L27:
            r7 = move-exception
            goto L80
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f182070c     // Catch: java.lang.Exception -> L27
            kpj.f r7 = (kpj.f) r7     // Catch: java.lang.Exception -> L27
            efm.r r7 = r7.i()     // Catch: java.lang.Exception -> L27
            lv9.c r2 = new lv9.c     // Catch: java.lang.Exception -> L27
            r4 = 27
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            efm.r r7 = nim.a.w(r7, r2)     // Catch: java.lang.Exception -> L27
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)     // Catch: java.lang.Exception -> L27
            efm.d0 r7 = r7.firstOrError()     // Catch: java.lang.Exception -> L27
            lv9.c r2 = new lv9.c     // Catch: java.lang.Exception -> L27
            r4 = 28
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            lxb.c r4 = new lxb.c     // Catch: java.lang.Exception -> L27
            r5 = 18
            r4.<init>(r5, r2)     // Catch: java.lang.Exception -> L27
            r7.getClass()     // Catch: java.lang.Exception -> L27
            ufm.i r2 = new ufm.i     // Catch: java.lang.Exception -> L27
            r5 = 1
            r2.<init>(r7, r4, r5)     // Catch: java.lang.Exception -> L27
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)     // Catch: java.lang.Exception -> L27
            r0.f200779w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = nim.a.b(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L76
            return r1
        L76:
            kotlin.jvm.internal.Intrinsics.h(r7)     // Catch: java.lang.Exception -> L27
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L27
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L27
            goto L8b
        L80:
            gom.c r0 = gom.e.f145194a
            java.lang.String r1 = "SOT Kompot: isUserRestricted failed"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.e(r7, r1, r3)
            r7 = r2
        L8b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.n(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(fmg.u r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lmg.o
            if (r0 == 0) goto L13
            r0 = r7
            lmg.o r0 = (lmg.o) r0
            int r1 = r0.f197063x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197063x = r1
            goto L18
        L13:
            lmg.o r0 = new lmg.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197063x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fmg.u r6 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            lmg.q r2 = new lmg.q
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.u = r6
            r0.f197063x = r3
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            fmg.u r7 = (fmg.u) r7
            if (r7 != 0) goto L4e
            return r6
        L4e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.o(fmg.u, gim.c):java.lang.Object");
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        switch (this.f182068a) {
            case 12:
                ((p) this.f182070c).onError(th10);
                break;
            case 22:
                ((f0) this.f182069b).onError(th10);
                break;
            default:
                ((p) this.f182069b).onError(th10);
                break;
        }
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        switch (this.f182068a) {
            case 12:
                jgm.b.c((AtomicReference) this.f182069b, disposable);
                break;
            default:
                ((p) this.f182069b).onSubscribe(disposable);
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        switch (this.f182068a) {
            case 12:
                ((p) this.f182070c).onSuccess(obj2);
                break;
            case 22:
                ((f0) this.f182069b).onSuccess(obj2);
                break;
            default:
                try {
                    Object objApply = ((o) this.f182070c).apply(obj2);
                    Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                    ((p) this.f182069b).onSuccess(objApply);
                } catch (Throwable th10) {
                    m.F(th10);
                    onError(th10);
                    return;
                }
                break;
        }
    }

    public Flow p(xi0.b transferCurrency) {
        Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
        return boh.f.e(u0.m(nim.a.v(rd0.e.b(((wsg.n) this.f182069b).W(AccountId.Personal.f51414a)), new lbh.a(0)), ((tnb.g0) this.f182070c).h()), new v(this, transferCurrency, 7));
    }

    public pfm.a q(vel.f popularAsset) {
        Intrinsics.checkNotNullParameter(popularAsset, "popularAsset");
        pfm.a aVar = new pfm.a(te0.w.o0(skm.p0.f264003c, new t9h.b(this, popularAsset, null, 0)), new z2(new su0.c(1, (ln.a) this.f182070c, ln.a.class, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 15), 19), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public pfm.a r(s0h.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        pfm.a aVar = new pfm.a(te0.w.o0(skm.p0.f264003c, new sx2.r(this, config, null, 22)), new z2(new su0.c(1, (ln.a) this.f182070c, ln.a.class, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 16), 18), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f182069b;
    }

    public boolean s(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!((jte.d) ((gte.a) this.f182070c)).c(CryptoOrderFlowCoreApi$Toggles$FirmPricesQuoteReviewUI.f96679c)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(error, "error");
        Integer numF = f(error);
        if (numF == null) {
            Throwable cause = error.getCause();
            numF = cause != null ? f(cause) : null;
        }
        if (numF != null && numF.intValue() == 1508) {
            return true;
        }
        return numF != null && numF.intValue() == 1509;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002f, B:29:0x0077, B:31:0x007f, B:19:0x003d, B:25:0x005a, B:22:0x0044), top: B:37:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(gim.c r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f182069b
            kza.a r0 = (kza.a) r0
            boolean r1 = r10 instanceof lyc.d
            if (r1 == 0) goto L17
            r1 = r10
            lyc.d r1 = (lyc.d) r1
            int r2 = r1.f200781x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f200781x = r2
            goto L1c
        L17:
            lyc.d r1 = new lyc.d
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f200781x
            java.lang.String r4 = "firstOrError(...)"
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L41
            if (r3 == r7) goto L3d
            if (r3 != r5) goto L35
            java.lang.Boolean r0 = r1.u
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L33
            goto L77
        L33:
            r10 = move-exception
            goto L87
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L33
            goto L5a
        L41:
            yhm.o.b(r10)
            com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey r10 = com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey.SOT_HARD_LOCK     // Catch: java.lang.Exception -> L33
            efm.r r10 = r0.a(r10)     // Catch: java.lang.Exception -> L33
            efm.d0 r10 = r10.firstOrError()     // Catch: java.lang.Exception -> L33
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)     // Catch: java.lang.Exception -> L33
            r1.f200781x = r7     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = nim.a.b(r10, r1)     // Catch: java.lang.Exception -> L33
            if (r10 != r2) goto L5a
            goto L73
        L5a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L33
            com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey r3 = com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey.SOT_NON_LOCK     // Catch: java.lang.Exception -> L33
            efm.r r0 = r0.a(r3)     // Catch: java.lang.Exception -> L33
            efm.d0 r0 = r0.firstOrError()     // Catch: java.lang.Exception -> L33
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch: java.lang.Exception -> L33
            r1.u = r10     // Catch: java.lang.Exception -> L33
            r1.f200781x = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = nim.a.b(r0, r1)     // Catch: java.lang.Exception -> L33
            if (r0 != r2) goto L74
        L73:
            return r2
        L74:
            r8 = r0
            r0 = r10
            r10 = r8
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L33
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L33
            if (r0 != 0) goto L90
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L33
            if (r10 != 0) goto L90
            r6 = r7
            goto L90
        L87:
            gom.c r0 = gom.e.f145194a
            java.lang.String r1 = "SOT Kompot: shouldShowStories failed"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r0.e(r10, r1, r2)
        L90:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.i.t(gim.c):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        k kVar = (k) this.f182069b;
        return Tasks.forResult(new rc.t(kVar.f253159b, ((rc.v) this.f182070c).f253178a, ((Long) obj2).longValue()));
    }

    public i(n8b.a countryInteractor) {
        this.f182068a = 23;
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f182069b = countryInteractor;
        this.f182070c = new LinkedHashMap();
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        lfm.d.e((ofm.i) this.f182070c, cVar);
    }

    public i(h0 commonDataSource, mkf.i edtDelayMapper) {
        this.f182068a = 9;
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(edtDelayMapper, "edtDelayMapper");
        this.f182069b = commonDataSource;
        this.f182070c = edtDelayMapper;
    }

    public i(Context context, WorkflowConfig workflowConfig) {
        this.f182068a = 25;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        this.f182069b = context;
        this.f182070c = workflowConfig;
    }

    public i(sf0.h serverErrorParser, gte.a featureToggleInteractor) {
        this.f182068a = 17;
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f182069b = serverErrorParser;
        this.f182070c = featureToggleInteractor;
    }

    public i(u transferItemsScreenMapper, b5a.d localContactsItemsProvider) {
        this.f182068a = 3;
        Intrinsics.checkNotNullParameter(transferItemsScreenMapper, "transferItemsScreenMapper");
        Intrinsics.checkNotNullParameter(localContactsItemsProvider, "localContactsItemsProvider");
        this.f182069b = transferItemsScreenMapper;
        this.f182070c = localContactsItemsProvider;
    }

    public i(h6i.o accountProvider, r7i.u moveMoneyBalancePairEligibilityChecker) {
        this.f182068a = 11;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(moveMoneyBalancePairEligibilityChecker, "moveMoneyBalancePairEligibilityChecker");
        this.f182069b = accountProvider;
        this.f182070c = moveMoneyBalancePairEligibilityChecker;
    }

    public i(hal.a repository, mal.a mapper, p96.a featureToggleInteractor) {
        this.f182068a = 8;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f182069b = repository;
        this.f182070c = mapper;
    }

    public i(kbb.c transactionWalletScopeProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        this.f182068a = 20;
        Intrinsics.checkNotNullParameter(transactionWalletScopeProvider, "transactionWalletScopeProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f182069b = transactionWalletScopeProvider;
        this.f182070c = transactionsInteractor;
    }

    public i(g recurringPaymentCollisionProvider, e incomeSorterCollisionProvider) {
        this.f182068a = 0;
        Intrinsics.checkNotNullParameter(recurringPaymentCollisionProvider, "recurringPaymentCollisionProvider");
        Intrinsics.checkNotNullParameter(incomeSorterCollisionProvider, "incomeSorterCollisionProvider");
        this.f182069b = recurringPaymentCollisionProvider;
        this.f182070c = incomeSorterCollisionProvider;
    }

    public i(e3 naviCommandsProvider, ln.a navigationCommandsDispatcher) {
        this.f182068a = 27;
        Intrinsics.checkNotNullParameter(naviCommandsProvider, "naviCommandsProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f182069b = naviCommandsProvider;
        this.f182070c = navigationCommandsDispatcher;
    }

    public i(com.revolut.domain.interactors.transactions.a transactionsInteractor, q offlineQueueHandler, pe3.c offlineQueueCategoryExecutionDelegate) {
        this.f182068a = 18;
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(offlineQueueHandler, "offlineQueueHandler");
        Intrinsics.checkNotNullParameter(offlineQueueCategoryExecutionDelegate, "offlineQueueCategoryExecutionDelegate");
        this.f182069b = transactionsInteractor;
        this.f182070c = offlineQueueHandler;
        Set executionDelegates = y0.b(offlineQueueCategoryExecutionDelegate);
        Intrinsics.checkNotNullParameter(executionDelegates, "executionDelegates");
        a0.x(executionDelegates, offlineQueueHandler.d);
    }

    public i(zf8.k juniorAccountInfoProvider, te8.v juniorPocketsProductInteractor) {
        this.f182068a = 14;
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        this.f182069b = juniorAccountInfoProvider;
        this.f182070c = juniorPocketsProductInteractor;
    }

    public i(CoroutineScope appCoroutineScope, sri.m navigator) {
        this.f182068a = 19;
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f182069b = appCoroutineScope;
        this.f182070c = navigator;
    }

    public i(l93.f revolutCardsInteractor, t9l.g sharedTransactionInteractor) {
        this.f182068a = 5;
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(sharedTransactionInteractor, "sharedTransactionInteractor");
        this.f182069b = revolutCardsInteractor;
        this.f182070c = sharedTransactionInteractor;
    }

    public i(wsg.b newWalletsInteractor, j ownersByPocketId) {
        this.f182068a = 16;
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(ownersByPocketId, "ownersByPocketId");
        this.f182069b = newWalletsInteractor;
        this.f182070c = ownersByPocketId;
    }

    public i(kza.a remoteStoriesInteractor, kpj.f sotInteractor) {
        this.f182068a = 6;
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        this.f182069b = remoteStoriesInteractor;
        this.f182070c = sotInteractor;
    }

    public i(l93.f revolutCardsInteractor, tg1.a repository) {
        this.f182068a = 2;
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f182069b = revolutCardsInteractor;
        this.f182070c = repository;
    }

    public i(wsg.n walletInteractor, tnb.g0 tradingCurrencyCompatibilityInteractor) {
        this.f182068a = 4;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        this.f182069b = walletInteractor;
        this.f182070c = tradingCurrencyCompatibilityInteractor;
    }

    public i(Type responseType, py3.b creditApplicationErrorHandlerChecker) {
        this.f182068a = 26;
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        this.f182069b = responseType;
        this.f182070c = creditApplicationErrorHandlerChecker;
    }

    public i(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f182068a = 10;
        this.f182069b = stockDetailsOverviewController.S;
        this.f182070c = stockDetailsOverviewController.V;
    }

    public i(ryc.b bVar, ryc.c cVar) {
        this.f182068a = 24;
        this.f182069b = cVar;
        this.f182070c = e4m.b.b(new d2h.b(bVar, 24, cVar, this));
    }
}
