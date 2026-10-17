package r10;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dfj.v2;
import e8.e0;
import e8.g0;
import efm.d0;
import et6.h1;
import io.reactivex.exceptions.CompositeException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mel.p;
import ms0.u3;
import okhttp3.ResponseBody;
import p6f.f;
import retrofit2.HttpException;
import retrofit2.Response;
import tx8.b0;
import ulm.b1;
import ulm.s1;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements d4i.i, s5i.h, u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f250865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250866b;

    public /* synthetic */ w(Object obj2, Object obj3) {
        this.f250865a = obj2;
        this.f250866b = obj3;
    }

    public static Pair k(OrderQuote orderQuote) {
        f8l.b bVar = orderQuote.f104753b;
        Amount amount = orderQuote.f104754c;
        Amount amount2 = orderQuote.e;
        int i = h5i.a.f149559a[bVar.ordinal()];
        if (i == 1) {
            return new Pair(amount, amount2);
        }
        if (i == 2) {
            return new Pair(amount2, amount);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean u(String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Missing ", str, " for notification settings"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return false;
    }

    public static dj0.d x(Long l2, xi0.b bVar) {
        return new dj0.d(l2 != null ? l2.longValue() : 0L, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(com.revolut.feature.apm.core.models.alias.Alias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bb2.e
            if (r0 == 0) goto L13
            r0 = r8
            bb2.e r0 = (bb2.e) r0
            int r1 = r0.f14142x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14142x = r1
            goto L18
        L13:
            bb2.e r0 = new bb2.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14142x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            r10.w r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L39:
            yhm.o.b(r8)
            bb2.b r8 = new bb2.b
            r2 = 2
            r8.<init>(r6, r7, r5, r2)
            r0.u = r6
            r0.f14142x = r4
            java.lang.Object r7 = r6.f250866b
            wj0.a r7 = (wj0.a) r7
            java.lang.String r2 = "IDEMPOTENCY_TAG_UNFREEZE_ALIAS"
            r7.a(r2)
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L56
            goto L67
        L56:
            r7 = r6
        L57:
            zz1.f r8 = (zz1.f) r8
            r0.u = r5
            r0.f14142x = r3
            java.lang.Object r7 = r7.f250865a
            vw1.b r7 = (vw1.b) r7
            java.lang.Enum r7 = vw1.b.d(r7, r8, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.A(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    public void B(jcm.a aVar) {
        this.f250865a = aVar;
    }

    public zq.a b() {
        if (((jcm.a) this.f250865a) != null) {
            return new zq.a(this);
        }
        throw new IllegalStateException("url == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.revolut.feature.apm.core.models.alias.Alias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bb2.a
            if (r0 == 0) goto L13
            r0 = r8
            bb2.a r0 = (bb2.a) r0
            int r1 = r0.f14132x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14132x = r1
            goto L18
        L13:
            bb2.a r0 = new bb2.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14132x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            r10.w r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L39:
            yhm.o.b(r8)
            bb2.b r8 = new bb2.b
            r2 = 0
            r8.<init>(r6, r7, r5, r2)
            r0.u = r6
            r0.f14132x = r4
            java.lang.Object r7 = r6.f250866b
            wj0.a r7 = (wj0.a) r7
            java.lang.String r2 = "IDEMPOTENCY_TAG_DELETE_ALIAS"
            r7.a(r2)
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L56
            goto L67
        L56:
            r7 = r6
        L57:
            zz1.f r8 = (zz1.f) r8
            r0.u = r5
            r0.f14132x = r3
            java.lang.Object r7 = r7.f250865a
            vw1.b r7 = (vw1.b) r7
            java.lang.Enum r7 = vw1.b.d(r7, r8, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.c(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.revolut.feature.apm.core.models.alias.Alias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bb2.c
            if (r0 == 0) goto L13
            r0 = r8
            bb2.c r0 = (bb2.c) r0
            int r1 = r0.f14138x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14138x = r1
            goto L18
        L13:
            bb2.c r0 = new bb2.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14138x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            r10.w r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L39:
            yhm.o.b(r8)
            bb2.b r8 = new bb2.b
            r2 = 1
            r8.<init>(r6, r7, r5, r2)
            r0.u = r6
            r0.f14138x = r4
            java.lang.Object r7 = r6.f250866b
            wj0.a r7 = (wj0.a) r7
            java.lang.String r2 = "IDEMPOTENCY_TAG_FREEZE_ALIAS"
            r7.a(r2)
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L56
            goto L67
        L56:
            r7 = r6
        L57:
            zz1.f r8 = (zz1.f) r8
            r0.u = r5
            r0.f14138x = r3
            java.lang.Object r7 = r7.f250865a
            vw1.b r7 = (vw1.b) r7
            java.lang.Enum r7 = vw1.b.d(r7, r8, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.d(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    @Override // s5i.h
    public qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return ((s5i.k) this.f250865a).e(orderQuote, parcel, cellTitle, bVar);
    }

    public c6f.a f(p6f.g type) {
        c6f.a aVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof p6f.d) {
            aVar = (c6f.c) this.f250866b;
        } else {
            if (!(type instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = (c6f.e) this.f250865a;
        }
        Intrinsics.i(aVar, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.mappers.ChartUiMapper<PerformanceChartType of com.revolut.feature.trading.managed_portfolios.impl.mappers.ChartMappersProviderImpl.getChartUiMapper>");
        return aVar;
    }

    public ufm.n g(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        d0<Response<ResponseBody>> confirmation = ((TravelHotelsService) this.f250865a).getConfirmation(bookingId);
        f9g.h hVar = new f9g.h(new fag.p(this, bookingId, 0), 10);
        confirmation.getClass();
        ufm.i iVar = new ufm.i(confirmation, hVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(ue0.e.I(iVar, h0.f322473a, new fag.p(this, bookingId, 1)));
    }

    public j72.c h(Throwable throwable) {
        Object next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HttpException) {
            return i((HttpException) throwable);
        }
        if (throwable instanceof CompositeException) {
            List list = ((CompositeException) throwable).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((Throwable) next) instanceof HttpException) {
                    break;
                }
            }
            Throwable th10 = (Throwable) next;
            if (th10 != null) {
                return i((HttpException) th10);
            }
        }
        return null;
    }

    public j72.c i(HttpException httpException) throws IOException {
        String strString;
        j72.d dVar;
        j72.c cVar;
        ResponseBody responseBodyErrorBody;
        Response<?> response = httpException.response();
        if (response == null || (responseBodyErrorBody = response.errorBody()) == null) {
            strString = null;
        } else {
            mmm.h hVarClone = responseBodyErrorBody.source().C5().clone();
            s1 s1Var = ResponseBody.Companion;
            b1 b1VarContentType = responseBodyErrorBody.contentType();
            long jContentLength = responseBodyErrorBody.contentLength();
            s1Var.getClass();
            strString = s1.b(hVarClone, b1VarContentType, jContentLength).string();
        }
        if (strString != null) {
            try {
                dVar = (j72.d) ((kg.o) this.f250866b).c(strString, j72.d.class);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                dVar = null;
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Integer code = dVar.getCode();
            int iIntValue = code != null ? code.intValue() : 1;
            String message = dVar.getMessage();
            j72.e params = dVar.getParams();
            cVar = new j72.c(iIntValue, message, params != null ? params.getWorkflowId() : null);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        ServerError serverErrorC = ((sf0.h) this.f250865a).c(httpException);
        if (serverErrorC != null) {
            return new j72.c(serverErrorC.f51362a, null, null);
        }
        return null;
    }

    @Override // d4i.i
    public List j(OrderQuote orderQuote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        qv0.i iVarH;
        Intrinsics.checkNotNullParameter(orderQuote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        h3d.a cellTitle = new h3d.a(21);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        qv0.i iVarA = ((s5i.k) this.f250865a).a(orderQuote, cellTitle);
        qv0.i iVarM = s5i.h.m(this, orderQuote, false, new h3d.a(this, 26), null, 10);
        h3d.a cellTitle2 = new h3d.a(22);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle2, "cellTitle");
        qv0.i iVarF = ((s5i.k) this.f250865a).f(orderQuote, cellTitle2);
        qv0.i iVarL = s5i.h.l(this, orderQuote, new h3d.a(23), null, null, 12);
        if (((jte.d) ((gte.a) this.f250866b)).c(PaymentsToggles$PaymentsChargesMigration.f79158c)) {
            h3d.a parcel = new h3d.a(24);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s5i.g cellTitle3 = s5i.g.f260089a;
            Intrinsics.checkNotNullParameter(cellTitle3, "cellTitle");
            iVarH = ((s5i.k) this.f250865a).h(orderQuote, parcel, cellTitle3);
        } else {
            iVarH = null;
        }
        h3d.a cellTitle4 = new h3d.a(this, 25);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle4, "cellTitle");
        qv0.i[] elements = {iVarA, iVarM, iVarF, iVarL, iVarH, ((s5i.k) this.f250865a).d(orderQuote, null, cellTitle4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    @Override // s5i.h
    public qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return ((s5i.k) this.f250865a).o(orderQuote, z, parcel, cellTitle);
    }

    public void p(String str, String str2) {
        ArrayList arrayList = ((io.grpc.okhttp.internal.e) this.f250866b).f163003a;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public akg.n q(xi0.b baseCurrency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(boh.f.e(nim.a.v(((wsg.b) this.f250865a).e(loadingStrategy), new et6.w(21)), new eed.i(this, 10, baseCurrency, loadingStrategy)), new dv5.p(9, baseCurrency));
    }

    public Flow r(ExchangeOrderInfo exchangeOrderInfo, f8l.e eVar) {
        if (exchangeOrderInfo == null) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        xi0.b bVar = exchangeOrderInfo.e;
        xi0.b bVar2 = exchangeOrderInfo.f;
        BigDecimal bigDecimal = l4i.a.e(exchangeOrderInfo.f72140g).f104717a;
        f8l.b bVar3 = f8l.b.FROM;
        return c8g.a.D(new a6e.b(rd0.e.n(o7.b.u((o7.b) this.f250865a, new OrderQuoteParams(bVar, bVar2, eVar, bigDecimal, bVar3, bVar3, new BigDecimal(String.valueOf(exchangeOrderInfo.f72141h)), false, null, null, null, null, null, null, 16128)), h0.f322473a), 6));
    }

    public Flow s(String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        return xam.a.h(new iug.j(this, (Continuation) null, 2), vkm.q.q(nim.a.v(((qrk.c) this.f250865a).b(instrumentRef, w4l.h.f294642c), new kotlin.jvm.internal.h0() { // from class: iuk.c
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((p) obj2).f204771c;
            }
        })));
    }

    public e0 t(e0 e0Var) {
        e0 e0VarTransform;
        c8.o oVar;
        c8.c cVarP;
        boolean z;
        boolean z3;
        boolean z4;
        Object eVar;
        e8.m mVar = (e8.m) this.f250866b;
        c8.a aVar = (c8.a) this.f250865a;
        e8.h hVar = mVar.f123485a;
        Class<?> cls = e0Var.get().getClass();
        c8.n nVarC = null;
        if (aVar != c8.a.RESOURCE_DISK_CACHE) {
            c8.o oVarE = hVar.e(cls);
            oVar = oVarE;
            e0VarTransform = oVarE.transform(mVar.f123489h, e0Var, mVar.f123491l, mVar.f123492m);
        } else {
            e0VarTransform = e0Var;
            oVar = null;
        }
        if (!e0Var.equals(e0VarTransform)) {
            e0Var.recycle();
        }
        if (hVar.f123463c.a().d.c(e0VarTransform.a()) != null) {
            nVarC = hVar.f123463c.a().d.c(e0VarTransform.a());
            if (nVarC == null) {
                throw new Registry.NoResultEncoderAvailableException(e0VarTransform.a());
            }
            cVarP = nVarC.p(mVar.o);
        } else {
            cVarP = c8.c.NONE;
        }
        c8.n nVar = nVarC;
        c8.g gVar = mVar.f123500x;
        ArrayList arrayListB = hVar.b();
        int size = arrayListB.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            if (((i8.t) arrayListB.get(i)).f159398a.equals(gVar)) {
                z = true;
                break;
            }
            i++;
        }
        if (!mVar.f123493n.d(!z, aVar, cVarP)) {
            return e0VarTransform;
        }
        if (nVar == null) {
            throw new Registry.NoResultEncoderAvailableException(e0VarTransform.get().getClass());
        }
        int i2 = e8.i.f123475c[cVarP.ordinal()];
        if (i2 == 1) {
            z3 = false;
            z4 = true;
            eVar = new e8.e(mVar.f123500x, mVar.i);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarP);
            }
            z4 = true;
            z3 = false;
            eVar = new g0(hVar.f123463c.f26088a, mVar.f123500x, mVar.i, mVar.f123491l, mVar.f123492m, oVar, cls, mVar.o);
        }
        e8.d0 d0Var = (e8.d0) e8.d0.e.acquire();
        d0Var.d = z3;
        d0Var.f123446c = z4;
        d0Var.f123445b = e0VarTransform;
        gpk.c cVar = mVar.f;
        cVar.f145463a = eVar;
        cVar.f145464b = nVar;
        cVar.f145465c = d0Var;
        return d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(com.revolut.feature.apm.core.models.alias.Alias r12, java.lang.String r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof bb2.d
            if (r0 == 0) goto L13
            r0 = r14
            bb2.d r0 = (bb2.d) r0
            int r1 = r0.f14140x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14140x = r1
            goto L18
        L13:
            bb2.d r0 = new bb2.d
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14140x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            return r14
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            r10.w r12 = r0.u
            yhm.o.b(r14)
            r6 = r11
            goto L5c
        L3a:
            yhm.o.b(r14)
            a41.s r5 = new a41.s
            r10 = 13
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r6
            r0.f14140x = r4
            java.lang.Object r12 = r6.f250866b
            wj0.a r12 = (wj0.a) r12
            java.lang.String r13 = "IDEMPOTENCY_TAG_REGISTER_ALIAS"
            r12.a(r13)
            java.lang.Object r14 = r5.invoke(r0)
            if (r14 != r1) goto L5b
            goto L6c
        L5b:
            r12 = r6
        L5c:
            zz1.f r14 = (zz1.f) r14
            r0.u = r9
            r0.f14140x = r3
            java.lang.Object r12 = r12.f250865a
            vw1.b r12 = (vw1.b) r12
            java.lang.Enum r12 = vw1.b.d(r12, r14, r0)
            if (r12 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.v(com.revolut.feature.apm.core.models.alias.Alias, java.lang.String, gim.c):java.lang.Object");
    }

    public gyl.i w(hyl.o oVar) {
        String str = oVar.f156925a;
        double d = oVar.f156926b;
        double d5 = oVar.f156927c;
        com.revolut.network.a aVar = (com.revolut.network.a) this.f250865a;
        String str2 = (String) aVar.invoke(oVar.d);
        ArrayList arrayList = oVar.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            hyl.n nVar = (hyl.n) it8.next();
            String str3 = nVar.f156920a;
            String str4 = nVar.f156921b;
            String str5 = nVar.f156922c;
            String str6 = (String) aVar.invoke(nVar.d);
            String str7 = nVar.e;
            Iterator it9 = it8;
            hyl.a aVar2 = nVar.f;
            String str8 = null;
            String str9 = aVar2 != null ? (String) aVar.invoke(aVar2) : null;
            String str10 = nVar.f156923g;
            hyl.a aVar3 = nVar.f156924h;
            if (aVar3 != null) {
                str8 = (String) aVar.invoke(aVar3);
            }
            arrayList2.add(new gyl.h(str3, str4, str5, str6, str7, str9, str10, str8));
            it8 = it9;
        }
        return new gyl.i(str, d, d5, str2, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r5, dej.m1 r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ehj.b
            if (r0 == 0) goto L13
            r0 = r7
            ehj.b r0 = (ehj.b) r0
            int r1 = r0.f126201y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126201y = r1
            goto L18
        L13:
            ehj.b r0 = new ehj.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f126199w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126201y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dej.m1 r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            r0.u = r5
            r0.v = r6
            r0.f126201y = r3
            java.lang.Object r7 = r4.z(r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Object r7 = r4.f250866b
            tx8.b0 r7 = (tx8.b0) r7
            r0 = 0
            int[] r1 = ehj.a.f126198a     // Catch: java.lang.Throwable -> L6c
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L6c
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r6 == r3) goto L90
            r2 = 2
            java.lang.String r3 = "vendor"
            if (r6 == r2) goto L82
            r2 = 3
            if (r6 == r2) goto L74
            r2 = 4
            if (r6 != r2) goto L6e
            tx8.t r6 = new tx8.t     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L6c
            grl.cc r5 = grl.cc.Skipped     // Catch: java.lang.Throwable -> L6c
            r7.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L6c
            goto La4
        L6c:
            r5 = move-exception
            goto L99
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            throw r5     // Catch: java.lang.Throwable -> L6c
        L74:
            tx8.t r6 = new tx8.t     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L6c
            grl.cc r5 = grl.cc.Failed     // Catch: java.lang.Throwable -> L6c
            r7.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L6c
            goto La4
        L82:
            tx8.t r6 = new tx8.t     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L6c
            grl.cc r5 = grl.cc.Succeeded     // Catch: java.lang.Throwable -> L6c
            r7.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L6c
            goto La4
        L90:
            tx8.t r6 = new tx8.t     // Catch: java.lang.Throwable -> L6c
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6c
            r7.c(r6)     // Catch: java.lang.Throwable -> L6c
            goto La4
        L99:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r1 = "EsimInstallationEventsTracker"
            rd0.d.a(r7, r1, r0, r5, r6)
        La4:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.y(java.lang.String, dej.m1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(java.lang.String r11, dej.m1 r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ehj.c
            if (r0 == 0) goto L13
            r0 = r13
            ehj.c r0 = (ehj.c) r0
            int r1 = r0.f126202w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126202w = r1
            goto L18
        L13:
            ehj.c r0 = new ehj.c
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126202w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L28
            goto L6d
        L28:
            r0 = move-exception
            r11 = r0
            goto L62
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r13)
            java.lang.Object r13 = r10.f250865a     // Catch: java.lang.Throwable -> L28
            dfj.v2 r13 = (dfj.v2) r13     // Catch: java.lang.Throwable -> L28
            r0.f126202w = r3     // Catch: java.lang.Throwable -> L28
            nfj.a1 r13 = r13.f114130a     // Catch: java.lang.Throwable -> L28
            r5 = r13
            nfj.m1 r5 = (nfj.m1) r5     // Catch: java.lang.Throwable -> L28
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            n8a.r r4 = new n8a.r     // Catch: java.lang.Throwable -> L28
            r9 = 9
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r11 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L28
        L5a:
            if (r11 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L28
        L5f:
            if (r11 != r1) goto L6d
            return r1
        L62:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            java.lang.String r0 = "EsimInstallationEventsTracker"
            rd0.d.a(r13, r0, r8, r11, r12)
        L6d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.w.z(java.lang.String, dej.m1, gim.c):java.lang.Object");
    }

    public w(c6f.e totalValuePerformanceChartUiMapper, c6f.c percentagePerformanceChartUiMapper) {
        Intrinsics.checkNotNullParameter(totalValuePerformanceChartUiMapper, "totalValuePerformanceChartUiMapper");
        Intrinsics.checkNotNullParameter(percentagePerformanceChartUiMapper, "percentagePerformanceChartUiMapper");
        this.f250865a = totalValuePerformanceChartUiMapper;
        this.f250866b = percentagePerformanceChartUiMapper;
    }

    public w(List names, Set record) {
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(record, "record");
        this.f250865a = names;
        this.f250866b = record;
    }

    public w(ChatTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f250865a = inputData;
        this.f250866b = te0.w.y0(new fp3.a(this, 26));
    }

    public w(sf0.h serverErrorParser, kg.o gson) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f250865a = serverErrorParser;
        this.f250866b = gson;
    }

    public w(v2 esimProfilesInteractor, b0 vendorAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(vendorAnalyticsTracker, "vendorAnalyticsTracker");
        this.f250865a = esimProfilesInteractor;
        this.f250866b = vendorAnalyticsTracker;
    }

    public w(qrk.c stocksInsightsInteractor, ecm.q indexDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stocksInsightsInteractor, "stocksInsightsInteractor");
        Intrinsics.checkNotNullParameter(indexDetailsInteractor, "indexDetailsInteractor");
        this.f250865a = stocksInsightsInteractor;
        this.f250866b = indexDetailsInteractor;
    }

    public w(vw1.b aliasRepository, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f250865a = aliasRepository;
        this.f250866b = idempotencyKeyHolder;
    }

    public w(Context context, int i) {
        switch (i) {
            case 27:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f250865a = context;
                this.f250866b = yhm.j.c(yhm.k.NONE, new jj2.a(this, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                com.revolut.network.a colorResolver = new com.revolut.network.a(context, 1);
                Intrinsics.checkNotNullParameter(colorResolver, "colorResolver");
                this.f250865a = colorResolver;
                this.f250866b = af0.b.a();
                break;
        }
    }

    public w(s5i.k helper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f250865a = helper;
        this.f250866b = featureToggleInteractor;
    }

    public w(tnb.g0 juniorFeatureChecker, kbb.c juniorConfigInteractor) {
        Intrinsics.checkNotNullParameter(juniorFeatureChecker, "juniorFeatureChecker");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.f250865a = juniorFeatureChecker;
        this.f250866b = juniorConfigInteractor;
    }

    public w(wsg.b newWalletsInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f250865a = newWalletsInteractor;
        this.f250866b = ratesInteractor;
    }

    public w(wsg.n walletInteractor, h1 freelancerInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        this.f250865a = walletInteractor;
        this.f250866b = freelancerInteractor;
    }

    public w(l4i.a amountConverter, o7.b orderQuoteInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f250865a = orderQuoteInteractor;
        this.f250866b = ratesInteractor;
    }

    public w() {
        this.f250866b = new io.grpc.okhttp.internal.e();
    }

    public w(e8.m mVar, c8.a aVar) {
        this.f250866b = mVar;
        this.f250865a = aVar;
    }
}
