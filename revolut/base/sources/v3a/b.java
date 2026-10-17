package v3a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import k71.i;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements b3a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9e.c f285863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8k.c f285864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz9.a f285865c;

    public b(c9e.c subscriptionNavigationProvider, p7k.b paymentLinkNavigationProvider, y8k.c peerToPeerTransferDescriptorNavigation, kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentLinkNavigationProvider, "paymentLinkNavigationProvider");
        Intrinsics.checkNotNullParameter(peerToPeerTransferDescriptorNavigation, "peerToPeerTransferDescriptorNavigation");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f285863a = subscriptionNavigationProvider;
        this.f285864b = peerToPeerTransferDescriptorNavigation;
        this.f285865c = chatNavigationProvider;
    }

    public final CompositeCommand b(ChatTransferRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        return new CompositeCommand(b3a.a.a(this), gc0.c.f(((uz9.a) this.f285865c).a(recipient, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(qua.p r7, com.revolut.core.model.account.AccountId r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof v3a.a
            if (r0 == 0) goto L13
            r0 = r9
            v3a.a r0 = (v3a.a) r0
            int r1 = r0.f285862y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285862y = r1
            goto L18
        L13:
            v3a.a r0 = new v3a.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f285860w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f285862y
            c9e.c r3 = r6.f285863a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r5) goto L2e
            com.revolut.retail.core.navigation.NaviCommand r7 = r0.v
            yhm.o.b(r9)
            goto L68
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            qua.p r7 = r0.u
            yhm.o.b(r9)
            goto L52
        L3c:
            yhm.o.b(r9)
            r9 = 1
            r2 = r3
            rae.c r2 = (rae.c) r2
            ufm.b r8 = r2.d(r8, r9)
            r0.u = r7
            r0.f285862y = r4
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L52
            goto L66
        L52:
            r8 = r9
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            efm.d0 r7 = c9e.c.a(r3, r7)
            r9 = 0
            r0.u = r9
            r0.v = r8
            r0.f285862y = r5
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L67
        L66:
            return r1
        L67:
            r7 = r8
        L68:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.retail.core.navigation.CompositeCommand r7 = com.revolut.retail.core.navigation.a.c(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v3a.b.c(qua.p, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    public final CompositeCommand d(ScheduledPaymentsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return com.revolut.retail.core.navigation.a.c(b3a.a.a(this), u0.f(new ScheduledPaymentsDestination(inputData, 2)));
    }

    public final CompositeCommand e(i data, ChatTransferRecipient chatTransferRecipient) {
        Intrinsics.checkNotNullParameter(data, "data");
        return com.revolut.retail.core.navigation.a.c(chatTransferRecipient != null ? b(chatTransferRecipient) : b3a.a.a(this), new FeatureCommand(new TransactionsFeatureConfig.Details(data, null, null, null, 122)));
    }
}
