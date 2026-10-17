package k50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends f0 {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j30.c f181172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final md0.b f181173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lg0.c f181174n;
    public final wli.x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z50.l f181175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iki.c f181176q;

    public m(j30.c chatFeatureToggles, md0.b chaosManagementInteractor, lg0.c deeplinkParser, wli.x deeplinkHandler, z50.l uriInlineParamEnricher, iki.c externalDestinationResolver) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chaosManagementInteractor, "chaosManagementInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriInlineParamEnricher, "uriInlineParamEnricher");
        Intrinsics.checkNotNullParameter(externalDestinationResolver, "externalDestinationResolver");
        this.f181172l = chatFeatureToggles;
        this.f181173m = chaosManagementInteractor;
        this.f181174n = deeplinkParser;
        this.o = deeplinkHandler;
        this.f181175p = uriInlineParamEnricher;
        this.f181176q = externalDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k50.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.m.Z2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k50.k
            if (r0 == 0) goto L13
            r0 = r6
            k50.k r0 = (k50.k) r0
            int r1 = r0.f181144w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181144w = r1
            goto L18
        L13:
            k50.k r0 = new k50.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181144w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            j30.c r6 = r4.f181172l
            r6.getClass()
            lg0.c r6 = r4.f181174n
            lg0.e r5 = r6.a(r5)
            if (r5 != 0) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L42:
            java.util.LinkedHashMap r5 = r5.f195040b
            java.lang.String r6 = "id"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L61
            boolean r6 = kotlin.text.d0.W(r5)
            if (r6 == 0) goto L55
            goto L61
        L55:
            r0.f181144w = r3
            java.lang.Object r5 = r4.c3(r5, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.m.b3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r14, gim.c r15) {
        /*
            r13 = this;
            java.lang.String r0 = "subscribed_to_incident_"
            boolean r1 = r15 instanceof k50.l
            if (r1 == 0) goto L15
            r1 = r15
            k50.l r1 = (k50.l) r1
            int r2 = r1.f181163x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f181163x = r2
            goto L1a
        L15:
            k50.l r1 = new k50.l
            r1.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f181163x
            r4 = 14
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 != r6) goto L31
            java.lang.String r14 = r1.u
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L2e
            goto L4f
        L2e:
            r0 = move-exception
            r15 = r0
            goto L6d
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            yhm.o.b(r15)
            md0.b r15 = r13.f181173m     // Catch: java.lang.Exception -> L2e
            md0.e r15 = (md0.e) r15     // Catch: java.lang.Exception -> L2e
            pfm.a r15 = r15.c(r14)     // Catch: java.lang.Exception -> L2e
            r1.u = r14     // Catch: java.lang.Exception -> L2e
            r1.f181163x = r6     // Catch: java.lang.Exception -> L2e
            java.lang.Object r15 = nim.a.a(r15, r1)     // Catch: java.lang.Exception -> L2e
            if (r15 != r2) goto L4f
            return r2
        L4f:
            mii.k r6 = new mii.k     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r15.<init>(r0)     // Catch: java.lang.Exception -> L2e
            r15.append(r14)     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = r15.toString()     // Catch: java.lang.Exception -> L2e
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Exception -> L2e
            int r15 = com.revolut.chat_core.R$string.chat_ongoing_outage_notify_toast     // Catch: java.lang.Exception -> L2e
            r8.<init>(r15, r5, r5, r4)     // Catch: java.lang.Exception -> L2e
            r11 = 0
            r12 = 28
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L2e
            goto L90
        L6d:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            java.lang.String r2 = "Unable to subscribe to incident incidentId="
            java.lang.String r2 = j6.a.q(r2, r14)
            java.lang.String r3 = "ChatDeeplinkExtension"
            rd0.d.a(r1, r3, r2, r15, r0)
            mii.h r6 = new mii.h
            java.lang.String r15 = "subscribed_to_incident_error_"
            java.lang.String r14 = j6.a.q(r15, r14)
            com.revolut.core.ui_kit.models.TextLocalisedClause r15 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.chat_core.R$string.chat_error_something_went_wrong
            r15.<init>(r0, r5, r5, r4)
            r6.<init>(r15, r14)
        L90:
            r13.L2(r6)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.m.c3(java.lang.String, gim.c):java.lang.Object");
    }
}
