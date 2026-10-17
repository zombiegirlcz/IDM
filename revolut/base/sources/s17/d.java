package s17;

import au0.j0;
import au6.k2;
import au6.z0;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import efm.r;
import et6.g;
import et6.m0;
import et6.n0;
import et6.w;
import gr6.f;
import java.lang.reflect.Type;
import java.util.List;
import jr6.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import ryd.l;
import vkm.q;
import w4l.h;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f259107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f259108b;

    public d(gr6.a freelancerAccountDetailsInteractor, f freelancerBannerInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerBannerInteractor, "freelancerBannerInteractor");
        this.f259107a = freelancerAccountDetailsInteractor;
        this.f259108b = freelancerBannerInteractor;
    }

    public final Object a(MoveMoneyDestination moveMoneyDestination, gim.c cVar) {
        lr6.d[] elements = {lr6.d.ACCOUNT_CLOSED, lr6.d.ACCOUNT_CLOSED_MANUALLY, lr6.d.INBOUND_OUTBOUND_BLOCKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c(moveMoneyDestination, kotlin.collections.d.y0(elements), cVar);
    }

    public final Object b(Function1 function1, Function2 function2, gim.c cVar) {
        lr6.d[] elements = {lr6.d.ACCOUNT_CLOSED, lr6.d.ACCOUNT_CLOSED_MANUALLY, lr6.d.INBOUND_BLOCKED, lr6.d.INBOUND_OUTBOUND_BLOCKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object objE = e(kotlin.collections.d.y0(elements), function1, function2, cVar);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(aii.u r5, java.util.Set r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof s17.a
            if (r0 == 0) goto L13
            r0 = r7
            s17.a r0 = (s17.a) r0
            int r1 = r0.f259103y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259103y = r1
            goto L18
        L13:
            s17.a r0 = new s17.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f259101w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259103y
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.Set r5 = r0.v
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            aii.u r5 = r0.u
            yhm.o.b(r7)
            goto L49
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r7)
            r0.u = r5
            r7 = r6
            java.util.Set r7 = (java.util.Set) r7
            r0.v = r7
            r0.f259103y = r3
            java.lang.Object r7 = r4.d(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.f186385a
            com.revolut.feature.freelancer.common.models.FreelancerPermissions r0 = (com.revolut.feature.freelancer.common.models.FreelancerPermissions) r0
            java.lang.Object r7 = r7.f186386b
            lr6.d r7 = (lr6.d) r7
            if (r0 == 0) goto L67
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0.f73323c
            if (r1 != 0) goto L67
            lr6.e0 r0 = r0.d
            lr6.e0 r1 = lr6.e0.ANNUAL_INBOUND_VOLUME_NOT_PROVIDED
            if (r0 != r1) goto L67
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$AnnualInboundVolumeDestination r5 = com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig.AnnualInboundVolumeDestination.f73190a
            return r5
        L67:
            if (r7 == 0) goto L74
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L74
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$AccountRestrictionPrompts r5 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$AccountRestrictionPrompts
            r5.<init>(r7)
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s17.d.c(aii.u, java.util.Set, gim.c):java.lang.Object");
    }

    public final Object d(gim.c cVar) {
        g gVar = (g) this.f259107a;
        h loadingStrategy = h.f294642c;
        vkm.d dVarD = gVar.d(loadingStrategy);
        n0 n0Var = (n0) this.f259108b;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarD2 = ((g) n0Var.f129276a).d(loadingStrategy);
        ue0.c cVar2 = ((k2) n0Var.f129277b).d;
        Type type = new TypeToken<List<? extends lr6.d>>() { // from class: com.revolut.feature.freelancer.impl.repositories.FreelancerRepositoryImpl$observeDismissedBanners$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        r map = e.c(cVar2.C0("STORAGE_KEY_BANNERS_DISMISSED", type), kotlin.coroutines.g.f186406a).map(new z0(new j0(27), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = map.map(new m0(0, new w(1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return q.x(q.H(new c(2, null), mo3.a.g(u0.m(dVarD, nim.a.v(u0.m(dVarD2, e.b(map2)), new w(2))), null, new l(25), 1)), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r11.invoke(hr6.a.f154770a, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r11.invoke(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r10.invoke(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [s17.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof s17.b
            if (r0 == 0) goto L13
            r0 = r12
            s17.b r0 = (s17.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            s17.b r0 = new s17.b
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f259105x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L35
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r12)
            goto Lc3
        L3e:
            gim.i r9 = r0.f259104w
            r11 = r9
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            gim.i r9 = r0.v
            r10 = r9
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r12)
            goto L6b
        L50:
            yhm.o.b(r12)
            r12 = r9
            java.util.Set r12 = (java.util.Set) r12
            r0.u = r12
            r12 = r10
            gim.i r12 = (gim.i) r12
            r0.v = r12
            r12 = r11
            gim.i r12 = (gim.i) r12
            r0.f259104w = r12
            r0.z = r6
            java.lang.Object r12 = r8.d(r0)
            if (r12 != r1) goto L6b
            goto Lc2
        L6b:
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r2 = r12.f186385a
            com.revolut.feature.freelancer.common.models.FreelancerPermissions r2 = (com.revolut.feature.freelancer.common.models.FreelancerPermissions) r2
            java.lang.Object r12 = r12.f186386b
            lr6.d r12 = (lr6.d) r12
            r6 = 0
            if (r2 == 0) goto L98
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            boolean r7 = r2.f73323c
            if (r7 != 0) goto L98
            lr6.e0 r2 = r2.d
            lr6.e0 r7 = lr6.e0.ANNUAL_INBOUND_VOLUME_NOT_PROVIDED
            if (r2 != r7) goto L98
            r0.u = r6
            r0.v = r6
            r0.f259104w = r6
            r0.z = r5
            hr6.a r9 = hr6.a.f154770a
            java.lang.Object r9 = r11.invoke(r9, r0)
            if (r9 != r1) goto Lc3
            goto Lc2
        L98:
            if (r12 == 0) goto Lb4
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto Lb4
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor r9 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor
            r9.<init>(r12)
            r0.u = r6
            r0.v = r6
            r0.f259104w = r6
            r0.z = r4
            java.lang.Object r9 = r11.invoke(r9, r0)
            if (r9 != r1) goto Lc3
            goto Lc2
        Lb4:
            r0.u = r6
            r0.v = r6
            r0.f259104w = r6
            r0.z = r3
            java.lang.Object r9 = r10.invoke(r0)
            if (r9 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s17.d.e(java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }
}
