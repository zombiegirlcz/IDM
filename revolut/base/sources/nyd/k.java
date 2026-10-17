package nyd;

import au6.k0;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.statements.impl.documents_hub.service.DocumentsHubService;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mqc.p;
import n8i.b1;
import nfj.l1;
import org.jetbrains.annotations.NotNull;
import wxd.t;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentsHubService f220859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f220860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f220861c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    public k(DocumentsHubService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f220859a = service;
        this.f220860b = memoryCache;
        this.f220861c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new mtj.k(this, continuation, 24), new Function1(this) { // from class: nyd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f220845b;

            {
                this.f220845b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        f params = (f) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (t) this.f220845b.f220860b.get(k.e(params));
                    default:
                        e params2 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StatementUrlState) v7.r("documents_hub_request_status", params2.f220848a, this.f220845b.f220860b);
                }
            }
        }, new Function2(this) { // from class: nyd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f220847b;

            {
                this.f220847b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f params = (f) obj2;
                        t screen = (t) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        this.f220847b.f220860b.f(k.e(params), screen);
                        break;
                    default:
                        e params2 = (e) obj2;
                        StatementUrlState value = (StatementUrlState) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f220847b.f220860b;
                        String strQ = j6.a.q("documents_hub_request_status", params2.f220848a);
                        if (value instanceof StatementUrlState.Ready) {
                            jVar.f(strQ, value);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new nwc.f(this, continuation, 7), new l1(this, continuation, 5));
        final int i2 = 1;
        this.e = new x4l.c(new mtj.k(this, continuation, 22), new Function1(this) { // from class: nyd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f220845b;

            {
                this.f220845b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f params = (f) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (t) this.f220845b.f220860b.get(k.e(params));
                    default:
                        e params2 = (e) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StatementUrlState) v7.r("documents_hub_request_status", params2.f220848a, this.f220845b.f220860b);
                }
            }
        }, new Function2(this) { // from class: nyd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f220847b;

            {
                this.f220847b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f params = (f) obj2;
                        t screen = (t) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        this.f220847b.f220860b.f(k.e(params), screen);
                        break;
                    default:
                        e params2 = (e) obj2;
                        StatementUrlState value = (StatementUrlState) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f220847b.f220860b;
                        String strQ = j6.a.q("documents_hub_request_status", params2.f220848a);
                        if (value instanceof StatementUrlState.Ready) {
                            jVar.f(strQ, value);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(2, 13, continuation), new nfj.i(3, 5, continuation));
        this.f = new x4l.c(new mtj.k(this, continuation, 23), new b1(this, 5), new k0(this, 7), new nwc.f(this, continuation, 6), new l1(this, continuation, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (skm.k0.b(2000, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:33:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:33:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nyd.k r10, java.lang.String r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof nyd.h
            if (r0 == 0) goto L13
            r0 = r12
            nyd.h r0 = (nyd.h) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            nyd.h r0 = new nyd.h
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f220853x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3a
            if (r2 != r4) goto L32
            int r11 = r0.f220852w
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r2 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r12)
            goto L83
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            int r11 = r0.f220852w
            java.lang.String r2 = r0.u
            yhm.o.b(r12)
            r7 = r2
            goto L65
        L43:
            yhm.o.b(r12)
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r12 = new com.revolut.feature.statements.api.models.StatementUrlState$InPreparation
            r12.<init>(r5, r6, r5)
            r2 = r6
        L4c:
            r7 = 4
            if (r2 >= r7) goto L88
            if (r2 != r3) goto L53
            r12 = r6
            goto L54
        L53:
            r12 = 0
        L54:
            r0.u = r11
            r0.v = r5
            r0.f220852w = r2
            r0.z = r6
            java.lang.Object r12 = r10.c(r0, r11, r12)
            if (r12 != r1) goto L63
            goto L82
        L63:
            r7 = r11
            r11 = r2
        L65:
            r2 = r12
            com.revolut.feature.statements.api.models.StatementUrlState r2 = (com.revolut.feature.statements.api.models.StatementUrlState) r2
            boolean r12 = r2 instanceof com.revolut.feature.statements.api.models.StatementUrlState.InPreparation
            if (r12 != 0) goto L6d
            return r2
        L6d:
            if (r11 >= r3) goto L83
            r0.u = r7
            r12 = r2
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r12 = (com.revolut.feature.statements.api.models.StatementUrlState.InPreparation) r12
            r0.v = r12
            r0.f220852w = r11
            r0.z = r4
            r8 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r12 = skm.k0.b(r8, r0)
            if (r12 != r1) goto L83
        L82:
            return r1
        L83:
            r12 = r2
            int r2 = r11 + 1
            r11 = r7
            goto L4c
        L88:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.k.a(nyd.k, java.lang.String, gim.c):java.lang.Object");
    }

    public static final String b(k kVar, String str) {
        return j6.a.q("documents_hub_products_", str);
    }

    public static String e(f fVar) {
        String str = fVar.f220849a;
        String str2 = fVar.f220850b;
        if (str2 == null) {
            str2 = null;
        }
        return a0.d.s("documents_hub_screen_", str, "_", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nyd.g
            if (r0 == 0) goto L13
            r0 = r5
            nyd.g r0 = (nyd.g) r0
            int r1 = r0.f220851w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220851w = r1
            goto L18
        L13:
            nyd.g r0 = new nyd.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220851w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f220851w = r3
            com.revolut.feature.statements.impl.documents_hub.service.DocumentsHubService r5 = r4.f220859a
            java.lang.Object r5 = r5.getDocumentRequestStatus(r6, r7, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            hyd.y0 r5 = (hyd.y0) r5
            java.time.format.DateTimeFormatter r6 = kyd.a.f190694a
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r6 = r5.f156842a
            java.lang.String r7 = "IN_PREPARATION"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            r0 = 0
            if (r7 == 0) goto L57
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r5 = new com.revolut.feature.statements.api.models.StatementUrlState$InPreparation
            r5.<init>(r0, r3, r0)
            return r5
        L57:
            java.lang.String r7 = "READY"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L7a
            java.lang.String r5 = r5.f156843b
            if (r5 == 0) goto L72
            boolean r6 = kotlin.text.d0.W(r5)
            if (r6 != 0) goto L6a
            r0 = r5
        L6a:
            if (r0 == 0) goto L72
            com.revolut.feature.statements.api.models.StatementUrlState$Ready r5 = new com.revolut.feature.statements.api.models.StatementUrlState$Ready
            r5.<init>(r0)
            return r5
        L72:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "READY status contains no download URL"
            r5.<init>(r6)
            throw r5
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.f156842a
            java.lang.String r7 = "Unknown document request status: "
            java.lang.String r5 = j6.a.q(r7, r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.k.c(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof nyd.i
            if (r0 == 0) goto L13
            r0 = r13
            nyd.i r0 = (nyd.i) r0
            int r1 = r0.f220855w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220855w = r1
            goto L18
        L13:
            nyd.i r0 = new nyd.i
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220855w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            nyd.j r4 = new nyd.j
            r9 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            r0.f220855w = r3
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L49
            return r1
        L49:
            wxd.p r13 = (wxd.p) r13
            java.lang.String r11 = r13.f300876a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nyd.k.d(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
