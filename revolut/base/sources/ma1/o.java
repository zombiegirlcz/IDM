package ma1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f203894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da1.d f203895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1.a f203896c;

    public o(d batteryInteractor, da1.d connectionInteractor, ca1.a cardReaderRepository) {
        Intrinsics.checkNotNullParameter(batteryInteractor, "batteryInteractor");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        this.f203894a = batteryInteractor;
        this.f203895b = connectionInteractor;
        this.f203896c = cardReaderRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(ma1.o r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof ma1.m
            if (r0 == 0) goto L16
            r0 = r5
            ma1.m r0 = (ma1.m) r0
            int r1 = r0.f203890w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f203890w = r1
            goto L1b
        L16:
            ma1.m r0 = new ma1.m
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203890w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L50
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L50
            ma1.d r4 = r4.f203894a     // Catch: java.lang.Throwable -> L50
            r0.f203890w = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r5 = r4.a(r0)     // Catch: java.lang.Throwable -> L50
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L50
            int r4 = r5.intValue()     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L50
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L50
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r4)
        L57:
            boolean r4 = r5 instanceof yhm.n
            if (r4 == 0) goto L5c
            r5 = 0
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.o.a(ma1.o, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ma1.l
            if (r0 == 0) goto L13
            r0 = r6
            ma1.l r0 = (ma1.l) r0
            int r1 = r0.f203889x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203889x = r1
            goto L18
        L13:
            ma1.l r0 = new ma1.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203889x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r5 = r0.u
            yhm.o.b(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            da1.d r6 = r4.f203895b
            ma1.t r6 = (ma1.t) r6
            boolean r2 = r6.c()
            if (r2 == 0) goto L4d
            efm.d0 r6 = r6.b()
            r0.u = r5
            r0.f203889x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            ca1.a r6 = r4.f203896c
            ha1.f r6 = (ha1.f) r6
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r0 = r6.b()
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r0 == 0) goto L5e
            r6.e()
        L5e:
            r6.getClass()
            ue0.c r6 = r6.f150353a
            java.lang.String r0 = "cardReader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.reflect.Type r0 = ha1.f.f150352c
            zhm.f0 r1 = zhm.f0.f322471a
            java.lang.String r2 = "KEY_SAVED_CARD_READERS_ID"
            java.lang.Object r0 = r6.v0(r1, r2, r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = zhm.d0.f1(r0)
            r0.remove(r5)
            kotlin.reflect.KTypeProjection$a r5 = kotlin.reflect.KTypeProjection.INSTANCE
            java.lang.Class<com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice> r1 = com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice.class
            kotlin.reflect.KType r1 = kotlin.jvm.internal.o0.b(r1)
            r5.getClass()
            kotlin.reflect.KTypeProjection r5 = kotlin.reflect.KTypeProjection.Companion.a(r1)
            java.lang.Class<java.util.List> r1 = java.util.List.class
            kotlin.reflect.KType r5 = kotlin.jvm.internal.o0.c(r1, r5)
            kotlin.jvm.internal.p0 r1 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KType r5 = r1.d(r5)
            java.lang.reflect.Type r5 = wim.z.d(r5)
            r6.G(r0, r2, r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.o.b(com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice, gim.c):java.lang.Object");
    }
}
