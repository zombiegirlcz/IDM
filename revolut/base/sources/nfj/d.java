package nfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.impl.network.EsimCheckoutService;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCheckoutService f214931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.i f214932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.o f214933c;

    public d(EsimCheckoutService service, ynj.i defaultPollingDurationProvider, kg.o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(defaultPollingDurationProvider, "defaultPollingDurationProvider");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f214931a = service;
        this.f214932b = defaultPollingDurationProvider;
        this.f214933c = gson;
    }

    public static final dej.g a(d dVar, Response response) {
        kfj.d dVar2;
        Long lN;
        Long lN2;
        dVar.getClass();
        ynj.i iVar = dVar.f214932b;
        int iCode = response.code();
        if (200 > iCode || iCode >= 210) {
            throw new HttpException(response);
        }
        ResponseBody responseBody = (ResponseBody) response.body();
        dej.a aVarA = null;
        if (responseBody != null) {
            String strString = responseBody.string();
            if (!kotlin.text.d0.W(strString)) {
                try {
                    if (response.code() == 200 && (dVar2 = (kfj.d) dVar.f214933c.c(strString, kfj.d.class)) != null) {
                        aVarA = ofj.a.a(dVar2);
                    }
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
            }
        }
        dej.a aVar = aVarA;
        ulm.u0 u0VarHeaders = response.headers();
        String strA = u0VarHeaders.a("Retry-After");
        long jA = (strA == null || (lN2 = kotlin.text.z.n(strA)) == null) ? ynj.i.a(iVar) : kotlin.time.c.h(Math.abs(lN2.longValue()), pkm.e.SECONDS);
        String strA2 = u0VarHeaders.a("X-Retry-Timeout");
        return new dej.g(aVar, jA, (strA2 == null || (lN = kotlin.text.z.n(strA2)) == null) ? ynj.i.b(iVar) : kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(nfj.d r16, java.lang.String r17, java.lang.String r18, dj0.d r19, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, gim.c r29) {
        /*
            r0 = r29
            r16.getClass()
            boolean r1 = r0 instanceof nfj.c
            if (r1 == 0) goto L1a
            r1 = r0
            nfj.c r1 = (nfj.c) r1
            int r2 = r1.f214926x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f214926x = r2
            r6 = r16
            goto L21
        L1a:
            nfj.c r1 = new nfj.c
            r6 = r16
            r1.<init>(r6, r0)
        L21:
            java.lang.Object r0 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f214926x
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            kotlin.jvm.internal.Ref$ObjectRef r1 = r1.u
            yhm.o.b(r0)
            goto L6a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.Ref$ObjectRef r3 = p.a.w(r0)
            r0 = r2
            h6i.d0 r2 = new h6i.d0
            r15 = 0
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r21
            r11 = r22
            r13 = r23
            r14 = r24
            r29 = r0
            r0 = r4
            r4 = r25
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.u = r3
            r1.f214926x = r0
            r4 = r27
            java.lang.Object r0 = skm.h2.e(r4, r2, r1)
            r1 = r29
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r3
        L6a:
            java.lang.Object r0 = r1.f186409a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.d.b(nfj.d, java.lang.String, java.lang.String, dj0.d, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, gim.c):java.lang.Object");
    }

    public final Flow c(String idempotencyKey, String planId, dj0.d dVar, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(planId, "planId");
        return com.google.crypto.tink.shaded.protobuf.t1.E(rd0.e.e(new vkm.v1(new b(this, idempotencyKey, planId, dVar, esimDataPlanOfferInfo, str2, str, str3, str4, null, 0)), m72.b.w("EsimCheckoutRepositoryImpl", "observeEsimCheckout"), new im2.b(3, 19, null)));
    }
}
