package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 extends yji.n implements elf.s0 {

    @NotNull
    public static final l2 Companion = new l2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.y0 f237099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q2 f237101n;
    public final se5.a o;

    public n2(klf.y0 cryptoRemittancesDataSource, vlf.b commonUiMapper, q2 trackingItemsMapper, se5.a cryptoFaqKeysProvider) {
        Intrinsics.checkNotNullParameter(cryptoRemittancesDataSource, "cryptoRemittancesDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(trackingItemsMapper, "trackingItemsMapper");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        this.f237099l = cryptoRemittancesDataSource;
        this.f237100m = commonUiMapper;
        this.f237101n = trackingItemsMapper;
        this.o = cryptoFaqKeysProvider;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r2, java.lang.String r3, kotlin.coroutines.Continuation r4) {
        /*
            r1 = this;
            int r2 = r3.hashCode()
            r4 = 0
            switch(r2) {
                case -1579696752: goto L38;
                case -113408860: goto L27;
                case 676354432: goto L1e;
                case 1213581090: goto L12;
                case 1718175551: goto L9;
                default: goto L8;
            }
        L8:
            goto L40
        L9:
            java.lang.String r2 = "WITHDRAW_TRANSFER_REJECTED_LEARN_MORE_CLICK_ID"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L42
            goto L40
        L12:
            java.lang.String r2 = "WITHDRAW_GAMBLING_RESTRICTED_LEARN_MORE_CLICK_ID"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            goto L40
        L1b:
            java.lang.String r2 = "question.crypto-withdrawal-gambling-block"
            goto L44
        L1e:
            java.lang.String r2 = "WITHDRAW_ADDRESS_REJECTED_LEARN_MORE_CLICK_ID"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L42
            goto L40
        L27:
            java.lang.String r2 = "WITHDRAW_REVOLUT_PENDING_LEARN_MORE_CLICK_ID"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L30
            goto L40
        L30:
            se5.a r2 = r1.o
            r2.getClass()
            java.lang.String r2 = "question.why-is-my-crypto-send-pending"
            goto L44
        L38:
            java.lang.String r2 = "WITHDRAW_REVOLUT_CANCELED_LEARN_MORE_CLICK_ID"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L42
        L40:
            r2 = r4
            goto L44
        L42:
            java.lang.String r2 = "question.why-sending-crypto-might-fail"
        L44:
            if (r2 == 0) goto L5a
            com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.faq.api.navigation.FaqFeatureConfig$Starter r4 = new com.revolut.feature.faq.api.navigation.FaqFeatureConfig$Starter
            r0 = 2
            r4.<init>(r2, r0)
            r3.<init>(r4)
            com.revolut.kompot.bridge.navigation.BridgeDestination r2 = zh9.u0.b(r3)
            r1.A2(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        L5a:
            boolean r2 = pd.b.j(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.n2.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
