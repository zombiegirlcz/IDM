package tpj;

import com.revolut.retail.feature.impl.analytics_cycle.air_tip.network.AnalyticsAirTipService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od0.e;
import org.jetbrains.annotations.NotNull;
import pti.s;
import tp8.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAirTipService f273412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f273413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f273414c;
    public final x4l.c d;

    public d(AnalyticsAirTipService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f273412a = service;
        this.f273413b = memoryCache;
        this.f273414c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 18), new tjf.e(this, 29), new l(this, 2), new tk5.c(this, continuation, 6), new ska.c(this, continuation, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(tpj.d r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof tpj.b
            if (r0 == 0) goto L13
            r0 = r8
            tpj.b r0 = (tpj.b) r0
            int r1 = r0.f273410w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f273410w = r1
            goto L18
        L13:
            tpj.b r0 = new tpj.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f273410w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            com.revolut.retail.feature.impl.analytics_cycle.air_tip.network.AnalyticsAirTipService r7 = r7.f273412a
            r0.f273410w = r3
            java.lang.Object r8 = r7.getCurrentAirTip(r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r8 = (retrofit2.Response) r8
            int r7 = r8.code()
            r0 = 204(0xcc, float:2.86E-43)
            if (r7 != r0) goto L4f
            od0.h r7 = od0.i.Companion
            r7.getClass()
            od0.i r7 = od0.i.f224256b
            return r7
        L4f:
            boolean r7 = r8.isSuccessful()
            if (r7 == 0) goto L8d
            od0.h r7 = od0.i.Companion
            java.lang.Object r8 = r8.body()
            if (r8 == 0) goto L85
            spj.a r8 = (spj.a) r8
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            lzi.a r1 = new lzi.a
            java.lang.String r2 = r8.getId()
            java.lang.String r3 = r8.getAirTipTypeId()
            java.lang.String r4 = r8.getTitle()
            java.lang.String r5 = r8.getTip()
            java.lang.String r6 = r8.getPrompt()
            r1.<init>(r2, r3, r4, r5, r6)
            r7.getClass()
            od0.i r7 = od0.h.a(r1)
            return r7
        L85:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L8d:
            retrofit2.HttpException r7 = new retrofit2.HttpException
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tpj.d.a(tpj.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r3.d(r8, false, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof tpj.c
            if (r0 == 0) goto L13
            r0 = r9
            tpj.c r0 = (tpj.c) r0
            int r1 = r0.f273411w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f273411w = r1
            goto L18
        L13:
            tpj.c r0 = new tpj.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f273411w
            x4l.c r3 = r7.d
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r9)
            goto L6b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L5f
        L3b:
            yhm.o.b(r9)
            goto L4d
        L3f:
            yhm.o.b(r9)
            r0.f273411w = r6
            com.revolut.retail.feature.impl.analytics_cycle.air_tip.network.AnalyticsAirTipService r9 = r7.f273412a
            java.lang.Object r8 = r9.registerInteraction(r8, r0)
            if (r8 != r1) goto L4d
            goto L6a
        L4d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            od0.h r9 = od0.i.Companion
            r9.getClass()
            r0.f273411w = r5
            od0.i r9 = od0.i.f224256b
            java.lang.Object r8 = r3.f(r8, r9, r0)
            if (r8 != r1) goto L5f
            goto L6a
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r0.f273411w = r4
            r9 = 0
            java.lang.Object r8 = r3.d(r8, r9, r0)
            if (r8 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tpj.d.b(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        this.f273413b.remove("analytics_air_tip");
        this.f273414c.clear();
    }
}
