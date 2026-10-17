package rqd;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qtb.o;
import rnd.d0;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements xld.c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzi.a f256526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f256527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f256528c;

    public g(wzi.a incomeSorterInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, n walletInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f256526a = incomeSorterInteractor;
        this.f256527b = transactionsInteractor;
        this.f256528c = walletInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof c;
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.j jVar = w4l.j.f294644c;
        Continuation continuation = null;
        return rd0.e.e(mo3.a.g(xam.a.h(new f(this, continuation, 0), rd0.e.b(this.f256528c.X(AccountId.Personal.f51414a, jVar))), null, new d0(13), 1), h0.f322473a, new o(3, 11, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.ui_kit.delegates.t r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rqd.e
            if (r0 == 0) goto L13
            r0 = r8
            rqd.e r0 = (rqd.e) r0
            int r1 = r0.f256524w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256524w = r1
            goto L1a
        L13:
            rqd.e r0 = new rqd.e
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256524w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            r8.getClass()
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r8 = r7.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r7 = r7.f54722b
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$b r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.b.f51608a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 != 0) goto Lc1
            boolean r2 = r8 instanceof com.revolut.core.ui_kit.delegates.h
            if (r2 == 0) goto L4b
            goto Lc1
        L4b:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$a r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.C0395a.f51607a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L74
            java.lang.Object r7 = r7.f51596l
            boolean r8 = r7 instanceof rqd.c
            if (r8 == 0) goto L5c
            rqd.c r7 = (rqd.c) r7
            goto L5d
        L5c:
            r7 = 0
        L5d:
            if (r7 != 0) goto L60
            goto Lc1
        L60:
            java.lang.String r7 = r7.a()
            r0.f256524w = r3
            wzi.a r8 = r6.f256526a
            etj.o r8 = (etj.o) r8
            java.lang.Object r7 = r8.g(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            j49.a r7 = j49.a.f171320a
            return r7
        L74:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r0 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            if (r0 != 0) goto L8b
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r0 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            if (r8 == 0) goto L85
            goto L8b
        L85:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L8b:
            java.lang.Object r7 = r7.f51596l
            boolean r8 = r7 instanceof rqd.a
            if (r8 == 0) goto La0
            j49.b r8 = new j49.b
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterDetails$Destination r0 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterDetails$Destination
            rqd.a r7 = (rqd.a) r7
            java.lang.String r7 = r7.f256521b
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        La0:
            boolean r8 = r7 instanceof rqd.b
            if (r8 == 0) goto Lc1
            j49.b r8 = new j49.b
            com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig$Details r0 = new com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig$Details
            k71.c r1 = new k71.c
            rqd.b r7 = (rqd.b) r7
            java.lang.String r7 = r7.f256523b
            r1.<init>(r7)
            r4 = 0
            r5 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.c(r0)
            r8.<init>(r7)
            return r8
        Lc1:
            j49.c r7 = j49.c.f171322a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rqd.g.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
