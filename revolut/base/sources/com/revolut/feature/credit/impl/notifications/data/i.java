package com.revolut.feature.credit.impl.notifications.data;

import a09.o;
import com.revolut.feature.credit.impl.notifications.network.CreditCollectionNotificationSettingsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCollectionNotificationSettingsService f70015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f70016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f70017c;
    public final x4l.c d;

    public i(CreditCollectionNotificationSettingsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f70015a = service;
        this.f70016b = memoryCache;
        this.f70017c = storage;
        this.d = new x4l.c(new o(this, null, 24), new Function1() { // from class: com.revolut.feature.credit.impl.notifications.data.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (e) this.f70011a.f70016b.get("credit_collection_notification_settings");
            }
        }, new Function2() { // from class: com.revolut.feature.credit.impl.notifications.data.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                e value = (e) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f70012a.f70016b.f("credit_collection_notification_settings", value);
                return Unit.f186387a;
            }
        }, new g(this, null), new h(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.revolut.feature.credit.impl.notifications.data.i r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof com.revolut.feature.credit.impl.notifications.data.f
            if (r0 == 0) goto L13
            r0 = r5
            com.revolut.feature.credit.impl.notifications.data.f r0 = (com.revolut.feature.credit.impl.notifications.data.f) r0
            int r1 = r0.f70014w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70014w = r1
            goto L18
        L13:
            com.revolut.feature.credit.impl.notifications.data.f r0 = new com.revolut.feature.credit.impl.notifications.data.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f70014w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.credit.impl.notifications.network.CreditCollectionNotificationSettingsService r4 = r4.f70015a
            r0.f70014w = r3
            java.lang.Object r5 = r4.getSettings(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r5 = (retrofit2.Response) r5
            int r4 = r5.code()
            r0 = 204(0xcc, float:2.86E-43)
            if (r4 != r0) goto L4e
            com.revolut.feature.credit.impl.notifications.data.e r4 = new com.revolut.feature.credit.impl.notifications.data.e
            r5 = 0
            r4.<init>(r5)
            return r4
        L4e:
            boolean r4 = r5.isSuccessful()
            if (r4 == 0) goto L6a
            com.revolut.feature.credit.impl.notifications.data.e r4 = new com.revolut.feature.credit.impl.notifications.data.e
            java.lang.Object r5 = r5.body()
            if (r5 == 0) goto L62
            b25.a r5 = (b25.a) r5
            r4.<init>(r5)
            return r4
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        L6a:
            retrofit2.HttpException r4 = new retrofit2.HttpException
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.impl.notifications.data.i.a(com.revolut.feature.credit.impl.notifications.data.i, gim.c):java.lang.Object");
    }
}
