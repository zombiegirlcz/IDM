package t30;

import akd.s;
import com.revolut.chat.domain.model.ChatEntryPoint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30.e f267606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f267607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f267608c;
    public final f01.a d;
    public final df0.b e;

    public f(b30.e suggestionsRepository, d4m.a slotManagerInteractor, j30.c chatFeatureToggles, f01.a uiKitResources, df0.b syncedDateProvider) {
        Intrinsics.checkNotNullParameter(suggestionsRepository, "suggestionsRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        this.f267606a = suggestionsRepository;
        this.f267607b = slotManagerInteractor;
        this.f267608c = chatFeatureToggles;
        this.d = uiKitResources;
        this.e = syncedDateProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t30.f r24, com.revolut.chat.domain.model.ChatEntryPoint r25, gim.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.f.a(t30.f, com.revolut.chat.domain.model.ChatEntryPoint, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r6 == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(t30.f r6, com.revolut.chat.domain.model.ChatEntryPoint r7, gim.c r8) throws java.lang.Throwable {
        /*
            b30.e r0 = r6.f267606a
            boolean r1 = r8 instanceof t30.c
            if (r1 == 0) goto L15
            r1 = r8
            t30.c r1 = (t30.c) r1
            int r2 = r1.f267603w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f267603w = r2
            goto L1a
        L15:
            t30.c r1 = new t30.c
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f267603w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r6)
            goto L7c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r6)
            goto L4e
        L39:
            yhm.o.b(r6)
            r1.f267603w = r4
            b30.d r6 = new b30.d
            r6.<init>(r0, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r7, r6, r1)
            if (r6 != r8) goto L4e
            goto L7b
        L4e:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L69
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 3
            java.util.List r6 = zhm.d0.V0(r6, r7)
            if (r6 == 0) goto L69
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L64
            r6 = r5
        L64:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L69
            return r6
        L69:
            r1.f267603w = r3
            b30.c r6 = new b30.c
            r7 = 0
            r6.<init>(r0, r5, r7)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r7, r6, r1)
            if (r6 != r8) goto L7c
        L7b:
            return r8
        L7c:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.f.b(t30.f, com.revolut.chat.domain.model.ChatEntryPoint, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static s c(ChatEntryPoint chatEntryPoint) {
        String str = chatEntryPoint != null ? chatEntryPoint.f51028a : null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351683903:
                    if (str.equals("crypto")) {
                        return s.AIR_CRYPTO;
                    }
                    break;
                case -1183703051:
                    if (str.equals("invest")) {
                        return s.AIR_INVEST;
                    }
                    break;
                case -287675339:
                    if (str.equals("lifestyle")) {
                        return s.AIR_LIFESTYLE;
                    }
                    break;
                case 3208415:
                    if (str.equals("home")) {
                        return s.AIR_HOME;
                    }
                    break;
                case 1382682413:
                    if (str.equals("payments")) {
                        return s.AIR_PAYMENTS;
                    }
                    break;
            }
        }
        return s.AIR_DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(v30.k0 r5, com.revolut.chat.domain.model.ChatEntryPoint r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t30.d
            if (r0 == 0) goto L13
            r0 = r7
            t30.d r0 = (t30.d) r0
            int r1 = r0.f267604w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267604w = r1
            goto L18
        L13:
            t30.d r0 = new t30.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267604w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L27
            goto L67
        L27:
            r5 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            ekd.i r5 = r5.e
            if (r5 != 0) goto L3b
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L3b:
            com.revolut.feature.slot_manager.api.model.SlotContext r7 = new com.revolut.feature.slot_manager.api.model.SlotContext     // Catch: java.lang.Exception -> L27
            akd.s r6 = c(r6)     // Catch: java.lang.Exception -> L27
            r7.<init>(r6)     // Catch: java.lang.Exception -> L27
            d4m.a r6 = r4.f267607b     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L27
            zjd.a r6 = (zjd.a) r6     // Catch: java.lang.Exception -> L27
            java.util.List r5 = zhm.u.c(r5)     // Catch: java.lang.Exception -> L27
            akd.a r2 = akd.a.OPEN     // Catch: java.lang.Exception -> L27
            r0.f267604w = r3     // Catch: java.lang.Exception -> L27
            skd.i r6 = (skd.i) r6     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r6.e(r7, r5, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L67
            return r1
        L5d:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r7, r0, r0, r5, r6)
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.f.d(v30.k0, com.revolut.chat.domain.model.ChatEntryPoint, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r5, com.revolut.chat.domain.model.ChatEntryPoint r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t30.e
            if (r0 == 0) goto L13
            r0 = r7
            t30.e r0 = (t30.e) r0
            int r1 = r0.f267605w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267605w = r1
            goto L18
        L13:
            t30.e r0 = new t30.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267605w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L27
            goto L7e
        L27:
            r5 = move-exception
            goto L74
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            java.util.ArrayList r7 = p.a.u(r7)
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r5.next()
            v30.k0 r2 = (v30.k0) r2
            ekd.i r2 = r2.e
            if (r2 == 0) goto L39
            r7.add(r2)
            goto L39
        L4d:
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L56
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L56:
            com.revolut.feature.slot_manager.api.model.SlotContext r5 = new com.revolut.feature.slot_manager.api.model.SlotContext     // Catch: java.lang.Exception -> L27
            akd.s r6 = c(r6)     // Catch: java.lang.Exception -> L27
            r5.<init>(r6)     // Catch: java.lang.Exception -> L27
            d4m.a r6 = r4.f267607b     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L27
            zjd.a r6 = (zjd.a) r6     // Catch: java.lang.Exception -> L27
            akd.a r2 = akd.a.VIEW     // Catch: java.lang.Exception -> L27
            r0.f267605w = r3     // Catch: java.lang.Exception -> L27
            skd.i r6 = (skd.i) r6     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r6.e(r5, r7, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L7e
            return r1
        L74:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r7, r0, r0, r5, r6)
        L7e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t30.f.e(java.util.ArrayList, com.revolut.chat.domain.model.ChatEntryPoint, gim.c):java.lang.Object");
    }
}
