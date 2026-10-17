package qac;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayDeliveryTrackingService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pac.m;
import pti.s;
import q97.l1;
import q97.q2;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayDeliveryTrackingService f244022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f244023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f244024c;
    public final ue0.c d;
    public final re0.c e;
    public final re0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re0.c f244025g;

    public i(RevolutPayDeliveryTrackingService deliveryService, j orderDetailsMemoryCache, j deliveriesMemoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(deliveryService, "deliveryService");
        Intrinsics.checkNotNullParameter(orderDetailsMemoryCache, "orderDetailsMemoryCache");
        Intrinsics.checkNotNullParameter(deliveriesMemoryCache, "deliveriesMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f244022a = deliveryService;
        this.f244023b = orderDetailsMemoryCache;
        this.f244024c = deliveriesMemoryCache;
        this.d = storage;
        re0.d dVar = new re0.d(orderDetailsMemoryCache, storage);
        l1 l1Var = new l1(this, 25);
        q2 q2Var = new q2(16);
        q2 q2Var2 = new q2(17);
        Continuation continuation = null;
        pti.d dVar2 = new pti.d(this, continuation, 5);
        Type type = new TypeToken<m>() { // from class: com.revolut.feature.revolutpay.order_tracking.impl.data.repository.TrackingRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.e = new re0.c(dVar, l1Var, type, q2Var, q2Var2, dVar2);
        re0.d dVar3 = new re0.d(orderDetailsMemoryCache, storage);
        l1 l1Var2 = new l1(26);
        q2 q2Var3 = new q2(18);
        q2 q2Var4 = new q2(19);
        s sVar = new s(this, continuation, 2);
        Type type2 = new TypeToken<pac.d>() { // from class: com.revolut.feature.revolutpay.order_tracking.impl.data.repository.TrackingRepositoryImpl$special$$inlined$invoke$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        this.f = new re0.c(dVar3, l1Var2, type2, q2Var3, q2Var4, sVar);
        re0.d dVar4 = new re0.d(deliveriesMemoryCache, storage);
        l1 l1Var3 = new l1(this, 27);
        q2 q2Var5 = new q2(20);
        q2 q2Var6 = new q2(21);
        pti.d dVar5 = new pti.d(this, continuation, 4);
        Type type3 = new TypeToken<pac.a>() { // from class: com.revolut.feature.revolutpay.order_tracking.impl.data.repository.TrackingRepositoryImpl$special$$inlined$invoke$3
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        this.f244025g = new re0.c(dVar4, l1Var3, type3, q2Var5, q2Var6, dVar5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qac.i r4, java.lang.String r5, kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof qac.h
            if (r0 == 0) goto L13
            r0 = r7
            qac.h r0 = (qac.h) r0
            int r1 = r0.f244021w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244021w = r1
            goto L18
        L13:
            qac.h r0 = new qac.h
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244021w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L65
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            ne0.j r7 = r4.f244023b
            java.lang.String r2 = "TRACKING_ORDER_DETAILS_KEY_"
            java.lang.Object r7 = ip0.v7.r(r2, r5, r7)
            pac.m r7 = (pac.m) r7
            if (r7 != 0) goto L41
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L41:
            java.util.List r2 = r7.getDeliveries()
            if (r2 != 0) goto L49
            zhm.f0 r2 = zhm.f0.f322471a
        L49:
            java.lang.Object r6 = r6.invoke(r2)
            java.util.List r6 = (java.util.List) r6
            re0.c r2 = r4.e
            pac.m r6 = pac.m.a(r7, r6)
            r0.f244021w = r3
            x4l.c r7 = r2.f253483a
            java.lang.Object r5 = r7.f(r5, r6, r0)
            if (r5 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L62:
            if (r5 != r1) goto L65
            return r1
        L65:
            ne0.j r4 = r4.f244024c
            r4.clear()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qac.i.a(qac.i, java.lang.String, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
