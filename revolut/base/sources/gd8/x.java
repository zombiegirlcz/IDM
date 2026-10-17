package gd8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentRequestService;
import dp4.z0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements q {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f143110g = new TypeToken<List<? extends ed8.c>>() { // from class: com.revolut.feature.junior_consent.impl.data.repository.JuniorConsentRequestRepositoryImpl$Companion$JUNIOR_CONSENT_REQUESTS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorConsentRequestService f143111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f143112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f143113c;
    public final x4l.c d;
    public final kgm.i e;
    public final kgm.i f;

    public x(JuniorConsentRequestService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f143111a = service;
        this.f143112b = memoryCache;
        this.f143113c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new e6d.f(this, continuation, 12), new Function1(this) { // from class: gd8.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f143103b;

            {
                this.f143103b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f143103b.f143112b.get("CACHE_KEY_JUNIOR_CONSENT_REQUEST");
                    case 1:
                        String consentRequestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId, "consentRequestId");
                        return this.f143103b.f143111a.approveConsentRequest(consentRequestId);
                    default:
                        String consentRequestId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId2, "consentRequestId");
                        return this.f143103b.f143111a.rejectConsentRequest(consentRequestId2);
                }
            }
        }, new g75.i(this, 20), new g85.f(this, continuation, 7), new z0(this, continuation, 21));
        final int i2 = 1;
        this.e = new kgm.i(new Function1(this) { // from class: gd8.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f143103b;

            {
                this.f143103b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f143103b.f143112b.get("CACHE_KEY_JUNIOR_CONSENT_REQUEST");
                    case 1:
                        String consentRequestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId, "consentRequestId");
                        return this.f143103b.f143111a.approveConsentRequest(consentRequestId);
                    default:
                        String consentRequestId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId2, "consentRequestId");
                        return this.f143103b.f143111a.rejectConsentRequest(consentRequestId2);
                }
            }
        });
        final int i3 = 2;
        this.f = new kgm.i(new Function1(this) { // from class: gd8.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f143103b;

            {
                this.f143103b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f143103b.f143112b.get("CACHE_KEY_JUNIOR_CONSENT_REQUEST");
                    case 1:
                        String consentRequestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId, "consentRequestId");
                        return this.f143103b.f143111a.approveConsentRequest(consentRequestId);
                    default:
                        String consentRequestId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentRequestId2, "consentRequestId");
                        return this.f143103b.f143111a.rejectConsentRequest(consentRequestId2);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (c(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gd8.t
            if (r0 == 0) goto L13
            r0 = r7
            gd8.t r0 = (gd8.t) r0
            int r1 = r0.f143105x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143105x = r1
            goto L18
        L13:
            gd8.t r0 = new gd8.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143105x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            kgm.i r7 = r5.e
            efm.b r7 = r7.j(r6)
            r0.u = r6
            r0.f143105x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L4c
            goto L57
        L4c:
            r7 = 0
            r0.u = r7
            r0.f143105x = r3
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gd8.x.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (c(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gd8.u
            if (r0 == 0) goto L13
            r0 = r7
            gd8.u r0 = (gd8.u) r0
            int r1 = r0.f143107x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143107x = r1
            goto L18
        L13:
            gd8.u r0 = new gd8.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143107x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            kgm.i r7 = r5.f
            efm.b r7 = r7.j(r6)
            r0.u = r6
            r0.f143107x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L4c
            goto L57
        L4c:
            r7 = 0
            r0.u = r7
            r0.f143107x = r3
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gd8.x.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r3.f(r8, (java.util.List) r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof gd8.w
            if (r0 == 0) goto L13
            r0 = r9
            gd8.w r0 = (gd8.w) r0
            int r1 = r0.f143109w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143109w = r1
            goto L18
        L13:
            gd8.w r0 = new gd8.w
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143109w
            x4l.c r3 = r7.d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            goto L6a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L5d
        L38:
            yhm.o.b(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            w4l.j r2 = w4l.j.f294644c
            vkm.d r9 = r3.b(r9, r2)
            gcc.c r2 = new gcc.c
            r6 = 4
            r2.<init>(r6)
            r6 = 0
            jhi.b r9 = mo3.a.g(r9, r6, r2, r5)
            f1l.e r2 = new f1l.e
            r6 = 2
            r2.<init>(r9, r8, r6)
            r0.f143109w = r5
            java.lang.Object r9 = vkm.q.x(r2, r0)
            if (r9 != r1) goto L5d
            goto L69
        L5d:
            java.util.List r9 = (java.util.List) r9
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r0.f143109w = r4
            java.lang.Object r8 = r3.f(r8, r9, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gd8.x.c(java.lang.String, gim.c):java.lang.Object");
    }
}
