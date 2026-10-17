package et6;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l71.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements gr6.r {

    @NotNull
    public static final w3 Companion = new w3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.h0[] f129385c = {a.h0.f192478a};
    public static final a.m[] d = {a.m.f192483a};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f129386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f129387b;

    public y3(pre.c termsInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f129386a = termsInteractor;
        this.f129387b = userCompanyInteractor;
    }

    public static efm.d0 b(l71.d dVar, l71.a[] aVarArr, Function0 function0) {
        if (kotlin.collections.d.I(aVarArr, dVar.b())) {
            return (efm.d0) function0.invoke();
        }
        od0.i.Companion.getClass();
        ufm.b bVarM = efm.d0.m(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof et6.x3
            if (r0 == 0) goto L13
            r0 = r8
            et6.x3 r0 = (et6.x3) r0
            int r1 = r0.f129376w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129376w = r1
            goto L18
        L13:
            et6.x3 r0 = new et6.x3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129376w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L74
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            l61.a r8 = r7.f129387b
            ang.b r8 = (ang.b) r8
            hng.g r8 = r8.f7765a
            efm.r r8 = hng.g.b(r8)
            en6.a r2 = new en6.a
            r5 = 27
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r3, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            et6.u3 r2 = new et6.u3
            r5 = 0
            r2.<init>(r7, r5)
            et6.m0 r5 = new et6.m0
            r6 = 2
            r5.<init>(r6, r2)
            r8.getClass()
            ufm.i r2 = new ufm.i
            r6 = 0
            r2.<init>(r8, r5, r6)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r0.f129376w = r4
            java.lang.Object r8 = nim.a.b(r2, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            vf0.h r8 = (vf0.h) r8
            java.lang.Object r0 = r8.f288433a
            od0.i r0 = (od0.i) r0
            java.lang.Object r1 = r8.f288434b
            od0.i r1 = (od0.i) r1
            java.lang.Object r2 = r8.f288435c
            od0.i r2 = (od0.i) r2
            java.lang.Object r8 = r8.d
            od0.i r8 = (od0.i) r8
            r5 = 4
            com.revolut.feature.freelancer.api.terms.FreelancerTerms[] r5 = new com.revolut.feature.freelancer.api.terms.FreelancerTerms[r5]
            java.lang.Object r0 = r0.f224257a
            com.revolut.feature.terms.api.model.Terms r0 = (com.revolut.feature.terms.api.model.Terms) r0
            if (r0 == 0) goto L95
            com.revolut.feature.freelancer.api.terms.FreelancerTerms$Scoped r6 = new com.revolut.feature.freelancer.api.terms.FreelancerTerms$Scoped
            r6.<init>(r0)
            goto L96
        L95:
            r6 = r3
        L96:
            r0 = 0
            r5[r0] = r6
            java.lang.Object r0 = r1.f224257a
            com.revolut.feature.terms.api.model.Terms r0 = (com.revolut.feature.terms.api.model.Terms) r0
            if (r0 == 0) goto La4
            com.revolut.feature.freelancer.api.terms.FreelancerTerms$Scoped r3 = new com.revolut.feature.freelancer.api.terms.FreelancerTerms$Scoped
            r3.<init>(r0)
        La4:
            r5[r4] = r3
            r0 = 2
            java.lang.Object r1 = r2.f224257a
            r5[r0] = r1
            r0 = 3
            java.lang.Object r8 = r8.f224257a
            r5[r0] = r8
            java.lang.String r8 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            java.util.List r8 = kotlin.collections.d.L(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.y3.a(gim.c):java.lang.Object");
    }
}
