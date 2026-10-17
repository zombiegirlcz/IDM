package pfk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements dha.b {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Type f235682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Type f235683n;
    public static final Type o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f235684p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f235685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FamilyPlanService f235686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f235687c;
    public final ifk.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f235688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f235689h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f235690j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f235691l;

    static {
        Type type = new TypeToken<afk.b>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.FamilyPlansRepositoryImpl$Companion$FAMILY_MEMBER_ELIGIBILITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f235682m = type;
        Type type2 = new TypeToken<mfk.a>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.FamilyPlansRepositoryImpl$Companion$FAMILY_INVITATIONS_RESPONSE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f235683n = type2;
        Type type3 = new TypeToken<lfk.a>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.FamilyPlansRepositoryImpl$Companion$FAMILY_DTO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        o = type3;
        Type type4 = new TypeToken<afk.c>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.FamilyPlansRepositoryImpl$Companion$FAMILY_SUBSCRIBE_INFO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        f235684p = type4;
    }

    public s(ne0.j memoryCache, FamilyPlanService service, xe0.e storage, ifk.c pricingPlanCancelScreenConfigDtoMapper) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(pricingPlanCancelScreenConfigDtoMapper, "pricingPlanCancelScreenConfigDtoMapper");
        this.f235685a = memoryCache;
        this.f235686b = service;
        this.f235687c = storage;
        this.d = pricingPlanCancelScreenConfigDtoMapper;
        Continuation continuation = null;
        this.e = new x4l.c(new o29.l(this, continuation, 17), new f(this, 4), new g(this, 7), new n(this, continuation, 0), new l1(this, continuation, 28));
        int i = 2;
        this.f = new x4l.c(new o29.l(this, continuation, 20), new f(this, 7), new g(this, 0), new n(this, continuation, 5), new q(this, continuation, i));
        o oVar = new o(this, continuation, i);
        int i2 = 1;
        f fVar = new f(this, i2);
        g gVar = new g(this, i2);
        p pVar = new p(this, continuation, i2);
        int i3 = 3;
        this.f235688g = new x4l.c(oVar, fVar, gVar, pVar, new p24.q(this, continuation, i3));
        o oVar2 = new o(this, continuation, i3);
        int i5 = 2;
        int i6 = 1;
        this.f235689h = new x4l.c(oVar2, new f(this, i5), new g(this, i5), new n(this, continuation, 4), new q(this, continuation, i6));
        o oVar3 = new o(this, continuation, i6);
        int i21 = 3;
        this.i = new x4l.c(oVar3, new f(this, i21), new g(this, i21), new n(this, continuation, 1), new l1(this, continuation, 29));
        this.f235690j = yhm.j.b(new os2.a(this, 26));
        int i22 = 5;
        this.k = new x4l.c(new o29.l(this, continuation, 18), new f(this, i22), new g(this, i22), new mqc.p(2, 20, continuation), new nfj.i(3, 9, continuation));
        int i32 = 6;
        this.f235691l = new x4l.c(new o(this, continuation, 0), new f(this, i32), new g(this, i32), new p(this, continuation, 0), new p24.q(this, continuation, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r8.e(r11, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pfk.s r8, java.lang.String r9, java.lang.String r10, gim.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof pfk.r
            if (r0 == 0) goto L16
            r0 = r11
            pfk.r r0 = (pfk.r) r0
            int r1 = r0.f235681y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f235681y = r1
            goto L1b
        L16:
            pfk.r r0 = new pfk.r
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f235679w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235681y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            goto La9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r10 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r11)
            goto L8e
        L3e:
            yhm.o.b(r11)
            ne0.j r11 = r8.f235685a
            java.lang.String r2 = "PENDING_INVITATIONS_KEY"
            java.lang.Object r11 = r11.get(r2)
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L50
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L50:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L5b:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r11.next()
            r6 = r5
            lha.h r6 = (lha.h) r6
            java.lang.String r7 = r6.f195209b
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r9)
            if (r7 == 0) goto L79
            java.lang.String r6 = r6.f195208a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r10)
            if (r6 == 0) goto L79
            goto L5b
        L79:
            r2.add(r5)
            goto L5b
        L7d:
            x4l.c r11 = r8.f235688g
            kotlin.Unit r5 = kotlin.Unit.f186387a
            r0.u = r9
            r0.v = r10
            r0.f235681y = r4
            java.lang.Object r11 = r11.f(r5, r2, r0)
            if (r11 != r1) goto L8e
            goto La8
        L8e:
            kotlin.Lazy r8 = r8.f235690j
            java.lang.Object r8 = r8.getValue()
            x4l.c r8 = (x4l.c) r8
            pfk.l r11 = new pfk.l
            r11.<init>(r9, r10)
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f235681y = r3
            java.lang.Object r8 = r8.e(r11, r0)
            if (r8 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pfk.s.a(pfk.s, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static String b(String str) {
        return j6.a.q("FAMILY_CURRENT", str);
    }

    public static String c(k kVar) {
        return "FAMILY_SUBSCRIBE_INFO__" + kVar.f235649a + "_" + kVar.f235650b;
    }
}
