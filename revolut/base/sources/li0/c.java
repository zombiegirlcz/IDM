package li0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    public static b a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            TapAndPayClient client = TapAndPay.getClient((Activity) context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Intrinsics.checkNotNullParameter(client, "<this>");
            return new b(client);
        }
        TapAndPayClient client2 = TapAndPay.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client2, "getClient(...)");
        Intrinsics.checkNotNullParameter(client2, "<this>");
        return new b(client2);
    }
}
