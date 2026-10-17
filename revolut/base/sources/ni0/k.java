package ni0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gi0.b {
    public final j a(Context context, c walletOptions) {
        Wallet.WalletOptions walletOptions2 = walletOptions.f215613a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(walletOptions, "walletOptions");
        if (context instanceof Activity) {
            Intrinsics.checkNotNullParameter(walletOptions, "<this>");
            PaymentsClient paymentsClient = Wallet.getPaymentsClient((Activity) context, walletOptions2);
            Intrinsics.checkNotNullExpressionValue(paymentsClient, "getPaymentsClient(...)");
            Intrinsics.checkNotNullParameter(paymentsClient, "<this>");
            return new j(paymentsClient);
        }
        Intrinsics.checkNotNullParameter(walletOptions, "<this>");
        PaymentsClient paymentsClient2 = Wallet.getPaymentsClient(context, walletOptions2);
        Intrinsics.checkNotNullExpressionValue(paymentsClient2, "getPaymentsClient(...)");
        Intrinsics.checkNotNullParameter(paymentsClient2, "<this>");
        return new j(paymentsClient2);
    }
}
