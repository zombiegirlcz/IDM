package kj7;

import com.revolut.feature.insurance.impl.network.InsuranceService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import ke7.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceService f184323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f184324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f184325c;
    public final w4l.f d;

    public f(InsuranceService insuranceService, ne0.d memoryCache, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(insuranceService, "insuranceService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f184323a = insuranceService;
        this.f184324b = memoryCache;
        this.f184325c = fileSystemRepository;
        final int i = 0;
        final int i2 = 1;
        this.d = new w4l.f(new Function2(this) { // from class: kj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f184315b;

            {
                this.f184315b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Map params = (Map) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        InsuranceService insuranceService2 = this.f184315b.f184323a;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        ArrayList arrayList = new ArrayList(params.size());
                        for (Map.Entry entry : params.entrySet()) {
                            arrayList.add(new jj7.c(mo3.a.p((dj0.d) entry.getValue()), (String) entry.getKey()));
                        }
                        d0<jj7.d> cFACClaimCalculatedAmount = insuranceService2.getCFACClaimCalculatedAmount(new jj7.b(arrayList));
                        kce.c cVar = new kce.c(new kh4.b(18), 15);
                        cFACClaimCalculatedAmount.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimCalculatedAmount, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Map params2 = (Map) obj2;
                        ui7.b domain = (ui7.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f184315b.f184324b.f("CLAIM_CALCULATED_AMOUNT_CACHE_PREFIX_" + params2.hashCode(), domain);
                        return Unit.f186387a;
                }
            }
        }, new v(this, 10), new Function2(this) { // from class: kj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f184315b;

            {
                this.f184315b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Map params = (Map) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        InsuranceService insuranceService2 = this.f184315b.f184323a;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        ArrayList arrayList = new ArrayList(params.size());
                        for (Map.Entry entry : params.entrySet()) {
                            arrayList.add(new jj7.c(mo3.a.p((dj0.d) entry.getValue()), (String) entry.getKey()));
                        }
                        d0<jj7.d> cFACClaimCalculatedAmount = insuranceService2.getCFACClaimCalculatedAmount(new jj7.b(arrayList));
                        kce.c cVar = new kce.c(new kh4.b(18), 15);
                        cFACClaimCalculatedAmount.getClass();
                        ufm.i iVar = new ufm.i(cFACClaimCalculatedAmount, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Map params2 = (Map) obj2;
                        ui7.b domain = (ui7.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f184315b.f184324b.f("CLAIM_CALCULATED_AMOUNT_CACHE_PREFIX_" + params2.hashCode(), domain);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kj7.f r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.revolut.feature.insurance.api.models.CFACClaimingFor r19, java.util.List r20, java.util.UUID r21, gim.c r22) {
        /*
            r0 = r22
            r14.getClass()
            boolean r1 = r0 instanceof kj7.c
            if (r1 == 0) goto L18
            r1 = r0
            kj7.c r1 = (kj7.c) r1
            int r2 = r1.f184316w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f184316w = r2
            goto L1d
        L18:
            kj7.c r1 = new kj7.c
            r1.<init>(r14, r0)
        L1d:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f184316w
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            yhm.o.b(r0)
            goto Lbb
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            yhm.o.b(r0)
            com.revolut.feature.insurance.impl.network.InsuranceService r14 = r14.f184323a
            jj7.i0 r0 = new jj7.i0
            java.lang.Object r3 = hj7.b.f152669a
            r5 = r19
            java.lang.String r3 = le.u1.g(r5, r3)
            jj7.j0 r5 = new jj7.j0
            r6 = r17
            r7 = r18
            r5.<init>(r6, r7)
            r0.<init>(r3, r5)
            r3 = r20
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r3, r6)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L63:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La5
            java.lang.Object r6 = r3.next()
            com.revolut.feature.insurance.api.models.CFACClaimExpense r6 = (com.revolut.feature.insurance.api.models.CFACClaimExpense) r6
            jj7.n0 r7 = new jj7.n0
            jj7.p0 r8 = new jj7.p0
            tof.a3 r9 = r6.f74926a
            java.lang.String r10 = r9.f272581b
            dj0.d r11 = r6.f74927b
            if (r11 != 0) goto L7d
            dj0.d r11 = r9.k
        L7d:
            dj0.d r9 = r11.a()
            jo3.a r9 = mo3.a.p(r9)
            r8.<init>(r9, r10)
            jj7.m0 r9 = new jj7.m0
            com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose r10 = r6.f74928c
            java.lang.String r10 = r10.f74996a
            long r11 = r6.d
            r9.<init>(r10, r11)
            jj7.l0 r10 = new jj7.l0
            com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller r11 = r6.f
            java.lang.String r11 = r11.f74993a
            long r12 = r6.e
            r10.<init>(r11, r12)
            r7.<init>(r8, r9, r10)
            r5.add(r7)
            goto L63
        La5:
            jj7.k0 r3 = new jj7.k0
            r7 = r16
            r3.<init>(r7, r15, r0, r5)
            r0 = r21
            efm.d0 r14 = r14.postSubmitCFACClaimInfo(r3, r0)
            r1.f184316w = r4
            java.lang.Object r0 = nim.a.b(r14, r1)
            if (r0 != r2) goto Lbb
            return r2
        Lbb:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj7.f.a(kj7.f, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.revolut.feature.insurance.api.models.CFACClaimingFor, java.util.List, java.util.UUID, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kj7.f r6, java.util.List r7, java.lang.String r8, gim.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof kj7.d
            if (r0 == 0) goto L16
            r0 = r9
            kj7.d r0 = (kj7.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.z = r1
            goto L1b
        L16:
            kj7.d r0 = new kj7.d
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f184318x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r7 = r0.f184317w
            java.util.Iterator r8 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r9)
            r9 = r2
            goto L47
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            yhm.o.b(r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r9 = 0
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L47:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r8.next()
            java.io.File r2 = (java.io.File) r2
            com.revolut.feature.insurance.impl.network.InsuranceService r4 = r6.f184323a
            okhttp3.MultipartBody$Part r2 = r6.d(r2)
            efm.d0 r2 = r4.postUploadCFACClaimDocument(r9, r2)
            r0.u = r9
            r0.v = r8
            r0.f184317w = r7
            r0.z = r3
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r1) goto L47
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kj7.f.b(kj7.f, java.util.List, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:20:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(kj7.f r12, java.util.List r13, java.util.List r14, gim.c r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof kj7.e
            if (r0 == 0) goto L16
            r0 = r15
            kj7.e r0 = (kj7.e) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.F = r1
            goto L1b
        L16:
            kj7.e r0 = new kj7.e
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.D
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L53
            if (r2 != r3) goto L4b
            int r13 = r0.C
            int r14 = r0.B
            int r2 = r0.A
            int r5 = r0.z
            int r6 = r0.f184322y
            java.util.Iterator r7 = r0.f184321x
            java.lang.String r8 = r0.f184320w
            java.util.Iterator r9 = r0.v
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r15)
            r15 = r14
            r14 = r13
            r13 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r0
            r0 = r15
            r15 = r6
            r6 = r5
            r5 = r15
            r15 = r10
            goto L84
        L4b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L53:
            yhm.o.b(r15)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r15 = r4
            r2 = r15
        L5e:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r13.next()
            int r6 = r15 + 1
            if (r15 < 0) goto Lc0
            com.revolut.feature.insurance.api.models.CFACClaimExpense r5 = (com.revolut.feature.insurance.api.models.CFACClaimExpense) r5
            java.lang.Object r7 = r14.get(r15)
            java.lang.String r7 = (java.lang.String) r7
            java.util.List r5 = r5.f74929g
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r8 = r5
            r9 = r7
            r7 = r15
            r5 = r2
            r15 = r14
            r2 = r0
            r14 = r4
            r0 = r14
        L84:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r8.next()
            java.io.File r10 = (java.io.File) r10
            com.revolut.feature.insurance.impl.network.InsuranceService r11 = r12.f184323a
            okhttp3.MultipartBody$Part r10 = r12.d(r10)
            efm.d0 r10 = r11.postUploadCFACExpenseDocument(r9, r10)
            r2.getClass()
            r11 = r15
            java.util.List r11 = (java.util.List) r11
            r2.u = r11
            r2.v = r13
            r2.f184320w = r9
            r2.f184321x = r8
            r2.f184322y = r5
            r2.z = r6
            r2.A = r7
            r2.B = r0
            r2.C = r14
            r2.F = r3
            java.lang.Object r10 = nim.a.b(r10, r2)
            if (r10 != r1) goto L84
            return r1
        Lbb:
            r14 = r15
            r0 = r2
            r2 = r5
            r15 = r6
            goto L5e
        Lc0:
            zhm.v.s()
            r12 = 0
            throw r12
        Lc5:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kj7.f.c(kj7.f, java.util.List, java.util.List, gim.c):java.lang.Object");
    }

    public final MultipartBody$Part d(File file) {
        b1 b1VarB;
        String strJ = ((a80.h) this.f184325c).j(file);
        e1 e1Var = MultipartBody$Part.Companion;
        String name = file.getName();
        p1 p1Var = RequestBody.Companion;
        if (strJ != null) {
            b1.Companion.getClass();
            b1VarB = a1.b(strJ);
        } else {
            b1VarB = null;
        }
        p1Var.getClass();
        k1 k1VarA = p1.a(file, b1VarB);
        e1Var.getClass();
        return e1.c("file", name, k1VarA);
    }
}
