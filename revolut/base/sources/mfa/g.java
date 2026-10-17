package mfa;

import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$ForcePostActivationAfterSignUp;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationRequestFlag;
import gfa.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;
import z9h.n;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfa.e f204973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9k.a f204974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f204975c;
    public final ang.f d;

    public g(qfa.e repository, x9k.a pcwAuthInteractor, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pcwAuthInteractor, "pcwAuthInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f204973a = repository;
        this.f204974b = pcwAuthInteractor;
        this.f204975c = featureToggleInteractor;
        this.d = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mfa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mfa.c
            if (r0 == 0) goto L13
            r0 = r7
            mfa.c r0 = (mfa.c) r0
            int r1 = r0.f204968w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204968w = r1
            goto L1a
        L13:
            mfa.c r0 = new mfa.c
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204968w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            qfa.e r7 = r6.f204973a
            ue0.c r7 = r7.f245284c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "POST_ACTIVATION_STEP_CONTACTS_SYNC_SEEN"
            java.lang.Object r7 = z9h.n.h(r4, r7, r5, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            r0.f204968w = r3
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mfa.a
    public final Object b(boolean z, gim.c cVar) {
        gfa.a aVarA;
        qfa.e eVar = this.f204973a;
        ue0.c cVar2 = eVar.f245284c;
        Boolean bool = Boolean.FALSE;
        Class cls = Boolean.TYPE;
        boolean zBooleanValue = ((Boolean) n.h(cls, cVar2, "POST_ACTIVATION_COMPLETED_KEY", bool)).booleanValue();
        a.d dVar = a.d.f143374a;
        if (!zBooleanValue) {
            PostActivationApi$Toggles$ForcePostActivationAfterSignUp postActivationApi$Toggles$ForcePostActivationAfterSignUp = PostActivationApi$Toggles$ForcePostActivationAfterSignUp.f80930c;
            jte.d dVar2 = (jte.d) this.f204975c;
            if (dVar2.c(postActivationApi$Toggles$ForcePostActivationAfterSignUp)) {
                return h(cVar);
            }
            ofa.b bVar = (ofa.b) j6.a.k(ofa.b.class, eVar.f245284c, "POST_ACTIVATION_FLOW_KEY");
            if (bVar != null) {
                aVarA = nfa.b.a(bVar);
                if (aVarA.equals(a.k.f143381a) || aVarA.equals(a.j.f143380a)) {
                    aVarA = dVar;
                }
            } else {
                aVarA = null;
            }
            if (aVarA != null) {
                return aVarA;
            }
            if (z || (dVar2.c(PostActivationApi$Toggles$PostActivationRequestFlag.f80931c) && ((Boolean) n.h(cls, eVar.f245284c, "POST_ACTIVATION_NEEDED_KEY", bool)).booleanValue())) {
                return h(cVar);
            }
        }
        return dVar;
    }

    @Override // mfa.a
    public final Object c(rfa.e eVar) {
        this.f204973a.a();
        return Unit.f186387a;
    }

    @Override // mfa.a
    public final void d() {
        qfa.e eVar = this.f204973a;
        eVar.f245284c.I0("POST_ACTIVATION_FLOW_KEY");
        ue0.c cVar = eVar.f245284c;
        cVar.G(Boolean.TRUE, "POST_ACTIVATION_COMPLETED_KEY", z.d(o0.b(Boolean.TYPE)));
        cVar.I0("POST_ACTIVATION_NEEDED_KEY");
    }

    @Override // mfa.a
    public final Object e(rfa.e eVar) {
        this.f204973a.b();
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mfa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mfa.d
            if (r0 == 0) goto L13
            r0 = r7
            mfa.d r0 = (mfa.d) r0
            int r1 = r0.f204969w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204969w = r1
            goto L1a
        L13:
            mfa.d r0 = new mfa.d
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204969w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            qfa.e r7 = r6.f204973a
            ue0.c r7 = r7.f245284c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "POST_ACTIVATION_STEP_PROFILE_SEEN"
            java.lang.Object r7 = z9h.n.h(r4, r7, r5, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            r0.f204969w = r3
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.g.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mfa.e
            if (r0 == 0) goto L13
            r0 = r6
            mfa.e r0 = (mfa.e) r0
            int r1 = r0.f204970w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204970w = r1
            goto L18
        L13:
            mfa.e r0 = new mfa.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204970w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L48
        L28:
            r6 = move-exception
            goto L4b
        L2a:
            r6 = move-exception
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            ang.f r6 = r5.d     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            zmg.d r6 = r6.d     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            efm.k r6 = r6.c()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f204970w = r4     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = nim.a.i(r6, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L48
            return r1
        L48:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L55
        L4b:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r6, r0)
            r6 = r3
        L55:
            if (r6 == 0) goto L5f
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L5f
            wi0.b r3 = nz8.d.g(r6)
        L5f:
            boolean r6 = com.bumptech.glide.d.s(r3)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.g.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mfa.f
            if (r0 == 0) goto L13
            r0 = r7
            mfa.f r0 = (mfa.f) r0
            int r1 = r0.f204972x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204972x = r1
            goto L18
        L13:
            mfa.f r0 = new mfa.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204972x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ofa.b r0 = r0.u
            yhm.o.b(r7)
            goto L8e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L62
        L38:
            yhm.o.b(r7)
            qfa.e r7 = r6.f204973a
            r7.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.h r5 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            x4l.c r7 = r7.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r7 = r7.b(r2, r5)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.d(r7, r2)
            zfd.e r7 = zi0.c.w(r7)
            r0.f204972x = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L62
            goto L8c
        L62:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            if (r7 == 0) goto L6e
            java.lang.Object r2 = r7.getContent()
            ofa.b r2 = (ofa.b) r2
            if (r2 != 0) goto L70
        L6e:
            ofa.b r2 = ofa.b.VIRTUAL_CARD_AND_TOPUP
        L70:
            if (r7 == 0) goto L79
            java.lang.Object r7 = r7.getContent()
            ofa.b r7 = (ofa.b) r7
            goto L7a
        L79:
            r7 = 0
        L7a:
            if (r7 == 0) goto L8f
            x9k.a r7 = r6.f204974b
            pfm.a r7 = r7.a()
            r0.u = r2
            r0.f204972x = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r0 = r2
        L8e:
            r2 = r0
        L8f:
            gfa.a r7 = nfa.b.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.g.h(gim.c):java.lang.Object");
    }
}
