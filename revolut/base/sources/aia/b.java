package aia;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.core.navigation.FeatureCommand;
import hr6.l;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements tha.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5227b;

    public b(l freelancerCommandFactory, j freelancerLearnLessonInteractor) {
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerLearnLessonInteractor, "freelancerLearnLessonInteractor");
        this.f5226a = freelancerCommandFactory;
        this.f5227b = freelancerLearnLessonInteractor;
    }

    public final FeatureCommand a(String pocketId, ExtendedSubaccountType type) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(type, "type");
        return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(pocketId, type), ProductId.SUBACCOUNT), null), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof aia.a
            if (r0 == 0) goto L13
            r0 = r8
            aia.a r0 = (aia.a) r0
            int r1 = r0.f5225w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5225w = r1
            goto L18
        L13:
            aia.a r0 = new aia.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5225w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L69
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            ur6.b r8 = ur6.b.SETTLEMENT_TIME
            java.lang.String r2 = "topic"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            w4l.h r4 = w4l.h.f294642c
            java.lang.String r5 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            zjh.j r6 = r7.f5227b
            java.lang.Object r6 = r6.f322839a
            au6.p1 r6 = (au6.p1) r6
            r6.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            x4l.c r2 = r6.d
            vkm.d r8 = r2.b(r8, r4)
            ah1.p r2 = new ah1.p
            r4 = 7
            r2.<init>(r4)
            r4 = 0
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.f5225w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L79
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Home$Destination r8 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Home$Destination
            u09.v r0 = u09.v.PRO
            r8.<init>(r0)
            return r8
        L79:
            com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Lesson$Destination r0 = new com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Lesson$Destination
            java.lang.Object r8 = zhm.d0.b0(r8)
            ur6.a r8 = (ur6.a) r8
            java.lang.String r8 = r8.f282251a
            u09.v r1 = u09.v.PRO
            r0.<init>(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aia.b.b(gim.c):java.lang.Object");
    }
}
